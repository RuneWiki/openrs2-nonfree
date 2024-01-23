import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class152 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
	private int[] anIntArray510;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
	public int[] anIntArray512;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
	public int anInt4609;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public int anInt4597 = -1;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
	public int anInt4608 = 5;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public int anInt4600 = -1;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Z")
	public boolean aBoolean425 = false;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public int anInt4603 = 2;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public int anInt4594 = -1;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
	public int anInt4606 = 99;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Z")
	public boolean aBoolean427 = false;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
	public int anInt4610 = -1;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Z")
	public boolean aBoolean426 = false;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Z")
	public boolean aBoolean428 = false;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public int anInt4611 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!sm;ZIII)Lclient!sm;")
	public Class11_Sub1 method3913(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray512[arg3];
		@Pc(15) int local15 = this.anIntArray509[arg3];
		@Pc(21) Class1_Sub5_Sub4 local21 = Static278.method4265(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg1.method2910(true, true, true);
		}
		@Pc(35) Class1_Sub5_Sub4 local35 = null;
		@Pc(39) int local39 = arg2 & 0x3;
		if ((this.aBoolean425 || Static186.aBoolean313) && arg0 != -1 && arg0 < this.anIntArray509.length) {
			@Pc(57) int local57 = this.anIntArray509[arg0];
			local35 = Static278.method4265(local57 >> 16);
			arg0 = local57 & 0xFFFF;
		}
		@Pc(95) Class11_Sub1 local95;
		if (local35 == null) {
			local95 = arg1.method2910(!local21.method895(local25), !local21.method894(local25), !this.aBoolean426);
		} else {
			local95 = arg1.method2910(!local21.method895(local25) & !local35.method895(arg0), !local21.method894(local25) & !local35.method894(arg0), !this.aBoolean426);
		}
		if (Static71.aBoolean165 && this.aBoolean426) {
			if (local39 == 1) {
				((Class11_Sub1_Sub1) local95).method430();
			} else if (local39 == 2) {
				((Class11_Sub1_Sub1) local95).method422();
			} else if (local39 == 3) {
				((Class11_Sub1_Sub1) local95).method411();
			}
		} else if (local39 == 1) {
			local95.method2920();
		} else if (local39 == 2) {
			local95.method2922();
		} else if (local39 == 3) {
			local95.method2918();
		}
		local95.method2912(local21, local25, local35, arg0, arg4 - 1, local10, this.aBoolean426);
		if (Static71.aBoolean165 && this.aBoolean426) {
			if (local39 == 1) {
				((Class11_Sub1_Sub1) local95).method411();
			} else if (local39 == 2) {
				((Class11_Sub1_Sub1) local95).method422();
			} else if (local39 == 3) {
				((Class11_Sub1_Sub1) local95).method430();
			}
		} else if (local39 == 1) {
			local95.method2918();
		} else if (local39 == 2) {
			local95.method2922();
		} else if (local39 == 3) {
			local95.method2920();
		}
		return local95;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!fh;)V")
	public void method3914(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method3919(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!sm;III)Lclient!sm;")
	public Class11_Sub1 method3915(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray512[arg0];
		@Pc(22) int local22 = this.anIntArray509[arg0];
		@Pc(28) Class1_Sub5_Sub4 local28 = Static278.method4265(local22 >> 16);
		@Pc(32) int local32 = local22 & 0xFFFF;
		if (local28 == null) {
			return arg1.method2895(true, true, true);
		}
		@Pc(43) Class1_Sub5_Sub4 local43 = null;
		if ((this.aBoolean425 || Static186.aBoolean313) && arg3 != -1 && arg3 < this.anIntArray509.length) {
			@Pc(66) int local66 = this.anIntArray509[arg3];
			local43 = Static278.method4265(local66 >> 16);
			arg3 = local66 & 0xFFFF;
		}
		@Pc(78) Class1_Sub5_Sub4 local78 = null;
		@Pc(80) Class1_Sub5_Sub4 local80 = null;
		@Pc(82) int local82 = 0;
		@Pc(84) int local84 = 0;
		if (this.anIntArray510 != null) {
			if (arg0 < this.anIntArray510.length) {
				local82 = this.anIntArray510[arg0];
				if (local82 != 65535) {
					local78 = Static278.method4265(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
			if ((this.aBoolean425 || Static186.aBoolean313) && arg3 != -1 && this.anIntArray510.length > arg3) {
				local84 = this.anIntArray510[arg3];
				if (local84 != 65535) {
					local80 = Static278.method4265(local84 >> 16);
					local84 &= 0xFFFF;
				}
			}
		}
		@Pc(164) boolean local164 = !local28.method895(local32);
		@Pc(173) boolean local173 = !local28.method894(local32);
		if (local78 != null) {
			local164 &= !local78.method895(local82);
			local173 &= !local78.method894(local82);
		}
		if (local43 != null) {
			local164 &= !local43.method895(arg3);
			local173 &= !local43.method894(arg3);
		}
		if (local80 != null) {
			local164 &= !local80.method895(local84);
			local173 &= !local80.method894(local84);
		}
		@Pc(260) Class11_Sub1 local260 = arg1.method2895(local164, local173, !this.aBoolean426);
		local260.method2912(local28, local32, local43, arg3, arg2 - 1, local8, this.aBoolean426);
		if (local78 != null) {
			local260.method2912(local78, local82, local80, local84, arg2 - 1, local8, this.aBoolean426);
		}
		return local260;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!sm;III)Lclient!sm;")
	public Class11_Sub1 method3916(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = this.anIntArray512[arg3];
		@Pc(22) int local22 = this.anIntArray509[arg3];
		@Pc(28) Class1_Sub5_Sub4 local28 = Static278.method4265(local22 >> 16);
		@Pc(32) int local32 = local22 & 0xFFFF;
		if (local28 == null) {
			return arg1.method2895(true, true, true);
		}
		@Pc(45) int local45 = arg0 & 0x3;
		@Pc(47) Class1_Sub5_Sub4 local47 = null;
		if ((this.aBoolean425 || Static186.aBoolean313) && arg2 != -1 && arg2 < this.anIntArray509.length) {
			@Pc(68) int local68 = this.anIntArray509[arg2];
			local47 = Static278.method4265(local68 >> 16);
			arg2 = local68 & 0xFFFF;
		}
		@Pc(126) Class11_Sub1 local126;
		if (local47 == null) {
			local126 = arg1.method2895(!local28.method895(local32), !local28.method894(local32), !this.aBoolean426);
		} else {
			local126 = arg1.method2895(!local28.method895(local32) & !local47.method895(arg2), !local28.method894(local32) & !local47.method894(arg2), !this.aBoolean426);
		}
		if (this.aBoolean426 && Static71.aBoolean165) {
			if (local45 == 1) {
				((Class11_Sub1_Sub1) local126).method430();
			} else if (local45 == 2) {
				((Class11_Sub1_Sub1) local126).method422();
			} else if (local45 == 3) {
				((Class11_Sub1_Sub1) local126).method411();
			}
		} else if (local45 == 1) {
			local126.method2920();
		} else if (local45 == 2) {
			local126.method2922();
		} else if (local45 == 3) {
			local126.method2918();
		}
		local126.method2912(local28, local32, local47, arg2, arg4 - 1, local17, this.aBoolean426);
		if (this.aBoolean426 && Static71.aBoolean165) {
			if (local45 == 1) {
				((Class11_Sub1_Sub1) local126).method411();
			} else if (local45 == 2) {
				((Class11_Sub1_Sub1) local126).method422();
			} else if (local45 == 3) {
				((Class11_Sub1_Sub1) local126).method430();
			}
		} else if (local45 == 1) {
			local126.method2918();
		} else if (local45 == 2) {
			local126.method2922();
		} else if (local45 == 3) {
			local126.method2920();
		}
		return local126;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIILclient!sm;)Lclient!sm;")
	public Class11_Sub1 method3917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class11_Sub1 arg3) {
		@Pc(8) int local8 = this.anIntArray512[arg1];
		@Pc(13) int local13 = this.anIntArray509[arg1];
		@Pc(19) Class1_Sub5_Sub4 local19 = Static278.method4265(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg3.method2907(true, true, true);
		}
		@Pc(40) Class1_Sub5_Sub4 local40 = null;
		if ((this.aBoolean425 || Static186.aBoolean313) && arg0 != -1 && arg0 < this.anIntArray509.length) {
			@Pc(58) int local58 = this.anIntArray509[arg0];
			local40 = Static278.method4265(local58 >> 16);
			arg0 = local58 & 0xFFFF;
		}
		@Pc(98) Class11_Sub1 local98;
		if (local40 == null) {
			local98 = arg3.method2907(!local19.method895(local23), !local19.method894(local23), !this.aBoolean426);
		} else {
			local98 = arg3.method2907(!local19.method895(local23) & !local40.method895(arg0), !local19.method894(local23) & !local40.method894(arg0), !this.aBoolean426);
		}
		local98.method2912(local19, local23, local40, arg0, arg2 - 1, local8, this.aBoolean426);
		return local98;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!fh;ZI)V")
	private void method3919(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		if (arg1 == 1) {
			local12 = arg0.method1879();
			this.anIntArray512 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray512[local18] = arg0.method1879();
			}
			this.anIntArray509 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray509[local18] = arg0.method1879();
			}
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray509[local18] = (arg0.method1879() << 16) + this.anIntArray509[local18];
			}
		} else if (arg1 == 2) {
			this.anInt4594 = arg0.method1879();
		} else if (arg1 == 3) {
			this.aBooleanArray20 = new boolean[256];
			local12 = arg0.method1853();
			for (local18 = 0; local18 < local12; local18++) {
				this.aBooleanArray20[arg0.method1853()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean427 = true;
		} else if (arg1 == 5) {
			this.anInt4608 = arg0.method1853();
		} else if (arg1 == 6) {
			this.anInt4597 = arg0.method1879();
		} else if (arg1 == 7) {
			this.anInt4610 = arg0.method1879();
		} else if (arg1 == 8) {
			this.anInt4606 = arg0.method1853();
		} else if (arg1 == 9) {
			this.anInt4600 = arg0.method1853();
		} else if (arg1 == 10) {
			this.anInt4611 = arg0.method1853();
		} else if (arg1 == 11) {
			this.anInt4603 = arg0.method1853();
		} else if (arg1 == 12) {
			local12 = arg0.method1853();
			this.anIntArray510 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray510[local18] = arg0.method1879();
			}
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray510[local18] = (arg0.method1879() << 16) + this.anIntArray510[local18];
			}
		} else if (arg1 == 13) {
			local12 = arg0.method1879();
			this.anIntArrayArray35 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				@Pc(199) int local199 = arg0.method1853();
				if (local199 > 0) {
					this.anIntArrayArray35[local18] = new int[local199];
					this.anIntArrayArray35[local18][0] = arg0.method1878();
					for (@Pc(219) int local219 = 1; local219 < local199; local219++) {
						this.anIntArrayArray35[local18][local219] = arg0.method1879();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean426 = true;
		} else if (arg1 == 15) {
			this.aBoolean425 = true;
		} else if (arg1 == 16) {
			this.aBoolean428 = true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public void method3921() {
		if (this.anInt4611 == -1) {
			if (this.aBooleanArray20 == null) {
				this.anInt4611 = 0;
			} else {
				this.anInt4611 = 2;
			}
		}
		if (this.anInt4600 != -1) {
			return;
		}
		if (this.aBooleanArray20 == null) {
			this.anInt4600 = 0;
		} else {
			this.anInt4600 = 2;
		}
	}
}
