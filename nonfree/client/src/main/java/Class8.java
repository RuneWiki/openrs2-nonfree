import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class8 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!de;")
	private Class20 aClass20_1 = null;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!de;")
	private Class20 aClass20_2 = null;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	private int anInt365 = 65000;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	private final int anInt358;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ILclient!de;Lclient!de;I)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3) {
		this.aClass20_1 = arg2;
		this.anInt365 = arg3;
		this.anInt358 = arg0;
		this.aClass20_2 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII)Z")
	public boolean method197(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class20 local6 = this.aClass20_2;
		synchronized (this.aClass20_2) {
			if (arg2 < 0 || this.anInt365 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method198(arg1, true, arg2, arg0);
			if (!local33) {
				local33 = this.method198(arg1, false, arg2, arg0);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZI[B)Z")
	private boolean method198(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class20 local8 = this.aClass20_2;
		synchronized (this.aClass20_2) {
			try {
				@Pc(27) int local27;
				if (arg1) {
					if (this.aClass20_1.method442() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass20_1.method438((long) (arg0 * 6));
					this.aClass20_1.method441(Static23.aByteArray7, 6, 0);
					local27 = ((Static23.aByteArray7[3] & 0xFF) << 16) + ((Static23.aByteArray7[4] & 0xFF) << 8) + (Static23.aByteArray7[5] & 0xFF);
					if (local27 <= 0 || (long) local27 > this.aClass20_2.method442() / 520L) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass20_2.method442() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Static23.aByteArray7[5] = (byte) local27;
				Static23.aByteArray7[4] = (byte) (local27 >> 8);
				Static23.aByteArray7[0] = (byte) (arg2 >> 16);
				@Pc(135) int local135 = 0;
				Static23.aByteArray7[1] = (byte) (arg2 >> 8);
				Static23.aByteArray7[2] = (byte) arg2;
				Static23.aByteArray7[3] = (byte) (local27 >> 16);
				this.aClass20_1.method438((long) (arg0 * 6));
				this.aClass20_1.method448(6, 0, Static23.aByteArray7);
				@Pc(171) int local171 = 0;
				while (arg2 > local135) {
					@Pc(175) int local175 = 0;
					@Pc(233) int local233;
					if (arg1) {
						this.aClass20_2.method438((long) (local27 * 520));
						try {
							this.aClass20_2.method441(Static23.aByteArray7, 8, 0);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local175 = (Static23.aByteArray7[6] & 0xFF) + ((Static23.aByteArray7[5] & 0xFF) << 8) + ((Static23.aByteArray7[4] & 0xFF) << 16);
						local233 = ((Static23.aByteArray7[0] & 0xFF) << 8) + (Static23.aByteArray7[1] & 0xFF);
						@Pc(239) int local239 = Static23.aByteArray7[7] & 0xFF;
						@Pc(253) int local253 = ((Static23.aByteArray7[2] & 0xFF) << 8) + (Static23.aByteArray7[3] & 0xFF);
						if (local233 != arg0 || local253 != local171 || this.anInt358 != local239) {
							return false;
						}
						if (local175 < 0 || (long) local175 > this.aClass20_2.method442() / 520L) {
							return false;
						}
					}
					if (local175 == 0) {
						arg1 = false;
						local175 = (int) ((this.aClass20_2.method442() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local27 == local175) {
							local175++;
						}
					}
					Static23.aByteArray7[3] = (byte) local171;
					local233 = arg2 - local135;
					Static23.aByteArray7[2] = (byte) (local171 >> 8);
					if (arg2 - local135 <= 512) {
						local175 = 0;
					}
					Static23.aByteArray7[6] = (byte) local175;
					Static23.aByteArray7[4] = (byte) (local175 >> 16);
					local171++;
					Static23.aByteArray7[5] = (byte) (local175 >> 8);
					Static23.aByteArray7[7] = (byte) this.anInt358;
					if (local233 > 512) {
						local233 = 512;
					}
					Static23.aByteArray7[0] = (byte) (arg0 >> 8);
					Static23.aByteArray7[1] = (byte) arg0;
					this.aClass20_2.method438((long) (local27 * 520));
					local27 = local175;
					this.aClass20_2.method448(8, 0, Static23.aByteArray7);
					this.aClass20_2.method448(local233, local135, arg3);
					local135 += local233;
				}
				return true;
			} catch (@Pc(431) IOException local431) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[B")
	public byte[] method199(@OriginalArg(1) int arg0) {
		@Pc(8) Class20 local8 = this.aClass20_2;
		synchronized (this.aClass20_2) {
			try {
				if (this.aClass20_1.method442() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass20_1.method438((long) (arg0 * 6));
				this.aClass20_1.method441(Static23.aByteArray7, 6, 0);
				@Pc(65) int local65 = (Static23.aByteArray7[2] & 0xFF) + ((Static23.aByteArray7[1] & 0xFF) << 8) + ((Static23.aByteArray7[0] & 0xFF) << 16);
				@Pc(87) int local87 = (Static23.aByteArray7[5] & 0xFF) + ((Static23.aByteArray7[4] & 0xFF) << 8) + ((Static23.aByteArray7[3] & 0xFF) << 16);
				if (local65 < 0 || local65 > this.anInt365) {
					return null;
				} else if (local87 > 0 && (long) local87 <= this.aClass20_2.method442() / 520L) {
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					@Pc(140) byte[] local140 = new byte[local65];
					while (local137 < local65) {
						if (local87 == 0) {
							return null;
						}
						@Pc(155) int local155 = local65 - local137;
						this.aClass20_2.method438((long) (local87 * 520));
						if (local155 > 512) {
							local155 = 512;
						}
						this.aClass20_2.method441(Static23.aByteArray7, local155 + 8, 0);
						@Pc(202) int local202 = (Static23.aByteArray7[6] & 0xFF) + ((Static23.aByteArray7[4] & 0xFF) << 16) + ((Static23.aByteArray7[5] & 0xFF) << 8);
						@Pc(208) int local208 = Static23.aByteArray7[7] & 0xFF;
						@Pc(222) int local222 = (Static23.aByteArray7[3] & 0xFF) + ((Static23.aByteArray7[2] & 0xFF) << 8);
						@Pc(236) int local236 = (Static23.aByteArray7[1] & 0xFF) + ((Static23.aByteArray7[0] & 0xFF) << 8);
						if (local236 == arg0 && local135 == local222 && this.anInt358 == local208) {
							if (local202 >= 0 && this.aClass20_2.method442() / 520L >= (long) local202) {
								for (@Pc(283) int local283 = 0; local283 < local155; local283++) {
									local140[local137++] = Static23.aByteArray7[local283 + 8];
								}
								local135++;
								local87 = local202;
								continue;
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt358;
	}
}
