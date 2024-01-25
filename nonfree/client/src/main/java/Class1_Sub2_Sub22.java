import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
	private int anInt3569 = 0;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
	private int anInt3572 = 4096;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(29) int[] local29 = this.method5654(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static251.anInt6509; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt3569) {
					local19[local31] = this.anInt3569;
				} else if (this.anInt3572 < local37) {
					local19[local31] = this.anInt3572;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(26) int[][] local26 = this.method5659(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static251.anInt6509; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt3569) {
					local42[local52] = this.anInt3569;
				} else if (this.anInt3572 >= local58) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt3572;
				}
				if (this.anInt3569 > local62) {
					local46[local52] = this.anInt3569;
				} else if (local62 > this.anInt3572) {
					local46[local52] = this.anInt3572;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt3569 > local66) {
					local50[local52] = this.anInt3569;
				} else if (local66 > this.anInt3572) {
					local50[local52] = this.anInt3572;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3569 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt3572 = arg1.method3115();
		} else if (arg0 == 2) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}
}
