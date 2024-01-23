import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Lclient!vh;")
	public static Class187 aClass187_126 = new Class187(260);

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public static int anInt4467 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)Lclient!dh;")
	public static Class35 method3903(@OriginalArg(1) int arg0) {
		@Pc(10) Class35 local10 = (Class35) Static183.aClass187_94.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static306.aClass121_133.method3115(Static176.method2948(arg0), Static155.method2649(arg0));
		local10 = new Class35();
		if (local32 != null) {
			local10.method906(new Class1_Sub14(local32));
		}
		Static183.aClass187_94.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
	public static void method3905() {
		Static48.aClass187_27.method4525();
		Static191.aClass187_100.method4525();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)[Lclient!pa;")
	public static Class1_Sub2_Sub1[] method3906() {
		@Pc(4) Class1_Sub2_Sub1[] local4 = new Class1_Sub2_Sub1[Static94.anInt3439];
		for (@Pc(11) int local11 = 0; local11 < Static94.anInt3439; local11++) {
			@Pc(22) int local22 = Static160.anIntArray267[local11] * Static235.anIntArray468[local11];
			@Pc(26) byte[] local26 = Static69.aByteArrayArray15[local11];
			if (Static168.aBooleanArray14[local11]) {
				@Pc(103) byte[] local103 = Static169.aByteArrayArray7[local11];
				@Pc(106) int[] local106 = new int[local22];
				for (@Pc(108) int local108 = 0; local108 < local22; local108++) {
					local106[local108] = (local103[local108] & 0xFF) << 24 | Static83.anIntArray144[local26[local108] & 0xFF];
				}
				if (Static156.aBoolean211) {
					local4[local11] = new Class1_Sub2_Sub1_Sub1_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local11], Static254.anIntArray412[local11], Static160.anIntArray267[local11], Static235.anIntArray468[local11], local106);
				} else {
					local4[local11] = new Class1_Sub2_Sub1_Sub2_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local11], Static254.anIntArray412[local11], Static160.anIntArray267[local11], Static235.anIntArray468[local11], local106);
				}
			} else {
				@Pc(33) int[] local33 = new int[local22];
				for (@Pc(35) int local35 = 0; local35 < local22; local35++) {
					local33[local35] = Static83.anIntArray144[local26[local35] & 0xFF];
				}
				if (Static156.aBoolean211) {
					local4[local11] = new Class1_Sub2_Sub1_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local11], Static254.anIntArray412[local11], Static160.anIntArray267[local11], Static235.anIntArray468[local11], local33);
				} else {
					local4[local11] = new Class1_Sub2_Sub1_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local11], Static254.anIntArray412[local11], Static160.anIntArray267[local11], Static235.anIntArray468[local11], local33);
				}
			}
		}
		Static117.method2101();
		return local4;
	}
}
