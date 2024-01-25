import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class11_Sub2_Sub22 extends Class11_Sub2 {

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(41) int[] local41 = this.method5710(0, this.aBoolean234 ? Static75.anInt1419 - arg0 : arg0);
			if (this.aBoolean233) {
				for (@Pc(46) int local46 = 0; local46 < Static339.anInt6549; local46++) {
					local11[local46] = local41[Static323.anInt6272 - local46];
				}
			} else {
				Static363.method1672(local41, 0, local11, 0, Static339.anInt6549);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(35) int[][] local35 = this.method5715(this.aBoolean234 ? Static75.anInt1419 - arg0 : arg0, 0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local35[1];
			@Pc(47) int[] local47 = local35[2];
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			@Pc(64) int local64;
			if (this.aBoolean233) {
				for (local64 = 0; local64 < Static339.anInt6549; local64++) {
					local51[local64] = local39[Static323.anInt6272 - local64];
					local55[local64] = local43[Static323.anInt6272 - local64];
					local59[local64] = local47[Static323.anInt6272 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static339.anInt6549; local64++) {
					local51[local64] = local39[local64];
					local55[local64] = local43[local64];
					local59[local64] = local47[local64];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean233 = arg0.method5185() == 1;
		} else if (arg1 == 1) {
			this.aBoolean234 = arg0.method5185() == 1;
		} else if (arg1 == 2) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}
}
