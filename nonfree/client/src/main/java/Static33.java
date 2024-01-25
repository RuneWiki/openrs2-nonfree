import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	public static int anInt1108 = 0;

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!ug;")
	public static Class171 method812(@OriginalArg(1) Component arg0) {
		return new Class171_Sub1(arg0);
	}
}
