import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "J")
	public static long aLong91 = 0L;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method2673() {
		try {
			@Pc(16) int local16;
			if (Static496.anInt8290 == 1) {
				local16 = Static28.aClass5_Sub16_Sub4_6.method6409();
				if (local16 > 0 && Static28.aClass5_Sub16_Sub4_6.method6376()) {
					local16 -= Static212.anInt3461;
					if (local16 < 0) {
						local16 = 0;
					}
					Static28.aClass5_Sub16_Sub4_6.method6384(local16);
					return;
				}
				Static28.aClass5_Sub16_Sub4_6.method6389();
				Static28.aClass5_Sub16_Sub4_6.method6405();
				if (Static659.aClass208_145 == null) {
					Static496.anInt8290 = 0;
				} else {
					Static496.anInt8290 = 2;
				}
				Static185.aClass5_Sub21_1 = null;
				Static606.aClass126_3 = null;
			}
			if (Static496.anInt8290 == 3) {
				local16 = Static28.aClass5_Sub16_Sub4_6.method6409();
				if (Static609.anInt10105 > local16 && Static28.aClass5_Sub16_Sub4_6.method6376()) {
					local16 += Static243.anInt4193;
					if (Static609.anInt10105 < local16) {
						local16 = Static609.anInt10105;
					}
					Static28.aClass5_Sub16_Sub4_6.method6384(local16);
				} else {
					Static243.anInt4193 = 0;
					Static496.anInt8290 = 0;
				}
			}
		} catch (@Pc(106) Exception local106) {
			local106.printStackTrace();
			Static28.aClass5_Sub16_Sub4_6.method6389();
			Static622.aClass5_Sub16_Sub4_8 = null;
			Static659.aClass208_145 = null;
			Static606.aClass126_3 = null;
			Static496.anInt8290 = 0;
			Static185.aClass5_Sub21_1 = null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method2675(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static59.method839(arg0, 0, arg1, arg0.length - 1);
	}
}
