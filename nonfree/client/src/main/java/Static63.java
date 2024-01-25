import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array3;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	public static int anInt1264 = -1;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "[Lclient!qp;")
	public static final Class202[] aClass202Array1 = new Class202[14];

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
	public static final int anInt1271 = 328;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method1042() {
		if (Static378.aBoolean451) {
			return;
		}
		if (Static207.aBoolean371) {
			Static127.aFloat41 = (int) Static127.aFloat41 + 191 & 0xFFFFFF80;
		} else {
			Static345.aFloat82 += (24.0F - Static345.aFloat82) / 2.0F;
		}
		Static285.aBoolean378 = true;
		Static378.aBoolean451 = true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIILclient!fo;)V")
	public static void method1048(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class1_Sub5_Sub1 arg3) {
		Static46.method795(arg1, arg3.anInt6390, 0, arg2, arg3.aByte69, arg3.anInt6386, arg0);
	}
}
