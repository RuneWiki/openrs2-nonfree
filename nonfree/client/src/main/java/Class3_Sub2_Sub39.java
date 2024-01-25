import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class3_Sub2_Sub39 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	private int anInt10042 = 1;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private int anInt10041 = 1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(23) int local23 = this.anInt10042 + this.anInt10042 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(36) int local36 = this.anInt10041 + this.anInt10041 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][][] local43 = new int[local23][][];
			@Pc(67) int local67;
			@Pc(69) int local69;
			for (@Pc(49) int local49 = arg0 - this.anInt10042; local49 <= this.anInt10042 + arg0; local49++) {
				@Pc(59) int[][] local59 = this.method8595(Class4_Sub1_Sub3_Sub2.lb & local49, 0);
				@Pc(63) int[][] local63 = new int[3][Static491.anInt8519];
				@Pc(65) int local65 = 0;
				local67 = 0;
				local69 = 0;
				@Pc(73) int[] local73 = local59[0];
				@Pc(77) int[] local77 = local59[1];
				@Pc(81) int[] local81 = local59[2];
				for (@Pc(85) int local85 = -this.anInt10041; local85 <= this.anInt10041; local85++) {
					@Pc(91) int local91 = Static309.anInt5846 & local85;
					local67 += local77[local91];
					local65 += local73[local91];
					local69 += local81[local91];
				}
				@Pc(122) int[] local122 = local63[0];
				@Pc(126) int[] local126 = local63[1];
				@Pc(130) int[] local130 = local63[2];
				@Pc(132) int local132 = 0;
				while (Static491.anInt8519 > local132) {
					local122[local132] = local65 * local40 >> 16;
					local126[local132] = local67 * local40 >> 16;
					local130[local132] = local40 * local69 >> 16;
					@Pc(165) int local165 = local132 - this.anInt10041 & Static309.anInt5846;
					local132++;
					local65 -= local73[local165];
					local69 -= local81[local165];
					local67 -= local77[local165];
					@Pc(191) int local191 = Static309.anInt5846 & this.anInt10041 + local132;
					local67 += local77[local191];
					local65 += local73[local191];
					local69 += local81[local191];
				}
				local43[local49 + this.anInt10042 - arg0] = local63;
			}
			@Pc(237) int[] local237 = local11[0];
			@Pc(241) int[] local241 = local11[1];
			@Pc(245) int[] local245 = local11[2];
			for (local67 = 0; local67 < Static491.anInt8519; local67++) {
				local69 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local23; local257++) {
					@Pc(263) int[][] local263 = local43[local257];
					local255 += local263[2][local67];
					local69 += local263[0][local67];
					local253 += local263[1][local67];
				}
				local237[local67] = local69 * local27 >> 16;
				local241[local67] = local27 * local253 >> 16;
				local245[local67] = local255 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10041 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt10042 = arg0.method4225();
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(23) int local23 = this.anInt10042 + this.anInt10042 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt10041 + this.anInt10041 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(62) int local62;
			for (@Pc(47) int local47 = arg0 - this.anInt10042; local47 <= this.anInt10042 + arg0; local47++) {
				@Pc(57) int[] local57 = this.method8603(local47 & Class4_Sub1_Sub3_Sub2.lb, 0);
				@Pc(60) int[] local60 = new int[Static491.anInt8519];
				local62 = 0;
				for (@Pc(66) int local66 = -this.anInt10041; local66 <= this.anInt10041; local66++) {
					local62 += local57[Static309.anInt5846 & local66];
				}
				@Pc(83) int local83 = 0;
				while (local83 < Static491.anInt8519) {
					local60[local83] = local39 * local62 >> 16;
					local62 -= local57[Static309.anInt5846 & local83 - this.anInt10041];
					local83++;
					local62 += local57[this.anInt10041 + local83 & Static309.anInt5846];
				}
				local42[local47 + this.anInt10042 - arg0] = local60;
			}
			for (@Pc(147) int local147 = 0; local147 < Static491.anInt8519; local147++) {
				@Pc(151) int local151 = 0;
				for (local62 = 0; local62 < local23; local62++) {
					local151 += local42[local62][local147];
				}
				local11[local147] = local151 * local27 >> 16;
			}
		}
		return local11;
	}
}
