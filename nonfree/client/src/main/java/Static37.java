import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bea", name = "B", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!bea", name = "A", descriptor = "Lclient!kn;")
	public static final Class181 aClass181_2 = new Class181(11, 8);

	@OriginalMember(owner = "client!bea", name = "F", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_11 = new Class94(54, 15);

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!ua;I)V")
	public static void method864(@OriginalArg(1) Class2_Sub11_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static229.anInt5073 = 0;
		Static260.aBoolean593 = false;
		Static459.method7169(arg0);
		Static179.method3749(arg0);
		if (Static260.aBoolean593) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt10066) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt10066 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)Lclient!io;")
	public static Class158 method868() {
		try {
			return (Class158) Class.forName("Class158_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class158_Sub1();
		}
	}
}
