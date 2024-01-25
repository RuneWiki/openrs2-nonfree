import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static604 {

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
	public static int anInt10087 = 0;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!hw;")
	public static Class154 method8231(@OriginalArg(1) Component arg0) {
		return new Class154_Sub1(arg0);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)J")
	public static long method8233(@OriginalArg(1) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
