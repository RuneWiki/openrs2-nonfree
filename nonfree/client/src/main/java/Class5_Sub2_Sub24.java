import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class5_Sub2_Sub24 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
	private int anInt7374 = 4096;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
	private int anInt7379 = 4096;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	private int anInt7376 = 4096;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(26) int[][] local26 = this.method9033(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static597.anInt10025; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local66 == local62) {
					local42[local52] = local58 * this.anInt7374 >> 12;
					local46[local52] = this.anInt7379 * local62 >> 12;
					local50[local52] = local66 * this.anInt7376 >> 12;
				} else {
					local42[local52] = this.anInt7374;
					local46[local52] = this.anInt7379;
					local50[local52] = this.anInt7376;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7374 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt7379 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt7376 = arg0.method5968();
		}
	}
}
