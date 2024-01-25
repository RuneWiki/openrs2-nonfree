import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
	private int anInt5546 = 4;

	@OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
	private int anInt5553 = 4;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(24) int local24 = Static158.anInt2658 / this.anInt5546;
			@Pc(29) int local29 = Static91.anInt1665 / this.anInt5553;
			@Pc(40) int[][] local40;
			if (local29 <= 0) {
				local40 = this.method5514(0, 0);
			} else {
				@Pc(46) int local46 = arg0 % local29;
				local40 = this.method5514(Static91.anInt1665 * local46 / local29, 0);
			}
			@Pc(60) int[] local60 = local40[0];
			@Pc(64) int[] local64 = local40[1];
			@Pc(68) int[] local68 = local40[2];
			@Pc(72) int[] local72 = local15[0];
			@Pc(76) int[] local76 = local15[1];
			@Pc(80) int[] local80 = local15[2];
			for (@Pc(82) int local82 = 0; local82 < Static158.anInt2658; local82++) {
				@Pc(91) int local91;
				if (local24 <= 0) {
					local91 = 0;
				} else {
					@Pc(97) int local97 = local82 % local24;
					local91 = Static158.anInt2658 * local97 / local24;
				}
				local72[local82] = local60[local91];
				local76[local82] = local64[local91];
				local80[local82] = local68[local91];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(20) int local20 = Static158.anInt2658 / this.anInt5546;
			@Pc(25) int local25 = Static91.anInt1665 / this.anInt5553;
			@Pc(41) int[] local41;
			@Pc(31) int local31;
			if (local25 > 0) {
				local31 = arg0 % local25;
				local41 = this.method5510(Static91.anInt1665 * local31 / local25, 0);
			} else {
				local41 = this.method5510(0, 0);
			}
			for (local31 = 0; local31 < Static158.anInt2658; local31++) {
				if (local20 > 0) {
					@Pc(61) int local61 = local31 % local20;
					local11[local31] = local41[Static158.anInt2658 * local61 / local20];
				} else {
					local11[local31] = local41[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt5546 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt5553 = arg1.method5174();
		}
	}
}
