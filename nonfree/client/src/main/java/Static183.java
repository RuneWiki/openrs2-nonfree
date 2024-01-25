import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!haa", name = "r", descriptor = "Lclient!jd;")
	public static final Class174 aClass174_1 = Static190.method3463();

	@OriginalMember(owner = "client!haa", name = "ab", descriptor = "Lclient!gga;")
	public static final Class122 aClass122_1 = new Class122(16);

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBI)Z")
	public static boolean method3404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static425.method6081(arg1, arg0) | Static39.method672(arg1, arg0) | Static419.method6622(arg1, arg0)) & Static169.method3270(arg0, arg1);
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(B)V")
	public static void method3407() {
		if (Static430.anInt7383 == 0) {
			return;
		}
		try {
			if (++Static166.anInt3598 > 2000) {
				if (Static235.aClass45_1 != null) {
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
				}
				if (Static228.anInt4680 >= 2) {
					Static521.anInt8882 = -5;
					Static430.anInt7383 = 0;
					return;
				}
				Static549.aClass300_11.method6607();
				Static430.anInt7383 = 1;
				Static228.anInt4680++;
				Static166.anInt3598 = 0;
			}
			if (Static430.anInt7383 == 1) {
				Static151.aClass299_1 = Static549.aClass300_11.method6606(Static147.aClass161_4);
				Static430.anInt7383 = 2;
			}
			if (Static430.anInt7383 == 2) {
				if (Static151.aClass299_1.anInt7985 == 2) {
					throw new IOException();
				}
				if (Static151.aClass299_1.anInt7985 != 1) {
					return;
				}
				Static235.aClass45_1 = Static516.method2306((Socket) Static151.aClass299_1.anObject41);
				Static151.aClass299_1 = null;
				Static315.method4803();
				Static430.anInt7383 = 4;
			}
			@Pc(121) int local121;
			if (Static430.anInt7383 == 4) {
				if (!Static235.aClass45_1.method841(1)) {
					return;
				}
				Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				local121 = Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF;
				if (local121 != 21) {
					Static521.anInt8882 = local121;
					Static430.anInt7383 = 0;
					Static235.aClass45_1.method839();
					Static235.aClass45_1 = null;
					return;
				}
				Static430.anInt7383 = 5;
			}
			if (Static430.anInt7383 == 5) {
				if (!Static235.aClass45_1.method841(1)) {
					return;
				}
				Static235.aClass45_1.method838(1, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				Static430.anInt7383 = 6;
				Static425.aStringArray32 = new String[Static487.aClass4_Sub9_Sub1_2.aByteArray97[0] & 0xFF];
			}
			if (Static430.anInt7383 == 6 && Static235.aClass45_1.method841(Static425.aStringArray32.length * 8)) {
				Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
				Static235.aClass45_1.method838(Static425.aStringArray32.length * 8, 0, Static487.aClass4_Sub9_Sub1_2.aByteArray97);
				for (local121 = 0; local121 < Static425.aStringArray32.length; local121++) {
					Static425.aStringArray32[local121] = Static446.method6284(Static487.aClass4_Sub9_Sub1_2.method5997());
				}
				Static521.anInt8882 = 21;
				Static430.anInt7383 = 0;
				Static235.aClass45_1.method839();
				Static235.aClass45_1 = null;
			}
		} catch (@Pc(221) IOException local221) {
			if (Static235.aClass45_1 != null) {
				Static235.aClass45_1.method839();
				Static235.aClass45_1 = null;
			}
			if (Static228.anInt4680 < 2) {
				Static549.aClass300_11.method6607();
				Static228.anInt4680++;
				Static166.anInt3598 = 0;
				Static430.anInt7383 = 1;
			} else {
				Static521.anInt8882 = -4;
				Static430.anInt7383 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)Lclient!l;")
	public static Class10_Sub4 method3413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub4_1;
	}
}
