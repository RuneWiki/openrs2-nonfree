import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
	public int anInt2748;

	@OriginalMember(owner = "client!vc", name = "rb", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!vc", name = "vb", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!vc", name = "Sb", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
	public int anInt2751 = -1;

	@OriginalMember(owner = "client!vc", name = "nb", descriptor = "I")
	private int anInt2752 = 0;

	@OriginalMember(owner = "client!vc", name = "ob", descriptor = "Z")
	public boolean aBoolean127 = true;

	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "Z")
	public boolean aBoolean126 = true;

	@OriginalMember(owner = "client!vc", name = "Ab", descriptor = "I")
	private int anInt2761 = -1;

	@OriginalMember(owner = "client!vc", name = "yb", descriptor = "I")
	public int anInt2759 = 32;

	@OriginalMember(owner = "client!vc", name = "Bb", descriptor = "I")
	public int anInt2762 = -1;

	@OriginalMember(owner = "client!vc", name = "Eb", descriptor = "I")
	public int anInt2764 = -1;

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
	public int anInt2749 = 1;

	@OriginalMember(owner = "client!vc", name = "zb", descriptor = "I")
	private int anInt2760 = 0;

	@OriginalMember(owner = "client!vc", name = "pb", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!vc", name = "sb", descriptor = "I")
	public int anInt2754 = -1;

	@OriginalMember(owner = "client!vc", name = "wb", descriptor = "I")
	public int anInt2757 = -1;

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
	public int anInt2746 = -1;

	@OriginalMember(owner = "client!vc", name = "Jb", descriptor = "I")
	private int anInt2769 = -1;

	@OriginalMember(owner = "client!vc", name = "Kb", descriptor = "[Lclient!gd;")
	public final Class23[] aClass23Array17 = new Class23[5];

	@OriginalMember(owner = "client!vc", name = "Db", descriptor = "I")
	public int anInt2763 = -1;

	@OriginalMember(owner = "client!vc", name = "Lb", descriptor = "I")
	private int anInt2770 = 128;

	@OriginalMember(owner = "client!vc", name = "Ob", descriptor = "I")
	public int anInt2771 = -1;

	@OriginalMember(owner = "client!vc", name = "xb", descriptor = "I")
	private int anInt2758 = 128;

	@OriginalMember(owner = "client!vc", name = "Cb", descriptor = "Lclient!gd;")
	public Class23 aClass23_1584 = Static17.aClass23_259;

	@OriginalMember(owner = "client!vc", name = "Rb", descriptor = "I")
	public int anInt2773 = -1;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!rc;)V")
	public void method1813(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method716();
			if (local3 == 0) {
				return;
			}
			this.method1814(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!rc;)V")
	private void method1814(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(66) int local66;
		@Pc(76) int local76;
		if (arg0 == 1) {
			local66 = arg1.method716();
			this.anIntArray382 = new int[local66];
			for (local76 = 0; local76 < local66; local76++) {
				this.anIntArray382[local76] = arg1.method715();
			}
		} else if (arg0 == 2) {
			this.aClass23_1584 = arg1.method683();
		} else if (arg0 == 12) {
			this.anInt2749 = arg1.method716();
		} else if (arg0 == 13) {
			this.anInt2771 = arg1.method715();
		} else if (arg0 == 14) {
			this.anInt2764 = arg1.method715();
		} else if (arg0 == 15) {
			this.anInt2746 = arg1.method715();
		} else if (arg0 == 16) {
			this.anInt2757 = arg1.method715();
		} else if (arg0 == 17) {
			this.anInt2764 = arg1.method715();
			this.anInt2762 = arg1.method715();
			this.anInt2773 = arg1.method715();
			this.anInt2754 = arg1.method715();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass23Array17[arg0 - 30] = arg1.method683();
			if (this.aClass23Array17[arg0 - 30].method530(Static76.aClass23_1220)) {
				this.aClass23Array17[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local66 = arg1.method716();
			this.anIntArray385 = new int[local66];
			this.anIntArray383 = new int[local66];
			for (local76 = 0; local76 < local66; local76++) {
				this.anIntArray385[local76] = arg1.method715();
				this.anIntArray383[local76] = arg1.method715();
			}
		} else if (arg0 == 60) {
			local66 = arg1.method716();
			this.anIntArray384 = new int[local66];
			for (local76 = 0; local76 < local66; local76++) {
				this.anIntArray384[local76] = arg1.method715();
			}
		} else if (arg0 == 93) {
			this.aBoolean127 = false;
		} else if (arg0 == 95) {
			this.anInt2763 = arg1.method715();
		} else if (arg0 == 97) {
			this.anInt2770 = arg1.method715();
		} else if (arg0 == 98) {
			this.anInt2758 = arg1.method715();
		} else if (arg0 == 99) {
			this.aBoolean128 = true;
		} else if (arg0 == 100) {
			this.anInt2760 = arg1.method699();
		} else if (arg0 == 101) {
			this.anInt2752 = arg1.method699() * 5;
		} else if (arg0 == 102) {
			this.anInt2751 = arg1.method715();
		} else if (arg0 == 103) {
			this.anInt2759 = arg1.method715();
		} else if (arg0 == 106) {
			this.anInt2761 = arg1.method715();
			if (this.anInt2761 == 65535) {
				this.anInt2761 = -1;
			}
			this.anInt2769 = arg1.method715();
			if (this.anInt2769 == 65535) {
				this.anInt2769 = -1;
			}
			local66 = arg1.method716();
			this.anIntArray381 = new int[local66 + 1];
			for (local76 = 0; local76 <= local66; local76++) {
				this.anIntArray381[local76] = arg1.method715();
				if (this.anIntArray381[local76] == 65535) {
					this.anIntArray381[local76] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean126 = false;
		}
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Lclient!vc;")
	public Class1_Sub1_Sub16 method1816() {
		@Pc(5) int local5 = -1;
		if (this.anInt2761 != -1) {
			local5 = Static1.method44(this.anInt2761);
		} else if (this.anInt2769 != -1) {
			local5 = Static40.anIntArray164[this.anInt2769];
		}
		return local5 < 0 || this.anIntArray381.length <= local5 || this.anIntArray381[local5] == -1 ? null : Static65.method1251(this.anIntArray381[local5]);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1819() {
		if (this.anIntArray381 != null) {
			@Pc(12) Class1_Sub1_Sub16 local12 = this.method1816();
			return local12 == null ? null : local12.method1819();
		} else if (this.anIntArray384 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray384.length; local29++) {
				if (!Static9.aClass55_3.method1886(this.anIntArray384[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class1_Sub1_Sub2_Sub6[] local57 = new Class1_Sub1_Sub2_Sub6[this.anIntArray384.length];
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray384.length; local67++) {
				local57[local67] = Static81.method1442(Static9.aClass55_3, this.anIntArray384[local67]);
			}
			@Pc(98) Class1_Sub1_Sub2_Sub6 local98;
			if (local57.length == 1) {
				local98 = local57[0];
			} else {
				local98 = new Class1_Sub1_Sub2_Sub6(local57, local57.length);
			}
			if (this.anIntArray385 != null) {
				for (@Pc(109) int local109 = 0; local109 < this.anIntArray385.length; local109++) {
					local98.method1427(this.anIntArray385[local109], this.anIntArray383[local109]);
				}
			}
			return local98;
		}
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
	public void method1820() {
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLclient!h;ILclient!h;)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1821(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub8 arg3) {
		if (this.anIntArray381 != null) {
			@Pc(10) Class1_Sub1_Sub16 local10 = this.method1816();
			return local10 == null ? null : local10.method1821(arg0, arg1, arg2, arg3);
		}
		@Pc(35) Class1_Sub1_Sub2_Sub6 local35 = (Class1_Sub1_Sub2_Sub6) Static58.aClass5_62.method98((long) this.anInt2748);
		if (local35 == null) {
			@Pc(39) boolean local39 = false;
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray382.length; local41++) {
				if (!Static9.aClass55_3.method1886(this.anIntArray382[local41], 0)) {
					local39 = true;
				}
			}
			if (local39) {
				return null;
			}
			@Pc(72) Class1_Sub1_Sub2_Sub6[] local72 = new Class1_Sub1_Sub2_Sub6[this.anIntArray382.length];
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray382.length; local74++) {
				local72[local74] = Static81.method1442(Static9.aClass55_3, this.anIntArray382[local74]);
			}
			if (local72.length == 1) {
				local35 = local72[0];
			} else {
				local35 = new Class1_Sub1_Sub2_Sub6(local72, local72.length);
			}
			if (this.anIntArray385 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.anIntArray385.length; local112++) {
					local35.method1427(this.anIntArray385[local112], this.anIntArray383[local112]);
				}
			}
			local35.method1426();
			local35.method1437(this.anInt2760 + 64, this.anInt2752 + 850, -30, -50, -30, true);
			Static58.aClass5_62.method97(local35, (long) this.anInt2748);
		}
		@Pc(164) Class1_Sub1_Sub2_Sub6 local164;
		if (arg3 != null && arg1 != null) {
			local164 = arg3.method586(arg1, arg0, local35, arg2);
		} else if (arg3 != null) {
			local164 = arg3.method587(local35, arg0);
		} else if (arg1 == null) {
			local164 = local35.method1439(true);
		} else {
			local164 = arg1.method587(local35, arg2);
		}
		if (this.anInt2770 != 128 || this.anInt2758 != 128) {
			local164.method1428(this.anInt2770, this.anInt2758, this.anInt2770);
		}
		return local164;
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)Z")
	public boolean method1823() {
		if (this.anIntArray381 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2761 != -1) {
			local10 = Static1.method44(this.anInt2761);
		} else if (this.anInt2769 != -1) {
			local10 = Static40.anIntArray164[this.anInt2769];
		}
		return local10 >= 0 && local10 < this.anIntArray381.length && this.anIntArray381[local10] != -1;
	}
}
