import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt4258;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public static int anInt4261;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!al;")
	public static Interface1 anInterface1_4;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_69 = new Class154(260);

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!fd;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3585(@OriginalArg(1) Class72 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(10) int local10 = arg1.indexOf("%1");
			if (local10 == -1) {
				while (true) {
					local10 = arg1.indexOf("%2");
					if (local10 == -1) {
						while (true) {
							local10 = arg1.indexOf("%3");
							if (local10 == -1) {
								while (true) {
									local10 = arg1.indexOf("%4");
									if (local10 == -1) {
										while (true) {
											local10 = arg1.indexOf("%5");
											if (local10 == -1) {
												while (true) {
													local10 = arg1.indexOf("%dns");
													if (local10 == -1) {
														return arg1;
													}
													@Pc(184) String local184 = "";
													if (Static183.aClass51_6 != null) {
														if (Static183.aClass51_6.anObject1 == null) {
															local184 = Static199.method5385(Static183.aClass51_6.anInt1230);
														} else {
															local184 = (String) Static183.aClass51_6.anObject1;
														}
													}
													arg1 = arg1.substring(0, local10) + local184 + arg1.substring(local10 + 4);
												}
											}
											arg1 = arg1.substring(0, local10) + Static92.method1638(Static1.method1(4, arg0)) + arg1.substring(local10 + 2);
										}
									}
									arg1 = arg1.substring(0, local10) + Static92.method1638(Static1.method1(3, arg0)) + arg1.substring(local10 + 2);
								}
							}
							arg1 = arg1.substring(0, local10) + Static92.method1638(Static1.method1(2, arg0)) + arg1.substring(local10 + 2);
						}
					}
					arg1 = arg1.substring(0, local10) + Static92.method1638(Static1.method1(1, arg0)) + arg1.substring(local10 + 2);
				}
			}
			arg1 = arg1.substring(0, local10) + Static92.method1638(Static1.method1(0, arg0)) + arg1.substring(local10 + 2);
		}
	}
}
