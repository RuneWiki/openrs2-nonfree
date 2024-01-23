import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!so", name = "P", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!so", name = "Z", descriptor = "Lclient!sg;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!so", name = "eb", descriptor = "Lclient!in;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!so", name = "hb", descriptor = "Lclient!p;")
	public static Class133 aClass133_7;

	@OriginalMember(owner = "client!so", name = "kb", descriptor = "Lclient!p;")
	public static Class133 aClass133_8;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "Lclient!s;")
	public static Class156 aClass156_24 = new Class156(16);

	@OriginalMember(owner = "client!so", name = "V", descriptor = "I")
	public static int anInt5078 = 0;

	@OriginalMember(owner = "client!so", name = "fb", descriptor = "Z")
	public static boolean aBoolean357 = true;

	@OriginalMember(owner = "client!so", name = "gb", descriptor = "[I")
	public static int[] anIntArray456 = new int[14];

	@OriginalMember(owner = "client!so", name = "ib", descriptor = "Lclient!bo;")
	public static Class24 aClass24_25 = new Class24();

	@OriginalMember(owner = "client!so", name = "jb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43 = new String[200];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIILclient!h;JZ)V")
	public static void method3939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class171 local6 = new Class171();
		local6.aClass22_10 = arg4;
		local6.anInt5287 = arg1 * 128 + 64;
		local6.anInt5284 = arg2 * 128 + 64;
		local6.anInt5282 = arg3;
		local6.aLong196 = arg5;
		local6.aBoolean379 = arg6;
		if (Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2].aClass171_1 = local6;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIBI)V")
	public static void method3940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static134.anInt2683 = arg4;
		Static115.anInt2284 = arg2;
		Static245.anInt2367 = arg3;
		Static216.anInt4237 = arg0;
		Static225.anInt4441 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(CB)Z")
	public static boolean method3942(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_';
	}
}
