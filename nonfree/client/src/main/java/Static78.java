import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
	public static final int anInt1985 = 2;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "Lclient!et;")
	public static final Class104 aClass104_3 = new Class104(4);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Z")
	public static boolean method1680() {
		try {
			if (Static275.anInt5095 == 2) {
				if (Static158.aClass2_Sub48_2 == null) {
					Static158.aClass2_Sub48_2 = Static658.method8653(Static510.aClass238_229, Static309.anInt7821, Static543.anInt8776);
					if (Static158.aClass2_Sub48_2 == null) {
						return false;
					}
				}
				if (Static379.aClass58_1 == null) {
					Static379.aClass58_1 = new Class58(Static318.aClass238_145, Static355.aClass238_163);
				}
				@Pc(37) Class2_Sub11_Sub1 local37 = Static191.aClass2_Sub11_Sub1_2;
				if (Static79.aClass2_Sub11_Sub1_1 != null) {
					local37 = Static79.aClass2_Sub11_Sub1_1;
				}
				if (local37.method1517(Static158.aClass2_Sub48_2, Static347.aClass238_277, Static379.aClass58_1)) {
					Static191.aClass2_Sub11_Sub1_2 = local37;
					Static191.aClass2_Sub11_Sub1_2.method1526();
					@Pc(76) int local76;
					if (Static114.anInt2410 > 0) {
						Static275.anInt5095 = 3;
						Static191.aClass2_Sub11_Sub1_2.method1510(Static64.anInt1727 >= Static114.anInt2410 ? Static114.anInt2410 : Static64.anInt1727);
						for (local76 = 0; local76 < Static264.anIntArray299.length; local76++) {
							Static191.aClass2_Sub11_Sub1_2.method1528(local76, Static264.anIntArray299[local76]);
							Static264.anIntArray299[local76] = 255;
						}
					} else {
						Static275.anInt5095 = 0;
						Static191.aClass2_Sub11_Sub1_2.method1510(Static64.anInt1727);
						for (local76 = 0; local76 < Static264.anIntArray299.length; local76++) {
							Static191.aClass2_Sub11_Sub1_2.method1528(local76, Static264.anIntArray299[local76]);
							Static264.anIntArray299[local76] = 255;
						}
					}
					if (Static79.aClass2_Sub11_Sub1_1 == null) {
						if (Static15.aLong11 > 0L) {
							Static191.aClass2_Sub11_Sub1_2.method1516(Static158.aClass2_Sub48_2, Static15.aLong11, Static246.aBoolean357);
						} else {
							Static191.aClass2_Sub11_Sub1_2.method1539(Static158.aClass2_Sub48_2, Static246.aBoolean357);
						}
					}
					if (Static464.aClass39_3 != null) {
						Static464.aClass39_3.method4895(Static191.aClass2_Sub11_Sub1_2);
					}
					Static158.aClass2_Sub48_2 = null;
					Static510.aClass238_229 = null;
					Static79.aClass2_Sub11_Sub1_1 = null;
					Static15.aLong11 = 0L;
					Static379.aClass58_1 = null;
					return true;
				}
			}
		} catch (@Pc(163) Exception local163) {
			local163.printStackTrace();
			Static191.aClass2_Sub11_Sub1_2.method1525();
			Static379.aClass58_1 = null;
			Static158.aClass2_Sub48_2 = null;
			Static510.aClass238_229 = null;
			Static79.aClass2_Sub11_Sub1_1 = null;
			Static275.anInt5095 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)I")
	public static int method1681(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static17.anInt398 - 1; local3++) {
			if (arg0 < Static192.anIntArray247[local3] + Static194.anIntArray248[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static17.anInt398 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBI)Z")
	public static boolean method1682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static202.method3468(arg0, arg1) | (arg1 & 0x800) != 0 || Static617.method8585(arg1, arg0);
	}
}
