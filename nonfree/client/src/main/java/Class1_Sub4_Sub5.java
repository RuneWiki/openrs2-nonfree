import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub4_Sub5 extends Class1_Sub4 {

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
	private int anInt1300;

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "I")
	private int anInt1305;

	@OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
	private int anInt1302;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		this.anInt1305 = this.anInt1302 - this.anInt1300;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(26) int[][] local26 = this.method3217(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[0];
			for (@Pc(52) int local52 = 0; local52 < Static73.anInt1888; local52++) {
				local50[local52] = (local30[local52] * this.anInt1305 >> 12) + this.anInt1300;
				local42[local52] = (this.anInt1305 * local34[local52] >> 12) + this.anInt1300;
				local46[local52] = this.anInt1300 + (local38[local52] * this.anInt1305 >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1300 = arg0.method546();
		} else if (arg1 == 1) {
			this.anInt1302 = arg0.method546();
		} else if (arg1 == 2) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int[] local26 = this.method3215(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static73.anInt1888; local28++) {
				local16[local28] = this.anInt1300 + (this.anInt1305 * local26[local28] >> 12);
			}
		}
		return local16;
	}
}
