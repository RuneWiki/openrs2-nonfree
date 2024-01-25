import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static608 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public static int anInt10099;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public static int anInt10101;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!ef;")
	public static Class102 aClass102_71 = new Class102();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
	public static boolean method8687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
