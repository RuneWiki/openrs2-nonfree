import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public static int anInt3919;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public static int anInt3918 = 5063219;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	public static int[] anIntArray337 = new int[5];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public static int anInt3923 = 50;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString125 = "Members object";

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I")
	public static int method3113(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			local1++;
			arg0 >>>= 0x1;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B)Lclient!kg;")
	public static Class4_Sub2_Sub12_Sub1 method3114(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class4_Sub2_Sub12_Sub1 local23 = new Class4_Sub2_Sub12_Sub1(arg0, Static262.anIntArray439, Static100.anIntArray223, Static159.anIntArray285, Static46.anIntArray120, Static274.aByteArrayArray20);
			Static268.method4006();
			return local23;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method3115() {
		aString125 = null;
		anIntArray337 = null;
	}
}
