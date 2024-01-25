import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class3_Sub4_Sub24 extends Class3_Sub4 {

	@OriginalMember(owner = "client!og", name = "O", descriptor = "I")
	private int anInt5237 = 4;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	private int anInt5238 = 4;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(20) int local20 = Static106.anInt2356 / this.anInt5237;
			@Pc(25) int local25 = Static340.anInt6286 / this.anInt5238;
			@Pc(33) int[][] local33;
			if (local25 <= 0) {
				local33 = this.method5962(0, 0);
			} else {
				@Pc(39) int local39 = arg0 % local25;
				local33 = this.method5962(0, Static340.anInt6286 * local39 / local25);
			}
			@Pc(53) int[] local53 = local33[0];
			@Pc(57) int[] local57 = local33[1];
			@Pc(61) int[] local61 = local33[2];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local11[1];
			@Pc(73) int[] local73 = local11[2];
			for (@Pc(75) int local75 = 0; local75 < Static106.anInt2356; local75++) {
				@Pc(81) int local81;
				if (local20 <= 0) {
					local81 = 0;
				} else {
					@Pc(87) int local87 = local75 % local20;
					local81 = Static106.anInt2356 * local87 / local20;
				}
				local65[local75] = local53[local81];
				local69[local75] = local57[local81];
				local73[local75] = local61[local81];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5237 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt5238 = arg1.method6053();
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(28) int local28 = Static106.anInt2356 / this.anInt5237;
			@Pc(33) int local33 = Static340.anInt6286 / this.anInt5238;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method5960(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method5960(0, local50 * Static340.anInt6286 / local33);
			}
			for (local50 = 0; local50 < Static106.anInt2356; local50++) {
				if (local28 > 0) {
					@Pc(72) int local72 = local50 % local28;
					local11[local50] = local44[local72 * Static106.anInt2356 / local28];
				} else {
					local11[local50] = local44[0];
				}
			}
		}
		return local11;
	}
}
