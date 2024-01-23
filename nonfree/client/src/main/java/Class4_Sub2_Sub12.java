import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class4_Sub2_Sub12 extends Class4_Sub2 {

	@OriginalMember(owner = "client!kj", name = "E", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "Lclient!oa;")
	private Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "Lclient!oa;")
	private Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Lclient!oa;")
	private Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!kj", name = "M", descriptor = "[Lclient!oa;")
	private Class4_Sub1[] aClass4_Sub1Array21;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class4_Sub2_Sub12(@OriginalArg(0) Class4_Sub24 arg0) {
		@Pc(7) int local7 = arg0.method3110();
		this.aClass4_Sub1Array21 = new Class4_Sub1[local7];
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(20) int local20;
		@Pc(31) Class4_Sub1 local31;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = Static81.method1393(arg0);
			if (local31.method4548() >= 0) {
				local13++;
			}
			if (local31.method4541() >= 0) {
				local15++;
			}
			local50 = local31.aClass4_Sub1Array42.length;
			local18[local20] = new int[local50];
			for (local57 = 0; local57 < local50; local57++) {
				local18[local20][local57] = arg0.method3110();
			}
			this.aClass4_Sub1Array21[local20] = local31;
		}
		this.anIntArray234 = new int[local15];
		local15 = 0;
		this.anIntArray235 = new int[local13];
		local13 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = this.aClass4_Sub1Array21[local20];
			local50 = local31.aClass4_Sub1Array42.length;
			for (local57 = 0; local57 < local50; local57++) {
				local31.aClass4_Sub1Array42[local57] = this.aClass4_Sub1Array21[local18[local20][local57]];
			}
			local57 = local31.method4548();
			@Pc(145) int local145 = local31.method4541();
			if (local57 > 0) {
				this.anIntArray235[local13++] = local57;
			}
			if (local145 > 0) {
				this.anIntArray234[local15++] = local145;
			}
			local18[local20] = null;
		}
		local18 = null;
		this.aClass4_Sub1_2 = this.aClass4_Sub1Array21[arg0.method3110()];
		this.aClass4_Sub1_1 = this.aClass4_Sub1Array21[arg0.method3110()];
		this.aClass4_Sub1_3 = this.aClass4_Sub1Array21[arg0.method3110()];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!cg;Lclient!mh;)Z")
	public boolean method2319(@OriginalArg(1) Class22 arg0, @OriginalArg(2) Interface4 arg1) {
		@Pc(12) int local12;
		if (Static115.anInt2344 > 0) {
			for (local12 = 0; local12 < this.anIntArray235.length; local12++) {
				if (!arg0.method653(this.anIntArray235[local12], Static115.anInt2344)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray235.length; local12++) {
				if (!arg0.method656(this.anIntArray235[local12])) {
					return false;
				}
			}
		}
		for (@Pc(68) int local68 = 0; local68 < this.anIntArray234.length; local68++) {
			if (!arg1.method2414(this.anIntArray234[local68])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!mh;IZIDLclient!cg;I)Lclient!n;")
	public Class4_Sub2_Sub4_Sub2 method2320(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) double arg2, @OriginalArg(5) Class22 arg3, @OriginalArg(6) int arg4) {
		Static202.method3250(arg2);
		Static255.aClass22_85 = arg3;
		Static68.anInterface4_2 = arg0;
		Static28.method588(arg1, arg4);
		@Pc(28) Class4_Sub2_Sub4_Sub2 local28 = new Class4_Sub2_Sub4_Sub2(arg1, arg4);
		@Pc(30) int local30;
		for (local30 = 0; local30 < this.aClass4_Sub1Array21.length; local30++) {
			this.aClass4_Sub1Array21[local30].method4536(arg4, arg1);
		}
		local30 = 0;
		@Pc(52) int local52;
		for (local52 = 0; local52 < arg4; local52++) {
			@Pc(78) int[] local78;
			@Pc(76) int[] local76;
			@Pc(80) int[] local80;
			if (this.aClass4_Sub1_2.aBoolean392) {
				@Pc(74) int[] local74 = this.aClass4_Sub1_2.method4544(local52);
				local76 = local74;
				local78 = local74;
				local80 = local74;
			} else {
				@Pc(88) int[][] local88 = this.aClass4_Sub1_2.method4542(local52);
				local76 = local88[1];
				local80 = local88[2];
				local78 = local88[0];
			}
			for (@Pc(102) int local102 = 0; local102 != arg1; local102++) {
				@Pc(115) int local115 = local78[local102] >> 4;
				if (local115 > 255) {
					local115 = 255;
				}
				if (local115 < 0) {
					local115 = 0;
				}
				@Pc(133) int local133 = local80[local102] >> 4;
				local115 = Static244.anIntArray382[local115];
				if (local133 > 255) {
					local133 = 255;
				}
				@Pc(150) int local150 = local76[local102] >> 4;
				if (local133 < 0) {
					local133 = 0;
				}
				if (local150 > 255) {
					local150 = 255;
				}
				if (local150 < 0) {
					local150 = 0;
				}
				local133 = Static244.anIntArray382[local133];
				local150 = Static244.anIntArray382[local150];
				local28.anIntArray409[local30++] = (local115 << 16) + (local150 << 8) + local133;
			}
		}
		for (local52 = 0; local52 < this.aClass4_Sub1Array21.length; local52++) {
			this.aClass4_Sub1Array21[local52].method4547();
		}
		return local28;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(DIZLclient!mh;ZBILclient!cg;)[I")
	public int[] method2322(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6) {
		Static202.method3250(arg0);
		Static255.aClass22_85 = arg6;
		@Pc(15) int[] local15 = new int[arg5 * arg1];
		Static68.anInterface4_2 = arg3;
		Static28.method588(arg1, arg5);
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass4_Sub1Array21.length; local25++) {
			this.aClass4_Sub1Array21[local25].method4536(arg5, arg1);
		}
		@Pc(51) int local51;
		@Pc(45) byte local45;
		if (arg2) {
			local45 = -1;
			local25 = arg1 - 1;
			local51 = -1;
		} else {
			local45 = 1;
			local51 = arg1;
			local25 = 0;
		}
		@Pc(61) int local61 = 0;
		@Pc(70) int local70;
		for (local70 = 0; local70 < arg5; local70++) {
			if (arg4) {
				local61 = local70;
			}
			@Pc(100) int[] local100;
			@Pc(96) int[] local96;
			@Pc(92) int[] local92;
			if (this.aClass4_Sub1_2.aBoolean392) {
				@Pc(108) int[] local108 = this.aClass4_Sub1_2.method4544(local70);
				local96 = local108;
				local92 = local108;
				local100 = local108;
			} else {
				@Pc(88) int[][] local88 = this.aClass4_Sub1_2.method4542(local70);
				local92 = local88[2];
				local96 = local88[1];
				local100 = local88[0];
			}
			for (@Pc(116) int local116 = local25; local116 != local51; local116 += local45) {
				@Pc(129) int local129 = local100[local116] >> 4;
				@Pc(135) int local135 = local96[local116] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				@Pc(147) int local147 = local92[local116] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				local147 = Static244.anIntArray382[local147];
				local129 = Static244.anIntArray382[local129];
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				local135 = Static244.anIntArray382[local135];
				local15[local61++] = local147 + (local129 << 16) + (local135 << 8);
				if (arg4) {
					local61 += arg1 - 1;
				}
			}
		}
		for (local70 = 0; local70 < this.aClass4_Sub1Array21.length; local70++) {
			this.aClass4_Sub1Array21[local70].method4547();
		}
		return local15;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!mh;ILclient!cg;IIZ)[F")
	public float[] method2323(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		Static255.aClass22_85 = arg2;
		Static68.anInterface4_2 = arg0;
		@Pc(12) float[] local12 = new float[arg3 * 4 * arg1];
		Static28.method588(arg1, arg3);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.aClass4_Sub1Array21.length; local27++) {
			this.aClass4_Sub1Array21[local27].method4536(arg3, arg1);
		}
		local27 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < arg3; local47++) {
			if (arg4) {
				local27 = local47 << 2;
			}
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			@Pc(79) int[] local79;
			if (this.aClass4_Sub1_2.aBoolean392) {
				@Pc(87) int[] local87 = this.aClass4_Sub1_2.method4544(local47);
				local79 = local87;
				local75 = local87;
				local71 = local87;
			} else {
				@Pc(67) int[][] local67 = this.aClass4_Sub1_2.method4542(local47);
				local71 = local67[1];
				local75 = local67[0];
				local79 = local67[2];
			}
			@Pc(105) int[] local105;
			if (this.aClass4_Sub1_1.aBoolean392) {
				local105 = this.aClass4_Sub1_1.method4544(local47);
			} else {
				local105 = this.aClass4_Sub1_1.method4542(local47)[0];
			}
			@Pc(125) int[] local125;
			if (this.aClass4_Sub1_3.aBoolean392) {
				local125 = this.aClass4_Sub1_3.method4544(local47);
			} else {
				local125 = this.aClass4_Sub1_3.method4542(local47)[0];
			}
			for (@Pc(137) int local137 = arg1 - 1; local137 >= 0; local137--) {
				@Pc(149) float local149 = (float) local105[local137] / 4096.0F;
				@Pc(162) float local162 = ((float) local125[local137] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local12[local27++] = local162 * (float) local75[local137];
				local12[local27++] = (float) local71[local137] * local162;
				local12[local27++] = (float) local79[local137] * local162;
				if (local149 < 0.0F) {
					local149 = 0.0F;
				} else if (local149 > 1.0F) {
					local149 = 1.0F;
				}
				local12[local27++] = local149;
				if (arg4) {
					local27 += (arg1 << 2) - 4;
				}
			}
		}
		for (local47 = 0; local47 < this.aClass4_Sub1Array21.length; local47++) {
			this.aClass4_Sub1Array21[local47].method4547();
		}
		return local12;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILclient!mh;Lclient!cg;ZID)Lclient!tk;")
	public Class4_Sub2_Sub4_Sub2_Sub1 method2324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(6) double arg4) {
		Static202.method3250(arg4);
		Static255.aClass22_85 = arg3;
		Static68.anInterface4_2 = arg2;
		Static28.method588(arg1, arg0);
		@Pc(22) Class4_Sub2_Sub4_Sub2_Sub1 local22 = new Class4_Sub2_Sub4_Sub2_Sub1(arg1, arg0);
		@Pc(30) int local30;
		for (local30 = 0; local30 < this.aClass4_Sub1Array21.length; local30++) {
			this.aClass4_Sub1Array21[local30].method4536(arg0, arg1);
		}
		local30 = 0;
		@Pc(54) int local54;
		for (local54 = 0; local54 < arg0; local54++) {
			@Pc(79) int[] local79;
			@Pc(83) int[] local83;
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			if (this.aClass4_Sub1_2.aBoolean392) {
				local77 = this.aClass4_Sub1_2.method4544(local54);
				local79 = local77;
				local81 = local77;
				local83 = local77;
			} else {
				@Pc(91) int[][] local91 = this.aClass4_Sub1_2.method4542(local54);
				local83 = local91[1];
				local81 = local91[2];
				local79 = local91[0];
			}
			if (this.aClass4_Sub1_1.aBoolean392) {
				local77 = this.aClass4_Sub1_1.method4544(local54);
			} else {
				local77 = this.aClass4_Sub1_1.method4542(local54)[0];
			}
			for (@Pc(127) int local127 = arg1 - 1; local127 >= 0; local127--) {
				@Pc(138) int local138 = local83[local127] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				@Pc(150) int local150 = local81[local127] >> 4;
				if (local138 < 0) {
					local138 = 0;
				}
				if (local150 > 255) {
					local150 = 255;
				}
				local138 = Static244.anIntArray382[local138];
				@Pc(174) int local174 = local79[local127] >> 4;
				if (local150 < 0) {
					local150 = 0;
				}
				local150 = Static244.anIntArray382[local150];
				if (local174 > 255) {
					local174 = 255;
				}
				if (local174 < 0) {
					local174 = 0;
				}
				local174 = Static244.anIntArray382[local174];
				@Pc(212) int local212;
				if (local174 == 0 && local138 == 0 && local150 == 0) {
					local212 = 0;
				} else {
					local212 = local77[local127] >> 4;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 < 0) {
						local212 = 0;
					}
				}
				local22.anIntArray409[local30++] = (local138 << 8) + (local212 << 24) + (local174 << 16) + local150;
			}
		}
		for (local54 = 0; local54 < this.aClass4_Sub1Array21.length; local54++) {
			this.aClass4_Sub1Array21[local54].method4547();
		}
		return local22;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZLclient!cg;Lclient!mh;IDI)[I")
	public int[] method2325(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5) {
		Static202.method3250(arg4);
		Static255.aClass22_85 = arg1;
		Static68.anInterface4_2 = arg2;
		Static28.method588(arg5, arg3);
		@Pc(23) int[] local23 = new int[arg3 * 4 * arg5];
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass4_Sub1Array21.length; local25++) {
			this.aClass4_Sub1Array21[local25].method4536(arg3, arg5);
		}
		local25 = 0;
		@Pc(45) int local45;
		for (local45 = 0; local45 < arg3; local45++) {
			if (arg0) {
				local25 = local45;
			}
			@Pc(73) int[] local73;
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(71) int[] local71;
			if (this.aClass4_Sub1_2.aBoolean392) {
				local71 = this.aClass4_Sub1_2.method4544(local45);
				local73 = local71;
				local75 = local71;
				local77 = local71;
			} else {
				@Pc(85) int[][] local85 = this.aClass4_Sub1_2.method4542(local45);
				local77 = local85[2];
				local75 = local85[1];
				local73 = local85[0];
			}
			if (this.aClass4_Sub1_1.aBoolean392) {
				local71 = this.aClass4_Sub1_1.method4544(local45);
			} else {
				local71 = this.aClass4_Sub1_1.method4542(local45)[0];
			}
			for (@Pc(121) int local121 = arg5 - 1; local121 >= 0; local121--) {
				@Pc(129) int local129 = local73[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				local129 = Static244.anIntArray382[local129];
				@Pc(149) int local149 = local75[local121] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				@Pc(167) int local167 = local77[local121] >> 4;
				local149 = Static244.anIntArray382[local149];
				if (local167 > 255) {
					local167 = 255;
				}
				if (local167 < 0) {
					local167 = 0;
				}
				local167 = Static244.anIntArray382[local167];
				@Pc(201) int local201;
				if (local129 == 0 && local149 == 0 && local167 == 0) {
					local201 = 0;
				} else {
					local201 = local71[local121] >> 4;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 < 0) {
						local201 = 0;
					}
				}
				local23[local25++] = (local149 << 8) + (local129 << 16) + (local201 << 24) + local167;
				if (arg0) {
					local25 += arg5 - 1;
				}
			}
		}
		for (local45 = 0; local45 < this.aClass4_Sub1Array21.length; local45++) {
			this.aClass4_Sub1Array21[local45].method4547();
		}
		return local23;
	}
}
