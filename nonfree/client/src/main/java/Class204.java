import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class204 {

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "Lclient!al;")
	private Class10 aClass10_4 = null;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!al;")
	private Class10 aClass10_5 = null;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
	private int anInt6366 = 65000;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	private final int anInt6358;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILclient!al;Lclient!al;I)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int arg3) {
		this.aClass10_4 = arg1;
		this.anInt6358 = arg0;
		this.aClass10_5 = arg2;
		this.anInt6366 = arg3;
	}

	@OriginalMember(owner = "client!uj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6358;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BBIZ)Z")
	private boolean method5354(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class10 local8 = this.aClass10_4;
		synchronized (this.aClass10_4) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass10_5.method172()) {
						return false;
					}
					this.aClass10_5.method184((long) (arg0 * 6));
					this.aClass10_5.method178(0, Static13.aByteArray3, 6);
					local22 = ((Static13.aByteArray3[4] & 0xFF) << 8) + ((Static13.aByteArray3[3] & 0xFF) << 16) + (Static13.aByteArray3[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass10_4.method172() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass10_4.method172() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static13.aByteArray3[1] = (byte) (arg2 >> 8);
				Static13.aByteArray3[5] = (byte) local22;
				Static13.aByteArray3[2] = (byte) arg2;
				Static13.aByteArray3[4] = (byte) (local22 >> 8);
				Static13.aByteArray3[0] = (byte) (arg2 >> 16);
				Static13.aByteArray3[3] = (byte) (local22 >> 16);
				this.aClass10_5.method184((long) (arg0 * 6));
				this.aClass10_5.method174(0, 6, Static13.aByteArray3);
				@Pc(171) int local171 = 0;
				@Pc(173) int local173 = 0;
				while (arg2 > local171) {
					@Pc(177) int local177 = 0;
					@Pc(212) int local212;
					if (arg3) {
						this.aClass10_4.method184((long) (local22 * 520));
						try {
							this.aClass10_4.method178(0, Static13.aByteArray3, 8);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local212 = (Static13.aByteArray3[1] & 0xFF) + ((Static13.aByteArray3[0] & 0xFF) << 8);
						@Pc(226) int local226 = (Static13.aByteArray3[3] & 0xFF) + ((Static13.aByteArray3[2] & 0xFF) << 8);
						local177 = ((Static13.aByteArray3[5] & 0xFF) << 8) + ((Static13.aByteArray3[4] & 0xFF) << 16) + (Static13.aByteArray3[6] & 0xFF);
						@Pc(254) int local254 = Static13.aByteArray3[7] & 0xFF;
						if (local212 != arg0 || local173 != local226 || this.anInt6358 != local254) {
							return false;
						}
						if (local177 < 0 || this.aClass10_4.method172() / 520L < (long) local177) {
							return false;
						}
					}
					if (local177 == 0) {
						arg3 = false;
						local177 = (int) ((this.aClass10_4.method172() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local22 == local177) {
							local177++;
						}
					}
					Static13.aByteArray3[3] = (byte) local173;
					Static13.aByteArray3[2] = (byte) (local173 >> 8);
					Static13.aByteArray3[0] = (byte) (arg0 >> 8);
					Static13.aByteArray3[1] = (byte) arg0;
					if (arg2 - local171 <= 512) {
						local177 = 0;
					}
					Static13.aByteArray3[7] = (byte) this.anInt6358;
					Static13.aByteArray3[5] = (byte) (local177 >> 8);
					Static13.aByteArray3[6] = (byte) local177;
					Static13.aByteArray3[4] = (byte) (local177 >> 16);
					this.aClass10_4.method184((long) (local22 * 520));
					this.aClass10_4.method174(0, 8, Static13.aByteArray3);
					local212 = arg2 - local171;
					if (local212 > 512) {
						local212 = 512;
					}
					this.aClass10_4.method174(local171, local212, arg1);
					local171 += local212;
					local173++;
					local22 = local177;
				}
				return true;
			} catch (@Pc(426) IOException local426) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[B")
	public byte[] method5355(@OriginalArg(0) int arg0) {
		@Pc(8) Class10 local8 = this.aClass10_4;
		synchronized (this.aClass10_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass10_5.method172()) {
					return null;
				}
				this.aClass10_5.method184((long) (arg0 * 6));
				this.aClass10_5.method178(0, Static13.aByteArray3, 6);
				@Pc(66) int local66 = (Static13.aByteArray3[2] & 0xFF) + (((Static13.aByteArray3[0] & 0xFF) << 16) + ((Static13.aByteArray3[1] & 0xFF) << 8));
				@Pc(88) int local88 = ((Static13.aByteArray3[4] & 0xFF) << 8) + (Static13.aByteArray3[3] << 16 & 0xFF0000) + (Static13.aByteArray3[5] & 0xFF);
				if (local66 < 0 || local66 > this.anInt6366) {
					return null;
				} else if (local88 > 0 && this.aClass10_4.method172() / 520L >= (long) local88) {
					@Pc(121) byte[] local121 = new byte[local66];
					@Pc(123) int local123 = 0;
					@Pc(133) int local133 = 0;
					label55: while (local66 > local123) {
						if (local88 == 0) {
							return null;
						}
						this.aClass10_4.method184((long) (local88 * 520));
						@Pc(156) int local156 = local66 - local123;
						if (local156 > 512) {
							local156 = 512;
						}
						this.aClass10_4.method178(0, Static13.aByteArray3, local156 + 8);
						@Pc(184) int local184 = (Static13.aByteArray3[1] & 0xFF) + ((Static13.aByteArray3[0] & 0xFF) << 8);
						@Pc(199) int local199 = ((Static13.aByteArray3[2] & 0xFF) << 8) + (Static13.aByteArray3[3] & 0xFF);
						@Pc(222) int local222 = (Static13.aByteArray3[6] & 0xFF) + (((Static13.aByteArray3[4] & 0xFF) << 16) + ((Static13.aByteArray3[5] & 0xFF) << 8));
						@Pc(228) int local228 = Static13.aByteArray3[7] & 0xFF;
						if (local184 == arg0 && local199 == local133 && local228 == this.anInt6358) {
							if (local222 >= 0 && (long) local222 <= this.aClass10_4.method172() / 520L) {
								local88 = local222;
								local133++;
								@Pc(279) int local279 = 0;
								while (true) {
									if (local156 <= local279) {
										continue label55;
									}
									local121[local123++] = Static13.aByteArray3[local279 + 8];
									local279++;
								}
							}
							return null;
						}
						return null;
					}
					return local121;
				} else {
					return null;
				}
			} catch (@Pc(308) IOException local308) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BII)Z")
	public boolean method5356(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class10 local14 = this.aClass10_4;
		synchronized (this.aClass10_4) {
			if (arg2 < 0 || this.anInt6366 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method5354(arg0, arg1, arg2, true);
			if (!local37) {
				local37 = this.method5354(arg0, arg1, arg2, false);
			}
			return local37;
		}
	}
}
