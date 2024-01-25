import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_172 = new Class81(92, 5);

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_173 = new Class81(48, 3);

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_46 = new Class265();

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
	public static final int anInt6773 = 1403;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!cr;)Ljava/lang/String;")
	public static String method5307(@OriginalArg(1) Class41 arg0) {
		if (Static56.method1112(arg0).method1590() == 0) {
			return null;
		} else if (arg0.aString12 == null || arg0.aString12.trim().length() == 0) {
			return Static345.aBoolean339 ? "Hidden-use" : null;
		} else {
			return arg0.aString12;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method5308() {
		if (Static399.aClass167_Sub1_1.method4528(Static281.anInt5126) || Static179.anInt6503 == Static301.anInt5383) {
			Static28.method382(Static387.aClass26_9);
			if (Static99.anInt1740 != Static301.anInt5383) {
				Static276.method4099();
			}
		} else {
			Static356.method4998(Static447.anInt4685, Static190.anInt3756, false, false);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	public static void method5309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg1, 12);
		local8.method434();
		local8.anInt657 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIZ)I")
	public static int method5310(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub44 local14 = Static432.method5828(false, arg0);
		if (local14 == null) {
			return Static93.aClass130_1.method3041(arg0).anInt6383;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray499.length; local26++) {
			if (local14.anIntArray499[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static93.aClass130_1.method3041(arg0).anInt6383 - local14.anIntArray499.length;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
	public static void method5311() {
		Static174.aClass240_16.method5433();
		Static430.aClass145_10.method3388();
		Static71.aClass145_1.method3388();
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	public static void method5313() {
		if (Static297.anInt5339 == 10) {
			Static446.method6043(28);
		}
		if (Static297.anInt5339 == 30) {
			Static446.method6043(25);
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)Z")
	public static boolean method5314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
