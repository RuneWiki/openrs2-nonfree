import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array77;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!ud;")
	public static Class241 method7387(@OriginalArg(1) Component arg0) {
		return new Class241_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method7388() {
		Static197.anInt4015 = 0;
		Static105.aClass295_10.method7541();
		Static105.aClass295_10.method7533(Static415.aClass1_Sub25_3);
		Static197.anInt4015++;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)Z")
	public static boolean method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static443.method6860(arg0, arg1) | (arg0 & 0x70000) != 0 || Static263.method4733(arg0, arg1);
	}
}
