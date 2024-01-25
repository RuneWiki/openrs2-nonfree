import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class8_Sub2_Sub15 extends Class8_Sub2 {

	@OriginalMember(owner = "client!hha", name = "K", descriptor = "I")
	private int anInt4660 = 1;

	@OriginalMember(owner = "client!hha", name = "U", descriptor = "I")
	private int anInt4667 = 1;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4660 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt4667 = arg1.method8525();
		} else if (arg0 == 2) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(31) int local31 = this.anInt4667 + this.anInt4667 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt4660 + this.anInt4660 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local31][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt4667; local57 <= arg0 + this.anInt4667; local57++) {
				@Pc(67) int[][] local67 = this.method8510(0, local57 & Static17.anInt866);
				@Pc(71) int[][] local71 = new int[3][Static538.anInt9297];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt4660; local93 <= this.anInt4660; local93++) {
					@Pc(99) int local99 = local93 & Static263.anInt5634;
					local73 += local81[local99];
					local75 += local85[local99];
					local77 += local89[local99];
				}
				@Pc(126) int[] local126 = local71[0];
				@Pc(130) int[] local130 = local71[1];
				@Pc(134) int[] local134 = local71[2];
				@Pc(136) int local136 = 0;
				while (Static538.anInt9297 > local136) {
					local126[local136] = local48 * local73 >> 16;
					local130[local136] = local75 * local48 >> 16;
					local134[local136] = local48 * local77 >> 16;
					@Pc(169) int local169 = local136 - this.anInt4660 & Static263.anInt5634;
					local77 -= local89[local169];
					local136++;
					local75 -= local85[local169];
					local73 -= local81[local169];
					@Pc(196) int local196 = local136 + this.anInt4660 & Static263.anInt5634;
					local77 += local89[local196];
					local73 += local81[local196];
					local75 += local85[local196];
				}
				local51[this.anInt4667 + local57 - arg0] = local71;
			}
			@Pc(239) int[] local239 = local11[0];
			@Pc(243) int[] local243 = local11[1];
			@Pc(247) int[] local247 = local11[2];
			for (local75 = 0; local75 < Static538.anInt9297; local75++) {
				local77 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local31; local259++) {
					@Pc(265) int[][] local265 = local51[local259];
					local77 += local265[0][local75];
					local255 += local265[1][local75];
					local257 += local265[2][local75];
				}
				local239[local75] = local35 * local77 >> 16;
				local243[local75] = local255 * local35 >> 16;
				local247[local75] = local257 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(31) int local31 = this.anInt4667 + this.anInt4667 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt4660 + this.anInt4660 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt4667; local56 <= arg0 + this.anInt4667; local56++) {
				@Pc(66) int[] local66 = this.method8505(local56 & Static17.anInt866, 0);
				@Pc(69) int[] local69 = new int[Static538.anInt9297];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt4660; local75 <= this.anInt4660; local75++) {
					local71 += local66[local75 & Static263.anInt5634];
				}
				@Pc(92) int local92 = 0;
				while (Static538.anInt9297 > local92) {
					local69[local92] = local47 * local71 >> 16;
					local71 -= local66[local92 - this.anInt4660 & Static263.anInt5634];
					local92++;
					local71 += local66[Static263.anInt5634 & this.anInt4660 + local92];
				}
				local50[local56 + this.anInt4667 - arg0] = local69;
			}
			for (@Pc(150) int local150 = 0; local150 < Static538.anInt9297; local150++) {
				@Pc(154) int local154 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local154 += local50[local71][local150];
				}
				local11[local150] = local154 * local35 >> 16;
			}
		}
		return local11;
	}
}
