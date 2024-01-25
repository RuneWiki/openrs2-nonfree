import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class4_Sub1_Sub37 extends Class4_Sub1 {

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
	private int anInt9867 = 4096;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	private int anInt9866 = 4096;

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
	private int anInt9871 = 4096;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9866 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt9871 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt9867 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(26) int[][] local26 = this.method8385(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static376.anInt7260; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local66 == local62) {
					local42[local52] = local58 * this.anInt9866 >> 12;
					local46[local52] = local62 * this.anInt9871 >> 12;
					local50[local52] = local66 * this.anInt9867 >> 12;
				} else {
					local42[local52] = this.anInt9866;
					local46[local52] = this.anInt9871;
					local50[local52] = this.anInt9867;
				}
			}
		}
		return local16;
	}
}
