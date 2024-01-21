import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class17 {

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!gb;")
	private Class34 aClass34_1 = null;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!gb;")
	private Class34 aClass34_2 = null;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	private int anInt582 = 65000;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	private final int anInt577;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(ILclient!gb;Lclient!gb;I)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) int arg3) {
		this.aClass34_1 = arg1;
		this.anInt577 = arg0;
		this.anInt582 = arg3;
		this.aClass34_2 = arg2;
	}

	@OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt577;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ[BII)Z")
	private boolean method456(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class34 local8 = this.aClass34_1;
		synchronized (this.aClass34_1) {
			try {
				@Pc(67) int local67;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.aClass34_2.method1008()) {
						return false;
					}
					this.aClass34_2.method1010((long) (arg2 * 6));
					this.aClass34_2.method1015(6, Static22.aByteArray44, 0);
					local67 = ((Static22.aByteArray44[4] & 0xFF) << 8) + (Static22.aByteArray44[3] << 16 & 0xFF0000) + (Static22.aByteArray44[5] & 0xFF);
					if (local67 <= 0 || (long) local67 > this.aClass34_1.method1008() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass34_1.method1008() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static22.aByteArray44[3] = (byte) (local67 >> 16);
				Static22.aByteArray44[4] = (byte) (local67 >> 8);
				Static22.aByteArray44[0] = (byte) (arg3 >> 16);
				Static22.aByteArray44[5] = (byte) local67;
				Static22.aByteArray44[2] = (byte) arg3;
				Static22.aByteArray44[1] = (byte) (arg3 >> 8);
				@Pc(146) int local146 = 0;
				this.aClass34_2.method1010((long) (arg2 * 6));
				this.aClass34_2.method1017(0, Static22.aByteArray44, 6);
				@Pc(171) int local171 = 0;
				while (arg3 > local146) {
					@Pc(175) int local175 = 0;
					@Pc(233) int local233;
					if (arg0) {
						this.aClass34_1.method1010((long) (local67 * 520));
						try {
							this.aClass34_1.method1015(8, Static22.aByteArray44, 0);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local175 = ((Static22.aByteArray44[5] & 0xFF) << 8) + (Static22.aByteArray44[4] << 16 & 0xFF0000) + (Static22.aByteArray44[6] & 0xFF);
						local233 = (Static22.aByteArray44[1] & 0xFF) + ((Static22.aByteArray44[0] & 0xFF) << 8);
						@Pc(248) int local248 = ((Static22.aByteArray44[2] & 0xFF) << 8) + (Static22.aByteArray44[3] & 0xFF);
						@Pc(254) int local254 = Static22.aByteArray44[7] & 0xFF;
						if (arg2 != local233 || local248 != local171 || this.anInt577 != local254) {
							return false;
						}
						if (local175 < 0 || this.aClass34_1.method1008() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg0 = false;
						local175 = (int) ((this.aClass34_1.method1008() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local67) {
							local175++;
						}
					}
					Static22.aByteArray44[1] = (byte) arg2;
					local233 = arg3 - local146;
					Static22.aByteArray44[2] = (byte) (local171 >> 8);
					Static22.aByteArray44[0] = (byte) (arg2 >> 8);
					if (arg3 - local146 <= 512) {
						local175 = 0;
					}
					Static22.aByteArray44[6] = (byte) local175;
					Static22.aByteArray44[5] = (byte) (local175 >> 8);
					Static22.aByteArray44[4] = (byte) (local175 >> 16);
					Static22.aByteArray44[3] = (byte) local171;
					if (local233 > 512) {
						local233 = 512;
					}
					local171++;
					Static22.aByteArray44[7] = (byte) this.anInt577;
					this.aClass34_1.method1010((long) (local67 * 520));
					local67 = local175;
					this.aClass34_1.method1017(0, Static22.aByteArray44, 8);
					this.aClass34_1.method1017(local146, arg1, local233);
					local146 += local233;
				}
				return true;
			} catch (@Pc(443) IOException local443) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[B")
	public byte[] method457(@OriginalArg(1) int arg0) {
		@Pc(8) Class34 local8 = this.aClass34_1;
		synchronized (this.aClass34_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass34_2.method1008()) {
					return null;
				}
				this.aClass34_2.method1010((long) (arg0 * 6));
				this.aClass34_2.method1015(6, Static22.aByteArray44, 0);
				@Pc(76) int local76 = ((Static22.aByteArray44[0] & 0xFF) << 16) + (Static22.aByteArray44[1] << 8 & 0xFF00) + (Static22.aByteArray44[2] & 0xFF);
				@Pc(98) int local98 = ((Static22.aByteArray44[4] & 0xFF) << 8) + (Static22.aByteArray44[3] << 16 & 0xFF0000) + (Static22.aByteArray44[5] & 0xFF);
				if (local76 < 0 || this.anInt582 < local76) {
					return null;
				} else if (local98 > 0 && this.aClass34_1.method1008() / 520L >= (long) local98) {
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					@Pc(142) byte[] local142 = new byte[local76];
					while (local137 < local76) {
						if (local98 == 0) {
							return null;
						}
						this.aClass34_1.method1010((long) (local98 * 520));
						@Pc(165) int local165 = local76 - local137;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass34_1.method1015(local165 + 8, Static22.aByteArray44, 0);
						@Pc(196) int local196 = ((Static22.aByteArray44[2] & 0xFF) << 8) + (Static22.aByteArray44[3] & 0xFF);
						@Pc(202) int local202 = Static22.aByteArray44[7] & 0xFF;
						@Pc(216) int local216 = (Static22.aByteArray44[1] & 0xFF) + ((Static22.aByteArray44[0] & 0xFF) << 8);
						@Pc(238) int local238 = ((Static22.aByteArray44[5] & 0xFF) << 8) + (Static22.aByteArray44[4] << 16 & 0xFF0000) + (Static22.aByteArray44[6] & 0xFF);
						if (local216 == arg0 && local139 == local196 && this.anInt577 == local202) {
							if (local238 >= 0 && this.aClass34_1.method1008() / 520L >= (long) local238) {
								for (@Pc(290) int local290 = 0; local290 < local165; local290++) {
									local142[local137++] = Static22.aByteArray44[local290 + 8];
								}
								local139++;
								local98 = local238;
								continue;
							}
							return null;
						}
						return null;
					}
					return local142;
				} else {
					return null;
				}
			} catch (@Pc(322) IOException local322) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[BII)Z")
	public boolean method458(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class34 local6 = this.aClass34_1;
		synchronized (this.aClass34_1) {
			if (arg2 < 0 || arg2 > this.anInt582) {
				throw new IllegalArgumentException();
			}
			@Pc(42) boolean local42 = this.method456(true, arg1, arg0, arg2);
			if (!local42) {
				local42 = this.method456(false, arg1, arg0, arg2);
			}
			return local42;
		}
	}
}
