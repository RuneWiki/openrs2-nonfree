import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "I")
	public static int anInt10194;

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_138 = new Class130(37, 3);

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
	public static int anInt10193 = 0;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(Z)V")
	public static void method8731() {
		for (@Pc(3) int local3 = 0; local3 < Static401.aClass16ArrayArray1.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static401.aClass16ArrayArray1[local3].length; local9++) {
				Static401.aClass16ArrayArray1[local3][local9] = Static314.aClass16_2;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZILclient!la;)Lclient!qba;")
	public static Class3_Sub44 method8734(@OriginalArg(1) int arg0, @OriginalArg(2) Class196 arg1) {
		@Pc(8) byte[] local8 = arg1.method5113(arg0);
		return local8 == null ? null : new Class3_Sub44(local8);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)Lclient!hf;")
	public static Class4_Sub1_Sub5 method8735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass4_Sub1_Sub5_1 == null ? null : local7.aClass4_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)I")
	public static int method8737(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
