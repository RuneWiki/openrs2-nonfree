import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
	public static int anInt7370;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_73 = new Class70(12, 8);

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "[Lclient!vr;")
	public static final Interface22[] anInterface22Array2 = new Interface22[75];

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	public static void method5882() {
		for (@Pc(18) Class1_Sub20 local18 = (Class1_Sub20) Static27.aClass353_3.method7677(); local18 != null; local18 = (Class1_Sub20) Static27.aClass353_3.method7687()) {
			if (local18.anInt2945 == -1) {
				local18.anInt2956 = 0;
				if (local18.anInt2953 >= 0 && local18.anInt2957 >= 0 && local18.anInt2953 < Static71.anInt1410 && local18.anInt2957 < Static471.anInt8012) {
					Static192.method2939(local18);
				}
			} else {
				local18.method7859();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILclient!vg;)V")
	public static void method5883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class341 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray11 != null) {
			@Pc(13) Class1_Sub15 local13 = new Class1_Sub15();
			local13.anObjectArray1 = arg2.anObjectArray11;
			local13.aClass341_10 = arg2;
			Static80.method1451(local13);
		}
		Static534.anInt8944 = arg2.anInt9262;
		Static258.anInt4645 = arg1;
		Static189.anInt3543 = arg0;
		Static84.anInt8888 = arg2.anInt9270;
		Static78.anInt1494 = arg2.anInt9328;
		Static447.anInt7729 = arg2.anInt9278;
		Static573.aBoolean740 = true;
		Static48.anInt840 = arg2.anInt9306;
		Static442.method6111(arg2);
	}
}
