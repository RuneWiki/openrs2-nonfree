import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!td", name = "Fb", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!td", name = "Yb", descriptor = "I")
	public int anInt2522;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
	public int anInt2495 = 32;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
	public int anInt2496 = -1;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
	private int anInt2492 = 0;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	public int anInt2494 = -1;

	@OriginalMember(owner = "client!td", name = "rb", descriptor = "[Lclient!ad;")
	public final Class4[] aClass4Array19 = new Class4[5];

	@OriginalMember(owner = "client!td", name = "Cb", descriptor = "Z")
	public boolean aBoolean214 = true;

	@OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
	public int anInt2498 = -1;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "I")
	public int anInt2493 = -1;

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
	public int anInt2499 = -1;

	@OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
	public int anInt2504 = -1;

	@OriginalMember(owner = "client!td", name = "Sb", descriptor = "I")
	public int anInt2519 = -1;

	@OriginalMember(owner = "client!td", name = "Lb", descriptor = "I")
	private int anInt2513 = 0;

	@OriginalMember(owner = "client!td", name = "Tb", descriptor = "I")
	private int anInt2520 = 128;

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
	private int anInt2500 = 128;

	@OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
	private int anInt2506 = -1;

	@OriginalMember(owner = "client!td", name = "Ob", descriptor = "I")
	public int anInt2516 = 1;

	@OriginalMember(owner = "client!td", name = "Mb", descriptor = "I")
	private int anInt2514 = -1;

	@OriginalMember(owner = "client!td", name = "cc", descriptor = "Z")
	public boolean aBoolean215 = true;

	@OriginalMember(owner = "client!td", name = "ec", descriptor = "I")
	public int anInt2525 = -1;

	@OriginalMember(owner = "client!td", name = "ac", descriptor = "I")
	public int anInt2523 = -1;

	@OriginalMember(owner = "client!td", name = "dc", descriptor = "Lclient!ad;")
	public Class4 aClass4_1390 = Static5.aClass4_117;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)Lclient!td;")
	public Class3_Sub1_Sub17 method1676() {
		@Pc(1) int local1 = -1;
		if (this.anInt2514 != -1) {
			local1 = Static1.method3(this.anInt2514);
		} else if (this.anInt2506 != -1) {
			local1 = Static106.anIntArray329[this.anInt2506];
		}
		return local1 < 0 || this.anIntArray307.length <= local1 || this.anIntArray307[local1] == -1 ? null : Static44.method810(this.anIntArray307[local1]);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!gb;I)V")
	public void method1677(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method446();
			if (local9 == 0) {
				return;
			}
			this.method1681(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!m;Lclient!m;II)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1680(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub6 arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray307 != null) {
			@Pc(12) Class3_Sub1_Sub17 local12 = this.method1676();
			return local12 == null ? null : local12.method1680(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class3_Sub1_Sub1_Sub4 local32 = (Class3_Sub1_Sub1_Sub4) Static86.aClass8_25.method195((long) this.anInt2522);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray308.length; local38++) {
				if (!Static27.aClass64_24.method1633(this.anIntArray308[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class3_Sub1_Sub1_Sub4[] local70 = new Class3_Sub1_Sub1_Sub4[this.anIntArray308.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray308.length; local72++) {
				local70[local72] = Static41.method789(Static27.aClass64_24, this.anIntArray308[local72]);
			}
			if (local70.length == 1) {
				local32 = local70[0];
			} else {
				local32 = new Class3_Sub1_Sub1_Sub4(local70, local70.length);
			}
			if (this.anIntArray309 != null) {
				for (@Pc(114) int local114 = 0; local114 < this.anIntArray309.length; local114++) {
					local32.method771(this.anIntArray309[local114], this.anIntArray306[local114]);
				}
			}
			local32.method768();
			local32.method781(this.anInt2513 + 64, this.anInt2492 + 850, -30, -50, -30, true);
			Static86.aClass8_25.method199((long) this.anInt2522, local32);
		}
		@Pc(175) Class3_Sub1_Sub1_Sub4 local175;
		if (arg1 != null && arg2 != null) {
			local175 = arg1.method1080(arg3, arg2, local32, arg0);
		} else if (arg1 != null) {
			local175 = arg1.method1075(local32, arg0);
		} else if (arg2 == null) {
			local175 = local32.method788(true);
		} else {
			local175 = arg2.method1075(local32, arg3);
		}
		if (this.anInt2500 != 128 || this.anInt2520 != 128) {
			local175.method763(this.anInt2500, this.anInt2520, this.anInt2500);
		}
		return local175;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!gb;)V")
	private void method1681(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local8 = arg1.method446();
			this.anIntArray308 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray308[local14] = arg1.method459();
			}
		} else if (arg0 == 2) {
			this.aClass4_1390 = arg1.method417();
		} else if (arg0 == 12) {
			this.anInt2516 = arg1.method446();
		} else if (arg0 == 13) {
			this.anInt2523 = arg1.method459();
		} else if (arg0 == 14) {
			this.anInt2519 = arg1.method459();
		} else if (arg0 == 15) {
			this.anInt2504 = arg1.method459();
		} else if (arg0 == 16) {
			this.anInt2499 = arg1.method459();
		} else if (arg0 == 17) {
			this.anInt2519 = arg1.method459();
			this.anInt2493 = arg1.method459();
			this.anInt2498 = arg1.method459();
			this.anInt2496 = arg1.method459();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass4Array19[arg0 - 30] = arg1.method417();
			if (this.aClass4Array19[arg0 - 30].method160(Static61.aClass4_783)) {
				this.aClass4Array19[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local8 = arg1.method446();
			this.anIntArray309 = new int[local8];
			this.anIntArray306 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray309[local14] = arg1.method459();
				this.anIntArray306[local14] = arg1.method459();
			}
		} else if (arg0 == 60) {
			local8 = arg1.method446();
			this.anIntArray310 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray310[local14] = arg1.method459();
			}
		} else if (arg0 == 93) {
			this.aBoolean215 = false;
		} else if (arg0 == 95) {
			this.anInt2525 = arg1.method459();
		} else if (arg0 == 97) {
			this.anInt2500 = arg1.method459();
		} else if (arg0 == 98) {
			this.anInt2520 = arg1.method459();
		} else if (arg0 == 99) {
			this.aBoolean213 = true;
		} else if (arg0 == 100) {
			this.anInt2513 = arg1.method434();
		} else if (arg0 == 101) {
			this.anInt2492 = arg1.method434() * 5;
		} else if (arg0 == 102) {
			this.anInt2494 = arg1.method459();
		} else if (arg0 == 103) {
			this.anInt2495 = arg1.method459();
		} else if (arg0 == 106) {
			this.anInt2514 = arg1.method459();
			if (this.anInt2514 == 65535) {
				this.anInt2514 = -1;
			}
			this.anInt2506 = arg1.method459();
			if (this.anInt2506 == 65535) {
				this.anInt2506 = -1;
			}
			local8 = arg1.method446();
			this.anIntArray307 = new int[local8 + 1];
			for (local14 = 0; local14 <= local8; local14++) {
				this.anIntArray307[local14] = arg1.method459();
				if (this.anIntArray307[local14] == 65535) {
					this.anIntArray307[local14] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean214 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1683() {
		if (this.anIntArray307 != null) {
			@Pc(12) Class3_Sub1_Sub17 local12 = this.method1676();
			return local12 == null ? null : local12.method1683();
		} else if (this.anIntArray310 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray310.length; local29++) {
				if (!Static27.aClass64_24.method1633(this.anIntArray310[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class3_Sub1_Sub1_Sub4[] local57 = new Class3_Sub1_Sub1_Sub4[this.anIntArray310.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray310.length; local59++) {
				local57[local59] = Static41.method789(Static27.aClass64_24, this.anIntArray310[local59]);
			}
			@Pc(94) Class3_Sub1_Sub1_Sub4 local94;
			if (local57.length == 1) {
				local94 = local57[0];
			} else {
				local94 = new Class3_Sub1_Sub1_Sub4(local57, local57.length);
			}
			if (this.anIntArray309 != null) {
				for (@Pc(105) int local105 = 0; local105 < this.anIntArray309.length; local105++) {
					local94.method771(this.anIntArray309[local105], this.anIntArray306[local105]);
				}
			}
			return local94;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
	public void method1684() {
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)Z")
	public boolean method1685() {
		if (this.anIntArray307 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2514 != -1) {
			local10 = Static1.method3(this.anInt2514);
		} else if (this.anInt2506 != -1) {
			local10 = Static106.anIntArray329[this.anInt2506];
		}
		return local10 >= 0 && local10 < this.anIntArray307.length && this.anIntArray307[local10] != -1;
	}
}
