import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
	private int anInt1757;

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
	private int anInt1756;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt1756 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt1757 = arg1.method1280();
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(31) int[] local31 = this.method3401(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static22.anInt596; local33++) {
				@Pc(39) int local39 = local31[local33];
				if (this.anInt1756 > local39) {
					local9[local33] = this.anInt1756;
				} else if (this.anInt1757 >= local39) {
					local9[local33] = local39;
				} else {
					local9[local33] = this.anInt1757;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(26) int[][] local26 = this.method3390(arg0, 0);
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local26[1];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static22.anInt596; local52++) {
				@Pc(58) int local58 = local34[local52];
				@Pc(62) int local62 = local42[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt1756) {
					local30[local52] = this.anInt1756;
				} else if (local58 <= this.anInt1757) {
					local30[local52] = local58;
				} else {
					local30[local52] = this.anInt1757;
				}
				if (this.anInt1756 > local62) {
					local46[local52] = this.anInt1756;
				} else if (this.anInt1757 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt1757;
				}
				if (this.anInt1756 > local66) {
					local50[local52] = this.anInt1756;
				} else if (local66 <= this.anInt1757) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt1757;
				}
			}
		}
		return local11;
	}
}
