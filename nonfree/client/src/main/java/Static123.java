import java.io.IOException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_81;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	public static int anInt3083;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar62 = Calendar.getInstance();

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
	public static boolean aBoolean277 = false;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	public static int anInt3082 = -1;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_951 = Static60.method1113("welle2:");

	@OriginalMember(owner = "client!v", name = "p", descriptor = "I")
	public static int anInt3084 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lclient!j;")
	public static Class4_Sub1_Sub8 method2000(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub8 local10 = (Class4_Sub1_Sub8) Static68.aClass33_8.method998((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static35.aClass20_18.method597(10, arg0);
		local10 = new Class4_Sub1_Sub8();
		local10.anInt1456 = arg0;
		if (local25 != null) {
			local10.method988(new Class4_Sub11(local25));
		}
		local10.method985();
		if (local10.anInt1448 != -1) {
			local10.method994(method2000(local10.anInt1466), method2000(local10.anInt1448));
		}
		if (!Static9.aBoolean24 && local10.aBoolean140) {
			local10.aClass22Array11 = null;
			local10.anInt1476 = 0;
			local10.aClass22_359 = Static33.aClass22_222;
			local10.aClass22Array12 = null;
		}
		Static68.aClass33_8.method997((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!jd;B)V")
	public static void method2001(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static111.aClass79_2 != null) {
			@Pc(16) int local16;
			try {
				Static111.aClass79_2.method1988(0L);
				local16 = 0;
				Static111.aClass79_2.method1986(local8);
				while (local16 < 24 && local8[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local16 = 0; local16 < 24; local16++) {
					local8[local16] = -1;
				}
			}
		}
		arg0.method730(24, local8);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	public static void method2003() {
		aClass22_951 = null;
		aClass20_Sub1_81 = null;
		aCalendar62 = null;
	}
}
