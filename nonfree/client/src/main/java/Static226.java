import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "[S")
	public static short[] aShortArray68 = new short[256];

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt4463 = 13156520;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
	public static void method4109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class210 local3 = new Class210();
		local3.anInt6279 = arg1 >> 7;
		local3.anInt6276 = arg2 >> 7;
		local3.anInt6289 = arg3 >> 7;
		local3.anInt6277 = arg4 >> 7;
		local3.anInt6291 = arg0;
		local3.anInt6292 = arg1;
		local3.anInt6284 = arg2;
		local3.anInt6282 = arg3;
		local3.anInt6294 = arg4;
		local3.anInt6295 = arg5;
		local3.anInt6286 = arg6;
		Static263.aClass210Array2[Static93.anInt1792++] = local3;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILclient!qj;)Lclient!jd;")
	public static Class1_Sub1_Sub12 method4111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class165 arg2) {
		@Pc(14) Class1_Sub7 local14 = new Class1_Sub7(arg2.method4508(arg1, arg0));
		@Pc(42) Class1_Sub1_Sub12 local42 = new Class1_Sub1_Sub12(arg1, local14.method3134(), local14.method3134(), local14.method3125(), local14.method3125(), local14.method3141() == 1, local14.method3141());
		@Pc(48) int local48 = local14.method3141();
		for (@Pc(50) int local50 = 0; local50 < local48; local50++) {
			local42.aClass195_32.method5018(new Class1_Sub11(local14.method3141(), local14.method3115(), local14.method3115(), local14.method3115(), local14.method3115(), local14.method3115(), local14.method3115(), local14.method3115(), local14.method3115()));
		}
		local42.method2741();
		return local42;
	}
}
