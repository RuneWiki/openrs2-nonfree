import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt2000 = -1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	public static int anInt2001 = 0;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "F")
	public static float aFloat44 = 1024.0F;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIB)V")
	public static void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (Static16.aClass253_3.method6594((long) arg0) != null) {
			return;
		}
		if (Static184.aBoolean309) {
			@Pc(29) Class8_Sub52 local29 = new Class8_Sub52(arg0, new Class2_Sub1(4096, Static272.aClass237_73, arg0), arg2, arg1);
			local29.aClass2_Sub1_1.method4229(Static197.aStringArray11[Static372.anInt7083]);
			Static16.aClass253_3.method6591(local29, (long) arg0);
		} else {
			Static470.method7024(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public static void method1712(@OriginalArg(0) int arg0) {
		if (Static209.anIntArray264 == null || arg0 > Static209.anIntArray264.length) {
			Static209.anIntArray264 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public static void method1715() {
		Static80.anImage10 = null;
		Static84.aFont1 = null;
	}
}
