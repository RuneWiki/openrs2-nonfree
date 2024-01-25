import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class3_Sub6_Sub4 extends Class3_Sub6 {

	@OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
	private int anInt1501 = 4096;

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
	private int anInt1500 = 4096;

	@OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
	private int anInt1502 = 4096;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(26) int[][] local26 = this.method7773(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static521.anInt8383; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local66 == local62) {
					local42[local52] = this.anInt1500 * local58 >> 12;
					local46[local52] = local62 * this.anInt1502 >> 12;
					local50[local52] = local66 * this.anInt1501 >> 12;
				} else {
					local42[local52] = this.anInt1500;
					local46[local52] = this.anInt1502;
					local50[local52] = this.anInt1501;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1500 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt1502 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt1501 = arg0.method5198();
		}
	}
}
