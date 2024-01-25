import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!jm;")
	public static Class2_Sub2_Sub11 aClass2_Sub2_Sub11_2;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Z")
	public static boolean aBoolean527;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
	public static int anInt7004;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	public static int anInt7005;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_96 = new Class179(33, 7);

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_40 = new Class118(8);

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5967(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class2_Sub40 local12 = Static464.method6285(Static251.aClass131_1, Static568.aClass179_119);
		local12.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(arg1) + 1);
		local12.aClass2_Sub22_Sub2_2.method8515(arg0);
		local12.aClass2_Sub22_Sub2_2.method8540(arg1);
		Static528.method7295(local12);
	}
}
