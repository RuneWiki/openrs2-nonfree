import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class169 {

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "Lclient!oo;")
	private Class149 aClass149_4 = null;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
	private int anInt5361 = 65000;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "Lclient!oo;")
	private Class149 aClass149_5 = null;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	private final int anInt5354;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(ILclient!oo;Lclient!oo;I)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) int arg3) {
		this.anInt5354 = arg0;
		this.aClass149_4 = arg1;
		this.anInt5361 = arg3;
		this.aClass149_5 = arg2;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIB[B)Z")
	private boolean method4429(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class149 local8 = this.aClass149_4;
		synchronized (this.aClass149_4) {
			try {
				@Pc(69) int local69;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass149_5.method3957()) {
						return false;
					}
					this.aClass149_5.method3960((long) (arg0 * 6));
					this.aClass149_5.method3955(6, 0, Static14.aByteArray7);
					local69 = ((Static14.aByteArray7[3] & 0xFF) << 16) + (Static14.aByteArray7[4] << 8 & 0xFF00) + (Static14.aByteArray7[5] & 0xFF);
					if (local69 <= 0 || this.aClass149_4.method3957() / 520L < (long) local69) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass149_4.method3957() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static14.aByteArray7[4] = (byte) (local69 >> 8);
				Static14.aByteArray7[0] = (byte) (arg2 >> 16);
				Static14.aByteArray7[1] = (byte) (arg2 >> 8);
				Static14.aByteArray7[2] = (byte) arg2;
				Static14.aByteArray7[5] = (byte) local69;
				Static14.aByteArray7[3] = (byte) (local69 >> 16);
				this.aClass149_5.method3960((long) (arg0 * 6));
				this.aClass149_5.method3956(6, Static14.aByteArray7, 0);
				@Pc(169) int local169 = 0;
				@Pc(171) int local171 = 0;
				while (arg2 > local169) {
					@Pc(175) int local175 = 0;
					@Pc(210) int local210;
					if (arg1) {
						this.aClass149_4.method3960((long) (local69 * 520));
						try {
							this.aClass149_4.method3955(8, 0, Static14.aByteArray7);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = (Static14.aByteArray7[1] & 0xFF) + ((Static14.aByteArray7[0] & 0xFF) << 8);
						@Pc(224) int local224 = (Static14.aByteArray7[3] & 0xFF) + ((Static14.aByteArray7[2] & 0xFF) << 8);
						local175 = ((Static14.aByteArray7[4] & 0xFF) << 16) - (-((Static14.aByteArray7[5] & 0xFF) << 8) - (Static14.aByteArray7[6] & 0xFF));
						@Pc(254) int local254 = Static14.aByteArray7[7] & 0xFF;
						if (arg0 != local210 || local171 != local224 || this.anInt5354 != local254) {
							return false;
						}
						if (local175 < 0 || this.aClass149_4.method3957() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg1 = false;
						local175 = (int) ((this.aClass149_4.method3957() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local69) {
							local175++;
						}
					}
					Static14.aByteArray7[2] = (byte) (local171 >> 8);
					Static14.aByteArray7[0] = (byte) (arg0 >> 8);
					Static14.aByteArray7[3] = (byte) local171;
					Static14.aByteArray7[1] = (byte) arg0;
					if (arg2 - local169 <= 512) {
						local175 = 0;
					}
					Static14.aByteArray7[7] = (byte) this.anInt5354;
					Static14.aByteArray7[5] = (byte) (local175 >> 8);
					Static14.aByteArray7[4] = (byte) (local175 >> 16);
					Static14.aByteArray7[6] = (byte) local175;
					this.aClass149_4.method3960((long) (local69 * 520));
					this.aClass149_4.method3956(8, Static14.aByteArray7, 0);
					local210 = arg2 - local169;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass149_4.method3956(local210, arg3, local169);
					local171++;
					local69 = local175;
					local169 += local210;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5354;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[B")
	public byte[] method4434(@OriginalArg(1) int arg0) {
		@Pc(8) Class149 local8 = this.aClass149_4;
		synchronized (this.aClass149_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass149_5.method3957()) {
					return null;
				}
				this.aClass149_5.method3960((long) (arg0 * 6));
				this.aClass149_5.method3955(6, 0, Static14.aByteArray7);
				@Pc(71) int local71 = (Static14.aByteArray7[2] & 0xFF) + ((Static14.aByteArray7[1] & 0xFF) << 8) + ((Static14.aByteArray7[0] & 0xFF) << 16);
				@Pc(93) int local93 = (Static14.aByteArray7[5] & 0xFF) + ((Static14.aByteArray7[3] & 0xFF) << 16) + ((Static14.aByteArray7[4] & 0xFF) << 8);
				if (local71 < 0 || this.anInt5361 < local71) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass149_4.method3957() / 520L) {
					@Pc(136) byte[] local136 = new byte[local71];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					label55: while (local71 > local138) {
						if (local93 == 0) {
							return null;
						}
						this.aClass149_4.method3960((long) (local93 * 520));
						@Pc(166) int local166 = local71 - local138;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass149_4.method3955(local166 + 8, 0, Static14.aByteArray7);
						@Pc(197) int local197 = ((Static14.aByteArray7[0] & 0xFF) << 8) + (Static14.aByteArray7[1] & 0xFF);
						@Pc(211) int local211 = (Static14.aByteArray7[3] & 0xFF) + ((Static14.aByteArray7[2] & 0xFF) << 8);
						@Pc(233) int local233 = (Static14.aByteArray7[6] & 0xFF) + ((Static14.aByteArray7[4] & 0xFF) << 16) + ((Static14.aByteArray7[5] & 0xFF) << 8);
						@Pc(239) int local239 = Static14.aByteArray7[7] & 0xFF;
						if (local197 == arg0 && local140 == local211 && this.anInt5354 == local239) {
							if (local233 >= 0 && this.aClass149_4.method3957() / 520L >= (long) local233) {
								local140++;
								local93 = local233;
								@Pc(289) int local289 = 0;
								while (true) {
									if (local166 <= local289) {
										continue label55;
									}
									local136[local138++] = Static14.aByteArray7[local289 + 8];
									local289++;
								}
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(318) IOException local318) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([BIII)Z")
	public boolean method4435(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class149 local6 = this.aClass149_4;
		synchronized (this.aClass149_4) {
			if (arg2 < 0 || arg2 > this.anInt5361) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method4429(arg1, true, arg2, arg0);
			if (!local34) {
				local34 = this.method4429(arg1, false, arg2, arg0);
			}
			return local34;
		}
	}
}
