import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array9;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[200];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method1501(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static276.method4843(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1502(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static210.aStringArray46.length; local7++) {
			if (Static210.aStringArray46[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!ra;Lclient!ra;)V")
	public static void method1503(@OriginalArg(1) Class1_Sub4 arg0, @OriginalArg(2) Class1_Sub4 arg1) {
		if (arg1.aClass1_Sub4_62 != null) {
			arg1.method5632();
		}
		arg1.aClass1_Sub4_62 = arg0;
		arg1.aClass1_Sub4_61 = arg0.aClass1_Sub4_61;
		arg1.aClass1_Sub4_62.aClass1_Sub4_61 = arg1;
		arg1.aClass1_Sub4_61.aClass1_Sub4_62 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Z")
	public static boolean method1505() {
		return Static72.aBoolean182;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;IIJLjava/lang/String;II)V")
	public static void method1506(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!Static146.aBoolean308 && Static115.anInt2635 < 500) {
			@Pc(23) int local23 = arg0 == -1 ? Static245.anInt4996 : arg0;
			@Pc(34) Class1_Sub23 local34 = new Class1_Sub23(arg4, arg1, local23, arg6, arg3, arg5, arg2);
			Static188.aClass16_22.method416(local34);
			Static115.anInt2635++;
		}
	}
}
