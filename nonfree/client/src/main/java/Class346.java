import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class346 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!qp;")
	private Class283 aClass283_4 = null;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "Lclient!qp;")
	private Class283 aClass283_5 = null;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	private int anInt10217 = 65000;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	private final int anInt10221;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(ILclient!qp;Lclient!qp;I)V")
	public Class346(@OriginalArg(0) int arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) Class283 arg2, @OriginalArg(3) int arg3) {
		this.aClass283_4 = arg1;
		this.anInt10221 = arg0;
		this.anInt10217 = arg3;
		this.aClass283_5 = arg2;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BBI)Z")
	public boolean method7941(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class283 local6 = this.aClass283_4;
		synchronized (this.aClass283_4) {
			if (arg2 < 0 || this.anInt10217 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(32) boolean local32 = this.method7943(arg1, arg2, true, arg0);
			if (!local32) {
				local32 = this.method7943(arg1, arg2, false, arg0);
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!vm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt10221;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BIZI)Z")
	private boolean method7943(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class283 local8 = this.aClass283_4;
		synchronized (this.aClass283_4) {
			try {
				@Pc(73) int local73;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass283_5.method6490()) {
						return false;
					}
					this.aClass283_5.method6489((long) (arg3 * 6));
					this.aClass283_5.method6484(6, Static361.aByteArray66, 0);
					local73 = ((Static361.aByteArray66[3] & 0xFF) << 16) + ((Static361.aByteArray66[4] & 0xFF) << 8) + (Static361.aByteArray66[5] & 0xFF);
					if (local73 <= 0 || (long) local73 > this.aClass283_4.method6490() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass283_4.method6490() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static361.aByteArray66[2] = (byte) arg1;
				Static361.aByteArray66[0] = (byte) (arg1 >> 16);
				Static361.aByteArray66[1] = (byte) (arg1 >> 8);
				Static361.aByteArray66[3] = (byte) (local73 >> 16);
				Static361.aByteArray66[5] = (byte) local73;
				Static361.aByteArray66[4] = (byte) (local73 >> 8);
				this.aClass283_5.method6489((long) (arg3 * 6));
				this.aClass283_5.method6486(6, Static361.aByteArray66, 0);
				@Pc(167) int local167 = 0;
				@Pc(169) int local169 = 0;
				while (arg1 > local167) {
					@Pc(173) int local173 = 0;
					@Pc(210) int local210;
					if (arg2) {
						this.aClass283_4.method6489((long) (local73 * 520));
						try {
							this.aClass283_4.method6484(8, Static361.aByteArray66, 0);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = (Static361.aByteArray66[1] & 0xFF) + ((Static361.aByteArray66[0] & 0xFF) << 8);
						@Pc(225) int local225 = ((Static361.aByteArray66[2] & 0xFF) << 8) + (Static361.aByteArray66[3] & 0xFF);
						local173 = (Static361.aByteArray66[6] & 0xFF) + ((Static361.aByteArray66[4] & 0xFF) << 16) + ((Static361.aByteArray66[5] & 0xFF) << 8);
						@Pc(254) int local254 = Static361.aByteArray66[7] & 0xFF;
						if (local210 != arg3 || local225 != local169 || local254 != this.anInt10221) {
							return false;
						}
						if (local173 < 0 || this.aClass283_4.method6490() / 520L < (long) local173) {
							return false;
						}
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass283_4.method6490() + 519L) / 520L);
						arg2 = false;
						if (local173 == 0) {
							local173++;
						}
						if (local73 == local173) {
							local173++;
						}
					}
					if (arg1 - local167 <= 512) {
						local173 = 0;
					}
					Static361.aByteArray66[3] = (byte) local169;
					Static361.aByteArray66[0] = (byte) (arg3 >> 8);
					Static361.aByteArray66[2] = (byte) (local169 >> 8);
					Static361.aByteArray66[1] = (byte) arg3;
					Static361.aByteArray66[7] = (byte) this.anInt10221;
					Static361.aByteArray66[6] = (byte) local173;
					Static361.aByteArray66[4] = (byte) (local173 >> 16);
					Static361.aByteArray66[5] = (byte) (local173 >> 8);
					this.aClass283_4.method6489((long) (local73 * 520));
					this.aClass283_4.method6486(8, Static361.aByteArray66, 0);
					local210 = arg1 - local167;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass283_4.method6486(local210, arg0, local167);
					local169++;
					local167 += local210;
					local73 = local173;
				}
				return true;
			} catch (@Pc(444) IOException local444) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)[B")
	public byte[] method7944(@OriginalArg(1) int arg0) {
		@Pc(8) Class283 local8 = this.aClass283_4;
		synchronized (this.aClass283_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass283_5.method6490()) {
					return null;
				}
				this.aClass283_5.method6489((long) (arg0 * 6));
				this.aClass283_5.method6484(6, Static361.aByteArray66, 0);
				@Pc(66) int local66 = ((Static361.aByteArray66[0] & 0xFF) << 16) - (-(Static361.aByteArray66[1] << 8 & 0xFF00) - (Static361.aByteArray66[2] & 0xFF));
				@Pc(95) int local95 = (Static361.aByteArray66[5] & 0xFF) + ((Static361.aByteArray66[3] & 0xFF) << 16) + ((Static361.aByteArray66[4] & 0xFF) << 8);
				if (local66 < 0 || local66 > this.anInt10217) {
					return null;
				} else if (local95 > 0 && (long) local95 <= this.aClass283_4.method6490() / 520L) {
					@Pc(138) byte[] local138 = new byte[local66];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					label55: while (local66 > local140) {
						if (local95 == 0) {
							return null;
						}
						this.aClass283_4.method6489((long) (local95 * 520));
						@Pc(167) int local167 = local66 - local140;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass283_4.method6484(local167 + 8, Static361.aByteArray66, 0);
						@Pc(195) int local195 = ((Static361.aByteArray66[0] & 0xFF) << 8) + (Static361.aByteArray66[1] & 0xFF);
						@Pc(209) int local209 = (Static361.aByteArray66[3] & 0xFF) + ((Static361.aByteArray66[2] & 0xFF) << 8);
						@Pc(231) int local231 = (Static361.aByteArray66[6] & 0xFF) + ((Static361.aByteArray66[5] & 0xFF) << 8) + ((Static361.aByteArray66[4] & 0xFF) << 16);
						@Pc(237) int local237 = Static361.aByteArray66[7] & 0xFF;
						if (local195 == arg0 && local142 == local209 && local237 == this.anInt10221) {
							if (local231 >= 0 && this.aClass283_4.method6490() / 520L >= (long) local231) {
								local95 = local231;
								local142++;
								@Pc(280) int local280 = 0;
								while (true) {
									if (local167 <= local280) {
										continue label55;
									}
									local138[local140++] = Static361.aByteArray66[local280 + 8];
									local280++;
								}
							}
							return null;
						}
						return null;
					}
					return local138;
				} else {
					return null;
				}
			} catch (@Pc(313) IOException local313) {
				return null;
			}
		}
	}
}
