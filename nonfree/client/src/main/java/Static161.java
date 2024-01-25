import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
	public static int anInt3884;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Z")
	public static boolean method3405() {
		return Static565.anInt9608 == 0 ? Static522.aClass3_Sub7_Sub5_4.method6026() : true;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z")
	public static boolean method3406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
