import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static209 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Z")
	public static boolean aBoolean218;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_54 = new Class349(4, 8);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
	public static boolean method2578(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!nk;")
	public static Class150 method2579(@OriginalArg(1) Component arg0) {
		return new Class150_Sub1(arg0);
	}
}
