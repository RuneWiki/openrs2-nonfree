import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
	public static int anInt1436;

	@OriginalMember(owner = "client!dl", name = "M", descriptor = "Z")
	public static final boolean aBoolean92 = false;

	@OriginalMember(owner = "client!dl", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString57 = "M";

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!mo;Lclient!mo;Z)V")
	public static void method1338(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class143 arg1) {
		Static191.aBoolean245 = true;
		Static123.aClass143_107 = arg1;
		Static335.aClass143_112 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public static void method1340() {
		Static189.aClass11_135.method215(5);
		Static348.aClass11_123.method215(5);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method1341(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static295.method5035(local13) : local13;
		} else if (arg1 instanceof Class94) {
			@Pc(27) Class94 local27 = (Class94) arg1;
			return local27.method2749();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)Lclient!op;")
	public static Class10_Sub1 method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class10_Sub1 local14 = local7.aClass10_Sub1_1;
			local7.aClass10_Sub1_1 = null;
			return local14;
		}
	}
}
