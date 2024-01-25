import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!ue;")
	public static Class5_Sub45 aClass5_Sub45_2;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_26 = new Class148(7, 7);

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
	public static int anInt6782 = -1;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lclient!rha;")
	public static Class5_Sub1 method5970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class5_Sub1_Sub2");
			@Pc(15) Class5_Sub1 local15 = (Class5_Sub1) local6.getDeclaredConstructor().newInstance();
			local15.method3750(arg2, arg0, arg1);
			return local15;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class5_Sub1_Sub1 local30 = new Class5_Sub1_Sub1();
			local30.method3750(arg2, arg0, arg1);
			return local30;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
	public static void method5971(@OriginalArg(0) int arg0) {
		Static449.anInt7564 = arg0;
		Static486.anInt8186 = -1;
		Static486.anInt8186 = -1;
		Static503.method3569();
	}
}
