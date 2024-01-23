import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class159 {

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "Lclient!gn;")
	private Class66 aClass66_7 = null;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	private int anInt5239 = 65000;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!gn;")
	private Class66 aClass66_6 = null;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	private int anInt5246;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ILclient!gn;Lclient!gn;I)V")
	public Class159(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3) {
		this.aClass66_7 = arg2;
		this.anInt5239 = arg3;
		this.anInt5246 = arg0;
		this.aClass66_6 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B[BII)Z")
	public boolean method4023(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class66 local7 = this.aClass66_6;
		synchronized (this.aClass66_6) {
			if (arg1 < 0 || this.anInt5239 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method4027(arg1, true, arg2, arg0);
			if (!local30) {
				local30 = this.method4027(arg1, false, arg2, arg0);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)[B")
	public byte[] method4024(@OriginalArg(1) int arg0) {
		@Pc(9) Class66 local9 = this.aClass66_6;
		synchronized (this.aClass66_6) {
			try {
				@Pc(23) Object local23;
				if (this.aClass66_7.method1540() < (long) (arg0 * 6 + 6)) {
					local23 = null;
					return (byte[]) local23;
				}
				this.aClass66_7.method1538((long) (arg0 * 6));
				this.aClass66_7.method1535(Static79.aByteArray62, 6, 0);
				@Pc(64) int local64 = ((Static79.aByteArray62[4] & 0xFF) << 8) + ((Static79.aByteArray62[3] & 0xFF) << 16) + (Static79.aByteArray62[5] & 0xFF);
				@Pc(86) int local86 = (Static79.aByteArray62[2] & 0xFF) + ((Static79.aByteArray62[0] & 0xFF) << 16) + ((Static79.aByteArray62[1] & 0xFF) << 8);
				if (local86 < 0 || local86 > this.anInt5239) {
					local23 = null;
					return (byte[]) local23;
				} else if (local64 <= 0 || this.aClass66_6.method1540() / 520L < (long) local64) {
					local23 = null;
					return (byte[]) local23;
				} else {
					@Pc(119) byte[] local119 = new byte[local86];
					@Pc(132) int local132 = 0;
					@Pc(134) int local134 = 0;
					while (local132 < local86) {
						if (local64 == 0) {
							local23 = null;
							return (byte[]) local23;
						}
						@Pc(148) int local148 = local86 - local132;
						if (local148 > 512) {
							local148 = 512;
						}
						this.aClass66_6.method1538((long) (local64 * 520));
						this.aClass66_6.method1535(Static79.aByteArray62, local148 + 8, 0);
						@Pc(186) int local186 = ((Static79.aByteArray62[2] & 0xFF) << 8) + (Static79.aByteArray62[3] & 0xFF);
						@Pc(192) int local192 = Static79.aByteArray62[7] & 0xFF;
						@Pc(214) int local214 = (Static79.aByteArray62[6] & 0xFF) + ((Static79.aByteArray62[4] & 0xFF) << 16) + ((Static79.aByteArray62[5] & 0xFF) << 8);
						@Pc(229) int local229 = ((Static79.aByteArray62[0] & 0xFF) << 8) + (Static79.aByteArray62[1] & 0xFF);
						if (local229 != arg0 || local186 != local134 || local192 != this.anInt5246) {
							local23 = null;
							return (byte[]) local23;
						}
						if (local214 < 0 || (long) local214 > this.aClass66_6.method1540() / 520L) {
							local23 = null;
							return (byte[]) local23;
						}
						local64 = local214;
						for (@Pc(276) int local276 = 0; local276 < local148; local276++) {
							local119[local132++] = Static79.aByteArray62[local276 + 8];
						}
						local134++;
					}
					@Pc(299) byte[] local299 = local119;
					return local299;
				}
			} catch (@Pc(303) IOException local303) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5246;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIZI[B)Z")
	private boolean method4027(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(9) Class66 local9 = this.aClass66_6;
		synchronized (this.aClass66_6) {
			try {
				@Pc(71) int local71;
				@Pc(29) boolean local29;
				if (arg1) {
					if (this.aClass66_7.method1540() < (long) (arg2 * 6 + 6)) {
						local29 = false;
						return local29;
					}
					this.aClass66_7.method1538((long) (arg2 * 6));
					this.aClass66_7.method1535(Static79.aByteArray62, 6, 0);
					local71 = (Static79.aByteArray62[5] & 0xFF) + ((Static79.aByteArray62[4] & 0xFF) << 8) + ((Static79.aByteArray62[3] & 0xFF) << 16);
					if (local71 <= 0 || this.aClass66_6.method1540() / 520L < (long) local71) {
						local29 = false;
						return local29;
					}
				} else {
					local71 = (int) ((this.aClass66_6.method1540() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static79.aByteArray62[0] = (byte) (arg0 >> 16);
				Static79.aByteArray62[4] = (byte) (local71 >> 8);
				Static79.aByteArray62[1] = (byte) (arg0 >> 8);
				Static79.aByteArray62[2] = (byte) arg0;
				Static79.aByteArray62[3] = (byte) (local71 >> 16);
				@Pc(145) int local145 = 0;
				@Pc(147) int local147 = 0;
				Static79.aByteArray62[5] = (byte) local71;
				this.aClass66_7.method1538((long) (arg2 * 6));
				this.aClass66_7.method1539(Static79.aByteArray62, 0, 6);
				while (true) {
					if (local145 < arg0) {
						label137: {
							@Pc(172) int local172 = 0;
							@Pc(209) int local209;
							if (arg1) {
								this.aClass66_6.method1538((long) (local71 * 520));
								try {
									this.aClass66_6.method1535(Static79.aByteArray62, 8, 0);
								} catch (@Pc(192) EOFException local192) {
									break label137;
								}
								local209 = ((Static79.aByteArray62[0] & 0xFF) << 8) + (Static79.aByteArray62[1] & 0xFF);
								local172 = (Static79.aByteArray62[6] & 0xFF) + ((Static79.aByteArray62[4] & 0xFF) << 16) + ((Static79.aByteArray62[5] & 0xFF) << 8);
								@Pc(246) int local246 = ((Static79.aByteArray62[2] & 0xFF) << 8) + (Static79.aByteArray62[3] & 0xFF);
								@Pc(252) int local252 = Static79.aByteArray62[7] & 0xFF;
								if (local209 != arg2 || local147 != local246 || this.anInt5246 != local252) {
									local29 = false;
									return local29;
								}
								if (local172 < 0 || (long) local172 > this.aClass66_6.method1540() / 520L) {
									local29 = false;
									return local29;
								}
							}
							if (local172 == 0) {
								local172 = (int) ((this.aClass66_6.method1540() + 519L) / 520L);
								arg1 = false;
								if (local172 == 0) {
									local172++;
								}
								if (local172 == local71) {
									local172++;
								}
							}
							Static79.aByteArray62[1] = (byte) arg2;
							Static79.aByteArray62[7] = (byte) this.anInt5246;
							if (arg0 - local145 <= 512) {
								local172 = 0;
							}
							Static79.aByteArray62[0] = (byte) (arg2 >> 8);
							Static79.aByteArray62[2] = (byte) (local147 >> 8);
							Static79.aByteArray62[4] = (byte) (local172 >> 16);
							Static79.aByteArray62[3] = (byte) local147;
							local147++;
							local209 = arg0 - local145;
							if (local209 > 512) {
								local209 = 512;
							}
							Static79.aByteArray62[5] = (byte) (local172 >> 8);
							Static79.aByteArray62[6] = (byte) local172;
							this.aClass66_6.method1538((long) (local71 * 520));
							this.aClass66_6.method1539(Static79.aByteArray62, 0, 8);
							local71 = local172;
							this.aClass66_6.method1539(arg3, local145, local209);
							local145 += local209;
							continue;
						}
					}
					local29 = true;
					return local29;
				}
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}
}
