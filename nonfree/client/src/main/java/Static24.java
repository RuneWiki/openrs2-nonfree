import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array3 = new Class6[100];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_173 = Static38.method685("cyan:");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_170 = aClass6_173;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_171 = Static38.method685("p11_full");

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt633 = 0;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_172 = aClass6_173;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
	public static int method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	public static void method441() {
		aClass6_170 = null;
		aClass6_171 = null;
		aClass6Array3 = null;
		aFrame1 = null;
		aClass6_172 = null;
		aClass6_173 = null;
	}
}
