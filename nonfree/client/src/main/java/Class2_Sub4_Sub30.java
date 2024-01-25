import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class2_Sub4_Sub30 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
	private int anInt6683 = 4;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
	private int anInt6682 = 4;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6683 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt6682 = arg0.method2859();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(20) int local20 = Static395.anInt6816 / this.anInt6683;
			@Pc(25) int local25 = Static118.anInt2485 / this.anInt6682;
			@Pc(35) int[] local35;
			@Pc(41) int local41;
			if (local25 <= 0) {
				local35 = this.method8892(0, 0);
			} else {
				local41 = arg0 % local25;
				local35 = this.method8892(Static118.anInt2485 * local41 / local25, 0);
			}
			for (local41 = 0; local41 < Static395.anInt6816; local41++) {
				if (local20 <= 0) {
					local11[local41] = local35[0];
				} else {
					@Pc(74) int local74 = local41 % local20;
					local11[local41] = local35[Static395.anInt6816 * local74 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(20) int local20 = Static395.anInt6816 / this.anInt6683;
			@Pc(25) int local25 = Static118.anInt2485 / this.anInt6682;
			@Pc(36) int[][] local36;
			if (local25 <= 0) {
				local36 = this.method8898(0, 0);
			} else {
				@Pc(42) int local42 = arg0 % local25;
				local36 = this.method8898(0, local42 * Static118.anInt2485 / local25);
			}
			@Pc(56) int[] local56 = local36[0];
			@Pc(60) int[] local60 = local36[1];
			@Pc(64) int[] local64 = local36[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static395.anInt6816; local78++) {
				@Pc(84) int local84;
				if (local20 <= 0) {
					local84 = 0;
				} else {
					@Pc(90) int local90 = local78 % local20;
					local84 = Static395.anInt6816 * local90 / local20;
				}
				local68[local78] = local56[local84];
				local72[local78] = local60[local84];
				local76[local78] = local64[local84];
			}
		}
		return local11;
	}
}
