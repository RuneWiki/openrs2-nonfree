import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[Lclient!da;")
	public static Class22[] aClass22Array3;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	public static int anInt6865 = -1;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_63 = new Class198(100);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!sj;Z)Z")
	public static boolean method5740(@OriginalArg(0) Class181 arg0) {
		if (arg0.anInt5755 == 205) {
			Static238.anInt4781 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	public static void method5741(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub7_Sub11 local16 = Static116.method2029(arg0, 2);
		local16.method2502();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLclient!ir;)V")
	public static void method5742(@OriginalArg(1) Class100 arg0) {
		Static82.aClass100_32 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
	public static void method5744(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 4);
		local8.method2502();
	}
}
