import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
	private int anInt4110 = 4096;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
	private int anInt4113 = 0;

	static {
		new Class134("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(26) int[][] local26 = this.method5474(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static217.anInt3574; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt4113 > local58) {
					local42[local52] = this.anInt4113;
				} else if (local58 <= this.anInt4110) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt4110;
				}
				if (local62 < this.anInt4113) {
					local46[local52] = this.anInt4113;
				} else if (local62 > this.anInt4110) {
					local46[local52] = this.anInt4110;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt4113 > local66) {
					local50[local52] = this.anInt4113;
				} else if (this.anInt4110 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt4110;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(28) int[] local28 = this.method5472(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static217.anInt3574; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (local36 < this.anInt4113) {
					local18[local30] = this.anInt4113;
				} else if (local36 > this.anInt4110) {
					local18[local30] = this.anInt4110;
				} else {
					local18[local30] = local36;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4113 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt4110 = arg0.method3555();
		} else if (arg1 == 2) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}
}
