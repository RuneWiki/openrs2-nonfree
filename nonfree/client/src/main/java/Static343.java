import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!ks;")
	public static Class200 aClass200_8;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public static int anInt5955;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "[B")
	public static byte[] aByteArray58;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Z")
	public static boolean method5006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Z")
	public static boolean method5007() {
		return Static25.anInt442 == 0 ? Static84.aClass2_Sub3_Sub2_7.method2050() : true;
	}
}
