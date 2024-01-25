import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_130 = new Class61(9, -1);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!pj;I)V")
	public static void method7793(@OriginalArg(0) Class4_Sub37 arg0) {
		if (Static309.aClass100ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface17 local8 = null;
		if (arg0.anInt7089 == 0) {
			local8 = (Interface17) Static216.method3734(arg0.anInt7083, arg0.anInt7084, arg0.anInt7086);
		}
		if (arg0.anInt7089 == 1) {
			local8 = (Interface17) Static183.method3413(arg0.anInt7083, arg0.anInt7084, arg0.anInt7086);
		}
		if (arg0.anInt7089 == 2) {
			local8 = (Interface17) Static541.method7510(arg0.anInt7083, arg0.anInt7084, arg0.anInt7086, qi.class);
		}
		if (arg0.anInt7089 == 3) {
			local8 = (Interface17) Static38.method651(arg0.anInt7083, arg0.anInt7084, arg0.anInt7086);
		}
		if (local8 == null) {
			arg0.anInt7092 = 0;
			arg0.anInt7091 = -1;
			arg0.anInt7095 = 0;
		} else {
			arg0.anInt7091 = local8.method7743();
			arg0.anInt7092 = local8.method7742();
			arg0.anInt7095 = local8.method7744();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	public static void method7794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static309.aClass100ArrayArrayArray2[0][arg1][arg2] != null && Static309.aClass100ArrayArrayArray2[0][arg1][arg2].aClass100_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static309.aClass100ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class100 local46 = Static309.aClass100ArrayArrayArray2[local22][arg1][arg2] = new Class100(local22, arg1, arg2);
				if (local20) {
					local46.aByte34++;
				}
			}
		}
	}
}
