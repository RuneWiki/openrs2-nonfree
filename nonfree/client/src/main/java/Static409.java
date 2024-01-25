import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_149 = new Class200(43, 4);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!cc;B)V")
	public static void method6031(@OriginalArg(0) Class16_Sub1_Sub1_Sub3_Sub1 arg0) {
		for (@Pc(16) Class2_Sub27 local16 = (Class2_Sub27) Static536.aClass114_41.method2772(); local16 != null; local16 = (Class2_Sub27) Static536.aClass114_41.method2762()) {
			if (arg0 == local16.aClass16_Sub1_Sub1_Sub3_Sub1_1) {
				if (local16.aClass2_Sub11_Sub4_3 != null) {
					Static622.aClass2_Sub11_Sub2_2.method2950(local16.aClass2_Sub11_Sub4_3);
					local16.aClass2_Sub11_Sub4_3 = null;
				}
				local16.method8920();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method6032(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			if (arg0.charAt(local18) == arg1) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!ria;IZI)V")
	public static void method6033(@OriginalArg(1) Class303 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = arg0.anInt7914;
		@Pc(13) int local13 = arg0.anInt7971;
		if (arg0.aByte106 == 0) {
			arg0.anInt7914 = arg0.anInt7940;
		} else if (arg0.aByte106 == 1) {
			arg0.anInt7914 = arg3 - arg0.anInt7940;
		} else if (arg0.aByte106 == 2) {
			arg0.anInt7914 = arg3 * arg0.anInt7940 >> 14;
		}
		if (arg0.aByte104 == 0) {
			arg0.anInt7971 = arg0.anInt7948;
		} else if (arg0.aByte104 == 1) {
			arg0.anInt7971 = arg1 - arg0.anInt7948;
		} else if (arg0.aByte104 == 2) {
			arg0.anInt7971 = arg0.anInt7948 * arg1 >> 14;
		}
		if (arg0.aByte106 == 4) {
			arg0.anInt7914 = arg0.anInt7971 * arg0.anInt7916 / arg0.anInt7924;
		}
		if (arg0.aByte104 == 4) {
			arg0.anInt7971 = arg0.anInt7924 * arg0.anInt7914 / arg0.anInt7916;
		}
		if (Static179.aBoolean273 && (Static79.method1734(arg0).anInt3087 != 0 || arg0.anInt7935 == 0)) {
			if (arg0.anInt7971 < 5 && arg0.anInt7914 < 5) {
				arg0.anInt7914 = 5;
				arg0.anInt7971 = 5;
			} else {
				if (arg0.anInt7914 <= 0) {
					arg0.anInt7914 = 5;
				}
				if (arg0.anInt7971 <= 0) {
					arg0.anInt7971 = 5;
				}
			}
		}
		if (arg0.anInt7972 == Static40.anInt838) {
			Static216.aClass303_11 = arg0;
		}
		if (arg2 && arg0.anObjectArray32 != null && (local10 != arg0.anInt7914 || local13 != arg0.anInt7971)) {
			@Pc(185) Class2_Sub18 local185 = new Class2_Sub18();
			local185.anObjectArray1 = arg0.anObjectArray32;
			local185.aClass303_4 = arg0;
			Static102.aClass114_11.method2771(local185);
		}
	}
}
