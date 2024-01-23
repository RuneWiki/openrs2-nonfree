import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray71;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
	public static int anInt3117;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "[B")
	public static byte[] aByteArray37;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	public static int anInt3116 = 0;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "J")
	public static long aLong105 = 0L;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "S")
	public static short aShort12 = 256;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "Z")
	public static boolean aBoolean162 = true;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[B)Z")
	public static boolean method2380(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(12) int local12 = local8.method2655();
		if (local12 != 1) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method2655() == 1;
		if (local35) {
			Static132.method2266(local8);
		}
		Static49.method1043(local8);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(CI)Z")
	public static boolean method2381(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
