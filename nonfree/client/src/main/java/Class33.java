import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class33 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!df;")
	private Class17 aClass17_1 = null;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!df;")
	private Class17 aClass17_2 = null;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private int anInt1518 = 65000;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	private final int anInt1516;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILclient!df;Lclient!df;I)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) int arg3) {
		this.anInt1518 = arg3;
		this.aClass17_2 = arg2;
		this.aClass17_1 = arg1;
		this.anInt1516 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIII[B)Z")
	private boolean method949(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class17 local8 = this.aClass17_1;
		synchronized (this.aClass17_1) {
			try {
				@Pc(71) int local71;
				if (arg0) {
					if ((long) (arg1 * 6 + 6) > this.aClass17_2.method501()) {
						return false;
					}
					this.aClass17_2.method508((long) (arg1 * 6));
					this.aClass17_2.method504(Static39.aByteArray16, 0, 6);
					local71 = ((Static39.aByteArray16[3] & 0xFF) << 16) + (Static39.aByteArray16[4] << 8 & 0xFF00) + (Static39.aByteArray16[5] & 0xFF);
					if (local71 <= 0 || this.aClass17_1.method501() / 520L < (long) local71) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass17_1.method501() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static39.aByteArray16[2] = (byte) arg2;
				Static39.aByteArray16[3] = (byte) (local71 >> 16);
				Static39.aByteArray16[0] = (byte) (arg2 >> 16);
				Static39.aByteArray16[1] = (byte) (arg2 >> 8);
				@Pc(144) int local144 = 0;
				Static39.aByteArray16[5] = (byte) local71;
				Static39.aByteArray16[4] = (byte) (local71 >> 8);
				this.aClass17_2.method508((long) (arg1 * 6));
				@Pc(166) int local166 = 0;
				this.aClass17_2.method506(6, 0, Static39.aByteArray16);
				while (arg2 > local144) {
					@Pc(179) int local179 = 0;
					@Pc(236) int local236;
					if (arg0) {
						this.aClass17_1.method508((long) (local71 * 520));
						try {
							this.aClass17_1.method504(Static39.aByteArray16, 0, 8);
						} catch (@Pc(198) EOFException local198) {
							return true;
						}
						local179 = ((Static39.aByteArray16[5] & 0xFF) << 8) + ((Static39.aByteArray16[4] & 0xFF) << 16) + (Static39.aByteArray16[6] & 0xFF);
						local236 = (Static39.aByteArray16[1] & 0xFF) + ((Static39.aByteArray16[0] & 0xFF) << 8);
						@Pc(250) int local250 = (Static39.aByteArray16[3] & 0xFF) + ((Static39.aByteArray16[2] & 0xFF) << 8);
						@Pc(256) int local256 = Static39.aByteArray16[7] & 0xFF;
						if (local236 != arg1 || local250 != local166 || this.anInt1516 != local256) {
							return false;
						}
						if (local179 < 0 || this.aClass17_1.method501() / 520L < (long) local179) {
							return false;
						}
					}
					if (local179 == 0) {
						arg0 = false;
						local179 = (int) ((this.aClass17_1.method501() + 519L) / 520L);
						if (local179 == 0) {
							local179++;
						}
						if (local179 == local71) {
							local179++;
						}
					}
					Static39.aByteArray16[0] = (byte) (arg1 >> 8);
					local236 = arg2 - local144;
					if (arg2 - local144 <= 512) {
						local179 = 0;
					}
					Static39.aByteArray16[3] = (byte) local166;
					Static39.aByteArray16[2] = (byte) (local166 >> 8);
					Static39.aByteArray16[7] = (byte) this.anInt1516;
					if (local236 > 512) {
						local236 = 512;
					}
					Static39.aByteArray16[4] = (byte) (local179 >> 16);
					local166++;
					Static39.aByteArray16[1] = (byte) arg1;
					Static39.aByteArray16[5] = (byte) (local179 >> 8);
					Static39.aByteArray16[6] = (byte) local179;
					this.aClass17_1.method508((long) (local71 * 520));
					local71 = local179;
					this.aClass17_1.method506(8, 0, Static39.aByteArray16);
					this.aClass17_1.method506(local236, local144, arg3);
					local144 += local236;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1516;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIII)Z")
	public boolean method951(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class17 local11 = this.aClass17_1;
		synchronized (this.aClass17_1) {
			if (arg1 < 0 || arg1 > this.anInt1518) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method949(true, arg2, arg1, arg0);
			if (!local35) {
				local35 = this.method949(false, arg2, arg1, arg0);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[B")
	public byte[] method952(@OriginalArg(0) int arg0) {
		@Pc(8) Class17 local8 = this.aClass17_1;
		synchronized (this.aClass17_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass17_2.method501()) {
					return null;
				}
				this.aClass17_2.method508((long) (arg0 * 6));
				this.aClass17_2.method504(Static39.aByteArray16, 0, 6);
				@Pc(65) int local65 = ((Static39.aByteArray16[4] & 0xFF) << 8) + ((Static39.aByteArray16[3] & 0xFF) << 16) + (Static39.aByteArray16[5] & 0xFF);
				@Pc(88) int local88 = ((Static39.aByteArray16[0] & 0xFF) << 16) + (Static39.aByteArray16[1] << 8 & 0xFF00) + (Static39.aByteArray16[2] & 0xFF);
				if (local88 < 0 || this.anInt1518 < local88) {
					return null;
				} else if (local65 > 0 && this.aClass17_1.method501() / 520L >= (long) local65) {
					@Pc(131) byte[] local131 = new byte[local88];
					@Pc(133) int local133 = 0;
					@Pc(135) int local135 = 0;
					label55: while (local133 < local88) {
						if (local65 == 0) {
							return null;
						}
						this.aClass17_1.method508((long) (local65 * 520));
						@Pc(161) int local161 = local88 - local133;
						if (local161 > 512) {
							local161 = 512;
						}
						this.aClass17_1.method504(Static39.aByteArray16, 0, local161 + 8);
						@Pc(190) int local190 = ((Static39.aByteArray16[0] & 0xFF) << 8) + (Static39.aByteArray16[1] & 0xFF);
						@Pc(196) int local196 = Static39.aByteArray16[7] & 0xFF;
						@Pc(210) int local210 = (Static39.aByteArray16[3] & 0xFF) + ((Static39.aByteArray16[2] & 0xFF) << 8);
						@Pc(232) int local232 = ((Static39.aByteArray16[5] & 0xFF) << 8) + ((Static39.aByteArray16[4] & 0xFF) << 16) + (Static39.aByteArray16[6] & 0xFF);
						if (local190 == arg0 && local210 == local135 && this.anInt1516 == local196) {
							if (local232 >= 0 && (long) local232 <= this.aClass17_1.method501() / 520L) {
								local65 = local232;
								local135++;
								@Pc(278) int local278 = 0;
								while (true) {
									if (local161 <= local278) {
										continue label55;
									}
									local131[local133++] = Static39.aByteArray16[local278 + 8];
									local278++;
								}
							}
							return null;
						}
						return null;
					}
					return local131;
				} else {
					return null;
				}
			} catch (@Pc(307) IOException local307) {
				return null;
			}
		}
	}
}
