import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "Lclient!hc;")
	public static Class51 aClass51_48;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
	public static int anInt3551 = 0;

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString230 = "glow1:";

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)I")
	public static int method2661(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BII)V")
	public static void method2662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static156.method2772(arg1)) {
			Static157.method2801(Static80.aClass122ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!ml;")
	public static Class73 method2664(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class73_Sub1");
			@Pc(18) Class73 local18 = (Class73) local14.getDeclaredConstructor().newInstance();
			local18.method2868(arg1, arg2, arg0);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class73_Sub2 local31 = new Class73_Sub2();
			local31.method2868(arg1, arg2, arg0);
			return local31;
		}
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(B)V")
	public static void method2665() {
		if (Static252.aBoolean273) {
			return;
		}
		Static89.aBoolean139 = true;
		Static252.aBoolean273 = true;
		if (Static138.aBoolean180) {
			Static230.aFloat51 = (int) Static230.aFloat51 + 191 & 0xFFFFFF80;
		} else {
			Static161.aFloat34 += (24.0F - Static161.aFloat34) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!rj;I)V")
	public static void method2666(@OriginalArg(0) Class118 arg0) {
		Static36.aClass118_2 = arg0;
	}
}
