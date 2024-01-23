import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ui", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray51;

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
	public static int anInt5828 = 0;

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "Lclient!pm;")
	public static Class125 aClass125_11 = new Class125(16);

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
	public static int anInt5835 = -1;

	@OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
	public static int anInt5836 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V")
	public static void method4526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (Static296.aBoolean335) {
			@Pc(17) int local17 = arg4 - 334;
			if (local17 < 0) {
				local17 = 0;
			} else if (local17 > 100) {
				local17 = 100;
			}
			@Pc(44) int local44 = local17 * (Static174.aShort22 - Static260.aShort39) / 100 + Static260.aShort39;
			if (Static188.aShort24 > local44) {
				local44 = Static188.aShort24;
			} else if (Static54.aShort9 < local44) {
				local44 = Static54.aShort9;
			}
			@Pc(74) int local74 = arg4 * 512 * local44 / (arg3 * 334);
			@Pc(108) int local108;
			@Pc(115) int local115;
			@Pc(79) short local79;
			if (local74 < Static94.aShort50) {
				local79 = Static94.aShort50;
				local44 = local79 * 334 * arg3 / (arg4 * 512);
				if (Static54.aShort9 < local44) {
					local44 = Static54.aShort9;
					local108 = arg4 * local44 * 512 / (local79 * 334);
					local115 = (arg3 - local108) / 2;
					if (arg2) {
						Static288.method4710();
						Static288.method4713(arg1, arg0, local115, arg4, 0);
						Static288.method4713(arg3 + arg1 - local115, arg0, local115, arg4, 0);
					}
					arg3 -= local115 * 2;
					arg1 += local115;
				}
			} else if (Static280.aShort42 < local74) {
				local79 = Static280.aShort42;
				local44 = arg3 * local79 * 334 / (arg4 * 512);
				if (Static188.aShort24 > local44) {
					local44 = Static188.aShort24;
					local108 = local79 * arg3 * 334 / (local44 * 512);
					local115 = (arg4 - local108) / 2;
					if (arg2) {
						Static288.method4710();
						Static288.method4713(arg1, arg0, arg3, local115, 0);
						Static288.method4713(arg1, arg0 + arg4 - local115, arg3, local115, 0);
					}
					arg0 += local115;
					arg4 -= local115 * 2;
				}
			}
			Static49.anInt1370 = arg4 * local44 / 334;
		}
		Static249.anInt5441 = (short) arg3;
		Static108.anInt2326 = arg0;
		Static59.anInt1538 = arg1;
		Static267.anInt3426 = (short) arg4;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4530(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub2_Sub6 local16 = Static104.method831(arg1, 2);
		local16.method1192();
		local16.aString50 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V")
	public static void method4533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class3 local3 = new Class3();
		local3.anInt87 = arg1 / 128;
		local3.anInt92 = arg2 / 128;
		local3.anInt98 = arg3 / 128;
		local3.anInt89 = arg4 / 128;
		local3.anInt99 = arg0;
		local3.anInt104 = arg1;
		local3.anInt91 = arg2;
		local3.anInt102 = arg3;
		local3.anInt93 = arg4;
		local3.anInt90 = arg5;
		local3.anInt105 = arg6;
		Static6.aClass3Array4[Static82.anInt1969++] = local3;
	}
}
