import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class4_Sub3_Sub29 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ph", name = "lb", descriptor = "I")
	private int anInt3223;

	@OriginalMember(owner = "client!ph", name = "gb", descriptor = "I")
	private int anInt3220;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3223 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt3220 = arg1.method1252();
		} else if (arg0 == 2) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(26) int[][] local26 = this.method3150(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static134.anInt3188; local52++) {
				@Pc(58) int local58 = local34[local52];
				@Pc(62) int local62 = local30[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt3223) {
					local42[local52] = this.anInt3223;
				} else if (this.anInt3220 < local58) {
					local42[local52] = this.anInt3220;
				} else {
					local42[local52] = local58;
				}
				if (this.anInt3223 > local62) {
					local46[local52] = this.anInt3223;
				} else if (local62 <= this.anInt3220) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt3220;
				}
				if (local66 < this.anInt3223) {
					local50[local52] = this.anInt3223;
				} else if (this.anInt3220 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt3220;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(29) int[] local29 = this.method3149(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static134.anInt3188; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt3223 > local37) {
					local7[local31] = this.anInt3223;
				} else if (local37 > this.anInt3220) {
					local7[local31] = this.anInt3220;
				} else {
					local7[local31] = local37;
				}
			}
		}
		return local7;
	}
}
