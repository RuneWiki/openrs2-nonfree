import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class2_Sub6_Sub5 extends Class2_Sub6 {

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "Z")
	private boolean aBoolean125 = true;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "Z")
	private boolean aBoolean124 = true;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(33) int[][] local33 = this.method5640(0, this.aBoolean124 ? Static71.anInt1349 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local16[0];
			@Pc(53) int[] local53 = local16[1];
			@Pc(57) int[] local57 = local16[2];
			@Pc(62) int local62;
			if (this.aBoolean125) {
				for (local62 = 0; local62 < Static151.anInt2711; local62++) {
					local49[local62] = local37[Static274.anInt1078 - local62];
					local53[local62] = local41[Static274.anInt1078 - local62];
					local57[local62] = local45[Static274.anInt1078 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static151.anInt2711; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(34) int[] local34 = this.method5635(this.aBoolean124 ? Static71.anInt1349 - arg0 : arg0, 0);
			if (this.aBoolean125) {
				for (@Pc(47) int local47 = 0; local47 < Static151.anInt2711; local47++) {
					local16[local47] = local34[Static274.anInt1078 - local47];
				}
			} else {
				Static406.method5658(local34, 0, local16, 0, Static151.anInt2711);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean125 = arg0.method4240() == 1;
		} else if (arg1 == 1) {
			this.aBoolean124 = arg0.method4240() == 1;
		} else if (arg1 == 2) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}
}
