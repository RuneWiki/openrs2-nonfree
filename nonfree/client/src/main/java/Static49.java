import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "[[Lclient!nc;")
	public static Class3_Sub14[][] aClass3_Sub14ArrayArray1;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array6;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static int anInt1584 = 0;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!he;")
	private static Class26 aClass26_786 = Static6.method100("Hidden");

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_787 = aClass26_786;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[S")
	public static short[] aShortArray12 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public static int anInt1587 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!ef;Lclient!ef;)I")
	public static int method1041(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method564(Static44.aClass26_711, Static55.aClass26_831)) {
			local10++;
		}
		if (arg1.method564(Static133.aClass26_313, Static55.aClass26_831)) {
			local10++;
		}
		if (arg1.method564(Static2.aClass26_7, Static55.aClass26_831)) {
			local10++;
		}
		if (arg1.method564(Static72.aClass26_1035, Static55.aClass26_831)) {
			local10++;
		}
		if (arg1.method564(Static118.aClass26_1673, Static55.aClass26_831)) {
			local10++;
		}
		if (arg1.method564(Static36.aClass26_607, Static55.aClass26_831)) {
			local10++;
		}
		arg1.method564(Static52.aClass26_814, Static55.aClass26_831);
		arg1.method564(Static5.aClass26_1746, Static55.aClass26_831);
		arg1.method564(Static18.aClass26_264, Static55.aClass26_831);
		arg1.method564(Static17.aClass26_260, Static55.aClass26_831);
		arg1.method564(Static103.aClass26_1508, Static55.aClass26_831);
		return local10;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method1042() {
		aClass26_787 = null;
		aShortArray12 = null;
		aClass3_Sub14ArrayArray1 = null;
		aClass26_786 = null;
		aClass3_Sub1_Sub4_Sub1Array6 = null;
	}
}
