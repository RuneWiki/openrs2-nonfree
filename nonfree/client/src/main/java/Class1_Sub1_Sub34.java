import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
	private boolean aBoolean326 = true;

	@OriginalMember(owner = "client!so", name = "S", descriptor = "Z")
	private boolean aBoolean327 = true;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(36) int[] local36 = this.method4716(0, this.aBoolean327 ? Static279.anInt5616 - arg0 : arg0);
			if (this.aBoolean326) {
				for (@Pc(41) int local41 = 0; local41 < Static62.anInt1350; local41++) {
					local7[local41] = local36[Static302.anInt6003 - local41];
				}
			} else {
				Static319.method1420(local36, 0, local7, 0, Static62.anInt1350);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean326 = arg0.method2199() == 1;
		} else if (arg1 == 1) {
			this.aBoolean327 = arg0.method2199() == 1;
		} else if (arg1 == 2) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(35) int[][] local35 = this.method4715(this.aBoolean327 ? Static279.anInt5616 - arg0 : arg0, 0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local17[1];
			@Pc(47) int[] local47 = local35[1];
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local35[2];
			@Pc(59) int[] local59 = local17[2];
			@Pc(64) int local64;
			if (this.aBoolean326) {
				for (local64 = 0; local64 < Static62.anInt1350; local64++) {
					local51[local64] = local39[Static302.anInt6003 - local64];
					local43[local64] = local47[Static302.anInt6003 - local64];
					local59[local64] = local55[Static302.anInt6003 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static62.anInt1350; local64++) {
					local51[local64] = local39[local64];
					local43[local64] = local47[local64];
					local59[local64] = local55[local64];
				}
			}
		}
		return local17;
	}
}
