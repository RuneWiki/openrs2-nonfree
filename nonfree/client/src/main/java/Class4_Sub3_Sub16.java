import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class4_Sub3_Sub16 extends Class4_Sub3 {

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	private int anInt1713;

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
	private int anInt1719;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
	private int anInt1721;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1713 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt1721 = arg1.method1252();
		} else if (arg0 == 2) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(21) int[] local21 = this.method3149(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static134.anInt3188; local23++) {
				local11[local23] = this.anInt1713 + (this.anInt1719 * local21[local23] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(26) int[][] local26 = this.method3150(0, arg0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local26[0];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static134.anInt3188; local52++) {
				local38[local52] = this.anInt1713 + (local46[local52] * this.anInt1719 >> 12);
				local42[local52] = (this.anInt1719 * local34[local52] >> 12) + this.anInt1713;
				local50[local52] = (this.anInt1719 * local30[local52] >> 12) + this.anInt1713;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		this.anInt1719 = this.anInt1721 - this.anInt1713;
	}
}
