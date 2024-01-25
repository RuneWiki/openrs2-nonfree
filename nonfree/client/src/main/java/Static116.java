import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Lclient!wg;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_42 = new Class92(29, -1);

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_11 = new Class238(6, 4);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	public static void method2019() {
		@Pc(7) Class46 local7 = null;
		try {
			@Pc(12) Class122 local12 = Static45.aClass209_127.method4698("2");
			while (local12.anInt3557 == 0) {
				Static88.method4161(1L);
			}
			if (local12.anInt3557 == 1) {
				local7 = (Class46) local12.anObject7;
				@Pc(39) byte[] local39 = new byte[(int) local7.method1368()];
				@Pc(54) int local54;
				for (@Pc(41) int local41 = 0; local41 < local39.length; local41 += local54) {
					local54 = local7.method1365(local39, local39.length - local41, local41);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static309.method4527(new Class6_Sub1(local39));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method1367();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public static void method2020() {
		if (Static293.aBoolean13) {
			return;
		}
		Static293.aBoolean13 = true;
		Static65.aBoolean151 = true;
		if (Static291.aClass28_Sub1_1.aBoolean85) {
			Static265.aFloat51 = (int) Static265.aFloat51 + 191 & 0xFFFFFF80;
		} else {
			Static29.aFloat4 += (24.0F - Static29.aFloat4) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;Lclient!he;BZ)Lclient!q;")
	public static Class202 method2021(@OriginalArg(0) String arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method2494(arg0);
		if (local10 == -1) {
			return new Class202(0);
		}
		@Pc(28) int[] local28 = arg1.method2504(local10);
		@Pc(34) Class202 local34 = new Class202(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local34.anInt5488 > local36) {
				@Pc(52) Class6_Sub1 local52 = new Class6_Sub1(arg1.method2520(local28[local38++], local10));
				@Pc(56) int local56 = local52.method6442();
				@Pc(60) int local60 = local52.method6485();
				@Pc(64) int local64 = local52.method6433();
				if (!arg2 && local64 == 1) {
					local34.anInt5488--;
				} else {
					local34.anIntArray365[local36] = local56;
					local34.anIntArray366[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
	public static void method2022() {
		if (Static325.anInt5594 == 2) {
			Static270.anInt4876 = 96;
			return;
		}
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Long local31 = (Long) local21.invoke(local25, (Object[]) null);
					Static270.anInt4876 = (int) (local31 / 1048576L) + 1;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}
}
