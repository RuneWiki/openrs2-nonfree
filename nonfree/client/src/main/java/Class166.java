import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class166 {

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	private int anInt4987 = 65000;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!sj;")
	private Class190 aClass190_2 = null;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Lclient!sj;")
	private Class190 aClass190_3 = null;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	private final int anInt4988;

	static {
		new Class34("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(ILclient!sj;Lclient!sj;I)V")
	public Class166(@OriginalArg(0) int arg0, @OriginalArg(1) Class190 arg1, @OriginalArg(2) Class190 arg2, @OriginalArg(3) int arg3) {
		this.anInt4988 = arg0;
		this.aClass190_3 = arg1;
		this.aClass190_2 = arg2;
		this.anInt4987 = arg3;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II[BI)Z")
	public boolean method4384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class190 local6 = this.aClass190_3;
		synchronized (this.aClass190_3) {
			if (arg0 < 0 || arg0 > this.anInt4987) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method4387(arg1, true, arg2, arg0);
			if (!local36) {
				local36 = this.method4387(arg1, false, arg2, arg0);
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)[B")
	public byte[] method4385(@OriginalArg(1) int arg0) {
		@Pc(8) Class190 local8 = this.aClass190_3;
		synchronized (this.aClass190_3) {
			try {
				if (this.aClass190_2.method4932() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass190_2.method4929((long) (arg0 * 6));
				this.aClass190_2.method4925(Static226.aByteArray77, 0, 6);
				@Pc(65) int local65 = (Static226.aByteArray77[2] & 0xFF) + ((Static226.aByteArray77[1] & 0xFF) << 8) + ((Static226.aByteArray77[0] & 0xFF) << 16);
				@Pc(87) int local87 = (Static226.aByteArray77[5] & 0xFF) + ((Static226.aByteArray77[4] & 0xFF) << 8) + ((Static226.aByteArray77[3] & 0xFF) << 16);
				if (local65 < 0 || local65 > this.anInt4987) {
					return null;
				} else if (local87 > 0 && this.aClass190_3.method4932() / 520L >= (long) local87) {
					@Pc(127) byte[] local127 = new byte[local65];
					@Pc(129) int local129 = 0;
					@Pc(139) int local139 = 0;
					while (local65 > local129) {
						if (local87 == 0) {
							return null;
						}
						this.aClass190_3.method4929((long) (local87 * 520));
						@Pc(162) int local162 = local65 - local129;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass190_3.method4925(Static226.aByteArray77, 0, local162 + 8);
						@Pc(191) int local191 = ((Static226.aByteArray77[0] & 0xFF) << 8) + (Static226.aByteArray77[1] & 0xFF);
						@Pc(206) int local206 = ((Static226.aByteArray77[2] & 0xFF) << 8) + (Static226.aByteArray77[3] & 0xFF);
						@Pc(228) int local228 = (Static226.aByteArray77[6] & 0xFF) + ((Static226.aByteArray77[4] & 0xFF) << 16) + ((Static226.aByteArray77[5] & 0xFF) << 8);
						@Pc(234) int local234 = Static226.aByteArray77[7] & 0xFF;
						if (local191 == arg0 && local139 == local206 && local234 == this.anInt4988) {
							if (local228 >= 0 && (long) local228 <= this.aClass190_3.method4932() / 520L) {
								for (@Pc(278) int local278 = 0; local278 < local162; local278++) {
									local127[local129++] = Static226.aByteArray77[local278 + 8];
								}
								local139++;
								local87 = local228;
								continue;
							}
							return null;
						}
						return null;
					}
					return local127;
				} else {
					return null;
				}
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ[BBI)Z")
	private boolean method4387(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class190 local8 = this.aClass190_3;
		synchronized (this.aClass190_3) {
			try {
				@Pc(69) int local69;
				if (arg1) {
					if (this.aClass190_2.method4932() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass190_2.method4929((long) (arg0 * 6));
					this.aClass190_2.method4925(Static226.aByteArray77, 0, 6);
					local69 = ((Static226.aByteArray77[3] & 0xFF) << 16) - (-((Static226.aByteArray77[4] & 0xFF) << 8) - (Static226.aByteArray77[5] & 0xFF));
					if (local69 <= 0 || (long) local69 > this.aClass190_3.method4932() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass190_3.method4932() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static226.aByteArray77[5] = (byte) local69;
				Static226.aByteArray77[4] = (byte) (local69 >> 8);
				Static226.aByteArray77[0] = (byte) (arg3 >> 16);
				Static226.aByteArray77[1] = (byte) (arg3 >> 8);
				Static226.aByteArray77[3] = (byte) (local69 >> 16);
				Static226.aByteArray77[2] = (byte) arg3;
				this.aClass190_2.method4929((long) (arg0 * 6));
				this.aClass190_2.method4928(0, Static226.aByteArray77, 6);
				@Pc(169) int local169 = 0;
				@Pc(171) int local171 = 0;
				while (local169 < arg3) {
					@Pc(175) int local175 = 0;
					@Pc(210) int local210;
					if (arg1) {
						this.aClass190_3.method4929((long) (local69 * 520));
						try {
							this.aClass190_3.method4925(Static226.aByteArray77, 0, 8);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = ((Static226.aByteArray77[0] & 0xFF) << 8) + (Static226.aByteArray77[1] & 0xFF);
						@Pc(224) int local224 = (Static226.aByteArray77[3] & 0xFF) + ((Static226.aByteArray77[2] & 0xFF) << 8);
						local175 = (Static226.aByteArray77[6] & 0xFF) + ((Static226.aByteArray77[5] & 0xFF) << 8) + ((Static226.aByteArray77[4] & 0xFF) << 16);
						@Pc(252) int local252 = Static226.aByteArray77[7] & 0xFF;
						if (arg0 != local210 || local224 != local171 || local252 != this.anInt4988) {
							return false;
						}
						if (local175 < 0 || this.aClass190_3.method4932() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg1 = false;
						local175 = (int) ((this.aClass190_3.method4932() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local69 == local175) {
							local175++;
						}
					}
					Static226.aByteArray77[1] = (byte) arg0;
					Static226.aByteArray77[0] = (byte) (arg0 >> 8);
					if (arg3 - local169 <= 512) {
						local175 = 0;
					}
					Static226.aByteArray77[3] = (byte) local171;
					Static226.aByteArray77[2] = (byte) (local171 >> 8);
					Static226.aByteArray77[6] = (byte) local175;
					Static226.aByteArray77[5] = (byte) (local175 >> 8);
					Static226.aByteArray77[4] = (byte) (local175 >> 16);
					Static226.aByteArray77[7] = (byte) this.anInt4988;
					this.aClass190_3.method4929((long) (local69 * 520));
					this.aClass190_3.method4928(0, Static226.aByteArray77, 8);
					local210 = arg3 - local169;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass190_3.method4928(local169, arg2, local210);
					local69 = local175;
					local169 += local210;
					local171++;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4988;
	}
}
