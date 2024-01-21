import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!k", name = "kb", descriptor = "Z")
	private boolean aBoolean106;

	@OriginalMember(owner = "client!k", name = "lb", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean107 = arg1.method1698() == 1;
		} else if (arg0 == 1) {
			this.aBoolean106 = arg1.method1698() == 1;
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int[] local25 = this.method2901(0, this.aBoolean106 ? Static1.anInt2959 - arg0 : arg0);
			if (this.aBoolean107) {
				for (@Pc(30) int local30 = 0; local30 < Static54.anInt1423; local30++) {
					local7[local30] = local25[Static73.anInt1916 - local30];
				}
			} else {
				Static184.method1642(local25, 0, local7, 0, Static54.anInt1423);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(33) int[][] local33 = this.method2900(this.aBoolean106 ? Static1.anInt2959 - arg0 : arg0, 0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[2];
			@Pc(45) int[] local45 = local33[1];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(62) int local62;
			if (this.aBoolean107) {
				for (local62 = 0; local62 < Static54.anInt1423; local62++) {
					local53[local62] = local37[Static73.anInt1916 - local62];
					local57[local62] = local45[Static73.anInt1916 - local62];
					local49[local62] = local41[Static73.anInt1916 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static54.anInt1423; local62++) {
					local53[local62] = local37[local62];
					local57[local62] = local45[local62];
					local49[local62] = local41[local62];
				}
			}
		}
		return local11;
	}
}
