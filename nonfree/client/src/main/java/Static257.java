import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt5266;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public static int anInt5264 = 0;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!cb;")
	public static final Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[128][128];

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public static int anInt5276 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method4567() {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(15) Class193 local15 = Static197.aClass215_5.method5655();
			while (local15.anInt5986 == 0) {
				Static163.method2863(1L);
			}
			if (local15.anInt5986 == 1) {
				local7 = (Class108) local15.anObject7;
				@Pc(39) byte[] local39 = new byte[(int) local7.method2210()];
				@Pc(54) int local54;
				for (@Pc(41) int local41 = 0; local41 < local39.length; local41 += local54) {
					local54 = local7.method2211(local39, local39.length - local41, local41);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static61.method1154(new Class1_Sub21(local39));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method2207();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZII)V")
	public static void method4570(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static217.aClass105_5 = Static130.method4247(Static235.aCanvas6, Static71.anInterface2_1, Static197.aClass215_5, Static231.anInt4828 * 2, arg1);
		} else {
			if (arg0) {
				Static217.aClass105_5 = Static130.method4247(Static235.aCanvas6, Static71.anInterface2_1, Static197.aClass215_5, 0, 0);
				Static217.aClass105_5.method4295(0);
				@Pc(24) Class34 local24 = Static140.method2320(Static223.anInt1488, Static77.aClass134_33);
				@Pc(33) Class29 local33 = Static217.aClass105_5.method4264(local24, Static369.method5470(Static125.aClass134_55, Static223.anInt1488));
				Static159.method5486(true, Static101.aString78, local33);
				Static217.aClass105_5.method4245();
				Static129.method2096();
				Static217.aClass105_5.method4299();
			}
			try {
				Static217.aClass105_5 = Static130.method4247(Static235.aCanvas6, Static71.anInterface2_1, Static197.aClass215_5, Static231.anInt4828 * 2, arg1);
			} catch (@Pc(57) Throwable local57) {
				arg1 = 0;
				Static217.aClass105_5 = Static130.method4247(Static235.aCanvas6, Static71.anInterface2_1, Static197.aClass215_5, 0, 0);
			}
		}
		if (Static217.aClass105_5.method4224()) {
			@Pc(86) Class1_Sub41 local86 = Static217.aClass105_5.method4306();
			Static217.aClass105_5.method4234(local86);
		}
		Static24.anInt437 = arg1;
		Static74.method1293();
		if (!Static217.aClass105_5.method4219()) {
			Static220.anInt4683 = 1;
		}
		Static217.aClass105_5.method4211(Static220.anInt4683);
		Static217.aClass105_5.method4205(0);
		Static56.aClass31_1 = Static217.aClass105_5.method4267();
		Static127.aClass31_3 = Static217.aClass105_5.method4267();
		@Pc(116) int local116 = (int) ((double) Static43.anInt1151 * 34.46D);
		if (Static217.aClass105_5.method4216()) {
			local116 += 128;
		}
		Static217.aClass105_5.method4277(50, local116);
		Static217.aClass105_5.method4280(!Static42.aBoolean75);
		if (Static217.aClass105_5.method4273()) {
			Static341.method5646(Static311.aBoolean510);
		}
		Static318.aBoolean525 = !Static25.method408();
		Static116.method1840(Static217.aClass105_5, Static260.anInt5348 >> 3, Static43.anInt1151 >> 3);
		Static353.method5855();
		Static275.aBoolean465 = false;
	}
}
