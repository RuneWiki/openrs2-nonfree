import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!rg;")
	public static Class27 aClass27_9;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!ve;")
	public static final Class2_Sub24_Sub2 aClass2_Sub24_Sub2_7 = new Class2_Sub24_Sub2(5000);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
	public static int method1316(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BZI)Lclient!rb;")
	public static Class2_Sub32 method1317(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(19) long local19 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub32) Static19.aClass243_1.method5967(local19);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!ab;)Lclient!ab;")
	public static Class3 method1318(@OriginalArg(1) Class3 arg0) {
		@Pc(6) Class3 local6 = Static51.method788(arg0);
		if (local6 == null) {
			local6 = arg0.aClass3_1;
		}
		return local6;
	}
}
