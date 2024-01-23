import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!fh;")
	public static Class58 aClass58_95;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public static int anInt5190 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!fh;ZLclient!fh;)V")
	public static void method4269(@OriginalArg(1) Class58 arg0, @OriginalArg(3) Class58 arg1) {
		Static52.aBoolean152 = true;
		Static278.aClass58_97 = arg1;
		Static66.aClass58_38 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!qc;Z)V")
	public static void method4271(@OriginalArg(0) Class53_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt4034 - Static50.anInt954;
		@Pc(25) int local25 = arg0.anInt3973 * 128 + arg0.method3324() * 64;
		@Pc(37) int local37 = arg0.anInt4033 * 128 + arg0.method3324() * 64;
		if (arg0.anInt4008 == 0) {
			arg0.anInt4017 = 1024;
		}
		arg0.anInt4002 += (local37 - arg0.anInt4002) / local13;
		arg0.anInt3974 += (local25 - arg0.anInt3974) / local13;
		if (arg0.anInt4008 == 1) {
			arg0.anInt4017 = 1536;
		}
		arg0.anInt4037 = 0;
		if (arg0.anInt4008 == 2) {
			arg0.anInt4017 = 0;
		}
		if (arg0.anInt4008 == 3) {
			arg0.anInt4017 = 512;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void method4272() {
		Static81.aClass26_16.method517(5);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4273(@OriginalArg(1) String arg0) {
		if (Static255.aClass4_Sub15Array1 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(20) long local20 = Static108.method1747(arg0);
		if (local20 == 0L) {
			return;
		}
		while (Static255.aClass4_Sub15Array1.length > local16 && local20 != Static255.aClass4_Sub15Array1[local16].aLong217) {
			local16++;
		}
		if (Static255.aClass4_Sub15Array1.length > local16 && Static255.aClass4_Sub15Array1[local16] != null) {
			Static110.aClass4_Sub10_Sub1_1.method4687(75);
			Static110.aClass4_Sub10_Sub1_1.method4619(Static255.aClass4_Sub15Array1[local16].aLong217);
		}
	}
}
