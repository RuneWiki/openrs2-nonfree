import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
	private int anInt6081 = 4;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
	private int anInt6087 = 4;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(25) int local25 = Static491.anInt8519 / this.anInt6081;
			@Pc(30) int local30 = Static336.anInt6310 / this.anInt6087;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method8603(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method8603(Static336.anInt6310 * local44 / local30, 0);
			}
			for (local44 = 0; local44 < Static491.anInt8519; local44++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local44 % local25;
					local11[local44] = local38[Static491.anInt8519 * local67 / local25];
				} else {
					local11[local44] = local38[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6081 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt6087 = arg0.method4225();
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(28) int local28 = Static491.anInt8519 / this.anInt6081;
			@Pc(33) int local33 = Static336.anInt6310 / this.anInt6087;
			@Pc(41) int[][] local41;
			if (local33 <= 0) {
				local41 = this.method8595(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local33;
				local41 = this.method8595(local47 * Static336.anInt6310 / local33, 0);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static491.anInt8519; local83++) {
				@Pc(89) int local89;
				if (local28 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local28;
					local89 = Static491.anInt8519 * local95 / local28;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local19;
	}
}
