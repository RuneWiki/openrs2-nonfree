import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
	public static final int[] anIntArray537 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_163 = new Class56(59, -1);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public static void method6935() {
		if (Static246.aBoolean325) {
			return;
		}
		if (Static405.aClass3_Sub3_Sub1_1.aBoolean577) {
			Static126.aFloat84 = (int) Static126.aFloat84 + 47 & 0xFFFFFFF0;
		} else {
			Static63.aFloat30 += (12.0F - Static63.aFloat30) / 2.0F;
		}
		Static115.aBoolean505 = true;
		Static246.aBoolean325 = true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!ce;)I")
	public static int method6936(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method1383(2);
		@Pc(28) int local28;
		if (local15 == 0) {
			local28 = 0;
		} else if (local15 == 1) {
			local28 = arg0.method1383(5);
		} else if (local15 == 2) {
			local28 = arg0.method1383(8);
		} else {
			local28 = arg0.method1383(11);
		}
		return local28;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!pi;B)[Lclient!sda;")
	public static Class306[] method6937(@OriginalArg(0) Class258 arg0) {
		if (!arg0.method5884()) {
			return new Class306[0];
		}
		@Pc(16) Class39 local16 = arg0.method5888();
		while (local16.anInt894 == 0) {
			Static589.method7892(10L);
		}
		if (local16.anInt894 == 2) {
			return new Class306[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject2;
		@Pc(51) Class306[] local51 = new Class306[local37.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class306 local59 = new Class306();
			local51[local53] = local59;
			local59.anInt7912 = local37[local53 << 2];
			local59.anInt7911 = local37[(local53 << 2) + 1];
			local59.anInt7909 = local37[(local53 << 2) + 2];
			local59.anInt7908 = local37[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
	public static int method6938(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)Lclient!kba;")
	public static Class173 method6939() {
		return new Class173(1, false);
	}
}
