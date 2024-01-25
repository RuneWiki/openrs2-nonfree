import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
	public static int anInt272;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;II)V")
	public static void method315(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		Static444.method7024(true, arg2, -1, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method317(@OriginalArg(0) String arg0) {
		if (!Static475.aBoolean695 || (Static237.anInt5148 & 0x18) == 0) {
			return;
		}
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = Static71.anInt3990;
		@Pc(29) int[] local29 = Static549.anIntArray643;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			@Pc(39) Class3_Sub1_Sub3_Sub3_Sub2 local39 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local29[local31]];
			if (local39.aString64 != null && local39.aString64.equalsIgnoreCase(arg0) && (local39 == Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 && (Static237.anInt5148 & 0x10) != 0 || local39 != null && (Static237.anInt5148 & 0x8) != 0)) {
				@Pc(72) Class2_Sub52 local72 = Static130.method3019(Static255.aClass94_53, Static361.aClass183_1);
				local72.aClass2_Sub11_Sub2_7.method8345(Static194.anInt4509);
				local72.aClass2_Sub11_Sub2_7.method8349(local29[local31]);
				local72.aClass2_Sub11_Sub2_7.method8349(Static64.anInt2065);
				local72.aClass2_Sub11_Sub2_7.method8352(Static397.anInt7582);
				local72.aClass2_Sub11_Sub2_7.method8370(0);
				Static96.method2563(local72);
				local25 = true;
				Static624.method9086(true, local39.anIntArray358[0], local39.anIntArray357[0], local39.method5214(), 0, local39.method5214(), -2, 0);
				break;
			}
		}
		if (!local25) {
			Static271.method9045(Static588.aClass351_23.method8691(Static476.anInt8915) + arg0);
		}
		if (Static475.aBoolean695) {
			Static117.method2902();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)Z")
	public static boolean method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
