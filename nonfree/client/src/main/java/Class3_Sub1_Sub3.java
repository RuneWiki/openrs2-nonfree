import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ba", name = "Bb", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!ba", name = "Nb", descriptor = "[I")
	public int[] anIntArray27;

	@OriginalMember(owner = "client!ba", name = "Pb", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!ba", name = "Rb", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!ba", name = "Tb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ba", name = "Ub", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
	public int anInt232 = -1;

	@OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
	public int anInt228 = -1;

	@OriginalMember(owner = "client!ba", name = "ob", descriptor = "I")
	public int anInt235 = -1;

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
	public int anInt227 = 1;

	@OriginalMember(owner = "client!ba", name = "X", descriptor = "[Lclient!he;")
	public final Class26[] aClass26Array3 = new Class26[5];

	@OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
	public int anInt230 = -1;

	@OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
	public int anInt229 = -1;

	@OriginalMember(owner = "client!ba", name = "Gb", descriptor = "I")
	public int anInt249 = -1;

	@OriginalMember(owner = "client!ba", name = "qb", descriptor = "I")
	private int anInt237 = 0;

	@OriginalMember(owner = "client!ba", name = "Db", descriptor = "I")
	private int anInt247 = 128;

	@OriginalMember(owner = "client!ba", name = "Cb", descriptor = "I")
	public int anInt246 = -1;

	@OriginalMember(owner = "client!ba", name = "Ob", descriptor = "I")
	private int anInt253 = 128;

	@OriginalMember(owner = "client!ba", name = "vb", descriptor = "I")
	public int anInt240 = -1;

	@OriginalMember(owner = "client!ba", name = "tb", descriptor = "Lclient!he;")
	public Class26 aClass26_136 = Static57.aClass26_865;

	@OriginalMember(owner = "client!ba", name = "Kb", descriptor = "I")
	private int anInt252 = 0;

	@OriginalMember(owner = "client!ba", name = "Hb", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
	public int anInt231 = -1;

	@OriginalMember(owner = "client!ba", name = "Sb", descriptor = "I")
	public int anInt254 = 32;

	@OriginalMember(owner = "client!ba", name = "Jb", descriptor = "I")
	private int anInt251 = -1;

	@OriginalMember(owner = "client!ba", name = "Ib", descriptor = "I")
	private int anInt250 = -1;

	@OriginalMember(owner = "client!ba", name = "Qb", descriptor = "Z")
	public boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ba", name = "lb", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!uc;Lclient!uc;II)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method133(@OriginalArg(1) Class3_Sub1_Sub17 arg0, @OriginalArg(2) Class3_Sub1_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray27 != null) {
			@Pc(16) Class3_Sub1_Sub3 local16 = this.method140();
			return local16 == null ? null : local16.method133(arg0, arg1, arg2, arg3);
		}
		@Pc(36) Class3_Sub1_Sub5_Sub7 local36 = (Class3_Sub1_Sub5_Sub7) Static24.aClass66_11.method1970((long) this.anInt245);
		if (local36 == null) {
			@Pc(40) boolean local40 = false;
			for (@Pc(42) int local42 = 0; local42 < this.anIntArray28.length; local42++) {
				if (!Static28.aClass16_40.method559(this.anIntArray28[local42], 0)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(70) Class3_Sub1_Sub5_Sub2[] local70 = new Class3_Sub1_Sub5_Sub2[this.anIntArray28.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray28.length; local72++) {
				local70[local72] = Static34.method676(Static28.aClass16_40, this.anIntArray28[local72]);
			}
			@Pc(98) Class3_Sub1_Sub5_Sub2 local98;
			if (local70.length == 1) {
				local98 = local70[0];
			} else {
				local98 = new Class3_Sub1_Sub5_Sub2(local70, local70.length);
			}
			if (this.aShortArray4 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.aShortArray4.length; local112++) {
					local98.method693(this.aShortArray4[local112], this.aShortArray5[local112]);
				}
			}
			local36 = local98.method688(this.anInt237 + 64, this.anInt252 + 850, -30, -50, -30);
			Static24.aClass66_11.method1969((long) this.anInt245, local36);
		}
		@Pc(169) Class3_Sub1_Sub5_Sub7 local169;
		if (arg0 != null && arg1 != null) {
			local169 = arg0.method2119(local36, arg2, arg1, arg3);
		} else if (arg0 != null) {
			local169 = arg0.method2117(arg3, local36);
		} else if (arg1 == null) {
			local169 = local36.method1481(true);
		} else {
			local169 = arg1.method2117(arg2, local36);
		}
		if (this.anInt247 != 128 || this.anInt253 != 128) {
			local169.method1476(this.anInt247, this.anInt253, this.anInt247);
		}
		return local169;
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
	public void method134() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!m;)V")
	public void method135(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method981();
			if (local13 == 0) {
				return;
			}
			this.method138(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!m;II)V")
	private void method138(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg1 == 1) {
			local15 = arg0.method981();
			this.anIntArray28 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray28[local21] = arg0.method974();
			}
		} else if (arg1 == 2) {
			this.aClass26_136 = arg0.method977();
		} else if (arg1 == 12) {
			this.anInt227 = arg0.method981();
		} else if (arg1 == 13) {
			this.anInt249 = arg0.method974();
		} else if (arg1 == 14) {
			this.anInt232 = arg0.method974();
		} else if (arg1 == 15) {
			this.anInt235 = arg0.method974();
		} else if (arg1 == 16) {
			this.anInt231 = arg0.method974();
		} else if (arg1 == 17) {
			this.anInt232 = arg0.method974();
			this.anInt246 = arg0.method974();
			this.anInt228 = arg0.method974();
			this.anInt229 = arg0.method974();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass26Array3[arg1 - 30] = arg0.method977();
			if (this.aClass26Array3[arg1 - 30].method832(Static49.aClass26_787)) {
				this.aClass26Array3[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local15 = arg0.method981();
			this.aShortArray5 = new short[local15];
			this.aShortArray4 = new short[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.aShortArray4[local21] = (short) arg0.method974();
				this.aShortArray5[local21] = (short) arg0.method974();
			}
		} else if (arg1 == 60) {
			local15 = arg0.method981();
			this.anIntArray29 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray29[local21] = arg0.method974();
			}
		} else if (arg1 == 93) {
			this.aBoolean19 = false;
		} else if (arg1 == 95) {
			this.anInt240 = arg0.method974();
		} else if (arg1 == 97) {
			this.anInt247 = arg0.method974();
		} else if (arg1 == 98) {
			this.anInt253 = arg0.method974();
		} else if (arg1 == 99) {
			this.aBoolean20 = true;
		} else if (arg1 == 100) {
			this.anInt237 = arg0.method994();
		} else if (arg1 == 101) {
			this.anInt252 = arg0.method994() * 5;
		} else if (arg1 == 102) {
			this.anInt230 = arg0.method974();
		} else if (arg1 == 103) {
			this.anInt254 = arg0.method974();
		} else if (arg1 == 106) {
			this.anInt250 = arg0.method974();
			if (this.anInt250 == 65535) {
				this.anInt250 = -1;
			}
			this.anInt251 = arg0.method974();
			if (this.anInt251 == 65535) {
				this.anInt251 = -1;
			}
			local15 = arg0.method981();
			this.anIntArray27 = new int[local15 + 1];
			for (local21 = 0; local21 <= local15; local21++) {
				this.anIntArray27[local21] = arg0.method974();
				if (this.anIntArray27[local21] == 65535) {
					this.anIntArray27[local21] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean21 = false;
		} else if (arg1 == 109) {
			this.aBoolean18 = false;
		}
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method139() {
		if (this.anIntArray27 != null) {
			@Pc(12) Class3_Sub1_Sub3 local12 = this.method140();
			return local12 == null ? null : local12.method139();
		} else if (this.anIntArray29 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray29.length; local29++) {
				if (!Static28.aClass16_40.method559(this.anIntArray29[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class3_Sub1_Sub5_Sub2[] local61 = new Class3_Sub1_Sub5_Sub2[this.anIntArray29.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray29.length; local63++) {
				local61[local63] = Static34.method676(Static28.aClass16_40, this.anIntArray29[local63]);
			}
			@Pc(98) Class3_Sub1_Sub5_Sub2 local98;
			if (local61.length == 1) {
				local98 = local61[0];
			} else {
				local98 = new Class3_Sub1_Sub5_Sub2(local61, local61.length);
			}
			if (this.aShortArray4 != null) {
				for (@Pc(109) int local109 = 0; local109 < this.aShortArray4.length; local109++) {
					local98.method693(this.aShortArray4[local109], this.aShortArray5[local109]);
				}
			}
			return local98;
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lclient!ba;")
	public Class3_Sub1_Sub3 method140() {
		@Pc(12) int local12 = -1;
		if (this.anInt250 != -1) {
			local12 = Static93.method1693(this.anInt250);
		} else if (this.anInt251 != -1) {
			local12 = Static52.anIntArray159[this.anInt251];
		}
		return local12 < 0 || local12 >= this.anIntArray27.length || this.anIntArray27[local12] == -1 ? null : Static115.method2083(this.anIntArray27[local12]);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)Z")
	public boolean method141() {
		if (this.anIntArray27 == null) {
			return true;
		}
		@Pc(18) int local18 = -1;
		if (this.anInt250 != -1) {
			local18 = Static93.method1693(this.anInt250);
		} else if (this.anInt251 != -1) {
			local18 = Static52.anIntArray159[this.anInt251];
		}
		return local18 >= 0 && local18 < this.anIntArray27.length && this.anIntArray27[local18] != -1;
	}
}
