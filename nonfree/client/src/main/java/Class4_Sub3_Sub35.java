import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class4_Sub3_Sub35 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ug", name = "Z", descriptor = "[Lclient!d;")
	private Class18[] aClass18Array1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(22) int local22 = Static61.anInt1639;
			@Pc(24) int local24 = Static134.anInt3188;
			@Pc(28) int[][] local28 = new int[local22][local24];
			@Pc(33) int[][][] local33 = super.aClass39_41.method1501();
			this.method2986(local28);
			for (@Pc(39) int local39 = 0; local39 < Static61.anInt1639; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[2];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[0];
				for (@Pc(63) int local63 = 0; local63 < Static134.anInt3188; local63++) {
					@Pc(69) int local69 = local45[local63];
					local53[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local61[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[[I)V")
	private void method2986(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static61.anInt1639;
		@Pc(9) int local9 = Static134.anInt3188;
		Static136.method2379(arg0);
		Static52.method1027(Static2.anInt80, Static5.anInt216);
		if (this.aClass18Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass18Array1.length; local23++) {
			@Pc(30) Class18 local30 = this.aClass18Array1[local23];
			@Pc(33) int local33 = local30.anInt753;
			@Pc(36) int local36 = local30.anInt754;
			if (local33 < 0) {
				if (local36 >= 0) {
					local30.method492(local9, local7);
				}
			} else if (local36 < 0) {
				local30.method490(local7, local9);
			} else {
				local30.method491(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			this.method2986(super.aClass64_41.method2208());
		}
		return local13;
	}
}
