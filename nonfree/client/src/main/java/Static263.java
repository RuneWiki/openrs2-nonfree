import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qk", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray61 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "Lclient!wg;")
	public static Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString189 = "Discard";

	@OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
	public static int anInt5036 = -1;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)I")
	public static int method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static294.anIntArray516[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!jr;")
	public static Class10_Sub3 method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class81 local14 = local7.aClass81_4; local14 != null; local14 = local14.aClass81_3) {
			@Pc(18) Class10_Sub3 local18 = local14.aClass10_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort83 == arg1 && local18.aShort82 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "(B)V")
	public static void method4515() {
		if (Static239.aBoolean430) {
			return;
		}
		Static311.method5698(Static82.aClass213ArrayArrayArray1);
		if (Static342.aClass213ArrayArrayArray3 != null) {
			Static311.method5698(Static342.aClass213ArrayArrayArray3);
		}
		Static239.aBoolean430 = true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
	public static void method4516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class14_Sub2_Sub13 local13 = Static1.method5711(1, arg0);
		local13.method3540();
		local13.anInt3805 = arg1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIILclient!e;I[[[BZI)V")
	public static void method4517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class46 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg9 == 0 || arg6 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg11 = arg11 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg9 = 1;
			arg11 = arg11 + 3 & 0x3;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg11 = arg11 + 3 & 0x3;
		}
		arg8.method5127(arg7, arg2, arg0, arg4, arg3, arg5, arg10[arg9 - 1][arg11], arg6, arg1);
	}
}
