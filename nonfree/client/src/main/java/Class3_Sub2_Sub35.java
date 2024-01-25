import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
	private int anInt6800 = 4;

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
	private int anInt6798 = 4;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(28) int local28 = Static406.anInt6694 / this.anInt6800;
			@Pc(33) int local33 = Static286.anInt1445 / this.anInt6798;
			@Pc(41) int[][] local41;
			if (local33 <= 0) {
				local41 = this.method5899(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local33;
				local41 = this.method5899(0, local47 * Static286.anInt1445 / local33);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static406.anInt6694; local83++) {
				@Pc(89) int local89;
				if (local28 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local28;
					local89 = Static406.anInt6694 * local95 / local28;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(20) int local20 = Static406.anInt6694 / this.anInt6800;
			@Pc(25) int local25 = Static286.anInt1445 / this.anInt6798;
			@Pc(44) int[] local44;
			@Pc(34) int local34;
			if (local25 > 0) {
				local34 = arg0 % local25;
				local44 = this.method5894(0, Static286.anInt1445 * local34 / local25);
			} else {
				local44 = this.method5894(0, 0);
			}
			for (local34 = 0; local34 < Static406.anInt6694; local34++) {
				if (local20 > 0) {
					@Pc(65) int local65 = local34 % local20;
					local11[local34] = local44[local65 * Static406.anInt6694 / local20];
				} else {
					local11[local34] = local44[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6800 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt6798 = arg0.method2582();
		}
	}
}
