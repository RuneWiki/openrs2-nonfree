import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class32 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	private int anInt1621 = 65000;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!ph;")
	private Class72 aClass72_3 = null;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!ph;")
	private Class72 aClass72_4 = null;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	private final int anInt1625;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ILclient!ph;Lclient!ph;I)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3) {
		this.aClass72_4 = arg2;
		this.aClass72_3 = arg1;
		this.anInt1625 = arg0;
		this.anInt1621 = arg3;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIZI)Z")
	private boolean method1103(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class72 local8 = this.aClass72_3;
		synchronized (this.aClass72_3) {
			try {
				@Pc(68) int local68;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass72_4.method2626()) {
						return false;
					}
					this.aClass72_4.method2633((long) (arg2 * 6));
					this.aClass72_4.method2630(0, Static178.aByteArray47, 6);
					local68 = (Static178.aByteArray47[5] & 0xFF) + (((Static178.aByteArray47[3] & 0xFF) << 16) + ((Static178.aByteArray47[4] & 0xFF) << 8));
					if (local68 <= 0 || (long) local68 > this.aClass72_3.method2626() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass72_3.method2626() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static178.aByteArray47[1] = (byte) (arg1 >> 8);
				Static178.aByteArray47[2] = (byte) arg1;
				Static178.aByteArray47[4] = (byte) (local68 >> 8);
				Static178.aByteArray47[0] = (byte) (arg1 >> 16);
				Static178.aByteArray47[5] = (byte) local68;
				Static178.aByteArray47[3] = (byte) (local68 >> 16);
				@Pc(143) int local143 = 0;
				@Pc(145) int local145 = 0;
				this.aClass72_4.method2633((long) (arg2 * 6));
				this.aClass72_4.method2625(6, 0, Static178.aByteArray47);
				while (local143 < arg1) {
					@Pc(172) int local172 = 0;
					@Pc(237) int local237;
					if (arg3) {
						this.aClass72_3.method2633((long) (local68 * 520));
						try {
							this.aClass72_3.method2630(0, Static178.aByteArray47, 8);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local172 = (Static178.aByteArray47[6] & 0xFF) + ((Static178.aByteArray47[4] & 0xFF) << 16) + ((Static178.aByteArray47[5] & 0xFF) << 8);
						@Pc(222) int local222 = Static178.aByteArray47[7] & 0xFF;
						local237 = ((Static178.aByteArray47[0] & 0xFF) << 8) + (Static178.aByteArray47[1] & 0xFF);
						@Pc(252) int local252 = ((Static178.aByteArray47[2] & 0xFF) << 8) + (Static178.aByteArray47[3] & 0xFF);
						if (arg2 != local237 || local145 != local252 || local222 != this.anInt1625) {
							return false;
						}
						if (local172 < 0 || (long) local172 > this.aClass72_3.method2626() / 520L) {
							return false;
						}
					}
					if (local172 == 0) {
						local172 = (int) ((this.aClass72_3.method2626() + 519L) / 520L);
						arg3 = false;
						if (local172 == 0) {
							local172++;
						}
						if (local172 == local68) {
							local172++;
						}
					}
					Static178.aByteArray47[1] = (byte) arg2;
					if (arg1 - local143 <= 512) {
						local172 = 0;
					}
					Static178.aByteArray47[7] = (byte) this.anInt1625;
					Static178.aByteArray47[4] = (byte) (local172 >> 16);
					Static178.aByteArray47[0] = (byte) (arg2 >> 8);
					Static178.aByteArray47[6] = (byte) local172;
					Static178.aByteArray47[2] = (byte) (local145 >> 8);
					local237 = arg1 - local143;
					Static178.aByteArray47[5] = (byte) (local172 >> 8);
					Static178.aByteArray47[3] = (byte) local145;
					this.aClass72_3.method2633((long) (local68 * 520));
					local68 = local172;
					if (local237 > 512) {
						local237 = 512;
					}
					this.aClass72_3.method2625(8, 0, Static178.aByteArray47);
					this.aClass72_3.method2625(local237, local143, arg0);
					local145++;
					local143 += local237;
				}
				return true;
			} catch (@Pc(424) IOException local424) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIII)Z")
	public boolean method1104(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class72 local6 = this.aClass72_3;
		synchronized (this.aClass72_3) {
			if (arg1 < 0 || arg1 > this.anInt1621) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method1103(arg0, arg1, arg2, true);
			if (!local38) {
				local38 = this.method1103(arg0, arg1, arg2, false);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[B")
	public byte[] method1105(@OriginalArg(0) int arg0) {
		@Pc(6) Class72 local6 = this.aClass72_3;
		synchronized (this.aClass72_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass72_4.method2626()) {
					return null;
				}
				this.aClass72_4.method2633((long) (arg0 * 6));
				this.aClass72_4.method2630(0, Static178.aByteArray47, 6);
				@Pc(67) int local67 = ((Static178.aByteArray47[1] & 0xFF) << 8) + (Static178.aByteArray47[0] << 16 & 0xFF0000) + (Static178.aByteArray47[2] & 0xFF);
				@Pc(95) int local95 = (Static178.aByteArray47[5] & 0xFF) + ((Static178.aByteArray47[4] & 0xFF) << 8) + ((Static178.aByteArray47[3] & 0xFF) << 16);
				if (local67 < 0 || this.anInt1621 < local67) {
					return null;
				} else if (local95 > 0 && this.aClass72_3.method2626() / 520L >= (long) local95) {
					@Pc(131) int local131 = 0;
					@Pc(134) byte[] local134 = new byte[local67];
					@Pc(136) int local136 = 0;
					label55: while (local67 > local136) {
						if (local95 == 0) {
							return null;
						}
						this.aClass72_3.method2633((long) (local95 * 520));
						@Pc(158) int local158 = local67 - local136;
						if (local158 > 512) {
							local158 = 512;
						}
						this.aClass72_3.method2630(0, Static178.aByteArray47, local158 + 8);
						@Pc(189) int local189 = ((Static178.aByteArray47[0] & 0xFF) << 8) + (Static178.aByteArray47[1] & 0xFF);
						@Pc(203) int local203 = ((Static178.aByteArray47[2] & 0xFF) << 8) + (Static178.aByteArray47[3] & 0xFF);
						@Pc(226) int local226 = ((Static178.aByteArray47[5] & 0xFF) << 8) + ((Static178.aByteArray47[4] << 16 & 0xFF0000) + (Static178.aByteArray47[6] & 0xFF));
						@Pc(232) int local232 = Static178.aByteArray47[7] & 0xFF;
						if (local189 == arg0 && local203 == local131 && local232 == this.anInt1625) {
							if (local226 >= 0 && this.aClass72_3.method2626() / 520L >= (long) local226) {
								local131++;
								local95 = local226;
								@Pc(290) int local290 = 0;
								while (true) {
									if (local158 <= local290) {
										continue label55;
									}
									local134[local136++] = Static178.aByteArray47[local290 + 8];
									local290++;
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
			} catch (@Pc(322) IOException local322) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1625;
	}
}
