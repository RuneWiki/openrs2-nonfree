import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class5_Sub1_Sub25 extends Class5_Sub1 {

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "Z")
	private boolean aBoolean122 = true;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "Z")
	private boolean aBoolean123 = true;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean123 = arg0.method3062() == 1;
		} else if (arg1 == 1) {
			this.aBoolean122 = arg0.method3062() == 1;
		} else if (arg1 == 2) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(32) int[] local32 = this.method3196(this.aBoolean122 ? Static3.anInt74 - arg0 : arg0, 0);
			if (this.aBoolean123) {
				for (@Pc(37) int local37 = 0; local37 < Static174.anInt3489; local37++) {
					local11[local37] = local32[Static189.anInt3753 - local37];
				}
			} else {
				Static220.method50(local32, 0, local11, 0, Static174.anInt3489);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(35) int[][] local35 = this.method3191(0, this.aBoolean122 ? Static3.anInt74 - arg0 : arg0);
			@Pc(39) int[] local39 = local35[1];
			@Pc(43) int[] local43 = local35[2];
			@Pc(47) int[] local47 = local35[0];
			@Pc(51) int[] local51 = local17[1];
			@Pc(55) int[] local55 = local17[0];
			@Pc(59) int[] local59 = local17[2];
			@Pc(64) int local64;
			if (this.aBoolean123) {
				for (local64 = 0; local64 < Static174.anInt3489; local64++) {
					local55[local64] = local47[Static189.anInt3753 - local64];
					local51[local64] = local39[Static189.anInt3753 - local64];
					local59[local64] = local43[Static189.anInt3753 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static174.anInt3489; local64++) {
					local55[local64] = local47[local64];
					local51[local64] = local39[local64];
					local59[local64] = local43[local64];
				}
			}
		}
		return local17;
	}
}
