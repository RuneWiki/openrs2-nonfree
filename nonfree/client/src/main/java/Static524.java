import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
	public static int anInt8323;

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
	public static int anInt8325;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "Z")
	public static boolean aBoolean704 = false;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "[I")
	public static int[] anIntArray557 = new int[2];

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_58 = new Class70();

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_138 = new Class349(111, -1);

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_120 = new Class154(64, 3);

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
	public static final int anInt8327 = 2;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
	public static void method6734() {
		Static190.aClass19_1.method7653();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static242.aLongArray11[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static127.aLongArray5[local26] = 0L;
		}
		Static206.anInt3014 = 0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IBI)Z")
	public static boolean method6736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
