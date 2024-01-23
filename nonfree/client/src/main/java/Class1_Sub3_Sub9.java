import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "Lclient!a;")
	private Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "Lclient!a;")
	private Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!a;")
	private Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "[Lclient!a;")
	private Class1_Sub1[] aClass1_Sub1Array19;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class1_Sub3_Sub9(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method2199();
		@Pc(9) int local9 = 0;
		this.aClass1_Sub1Array19 = new Class1_Sub1[local7];
		@Pc(16) int[][] local16 = new int[local7][];
		@Pc(18) int local18 = 0;
		@Pc(20) int local20;
		@Pc(27) Class1_Sub1 local27;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = Static289.method4433(arg0);
			if (local27.method4725() >= 0) {
				local9++;
			}
			if (local27.method4723() >= 0) {
				local18++;
			}
			local48 = local27.aClass1_Sub1Array42.length;
			local16[local20] = new int[local48];
			for (local55 = 0; local55 < local48; local55++) {
				local16[local20][local55] = arg0.method2199();
			}
			this.aClass1_Sub1Array19[local20] = local27;
		}
		this.anIntArray273 = new int[local18];
		this.anIntArray272 = new int[local9];
		local9 = 0;
		local18 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = this.aClass1_Sub1Array19[local20];
			local48 = local27.aClass1_Sub1Array42.length;
			for (local55 = 0; local55 < local48; local55++) {
				local27.aClass1_Sub1Array42[local55] = this.aClass1_Sub1Array19[local16[local20][local55]];
			}
			local55 = local27.method4725();
			@Pc(139) int local139 = local27.method4723();
			if (local55 > 0) {
				this.anIntArray272[local9++] = local55;
			}
			if (local139 > 0) {
				this.anIntArray273[local18++] = local139;
			}
			local16[local20] = null;
		}
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array19[arg0.method2199()];
		local16 = null;
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array19[arg0.method2199()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array19[arg0.method2199()];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!la;IZIDZLclient!th;B)[I")
	public int[] method2032(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class168 arg6) {
		@Pc(6) int[] local6 = new int[arg3 * arg1];
		Static198.method3184(arg4);
		Static16.aClass168_19 = arg6;
		Static252.anInterface3_1 = arg0;
		Static269.method4050(arg1, arg3);
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.aClass1_Sub1Array19.length; local38++) {
			this.aClass1_Sub1Array19[local38].method4711(arg1, arg3);
		}
		@Pc(64) int local64;
		@Pc(66) byte local66;
		if (arg5) {
			local38 = arg1 - 1;
			local64 = -1;
			local66 = -1;
		} else {
			local38 = 0;
			local64 = arg1;
			local66 = 1;
		}
		@Pc(78) int local78 = 0;
		@Pc(80) int local80;
		for (local80 = 0; local80 < arg3; local80++) {
			if (arg2) {
				local78 = local80;
			}
			@Pc(101) int[] local101;
			@Pc(109) int[] local109;
			@Pc(105) int[] local105;
			if (this.aClass1_Sub1_3.aBoolean410) {
				@Pc(117) int[] local117 = this.aClass1_Sub1_3.method4717(local80);
				local105 = local117;
				local109 = local117;
				local101 = local117;
			} else {
				@Pc(97) int[][] local97 = this.aClass1_Sub1_3.method4714(local80);
				local101 = local97[0];
				local105 = local97[2];
				local109 = local97[1];
			}
			for (@Pc(125) int local125 = local38; local125 != local64; local125 += local66) {
				@Pc(134) int local134 = local109[local125] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				local134 = Static198.anIntArray388[local134];
				@Pc(158) int local158 = local105[local125] >> 4;
				@Pc(164) int local164 = local101[local125] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				if (local158 < 0) {
					local158 = 0;
				}
				if (local164 > 255) {
					local164 = 255;
				}
				if (local164 < 0) {
					local164 = 0;
				}
				local164 = Static198.anIntArray388[local164];
				local158 = Static198.anIntArray388[local158];
				local6[local78++] = local158 + (local164 << 16) + (local134 << 8);
				if (arg2) {
					local78 += arg1 - 1;
				}
			}
		}
		for (local80 = 0; local80 < this.aClass1_Sub1Array19.length; local80++) {
			this.aClass1_Sub1Array19[local80].method4726();
		}
		return local6;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(DLclient!th;IZILclient!la;I)[I")
	public int[] method2033(@OriginalArg(0) double arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5) {
		Static198.method3184(arg0);
		Static252.anInterface3_1 = arg4;
		Static16.aClass168_19 = arg1;
		@Pc(19) int[] local19 = new int[arg3 * 4 * arg5];
		Static269.method4050(arg3, arg5);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.aClass1_Sub1Array19.length; local27++) {
			this.aClass1_Sub1Array19[local27].method4711(arg3, arg5);
		}
		local27 = 0;
		@Pc(51) int local51;
		for (local51 = 0; local51 < arg5; local51++) {
			@Pc(76) int[] local76;
			@Pc(72) int[] local72;
			@Pc(68) int[] local68;
			@Pc(86) int[] local86;
			if (this.aClass1_Sub1_3.aBoolean410) {
				local86 = this.aClass1_Sub1_3.method4717(local51);
				local68 = local86;
				local76 = local86;
				local72 = local86;
			} else {
				@Pc(64) int[][] local64 = this.aClass1_Sub1_3.method4714(local51);
				local68 = local64[2];
				local72 = local64[1];
				local76 = local64[0];
			}
			if (arg2) {
				local27 = local51;
			}
			if (this.aClass1_Sub1_2.aBoolean410) {
				local86 = this.aClass1_Sub1_2.method4717(local51);
			} else {
				local86 = this.aClass1_Sub1_2.method4714(local51)[0];
			}
			for (@Pc(120) int local120 = arg3 - 1; local120 >= 0; local120--) {
				@Pc(129) int local129 = local72[local120] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(149) int local149 = local76[local120] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				@Pc(163) int local163 = local68[local120] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local129 = Static198.anIntArray388[local129];
				if (local163 < 0) {
					local163 = 0;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				local163 = Static198.anIntArray388[local163];
				local149 = Static198.anIntArray388[local149];
				@Pc(215) int local215;
				if (local149 == 0 && local129 == 0 && local163 == 0) {
					local215 = 0;
				} else {
					local215 = local86[local120] >> 4;
					if (local215 > 255) {
						local215 = 255;
					}
					if (local215 < 0) {
						local215 = 0;
					}
				}
				local19[local27++] = local163 + (local129 << 8) + (local215 << 24) + (local149 << 16);
				if (arg2) {
					local27 += arg3 - 1;
				}
			}
		}
		for (local51 = 0; local51 < this.aClass1_Sub1Array19.length; local51++) {
			this.aClass1_Sub1Array19[local51].method4726();
		}
		return local19;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILclient!la;IIDLclient!th;)Lclient!si;")
	public Class1_Sub3_Sub13_Sub2 method2035(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) double arg3, @OriginalArg(6) Class168 arg4) {
		Static198.method3184(arg3);
		Static16.aClass168_19 = arg4;
		Static252.anInterface3_1 = arg1;
		Static269.method4050(arg2, arg0);
		@Pc(22) Class1_Sub3_Sub13_Sub2 local22 = new Class1_Sub3_Sub13_Sub2(arg2, arg0);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub1Array19.length; local24++) {
			this.aClass1_Sub1Array19[local24].method4711(arg2, arg0);
		}
		local24 = 0;
		@Pc(59) int local59;
		for (local59 = 0; local59 < arg0; local59++) {
			@Pc(82) int[] local82;
			@Pc(78) int[] local78;
			@Pc(80) int[] local80;
			if (this.aClass1_Sub1_3.aBoolean410) {
				@Pc(76) int[] local76 = this.aClass1_Sub1_3.method4717(local59);
				local78 = local76;
				local80 = local76;
				local82 = local76;
			} else {
				@Pc(90) int[][] local90 = this.aClass1_Sub1_3.method4714(local59);
				local80 = local90[2];
				local78 = local90[1];
				local82 = local90[0];
			}
			for (@Pc(106) int local106 = arg2 - 1; local106 >= 0; local106--) {
				@Pc(114) int local114 = local82[local106] >> 4;
				if (local114 > 255) {
					local114 = 255;
				}
				if (local114 < 0) {
					local114 = 0;
				}
				@Pc(132) int local132 = local78[local106] >> 4;
				@Pc(138) int local138 = local80[local106] >> 4;
				local114 = Static198.anIntArray388[local114];
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				local132 = Static198.anIntArray388[local132];
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				local138 = Static198.anIntArray388[local138];
				local22.anIntArray504[local24++] = local138 + (local132 << 8) + (local114 << 16);
			}
		}
		for (local59 = 0; local59 < this.aClass1_Sub1Array19.length; local59++) {
			this.aClass1_Sub1Array19[local59].method4726();
		}
		return local22;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!la;BIIDLclient!th;)Lclient!uc;")
	public Class1_Sub3_Sub13_Sub2_Sub1 method2036(@OriginalArg(1) Interface3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) double arg3, @OriginalArg(6) Class168 arg4) {
		Static198.method3184(arg3);
		Static252.anInterface3_1 = arg0;
		Static16.aClass168_19 = arg4;
		Static269.method4050(arg1, arg2);
		@Pc(31) Class1_Sub3_Sub13_Sub2_Sub1 local31 = new Class1_Sub3_Sub13_Sub2_Sub1(arg1, arg2);
		@Pc(33) int local33;
		for (local33 = 0; local33 < this.aClass1_Sub1Array19.length; local33++) {
			this.aClass1_Sub1Array19[local33].method4711(arg1, arg2);
		}
		local33 = 0;
		@Pc(57) int local57;
		for (local57 = 0; local57 < arg2; local57++) {
			@Pc(82) int[] local82;
			@Pc(86) int[] local86;
			@Pc(84) int[] local84;
			@Pc(80) int[] local80;
			if (this.aClass1_Sub1_3.aBoolean410) {
				local80 = this.aClass1_Sub1_3.method4717(local57);
				local82 = local80;
				local84 = local80;
				local86 = local80;
			} else {
				@Pc(94) int[][] local94 = this.aClass1_Sub1_3.method4714(local57);
				local84 = local94[2];
				local86 = local94[1];
				local82 = local94[0];
			}
			if (this.aClass1_Sub1_2.aBoolean410) {
				local80 = this.aClass1_Sub1_2.method4717(local57);
			} else {
				local80 = this.aClass1_Sub1_2.method4714(local57)[0];
			}
			for (@Pc(130) int local130 = arg1 - 1; local130 >= 0; local130--) {
				@Pc(141) int local141 = local82[local130] >> 4;
				@Pc(147) int local147 = local86[local130] >> 4;
				@Pc(153) int local153 = local84[local130] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				local141 = Static198.anIntArray388[local141];
				if (local153 > 255) {
					local153 = 255;
				}
				if (local147 > 255) {
					local147 = 255;
				}
				if (local153 < 0) {
					local153 = 0;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				local153 = Static198.anIntArray388[local153];
				local147 = Static198.anIntArray388[local147];
				@Pc(220) int local220;
				if (local141 == 0 && local147 == 0 && local153 == 0) {
					local220 = 0;
				} else {
					local220 = local80[local130] >> 4;
					if (local220 > 255) {
						local220 = 255;
					}
					if (local220 < 0) {
						local220 = 0;
					}
				}
				local31.anIntArray504[local33++] = (local147 << 8) + (local141 << 16) + (local220 << 24) + local153;
			}
		}
		for (local57 = 0; local57 < this.aClass1_Sub1Array19.length; local57++) {
			this.aClass1_Sub1Array19[local57].method4726();
		}
		return local31;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!th;ILclient!la;ZI)[F")
	public float[] method2037(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) float[] local8 = new float[arg4 * 4 * arg1];
		Static16.aClass168_19 = arg0;
		Static252.anInterface3_1 = arg2;
		Static269.method4050(arg4, arg1);
		@Pc(22) int local22;
		for (local22 = 0; local22 < this.aClass1_Sub1Array19.length; local22++) {
			this.aClass1_Sub1Array19[local22].method4711(arg4, arg1);
		}
		local22 = 0;
		@Pc(42) int local42;
		for (local42 = 0; local42 < arg1; local42++) {
			if (arg3) {
				local22 = local42 << 2;
			}
			@Pc(65) int[] local65;
			@Pc(63) int[] local63;
			@Pc(67) int[] local67;
			if (this.aClass1_Sub1_3.aBoolean410) {
				@Pc(61) int[] local61 = this.aClass1_Sub1_3.method4717(local42);
				local63 = local61;
				local65 = local61;
				local67 = local61;
			} else {
				@Pc(75) int[][] local75 = this.aClass1_Sub1_3.method4714(local42);
				local63 = local75[1];
				local67 = local75[2];
				local65 = local75[0];
			}
			@Pc(99) int[] local99;
			if (this.aClass1_Sub1_2.aBoolean410) {
				local99 = this.aClass1_Sub1_2.method4717(local42);
			} else {
				local99 = this.aClass1_Sub1_2.method4714(local42)[0];
			}
			@Pc(117) int[] local117;
			if (this.aClass1_Sub1_1.aBoolean410) {
				local117 = this.aClass1_Sub1_1.method4717(local42);
			} else {
				local117 = this.aClass1_Sub1_1.method4714(local42)[0];
			}
			for (@Pc(131) int local131 = arg4 - 1; local131 >= 0; local131--) {
				@Pc(141) float local141 = (float) local99[local131] / 4096.0F;
				if (local141 < 0.0F) {
					local141 = 0.0F;
				} else if (local141 > 1.0F) {
					local141 = 1.0F;
				}
				@Pc(169) float local169 = ((float) local117[local131] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local8[local22++] = (float) local65[local131] * local169;
				local8[local22++] = (float) local63[local131] * local169;
				local8[local22++] = local169 * (float) local67[local131];
				local8[local22++] = local141;
				if (arg3) {
					local22 += (arg4 << 2) - 4;
				}
			}
		}
		for (local42 = 0; local42 < this.aClass1_Sub1Array19.length; local42++) {
			this.aClass1_Sub1Array19[local42].method4726();
		}
		return local8;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!la;Lclient!th;)Z")
	public boolean method2039(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class168 arg1) {
		@Pc(24) int local24;
		if (Static200.anInt4361 > 0) {
			for (local24 = 0; local24 < this.anIntArray272.length; local24++) {
				if (!arg1.method4072(Static200.anInt4361, this.anIntArray272[local24])) {
					return false;
				}
			}
		} else {
			for (local24 = 0; local24 < this.anIntArray272.length; local24++) {
				if (!arg1.method4038(this.anIntArray272[local24])) {
					return false;
				}
			}
		}
		for (local24 = 0; local24 < this.anIntArray273.length; local24++) {
			if (!arg0.method4584(this.anIntArray273[local24])) {
				return false;
			}
		}
		return true;
	}
}
