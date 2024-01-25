import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static478 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
	public static int[] anIntArray602;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public static int anInt7778;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Lclient!wca;")
	public static Class127 aClass127_1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[Lclient!uaa;")
	public static final Class303_Sub1[] aClass303_Sub1Array2 = new Class303_Sub1[35];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!wca;")
	public static Class127 method6562(@OriginalArg(1) Component arg0) {
		return new Class127_Sub1(arg0);
	}
}
