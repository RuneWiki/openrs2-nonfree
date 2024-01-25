import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_84 = new Class214(93, -2);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
	public static int method2120() {
		if (Static65.aClass240_4 == null) {
			if (!Static87.aBoolean142 && Static352.anInt6233 > 0) {
				if (Static341.aBoolean452 && Static115.aClass173_1.method4895(81) && Static352.anInt6233 > 2) {
					return ((Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270.aClass4_270).anInt2131;
				}
				return ((Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270).anInt2131;
			}
			@Pc(48) int local48 = Static329.aClass95_1.method5170();
			@Pc(52) int local52 = Static329.aClass95_1.method5175();
			@Pc(54) int local54 = Static22.anInt426;
			@Pc(56) int local56 = Static223.anInt4455;
			@Pc(58) int local58 = Static177.anInt3637;
			if (local48 > local54 && local48 < local54 + local58) {
				@Pc(68) int local68 = -1;
				@Pc(87) int local87;
				for (@Pc(70) int local70 = 0; local70 < Static352.anInt6233; local70++) {
					if (Static314.aBoolean588) {
						local87 = local56 + (-local70 + Static352.anInt6233 + -1) * 16 + 33;
						if (local87 - 13 < local52 && local52 <= local87 + 3) {
							local68 = local70;
						}
					} else {
						local87 = (Static352.anInt6233 - local70 - 1) * 16 + local56 + 31;
						if (local52 > local87 - 13 && local52 <= local87 + 3) {
							local68 = local70;
						}
					}
				}
				if (local68 != -1) {
					local87 = 0;
					@Pc(146) Class222 local146 = new Class222(Static289.aClass91_31);
					for (@Pc(151) Class4_Sub14 local151 = (Class4_Sub14) local146.method5130(); local151 != null; local151 = (Class4_Sub14) local146.method5128()) {
						if (local68 == local87++) {
							return local151.anInt2131;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method2121(@OriginalArg(1) String arg0) {
		return Static131.method1832(16, arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IJ)V")
	public static void method2122(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)[Lclient!ft;")
	public static Class81[] method2125() {
		return new Class81[] { Static34.aClass81_1, Static34.aClass81_2, Static34.aClass81_3, Static34.aClass81_4, Static34.aClass81_5, Static34.aClass81_6, Static34.aClass81_7, Static34.aClass81_8, Class4_Sub3_Sub3.lb, Static34.aClass81_9, Static34.aClass81_10, Static34.aClass81_11, Static34.aClass81_12 };
	}
}
