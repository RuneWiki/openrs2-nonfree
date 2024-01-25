import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "F")
	public static float aFloat133;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "Lclient!sea;")
	public static Class308 aClass308_104;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public static int anInt5308 = 0;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_67 = new Class208(53, -1);

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "[Lclient!jo;")
	public static final Interface14[] anInterface14Array2 = new Interface14[128];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	public static void method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static328.method4862(local7.aClass11_Sub1_Sub3_1);
		Static328.method4862(local7.aClass11_Sub1_Sub3_2);
		if (local7.aClass11_Sub1_Sub3_1 != null) {
			local7.aClass11_Sub1_Sub3_1 = null;
		}
		if (local7.aClass11_Sub1_Sub3_2 != null) {
			local7.aClass11_Sub1_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4380(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local10 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!sea;ILclient!sea;[I)V")
	public static void method4381(@OriginalArg(0) Class308 arg0, @OriginalArg(2) Class308 arg1, @OriginalArg(3) int[] arg2) {
		if (arg2 != null) {
			Static411.anIntArray437 = arg2;
		}
		Static284.aClass308_177 = arg0;
		Static247.aClass308_96 = arg1;
	}
}
