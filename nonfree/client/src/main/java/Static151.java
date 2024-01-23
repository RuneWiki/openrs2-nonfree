import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "[[[Lclient!aa;")
	public static Class1_Sub2[][][] aClass1_Sub2ArrayArrayArray4;

	@OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
	public static int anInt3397;

	@OriginalMember(owner = "client!kn", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!kn", name = "T", descriptor = "Lclient!jl;")
	public static Class89 aClass89_19 = new Class89(64);

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)I")
	public static int method2449(@OriginalArg(1) int arg0) {
		if (Static5.aClass104_5 != null) {
			Static5.aClass104_5.method2571();
			Static5.aClass104_5 = null;
		}
		Static139.anInt3175++;
		if (Static139.anInt3175 > 4) {
			Static202.anInt4406 = 0;
			Static139.anInt3175 = 0;
			return arg0;
		}
		Static202.anInt4406 = 0;
		if (Static46.anInt1110 == Static313.anInt6274) {
			Static313.anInt6274 = Static63.anInt1367;
		} else {
			Static313.anInt6274 = Static46.anInt1110;
		}
		return -1;
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(II)I")
	public static int method2450(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return arg0 & ~local37;
	}
}
