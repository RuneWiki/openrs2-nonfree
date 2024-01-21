import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "[I")
	public int[] anIntArray5;

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ac", name = "mb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ac", name = "tb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	private int anInt54 = -1;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	public int anInt57 = -1;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
	private int anInt63 = 0;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
	public int anInt66 = -1;

	@OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
	public int anInt74 = -1;

	@OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
	public int anInt77 = -1;

	@OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
	public int anInt78 = -1;

	@OriginalMember(owner = "client!ac", name = "gb", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "Z")
	public boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
	public int anInt65 = -1;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "[Lclient!cd;")
	public final Class10[] aClass10Array1 = new Class10[5];

	@OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
	public int anInt68 = -1;

	@OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
	public int anInt69 = -1;

	@OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
	public int anInt73 = 32;

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
	private int anInt70 = 128;

	@OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
	private int anInt76 = 128;

	@OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
	public int anInt72 = 1;

	@OriginalMember(owner = "client!ac", name = "qb", descriptor = "I")
	private int anInt79 = 0;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!ac", name = "sb", descriptor = "Z")
	public boolean aBoolean5 = true;

	@OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
	private int anInt80 = -1;

	@OriginalMember(owner = "client!ac", name = "ub", descriptor = "Lclient!cd;")
	public Class10 aClass10_48 = Static146.aClass10_1406;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!va;I)V")
	public void method47(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1461();
			if (local14 == 0) {
				return;
			}
			this.method55(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
	public void method48() {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ke;Lclient!ke;II)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method49(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub9 arg1, @OriginalArg(2) Class2_Sub1_Sub9 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray5 != null) {
			@Pc(18) Class2_Sub1_Sub2 local18 = this.method57();
			return local18 == null ? null : local18.method49(arg0, arg1, arg2, arg3);
		}
		@Pc(40) Class2_Sub1_Sub3_Sub3 local40 = (Class2_Sub1_Sub3_Sub3) Static136.aClass72_22.method2259((long) this.anInt58);
		if (local40 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray4.length; local46++) {
				if (!Static88.aClass29_26.method1016(this.anIntArray4[local46], 0)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(78) Class2_Sub1_Sub3_Sub7[] local78 = new Class2_Sub1_Sub3_Sub7[this.anIntArray4.length];
			for (@Pc(80) int local80 = 0; local80 < this.anIntArray4.length; local80++) {
				local78[local80] = Static166.method2551(Static88.aClass29_26, this.anIntArray4[local80]);
			}
			@Pc(106) Class2_Sub1_Sub3_Sub7 local106;
			if (local78.length == 1) {
				local106 = local78[0];
			} else {
				local106 = new Class2_Sub1_Sub3_Sub7(local78, local78.length);
			}
			@Pc(120) int local120;
			if (this.aShortArray3 != null) {
				for (local120 = 0; local120 < this.aShortArray3.length; local120++) {
					local106.method2566(this.aShortArray3[local120], this.aShortArray4[local120]);
				}
			}
			if (this.aShortArray2 != null) {
				for (local120 = 0; local120 < this.aShortArray2.length; local120++) {
					local106.method2567(this.aShortArray2[local120], this.aShortArray1[local120]);
				}
			}
			local40 = local106.method2565(this.anInt79 + 64, this.anInt63 + 850, -30, -50, -30, true);
			Static136.aClass72_22.method2254(local40, (long) this.anInt58);
		}
		@Pc(202) Class2_Sub1_Sub3_Sub3 local202;
		if (arg1 != null && arg2 != null) {
			local202 = arg1.method1366(arg2, arg0, arg3, local40);
		} else if (arg1 != null) {
			local202 = arg1.method1361(local40, arg3);
		} else if (arg2 == null) {
			local202 = local40.method809(true);
		} else {
			local202 = arg2.method1361(local40, arg0);
		}
		if (this.anInt76 != 128 || this.anInt70 != 128) {
			local202.method821(this.anInt76, this.anInt70, this.anInt76);
		}
		return local202;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method53() {
		if (this.anIntArray5 != null) {
			@Pc(12) Class2_Sub1_Sub2 local12 = this.method57();
			return local12 == null ? null : local12.method53();
		} else if (this.anIntArray6 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray6.length; local29++) {
				if (!Static88.aClass29_26.method1016(this.anIntArray6[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class2_Sub1_Sub3_Sub7[] local57 = new Class2_Sub1_Sub3_Sub7[this.anIntArray6.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray6.length; local59++) {
				local57[local59] = Static166.method2551(Static88.aClass29_26, this.anIntArray6[local59]);
			}
			@Pc(85) Class2_Sub1_Sub3_Sub7 local85;
			if (local57.length == 1) {
				local85 = local57[0];
			} else {
				local85 = new Class2_Sub1_Sub3_Sub7(local57, local57.length);
			}
			@Pc(99) int local99;
			if (this.aShortArray3 != null) {
				for (local99 = 0; local99 < this.aShortArray3.length; local99++) {
					local85.method2566(this.aShortArray3[local99], this.aShortArray4[local99]);
				}
			}
			if (this.aShortArray2 != null) {
				for (local99 = 0; local99 < this.aShortArray2.length; local99++) {
					local85.method2567(this.aShortArray2[local99], this.aShortArray1[local99]);
				}
			}
			return local85;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!va;)V")
	private void method55(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		@Pc(102) int local102;
		@Pc(112) int local112;
		if (arg0 == 1) {
			local102 = arg1.method1461();
			this.anIntArray4 = new int[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.anIntArray4[local112] = arg1.method1456();
			}
		} else if (arg0 == 2) {
			this.aClass10_48 = arg1.method1452();
		} else if (arg0 == 12) {
			this.anInt72 = arg1.method1461();
		} else if (arg0 == 13) {
			this.anInt65 = arg1.method1456();
		} else if (arg0 == 14) {
			this.anInt77 = arg1.method1456();
		} else if (arg0 == 15) {
			this.anInt67 = arg1.method1456();
		} else if (arg0 == 16) {
			this.anInt57 = arg1.method1456();
		} else if (arg0 == 17) {
			this.anInt77 = arg1.method1456();
			this.anInt69 = arg1.method1456();
			this.anInt68 = arg1.method1456();
			this.anInt66 = arg1.method1456();
			return;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass10Array1[arg0 - 30] = arg1.method1452();
			if (this.aClass10Array1[arg0 - 30].method343(Static2.aClass10_32)) {
				this.aClass10Array1[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local102 = arg1.method1461();
			this.aShortArray4 = new short[local102];
			this.aShortArray3 = new short[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.aShortArray3[local112] = (short) arg1.method1456();
				this.aShortArray4[local112] = (short) arg1.method1456();
			}
			return;
		} else if (arg0 == 41) {
			local102 = arg1.method1461();
			this.aShortArray1 = new short[local102];
			this.aShortArray2 = new short[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.aShortArray2[local112] = (short) arg1.method1456();
				this.aShortArray1[local112] = (short) arg1.method1456();
			}
			return;
		} else if (arg0 == 60) {
			local102 = arg1.method1461();
			this.anIntArray6 = new int[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.anIntArray6[local112] = arg1.method1456();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean2 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt78 = arg1.method1456();
			return;
		} else if (arg0 == 97) {
			this.anInt76 = arg1.method1456();
			return;
		} else if (arg0 == 98) {
			this.anInt70 = arg1.method1456();
			return;
		} else if (arg0 == 99) {
			this.aBoolean3 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt79 = arg1.method1463();
			return;
		} else if (arg0 == 101) {
			this.anInt63 = arg1.method1463() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt74 = arg1.method1456();
			return;
		} else {
			if (arg0 == 103) {
				this.anInt73 = arg1.method1456();
			} else if (arg0 == 106) {
				this.anInt80 = arg1.method1456();
				if (this.anInt80 == 65535) {
					this.anInt80 = -1;
				}
				this.anInt54 = arg1.method1456();
				if (this.anInt54 == 65535) {
					this.anInt54 = -1;
				}
				local102 = arg1.method1461();
				this.anIntArray5 = new int[local102 + 1];
				for (local112 = 0; local112 <= local102; local112++) {
					this.anIntArray5[local112] = arg1.method1456();
					if (this.anIntArray5[local112] == 65535) {
						this.anIntArray5[local112] = -1;
					}
				}
				return;
			} else if (arg0 == 107) {
				this.aBoolean4 = false;
				return;
			} else if (arg0 == 109) {
				this.aBoolean5 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)Lclient!ac;")
	public Class2_Sub1_Sub2 method57() {
		@Pc(10) int local10 = -1;
		if (this.anInt80 != -1) {
			local10 = Static26.method592(this.anInt80);
		} else if (this.anInt54 != -1) {
			local10 = Static51.anIntArray143[this.anInt54];
		}
		return local10 < 0 || local10 >= this.anIntArray5.length || this.anIntArray5[local10] == -1 ? null : Static106.method1725(this.anIntArray5[local10]);
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)Z")
	public boolean method58() {
		if (this.anIntArray5 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt80 != -1) {
			local15 = Static26.method592(this.anInt80);
		} else if (this.anInt54 != -1) {
			local15 = Static51.anIntArray143[this.anInt54];
		}
		return local15 >= 0 && local15 < this.anIntArray5.length && this.anIntArray5[local15] != -1;
	}
}
