import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
	public static int anInt3404 = 0;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)Z")
	public static boolean method2932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)[Lclient!c;")
	public static Class51[] method2933() {
		return new Class51[] { Static410.aClass51_24, Static650.aClass51_34, Static210.aClass51_16, Static209.aClass51_36, Static410.aClass51_23, Static191.aClass51_13, Static92.aClass51_35, Static378.aClass51_20, Static370.aClass51_19, Static129.aClass51_6 };
	}
}
