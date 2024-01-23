import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[S")
	public static short[] aShortArray41 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public static int anInt2766 = -1;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_738 = Static231.method3737("Stufe)2");

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	public static void method2119(@OriginalArg(0) int arg0) {
		Static13.anInt332 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static159.anInt3497; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static213.anInt4593; local6++) {
				if (Static174.aClass1_Sub9ArrayArrayArray2[arg0][local3][local6] == null) {
					Static174.aClass1_Sub9ArrayArrayArray2[arg0][local3][local6] = new Class1_Sub9(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!o;ILclient!sc;)Lclient!sc;")
	public static Class107 method2120(@OriginalArg(0) Class86 arg0, @OriginalArg(2) Class107 arg1) {
		if (arg1.method3089(Static7.aClass107_105) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method3089(Static166.aClass107_1144);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method3089(Static63.aClass107_428);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method3089(Static200.aClass107_928);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method3089(Static73.aClass107_485);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method3089(Static112.aClass107_669);
											if (local13 == -1) {
												while (true) {
													local13 = arg1.method3089(Static66.aClass107_432);
													if (local13 == -1) {
														return arg1;
													}
													@Pc(225) Class107 local225 = Static63.aClass107_427;
													if (Static8.aClass84_1 != null) {
														local225 = Static128.method2149(Static8.aClass84_1.anInt3170);
														try {
															if (Static8.aClass84_1.anObject4 != null) {
																@Pc(241) byte[] local241 = ((String) Static8.aClass84_1.anObject4).getBytes("ISO-8859-1");
																local225 = Static140.method661(0, local241.length, local241);
															}
														} catch (@Pc(250) UnsupportedEncodingException local250) {
														}
													}
													arg1 = Static149.method2437(new Class107[] { arg1.method3104(0, local13), local225, arg1.method3084(local13 + 4) });
												}
											}
											arg1 = Static149.method2437(new Class107[] { arg1.method3104(0, local13), Static126.method2106(Static173.method2748(arg0, 4)), arg1.method3084(local13 + 2) });
										}
									}
									arg1 = Static149.method2437(new Class107[] { arg1.method3104(0, local13), Static126.method2106(Static173.method2748(arg0, 3)), arg1.method3084(local13 + 2) });
								}
							}
							arg1 = Static149.method2437(new Class107[] { arg1.method3104(0, local13), Static126.method2106(Static173.method2748(arg0, 2)), arg1.method3084(local13 + 2) });
						}
					}
					arg1 = Static149.method2437(new Class107[] { arg1.method3104(0, local13), Static126.method2106(Static173.method2748(arg0, 1)), arg1.method3084(local13 + 2) });
				}
			}
			arg1 = Static149.method2437(new Class107[] { arg1.method3104(0, local13), Static126.method2106(Static173.method2748(arg0, 0)), arg1.method3084(local13 + 2) });
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!rb;BLclient!rb;)V")
	public static void method2122(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_204 != null) {
			arg1.method3735();
		}
		arg1.aClass1_203 = arg0;
		arg1.aClass1_204 = arg0.aClass1_204;
		arg1.aClass1_204.aClass1_203 = arg1;
		arg1.aClass1_203.aClass1_204 = arg1;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!sc;BI)V")
	public static void method2123(@OriginalArg(0) Class107 arg0, @OriginalArg(2) int arg1) {
		Static193.aClass1_Sub26_Sub1_2.method3000(101);
		Static193.aClass1_Sub26_Sub1_2.method2938(arg0.method3066());
		Static193.aClass1_Sub26_Sub1_2.method2954(arg1);
	}
}
