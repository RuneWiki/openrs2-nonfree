import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public static int anInt5585;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!g;")
	public static Class83 aClass83_107;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	public static int anInt5587;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_85 = new Class183(7, 5);

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public static int anInt5588 = 0;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!id;")
	public static final Class105 aClass105_8 = new Class105(16);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	public static void method4908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static303.anInt7065 == 1) {
			Static133.method2328(arg0, Static53.aClass2_Sub43_1, arg1);
		} else if (Static303.anInt7065 == 2) {
			Static346.method5533(arg0, arg1);
		}
		Static303.anInt7065 = 0;
		Static53.aClass2_Sub43_1 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Z")
	public static boolean method4909(@OriginalArg(1) int arg0) {
		if (Static260.aBooleanArray19[arg0]) {
			return true;
		} else if (Static180.aClass83_69.method1978(arg0)) {
			@Pc(23) int local23 = Static180.aClass83_69.method1955(arg0);
			if (local23 == 0) {
				Static260.aBooleanArray19[arg0] = true;
				return true;
			}
			if (Static272.aClass3ArrayArray1[arg0] == null) {
				Static272.aClass3ArrayArray1[arg0] = new Class3[local23];
			}
			for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
				if (Static272.aClass3ArrayArray1[arg0][local53] == null) {
					@Pc(67) byte[] local67 = Static180.aClass83_69.method1968(local53, arg0);
					if (local67 != null) {
						@Pc(79) Class3 local79 = Static272.aClass3ArrayArray1[arg0][local53] = new Class3();
						local79.anInt94 = (arg0 << 16) + local53;
						if (local67[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local79.method48(new Class2_Sub24(local67));
					}
				}
			}
			Static260.aBooleanArray19[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
