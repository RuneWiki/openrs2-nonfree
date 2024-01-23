import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_8;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt5219;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt5221;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
	public static int[] anIntArray540 = new int[32];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Lclient!ri;")
	public static Class138 method4099(@OriginalArg(1) int arg0) {
		@Pc(10) Class138 local10 = (Class138) Static75.aClass155_11.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static255.aClass83_175.method2306(Static25.method420(arg0), Static287.method4703(arg0));
		local10 = new Class138();
		local10.anInt5060 = arg0;
		if (local28 != null) {
			local10.method4014(new Class1_Sub16(local28));
		}
		local10.method4008();
		if (local10.anInt5028 != -1) {
			local10.method4015(method4099(local10.anInt5059), method4099(local10.anInt5028));
		}
		if (local10.anInt5064 != -1) {
			local10.method4019(method4099(local10.anInt5064), method4099(local10.anInt5044));
		}
		if (!Static220.aBoolean270 && local10.aBoolean275) {
			local10.aBoolean274 = false;
			local10.anInt5063 = 0;
			local10.aString159 = Static219.aString152;
			local10.aStringArray27 = Static181.aStringArray19;
			local10.aStringArray26 = Static84.aStringArray7;
		}
		Static75.aClass155_11.method4360((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lclient!ql;")
	public static Class133 method4100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class133 local14 = local7.aClass133_1;
			local7.aClass133_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BI)I")
	public static int method4101(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local7 = Class25.anIntArray608[(local7 ^ arg1[local14]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4102(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static141.aStringArray16.length; local12++) {
			if (Static141.aStringArray16[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
