import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array6;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!qh", name = "gb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!qh", name = "jb", descriptor = "Lclient!wg;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!qh", name = "X", descriptor = "Lclient!ai;")
	public static Class6 aClass6_940 = Static38.method685(")1p");

	@OriginalMember(owner = "client!qh", name = "ub", descriptor = "Lclient!ai;")
	private static Class6 aClass6_942 = Static38.method685("Prepared sound engine");

	@OriginalMember(owner = "client!qh", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_941 = aClass6_942;

	@OriginalMember(owner = "client!qh", name = "nb", descriptor = "I")
	public static int anInt3226 = 0;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!c;)V")
	public static void method2137(@OriginalArg(1) Class10 arg0) {
		Static92.aClass10_74 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Z")
	public static boolean method2138(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method2141(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static56.method1801(local18) : local18;
		} else if (arg0 instanceof Class28) {
			@Pc(32) Class28 local32 = (Class28) arg0;
			return local32.method922();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
	public static void method2142() {
		aClass41_3 = null;
		aClass6_941 = null;
		aByteArrayArrayArray6 = null;
		aClass2_Sub3_Sub2_Sub3Array6 = null;
		aFont1 = null;
		aClass6_942 = null;
		aClass6_940 = null;
		aLongArray6 = null;
	}
}
