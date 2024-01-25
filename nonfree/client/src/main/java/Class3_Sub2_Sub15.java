import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!iia", name = "J", descriptor = "I")
	private int anInt4773 = 1;

	@OriginalMember(owner = "client!iia", name = "I", descriptor = "I")
	private int anInt4772 = 1;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(29) int local29 = this.anInt4772 + this.anInt4772 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt4773 + this.anInt4773 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt4772; local54 <= arg0 + this.anInt4772; local54++) {
				@Pc(64) int[] local64 = this.method8669(local54 & Static575.anInt9412, 0);
				@Pc(67) int[] local67 = new int[Static201.anInt3738];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt4773; local73 <= this.anInt4773; local73++) {
					local69 += local64[Static201.anInt3740 & local73];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static201.anInt3738) {
					local67[local90] = local69 * local45 >> 16;
					local69 -= local64[local90 - this.anInt4773 & Static201.anInt3740];
					local90++;
					local69 += local64[Static201.anInt3740 & this.anInt4773 + local90];
				}
				local48[local54 + this.anInt4772 - arg0] = local67;
			}
			for (@Pc(150) int local150 = 0; local150 < Static201.anInt3738; local150++) {
				@Pc(154) int local154 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local154 += local48[local69][local150];
				}
				local11[local150] = local33 * local154 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(31) int local31 = this.anInt4772 + this.anInt4772 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt4773 + this.anInt4773 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt4772; local56 <= this.anInt4772 + arg0; local56++) {
				@Pc(66) int[][] local66 = this.method8672(0, Static575.anInt9412 & local56);
				@Pc(70) int[][] local70 = new int[3][Static201.anInt3738];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt4773; local92 <= this.anInt4773; local92++) {
					@Pc(98) int local98 = local92 & Static201.anInt3740;
					local76 += local88[local98];
					local74 += local84[local98];
					local72 += local80[local98];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (local135 < Static201.anInt3738) {
					local125[local135] = local47 * local72 >> 16;
					local129[local135] = local74 * local47 >> 16;
					local133[local135] = local47 * local76 >> 16;
					@Pc(169) int local169 = Static201.anInt3740 & local135 - this.anInt4773;
					local135++;
					local76 -= local88[local169];
					local72 -= local80[local169];
					local74 -= local84[local169];
					@Pc(195) int local195 = Static201.anInt3740 & this.anInt4773 + local135;
					local74 += local84[local195];
					local76 += local88[local195];
					local72 += local80[local195];
				}
				local50[this.anInt4772 + local56 - arg0] = local70;
			}
			@Pc(240) int[] local240 = local11[0];
			@Pc(244) int[] local244 = local11[1];
			@Pc(248) int[] local248 = local11[2];
			for (local74 = 0; local74 < Static201.anInt3738; local74++) {
				local76 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local31; local260++) {
					@Pc(266) int[][] local266 = local50[local260];
					local258 += local266[2][local74];
					local256 += local266[1][local74];
					local76 += local266[0][local74];
				}
				local240[local74] = local35 * local76 >> 16;
				local244[local74] = local35 * local256 >> 16;
				local248[local74] = local258 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4773 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt4772 = arg0.method5633();
		} else if (arg1 == 2) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}
}
