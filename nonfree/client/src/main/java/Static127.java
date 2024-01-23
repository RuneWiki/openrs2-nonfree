import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!jl;")
	public static Class89 aClass89_14 = new Class89(64);

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public static int anInt2721 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2050(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static223.anInt4775 >= 100 && !Static247.aBoolean316 || Static223.anInt4775 >= 200) {
			Static116.method1877(Static59.aString76);
			return;
		}
		@Pc(25) String local25 = Static238.method3756(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(31) int local31;
		@Pc(40) String local40;
		@Pc(70) String local70;
		for (local31 = 0; local31 < Static223.anInt4775; local31++) {
			local40 = Static238.method3756(Static280.aStringArray43[local31]);
			if (local40 != null && local40.equals(local25)) {
				Static116.method1877(arg0 + Static139.aString196);
				return;
			}
			if (Static234.aStringArray39[local31] != null) {
				local70 = Static238.method3756(Static234.aStringArray39[local31]);
				if (local70 != null && local70.equals(local25)) {
					Static116.method1877(arg0 + Static139.aString196);
					return;
				}
			}
		}
		for (local31 = 0; local31 < Static159.anInt3526; local31++) {
			local40 = Static238.method3756(Static64.aStringArray14[local31]);
			if (local40 != null && local40.equals(local25)) {
				Static116.method1877(Static256.aString368 + arg0 + Static203.aString407);
				return;
			}
			if (Static60.aStringArray13[local31] != null) {
				local70 = Static238.method3756(Static60.aStringArray13[local31]);
				if (local70 != null && local70.equals(local25)) {
					Static116.method1877(Static256.aString368 + arg0 + Static203.aString407);
					return;
				}
			}
		}
		if (Static238.method3756(Static56.aClass2_Sub4_Sub2_1.aString182).equals(local25)) {
			Static116.method1877(Static259.aString374);
		} else {
			Static2.aClass1_Sub14_Sub1_1.method2252(93);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(arg0));
			Static2.aClass1_Sub14_Sub1_1.method2188(arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
	public static int method2051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}
}
