import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!pq;III)Lclient!rf;")
	public static Class274 method3550(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = arg0.method5860(arg1, 0);
		return local11 == null ? null : new Class274(local11);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Z")
	public static boolean method3552() {
		try {
			if (Static140.anInt2527 == 2) {
				if (Static224.aClass6_Sub46_1 == null) {
					Static224.aClass6_Sub46_1 = Static591.method6872(Static466.aClass251_130, Static259.anInt4237, Static74.anInt1223);
					if (Static224.aClass6_Sub46_1 == null) {
						return false;
					}
				}
				if (Static485.aClass152_1 == null) {
					Static485.aClass152_1 = new Class152(Static11.aClass251_2, Static415.aClass251_121);
				}
				if (Static143.aClass6_Sub19_Sub4_7.method7715(Static224.aClass6_Sub46_1, Static485.aClass152_1, Static120.aClass251_41)) {
					Static143.aClass6_Sub19_Sub4_7.method7737();
					Static143.aClass6_Sub19_Sub4_7.method7739(Static192.anInt3325);
					Static143.aClass6_Sub19_Sub4_7.method7728(Static396.aBoolean490, Static224.aClass6_Sub46_1);
					Static466.aClass251_130 = null;
					Static485.aClass152_1 = null;
					Static140.anInt2527 = 0;
					Static224.aClass6_Sub46_1 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static143.aClass6_Sub19_Sub4_7.method7702();
			Static224.aClass6_Sub46_1 = null;
			Static140.anInt2527 = 0;
			Static466.aClass251_130 = null;
			Static485.aClass152_1 = null;
		}
		return false;
	}
}
