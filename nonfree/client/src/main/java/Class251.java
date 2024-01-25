import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class251 {

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "Lclient!gd;")
	private Class130 aClass130_5 = null;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "Lclient!gd;")
	private Class130 aClass130_6 = null;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	private int anInt6882 = 65000;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
	private final int anInt6883;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(ILclient!gd;Lclient!gd;I)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) Class130 arg2, @OriginalArg(3) int arg3) {
		this.aClass130_6 = arg1;
		this.anInt6883 = arg0;
		this.aClass130_5 = arg2;
		this.anInt6882 = arg3;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "([BIII)Z")
	public boolean method6102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class130 local6 = this.aClass130_6;
		synchronized (this.aClass130_6) {
			if (arg1 < 0 || this.anInt6882 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method6103(true, arg0, arg1, arg2);
			if (!local30) {
				local30 = this.method6103(false, arg0, arg1, arg2);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6883;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z[BIZI)Z")
	private boolean method6103(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class130 local8 = this.aClass130_6;
		synchronized (this.aClass130_6) {
			try {
				@Pc(75) int local75;
				if (arg0) {
					if (this.aClass130_5.method3463() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass130_5.method3465((long) (arg3 * 6));
					this.aClass130_5.method3461(6, Static239.aByteArray35, 0);
					local75 = ((Static239.aByteArray35[3] & 0xFF) << 16) + ((Static239.aByteArray35[4] & 0xFF) << 8) + (Static239.aByteArray35[5] & 0xFF);
					if (local75 <= 0 || (long) local75 > this.aClass130_6.method3463() / 520L) {
						return false;
					}
				} else {
					local75 = (int) ((this.aClass130_6.method3463() + 519L) / 520L);
					if (local75 == 0) {
						local75 = 1;
					}
				}
				Static239.aByteArray35[5] = (byte) local75;
				Static239.aByteArray35[3] = (byte) (local75 >> 16);
				Static239.aByteArray35[4] = (byte) (local75 >> 8);
				Static239.aByteArray35[2] = (byte) arg2;
				Static239.aByteArray35[0] = (byte) (arg2 >> 16);
				Static239.aByteArray35[1] = (byte) (arg2 >> 8);
				this.aClass130_5.method3465((long) (arg3 * 6));
				this.aClass130_5.method3456(Static239.aByteArray35, 0, 6);
				@Pc(167) int local167 = 0;
				@Pc(169) int local169 = 0;
				while (true) {
					if (local167 < arg2) {
						label102: {
							@Pc(175) int local175 = 0;
							@Pc(212) int local212;
							if (arg0) {
								this.aClass130_6.method3465((long) (local75 * 520));
								try {
									this.aClass130_6.method3461(8, Static239.aByteArray35, 0);
								} catch (@Pc(195) EOFException local195) {
									break label102;
								}
								local212 = ((Static239.aByteArray35[0] & 0xFF) << 8) + (Static239.aByteArray35[1] & 0xFF);
								@Pc(226) int local226 = ((Static239.aByteArray35[2] & 0xFF) << 8) + (Static239.aByteArray35[3] & 0xFF);
								local175 = ((Static239.aByteArray35[5] & 0xFF) << 8) + ((Static239.aByteArray35[4] & 0xFF) << 16) + (Static239.aByteArray35[6] & 0xFF);
								@Pc(254) int local254 = Static239.aByteArray35[7] & 0xFF;
								if (local212 != arg3 || local226 != local169 || this.anInt6883 != local254) {
									return false;
								}
								if (local175 < 0 || (long) local175 > this.aClass130_6.method3463() / 520L) {
									return false;
								}
							}
							if (local175 == 0) {
								arg0 = false;
								local175 = (int) ((this.aClass130_6.method3463() + 519L) / 520L);
								if (local175 == 0) {
									local175++;
								}
								if (local75 == local175) {
									local175++;
								}
							}
							Static239.aByteArray35[1] = (byte) arg3;
							Static239.aByteArray35[0] = (byte) (arg3 >> 8);
							if (arg2 - local167 <= 512) {
								local175 = 0;
							}
							Static239.aByteArray35[2] = (byte) (local169 >> 8);
							Static239.aByteArray35[3] = (byte) local169;
							Static239.aByteArray35[6] = (byte) local175;
							Static239.aByteArray35[7] = (byte) this.anInt6883;
							Static239.aByteArray35[5] = (byte) (local175 >> 8);
							Static239.aByteArray35[4] = (byte) (local175 >> 16);
							this.aClass130_6.method3465((long) (local75 * 520));
							this.aClass130_6.method3456(Static239.aByteArray35, 0, 8);
							local212 = arg2 - local167;
							if (local212 > 512) {
								local212 = 512;
							}
							this.aClass130_6.method3456(arg1, local167, local212);
							local167 += local212;
							local169++;
							local75 = local175;
							continue;
						}
					}
					@Pc(430) boolean local430 = true;
					return true;
				}
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)[B")
	public byte[] method6104(@OriginalArg(1) int arg0) {
		@Pc(8) Class130 local8 = this.aClass130_6;
		synchronized (this.aClass130_6) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass130_5.method3463()) {
					return null;
				}
				this.aClass130_5.method3465((long) (arg0 * 6));
				this.aClass130_5.method3461(6, Static239.aByteArray35, 0);
				@Pc(67) int local67 = (Static239.aByteArray35[2] & 0xFF) + ((Static239.aByteArray35[1] & 0xFF) << 8) + ((Static239.aByteArray35[0] & 0xFF) << 16);
				@Pc(90) int local90 = ((Static239.aByteArray35[4] & 0xFF) << 8) + ((Static239.aByteArray35[3] & 0xFF) << 16) + (Static239.aByteArray35[5] & 0xFF);
				if (local67 < 0 || this.anInt6882 < local67) {
					return null;
				} else if (local90 > 0 && this.aClass130_6.method3463() / 520L >= (long) local90) {
					@Pc(134) byte[] local134 = new byte[local67];
					@Pc(136) int local136 = 0;
					@Pc(147) int local147 = 0;
					label55: while (local67 > local136) {
						if (local90 == 0) {
							return null;
						}
						this.aClass130_6.method3465((long) (local90 * 520));
						@Pc(177) int local177 = local67 - local136;
						if (local177 > 512) {
							local177 = 512;
						}
						this.aClass130_6.method3461(local177 + 8, Static239.aByteArray35, 0);
						@Pc(205) int local205 = (Static239.aByteArray35[1] & 0xFF) + ((Static239.aByteArray35[0] & 0xFF) << 8);
						@Pc(219) int local219 = (Static239.aByteArray35[3] & 0xFF) + ((Static239.aByteArray35[2] & 0xFF) << 8);
						@Pc(241) int local241 = (Static239.aByteArray35[6] & 0xFF) + ((Static239.aByteArray35[5] & 0xFF) << 8) + ((Static239.aByteArray35[4] & 0xFF) << 16);
						@Pc(247) int local247 = Static239.aByteArray35[7] & 0xFF;
						if (arg0 == local205 && local219 == local147 && local247 == this.anInt6883) {
							if (local241 >= 0 && (long) local241 <= this.aClass130_6.method3463() / 520L) {
								local90 = local241;
								local147++;
								@Pc(309) int local309 = 0;
								while (true) {
									if (local177 <= local309) {
										continue label55;
									}
									local134[local136++] = Static239.aByteArray35[local309 + 8];
									local309++;
								}
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(340) IOException local340) {
				return null;
			}
		}
	}
}
