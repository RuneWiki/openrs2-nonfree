import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "[B")
	public static byte[] aByteArray65;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt5402;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_131 = new Class251(86, -1);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZII)V")
	public static void method4908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg3 + arg1);
		@Pc(31) int local31 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - arg3);
		Static240.method4038(local22, Static144.anIntArrayArray30[arg0], arg2, local31);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(62) int local62;
			@Pc(66) int local66;
			@Pc(86) int local86;
			@Pc(95) int local95;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local62 = arg0 - local9;
				local66 = local9 + arg0;
				if (local66 >= Static410.anInt7068 && Static281.anInt5188 >= local62) {
					local86 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local7 + arg1);
					local95 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - local7);
					if (local66 <= Static281.anInt5188) {
						Static240.method4038(local86, Static144.anIntArrayArray30[local66], arg2, local95);
					}
					if (Static410.anInt7068 <= local62) {
						Static240.method4038(local86, Static144.anIntArrayArray30[local62], arg2, local95);
					}
				}
			}
			local7++;
			local62 = arg0 - local7;
			local66 = local7 + arg0;
			if (Static410.anInt7068 <= local66 && local62 <= Static281.anInt5188) {
				local86 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 + local9);
				local95 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - local9);
				if (local66 <= Static281.anInt5188) {
					Static240.method4038(local86, Static144.anIntArrayArray30[local66], arg2, local95);
				}
				if (local62 >= Static410.anInt7068) {
					Static240.method4038(local86, Static144.anIntArrayArray30[local62], arg2, local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public static void method4909(@OriginalArg(1) boolean arg0) {
		if (Static434.aString85.length() == 0) {
			return;
		}
		Static590.method8398("--> " + Static434.aString85);
		Static367.method5514(false, arg0, Static434.aString85);
		if (!arg0) {
			Static434.aString85 = "";
			Static340.anInt5803 = 0;
		}
		Static663.anInt10804 = 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4912(@OriginalArg(1) String arg0) {
		@Pc(18) String local18 = Static509.method7631(Static566.method8125(arg0));
		if (local18 == null) {
			local18 = "";
		}
		return local18;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZZ)V")
	public static void method4913(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static87.anInt1475++;
			Static486.method7337();
		}
		if (arg0) {
			Static387.anInt9115++;
			Static41.method674();
		}
	}
}
