import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static322 {

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	public static int anInt6002;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "Z")
	public static volatile boolean aBoolean468 = true;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Z")
	public static boolean method5044(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)V")
	public static void method5045() {
		Static560.aClass279_52.method6638();
	}
}
