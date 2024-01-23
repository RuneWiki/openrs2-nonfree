import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public static int anInt5009;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "I")
	public static int anInt5010;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	public static int anInt5014;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Loading fonts - ";

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[Lclient!go;")
	public static Class68[] aClass68Array1 = new Class68[8];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBIZ)I")
	public static int method3897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class1_Sub8 local17 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg0);
		if (local17 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local17.anIntArray57.length; local26++) {
			if (local17.anIntArray57[local26] >= 0 && Static61.anInt1211 > local17.anIntArray57[local26]) {
				@Pc(57) Class149 local57 = Static271.method4006(local17.anIntArray57[local26]);
				if (local57.aClass156_22 != null) {
					@Pc(70) Class1_Sub13 local70 = (Class1_Sub13) local57.aClass156_22.method3821((long) arg1);
					if (local70 != null) {
						if (arg2) {
							local24 += local17.anIntArray58[local26] * local70.anInt2852;
						} else {
							local24 += local70.anInt2852;
						}
					}
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!ph;Z)Lclient!in;")
	public static Class1_Sub1_Sub3 method3898(@OriginalArg(1) int arg0, @OriginalArg(2) Class138 arg1) {
		return Static27.method486(arg0, 0, arg1) ? Static175.method2926() : null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3900(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(17) String local17 = Static136.method2200(arg0);
		if (local17 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static268.anInt5931; local23++) {
			@Pc(36) String local36 = Static136.method2200(Static57.aStringArray8[local23]);
			if (local36 != null && local36.equals(local17)) {
				Static268.anInt5931--;
				for (@Pc(53) int local53 = local23; local53 < Static268.anInt5931; local53++) {
					Static57.aStringArray8[local53] = Static57.aStringArray8[local53 + 1];
					Static172.aStringArray3[local53] = Static172.aStringArray3[local53 + 1];
					Static90.aBooleanArray49[local53] = Static90.aBooleanArray49[local53 + 1];
				}
				Static214.anInt4214 = Static314.anInt5908;
				Static137.aClass1_Sub14_Sub1_6.method2661(121);
				Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(arg0));
				Static137.aClass1_Sub14_Sub1_6.method2619(arg0);
				break;
			}
		}
	}
}
