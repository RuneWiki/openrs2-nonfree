import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "[[[Lclient!iia;")
	public static Class174[][][] aClass174ArrayArrayArray1;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
	public static int anInt4356;

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "Lclient!la;")
	public static Class208 aClass208_58;

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
	public static int anInt4357 = 100;

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "[Lclient!uf;")
	public static final Class5_Sub43[] aClass5_Sub43Array2 = new Class5_Sub43[8];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method3720() throws IOException {
		if (Static492.aClass295_1 == null || Static206.anInt3369 <= 0) {
			return;
		}
		Static604.aClass5_Sub23_10.anInt9869 = 0;
		while (true) {
			@Pc(17) Class5_Sub50 local17 = (Class5_Sub50) Static345.aClass102_42.method1916();
			if (local17 == null || Static604.aClass5_Sub23_10.aByteArray102.length - Static604.aClass5_Sub23_10.anInt9869 < local17.anInt9621) {
				Static492.aClass295_1.method7026(Static604.aClass5_Sub23_10.aByteArray102, Static604.aClass5_Sub23_10.anInt9869);
				Static446.anInt7690 += Static604.aClass5_Sub23_10.anInt9869;
				Static453.anInt7762 = 0;
				break;
			}
			Static604.aClass5_Sub23_10.method8528(local17.anInt9621, 0, local17.aClass5_Sub23_Sub2_2.aByteArray102);
			Static206.anInt3369 -= local17.anInt9621;
			local17.method9327(1);
			local17.aClass5_Sub23_Sub2_2.method8478();
			local17.method8243();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
	public static boolean method3723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
