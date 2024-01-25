import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "Z")
	private boolean aBoolean412 = true;

	@OriginalMember(owner = "client!qg", name = "J", descriptor = "Z")
	private boolean aBoolean413 = true;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(39) int[][] local39 = this.method5474(0, this.aBoolean413 ? Static157.anInt2698 - arg0 : arg0);
			@Pc(43) int[] local43 = local39[0];
			@Pc(47) int[] local47 = local39[1];
			@Pc(51) int[] local51 = local39[2];
			@Pc(55) int[] local55 = local19[0];
			@Pc(59) int[] local59 = local19[1];
			@Pc(63) int[] local63 = local19[2];
			@Pc(68) int local68;
			if (this.aBoolean412) {
				for (local68 = 0; local68 < Static217.anInt3574; local68++) {
					local55[local68] = local43[Static127.anInt2287 - local68];
					local59[local68] = local47[Static127.anInt2287 - local68];
					local63[local68] = local51[Static127.anInt2287 - local68];
				}
			} else {
				for (local68 = 0; local68 < Static217.anInt3574; local68++) {
					local55[local68] = local43[local68];
					local59[local68] = local47[local68];
					local63[local68] = local51[local68];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(35) int[] local35 = this.method5472(this.aBoolean413 ? Static157.anInt2698 - arg0 : arg0, 0);
			if (this.aBoolean412) {
				for (@Pc(40) int local40 = 0; local40 < Static217.anInt3574; local40++) {
					local11[local40] = local35[Static127.anInt2287 - local40];
				}
			} else {
				Static464.method1965(local35, 0, local11, 0, Static217.anInt3574);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean412 = arg0.method3580() == 1;
		} else if (arg1 == 1) {
			this.aBoolean413 = arg0.method3580() == 1;
		} else if (arg1 == 2) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}
}
