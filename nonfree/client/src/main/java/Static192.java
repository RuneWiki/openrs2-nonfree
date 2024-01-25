import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!rc;")
	public static Class2_Sub11_Sub4 aClass2_Sub11_Sub4_1;

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
	public static int anInt4019;

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "Z")
	public static volatile boolean aBoolean287 = false;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)Z")
	public static boolean method3514(@OriginalArg(0) int arg0) {
		Static150.aBoolean242 = true;
		Static91.anInt1960 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
	public static boolean method3515() {
		return Static158.aClass49_3 != Static306.aClass49_7 || Static273.anInt5130 >= 2;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)I")
	public static int method3516(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
