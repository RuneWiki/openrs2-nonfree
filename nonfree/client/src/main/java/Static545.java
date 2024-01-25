import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_9 = new Class324(1);

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_10 = new Class324(2);

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_11 = new Class324(4);

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_12 = new Class324(1);

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_13 = new Class324(2);

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_14 = new Class324(4);

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_15 = new Class324(2);

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Lclient!ti;")
	public static final Class324 aClass324_16 = new Class324(4);

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_11 = new Class184(1, 2);

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public static int anInt9053 = 64;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIILclient!dm;)V")
	public static void method7612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray17 != null) {
			@Pc(21) Class2_Sub42 local21 = new Class2_Sub42();
			local21.anObjectArray33 = arg2.anObjectArray17;
			local21.aClass78_9 = arg2;
			Static639.method8539(local21);
		}
		Static352.anInt6475 = arg2.anInt2006;
		Static342.anInt6258 = arg2.anInt1968;
		Static608.anInt3500 = arg1;
		Static590.anInt9763 = arg2.anInt1978;
		Static301.aBoolean423 = true;
		Static385.anInt6934 = arg2.anInt1972;
		Static20.anInt623 = arg2.anInt1957;
		Static73.anInt1590 = arg0;
		Static397.method6022(arg2);
	}
}
