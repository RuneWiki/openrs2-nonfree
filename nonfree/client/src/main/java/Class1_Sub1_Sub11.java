import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
	private int anInt1465;

	@OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
	private int anInt1477;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1465 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt1477 = arg1.method1607();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(20) int local20 = Static65.anInt1933 / this.anInt1465;
			@Pc(25) int local25 = Static30.anInt1097 / this.anInt1477;
			@Pc(36) int[][] local36;
			if (local25 <= 0) {
				local36 = this.method3013(0, 0);
			} else {
				@Pc(42) int local42 = arg0 % local25;
				local36 = this.method3013(Static30.anInt1097 * local42 / local25, 0);
			}
			@Pc(56) int[] local56 = local36[0];
			@Pc(60) int[] local60 = local36[1];
			@Pc(64) int[] local64 = local36[2];
			@Pc(68) int[] local68 = local11[1];
			@Pc(72) int[] local72 = local11[0];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static65.anInt1933; local78++) {
				@Pc(95) int local95;
				if (local20 > 0) {
					@Pc(89) int local89 = local78 % local20;
					local95 = Static65.anInt1933 * local89 / local20;
				} else {
					local95 = 0;
				}
				local72[local78] = local56[local95];
				local68[local78] = local60[local95];
				local76[local78] = local64[local95];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(25) int local25 = Static65.anInt1933 / this.anInt1465;
			@Pc(30) int local30 = Static30.anInt1097 / this.anInt1477;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method3012(0, local36 * Static30.anInt1097 / local30);
			} else {
				local46 = this.method3012(0, 0);
			}
			for (local36 = 0; local36 < Static65.anInt1933; local36++) {
				if (local25 <= 0) {
					local11[local36] = local46[0];
				} else {
					@Pc(75) int local75 = local36 % local25;
					local11[local36] = local46[Static65.anInt1933 * local75 / local25];
				}
			}
		}
		return local11;
	}
}
