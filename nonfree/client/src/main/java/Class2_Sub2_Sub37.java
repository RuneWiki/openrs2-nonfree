import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class2_Sub2_Sub37 extends Class2_Sub2 {

	@OriginalMember(owner = "client!un", name = "L", descriptor = "I")
	private int anInt6519 = 4;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "I")
	private int anInt6520 = 4;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(28) int local28 = Static339.anInt6735 / this.anInt6520;
			@Pc(33) int local33 = Static84.anInt1830 / this.anInt6519;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method5887(local39 * Static84.anInt1830 / local33, 0);
			} else {
				local49 = this.method5887(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static339.anInt6735; local83++) {
				@Pc(89) int local89;
				if (local28 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local28;
					local89 = local95 * Static339.anInt6735 / local28;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt6520 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt6519 = arg1.method4421();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(20) int local20 = Static339.anInt6735 / this.anInt6520;
			@Pc(25) int local25 = Static84.anInt1830 / this.anInt6519;
			@Pc(36) int[] local36;
			@Pc(42) int local42;
			if (local25 <= 0) {
				local36 = this.method5876(0, 0);
			} else {
				local42 = arg0 % local25;
				local36 = this.method5876(0, Static84.anInt1830 * local42 / local25);
			}
			for (local42 = 0; local42 < Static339.anInt6735; local42++) {
				if (local20 > 0) {
					@Pc(62) int local62 = local42 % local20;
					local11[local42] = local36[local62 * Static339.anInt6735 / local20];
				} else {
					local11[local42] = local36[0];
				}
			}
		}
		return local11;
	}
}
