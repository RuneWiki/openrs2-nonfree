import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class1_Sub8_Sub17 extends Class1_Sub8 {

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
	private int anInt4030 = 4;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
	private int anInt4034 = 4;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(20) int local20 = Static18.anInt439 / this.anInt4034;
			@Pc(25) int local25 = Static217.anInt4363 / this.anInt4030;
			@Pc(44) int[] local44;
			@Pc(34) int local34;
			if (local25 > 0) {
				local34 = arg0 % local25;
				local44 = this.method6037(0, Static217.anInt4363 * local34 / local25);
			} else {
				local44 = this.method6037(0, 0);
			}
			for (local34 = 0; local34 < Static18.anInt439; local34++) {
				if (local20 > 0) {
					@Pc(62) int local62 = local34 % local20;
					local11[local34] = local44[Static18.anInt439 * local62 / local20];
				} else {
					local11[local34] = local44[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(28) int local28 = Static18.anInt439 / this.anInt4034;
			@Pc(33) int local33 = Static217.anInt4363 / this.anInt4030;
			@Pc(44) int[][] local44;
			if (local33 <= 0) {
				local44 = this.method6035(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local33;
				local44 = this.method6035(local50 * Static217.anInt4363 / local33, 0);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local44[2];
			@Pc(76) int[] local76 = local11[0];
			@Pc(80) int[] local80 = local11[1];
			@Pc(84) int[] local84 = local11[2];
			for (@Pc(86) int local86 = 0; local86 < Static18.anInt439; local86++) {
				@Pc(92) int local92;
				if (local28 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local86 % local28;
					local92 = local98 * Static18.anInt439 / local28;
				}
				local76[local86] = local64[local92];
				local80[local86] = local68[local92];
				local84[local86] = local72[local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4034 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt4030 = arg1.method1171();
		}
	}
}
