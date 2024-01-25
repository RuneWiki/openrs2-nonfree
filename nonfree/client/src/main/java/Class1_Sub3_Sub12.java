import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "I")
	private int anInt2177 = 4096;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
	private int anInt2178 = 4096;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
	private int anInt2174 = 4096;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(30) int[][] local30 = this.method5528(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static153.anInt3378; local56++) {
				@Pc(62) int local62 = local34[local56];
				@Pc(66) int local66 = local42[local56];
				@Pc(70) int local70 = local38[local56];
				if (local66 == local62 && local66 == local70) {
					local46[local56] = this.anInt2174 * local62 >> 12;
					local50[local56] = this.anInt2177 * local66 >> 12;
					local54[local56] = local70 * this.anInt2178 >> 12;
				} else {
					local46[local56] = this.anInt2174;
					local50[local56] = this.anInt2177;
					local54[local56] = this.anInt2178;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2174 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt2177 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt2178 = arg1.method4556();
		}
	}
}
