import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static369 {

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
	public static int anInt6487;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "B")
	public static byte aByte81;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	public static int anInt6467 = 0;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Lclient!j;")
	public static final Class127 aClass127_5 = new Class127("WIP", 2);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!hw;Z)Lclient!vs;")
	public static Class105_Sub4 method5155(@OriginalArg(0) Class2_Sub17 arg0) {
		return new Class105_Sub4(arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6145(), arg0.method6145(), arg0.method6138());
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)Z")
	public static boolean method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static326.aByteArrayArrayArray15[1][arg1][arg0] & 0x2) != 0;
	}
}
