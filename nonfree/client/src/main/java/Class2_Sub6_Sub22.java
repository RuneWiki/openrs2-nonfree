import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class2_Sub6_Sub22 extends Class2_Sub6 {

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
	private int anInt4093 = 0;

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
	private int anInt4103 = 1365;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
	private int anInt4099 = 20;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
	private int anInt4105 = 0;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			for (@Pc(17) int local17 = 0; local17 < Static151.anInt2711; local17++) {
				@Pc(31) int local31 = this.anInt4105 + (Static160.anIntArray329[local17] << 12) / this.anInt4103;
				@Pc(43) int local43 = (Static138.anIntArray291[arg0] << 12) / this.anInt4103 + this.anInt4093;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65;
				for (local65 = 0; local57 + local63 < 16384 && this.anInt4099 > local65; local65++) {
					local51 = local43 + (local49 * local51 >> 12) * 2;
					local49 = local31 + local57 - local63;
					local57 = local49 * local49 >> 12;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = local65 < this.anInt4099 - 1 ? (local65 << 12) / this.anInt4099 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4103 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt4099 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt4105 = arg0.method4245();
		} else if (arg1 == 3) {
			this.anInt4093 = arg0.method4245();
		}
	}
}
