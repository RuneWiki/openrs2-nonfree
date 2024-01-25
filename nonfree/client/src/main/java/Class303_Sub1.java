import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class303_Sub1 extends Class303 {

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!uaa", name = "E", descriptor = "Lclient!ot;")
	private Class250 aClass250_2;

	@OriginalMember(owner = "client!uaa", name = "L", descriptor = "Z")
	private boolean aBoolean642;

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
	private int anInt8290 = 0;

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "Lclient!sl;")
	private final Class310 aClass310_37 = new Class310(16);

	@OriginalMember(owner = "client!uaa", name = "N", descriptor = "I")
	private int anInt8299 = 0;

	@OriginalMember(owner = "client!uaa", name = "K", descriptor = "Lclient!hga;")
	private final Class130 aClass130_54 = new Class130();

	@OriginalMember(owner = "client!uaa", name = "O", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!uaa", name = "o", descriptor = "Lclient!fj;")
	private final Class97 aClass97_3;

	@OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
	private final int anInt8289;

	@OriginalMember(owner = "client!uaa", name = "M", descriptor = "Z")
	private boolean aBoolean643;

	@OriginalMember(owner = "client!uaa", name = "J", descriptor = "Lclient!hga;")
	private Class130 aClass130_53;

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
	private final int anInt8280;

	@OriginalMember(owner = "client!uaa", name = "C", descriptor = "[B")
	private final byte[] aByteArray99;

	@OriginalMember(owner = "client!uaa", name = "P", descriptor = "Z")
	private final boolean aBoolean644;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
	private final int anInt8279;

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "Lclient!hca;")
	private final Class125 aClass125_2;

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "Lclient!ue;")
	private final Class331 aClass331_3;

	@OriginalMember(owner = "client!uaa", name = "D", descriptor = "Lclient!fj;")
	private final Class97 aClass97_4;

	@OriginalMember(owner = "client!uaa", name = "y", descriptor = "Lclient!ag;")
	private Class3_Sub3_Sub2 aClass3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(ILclient!fj;Lclient!fj;Lclient!ue;Lclient!hca;I[BIZ)V")
	public Class303_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class331 arg3, @OriginalArg(4) Class125 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass97_3 = arg1;
		this.anInt8289 = arg0;
		if (this.aClass97_3 == null) {
			this.aBoolean643 = false;
		} else {
			this.aBoolean643 = true;
			this.aClass130_53 = new Class130();
		}
		this.anInt8280 = arg7;
		this.aByteArray99 = arg6;
		this.aBoolean644 = arg8;
		this.anInt8279 = arg5;
		this.aClass125_2 = arg4;
		this.aClass331_3 = arg3;
		this.aClass97_4 = arg2;
		if (this.aClass97_4 != null) {
			this.aClass3_Sub3_Sub2_1 = this.aClass125_2.method3227(this.anInt8289, this.aClass97_4);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public void method6955() {
		if (this.aClass130_53 != null) {
			if (this.method6950() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class3 local23;
			@Pc(29) int local29;
			@Pc(114) Class3 local114;
			if (this.aBoolean643) {
				local18 = true;
				for (local23 = this.aClass130_53.method3543(); local23 != null; local23 = this.aClass130_53.method3551()) {
					local29 = (int) local23.aLong273;
					if (this.aByteArray98[local29] == 0) {
						this.method6963(local29, 1);
					}
					if (this.aByteArray98[local29] == 0) {
						local18 = false;
					} else {
						local23.method7812();
					}
				}
				while (this.aClass250_2.anIntArray537.length > this.anInt8299) {
					if (this.aClass250_2.anIntArray537[this.anInt8299] == 0) {
						this.anInt8299++;
					} else {
						if (this.aClass125_2.anInt3662 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray98[this.anInt8299] == 0) {
							this.method6963(this.anInt8299, 1);
						}
						if (this.aByteArray98[this.anInt8299] == 0) {
							local114 = new Class3();
							local114.aLong273 = this.anInt8299;
							local18 = false;
							this.aClass130_53.method3548(local114);
						}
						this.anInt8299++;
					}
				}
				if (local18) {
					this.anInt8299 = 0;
					this.aBoolean643 = false;
				}
			} else if (this.aBoolean642) {
				local18 = true;
				for (local23 = this.aClass130_53.method3543(); local23 != null; local23 = this.aClass130_53.method3551()) {
					local29 = (int) local23.aLong273;
					if (this.aByteArray98[local29] != 1) {
						this.method6963(local29, 2);
					}
					if (this.aByteArray98[local29] == 1) {
						local23.method7812();
					} else {
						local18 = false;
					}
				}
				while (this.aClass250_2.anIntArray537.length > this.anInt8299) {
					if (this.aClass250_2.anIntArray537[this.anInt8299] == 0) {
						this.anInt8299++;
					} else {
						if (this.aClass331_3.method7006()) {
							local18 = false;
							break;
						}
						if (this.aByteArray98[this.anInt8299] != 1) {
							this.method6963(this.anInt8299, 2);
						}
						if (this.aByteArray98[this.anInt8299] != 1) {
							local114 = new Class3();
							local114.aLong273 = this.anInt8299;
							this.aClass130_53.method3548(local114);
							local18 = false;
						}
						this.anInt8299++;
					}
				}
				if (local18) {
					this.anInt8299 = 0;
					this.aBoolean642 = false;
				}
			} else {
				this.aClass130_53 = null;
			}
		}
		if (!this.aBoolean644 || Static587.method7753() < this.aLong239) {
			return;
		}
		for (@Pc(316) Class3_Sub3_Sub2 local316 = (Class3_Sub3_Sub2) this.aClass310_37.method6602(); local316 != null; local316 = (Class3_Sub3_Sub2) this.aClass310_37.method6599()) {
			if (!local316.aBoolean507) {
				if (local316.aBoolean509) {
					if (!local316.aBoolean508) {
						throw new RuntimeException();
					}
					local316.method7812();
				} else {
					local316.aBoolean509 = true;
				}
			}
		}
		this.aLong239 = Static587.method7753() + 1000L;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V")
	@Override
	public void method6951(@OriginalArg(0) int arg0) {
		if (this.aClass97_3 == null) {
			return;
		}
		for (@Pc(14) Class3 local14 = this.aClass130_54.method3543(); local14 != null; local14 = this.aClass130_54.method3551()) {
			if (local14.aLong273 == (long) arg0) {
				return;
			}
		}
		@Pc(43) Class3 local43 = new Class3();
		local43.aLong273 = arg0;
		this.aClass130_54.method3548(local43);
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method6952(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub3_Sub2 local9 = this.method6963(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local9.method5364();
			local9.method7812();
			return local23;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	public void method6958() {
		if (this.aClass130_53 == null || this.method6950() == null) {
			return;
		}
		for (@Pc(25) Class3 local25 = this.aClass130_54.method3543(); local25 != null; local25 = this.aClass130_54.method3551()) {
			@Pc(31) int local31 = (int) local25.aLong273;
			if (local31 < 0 || local31 >= this.aClass250_2.anInt6696 || this.aClass250_2.anIntArray537[local31] == 0) {
				local25.method7812();
			} else {
				if (this.aByteArray98[local31] == 0) {
					this.method6963(local31, 1);
				}
				if (this.aByteArray98[local31] == -1) {
					this.method6963(local31, 2);
				}
				if (this.aByteArray98[local31] == 1) {
					local25.method7812();
				}
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(Z)I")
	public int method6959() {
		return this.aClass250_2 == null ? 0 : this.aClass250_2.anInt6693;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V")
	public void method6960() {
		if (this.aClass97_3 != null) {
			this.aBoolean642 = true;
			if (this.aClass130_53 == null) {
				this.aClass130_53 = new Class130();
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
	public int method6961() {
		return this.anInt8290;
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(B)I")
	public int method6962() {
		if (this.aClass250_2 == null) {
			return 0;
		} else if (this.aBoolean643) {
			@Pc(20) Class3 local20 = this.aClass130_53.method3543();
			return local20 == null ? 0 : (int) local20.aLong273;
		} else {
			return this.aClass250_2.anInt6693;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIB)Lclient!ag;")
	private Class3_Sub3_Sub2 method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class3_Sub3_Sub2 local18 = (Class3_Sub3_Sub2) this.aClass310_37.method6601((long) arg0);
		if (local18 != null && arg1 == 0 && !local18.aBoolean508 && local18.aBoolean507) {
			local18.method7812();
			local18 = null;
		}
		if (local18 == null) {
			if (arg1 == 0) {
				if (this.aClass97_3 == null || this.aByteArray98[arg0] == -1) {
					if (this.aClass331_3.method7005()) {
						return null;
					}
					local18 = this.aClass331_3.method7000((byte) 2, arg0, true, this.anInt8289);
				} else {
					local18 = this.aClass125_2.method3227(arg0, this.aClass97_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass97_3 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass125_2.method3232(arg0, this.aClass97_3);
			} else if (arg1 == 2) {
				if (this.aClass97_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray98[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass331_3.method7006()) {
					return null;
				}
				local18 = this.aClass331_3.method7000((byte) 2, arg0, false, this.anInt8289);
			} else {
				throw new RuntimeException();
			}
			this.aClass310_37.method6603(local18, (long) arg0);
		}
		if (local18.aBoolean507) {
			return null;
		}
		@Pc(158) byte[] local158 = local18.method5364();
		@Pc(185) int local185;
		@Pc(212) byte[] local212;
		@Pc(221) byte[] local221;
		@Pc(223) int local223;
		@Pc(275) Class3_Sub3_Sub2_Sub1 local275;
		if (!(local18 instanceof Class3_Sub3_Sub2_Sub2)) {
			try {
				if (local158 == null || local158.length <= 2) {
					throw new RuntimeException();
				}
				Static376.aCRC32_1.reset();
				Static376.aCRC32_1.update(local158, 0, local158.length - 2);
				local185 = (int) Static376.aCRC32_1.getValue();
				if (this.aClass250_2.anIntArray533[arg0] != local185) {
					throw new RuntimeException();
				}
				if (this.aClass250_2.aByteArrayArray21 != null && this.aClass250_2.aByteArrayArray21[arg0] != null) {
					local212 = this.aClass250_2.aByteArrayArray21[arg0];
					local221 = Static360.method5383(local158, 0, local158.length - 2);
					for (local223 = 0; local223 < 64; local223++) {
						if (local212[local223] != local221[local223]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass331_3.anInt8370 = 0;
				this.aClass331_3.anInt8369 = 0;
			} catch (@Pc(250) RuntimeException local250) {
				this.aClass331_3.method7014();
				local18.method7812();
				if (local18.aBoolean508 && !this.aClass331_3.method7005()) {
					local275 = this.aClass331_3.method7000((byte) 2, arg0, true, this.anInt8289);
					this.aClass310_37.method6603(local275, (long) arg0);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass250_2.anIntArray532[arg0] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass250_2.anIntArray532[arg0];
			if (this.aClass97_3 != null) {
				this.aClass125_2.method3229(arg0, local158, this.aClass97_3);
				if (this.aByteArray98[arg0] != 1) {
					this.anInt8290++;
					this.aByteArray98[arg0] = 1;
				}
			}
			if (!local18.aBoolean508) {
				local18.method7812();
			}
			return local18;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static376.aCRC32_1.reset();
			Static376.aCRC32_1.update(local158, 0, local158.length - 2);
			local185 = (int) Static376.aCRC32_1.getValue();
			if (this.aClass250_2.anIntArray533[arg0] != local185) {
				throw new RuntimeException();
			}
			if (this.aClass250_2.aByteArrayArray21 != null && this.aClass250_2.aByteArrayArray21[arg0] != null) {
				local212 = this.aClass250_2.aByteArrayArray21[arg0];
				local221 = Static360.method5383(local158, 0, local158.length - 2);
				for (local223 = 0; local223 < 64; local223++) {
					if (local221[local223] != local212[local223]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(454) int local454 = (local158[local158.length - 1] & 0xFF) + ((local158[local158.length - 2] & 0xFF) << 8);
			if (local454 != (this.aClass250_2.anIntArray532[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray98[arg0] != 1) {
				this.anInt8290++;
				this.aByteArray98[arg0] = 1;
			}
			if (!local18.aBoolean508) {
				local18.method7812();
			}
			return local18;
		} catch (@Pc(495) Exception local495) {
			this.aByteArray98[arg0] = -1;
			local18.method7812();
			if (local18.aBoolean508 && !this.aClass331_3.method7005()) {
				local275 = this.aClass331_3.method7000((byte) 2, arg0, true, this.anInt8289);
				this.aClass310_37.method6603(local275, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Lclient!ot;")
	@Override
	public Class250 method6950() {
		if (this.aClass250_2 != null) {
			return this.aClass250_2;
		}
		if (this.aClass3_Sub3_Sub2_1 == null) {
			if (this.aClass331_3.method7005()) {
				return null;
			}
			this.aClass3_Sub3_Sub2_1 = this.aClass331_3.method7000((byte) 0, this.anInt8289, true, 255);
		}
		if (this.aClass3_Sub3_Sub2_1.aBoolean507) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass3_Sub3_Sub2_1.method5364();
		if (this.aClass3_Sub3_Sub2_1 instanceof Class3_Sub3_Sub2_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass250_2 = new Class250(local48, this.anInt8279, this.aByteArray99);
				if (this.aClass250_2.anInt6692 != this.anInt8280) {
					throw new RuntimeException();
				}
			} catch (@Pc(146) RuntimeException local146) {
				this.aClass250_2 = null;
				if (this.aClass331_3.method7005()) {
					this.aClass3_Sub3_Sub2_1 = null;
				} else {
					this.aClass3_Sub3_Sub2_1 = this.aClass331_3.method7000((byte) 0, this.anInt8289, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass250_2 = new Class250(local48, this.anInt8279, this.aByteArray99);
			} catch (@Pc(70) RuntimeException local70) {
				this.aClass331_3.method7014();
				this.aClass250_2 = null;
				if (this.aClass331_3.method7005()) {
					this.aClass3_Sub3_Sub2_1 = null;
				} else {
					this.aClass3_Sub3_Sub2_1 = this.aClass331_3.method7000((byte) 0, this.anInt8289, true, 255);
				}
				return null;
			}
			if (this.aClass97_4 != null) {
				this.aClass125_2.method3229(this.anInt8289, local48, this.aClass97_4);
			}
		}
		this.aClass3_Sub3_Sub2_1 = null;
		if (this.aClass97_3 != null) {
			this.aByteArray98 = new byte[this.aClass250_2.anInt6696];
			this.anInt8290 = 0;
		}
		return this.aClass250_2;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)I")
	@Override
	public int method6953(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub3_Sub2 local17 = (Class3_Sub3_Sub2) this.aClass310_37.method6601((long) arg0);
		return local17 == null ? 0 : local17.method5363();
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)I")
	public int method6966() {
		if (this.method6950() == null) {
			return this.aClass3_Sub3_Sub2_1 == null ? 0 : this.aClass3_Sub3_Sub2_1.method5363();
		} else {
			return 100;
		}
	}
}
