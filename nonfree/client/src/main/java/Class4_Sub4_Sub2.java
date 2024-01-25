import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
	private int anInt910 = 4096;

	@OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
	private int anInt916 = 0;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt916 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt910 = arg1.method2404();
		} else if (arg0 == 2) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(26) int[][] local26 = this.method5384(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static124.anInt3576; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt916) {
					local42[local52] = this.anInt916;
				} else if (local58 <= this.anInt910) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt910;
				}
				if (local62 < this.anInt916) {
					local46[local52] = this.anInt916;
				} else if (this.anInt910 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt910;
				}
				if (local66 < this.anInt916) {
					local50[local52] = this.anInt916;
				} else if (this.anInt910 < local66) {
					local50[local52] = this.anInt910;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(29) int[] local29 = this.method5386(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static124.anInt3576; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt916) {
					local11[local31] = this.anInt916;
				} else if (this.anInt910 >= local37) {
					local11[local31] = local37;
				} else {
					local11[local31] = this.anInt910;
				}
			}
		}
		return local11;
	}
}
