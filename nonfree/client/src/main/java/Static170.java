import java.awt.Component;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Z")
	public static boolean aBoolean42;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_284 = null;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public static int anInt803 = 0;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!ed;")
	public static Class23 aClass23_285 = Static169.method2903("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Lclient!ed;")
	public static Class23 aClass23_286 = Static169.method2903("welle:");

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
	public static volatile int anInt814 = -1;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	public static int anInt819 = 0;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
	public static int anInt830 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
	public static boolean method461(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method463() {
		aClass23_284 = null;
		aClass23_285 = null;
		aByteArrayArray5 = null;
		aClass23_286 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	public static boolean method465(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method472(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static93.aClass51_1);
		arg0.addMouseMotionListener(Static93.aClass51_1);
		arg0.addFocusListener(Static93.aClass51_1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ob;Lclient!ed;I)Lclient!ed;")
	public static Class23 method473(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class23 arg1) {
		if (arg1.method655(Static82.aClass23_813) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(22) int local22 = arg1.method655(Static109.aClass23_1072);
			if (local22 == -1) {
				while (true) {
					local22 = arg1.method655(Static96.aClass23_955);
					if (local22 == -1) {
						while (true) {
							local22 = arg1.method655(Class88.aClass23_1595);
							if (local22 == -1) {
								while (true) {
									local22 = arg1.method655(Static129.aClass23_1264);
									if (local22 == -1) {
										while (true) {
											local22 = arg1.method655(Static169.aClass23_1571);
											if (local22 == -1) {
												while (true) {
													local22 = arg1.method655(Static30.aClass23_1079);
													if (local22 == -1) {
														return arg1;
													}
													@Pc(240) Class23 local240 = Static101.aClass23_1001;
													if (Static19.aClass63_1 != null) {
														local240 = Static25.method438(Static19.aClass63_1.anInt3326);
														try {
															if (Static19.aClass63_1.anObject3 != null) {
																@Pc(256) byte[] local256 = ((String) Static19.aClass63_1.anObject3).getBytes("ISO-8859-1");
																local240 = Static85.method1492(0, local256.length, local256);
															}
														} catch (@Pc(265) UnsupportedEncodingException local265) {
														}
													}
													arg1 = Static149.method2571(new Class23[] { arg1.method635(0, local22), local240, arg1.method632(local22 + 4) });
												}
											}
											arg1 = Static149.method2571(new Class23[] { arg1.method635(0, local22), Static154.method2627(Static33.method574(arg0, 4)), arg1.method632(local22 + 2) });
										}
									}
									arg1 = Static149.method2571(new Class23[] { arg1.method635(0, local22), Static154.method2627(Static33.method574(arg0, 3)), arg1.method632(local22 + 2) });
								}
							}
							arg1 = Static149.method2571(new Class23[] { arg1.method635(0, local22), Static154.method2627(Static33.method574(arg0, 2)), arg1.method632(local22 + 2) });
						}
					}
					arg1 = Static149.method2571(new Class23[] { arg1.method635(0, local22), Static154.method2627(Static33.method574(arg0, 1)), arg1.method632(local22 + 2) });
				}
			}
			arg1 = Static149.method2571(new Class23[] { arg1.method635(0, local22), Static154.method2627(Static33.method574(arg0, 0)), arg1.method632(local22 + 2) });
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!ob;)I")
	public static int method475(@OriginalArg(1) Class60 arg0) {
		@Pc(13) Class1_Sub7 local13 = (Class1_Sub7) Static78.aClass10_5.method256((long) arg0.anInt3016 + ((long) arg0.anInt3019 << 32));
		return local13 == null ? arg0.anInt3001 : local13.anInt859;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ga;Lclient!ed;Lclient!ed;I)Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4 method477(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class23 arg2) {
		@Pc(8) int local8 = arg0.method1281(arg2);
		@Pc(19) int local19 = arg0.method1296(arg1, local8);
		return Static177.method3002(local8, local19, arg0);
	}
}
