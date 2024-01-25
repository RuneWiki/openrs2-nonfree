import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!kaa", name = "G", descriptor = "Lclient!rca;")
	public static Class5_Sub3_Sub16 aClass5_Sub3_Sub16_3;

	@OriginalMember(owner = "client!kaa", name = "L", descriptor = "I")
	public static int anInt5791;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIB)Z")
	public static boolean method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(CI)Z")
	public static boolean method4799(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
