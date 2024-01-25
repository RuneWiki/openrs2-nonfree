import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!nw", name = "p", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_31 = new Class233(4);

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[200];

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IBI)Z")
	public static boolean method5863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(B)V")
	public static void method5864() {
		Static549.anInt9102 = 0;
		Static224.anInt4611++;
		Static616.anInt10012 = 0;
		Static151.method2872();
		Static460.method6689();
		Static625.method8452();
		@Pc(27) boolean local27 = false;
		@Pc(35) int local35;
		for (@Pc(29) int local29 = 0; local29 < Static616.anInt10012; local29++) {
			local35 = Static82.anIntArray156[local29];
			@Pc(42) Class2_Sub51 local42 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local35);
			@Pc(45) Class11_Sub1_Sub1_Sub2_Sub2 local45 = local42.aClass11_Sub1_Sub1_Sub2_Sub2_2;
			if (Static642.aBoolean757 && Static340.method5229(local35)) {
				Static498.method7094();
			}
			if (local45.anInt3248 != Static224.anInt4611) {
				if (local45.aClass236_1.method5781()) {
					Static206.method3598(local45);
				}
				local45.method2785(null);
				local27 = true;
				local42.method8599();
			}
		}
		if (local27) {
			Static225.anInt4616 = Static357.aClass222_23.method5473();
			Static357.aClass222_23.method5466(Static86.aClass2_Sub51Array1);
		}
		if (Static313.aClass2_Sub34_Sub2_1.anInt8188 != Static44.anInt971) {
			throw new RuntimeException("gnp1 pos:" + Static313.aClass2_Sub34_Sub2_1.anInt8188 + " psize:" + Static44.anInt971);
		}
		for (local35 = 0; local35 < Static228.anInt4647; local35++) {
			if (Static357.aClass222_23.method5468((long) Static160.anIntArray256[local35]) == null) {
				throw new RuntimeException("gnp2 pos:" + local35 + " size:" + Static228.anInt4647);
			}
		}
		if (Static225.anInt4616 - Static228.anInt4647 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static225.anInt4616 - Static228.anInt4647));
		}
		for (@Pc(174) int local174 = 0; local174 < Static225.anInt4616; local174++) {
			if (Static86.aClass2_Sub51Array1[local174].aClass11_Sub1_Sub1_Sub2_Sub2_2.anInt3248 != Static224.anInt4611) {
				throw new RuntimeException("gnp4 uk:" + Static86.aClass2_Sub51Array1[local174].aClass11_Sub1_Sub1_Sub2_Sub2_2.anInt3246);
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5865(@OriginalArg(1) String arg0) {
		if (!Static301.aBoolean423 || (Static73.anInt1590 & 0x18) == 0) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(14) int local14 = Static571.anInt9395;
		@Pc(16) int[] local16 = Static131.anIntArray213;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(25) Class11_Sub1_Sub1_Sub2_Sub1 local25 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local16[local18]];
			if (local25.aString4 != null && local25.aString4.equalsIgnoreCase(arg0) && (local25 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 && (Static73.anInt1590 & 0x10) != 0 || local25 != null && (Static73.anInt1590 & 0x8) != 0)) {
				@Pc(61) Class2_Sub50 local61 = Static595.method8194(Static610.aClass310_2, Static107.aClass269_25);
				local61.aClass2_Sub34_Sub2_2.method6916(Static590.anInt9763);
				local61.aClass2_Sub34_Sub2_2.method6857(Static352.anInt6475);
				local61.aClass2_Sub34_Sub2_2.method6882(Static342.anInt6258);
				local61.aClass2_Sub34_Sub2_2.method6916(local16[local18]);
				local61.aClass2_Sub34_Sub2_2.method6860(0);
				Static311.method4754(local61);
				Static191.method5050(0, true, local25.method2778(), -2, local25.method2778(), local25.anIntArray232[0], local25.anIntArray233[0], 0);
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static74.method1384(Static628.aClass369_21.method8475(Static377.anInt6756) + arg0);
		}
		if (Static301.aBoolean423) {
			Static171.method3178();
		}
	}
}
