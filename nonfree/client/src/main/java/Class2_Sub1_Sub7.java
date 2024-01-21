import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!h", name = "Pb", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!h", name = "Zb", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!h", name = "uc", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!h", name = "vc", descriptor = "I")
	public int anInt1366;

	@OriginalMember(owner = "client!h", name = "wc", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!h", name = "sb", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!h", name = "ub", descriptor = "I")
	public int anInt1335 = 1;

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "[Lclient!a;")
	public final Class1[] aClass1Array12 = new Class1[5];

	@OriginalMember(owner = "client!h", name = "Cb", descriptor = "I")
	public int anInt1339 = -1;

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "I")
	public int anInt1338 = -1;

	@OriginalMember(owner = "client!h", name = "Lb", descriptor = "I")
	public int anInt1344 = 32;

	@OriginalMember(owner = "client!h", name = "Hb", descriptor = "I")
	private int anInt1341 = 0;

	@OriginalMember(owner = "client!h", name = "ac", descriptor = "I")
	public int anInt1351 = -1;

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "I")
	private int anInt1340 = -1;

	@OriginalMember(owner = "client!h", name = "dc", descriptor = "I")
	private int anInt1353 = 0;

	@OriginalMember(owner = "client!h", name = "bc", descriptor = "I")
	private int anInt1352 = 128;

	@OriginalMember(owner = "client!h", name = "Rb", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!h", name = "Nb", descriptor = "I")
	public int anInt1345 = -1;

	@OriginalMember(owner = "client!h", name = "Jb", descriptor = "I")
	public int anInt1342 = -1;

	@OriginalMember(owner = "client!h", name = "hc", descriptor = "I")
	public int anInt1356 = -1;

	@OriginalMember(owner = "client!h", name = "fc", descriptor = "I")
	private int anInt1354 = -1;

	@OriginalMember(owner = "client!h", name = "jc", descriptor = "I")
	private int anInt1358 = 128;

	@OriginalMember(owner = "client!h", name = "tc", descriptor = "I")
	public int anInt1365 = -1;

	@OriginalMember(owner = "client!h", name = "pc", descriptor = "I")
	public int anInt1362 = -1;

	@OriginalMember(owner = "client!h", name = "Wb", descriptor = "Lclient!a;")
	public Class1 aClass1_1318 = Static63.aClass1_1913;

	@OriginalMember(owner = "client!h", name = "mc", descriptor = "I")
	public int anInt1359 = -1;

	@OriginalMember(owner = "client!h", name = "yc", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!he;Lclient!he;II)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method930(@OriginalArg(1) Class2_Sub1_Sub9 arg0, @OriginalArg(2) Class2_Sub1_Sub9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray140 != null) {
			@Pc(20) Class2_Sub1_Sub7 local20 = this.method939();
			return local20 == null ? null : local20.method930(arg0, arg1, arg2, arg3);
		}
		@Pc(40) Class2_Sub1_Sub1_Sub5 local40 = (Class2_Sub1_Sub1_Sub5) Static112.aClass11_28.method431((long) this.anInt1366);
		if (local40 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray139.length; local46++) {
				if (!Static112.aClass8_30.method1685(this.anIntArray139[local46], 0)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(74) Class2_Sub1_Sub1_Sub5[] local74 = new Class2_Sub1_Sub1_Sub5[this.anIntArray139.length];
			for (@Pc(76) int local76 = 0; local76 < this.anIntArray139.length; local76++) {
				local74[local76] = Static75.method1431(Static112.aClass8_30, this.anIntArray139[local76]);
			}
			if (local74.length == 1) {
				local40 = local74[0];
			} else {
				local40 = new Class2_Sub1_Sub1_Sub5(local74, local74.length);
			}
			if (this.anIntArray141 != null) {
				for (@Pc(120) int local120 = 0; local120 < this.anIntArray141.length; local120++) {
					local40.method1404(this.anIntArray141[local120], this.anIntArray138[local120]);
				}
			}
			local40.method1411();
			local40.method1403(this.anInt1341 + 64, 850 - -this.anInt1353, -30, -50, -30, true);
			Static112.aClass11_28.method430((long) this.anInt1366, local40);
		}
		@Pc(178) Class2_Sub1_Sub1_Sub5 local178;
		if (arg0 != null && arg1 != null) {
			local178 = arg0.method977(local40, arg1, arg3, arg2);
		} else if (arg0 != null) {
			local178 = arg0.method986(arg3, local40);
		} else if (arg1 == null) {
			local178 = local40.method1418(true);
		} else {
			local178 = arg1.method986(arg2, local40);
		}
		if (this.anInt1352 != 128 || this.anInt1358 != 128) {
			local178.method1422(this.anInt1352, this.anInt1358, this.anInt1352);
		}
		return local178;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)Z")
	public boolean method933() {
		if (this.anIntArray140 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt1354 != -1) {
			local10 = Static41.method962(this.anInt1354);
		} else if (this.anInt1340 != -1) {
			local10 = Static94.anIntArray295[this.anInt1340];
		}
		return local10 >= 0 && this.anIntArray140.length > local10 && this.anIntArray140[local10] != -1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!ba;)V")
	private void method934(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 1) {
			local14 = arg1.method791();
			this.anIntArray139 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray139[local20] = arg1.method792();
			}
		} else if (arg0 == 2) {
			this.aClass1_1318 = arg1.method787();
		} else if (arg0 == 12) {
			this.anInt1335 = arg1.method791();
		} else if (arg0 == 13) {
			this.anInt1339 = arg1.method792();
		} else if (arg0 == 14) {
			this.anInt1365 = arg1.method792();
		} else if (arg0 == 15) {
			this.anInt1362 = arg1.method792();
		} else if (arg0 == 16) {
			this.anInt1342 = arg1.method792();
		} else if (arg0 == 17) {
			this.anInt1365 = arg1.method792();
			this.anInt1351 = arg1.method792();
			this.anInt1359 = arg1.method792();
			this.anInt1356 = arg1.method792();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass1Array12[arg0 - 30] = arg1.method787();
			if (this.aClass1Array12[arg0 - 30].method14(Static98.aClass1_2627)) {
				this.aClass1Array12[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local14 = arg1.method791();
			this.anIntArray138 = new int[local14];
			this.anIntArray141 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray141[local20] = arg1.method792();
				this.anIntArray138[local20] = arg1.method792();
			}
		} else if (arg0 == 60) {
			local14 = arg1.method791();
			this.anIntArray136 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray136[local20] = arg1.method792();
			}
		} else if (arg0 == 93) {
			this.aBoolean68 = false;
		} else if (arg0 == 95) {
			this.anInt1345 = arg1.method792();
		} else if (arg0 == 97) {
			this.anInt1352 = arg1.method792();
		} else if (arg0 == 98) {
			this.anInt1358 = arg1.method792();
		} else if (arg0 == 99) {
			this.aBoolean67 = true;
		} else if (arg0 == 100) {
			this.anInt1341 = arg1.method831();
		} else if (arg0 == 101) {
			this.anInt1353 = arg1.method831() * 5;
		} else if (arg0 == 102) {
			this.anInt1338 = arg1.method792();
		} else if (arg0 == 103) {
			this.anInt1344 = arg1.method792();
		} else if (arg0 == 106) {
			this.anInt1354 = arg1.method792();
			if (this.anInt1354 == 65535) {
				this.anInt1354 = -1;
			}
			this.anInt1340 = arg1.method792();
			if (this.anInt1340 == 65535) {
				this.anInt1340 = -1;
			}
			local14 = arg1.method791();
			this.anIntArray140 = new int[local14 + 1];
			for (local20 = 0; local20 <= local14; local20++) {
				this.anIntArray140[local20] = arg1.method792();
				if (this.anIntArray140[local20] == 65535) {
					this.anIntArray140[local20] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean66 = false;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!ba;)V")
	public void method935(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method791();
			if (local9 == 0) {
				return;
			}
			this.method934(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method937() {
		if (this.anIntArray140 != null) {
			@Pc(12) Class2_Sub1_Sub7 local12 = this.method939();
			return local12 == null ? null : local12.method937();
		} else if (this.anIntArray136 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray136.length; local29++) {
				if (!Static112.aClass8_30.method1685(this.anIntArray136[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(65) Class2_Sub1_Sub1_Sub5[] local65 = new Class2_Sub1_Sub1_Sub5[this.anIntArray136.length];
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray136.length; local67++) {
				local65[local67] = Static75.method1431(Static112.aClass8_30, this.anIntArray136[local67]);
			}
			@Pc(96) Class2_Sub1_Sub1_Sub5 local96;
			if (local65.length == 1) {
				local96 = local65[0];
			} else {
				local96 = new Class2_Sub1_Sub1_Sub5(local65, local65.length);
			}
			if (this.anIntArray141 != null) {
				for (@Pc(107) int local107 = 0; local107 < this.anIntArray141.length; local107++) {
					local96.method1404(this.anIntArray141[local107], this.anIntArray138[local107]);
				}
			}
			return local96;
		}
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)Lclient!h;")
	public Class2_Sub1_Sub7 method939() {
		@Pc(1) int local1 = -1;
		if (this.anInt1354 != -1) {
			local1 = Static41.method962(this.anInt1354);
		} else if (this.anInt1340 != -1) {
			local1 = Static94.anIntArray295[this.anInt1340];
		}
		return local1 < 0 || local1 >= this.anIntArray140.length || this.anIntArray140[local1] == -1 ? null : Static84.method1529(this.anIntArray140[local1]);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
	public void method941() {
	}
}
