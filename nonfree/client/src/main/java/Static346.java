import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_152 = new Class263(76, 10);

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ia;B)V")
	public static void method4897(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(10) byte[] local10 = new byte[24];
		if (Static119.aClass187_1 != null) {
			@Pc(24) int local24;
			try {
				Static119.aClass187_1.method4261(0L);
				Static119.aClass187_1.method4252(local10);
				for (local24 = 0; local24 < 24 && local10[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local24 = 0; local24 < 24; local24++) {
					local10[local24] = -1;
				}
			}
		}
		arg0.method1181(local10, 24);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Z")
	public static boolean method4898() {
		try {
			if (Static133.anInt2954 == 2) {
				if (Static24.aClass1_Sub18_1 == null) {
					Static24.aClass1_Sub18_1 = Static462.method1950(Static225.aClass211_57, Static199.anInt4097, Static249.anInt4852);
					if (Static24.aClass1_Sub18_1 == null) {
						return false;
					}
				}
				if (Static142.aClass259_1 == null) {
					Static142.aClass259_1 = new Class259(Static146.aClass211_39, Static450.aClass211_92);
				}
				if (Static26.aClass1_Sub19_Sub3_1.method5320(Static142.aClass259_1, Static363.aClass211_76, Static24.aClass1_Sub18_1)) {
					Static26.aClass1_Sub19_Sub3_1.method5297();
					Static26.aClass1_Sub19_Sub3_1.method5304(Static269.anInt5203);
					Static26.aClass1_Sub19_Sub3_1.method5301(Static353.aBoolean476, Static24.aClass1_Sub18_1);
					Static24.aClass1_Sub18_1 = null;
					Static133.anInt2954 = 0;
					Static225.aClass211_57 = null;
					Static142.aClass259_1 = null;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static26.aClass1_Sub19_Sub3_1.method5294();
			Static133.anInt2954 = 0;
			Static225.aClass211_57 = null;
			Static24.aClass1_Sub18_1 = null;
			Static142.aClass259_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)[Lclient!ui;")
	public static Class248[] method4899() {
		return new Class248[] { Static59.aClass248_1, Static374.aClass248_6, Static63.aClass248_2, Static436.aClass248_9, Static366.aClass248_8, Static437.aClass248_10 };
	}
}
