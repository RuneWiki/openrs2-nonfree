import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class3_Sub4_Sub37 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	private int anInt7275 = 1;

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
	private int anInt7276 = 1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7276 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt7275 = arg1.method6053();
		} else if (arg0 == 2) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(24) int local24 = this.anInt7275 + this.anInt7275 + 1;
			@Pc(28) int local28 = 65536 / local24;
			@Pc(36) int local36 = this.anInt7276 + this.anInt7276 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][][] local43 = new int[local24][][];
			@Pc(69) int local69;
			@Pc(71) int local71;
			for (@Pc(49) int local49 = arg0 - this.anInt7275; local49 <= arg0 + this.anInt7275; local49++) {
				@Pc(61) int[][] local61 = this.method5962(0, local49 & Static311.anInt5681);
				@Pc(65) int[][] local65 = new int[3][Static106.anInt2356];
				@Pc(67) int local67 = 0;
				local69 = 0;
				local71 = 0;
				@Pc(75) int[] local75 = local61[0];
				@Pc(79) int[] local79 = local61[1];
				@Pc(83) int[] local83 = local61[2];
				for (@Pc(87) int local87 = -this.anInt7276; local87 <= this.anInt7276; local87++) {
					@Pc(93) int local93 = local87 & Static396.anInt6840;
					local71 += local83[local93];
					local67 += local75[local93];
					local69 += local79[local93];
				}
				@Pc(120) int[] local120 = local65[0];
				@Pc(124) int[] local124 = local65[1];
				@Pc(128) int[] local128 = local65[2];
				@Pc(130) int local130 = 0;
				while (local130 < Static106.anInt2356) {
					local120[local130] = local40 * local67 >> 16;
					local124[local130] = local40 * local69 >> 16;
					local128[local130] = local40 * local71 >> 16;
					@Pc(164) int local164 = local130 - this.anInt7276 & Static396.anInt6840;
					local67 -= local75[local164];
					local69 -= local79[local164];
					local71 -= local83[local164];
					local130++;
					@Pc(191) int local191 = Static396.anInt6840 & local130 + this.anInt7276;
					local71 += local83[local191];
					local69 += local79[local191];
					local67 += local75[local191];
				}
				local43[this.anInt7275 + local49 - arg0] = local65;
			}
			@Pc(238) int[] local238 = local11[0];
			@Pc(242) int[] local242 = local11[1];
			@Pc(246) int[] local246 = local11[2];
			for (local69 = 0; local69 < Static106.anInt2356; local69++) {
				local71 = 0;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				for (@Pc(258) int local258 = 0; local258 < local24; local258++) {
					@Pc(264) int[][] local264 = local43[local258];
					local254 += local264[1][local69];
					local256 += local264[2][local69];
					local71 += local264[0][local69];
				}
				local238[local69] = local28 * local71 >> 16;
				local242[local69] = local254 * local28 >> 16;
				local246[local69] = local28 * local256 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(31) int local31 = this.anInt7275 + this.anInt7275 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt7276 + this.anInt7276 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(73) int local73;
			for (@Pc(56) int local56 = arg0 - this.anInt7275; local56 <= arg0 + this.anInt7275; local56++) {
				@Pc(68) int[] local68 = this.method5960(0, local56 & Static311.anInt5681);
				@Pc(71) int[] local71 = new int[Static106.anInt2356];
				local73 = 0;
				for (@Pc(77) int local77 = -this.anInt7276; local77 <= this.anInt7276; local77++) {
					local73 += local68[local77 & Static396.anInt6840];
				}
				@Pc(98) int local98 = 0;
				while (local98 < Static106.anInt2356) {
					local71[local98] = local47 * local73 >> 16;
					local73 -= local68[local98 - this.anInt7276 & Static396.anInt6840];
					local98++;
					local73 += local68[Static396.anInt6840 & this.anInt7276 + local98];
				}
				local50[local56 + this.anInt7275 - arg0] = local71;
			}
			for (@Pc(159) int local159 = 0; local159 < Static106.anInt2356; local159++) {
				@Pc(163) int local163 = 0;
				for (local73 = 0; local73 < local31; local73++) {
					local163 += local50[local73][local159];
				}
				local19[local159] = local35 * local163 >> 16;
			}
		}
		return local19;
	}
}
