import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_159 = new Class34("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
	public static int anInt5744 = -1;

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
	public static int anInt5748 = 0;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_50 = new Class87(128);

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V")
	public static void method4915() {
		Static225.aBoolean459 = false;
		Static64.anInt1792 = 1;
		Static342.anInt2999 = 0;
		Static129.anInt2840 = -1;
		Static191.anInt4097 = 0;
		Static353.anInt6727 = -3;
		Static135.anInt2979 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!nh;Lclient!gd;IB)Lclient!uo;")
	public static Class32 method4920(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class32_Sub2");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, gd.class, Integer.TYPE, Integer.TYPE, nh.class);
			return (Class32) local57.newInstance(arg1, arg3, Integer.valueOf(arg4), new Integer(arg0), arg2);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}
}
