import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class203 {

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!qp;")
	private Class171 aClass171_5 = null;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!qp;")
	private Class171 aClass171_6 = null;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	private int anInt6401 = 65000;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	private final int anInt6404;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(ILclient!qp;Lclient!qp;I)V")
	public Class203(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) int arg3) {
		this.aClass171_6 = arg1;
		this.aClass171_5 = arg2;
		this.anInt6401 = arg3;
		this.anInt6404 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6404;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[B")
	public byte[] method5496(@OriginalArg(1) int arg0) {
		@Pc(8) Class171 local8 = this.aClass171_6;
		synchronized (this.aClass171_6) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass171_5.method4502()) {
					return null;
				}
				this.aClass171_5.method4501((long) (arg0 * 6));
				this.aClass171_5.method4504(0, Static283.aByteArray67, 6);
				@Pc(65) int local65 = ((Static283.aByteArray67[0] & 0xFF) << 16) + ((Static283.aByteArray67[1] & 0xFF) << 8) + (Static283.aByteArray67[2] & 0xFF);
				@Pc(87) int local87 = (Static283.aByteArray67[5] & 0xFF) + ((Static283.aByteArray67[4] & 0xFF) << 8) + ((Static283.aByteArray67[3] & 0xFF) << 16);
				if (local65 < 0 || this.anInt6401 < local65) {
					return null;
				} else if (local87 > 0 && this.aClass171_6.method4502() / 520L >= (long) local87) {
					@Pc(127) byte[] local127 = new byte[local65];
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					label55: while (local65 > local135) {
						if (local87 == 0) {
							return null;
						}
						this.aClass171_6.method4501((long) (local87 * 520));
						@Pc(163) int local163 = local65 - local135;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass171_6.method4504(0, Static283.aByteArray67, local163 + 8);
						@Pc(193) int local193 = (Static283.aByteArray67[1] & 0xFF) + ((Static283.aByteArray67[0] & 0xFF) << 8);
						@Pc(207) int local207 = (Static283.aByteArray67[3] & 0xFF) + ((Static283.aByteArray67[2] & 0xFF) << 8);
						@Pc(229) int local229 = (Static283.aByteArray67[6] & 0xFF) + ((Static283.aByteArray67[5] & 0xFF) << 8) + ((Static283.aByteArray67[4] & 0xFF) << 16);
						@Pc(235) int local235 = Static283.aByteArray67[7] & 0xFF;
						if (arg0 == local193 && local137 == local207 && local235 == this.anInt6404) {
							if (local229 >= 0 && (long) local229 <= this.aClass171_6.method4502() / 520L) {
								local137++;
								local87 = local229;
								@Pc(280) int local280 = 0;
								while (true) {
									if (local280 >= local163) {
										continue label55;
									}
									local127[local135++] = Static283.aByteArray67[local280 + 8];
									local280++;
								}
							}
							return null;
						}
						return null;
					}
					return local127;
				} else {
					return null;
				}
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZBII[B)Z")
	private boolean method5499(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class171 local8 = this.aClass171_6;
		synchronized (this.aClass171_6) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass171_5.method4502() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass171_5.method4501((long) (arg1 * 6));
					this.aClass171_5.method4504(0, Static283.aByteArray67, 6);
					local22 = ((Static283.aByteArray67[4] & 0xFF) << 8) + (Static283.aByteArray67[3] << 16 & 0xFF0000) + (Static283.aByteArray67[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass171_6.method4502() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass171_6.method4502() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static283.aByteArray67[3] = (byte) (local22 >> 16);
				Static283.aByteArray67[4] = (byte) (local22 >> 8);
				Static283.aByteArray67[5] = (byte) local22;
				Static283.aByteArray67[2] = (byte) arg2;
				Static283.aByteArray67[1] = (byte) (arg2 >> 8);
				Static283.aByteArray67[0] = (byte) (arg2 >> 16);
				this.aClass171_5.method4501((long) (arg1 * 6));
				this.aClass171_5.method4498(0, 6, Static283.aByteArray67);
				@Pc(169) int local169 = 0;
				@Pc(171) int local171 = 0;
				while (local169 < arg2) {
					@Pc(175) int local175 = 0;
					@Pc(210) int local210;
					if (arg0) {
						this.aClass171_6.method4501((long) (local22 * 520));
						try {
							this.aClass171_6.method4504(0, Static283.aByteArray67, 8);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = ((Static283.aByteArray67[0] & 0xFF) << 8) + (Static283.aByteArray67[1] & 0xFF);
						@Pc(224) int local224 = (Static283.aByteArray67[3] & 0xFF) + ((Static283.aByteArray67[2] & 0xFF) << 8);
						local175 = (Static283.aByteArray67[6] & 0xFF) + ((Static283.aByteArray67[4] & 0xFF) << 16) + ((Static283.aByteArray67[5] & 0xFF) << 8);
						@Pc(252) int local252 = Static283.aByteArray67[7] & 0xFF;
						if (arg1 != local210 || local224 != local171 || local252 != this.anInt6404) {
							return false;
						}
						if (local175 < 0 || this.aClass171_6.method4502() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						local175 = (int) ((this.aClass171_6.method4502() + 519L) / 520L);
						arg0 = false;
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local22) {
							local175++;
						}
					}
					Static283.aByteArray67[0] = (byte) (arg1 >> 8);
					Static283.aByteArray67[2] = (byte) (local171 >> 8);
					if (arg2 - local169 <= 512) {
						local175 = 0;
					}
					Static283.aByteArray67[1] = (byte) arg1;
					Static283.aByteArray67[3] = (byte) local171;
					Static283.aByteArray67[4] = (byte) (local175 >> 16);
					Static283.aByteArray67[7] = (byte) this.anInt6404;
					Static283.aByteArray67[6] = (byte) local175;
					Static283.aByteArray67[5] = (byte) (local175 >> 8);
					this.aClass171_6.method4501((long) (local22 * 520));
					this.aClass171_6.method4498(0, 8, Static283.aByteArray67);
					local210 = arg2 - local169;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass171_6.method4498(local169, local210, arg3);
					local22 = local175;
					local169 += local210;
					local171++;
				}
				return true;
			} catch (@Pc(426) IOException local426) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BIII)Z")
	public boolean method5500(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class171 local6 = this.aClass171_6;
		synchronized (this.aClass171_6) {
			if (arg2 < 0 || arg2 > this.anInt6401) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method5499(true, arg1, arg2, arg0);
			if (!local38) {
				local38 = this.method5499(false, arg1, arg2, arg0);
			}
			return local38;
		}
	}
}
