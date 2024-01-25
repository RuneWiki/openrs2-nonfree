import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	public static int anInt68;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!cm;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!cm;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_2 = new Class198(200);

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!uc;")
	public static Class198 aClass198_3 = new Class198(64);

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
	public static int anInt75 = 100;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	public static int anInt76 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)B")
	public static byte method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public static void method38(@OriginalArg(0) int arg0) {
		Static265.anInt5321 = -1;
		if (arg0 == 37) {
			Static193.aFloat15 = 3.0F;
		} else if (arg0 == 50) {
			Static193.aFloat15 = 4.0F;
		} else if (arg0 == 75) {
			Static193.aFloat15 = 6.0F;
		} else if (arg0 == 100) {
			Static193.aFloat15 = 8.0F;
		} else if (arg0 == 200) {
			Static193.aFloat15 = 16.0F;
		}
		Static265.anInt5321 = -1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method40(@OriginalArg(1) String arg0) {
		if (Static339.aClass116Array3 != null) {
			Static291.aClass3_Sub4_Sub2_3.method3682(46);
			Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(arg0));
			Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nq;")
	public static RuntimeException_Sub1 method41(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString163 = local12.aString163 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
