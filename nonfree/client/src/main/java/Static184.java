import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static int anInt3907;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public static int anInt3909;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Lclient!jd;")
	public static Class84 aClass84_77;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
	public static int[] anIntArray311 = new int[50];

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	public static int anInt3908 = -2;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
	public static int anInt3910 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/String;Lclient!mn;)Ljava/lang/String;")
	public static String method3154(@OriginalArg(1) String arg0, @OriginalArg(2) Class115 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(10) int local10 = arg0.indexOf("%1");
			if (local10 == -1) {
				while (true) {
					local10 = arg0.indexOf("%2");
					if (local10 == -1) {
						while (true) {
							local10 = arg0.indexOf("%3");
							if (local10 == -1) {
								while (true) {
									local10 = arg0.indexOf("%4");
									if (local10 == -1) {
										while (true) {
											local10 = arg0.indexOf("%5");
											if (local10 == -1) {
												while (true) {
													local10 = arg0.indexOf("%dns");
													if (local10 == -1) {
														return arg0;
													}
													@Pc(194) String local194 = "";
													if (Static58.aClass28_5 != null) {
														if (Static58.aClass28_5.anObject2 == null) {
															local194 = Static232.method3892(Static58.aClass28_5.anInt725);
														} else {
															local194 = (String) Static58.aClass28_5.anObject2;
														}
													}
													arg0 = arg0.substring(0, local10) + local194 + arg0.substring(local10 + 4);
												}
											}
											arg0 = arg0.substring(0, local10) + Static297.method4950(Static237.method3914(4, arg1)) + arg0.substring(local10 + 2);
										}
									}
									arg0 = arg0.substring(0, local10) + Static297.method4950(Static237.method3914(3, arg1)) + arg0.substring(local10 + 2);
								}
							}
							arg0 = arg0.substring(0, local10) + Static297.method4950(Static237.method3914(2, arg1)) + arg0.substring(local10 + 2);
						}
					}
					arg0 = arg0.substring(0, local10) + Static297.method4950(Static237.method3914(1, arg1)) + arg0.substring(local10 + 2);
				}
			}
			arg0 = arg0.substring(0, local10) + Static297.method4950(Static237.method3914(0, arg1)) + arg0.substring(local10 + 2);
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)[Lclient!jn;")
	public static Class71[] method3155() {
		@Pc(8) Class71[] local8 = new Class71[Static27.anInt576];
		for (@Pc(16) int local16 = 0; local16 < Static27.anInt576; local16++) {
			if (Static60.aBoolean106) {
				local8[local16] = new Class71_Sub2(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local16], Static40.anIntArray59[local16], Static30.anIntArray46[local16], Static19.anIntArray30[local16], Static273.aByteArrayArray115[local16], Static187.anIntArray314);
			} else {
				local8[local16] = new Class71_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local16], Static40.anIntArray59[local16], Static30.anIntArray46[local16], Static19.anIntArray30[local16], Static273.aByteArrayArray115[local16], Static187.anIntArray314);
			}
		}
		Static171.method2953();
		return local8;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)C")
	public static char method3157(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local3, 16) + " provided");
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(51) char local51 = Static190.aCharArray6[local3 - 128];
			if (local51 == '\u0000') {
				local51 = '?';
			}
			local3 = local51;
		}
		return (char) local3;
	}
}
