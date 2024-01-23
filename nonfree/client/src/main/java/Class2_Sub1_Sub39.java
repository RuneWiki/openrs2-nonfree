import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class2_Sub1_Sub39 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wl", name = "T", descriptor = "Z")
	private boolean aBoolean493 = true;

	@OriginalMember(owner = "client!wl", name = "eb", descriptor = "Z")
	private boolean aBoolean494 = true;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean494 = arg0.method4261() == 1;
		} else if (arg1 == 1) {
			this.aBoolean493 = arg0.method4261() == 1;
		} else if (arg1 == 2) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(34) int[] local34 = this.method4946(this.aBoolean493 ? Static39.anInt939 - arg0 : arg0, 0);
			if (this.aBoolean494) {
				for (@Pc(39) int local39 = 0; local39 < Static114.anInt1359; local39++) {
					local17[local39] = local34[Static129.anInt2676 - local39];
				}
			} else {
				Static301.method299(local34, 0, local17, 0, Static114.anInt1359);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(35) int[][] local35 = this.method4937(0, this.aBoolean493 ? Static39.anInt939 - arg0 : arg0);
			@Pc(39) int[] local39 = local35[1];
			@Pc(43) int[] local43 = local35[0];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local35[2];
			@Pc(59) int[] local59 = local11[2];
			@Pc(64) int local64;
			if (this.aBoolean494) {
				for (local64 = 0; local64 < Static114.anInt1359; local64++) {
					local47[local64] = local43[Static129.anInt2676 - local64];
					local51[local64] = local39[Static129.anInt2676 - local64];
					local59[local64] = local55[Static129.anInt2676 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static114.anInt1359; local64++) {
					local47[local64] = local43[local64];
					local51[local64] = local39[local64];
					local59[local64] = local55[local64];
				}
			}
		}
		return local11;
	}
}
