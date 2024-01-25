import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "Lclient!h;")
	public static final Class114 aClass114_82 = new Class114("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
	public static int anInt3983 = 0;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
	public static int anInt3984 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BII)Z")
	public static boolean method3538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static116.method2634(arg0, arg1) | (arg0 & 0x70000) != 0 || Static90.method2166(arg1, arg0);
	}
}
