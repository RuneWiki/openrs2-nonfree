import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ofa", name = "J", descriptor = "I")
	private int anInt6762 = 1;

	@OriginalMember(owner = "client!ofa", name = "P", descriptor = "I")
	private int anInt6768 = 1;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6762 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt6768 = arg0.method4325();
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(28) int local28 = this.anInt6768 + this.anInt6768 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt6762 + this.anInt6762 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt6768; local53 <= arg0 + this.anInt6768; local53++) {
				@Pc(63) int[][] local63 = this.method7947(0, local53 & Static28.anInt6368);
				@Pc(67) int[][] local67 = new int[3][Static153.anInt3070];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt6762; local89 <= this.anInt6762; local89++) {
					@Pc(95) int local95 = local89 & Static431.anInt7305;
					local71 += local81[local95];
					local73 += local85[local95];
					local69 += local77[local95];
				}
				@Pc(126) int[] local126 = local67[0];
				@Pc(130) int[] local130 = local67[1];
				@Pc(134) int[] local134 = local67[2];
				@Pc(136) int local136 = 0;
				while (Static153.anInt3070 > local136) {
					local126[local136] = local44 * local69 >> 16;
					local130[local136] = local44 * local71 >> 16;
					local134[local136] = local73 * local44 >> 16;
					@Pc(169) int local169 = Static431.anInt7305 & local136 - this.anInt6762;
					local71 -= local81[local169];
					local73 -= local85[local169];
					local69 -= local77[local169];
					local136++;
					@Pc(195) int local195 = Static431.anInt7305 & local136 + this.anInt6762;
					local71 += local81[local195];
					local73 += local85[local195];
					local69 += local77[local195];
				}
				local47[local53 + this.anInt6768 - arg0] = local67;
			}
			@Pc(241) int[] local241 = local16[0];
			@Pc(245) int[] local245 = local16[1];
			@Pc(249) int[] local249 = local16[2];
			for (local71 = 0; local71 < Static153.anInt3070; local71++) {
				local73 = 0;
				@Pc(257) int local257 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local28; local261++) {
					@Pc(267) int[][] local267 = local47[local261];
					local73 += local267[0][local71];
					local259 += local267[2][local71];
					local257 += local267[1][local71];
				}
				local241[local71] = local32 * local73 >> 16;
				local245[local71] = local257 * local32 >> 16;
				local249[local71] = local259 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(31) int local31 = this.anInt6768 + this.anInt6768 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt6762 + this.anInt6762 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt6768; local56 <= arg0 + this.anInt6768; local56++) {
				@Pc(66) int[] local66 = this.method7951(Static28.anInt6368 & local56, 0);
				@Pc(69) int[] local69 = new int[Static153.anInt3070];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt6762; local75 <= this.anInt6762; local75++) {
					local71 += local66[local75 & Static431.anInt7305];
				}
				@Pc(92) int local92 = 0;
				while (Static153.anInt3070 > local92) {
					local69[local92] = local47 * local71 >> 16;
					local71 -= local66[local92 - this.anInt6762 & Static431.anInt7305];
					local92++;
					local71 += local66[Static431.anInt7305 & local92 + this.anInt6762];
				}
				local50[this.anInt6768 + local56 - arg0] = local69;
			}
			for (@Pc(153) int local153 = 0; local153 < Static153.anInt3070; local153++) {
				@Pc(157) int local157 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local157 += local50[local71][local153];
				}
				local11[local153] = local157 * local35 >> 16;
			}
		}
		return local11;
	}
}
