import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!og", name = "mb", descriptor = "Lclient!id;")
	public static Class35 aClass35_35 = new Class35(8);

	@OriginalMember(owner = "client!og", name = "ob", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1704 = Static107.method1838("Okay");

	@OriginalMember(owner = "client!og", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1705 = Static107.method1838("<col=80ff00>");

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	public static void method1998() {
		aClass28_1704 = null;
		aClass35_35 = null;
		aClass28_1705 = null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!gg;Lclient!ff;)Lclient!gg;")
	public static Class28 method1999(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class24 arg1) {
		if (arg0.method1124(Static122.aClass28_1709) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(16) int local16 = arg0.method1124(Static122.aClass28_1707);
			if (local16 == -1) {
				while (true) {
					local16 = arg0.method1124(Static13.aClass28_403);
					if (local16 == -1) {
						while (true) {
							local16 = arg0.method1124(Static81.aClass28_1463);
							if (local16 == -1) {
								while (true) {
									local16 = arg0.method1124(Static126.aClass28_1744);
									if (local16 == -1) {
										while (true) {
											local16 = arg0.method1124(Static80.aClass28_1216);
											if (local16 == -1) {
												while (true) {
													local16 = arg0.method1124(Static102.aClass28_1466);
													if (local16 == -1) {
														return arg0;
													}
													@Pc(228) Class28 local228 = Static136.aClass28_1828;
													if (Static100.aClass41_3 != null) {
														local228 = Static105.method1829(Static100.aClass41_3.anInt2097);
														try {
															if (Static100.aClass41_3.anObject2 != null) {
																@Pc(244) byte[] local244 = ((String) Static100.aClass41_3.anObject2).getBytes("ISO-8859-1");
																local228 = Static117.method1960(local244, 0, local244.length);
															}
														} catch (@Pc(253) UnsupportedEncodingException local253) {
														}
													}
													arg0 = Static83.method1481(new Class28[] { arg0.method1135(0, local16), local228, arg0.method1131(local16 + 4) });
												}
											}
											arg0 = Static83.method1481(new Class28[] { arg0.method1135(0, local16), Static108.method1850(Static5.method154(4, arg1)), arg0.method1131(local16 + 2) });
										}
									}
									arg0 = Static83.method1481(new Class28[] { arg0.method1135(0, local16), Static108.method1850(Static5.method154(3, arg1)), arg0.method1131(local16 + 2) });
								}
							}
							arg0 = Static83.method1481(new Class28[] { arg0.method1135(0, local16), Static108.method1850(Static5.method154(2, arg1)), arg0.method1131(local16 + 2) });
						}
					}
					arg0 = Static83.method1481(new Class28[] { arg0.method1135(0, local16), Static108.method1850(Static5.method154(1, arg1)), arg0.method1131(local16 + 2) });
				}
			}
			arg0 = Static83.method1481(new Class28[] { arg0.method1135(0, local16), Static108.method1850(Static5.method154(0, arg1)), arg0.method1131(local16 + 2) });
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
	public static void method2000() {
		Static181.aClass14_208.method596();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III)I")
	public static int method2001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
