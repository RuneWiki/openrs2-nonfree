import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public static int anInt1189 = 0;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	public static int anInt1191 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!in;III)V")
	public static void method1045(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static34.anInt728 = arg1;
		Static298.aClass160_18 = arg0;
		Static209.anInt8894 = arg2;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	public static void method1046(@OriginalArg(0) int arg0) {
		Static428.anInt7674 = arg0;
	}
}
