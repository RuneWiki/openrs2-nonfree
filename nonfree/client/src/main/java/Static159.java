import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public static int anInt2414;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_68 = new Class160(107, 5);

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public static int anInt2418 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!iu;B)Lclient!cea;")
	public static Class58 method2263(@OriginalArg(0) Class4_Sub3_Sub3 arg0) {
		@Pc(9) Class58 local9;
		if (Static535.aClass58_3 == null) {
			local9 = new Class58();
		} else {
			local9 = Static535.aClass58_3;
			Static535.aClass58_3 = Static535.aClass58_3.aClass58_1;
			Static47.anInt784--;
			local9.aClass58_1 = null;
		}
		local9.aClass4_Sub3_Sub3_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2265(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(15) char local15 = arg0.charAt(local10);
			if (local15 == '<' || local15 == '>') {
				local8 += 3;
			}
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(local6 + local8);
		for (@Pc(42) int local42 = 0; local42 < local6; local42++) {
			@Pc(47) char local47 = arg0.charAt(local42);
			if (local47 == '<') {
				local40.append("<lt>");
			} else if (local47 == '>') {
				local40.append("<gt>");
			} else {
				local40.append(local47);
			}
		}
		return local40.toString();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static413.aBoolean501 || !Static434.aBoolean515) {
			return false;
		} else if (Static241.anInt4621 < 100) {
			return false;
		} else if (Static164.method2366(arg0, arg3, arg1)) {
			@Pc(45) int local45 = arg3 << Static110.anInt1858;
			@Pc(49) int local49 = arg0 << Static110.anInt1858;
			if (Static247.method4204(local45, Static391.anInt6813, local49, arg2, Static258.aClass159Array1[arg1].method8207(arg0, arg3), Static391.anInt6813)) {
				Static264.anInt4913++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
