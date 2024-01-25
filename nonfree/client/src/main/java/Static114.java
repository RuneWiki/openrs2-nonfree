import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static114 {

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
	public static int anInt2337;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	public static final int anInt2326 = 52;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)[Lclient!wv;")
	public static Class269[] method1702() {
		return new Class269[] { Static293.aClass269_10, Static178.aClass269_5, Static185.aClass269_6, Static106.aClass269_3, Static300.aClass269_9, Static446.aClass269_12 };
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLjava/awt/Canvas;Lclient!m;I)Lclient!qa;")
	public static Class26 method1705(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) int arg2) {
		return new Class26_Sub2(arg2, arg0, arg1);
	}
}
