import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	public static int anInt5970 = 0;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_90 = new Class154(4);

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	public static int anInt5972 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)V")
	public static void method5021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg2, 11);
		local8.method2031();
		local8.anInt2405 = arg0;
		local8.anInt2410 = arg1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!lh;Ljava/awt/Canvas;IILclient!al;Z)Lclient!vm;")
	public static Class92 method5022(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface1 arg4) {
		try {
			@Pc(6) Class local6 = Class.forName("Class92_Sub2");
			@Pc(52) Constructor local52 = local6.getConstructor(Canvas.class, al.class, Integer.TYPE, Integer.TYPE, lh.class);
			return (Class92) local52.newInstance(arg1, arg4, Integer.valueOf(arg3), new Integer(arg2), arg0);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI)V")
	public static void method5023(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 14);
		local8.method2034();
	}
}
