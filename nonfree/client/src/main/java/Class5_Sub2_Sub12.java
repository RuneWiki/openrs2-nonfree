import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!pf", name = "jb", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!pf", name = "nb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!pf", name = "Ab", descriptor = "I")
	public int anInt2509;

	@OriginalMember(owner = "client!pf", name = "Pb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
	public int anInt2492 = -1;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
	public int anInt2494 = -1;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
	public int anInt2500 = -1;

	@OriginalMember(owner = "client!pf", name = "lb", descriptor = "Lclient!r;")
	public Class61 aClass61_745 = Static106.aClass61_827;

	@OriginalMember(owner = "client!pf", name = "pb", descriptor = "I")
	private int anInt2503 = 128;

	@OriginalMember(owner = "client!pf", name = "rb", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!pf", name = "tb", descriptor = "I")
	private int anInt2505 = -1;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
	public int anInt2493 = -1;

	@OriginalMember(owner = "client!pf", name = "sb", descriptor = "I")
	public int anInt2504 = -1;

	@OriginalMember(owner = "client!pf", name = "Db", descriptor = "I")
	private int anInt2512 = 128;

	@OriginalMember(owner = "client!pf", name = "qb", descriptor = "[Lclient!r;")
	public final Class61[] aClass61Array16 = new Class61[5];

	@OriginalMember(owner = "client!pf", name = "Cb", descriptor = "I")
	public int anInt2511 = 1;

	@OriginalMember(owner = "client!pf", name = "Bb", descriptor = "I")
	public int anInt2510 = 32;

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
	public int anInt2498 = -1;

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
	public int anInt2495 = -1;

	@OriginalMember(owner = "client!pf", name = "vb", descriptor = "I")
	public int anInt2506 = -1;

	@OriginalMember(owner = "client!pf", name = "Ob", descriptor = "I")
	private int anInt2517 = 0;

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
	private int anInt2496 = -1;

	@OriginalMember(owner = "client!pf", name = "zb", descriptor = "I")
	public int anInt2508 = -1;

	@OriginalMember(owner = "client!pf", name = "yb", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
	private int anInt2490 = 0;

	@OriginalMember(owner = "client!pf", name = "Mb", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!pf", name = "Hb", descriptor = "Z")
	public boolean aBoolean90 = true;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)Lclient!pf;")
	public Class5_Sub2_Sub12 method1632() {
		@Pc(10) int local10 = -1;
		if (this.anInt2496 != -1) {
			local10 = Static111.method1829(this.anInt2496);
		} else if (this.anInt2505 != -1) {
			local10 = Static83.anIntArray289[this.anInt2505];
		}
		return local10 < 0 || local10 >= this.anIntArray318.length || this.anIntArray318[local10] == -1 ? null : Static29.method626(this.anIntArray318[local10]);
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)Z")
	public boolean method1633() {
		if (this.anIntArray318 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2496 != -1) {
			local10 = Static111.method1829(this.anInt2496);
		} else if (this.anInt2505 != -1) {
			local10 = Static83.anIntArray289[this.anInt2505];
		}
		return local10 >= 0 && local10 < this.anIntArray318.length && this.anIntArray318[local10] != -1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!pa;)V")
	public void method1634(@OriginalArg(1) Class5_Sub14 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method1471();
			if (local8 == 0) {
				return;
			}
			this.method1639(arg0, local8);
		}
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(B)V")
	public void method1635() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!w;Lclient!w;II)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method1636(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub17 arg1, @OriginalArg(2) Class5_Sub2_Sub17 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray318 != null) {
			@Pc(12) Class5_Sub2_Sub12 local12 = this.method1632();
			return local12 == null ? null : local12.method1636(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class5_Sub2_Sub2_Sub6 local32 = (Class5_Sub2_Sub2_Sub6) Static13.aClass29_5.method766((long) this.anInt2509);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray319.length; local38++) {
				if (!Static109.aClass26_28.method1041(this.anIntArray319[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class5_Sub2_Sub2_Sub1[] local70 = new Class5_Sub2_Sub2_Sub1[this.anIntArray319.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray319.length; local72++) {
				local70[local72] = Static15.method341(Static109.aClass26_28, this.anIntArray319[local72]);
			}
			@Pc(105) Class5_Sub2_Sub2_Sub1 local105;
			if (local70.length == 1) {
				local105 = local70[0];
			} else {
				local105 = new Class5_Sub2_Sub2_Sub1(local70, local70.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray30 != null) {
				for (local116 = 0; local116 < this.aShortArray30.length; local116++) {
					local105.method329(this.aShortArray30[local116], this.aShortArray27[local116]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local116 = 0; local116 < this.aShortArray28.length; local116++) {
					local105.method343(this.aShortArray28[local116], this.aShortArray29[local116]);
				}
			}
			local32 = local105.method342(this.anInt2517 + 64, this.anInt2490 + 850, -30, -50, -30);
			Static13.aClass29_5.method762(local32, (long) this.anInt2509);
		}
		@Pc(198) Class5_Sub2_Sub2_Sub6 local198;
		if (arg1 != null && arg2 != null) {
			local198 = arg1.method2067(local32, arg0, arg3, arg2);
		} else if (arg1 != null) {
			local198 = arg1.method2061(local32, arg3);
		} else if (arg2 == null) {
			local198 = local32.method2156(true);
		} else {
			local198 = arg2.method2061(local32, arg0);
		}
		if (this.anInt2512 != 128 || this.anInt2503 != 128) {
			local198.method2148(this.anInt2512, this.anInt2503, this.anInt2512);
		}
		return local198;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!pa;II)V")
	private void method1639(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) int arg1) {
		@Pc(129) int local129;
		@Pc(135) int local135;
		if (arg1 == 1) {
			local129 = arg0.method1471();
			this.anIntArray319 = new int[local129];
			for (local135 = 0; local135 < local129; local135++) {
				this.anIntArray319[local135] = arg0.method1478();
			}
		} else if (arg1 == 2) {
			this.aClass61_745 = arg0.method1450();
		} else if (arg1 == 12) {
			this.anInt2511 = arg0.method1471();
		} else if (arg1 == 13) {
			this.anInt2492 = arg0.method1478();
		} else if (arg1 == 14) {
			this.anInt2494 = arg0.method1478();
		} else if (arg1 == 15) {
			this.anInt2508 = arg0.method1478();
		} else if (arg1 == 16) {
			this.anInt2506 = arg0.method1478();
		} else if (arg1 == 17) {
			this.anInt2494 = arg0.method1478();
			this.anInt2493 = arg0.method1478();
			this.anInt2504 = arg0.method1478();
			this.anInt2498 = arg0.method1478();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass61Array16[arg1 - 30] = arg0.method1450();
			if (this.aClass61Array16[arg1 - 30].method1709(Static116.aClass61_928)) {
				this.aClass61Array16[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local129 = arg0.method1471();
			this.aShortArray30 = new short[local129];
			this.aShortArray27 = new short[local129];
			for (local135 = 0; local135 < local129; local135++) {
				this.aShortArray30[local135] = (short) arg0.method1478();
				this.aShortArray27[local135] = (short) arg0.method1478();
			}
		} else if (arg1 == 41) {
			local129 = arg0.method1471();
			this.aShortArray29 = new short[local129];
			this.aShortArray28 = new short[local129];
			for (local135 = 0; local135 < local129; local135++) {
				this.aShortArray28[local135] = (short) arg0.method1478();
				this.aShortArray29[local135] = (short) arg0.method1478();
			}
		} else if (arg1 == 60) {
			local129 = arg0.method1471();
			this.anIntArray320 = new int[local129];
			for (local135 = 0; local135 < local129; local135++) {
				this.anIntArray320[local135] = arg0.method1478();
			}
		} else if (arg1 == 93) {
			this.aBoolean89 = false;
		} else if (arg1 == 95) {
			this.anInt2495 = arg0.method1478();
		} else if (arg1 == 97) {
			this.anInt2512 = arg0.method1478();
		} else if (arg1 == 98) {
			this.anInt2503 = arg0.method1478();
		} else if (arg1 == 99) {
			this.aBoolean88 = true;
		} else if (arg1 == 100) {
			this.anInt2517 = arg0.method1447();
		} else if (arg1 == 101) {
			this.anInt2490 = arg0.method1447() * 5;
		} else if (arg1 == 102) {
			this.anInt2500 = arg0.method1478();
		} else if (arg1 == 103) {
			this.anInt2510 = arg0.method1478();
		} else if (arg1 == 106) {
			this.anInt2496 = arg0.method1478();
			if (this.anInt2496 == 65535) {
				this.anInt2496 = -1;
			}
			this.anInt2505 = arg0.method1478();
			if (this.anInt2505 == 65535) {
				this.anInt2505 = -1;
			}
			local129 = arg0.method1471();
			this.anIntArray318 = new int[local129 + 1];
			for (local135 = 0; local135 <= local129; local135++) {
				this.anIntArray318[local135] = arg0.method1478();
				if (this.anIntArray318[local135] == 65535) {
					this.anIntArray318[local135] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean91 = false;
		} else if (arg1 == 109) {
			this.aBoolean90 = false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(B)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method1640() {
		if (this.anIntArray318 != null) {
			@Pc(12) Class5_Sub2_Sub12 local12 = this.method1632();
			return local12 == null ? null : local12.method1640();
		} else if (this.anIntArray320 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray320.length; local29++) {
				if (!Static109.aClass26_28.method1041(this.anIntArray320[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(65) Class5_Sub2_Sub2_Sub1[] local65 = new Class5_Sub2_Sub2_Sub1[this.anIntArray320.length];
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray320.length; local67++) {
				local65[local67] = Static15.method341(Static109.aClass26_28, this.anIntArray320[local67]);
			}
			@Pc(102) Class5_Sub2_Sub2_Sub1 local102;
			if (local65.length == 1) {
				local102 = local65[0];
			} else {
				local102 = new Class5_Sub2_Sub2_Sub1(local65, local65.length);
			}
			@Pc(113) int local113;
			if (this.aShortArray30 != null) {
				for (local113 = 0; local113 < this.aShortArray30.length; local113++) {
					local102.method329(this.aShortArray30[local113], this.aShortArray27[local113]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local113 = 0; local113 < this.aShortArray28.length; local113++) {
					local102.method343(this.aShortArray28[local113], this.aShortArray29[local113]);
				}
			}
			return local102;
		}
	}
}
