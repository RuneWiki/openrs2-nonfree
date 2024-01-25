import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_53 = new Class106("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public static int anInt1589 = 0;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_55 = new Class217(3, -1);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)V")
	public static void method1545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg1, 7);
		local8.method3480();
		local8.anInt3727 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method1546(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static359.method5940(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lclient!uq;")
	public static Class32_Sub7 method1550(@OriginalArg(1) int arg0) {
		@Pc(7) Class195[] local7 = Class118_Sub2.aClass195Array1;
		synchronized (Class118_Sub2.aClass195Array1) {
			@Pc(27) Class32_Sub7 local27;
			if (arg0 >= Class118_Sub2.aClass195Array1.length || Class118_Sub2.aClass195Array1[arg0].method5296()) {
				local27 = new Class32_Sub7();
				local27.aClass32_Sub4Array1 = new Class32_Sub4[arg0];
				for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
					local27.aClass32_Sub4Array1[local33] = new Class32_Sub4();
				}
			} else {
				local27 = (Class32_Sub7) Class118_Sub2.aClass195Array1[arg0].method5304();
				local27.method5725();
				@Pc(66) int local66 = Static43.anIntArray413[arg0]--;
			}
			return local27;
		}
	}
}
