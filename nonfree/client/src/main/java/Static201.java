import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "S")
	public static short aShort37 = 32767;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
	public static int anInt3963 = 0;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_62 = new Class286(75, 0);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	public static void method3290() {
		Static458.method6491();
		Static408.method5950(Static72.aClass2_Sub12_Sub1_1.aBoolean154);
		Static79.aClass14_1 = Static353.method5264(Static356.aClass287_5, 22050, Static471.aCanvas12, 0);
		Static79.aClass14_1.method5520(Static459.aClass2_Sub10_Sub2_4);
		Static417.aClass14_2 = Static353.method5264(Static356.aClass287_5, 2048, Static471.aCanvas12, 1);
		Static417.aClass14_2.method5520(Static122.aClass2_Sub10_Sub1_2);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BII)V")
	public static void method3291(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub3_Sub13 local12 = Static382.method5650(13, arg0);
		local12.method6098();
		local12.anInt7258 = arg1;
	}
}
