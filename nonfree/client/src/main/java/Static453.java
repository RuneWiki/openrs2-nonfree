import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "Lclient!ob;")
	public static final Class247 aClass247_5 = new Class247();

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V")
	public static void method6407() {
		@Pc(12) Class4_Sub41 local12 = Static128.method2707(Static418.aClass61_97, Class16_Sub3.lb);
		local12.aClass4_Sub9_Sub1_3.method5961(-345277664, Static420.method6044());
		local12.aClass4_Sub9_Sub1_3.method6012(Static2.anInt29);
		local12.aClass4_Sub9_Sub1_3.method6012(Static19.anInt390);
		local12.aClass4_Sub9_Sub1_3.method5961(-345277664, Static189.aClass4_Sub2_Sub1_1.anInt9297);
		Static551.method7603(local12);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)Lclient!o;")
	public static Class4_Sub7_Sub13 method6410() {
		return Static392.aClass4_Sub7_Sub13_2;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)Z")
	public static boolean method6412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
