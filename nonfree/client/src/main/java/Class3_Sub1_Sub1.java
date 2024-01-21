import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!ad", name = "xb", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	public int anInt117 = -1;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "[Lclient!na;")
	public final Class53[] aClass53Array1 = new Class53[5];

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Z")
	public boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "Z")
	public boolean aBoolean5 = true;

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
	private int anInt121 = -1;

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
	public int anInt126 = -1;

	@OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
	public int anInt127 = -1;

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
	private int anInt130 = 128;

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
	public int anInt134 = -1;

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
	public int anInt137 = 1;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
	public int anInt135 = -1;

	@OriginalMember(owner = "client!ad", name = "wb", descriptor = "I")
	public int anInt138 = 32;

	@OriginalMember(owner = "client!ad", name = "ub", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
	private int anInt132 = 128;

	@OriginalMember(owner = "client!ad", name = "db", descriptor = "Lclient!na;")
	public Class53 aClass53_50 = Static103.aClass53_1192;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
	public int anInt124 = -1;

	@OriginalMember(owner = "client!ad", name = "ob", descriptor = "I")
	private int anInt133 = 0;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	public int anInt115 = -1;

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
	public int anInt131 = -1;

	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
	private int anInt141 = 0;

	@OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
	private int anInt140 = -1;

	@OriginalMember(owner = "client!ad", name = "Db", descriptor = "I")
	public int anInt143 = -1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Lclient!ad;")
	public Class3_Sub1_Sub1 method77() {
		@Pc(12) int local12 = -1;
		if (this.anInt140 != -1) {
			local12 = Static70.method1202(this.anInt140);
		} else if (this.anInt121 != -1) {
			local12 = Static13.anIntArray31[this.anInt121];
		}
		return local12 < 0 || this.anIntArray11.length <= local12 || this.anIntArray11[local12] == -1 ? null : Static101.method1666(this.anIntArray11[local12]);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ob;II)V")
	private void method79(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(98) int local98;
		@Pc(104) int local104;
		if (arg1 == 1) {
			local98 = arg0.method647();
			this.anIntArray10 = new int[local98];
			for (local104 = 0; local104 < local98; local104++) {
				this.anIntArray10[local104] = arg0.method602();
			}
		} else if (arg1 == 2) {
			this.aClass53_50 = arg0.method605();
		} else if (arg1 == 12) {
			this.anInt137 = arg0.method647();
		} else if (arg1 == 13) {
			this.anInt134 = arg0.method602();
		} else if (arg1 == 14) {
			this.anInt126 = arg0.method602();
		} else if (arg1 == 15) {
			this.anInt115 = arg0.method602();
		} else if (arg1 == 16) {
			this.anInt127 = arg0.method602();
			return;
		} else if (arg1 == 17) {
			this.anInt126 = arg0.method602();
			this.anInt135 = arg0.method602();
			this.anInt143 = arg0.method602();
			this.anInt124 = arg0.method602();
			return;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass53Array1[arg1 - 30] = arg0.method605();
			if (this.aClass53Array1[arg1 - 30].method1274(Static36.aClass53_491)) {
				this.aClass53Array1[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local98 = arg0.method647();
			this.aShortArray1 = new short[local98];
			this.aShortArray2 = new short[local98];
			for (local104 = 0; local104 < local98; local104++) {
				this.aShortArray1[local104] = (short) arg0.method602();
				this.aShortArray2[local104] = (short) arg0.method602();
			}
			return;
		} else if (arg1 == 60) {
			local98 = arg0.method647();
			this.anIntArray12 = new int[local98];
			for (local104 = 0; local104 < local98; local104++) {
				this.anIntArray12[local104] = arg0.method602();
			}
			return;
		} else if (arg1 == 93) {
			this.aBoolean5 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt131 = arg0.method602();
			return;
		} else if (arg1 == 97) {
			this.anInt130 = arg0.method602();
			return;
		} else if (arg1 == 98) {
			this.anInt132 = arg0.method602();
			return;
		} else if (arg1 == 99) {
			this.aBoolean3 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt141 = arg0.method624();
			return;
		} else if (arg1 == 101) {
			this.anInt133 = arg0.method624() * 5;
			return;
		} else if (arg1 == 102) {
			this.anInt117 = arg0.method602();
			return;
		} else if (arg1 == 103) {
			this.anInt138 = arg0.method602();
			return;
		} else {
			if (arg1 == 106) {
				this.anInt140 = arg0.method602();
				if (this.anInt140 == 65535) {
					this.anInt140 = -1;
				}
				this.anInt121 = arg0.method602();
				if (this.anInt121 == 65535) {
					this.anInt121 = -1;
				}
				local98 = arg0.method647();
				this.anIntArray11 = new int[local98 + 1];
				for (local104 = 0; local104 <= local98; local104++) {
					this.anIntArray11[local104] = arg0.method602();
					if (this.anIntArray11[local104] == 65535) {
						this.anIntArray11[local104] = -1;
					}
				}
			} else if (arg1 == 107) {
				this.aBoolean6 = false;
				return;
			} else if (arg1 == 109) {
				this.aBoolean4 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ob;)V")
	public void method80(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method647();
			if (local9 == 0) {
				return;
			}
			this.method79(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method81() {
		if (this.anIntArray11 != null) {
			@Pc(12) Class3_Sub1_Sub1 local12 = this.method77();
			return local12 == null ? null : local12.method81();
		} else if (this.anIntArray12 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(35) int local35 = 0; local35 < this.anIntArray12.length; local35++) {
				if (!Static57.aClass62_9.method1515(0, this.anIntArray12[local35])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(67) Class3_Sub1_Sub4_Sub5[] local67 = new Class3_Sub1_Sub4_Sub5[this.anIntArray12.length];
			for (@Pc(69) int local69 = 0; local69 < this.anIntArray12.length; local69++) {
				local67[local69] = Static67.method1155(Static57.aClass62_9, this.anIntArray12[local69]);
			}
			@Pc(97) Class3_Sub1_Sub4_Sub5 local97;
			if (local67.length == 1) {
				local97 = local67[0];
			} else {
				local97 = new Class3_Sub1_Sub4_Sub5(local67, local67.length);
			}
			if (this.aShortArray1 != null) {
				for (@Pc(111) int local111 = 0; local111 < this.aShortArray1.length; local111++) {
					local97.method1172(this.aShortArray1[local111], this.aShortArray2[local111]);
				}
			}
			return local97;
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Z")
	public boolean method82() {
		if (this.anIntArray11 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt140 != -1) {
			local15 = Static70.method1202(this.anInt140);
		} else if (this.anInt121 != -1) {
			local15 = Static13.anIntArray31[this.anInt121];
		}
		return local15 >= 0 && local15 < this.anIntArray11.length && this.anIntArray11[local15] != -1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!qc;IILclient!qc;)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method83(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub1_Sub11 arg3) {
		if (this.anIntArray11 != null) {
			@Pc(12) Class3_Sub1_Sub1 local12 = this.method77();
			return local12 == null ? null : local12.method83(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class3_Sub1_Sub4_Sub7 local37 = (Class3_Sub1_Sub4_Sub7) Static79.aClass75_56.method1728((long) this.anInt118);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray10.length; local43++) {
				if (!Static57.aClass62_9.method1515(0, this.anIntArray10[local43])) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(71) Class3_Sub1_Sub4_Sub5[] local71 = new Class3_Sub1_Sub4_Sub5[this.anIntArray10.length];
			for (@Pc(73) int local73 = 0; local73 < this.anIntArray10.length; local73++) {
				local71[local73] = Static67.method1155(Static57.aClass62_9, this.anIntArray10[local73]);
			}
			@Pc(101) Class3_Sub1_Sub4_Sub5 local101;
			if (local71.length == 1) {
				local101 = local71[0];
			} else {
				local101 = new Class3_Sub1_Sub4_Sub5(local71, local71.length);
			}
			if (this.aShortArray1 != null) {
				for (@Pc(115) int local115 = 0; local115 < this.aShortArray1.length; local115++) {
					local101.method1172(this.aShortArray1[local115], this.aShortArray2[local115]);
				}
			}
			local37 = local101.method1156(this.anInt141 + 64, this.anInt133 + 850, -30, -50, -30);
			Static79.aClass75_56.method1730(local37, (long) this.anInt118);
		}
		@Pc(170) Class3_Sub1_Sub4_Sub7 local170;
		if (arg1 != null && arg3 != null) {
			local170 = arg1.method1564(arg2, local37, arg3, arg0);
		} else if (arg1 != null) {
			local170 = arg1.method1559(local37, arg0);
		} else if (arg3 == null) {
			local170 = local37.method1760(true);
		} else {
			local170 = arg3.method1559(local37, arg2);
		}
		if (this.anInt130 != 128 || this.anInt132 != 128) {
			local170.method1777(this.anInt130, this.anInt132, this.anInt130);
		}
		return local170;
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V")
	public void method86() {
	}
}
