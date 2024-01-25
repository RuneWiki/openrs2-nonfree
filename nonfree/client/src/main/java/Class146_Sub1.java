import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class146_Sub1 extends Class146 {

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!ida", name = "I", descriptor = "Lclient!dw;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!ida", name = "O", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!ida", name = "s", descriptor = "I")
	private int anInt3930 = 0;

	@OriginalMember(owner = "client!ida", name = "F", descriptor = "Lclient!waa;")
	private final Class350 aClass350_17 = new Class350(16);

	@OriginalMember(owner = "client!ida", name = "N", descriptor = "I")
	private int anInt3941 = 0;

	@OriginalMember(owner = "client!ida", name = "L", descriptor = "Lclient!oe;")
	private final Class244 aClass244_28 = new Class244();

	@OriginalMember(owner = "client!ida", name = "S", descriptor = "J")
	private long aLong117 = 0L;

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "Lclient!vp;")
	private final Class345 aClass345_2;

	@OriginalMember(owner = "client!ida", name = "u", descriptor = "I")
	private final int anInt3931;

	@OriginalMember(owner = "client!ida", name = "P", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!ida", name = "M", descriptor = "Lclient!oe;")
	private Class244 aClass244_29;

	@OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
	private final int anInt3934;

	@OriginalMember(owner = "client!ida", name = "x", descriptor = "Lclient!uh;")
	private final Class329 aClass329_1;

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "[B")
	private final byte[] aByteArray53;

	@OriginalMember(owner = "client!ida", name = "R", descriptor = "Z")
	private final boolean aBoolean302;

	@OriginalMember(owner = "client!ida", name = "v", descriptor = "Lclient!vp;")
	private final Class345 aClass345_3;

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
	private final int anInt3924;

	@OriginalMember(owner = "client!ida", name = "y", descriptor = "Lclient!qc;")
	private final Class269 aClass269_1;

	@OriginalMember(owner = "client!ida", name = "t", descriptor = "Lclient!tg;")
	private Class4_Sub5_Sub3 aClass4_Sub5_Sub3_1;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILclient!vp;Lclient!vp;Lclient!uh;Lclient!qc;I[BIZ)V")
	public Class146_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class345 arg2, @OriginalArg(3) Class329 arg3, @OriginalArg(4) Class269 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass345_2 = arg1;
		this.anInt3931 = arg0;
		if (this.aClass345_2 == null) {
			this.aBoolean301 = false;
		} else {
			this.aBoolean301 = true;
			this.aClass244_29 = new Class244();
		}
		this.anInt3934 = arg5;
		this.aClass329_1 = arg3;
		this.aByteArray53 = arg6;
		this.aBoolean302 = arg8;
		this.aClass345_3 = arg2;
		this.anInt3924 = arg7;
		this.aClass269_1 = arg4;
		if (this.aClass345_3 != null) {
			this.aClass4_Sub5_Sub3_1 = this.aClass269_1.method6530(this.anInt3931, this.aClass345_3);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BI)I")
	@Override
	public int method3511(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub5_Sub3 local11 = (Class4_Sub5_Sub3) this.aClass350_17.method8207((long) arg0);
		return local11 == null ? 0 : local11.method2840();
	}

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(I)I")
	public int method3519() {
		if (this.aClass75_1 == null) {
			return 0;
		} else if (this.aBoolean301) {
			@Pc(27) Class4 local27 = this.aClass244_29.method5963();
			return local27 == null ? 0 : (int) local27.aLong268;
		} else {
			return this.aClass75_1.anInt2303;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Lclient!dw;")
	@Override
	public Class75 method3509() {
		if (this.aClass75_1 != null) {
			return this.aClass75_1;
		}
		if (this.aClass4_Sub5_Sub3_1 == null) {
			if (this.aClass329_1.method7767()) {
				return null;
			}
			this.aClass4_Sub5_Sub3_1 = this.aClass329_1.method7772(this.anInt3931, 255, true, (byte) 0);
		}
		if (this.aClass4_Sub5_Sub3_1.aBoolean279) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass4_Sub5_Sub3_1.method2841();
		if (this.aClass4_Sub5_Sub3_1 instanceof Class4_Sub5_Sub3_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass75_1 = new Class75(local43, this.anInt3934, this.aByteArray53);
				if (this.anInt3924 != this.aClass75_1.anInt2305) {
					throw new RuntimeException();
				}
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass75_1 = null;
				if (this.aClass329_1.method7767()) {
					this.aClass4_Sub5_Sub3_1 = null;
				} else {
					this.aClass4_Sub5_Sub3_1 = this.aClass329_1.method7772(this.anInt3931, 255, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass75_1 = new Class75(local43, this.anInt3934, this.aByteArray53);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass329_1.method7763();
				this.aClass75_1 = null;
				if (this.aClass329_1.method7767()) {
					this.aClass4_Sub5_Sub3_1 = null;
				} else {
					this.aClass4_Sub5_Sub3_1 = this.aClass329_1.method7772(this.anInt3931, 255, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass345_3 != null) {
				this.aClass269_1.method6532(this.aClass345_3, local43, this.anInt3931);
			}
		}
		this.aClass4_Sub5_Sub3_1 = null;
		if (this.aClass345_2 != null) {
			this.aByteArray52 = new byte[this.aClass75_1.anInt2306];
			this.anInt3930 = 0;
		}
		return this.aClass75_1;
	}

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(BI)V")
	@Override
	public void method3517(@OriginalArg(1) int arg0) {
		if (this.aClass345_2 == null) {
			return;
		}
		for (@Pc(22) Class4 local22 = this.aClass244_28.method5963(); local22 != null; local22 = this.aClass244_28.method5965()) {
			if ((long) arg0 == local22.aLong268) {
				return;
			}
		}
		@Pc(46) Class4 local46 = new Class4();
		local46.aLong268 = arg0;
		this.aClass244_28.method5960(local46);
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)I")
	public int method3521() {
		if (this.method3509() == null) {
			return this.aClass4_Sub5_Sub3_1 == null ? 0 : this.aClass4_Sub5_Sub3_1.method2840();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)Lclient!tg;")
	private Class4_Sub5_Sub3 method3522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub5_Sub3 local13 = (Class4_Sub5_Sub3) this.aClass350_17.method8207((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean278 && local13.aBoolean279) {
			local13.method8379();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass345_2 == null || this.aByteArray52[arg0] == -1) {
					if (this.aClass329_1.method7767()) {
						return null;
					}
					local13 = this.aClass329_1.method7772(arg0, this.anInt3931, true, (byte) 2);
				} else {
					local13 = this.aClass269_1.method6530(arg0, this.aClass345_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass345_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass269_1.method6535(arg0, this.aClass345_2);
			} else if (arg1 == 2) {
				if (this.aClass345_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray52[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass329_1.method7762()) {
					return null;
				}
				local13 = this.aClass329_1.method7772(arg0, this.anInt3931, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass350_17.method8199((long) arg0, local13);
		}
		if (local13.aBoolean279) {
			return null;
		}
		@Pc(164) byte[] local164 = local13.method2841();
		@Pc(191) int local191;
		@Pc(222) byte[] local222;
		@Pc(231) byte[] local231;
		@Pc(233) int local233;
		@Pc(291) Class4_Sub5_Sub3_Sub1 local291;
		if (!(local13 instanceof Class4_Sub5_Sub3_Sub2)) {
			try {
				if (local164 == null || local164.length <= 2) {
					throw new RuntimeException();
				}
				Static279.aCRC32_1.reset();
				Static279.aCRC32_1.update(local164, 0, local164.length - 2);
				local191 = (int) Static279.aCRC32_1.getValue();
				if (local191 != this.aClass75_1.anIntArray95[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass75_1.aByteArrayArray7 != null && this.aClass75_1.aByteArrayArray7[arg0] != null) {
					local222 = this.aClass75_1.aByteArrayArray7[arg0];
					local231 = Static560.method8057(local164.length - 2, local164, 0);
					for (local233 = 0; local233 < 64; local233++) {
						if (local222[local233] != local231[local233]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass329_1.anInt9523 = 0;
				this.aClass329_1.anInt9522 = 0;
			} catch (@Pc(266) RuntimeException local266) {
				this.aClass329_1.method7763();
				local13.method8379();
				if (local13.aBoolean278 && !this.aClass329_1.method7767()) {
					local291 = this.aClass329_1.method7772(arg0, this.anInt3931, true, (byte) 2);
					this.aClass350_17.method8199((long) arg0, local291);
				}
				return null;
			}
			local164[local164.length - 2] = (byte) (this.aClass75_1.anIntArray94[arg0] >>> 8);
			local164[local164.length - 1] = (byte) this.aClass75_1.anIntArray94[arg0];
			if (this.aClass345_2 != null) {
				this.aClass269_1.method6532(this.aClass345_2, local164, arg0);
				if (this.aByteArray52[arg0] != 1) {
					this.anInt3930++;
					this.aByteArray52[arg0] = 1;
				}
			}
			if (!local13.aBoolean278) {
				local13.method8379();
			}
			return local13;
		}
		try {
			if (local164 == null || local164.length <= 2) {
				throw new RuntimeException();
			}
			Static279.aCRC32_1.reset();
			Static279.aCRC32_1.update(local164, 0, local164.length - 2);
			local191 = (int) Static279.aCRC32_1.getValue();
			if (local191 != this.aClass75_1.anIntArray95[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass75_1.aByteArrayArray7 != null && this.aClass75_1.aByteArrayArray7[arg0] != null) {
				local222 = this.aClass75_1.aByteArrayArray7[arg0];
				local231 = Static560.method8057(local164.length - 2, local164, 0);
				for (local233 = 0; local233 < 64; local233++) {
					if (local231[local233] != local222[local233]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(468) int local468 = (local164[local164.length - 1] & 0xFF) + ((local164[local164.length - 2] & 0xFF) << 8);
			if (local468 != (this.aClass75_1.anIntArray94[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray52[arg0] != 1) {
				this.anInt3930++;
				this.aByteArray52[arg0] = 1;
			}
			if (!local13.aBoolean278) {
				local13.method8379();
			}
			return local13;
		} catch (@Pc(509) Exception local509) {
			this.aByteArray52[arg0] = -1;
			local13.method8379();
			if (local13.aBoolean278 && !this.aClass329_1.method7767()) {
				local291 = this.aClass329_1.method7772(arg0, this.anInt3931, true, (byte) 2);
				this.aClass350_17.method8199((long) arg0, local291);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)V")
	public void method3523() {
		if (this.aClass345_2 != null) {
			this.aBoolean300 = true;
			if (this.aClass244_29 == null) {
				this.aClass244_29 = new Class244();
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "(B)I")
	public int method3525() {
		return this.aClass75_1 == null ? 0 : this.aClass75_1.anInt2303;
	}

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "(I)I")
	public int method3526() {
		return this.anInt3930;
	}

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "(B)V")
	public void method3527() {
		if (this.aClass244_29 != null) {
			if (this.method3509() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class4 local23;
			@Pc(29) int local29;
			@Pc(110) Class4 local110;
			if (this.aBoolean301) {
				local18 = true;
				for (local23 = this.aClass244_29.method5963(); local23 != null; local23 = this.aClass244_29.method5965()) {
					local29 = (int) local23.aLong268;
					if (this.aByteArray52[local29] == 0) {
						this.method3522(local29, 1);
					}
					if (this.aByteArray52[local29] == 0) {
						local18 = false;
					} else {
						local23.method8379();
					}
				}
				while (this.aClass75_1.anIntArray96.length > this.anInt3941) {
					if (this.aClass75_1.anIntArray96[this.anInt3941] == 0) {
						this.anInt3941++;
					} else {
						if (this.aClass269_1.anInt7839 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray52[this.anInt3941] == 0) {
							this.method3522(this.anInt3941, 1);
						}
						if (this.aByteArray52[this.anInt3941] == 0) {
							local110 = new Class4();
							local110.aLong268 = this.anInt3941;
							this.aClass244_29.method5960(local110);
							local18 = false;
						}
						this.anInt3941++;
					}
				}
				if (local18) {
					this.aBoolean301 = false;
					this.anInt3941 = 0;
				}
			} else if (this.aBoolean300) {
				local18 = true;
				for (local23 = this.aClass244_29.method5963(); local23 != null; local23 = this.aClass244_29.method5965()) {
					local29 = (int) local23.aLong268;
					if (this.aByteArray52[local29] != 1) {
						this.method3522(local29, 2);
					}
					if (this.aByteArray52[local29] == 1) {
						local23.method8379();
					} else {
						local18 = false;
					}
				}
				while (this.anInt3941 < this.aClass75_1.anIntArray96.length) {
					if (this.aClass75_1.anIntArray96[this.anInt3941] == 0) {
						this.anInt3941++;
					} else {
						if (this.aClass329_1.method7762()) {
							local18 = false;
							break;
						}
						if (this.aByteArray52[this.anInt3941] != 1) {
							this.method3522(this.anInt3941, 2);
						}
						if (this.aByteArray52[this.anInt3941] != 1) {
							local110 = new Class4();
							local110.aLong268 = this.anInt3941;
							local18 = false;
							this.aClass244_29.method5960(local110);
						}
						this.anInt3941++;
					}
				}
				if (local18) {
					this.anInt3941 = 0;
					this.aBoolean300 = false;
				}
			} else {
				this.aClass244_29 = null;
			}
		}
		if (!this.aBoolean302 || Static574.method8210() < this.aLong117) {
			return;
		}
		for (@Pc(315) Class4_Sub5_Sub3 local315 = (Class4_Sub5_Sub3) this.aClass350_17.method8198(); local315 != null; local315 = (Class4_Sub5_Sub3) this.aClass350_17.method8205()) {
			if (!local315.aBoolean279) {
				if (local315.aBoolean277) {
					if (!local315.aBoolean278) {
						throw new RuntimeException();
					}
					local315.method8379();
				} else {
					local315.aBoolean277 = true;
				}
			}
		}
		this.aLong117 = Static574.method8210() + 1000L;
	}

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "(I)V")
	public void method3528() {
		if (this.aClass244_29 == null || this.method3509() == null) {
			return;
		}
		for (@Pc(19) Class4 local19 = this.aClass244_28.method5963(); local19 != null; local19 = this.aClass244_28.method5965()) {
			@Pc(27) int local27 = (int) local19.aLong268;
			if (local27 < 0 || local27 >= this.aClass75_1.anInt2306 || this.aClass75_1.anIntArray96[local27] == 0) {
				local19.method8379();
			} else {
				if (this.aByteArray52[local27] == 0) {
					this.method3522(local27, 1);
				}
				if (this.aByteArray52[local27] == -1) {
					this.method3522(local27, 2);
				}
				if (this.aByteArray52[local27] == 1) {
					local19.method8379();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(BI)[B")
	@Override
	public byte[] method3512(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub5_Sub3 local15 = this.method3522(arg0, 0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method2841();
			local15.method8379();
			return local23;
		}
	}
}
