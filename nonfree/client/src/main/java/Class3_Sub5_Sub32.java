import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class3_Sub5_Sub32 extends Class3_Sub5 {

	@OriginalMember(owner = "client!td", name = "M", descriptor = "I")
	private int anInt3839;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "I")
	private int anInt3844;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3839 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt3844 = arg1.method2107();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(28) int local28 = Static104.anInt2195 / this.anInt3839;
			@Pc(33) int local33 = Static88.anInt1834 / this.anInt3844;
			@Pc(52) int[][] local52;
			if (local33 > 0) {
				@Pc(42) int local42 = arg0 % local33;
				local52 = this.method3163(0, local42 * Static88.anInt1834 / local33);
			} else {
				local52 = this.method3163(0, 0);
			}
			@Pc(64) int[] local64 = local52[0];
			@Pc(68) int[] local68 = local52[1];
			@Pc(72) int[] local72 = local19[0];
			@Pc(76) int[] local76 = local52[2];
			@Pc(80) int[] local80 = local19[1];
			@Pc(84) int[] local84 = local19[2];
			for (@Pc(86) int local86 = 0; local86 < Static104.anInt2195; local86++) {
				@Pc(103) int local103;
				if (local28 > 0) {
					@Pc(97) int local97 = local86 % local28;
					local103 = Static104.anInt2195 * local97 / local28;
				} else {
					local103 = 0;
				}
				local72[local86] = local64[local103];
				local80[local86] = local68[local103];
				local84[local86] = local76[local103];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(28) int local28 = Static104.anInt2195 / this.anInt3839;
			@Pc(33) int local33 = Static88.anInt1834 / this.anInt3844;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method3167(Static88.anInt1834 * local42 / local33, 0);
			} else {
				local52 = this.method3167(0, 0);
			}
			for (local42 = 0; local42 < Static104.anInt2195; local42++) {
				if (local28 > 0) {
					@Pc(73) int local73 = local42 % local28;
					local19[local42] = local52[local73 * Static104.anInt2195 / local28];
				} else {
					local19[local42] = local52[0];
				}
			}
		}
		return local19;
	}
}
