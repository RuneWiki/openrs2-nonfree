import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class3_Sub1_Sub26 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
	private int anInt3316;

	@OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
	private int anInt3318;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(28) int local28 = this.anInt3316 + this.anInt3316 + 1;
			@Pc(31) int[][] local31 = new int[local28][];
			@Pc(39) int local39 = this.anInt3318 + this.anInt3318 + 1;
			@Pc(49) int local49;
			for (@Pc(45) int local45 = arg0 - this.anInt3316; local45 <= arg0 + this.anInt3316; local45++) {
				local49 = 0;
				@Pc(57) int[] local57 = this.method3120(0, local45 & Static106.anInt2755);
				for (@Pc(61) int local61 = -this.anInt3318; local61 <= this.anInt3318; local61++) {
					local49 += local57[Static105.anInt2733 & local61];
				}
				@Pc(79) int[] local79 = new int[Static129.anInt3285];
				@Pc(81) int local81 = 0;
				while (Static129.anInt3285 > local81) {
					local79[local81] = local49 / local39;
					local49 -= local57[Static105.anInt2733 & local81 - this.anInt3318];
					local81++;
					local49 += local57[Static105.anInt2733 & local81 + this.anInt3318];
				}
				local31[local45 + this.anInt3316 - arg0] = local79;
			}
			for (@Pc(137) int local137 = 0; local137 < Static129.anInt3285; local137++) {
				@Pc(141) int local141 = 0;
				for (local49 = 0; local49 < local28; local49++) {
					local141 += local31[local49][local137];
				}
				local16[local137] = local141 / local28;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3318 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt3316 = arg1.method1545();
		} else if (arg0 == 2) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(24) int local24 = this.anInt3316 + this.anInt3316 + 1;
			@Pc(27) int[][][] local27 = new int[local24][][];
			@Pc(35) int local35 = this.anInt3318 + this.anInt3318 + 1;
			@Pc(59) int local59;
			@Pc(61) int local61;
			for (@Pc(41) int local41 = arg0 - this.anInt3316; local41 <= this.anInt3316 + arg0; local41++) {
				@Pc(51) int[][] local51 = this.method3124(0, local41 & Static106.anInt2755);
				@Pc(55) int[][] local55 = new int[3][Static129.anInt3285];
				@Pc(57) int local57 = 0;
				local59 = 0;
				local61 = 0;
				@Pc(65) int[] local65 = local51[2];
				@Pc(69) int[] local69 = local51[0];
				@Pc(73) int[] local73 = local51[1];
				for (@Pc(77) int local77 = -this.anInt3318; local77 <= this.anInt3318; local77++) {
					@Pc(83) int local83 = Static105.anInt2733 & local77;
					local57 += local69[local83];
					local61 += local65[local83];
					local59 += local73[local83];
				}
				@Pc(114) int[] local114 = local55[0];
				@Pc(118) int[] local118 = local55[1];
				@Pc(122) int[] local122 = local55[2];
				@Pc(124) int local124 = 0;
				while (Static129.anInt3285 > local124) {
					local114[local124] = local57 / local35;
					local118[local124] = local59 / local35;
					local122[local124] = local61 / local35;
					@Pc(151) int local151 = Static105.anInt2733 & local124 - this.anInt3318;
					local61 -= local65[local151];
					local59 -= local73[local151];
					local57 -= local69[local151];
					local124++;
					@Pc(177) int local177 = Static105.anInt2733 & this.anInt3318 + local124;
					local61 += local65[local177];
					local59 += local73[local177];
					local57 += local69[local177];
				}
				local27[local41 + this.anInt3316 - arg0] = local55;
			}
			@Pc(218) int[] local218 = local11[2];
			@Pc(222) int[] local222 = local11[1];
			@Pc(226) int[] local226 = local11[0];
			for (local59 = 0; local59 < Static129.anInt3285; local59++) {
				local61 = 0;
				@Pc(234) int local234 = 0;
				@Pc(236) int local236 = 0;
				for (@Pc(238) int local238 = 0; local238 < local24; local238++) {
					@Pc(244) int[][] local244 = local27[local238];
					local234 += local244[1][local59];
					local236 += local244[2][local59];
					local61 += local244[0][local59];
				}
				local226[local59] = local61 / local24;
				local222[local59] = local234 / local24;
				local218[local59] = local236 / local24;
			}
		}
		return local11;
	}
}
