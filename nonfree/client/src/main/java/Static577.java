import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_57 = new Class326(64);

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_225 = new Class81(7, 7);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!r;BLclient!wv;)V")
	public static void method7756(@OriginalArg(0) Class12 arg0, @OriginalArg(2) Class365 arg1) {
		@Pc(35) boolean local35 = Static46.aClass234_1.method5398(arg1.anInt9573, arg1.anInt9619, arg1.anInt9575, arg0, arg1.anInt9632, arg1.anInt9637 | 0xFF000000, arg1.aBoolean707 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1 : null) == null;
		if (local35) {
			Static426.aClass361_77.method7855(new Class1_Sub21(arg1.anInt9573, arg1.anInt9575, arg1.anInt9619, arg1.anInt9637 | 0xFF000000, arg1.anInt9632, arg1.aBoolean707));
			Static201.method5537(arg1);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!ew;")
	public static Class28 method7758(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class28 local8;
		try {
			local8 = (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			local8 = new Class28_Sub2();
		}
		local8.anInt7834 = arg1;
		local8.aString82 = arg0;
		return local8;
	}
}
