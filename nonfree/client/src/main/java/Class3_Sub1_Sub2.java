import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!eb", name = "Db", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!eb", name = "Qb", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!eb", name = "Rb", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!eb", name = "bc", descriptor = "[I")
	public int[] anIntArray45;

	@OriginalMember(owner = "client!eb", name = "gc", descriptor = "[I")
	public int[] anIntArray46;

	@OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
	public int anInt717 = 0;

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "I")
	public int anInt728 = 0;

	@OriginalMember(owner = "client!eb", name = "jb", descriptor = "I")
	private int anInt719 = -1;

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	private int anInt729 = -1;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
	private int anInt730 = -1;

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "I")
	private int anInt724 = -1;

	@OriginalMember(owner = "client!eb", name = "Kb", descriptor = "I")
	public int anInt737 = 2000;

	@OriginalMember(owner = "client!eb", name = "Xb", descriptor = "I")
	private int anInt747 = -1;

	@OriginalMember(owner = "client!eb", name = "Lb", descriptor = "I")
	private int anInt738 = -1;

	@OriginalMember(owner = "client!eb", name = "Sb", descriptor = "I")
	private int anInt742 = 128;

	@OriginalMember(owner = "client!eb", name = "hb", descriptor = "[Lclient!ad;")
	public Class4[] aClass4Array3 = new Class4[] { null, null, null, null, Static39.aClass4_543 };

	@OriginalMember(owner = "client!eb", name = "Cb", descriptor = "I")
	public int anInt732 = -1;

	@OriginalMember(owner = "client!eb", name = "sb", descriptor = "I")
	private int anInt726 = 128;

	@OriginalMember(owner = "client!eb", name = "Jb", descriptor = "I")
	public int anInt736 = 0;

	@OriginalMember(owner = "client!eb", name = "Yb", descriptor = "I")
	public int anInt748 = 0;

	@OriginalMember(owner = "client!eb", name = "Mb", descriptor = "I")
	public int anInt739 = 0;

	@OriginalMember(owner = "client!eb", name = "fb", descriptor = "Lclient!ad;")
	public Class4 aClass4_347 = Static5.aClass4_118;

	@OriginalMember(owner = "client!eb", name = "zb", descriptor = "I")
	private int anInt731 = 0;

	@OriginalMember(owner = "client!eb", name = "Tb", descriptor = "I")
	public int anInt743 = -1;

	@OriginalMember(owner = "client!eb", name = "Ub", descriptor = "I")
	private int anInt744 = -1;

	@OriginalMember(owner = "client!eb", name = "rb", descriptor = "I")
	public int anInt725 = 0;

	@OriginalMember(owner = "client!eb", name = "Eb", descriptor = "[Lclient!ad;")
	public Class4[] aClass4Array4 = new Class4[] { null, null, Static52.aClass4_676, null, null };

	@OriginalMember(owner = "client!eb", name = "ac", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!eb", name = "gb", descriptor = "I")
	private int anInt718 = 128;

	@OriginalMember(owner = "client!eb", name = "Pb", descriptor = "I")
	private int anInt741 = -1;

	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
	public int anInt734 = 0;

	@OriginalMember(owner = "client!eb", name = "kc", descriptor = "I")
	private int anInt756 = -1;

	@OriginalMember(owner = "client!eb", name = "lc", descriptor = "I")
	public int anInt757 = 0;

	@OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
	private int anInt721 = 0;

	@OriginalMember(owner = "client!eb", name = "hc", descriptor = "I")
	public int anInt753 = 1;

	@OriginalMember(owner = "client!eb", name = "mc", descriptor = "I")
	public int anInt758 = 0;

	@OriginalMember(owner = "client!eb", name = "jc", descriptor = "I")
	private int anInt755 = -1;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	public void method490() {
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!gb;I)V")
	public void method491(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method446();
			if (local16 == 0) {
				return;
			}
			this.method492(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!gb;II)V")
	private void method492(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt733 = arg0.method459();
		} else if (arg1 == 2) {
			this.aClass4_347 = arg0.method417();
		} else if (arg1 == 4) {
			this.anInt737 = arg0.method459();
		} else if (arg1 == 5) {
			this.anInt739 = arg0.method459();
		} else if (arg1 == 6) {
			this.anInt734 = arg0.method459();
		} else if (arg1 == 7) {
			this.anInt758 = arg0.method459();
			if (this.anInt758 <= 32767) {
				return;
			}
			this.anInt758 -= 65536;
		} else if (arg1 == 8) {
			this.anInt725 = arg0.method459();
			if (this.anInt725 > 32767) {
				this.anInt725 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt748 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt753 = arg0.method438();
			return;
		} else if (arg1 == 16) {
			this.aBoolean47 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt744 = arg0.method459();
			this.anInt721 = arg0.method446();
			return;
		} else if (arg1 == 24) {
			this.anInt738 = arg0.method459();
			return;
		} else if (arg1 == 25) {
			this.anInt756 = arg0.method459();
			this.anInt731 = arg0.method446();
			return;
		} else if (arg1 == 26) {
			this.anInt719 = arg0.method459();
			return;
		} else {
			if (arg1 >= 30 && arg1 < 35) {
				this.aClass4Array4[arg1 - 30] = arg0.method417();
				if (this.aClass4Array4[arg1 - 30].method160(Static61.aClass4_783)) {
					this.aClass4Array4[arg1 - 30] = null;
					return;
				}
			} else if (arg1 >= 35 && arg1 < 40) {
				this.aClass4Array3[arg1 - 35] = arg0.method417();
			} else if (arg1 == 40) {
				@Pc(150) int local150 = arg0.method446();
				this.anIntArray43 = new int[local150];
				this.anIntArray44 = new int[local150];
				for (@Pc(160) int local160 = 0; local160 < local150; local160++) {
					this.anIntArray43[local160] = arg0.method459();
					this.anIntArray44[local160] = arg0.method459();
				}
				return;
			} else if (arg1 == 78) {
				this.anInt741 = arg0.method459();
				return;
			} else if (arg1 == 79) {
				this.anInt747 = arg0.method459();
				return;
			} else if (arg1 == 90) {
				this.anInt755 = arg0.method459();
				return;
			} else if (arg1 == 91) {
				this.anInt730 = arg0.method459();
				return;
			} else if (arg1 == 92) {
				this.anInt724 = arg0.method459();
				return;
			} else if (arg1 == 93) {
				this.anInt729 = arg0.method459();
				return;
			} else if (arg1 == 95) {
				this.anInt717 = arg0.method459();
				return;
			} else if (arg1 == 97) {
				this.anInt743 = arg0.method459();
				return;
			} else if (arg1 == 98) {
				this.anInt732 = arg0.method459();
				return;
			} else if (arg1 < 100 || arg1 >= 110) {
				if (arg1 != 110) {
					if (arg1 != 111) {
						if (arg1 == 112) {
							this.anInt742 = arg0.method459();
							return;
						}
						if (arg1 == 113) {
							this.anInt728 = arg0.method434();
							return;
						}
						if (arg1 == 114) {
							this.anInt736 = arg0.method434() * 5;
						} else if (arg1 == 115) {
							this.anInt757 = arg0.method446();
							return;
						}
						return;
					}
					this.anInt718 = arg0.method459();
					return;
				}
				this.anInt726 = arg0.method459();
				return;
			} else {
				if (this.anIntArray45 == null) {
					this.anIntArray45 = new int[10];
					this.anIntArray46 = new int[10];
				}
				this.anIntArray45[arg1 - 100] = arg0.method459();
				this.anIntArray46[arg1 - 100] = arg0.method459();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method493(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt724;
		@Pc(7) int local7 = this.anInt755;
		if (arg0) {
			local7 = this.anInt730;
			local4 = this.anInt729;
		}
		if (local7 == -1) {
			return null;
		}
		@Pc(31) Class3_Sub1_Sub1_Sub4 local31 = Static41.method789(Static89.aClass64_58, local7);
		if (local4 != -1) {
			@Pc(39) Class3_Sub1_Sub1_Sub4 local39 = Static41.method789(Static89.aClass64_58, local4);
			@Pc(50) Class3_Sub1_Sub1_Sub4[] local50 = new Class3_Sub1_Sub1_Sub4[] { local31, local39 };
			local31 = new Class3_Sub1_Sub1_Sub4(local50, 2);
		}
		if (this.anIntArray43 != null) {
			for (@Pc(61) int local61 = 0; local61 < this.anIntArray43.length; local61++) {
				local31.method771(this.anIntArray43[local61], this.anIntArray44[local61]);
			}
		}
		return local31;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZ)Z")
	public boolean method497(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt738;
		@Pc(9) int local9 = this.anInt744;
		@Pc(12) int local12 = this.anInt741;
		if (arg0) {
			local9 = this.anInt756;
			local12 = this.anInt747;
			local6 = this.anInt719;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static89.aClass64_58.method1633(local9, 0)) {
			local30 = false;
		}
		if (local6 != -1 && !Static89.aClass64_58.method1633(local6, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static89.aClass64_58.method1633(local12, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(ZZ)Z")
	public boolean method498(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt724;
		@Pc(9) int local9 = this.anInt755;
		if (arg0) {
			local9 = this.anInt730;
			local6 = this.anInt729;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(33) boolean local33 = true;
		if (!Static89.aClass64_58.method1633(local9, 0)) {
			local33 = false;
		}
		if (local6 != -1 && !Static89.aClass64_58.method1633(local6, 0)) {
			local33 = false;
		}
		return local33;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZII)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method499(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15;
		if (this.anIntArray45 != null && arg1 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray46[local15] <= arg1 && this.anIntArray46[local15] != 0) {
					local13 = this.anIntArray45[local15];
				}
			}
			if (local13 != -1) {
				return Static3.method1550(local13).method499(arg0, 1);
			}
		}
		@Pc(58) Class3_Sub1_Sub1_Sub4 local58;
		if (arg0) {
			local58 = (Class3_Sub1_Sub1_Sub4) Static65.aClass8_21.method195((long) this.anInt720);
			if (local58 != null) {
				return local58;
			}
		}
		local58 = Static41.method789(Static89.aClass64_58, this.anInt733);
		if (local58 == null) {
			return null;
		}
		if (this.anInt726 != 128 || this.anInt718 != 128 || this.anInt742 != 128) {
			local58.method763(this.anInt726, this.anInt718, this.anInt742);
		}
		if (this.anIntArray43 != null) {
			for (local15 = 0; local15 < this.anIntArray43.length; local15++) {
				local58.method771(this.anIntArray43[local15], this.anIntArray44[local15]);
			}
		}
		if (arg0) {
			local58.method781(this.anInt728 + 64, this.anInt736 + 768, -50, -10, -50, true);
			local58.aBoolean78 = true;
			Static65.aClass8_21.method199((long) this.anInt720, local58);
		}
		return local58;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!eb;Lclient!eb;I)V")
	public void method500(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		this.anInt737 = arg1.anInt737;
		this.anIntArray44 = arg1.anIntArray44;
		this.aClass4_347 = arg0.aClass4_347;
		this.anInt733 = arg1.anInt733;
		this.anInt717 = arg1.anInt717;
		this.anInt734 = arg1.anInt734;
		this.aBoolean47 = arg0.aBoolean47;
		this.anInt758 = arg1.anInt758;
		this.anInt725 = arg1.anInt725;
		this.anIntArray43 = arg1.anIntArray43;
		this.anInt748 = 1;
		this.anInt753 = arg0.anInt753;
		this.anInt739 = arg1.anInt739;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method501(@OriginalArg(0) boolean arg0) {
		@Pc(16) int local16 = this.anInt744;
		@Pc(19) int local19 = this.anInt738;
		@Pc(22) int local22 = this.anInt741;
		if (arg0) {
			local22 = this.anInt747;
			local16 = this.anInt756;
			local19 = this.anInt719;
		}
		if (local16 == -1) {
			return null;
		}
		@Pc(44) Class3_Sub1_Sub1_Sub4 local44 = Static41.method789(Static89.aClass64_58, local16);
		if (local19 != -1) {
			@Pc(53) Class3_Sub1_Sub1_Sub4 local53 = Static41.method789(Static89.aClass64_58, local19);
			if (local22 == -1) {
				@Pc(67) Class3_Sub1_Sub1_Sub4[] local67 = new Class3_Sub1_Sub1_Sub4[] { local44, local53 };
				local44 = new Class3_Sub1_Sub1_Sub4(local67, 2);
			} else {
				@Pc(80) Class3_Sub1_Sub1_Sub4 local80 = Static41.method789(Static89.aClass64_58, local22);
				@Pc(95) Class3_Sub1_Sub1_Sub4[] local95 = new Class3_Sub1_Sub1_Sub4[] { local44, local53, local80 };
				local44 = new Class3_Sub1_Sub1_Sub4(local95, 3);
			}
		}
		if (!arg0 && this.anInt721 != 0) {
			local44.method786(0, this.anInt721, 0);
		}
		if (arg0 && this.anInt731 != 0) {
			local44.method786(0, this.anInt731, 0);
		}
		if (this.anIntArray43 != null) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArray43.length; local131++) {
				local44.method771(this.anIntArray43[local131], this.anIntArray44[local131]);
			}
		}
		return local44;
	}
}
