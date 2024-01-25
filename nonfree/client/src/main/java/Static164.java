import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt3481;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public static int anInt3483 = 1;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt3484 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z")
	public static boolean method2882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
	public static boolean method2883() {
		return Static201.anInt3963 >= 1;
	}
}
