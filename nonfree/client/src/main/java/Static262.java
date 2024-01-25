import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
	public static int anInt5627;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "S")
	public static short aShort60 = 32767;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
	public static void method4599(@OriginalArg(0) int arg0) {
		Static332.anInt6575 = arg0;
		Static529.aClass236_87.method6253();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Lclient!cj;")
	public static Class56 method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static405.aClass56ArrayArrayArray2[0][arg1][arg2] != null && Static405.aClass56ArrayArrayArray2[0][arg1][arg2].aClass56_1 != null;
			if (local28 && arg0 >= Static192.anInt4507 - 1) {
				return null;
			}
			Static493.method7210(arg0, arg1, arg2);
		}
		return Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
	public static int method4602(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public static void method4603() {
		Static582.aBoolean711 = true;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!kw;I)V")
	public static void method4604(@OriginalArg(0) Class8_Sub31 arg0) {
		Static528.aClass43_59.method1424(arg0);
		arg0.anInt5971 = arg0.aClass8_Sub8_Sub2_1.anInt10588;
		arg0.aClass8_Sub8_Sub2_1.anInt10588 = 0;
		Static404.anInt7725 += arg0.anInt5971;
	}
}
