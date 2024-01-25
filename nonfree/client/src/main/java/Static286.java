import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Lclient!jq;")
	public static final Class174 aClass174_2 = new Class174();

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!jq;")
	public static final Class174 aClass174_5 = new Class174();

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!jq;")
	public static final Class174 aClass174_3 = new Class174();

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Lclient!jq;")
	public static final Class174 aClass174_4 = new Class174();

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!jp;Ljava/lang/String;B)I")
	public static int method4530(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt9765;
		@Pc(10) byte[] local10 = Static128.method2418(arg1);
		arg0.method8627(local10.length);
		arg0.anInt9765 += Static404.aClass245_1.method5909(arg0.aByteArray106, local10, local10.length, 0, arg0.anInt9765);
		return arg0.anInt9765 - local6;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public static void method4531() {
		Static167.method3038();
		Static43.aBoolean74 = false;
		Static609.method8658(Static600.anInt9624, Static627.anInt10020, Static436.anInt6913, Static368.anInt5940);
	}
}
