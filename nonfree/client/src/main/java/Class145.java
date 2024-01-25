import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gka")
public final class Class145 {

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "I")
	public int anInt3597;

	@OriginalMember(owner = "client!gka", name = "c", descriptor = "Lclient!sea;")
	public Class321 aClass321_1;

	@OriginalMember(owner = "client!gka", name = "e", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!gka", name = "i", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!gka", name = "j", descriptor = "I")
	public int anInt3601;

	@OriginalMember(owner = "client!gka", name = "l", descriptor = "I")
	private int anInt3603;

	@OriginalMember(owner = "client!gka", name = "p", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gka", name = "r", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!gka", name = "s", descriptor = "I")
	public int anInt3608;

	@OriginalMember(owner = "client!gka", name = "t", descriptor = "I")
	public int anInt3609;

	@OriginalMember(owner = "client!gka", name = "w", descriptor = "I")
	private int anInt3611;

	@OriginalMember(owner = "client!gka", name = "C", descriptor = "I")
	public int anInt3616;

	@OriginalMember(owner = "client!gka", name = "D", descriptor = "I")
	private int anInt3617;

	@OriginalMember(owner = "client!gka", name = "F", descriptor = "I")
	public int anInt3619;

	@OriginalMember(owner = "client!gka", name = "H", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!gka", name = "M", descriptor = "I")
	public int anInt3623;

	@OriginalMember(owner = "client!gka", name = "X", descriptor = "Lclient!cja;")
	private Class62 aClass62_19;

	@OriginalMember(owner = "client!gka", name = "bb", descriptor = "I")
	private int anInt3632;

	@OriginalMember(owner = "client!gka", name = "f", descriptor = "I")
	private int anInt3598 = -1;

	@OriginalMember(owner = "client!gka", name = "g", descriptor = "I")
	public int anInt3599 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gka", name = "v", descriptor = "I")
	public int anInt3610 = 0;

	@OriginalMember(owner = "client!gka", name = "u", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray27 = new String[5];

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "I")
	private int anInt3596 = -1;

	@OriginalMember(owner = "client!gka", name = "G", descriptor = "I")
	public int anInt3620 = -1;

	@OriginalMember(owner = "client!gka", name = "m", descriptor = "I")
	public int anInt3604 = -1;

	@OriginalMember(owner = "client!gka", name = "K", descriptor = "I")
	private int anInt3622 = -1;

	@OriginalMember(owner = "client!gka", name = "V", descriptor = "Z")
	public boolean aBoolean288 = true;

	@OriginalMember(owner = "client!gka", name = "I", descriptor = "I")
	public int anInt3621 = -1;

	@OriginalMember(owner = "client!gka", name = "x", descriptor = "I")
	public int anInt3612 = -1;

	@OriginalMember(owner = "client!gka", name = "d", descriptor = "Z")
	public boolean aBoolean285 = true;

	@OriginalMember(owner = "client!gka", name = "Y", descriptor = "I")
	public int anInt3629 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gka", name = "W", descriptor = "I")
	public int anInt3628 = -1;

	@OriginalMember(owner = "client!gka", name = "o", descriptor = "I")
	public int anInt3606 = -1;

	@OriginalMember(owner = "client!gka", name = "ab", descriptor = "I")
	public int anInt3631 = -1;

	@OriginalMember(owner = "client!gka", name = "z", descriptor = "I")
	private int anInt3614 = -1;

	@OriginalMember(owner = "client!gka", name = "cb", descriptor = "I")
	private int anInt3633 = -1;

	@OriginalMember(owner = "client!gka", name = "B", descriptor = "Z")
	public boolean aBoolean286 = false;

	@OriginalMember(owner = "client!gka", name = "U", descriptor = "I")
	public int anInt3627 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gka", name = "J", descriptor = "Z")
	public boolean aBoolean287 = true;

	@OriginalMember(owner = "client!gka", name = "gb", descriptor = "I")
	public int anInt3637 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3150(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_19 == null) {
			return arg0;
		} else {
			@Pc(27) Class3_Sub40 local27 = (Class3_Sub40) this.aClass62_19.method1682((long) arg1);
			return local27 == null ? arg0 : local27.aString100;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)V")
	public void method3151() {
		if (this.anIntArray249 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray249.length; local18 += 2) {
			if (this.anInt3599 > this.anIntArray249[local18]) {
				this.anInt3599 = this.anIntArray249[local18];
			} else if (this.anInt3637 < this.anIntArray249[local18]) {
				this.anInt3637 = this.anIntArray249[local18];
			}
			if (this.anIntArray249[local18 + 1] < this.anInt3627) {
				this.anInt3627 = this.anIntArray249[local18 + 1];
			} else if (this.anInt3629 < this.anIntArray249[local18 + 1]) {
				this.anInt3629 = this.anIntArray249[local18 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!fca;BI)V")
	private void method3152(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3606 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt3620 = arg0.method4858();
		} else if (arg1 == 3) {
			this.aString44 = arg0.method4847();
		} else if (arg1 == 4) {
			this.anInt3601 = arg0.method4862();
		} else if (arg1 == 5) {
			this.anInt3612 = arg0.method4862();
		} else if (arg1 == 6) {
			this.anInt3610 = arg0.method4888();
		} else {
			@Pc(44) int local44;
			if (arg1 == 7) {
				local44 = arg0.method4888();
				if ((local44 & 0x1) == 0) {
					this.aBoolean285 = false;
				}
				if ((local44 & 0x2) == 2) {
					this.aBoolean286 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean287 = arg0.method4888() == 1;
			} else if (arg1 == 9) {
				this.anInt3598 = arg0.method4858();
				if (this.anInt3598 == 65535) {
					this.anInt3598 = -1;
				}
				this.anInt3633 = arg0.method4858();
				if (this.anInt3633 == 65535) {
					this.anInt3633 = -1;
				}
				this.anInt3603 = arg0.method4868();
				this.anInt3617 = arg0.method4868();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray27[arg1 - 10] = arg0.method4847();
			} else {
				@Pc(251) int local251;
				@Pc(276) int local276;
				if (arg1 == 15) {
					local44 = arg0.method4888();
					this.anIntArray249 = new int[local44 * 2];
					for (local251 = 0; local251 < local44 * 2; local251++) {
						this.anIntArray249[local251] = arg0.method4869();
					}
					this.anInt3616 = arg0.method4868();
					@Pc(386) int local386 = arg0.method4888();
					this.anIntArray250 = new int[local386];
					for (local276 = 0; local276 < this.anIntArray250.length; local276++) {
						this.anIntArray250[local276] = arg0.method4868();
					}
					this.aByteArray28 = new byte[local44];
					for (@Pc(419) int local419 = 0; local419 < local44; local419++) {
						this.aByteArray28[local419] = arg0.method4861();
					}
				} else if (arg1 == 16) {
					this.aBoolean288 = false;
				} else if (arg1 == 17) {
					this.aString45 = arg0.method4847();
				} else if (arg1 == 18) {
					this.anInt3614 = arg0.method4858();
				} else if (arg1 == 19) {
					this.anInt3628 = arg0.method4858();
				} else if (arg1 == 20) {
					this.anInt3622 = arg0.method4858();
					if (this.anInt3622 == 65535) {
						this.anInt3622 = -1;
					}
					this.anInt3596 = arg0.method4858();
					if (this.anInt3596 == 65535) {
						this.anInt3596 = -1;
					}
					this.anInt3632 = arg0.method4868();
					this.anInt3611 = arg0.method4868();
				} else if (arg1 == 21) {
					this.anInt3609 = arg0.method4868();
				} else if (arg1 == 22) {
					this.anInt3623 = arg0.method4868();
				} else if (arg1 == 23) {
					this.anInt3621 = arg0.method4888();
					this.anInt3631 = arg0.method4888();
					this.anInt3604 = arg0.method4888();
				} else if (arg1 == 24) {
					this.anInt3597 = arg0.method4869();
					this.anInt3608 = arg0.method4869();
				} else if (arg1 == 249) {
					local44 = arg0.method4888();
					if (this.aClass62_19 == null) {
						local251 = Static527.method7377(local44);
						this.aClass62_19 = new Class62(local251);
					}
					for (local251 = 0; local251 < local44; local251++) {
						@Pc(272) boolean local272 = arg0.method4888() == 1;
						local276 = arg0.method4862();
						@Pc(285) Class3 local285;
						if (local272) {
							local285 = new Class3_Sub40(arg0.method4847());
						} else {
							local285 = new Class3_Sub53(arg0.method4868());
						}
						this.aClass62_19.method1686((long) local276, local285);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(BII)I")
	public int method3153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_19 == null) {
			return arg0;
		} else {
			@Pc(22) Class3_Sub53 local22 = (Class3_Sub53) this.aClass62_19.method1682((long) arg1);
			return local22 == null ? arg0 : local22.anInt10023;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILclient!lw;)Z")
	public boolean method3156(@OriginalArg(1) Interface15 arg0) {
		@Pc(18) int local18;
		if (this.anInt3633 == -1) {
			if (this.anInt3598 == -1) {
				return true;
			}
			local18 = arg0.method1430(this.anInt3598);
		} else {
			local18 = arg0.method1429(this.anInt3633);
		}
		if (this.anInt3603 > local18 || local18 > this.anInt3617) {
			return false;
		}
		@Pc(71) int local71;
		if (this.anInt3596 == -1) {
			if (this.anInt3622 == -1) {
				return true;
			}
			local71 = arg0.method1430(this.anInt3622);
		} else {
			local71 = arg0.method1429(this.anInt3596);
		}
		return this.anInt3632 <= local71 && this.anInt3611 >= local71;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method3157(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method3152(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(BLclient!ha;)Lclient!nf;")
	public Class102 method3159(@OriginalArg(1) Class16 arg0) {
		@Pc(20) Class102 local20 = (Class102) this.aClass321_1.aClass279_49.method6631((long) (this.anInt3614 | 0x20000 | arg0.anInt9594 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass321_1.aClass143_123.method3130(this.anInt3614);
		@Pc(40) Class150 local40 = Static683.method3275(this.aClass321_1.aClass143_123, this.anInt3614, 0);
		if (local40 != null) {
			local20 = arg0.method8132(local40, true);
			this.aClass321_1.aClass279_49.method6635(local20, (long) (this.anInt3614 | 0x20000 | arg0.anInt9594 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!ha;ZZ)Lclient!nf;")
	public Class102 method3160(@OriginalArg(0) Class16 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt3620 : this.anInt3606;
		@Pc(18) int local18 = local11 | arg0.anInt9594 << 29;
		@Pc(27) Class102 local27 = (Class102) this.aClass321_1.aClass279_49.method6631((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass321_1.aClass143_123.method3130(local11)) {
			@Pc(47) Class150 local47 = Static683.method3275(this.aClass321_1.aClass143_123, local11, 0);
			if (local47 != null) {
				local27 = arg0.method8132(local47, true);
				this.aClass321_1.aClass279_49.method6635(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}
}
