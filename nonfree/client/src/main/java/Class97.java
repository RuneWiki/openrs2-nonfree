import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class97 {

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!ln;")
	private Class204 aClass204_2 = null;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!ln;")
	private Class204 aClass204_1 = null;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	private int anInt3073 = 65000;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	private final int anInt3071;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(ILclient!ln;Lclient!ln;I)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) int arg3) {
		this.aClass204_2 = arg1;
		this.anInt3073 = arg3;
		this.aClass204_1 = arg2;
		this.anInt3071 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI[BII)Z")
	private boolean method2751(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class204 local8 = this.aClass204_2;
		synchronized (this.aClass204_2) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass204_1.method4815()) {
						return false;
					}
					this.aClass204_1.method4814((long) (arg3 * 6));
					this.aClass204_1.method4811(Static40.aByteArray41, 6, 0);
					local22 = (Static40.aByteArray41[5] & 0xFF) + (((Static40.aByteArray41[3] & 0xFF) << 16) + ((Static40.aByteArray41[4] & 0xFF) << 8));
					if (local22 <= 0 || (long) local22 > this.aClass204_2.method4815() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass204_2.method4815() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static40.aByteArray41[5] = (byte) local22;
				Static40.aByteArray41[2] = (byte) arg2;
				Static40.aByteArray41[4] = (byte) (local22 >> 8);
				Static40.aByteArray41[3] = (byte) (local22 >> 16);
				Static40.aByteArray41[1] = (byte) (arg2 >> 8);
				Static40.aByteArray41[0] = (byte) (arg2 >> 16);
				this.aClass204_1.method4814((long) (arg3 * 6));
				this.aClass204_1.method4813(Static40.aByteArray41, 0, 6);
				@Pc(167) int local167 = 0;
				@Pc(169) int local169 = 0;
				while (arg2 > local167) {
					@Pc(173) int local173 = 0;
					@Pc(210) int local210;
					if (arg0) {
						this.aClass204_2.method4814((long) (local22 * 520));
						try {
							this.aClass204_2.method4811(Static40.aByteArray41, 8, 0);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = ((Static40.aByteArray41[0] & 0xFF) << 8) + (Static40.aByteArray41[1] & 0xFF);
						@Pc(224) int local224 = (Static40.aByteArray41[3] & 0xFF) + ((Static40.aByteArray41[2] & 0xFF) << 8);
						local173 = ((Static40.aByteArray41[4] & 0xFF) << 16) + ((Static40.aByteArray41[5] & 0xFF) << 8) + (Static40.aByteArray41[6] & 0xFF);
						@Pc(252) int local252 = Static40.aByteArray41[7] & 0xFF;
						if (local210 != arg3 || local169 != local224 || local252 != this.anInt3071) {
							return false;
						}
						if (local173 < 0 || this.aClass204_2.method4815() / 520L < (long) local173) {
							return false;
						}
					}
					if (local173 == 0) {
						arg0 = false;
						local173 = (int) ((this.aClass204_2.method4815() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local22) {
							local173++;
						}
					}
					Static40.aByteArray41[2] = (byte) (local169 >> 8);
					Static40.aByteArray41[3] = (byte) local169;
					if (arg2 - local167 <= 512) {
						local173 = 0;
					}
					Static40.aByteArray41[1] = (byte) arg3;
					Static40.aByteArray41[0] = (byte) (arg3 >> 8);
					Static40.aByteArray41[4] = (byte) (local173 >> 16);
					Static40.aByteArray41[6] = (byte) local173;
					Static40.aByteArray41[7] = (byte) this.anInt3071;
					Static40.aByteArray41[5] = (byte) (local173 >> 8);
					this.aClass204_2.method4814((long) (local22 * 520));
					this.aClass204_2.method4813(Static40.aByteArray41, 0, 8);
					local210 = arg2 - local167;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass204_2.method4813(arg1, local167, local210);
					local22 = local173;
					local167 += local210;
					local169++;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[B")
	public byte[] method2752(@OriginalArg(0) int arg0) {
		@Pc(8) Class204 local8 = this.aClass204_2;
		synchronized (this.aClass204_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass204_1.method4815()) {
					return null;
				}
				this.aClass204_1.method4814((long) (arg0 * 6));
				this.aClass204_1.method4811(Static40.aByteArray41, 6, 0);
				@Pc(65) int local65 = (Static40.aByteArray41[2] & 0xFF) + ((Static40.aByteArray41[1] & 0xFF) << 8) + ((Static40.aByteArray41[0] & 0xFF) << 16);
				@Pc(87) int local87 = (Static40.aByteArray41[5] & 0xFF) + ((Static40.aByteArray41[4] & 0xFF) << 8) + ((Static40.aByteArray41[3] & 0xFF) << 16);
				if (local65 < 0 || this.anInt3073 < local65) {
					return null;
				} else if (local87 > 0 && this.aClass204_2.method4815() / 520L >= (long) local87) {
					@Pc(126) byte[] local126 = new byte[local65];
					@Pc(128) int local128 = 0;
					@Pc(130) int local130 = 0;
					label55: while (local128 < local65) {
						if (local87 == 0) {
							return null;
						}
						this.aClass204_2.method4814((long) (local87 * 520));
						@Pc(163) int local163 = local65 - local128;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass204_2.method4811(Static40.aByteArray41, local163 + 8, 0);
						@Pc(192) int local192 = ((Static40.aByteArray41[0] & 0xFF) << 8) + (Static40.aByteArray41[1] & 0xFF);
						@Pc(206) int local206 = (Static40.aByteArray41[3] & 0xFF) + ((Static40.aByteArray41[2] & 0xFF) << 8);
						@Pc(228) int local228 = (Static40.aByteArray41[6] & 0xFF) + ((Static40.aByteArray41[5] & 0xFF) << 8) + ((Static40.aByteArray41[4] & 0xFF) << 16);
						@Pc(234) int local234 = Static40.aByteArray41[7] & 0xFF;
						if (arg0 == local192 && local130 == local206 && local234 == this.anInt3071) {
							if (local228 >= 0 && (long) local228 <= this.aClass204_2.method4815() / 520L) {
								local87 = local228;
								local130++;
								@Pc(285) int local285 = 0;
								while (true) {
									if (local163 <= local285) {
										continue label55;
									}
									local126[local128++] = Static40.aByteArray41[local285 + 8];
									local285++;
								}
							}
							return null;
						}
						return null;
					}
					return local126;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([BIII)Z")
	public boolean method2754(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class204 local6 = this.aClass204_2;
		synchronized (this.aClass204_2) {
			if (arg1 < 0 || this.anInt3073 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method2751(true, arg0, arg1, arg2);
			if (!local38) {
				local38 = this.method2751(false, arg0, arg1, arg2);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3071;
	}
}
