import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_50 = new Class2(72, 8);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt2796 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
	public static boolean method2268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static347.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}
}
