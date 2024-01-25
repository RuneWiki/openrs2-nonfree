import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class229_Sub1 extends Class229 {

	@OriginalMember(owner = "client!mha", name = "f", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!mha", name = "G", descriptor = "Lclient!wk;")
	private Class390 aClass390_1;

	@OriginalMember(owner = "client!mha", name = "I", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!mha", name = "E", descriptor = "I")
	private int anInt6277 = 0;

	@OriginalMember(owner = "client!mha", name = "w", descriptor = "Lclient!tca;")
	private final Class333 aClass333_24 = new Class333(16);

	@OriginalMember(owner = "client!mha", name = "L", descriptor = "I")
	private int anInt6280 = 0;

	@OriginalMember(owner = "client!mha", name = "H", descriptor = "Lclient!qw;")
	private final Class302 aClass302_41 = new Class302();

	@OriginalMember(owner = "client!mha", name = "N", descriptor = "J")
	private long aLong171 = 0L;

	@OriginalMember(owner = "client!mha", name = "z", descriptor = "I")
	private final int anInt6274;

	@OriginalMember(owner = "client!mha", name = "l", descriptor = "Lclient!naa;")
	private final Class241 aClass241_2;

	@OriginalMember(owner = "client!mha", name = "M", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!mha", name = "J", descriptor = "Lclient!qw;")
	private Class302 aClass302_42;

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "Lclient!cr;")
	private final Class66 aClass66_2;

	@OriginalMember(owner = "client!mha", name = "O", descriptor = "Z")
	private final boolean aBoolean440;

	@OriginalMember(owner = "client!mha", name = "q", descriptor = "I")
	private final int anInt6268;

	@OriginalMember(owner = "client!mha", name = "u", descriptor = "I")
	private final int anInt6271;

	@OriginalMember(owner = "client!mha", name = "A", descriptor = "[B")
	private final byte[] aByteArray55;

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "Lclient!ff;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!mha", name = "y", descriptor = "Lclient!naa;")
	private final Class241 aClass241_3;

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "Lclient!uc;")
	private Class3_Sub5_Sub2 aClass3_Sub5_Sub2_1;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(ILclient!naa;Lclient!naa;Lclient!ff;Lclient!cr;I[BIZ)V")
	public Class229_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class241 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class66 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt6274 = arg0;
		this.aClass241_2 = arg1;
		if (this.aClass241_2 == null) {
			this.aBoolean439 = false;
		} else {
			this.aBoolean439 = true;
			this.aClass302_42 = new Class302();
		}
		this.aClass66_2 = arg4;
		this.aBoolean440 = arg8;
		this.anInt6268 = arg5;
		this.anInt6271 = arg7;
		this.aByteArray55 = arg6;
		this.aClass113_1 = arg3;
		this.aClass241_3 = arg2;
		if (this.aClass241_3 != null) {
			this.aClass3_Sub5_Sub2_1 = this.aClass66_2.method1513(this.aClass241_3, this.anInt6274);
		}
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V")
	public void method5282() {
		if (this.aClass302_42 != null) {
			if (this.method5280() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class3 local23;
			@Pc(29) int local29;
			@Pc(111) Class3 local111;
			if (this.aBoolean439) {
				local18 = true;
				for (local23 = this.aClass302_42.method6603(); local23 != null; local23 = this.aClass302_42.method6605()) {
					local29 = (int) local23.aLong313;
					if (this.aByteArray54[local29] == 0) {
						this.method5289(1, local29);
					}
					if (this.aByteArray54[local29] == 0) {
						local18 = false;
					} else {
						local23.method9034();
					}
				}
				while (this.aClass390_1.anIntArray620.length > this.anInt6280) {
					if (this.aClass390_1.anIntArray620[this.anInt6280] == 0) {
						this.anInt6280++;
					} else {
						if (this.aClass66_2.anInt1858 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray54[this.anInt6280] == 0) {
							this.method5289(1, this.anInt6280);
						}
						if (this.aByteArray54[this.anInt6280] == 0) {
							local111 = new Class3();
							local111.aLong313 = (long) this.anInt6280;
							local18 = false;
							this.aClass302_42.method6613(local111);
						}
						this.anInt6280++;
					}
				}
				if (local18) {
					this.aBoolean439 = false;
					this.anInt6280 = 0;
				}
			} else if (this.aBoolean438) {
				local18 = true;
				for (local23 = this.aClass302_42.method6603(); local23 != null; local23 = this.aClass302_42.method6605()) {
					local29 = (int) local23.aLong313;
					if (this.aByteArray54[local29] != 1) {
						this.method5289(2, local29);
					}
					if (this.aByteArray54[local29] == 1) {
						local23.method9034();
					} else {
						local18 = false;
					}
				}
				while (this.anInt6280 < this.aClass390_1.anIntArray620.length) {
					if (this.aClass390_1.anIntArray620[this.anInt6280] == 0) {
						this.anInt6280++;
					} else {
						if (this.aClass113_1.method2597()) {
							local18 = false;
							break;
						}
						if (this.aByteArray54[this.anInt6280] != 1) {
							this.method5289(2, this.anInt6280);
						}
						if (this.aByteArray54[this.anInt6280] != 1) {
							local111 = new Class3();
							local111.aLong313 = (long) this.anInt6280;
							this.aClass302_42.method6613(local111);
							local18 = false;
						}
						this.anInt6280++;
					}
				}
				if (local18) {
					this.anInt6280 = 0;
					this.aBoolean438 = false;
				}
			} else {
				this.aClass302_42 = null;
			}
		}
		if (!this.aBoolean440 || this.aLong171 > Static15.method380()) {
			return;
		}
		for (@Pc(315) Class3_Sub5_Sub2 local315 = (Class3_Sub5_Sub2) this.aClass333_24.method7490(); local315 != null; local315 = (Class3_Sub5_Sub2) this.aClass333_24.method7487()) {
			if (!local315.aBoolean541) {
				if (local315.aBoolean542) {
					if (!local315.aBoolean543) {
						throw new RuntimeException();
					}
					local315.method9034();
				} else {
					local315.aBoolean542 = true;
				}
			}
		}
		this.aLong171 = Static15.method380() + 1000L;
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(Z)I")
	public int method5283() {
		return this.aClass390_1 == null ? 0 : this.aClass390_1.anInt10820;
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(Z)I")
	public int method5284() {
		return this.anInt6277;
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(Z)V")
	public void method5285() {
		if (this.aClass302_42 == null || this.method5280() == null) {
			return;
		}
		for (@Pc(19) Class3 local19 = this.aClass302_41.method6603(); local19 != null; local19 = this.aClass302_41.method6605()) {
			@Pc(25) int local25 = (int) local19.aLong313;
			if (local25 < 0 || local25 >= this.aClass390_1.anInt10821 || this.aClass390_1.anIntArray620[local25] == 0) {
				local19.method9034();
			} else {
				if (this.aByteArray54[local25] == 0) {
					this.method5289(1, local25);
				}
				if (this.aByteArray54[local25] == -1) {
					this.method5289(2, local25);
				}
				if (this.aByteArray54[local25] == 1) {
					local19.method9034();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
	public void method5286() {
		if (this.aClass241_2 != null) {
			this.aBoolean438 = true;
			if (this.aClass302_42 == null) {
				this.aClass302_42 = new Class302();
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)Lclient!wk;")
	@Override
	public Class390 method5280() {
		if (this.aClass390_1 != null) {
			return this.aClass390_1;
		}
		if (this.aClass3_Sub5_Sub2_1 == null) {
			if (this.aClass113_1.method2596()) {
				return null;
			}
			this.aClass3_Sub5_Sub2_1 = this.aClass113_1.method2592(this.anInt6274, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub5_Sub2_1.aBoolean541) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass3_Sub5_Sub2_1.method6440();
		if (this.aClass3_Sub5_Sub2_1 instanceof Class3_Sub5_Sub2_Sub1) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass390_1 = new Class390(local49, this.anInt6268, this.aByteArray55);
				if (this.aClass390_1.anInt10823 != this.anInt6271) {
					throw new RuntimeException();
				}
			} catch (@Pc(147) RuntimeException local147) {
				this.aClass390_1 = null;
				if (this.aClass113_1.method2596()) {
					this.aClass3_Sub5_Sub2_1 = null;
				} else {
					this.aClass3_Sub5_Sub2_1 = this.aClass113_1.method2592(this.anInt6274, 255, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass390_1 = new Class390(local49, this.anInt6268, this.aByteArray55);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass113_1.method2605();
				this.aClass390_1 = null;
				if (this.aClass113_1.method2596()) {
					this.aClass3_Sub5_Sub2_1 = null;
				} else {
					this.aClass3_Sub5_Sub2_1 = this.aClass113_1.method2592(this.anInt6274, 255, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass241_3 != null) {
				this.aClass66_2.method1517(this.aClass241_3, local49, this.anInt6274);
			}
		}
		this.aClass3_Sub5_Sub2_1 = null;
		if (this.aClass241_2 != null) {
			this.anInt6277 = 0;
			this.aByteArray54 = new byte[this.aClass390_1.anInt10821];
		}
		return this.aClass390_1;
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(BI)I")
	@Override
	public int method5281(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub5_Sub2 local11 = (Class3_Sub5_Sub2) this.aClass333_24.method7489((long) arg0);
		return local11 == null ? 0 : local11.method6439();
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method5278(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub5_Sub2 local9 = this.method5289(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local9.method6440();
			local9.method9034();
			return local26;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(BI)V")
	@Override
	public void method5279(@OriginalArg(1) int arg0) {
		if (this.aClass241_2 == null) {
			return;
		}
		for (@Pc(20) Class3 local20 = this.aClass302_41.method6603(); local20 != null; local20 = this.aClass302_41.method6605()) {
			if ((long) arg0 == local20.aLong313) {
				return;
			}
		}
		@Pc(40) Class3 local40 = new Class3();
		local40.aLong313 = (long) arg0;
		this.aClass302_41.method6613(local40);
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(B)I")
	public int method5288() {
		if (this.aClass390_1 == null) {
			return 0;
		} else if (this.aBoolean439) {
			@Pc(20) Class3 local20 = this.aClass302_42.method6603();
			return local20 == null ? 0 : (int) local20.aLong313;
		} else {
			return this.aClass390_1.anInt10820;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZII)Lclient!uc;")
	private Class3_Sub5_Sub2 method5289(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub5_Sub2 local13 = (Class3_Sub5_Sub2) this.aClass333_24.method7489((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean543 && local13.aBoolean541) {
			local13.method9034();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass241_2 == null || this.aByteArray54[arg1] == -1) {
					if (this.aClass113_1.method2596()) {
						return null;
					}
					local13 = this.aClass113_1.method2592(arg1, this.anInt6274, (byte) 2, true);
				} else {
					local13 = this.aClass66_2.method1513(this.aClass241_2, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass241_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass66_2.method1516(this.aClass241_2, arg1);
			} else if (arg0 == 2) {
				if (this.aClass241_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray54[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass113_1.method2597()) {
					return null;
				}
				local13 = this.aClass113_1.method2592(arg1, this.anInt6274, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass333_24.method7488((long) arg1, local13);
		}
		if (local13.aBoolean541) {
			return null;
		}
		@Pc(157) byte[] local157 = local13.method6440();
		@Pc(184) int local184;
		@Pc(211) byte[] local211;
		@Pc(220) byte[] local220;
		@Pc(222) int local222;
		@Pc(276) Class3_Sub5_Sub2_Sub2 local276;
		if (!(local13 instanceof Class3_Sub5_Sub2_Sub1)) {
			try {
				if (local157 == null || local157.length <= 2) {
					throw new RuntimeException();
				}
				Static223.aCRC32_1.reset();
				Static223.aCRC32_1.update(local157, 0, local157.length - 2);
				local184 = (int) Static223.aCRC32_1.getValue();
				if (this.aClass390_1.anIntArray621[arg1] != local184) {
					throw new RuntimeException();
				}
				if (this.aClass390_1.aByteArrayArray27 != null && this.aClass390_1.aByteArrayArray27[arg1] != null) {
					local211 = this.aClass390_1.aByteArrayArray27[arg1];
					local220 = Static318.method4562(local157, local157.length - 2, 0);
					for (local222 = 0; local222 < 64; local222++) {
						if (local220[local222] != local211[local222]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass113_1.anInt3005 = 0;
				this.aClass113_1.anInt3006 = 0;
			} catch (@Pc(251) RuntimeException local251) {
				this.aClass113_1.method2605();
				local13.method9034();
				if (local13.aBoolean543 && !this.aClass113_1.method2596()) {
					local276 = this.aClass113_1.method2592(arg1, this.anInt6274, (byte) 2, true);
					this.aClass333_24.method7488((long) arg1, local276);
				}
				return null;
			}
			local157[local157.length - 2] = (byte) (this.aClass390_1.anIntArray622[arg1] >>> 8);
			local157[local157.length - 1] = (byte) this.aClass390_1.anIntArray622[arg1];
			if (this.aClass241_2 != null) {
				this.aClass66_2.method1517(this.aClass241_2, local157, arg1);
				if (this.aByteArray54[arg1] != 1) {
					this.anInt6277++;
					this.aByteArray54[arg1] = 1;
				}
			}
			if (!local13.aBoolean543) {
				local13.method9034();
			}
			return local13;
		}
		try {
			if (local157 == null || local157.length <= 2) {
				throw new RuntimeException();
			}
			Static223.aCRC32_1.reset();
			Static223.aCRC32_1.update(local157, 0, local157.length - 2);
			local184 = (int) Static223.aCRC32_1.getValue();
			if (local184 != this.aClass390_1.anIntArray621[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass390_1.aByteArrayArray27 != null && this.aClass390_1.aByteArrayArray27[arg1] != null) {
				local211 = this.aClass390_1.aByteArrayArray27[arg1];
				local220 = Static318.method4562(local157, local157.length - 2, 0);
				for (local222 = 0; local222 < 64; local222++) {
					if (local220[local222] != local211[local222]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(453) int local453 = (local157[local157.length - 1] & 0xFF) + ((local157[local157.length - 2] & 0xFF) << 8);
			if (local453 != (this.aClass390_1.anIntArray622[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray54[arg1] != 1) {
				this.anInt6277++;
				this.aByteArray54[arg1] = 1;
			}
			if (!local13.aBoolean543) {
				local13.method9034();
			}
			return local13;
		} catch (@Pc(496) Exception local496) {
			this.aByteArray54[arg1] = -1;
			local13.method9034();
			if (local13.aBoolean543 && !this.aClass113_1.method2596()) {
				local276 = this.aClass113_1.method2592(arg1, this.anInt6274, (byte) 2, true);
				this.aClass333_24.method7488((long) arg1, local276);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)I")
	public int method5291() {
		if (this.method5280() == null) {
			return this.aClass3_Sub5_Sub2_1 == null ? 0 : this.aClass3_Sub5_Sub2_1.method6439();
		} else {
			return 100;
		}
	}
}
