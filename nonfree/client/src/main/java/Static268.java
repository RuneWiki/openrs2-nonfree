import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	public static int anInt5466 = 0;

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "[Lclient!ki;")
	public static final Class112[] aClass112Array1 = new Class112[50];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)V")
	public static void method4656(@OriginalArg(0) byte arg0) {
		if (Static173.aByteArrayArrayArray6 == null) {
			Static173.aByteArrayArrayArray6 = new byte[4][Static92.anInt2048][Static290.anInt5893];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(23) int local23 = 0; local23 < Static92.anInt2048; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static290.anInt5893; local27++) {
					Static173.aByteArrayArrayArray6[local14][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BLclient!am;)V")
	public static void method4659(@OriginalArg(1) Class11 arg0) {
		Static128.aClass11_56 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lclient!el;")
	public static Class65 method4669(@OriginalArg(1) int arg0) {
		@Pc(15) Class65 local15 = (Class65) Static189.aClass154_65.method4222((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static230.aClass11_93.method288(arg0, 35);
		local15 = new Class65();
		if (local25 != null) {
			local15.method1391(new Class4_Sub7(local25));
		}
		local15.method1389();
		Static189.aClass154_65.method4221((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
	public static void method4670() {
		@Pc(10) int local10;
		for (@Pc(3) int local3 = -1; local3 < Static156.anInt3506; local3++) {
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static39.anIntArray105[local3];
			}
			@Pc(20) Class2_Sub2_Sub1_Sub1 local20 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local10];
			if (local20 != null && local20.anInt6497 > 0) {
				local20.anInt6497--;
				if (local20.anInt6497 == 0) {
					local20.aString243 = null;
				}
			}
		}
		for (local10 = 0; local10 < Static282.anInt5712; local10++) {
			@Pc(57) int local57 = Static332.anIntArray523[local10];
			@Pc(61) Class2_Sub2_Sub1_Sub2 local61 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local57];
			if (local61 != null && local61.anInt6497 > 0) {
				local61.anInt6497--;
				if (local61.anInt6497 == 0) {
					local61.aString243 = null;
				}
			}
		}
	}
}
