import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!fl;I[IB)V")
	public static void method7558(@OriginalArg(0) Class23_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray651 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray651.length; local8++) {
				if (arg2[local8] != arg0.anIntArray651[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt10135 != -1) {
				@Pc(45) Class48 local45 = Static483.aClass373_2.method8323(arg0.anInt10135);
				@Pc(48) int local48 = local45.anInt1546;
				if (local48 == 1) {
					arg0.anInt10186 = arg1;
					arg0.anInt10140 = 0;
					arg0.anInt10149 = 0;
					arg0.anInt10163 = 0;
					arg0.anInt10143 = 1;
					if (!arg0.aBoolean747) {
						Static4.method49(arg0, local45, arg0.anInt10163);
					}
				}
				if (local48 == 2) {
					arg0.anInt10149 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray651 == null || arg0.anIntArray651[local8] == -1 || Static483.aClass373_2.method8323(arg2[local8]).anInt1550 >= Static483.aClass373_2.method8323(arg0.anIntArray651[local8]).anInt1550) {
				arg0.anInt10186 = arg1;
				arg0.anIntArray651 = arg2;
				break;
			}
		}
		if (local6) {
			arg0.anInt10186 = arg1;
			arg0.anIntArray651 = arg2;
		}
	}
}
