import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
	public static int anInt898;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	public static int anInt900;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_215 = Static158.method3034("Loading config )2 ");

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!ob;")
	public static Class60 aClass60_214 = aClass60_215;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_10 = new Class89(200);

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_1 = new Class67();

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_216 = Static158.method3034("3D)2Softwarebibliothek gestartet");

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_217 = Static158.method3034("titlebutton");

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
	public static int anInt901 = 127;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "[I")
	public static final int[] anIntArray97 = new int[5];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!ob;Lclient!ra;)Lclient!ob;")
	public static Class60 method724(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class72 arg1) {
		if (arg0.method2675(Static1.aClass60_1) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(16) int local16 = arg0.method2675(Static9.aClass60_85);
			if (local16 == -1) {
				while (true) {
					local16 = arg0.method2675(Static68.aClass60_510);
					if (local16 == -1) {
						while (true) {
							local16 = arg0.method2675(Static106.aClass60_854);
							if (local16 == -1) {
								while (true) {
									local16 = arg0.method2675(Static24.aClass60_180);
									if (local16 == -1) {
										while (true) {
											local16 = arg0.method2675(Static179.aClass60_1200);
											if (local16 == -1) {
												while (true) {
													local16 = arg0.method2675(Static187.aClass60_1323);
													if (local16 == -1) {
														return arg0;
													}
													@Pc(229) Class60 local229 = Static101.aClass60_807;
													if (Static32.aClass25_9 != null) {
														local229 = Static187.method3554(Static32.aClass25_9.anInt1694);
														try {
															if (Static32.aClass25_9.anObject2 != null) {
																@Pc(245) byte[] local245 = ((String) Static32.aClass25_9.anObject2).getBytes("ISO-8859-1");
																local229 = Static165.method3103(0, local245, local245.length);
															}
														} catch (@Pc(254) UnsupportedEncodingException local254) {
														}
													}
													arg0 = Static193.method3536(new Class60[] { arg0.method2667(local16, 0), local229, arg0.method2672(local16 + 4) });
												}
											}
											arg0 = Static193.method3536(new Class60[] { arg0.method2667(local16, 0), Static80.method1892(Static85.method1991(4, arg1)), arg0.method2672(local16 + 2) });
										}
									}
									arg0 = Static193.method3536(new Class60[] { arg0.method2667(local16, 0), Static80.method1892(Static85.method1991(3, arg1)), arg0.method2672(local16 + 2) });
								}
							}
							arg0 = Static193.method3536(new Class60[] { arg0.method2667(local16, 0), Static80.method1892(Static85.method1991(2, arg1)), arg0.method2672(local16 + 2) });
						}
					}
					arg0 = Static193.method3536(new Class60[] { arg0.method2667(local16, 0), Static80.method1892(Static85.method1991(1, arg1)), arg0.method2672(local16 + 2) });
				}
			}
			arg0 = Static193.method3536(new Class60[] { arg0.method2667(local16, 0), Static80.method1892(Static85.method1991(0, arg1)), arg0.method2672(local16 + 2) });
		}
	}
}
