import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class6_Sub3_Sub18 extends Class6_Sub3 {

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	private int anInt3497 = 4096;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
	private int anInt3499 = 4096;

	@OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
	private int anInt3504 = 4096;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3504 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt3499 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt3497 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(26) int[][] local26 = this.method7961(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static35.anInt670; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = this.anInt3504 * local58 >> 12;
					local46[local52] = local62 * this.anInt3499 >> 12;
					local50[local52] = this.anInt3497 * local66 >> 12;
				} else {
					local42[local52] = this.anInt3504;
					local46[local52] = this.anInt3499;
					local50[local52] = this.anInt3497;
				}
			}
		}
		return local11;
	}
}
