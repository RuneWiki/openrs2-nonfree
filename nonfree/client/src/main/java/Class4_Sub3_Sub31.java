import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class4_Sub3_Sub31 extends Class4_Sub3 {

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
	private int anInt3445;

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
	private int anInt3447;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
	private int anInt3448;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3447 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt3448 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt3445 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(26) int[][] local26 = this.method3150(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static134.anInt3188; local52++) {
				@Pc(58) int local58 = local38[local52];
				@Pc(62) int local62 = local30[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local66 == local58) {
					local42[local52] = this.anInt3447 * local62 >> 12;
					local46[local52] = local58 * this.anInt3448 >> 12;
					local50[local52] = this.anInt3445 * local66 >> 12;
				} else {
					local42[local52] = this.anInt3447;
					local46[local52] = this.anInt3448;
					local50[local52] = this.anInt3445;
				}
			}
		}
		return local16;
	}
}
