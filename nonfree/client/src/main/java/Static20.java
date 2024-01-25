import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!as", name = "w", descriptor = "I")
	public static int anInt8162;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "[Lclient!dr;")
	public static final Class84[] aClass84Array3 = new Class84[14];

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
	public static void method6754() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static534.anInt8751 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Lclient!oj;")
	public static Class243 method6755(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static270.aFloat47 == 3.0D) {
				return Static80.aClass243_2;
			}
			if ((double) Static270.aFloat47 == 4.0D) {
				return Static157.aClass243_4;
			}
			if ((double) Static270.aFloat47 == 6.0D) {
				return Static16.aClass243_1;
			}
			if ((double) Static270.aFloat47 >= 8.0D) {
				return Static87.aClass243_3;
			}
		} else if (arg0 == 1) {
			if ((double) Static270.aFloat47 == 3.0D) {
				return Static16.aClass243_1;
			}
			if ((double) Static270.aFloat47 == 4.0D) {
				return Static87.aClass243_3;
			}
			if ((double) Static270.aFloat47 == 6.0D) {
				return Static331.aClass243_6;
			}
			if ((double) Static270.aFloat47 >= 8.0D) {
				return Static407.aClass243_7;
			}
		} else if (arg0 == 2) {
			if ((double) Static270.aFloat47 == 3.0D) {
				return Static331.aClass243_6;
			}
			if ((double) Static270.aFloat47 == 4.0D) {
				return Static407.aClass243_7;
			}
			if ((double) Static270.aFloat47 == 6.0D) {
				return Static488.aClass243_8;
			}
			if ((double) Static270.aFloat47 >= 8.0D) {
				return Static204.aClass243_5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(B)[Lclient!pk;")
	public static Class258[] method6759() {
		return new Class258[] { Static375.aClass258_6, Static212.aClass258_4, Static99.aClass258_1, Static158.aClass258_2, Static558.aClass258_7, Static282.aClass258_5 };
	}
}
