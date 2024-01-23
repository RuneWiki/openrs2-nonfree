import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class4_Sub6_Sub36 extends Class4_Sub6 {

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "Z")
	private boolean aBoolean348 = true;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "Z")
	private boolean aBoolean349 = true;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(35) int[][] local35 = this.method4377(this.aBoolean349 ? Static137.anInt2812 - arg0 : arg0, 0);
			@Pc(39) int[] local39 = local16[0];
			@Pc(43) int[] local43 = local35[2];
			@Pc(47) int[] local47 = local35[1];
			@Pc(51) int[] local51 = local16[1];
			@Pc(55) int[] local55 = local16[2];
			@Pc(59) int[] local59 = local35[0];
			@Pc(64) int local64;
			if (this.aBoolean348) {
				for (local64 = 0; local64 < Static2.anInt19; local64++) {
					local39[local64] = local59[Static168.anInt3337 - local64];
					local51[local64] = local47[Static168.anInt3337 - local64];
					local55[local64] = local43[Static168.anInt3337 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static2.anInt19; local64++) {
					local39[local64] = local59[local64];
					local51[local64] = local47[local64];
					local55[local64] = local43[local64];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean348 = arg0.method1874() == 1;
		} else if (arg1 == 1) {
			this.aBoolean349 = arg0.method1874() == 1;
		} else if (arg1 == 2) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(35) int[] local35 = this.method4372(0, this.aBoolean349 ? Static137.anInt2812 - arg0 : arg0);
			if (this.aBoolean348) {
				for (@Pc(48) int local48 = 0; local48 < Static2.anInt19; local48++) {
					local17[local48] = local35[Static168.anInt3337 - local48];
				}
			} else {
				Static307.method3248(local35, 0, local17, 0, Static2.anInt19);
			}
		}
		return local17;
	}
}
