import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(26) int[] local26 = this.method4117(0, arg0);
			@Pc(32) int[] local32 = this.method4117(1, arg0);
			@Pc(38) int[] local38 = this.method4117(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static110.anInt2934; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local7[local40] = local26[local40];
				} else if (local46 == 0) {
					local7[local40] = local32[local40];
				} else {
					local7[local40] = local46 * local26[local40] + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(29) int[] local29 = this.method4117(2, arg0);
			@Pc(35) int[][] local35 = this.method4129(0, arg0);
			@Pc(41) int[][] local41 = this.method4129(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[1];
			@Pc(57) int[] local57 = local35[1];
			@Pc(61) int[] local61 = local35[0];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[1];
			@Pc(73) int[] local73 = local41[0];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static110.anInt2934; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local61[local79];
					local53[local79] = local57[local79];
					local49[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local73[local79];
					local53[local79] = local69[local79];
					local49[local79] = local77[local79];
				} else {
					@Pc(137) int local137 = 4096 - local85;
					local45[local79] = local73[local79] * local137 + local85 * local61[local79] >> 12;
					local53[local79] = local85 * local57[local79] + local69[local79] * local137 >> 12;
					local49[local79] = local137 * local77[local79] + local65[local79] * local85 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}
}
