import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_8 = new Class186(82, -1);

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "[B")
	public static final byte[] aByteArray13 = new byte[2048];

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method1231(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static555.method5095(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!qa;Lclient!bu;IIB)V")
	public static void method1232(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class38 arg1) {
		Static263.aClass38_39.method1417();
		if (Static26.aBoolean97) {
			return;
		}
		for (@Pc(14) Class1_Sub25 local14 = (Class1_Sub25) arg1.method1419(); local14 != null; local14 = (Class1_Sub25) arg1.method1415()) {
			@Pc(21) Class24 local21 = Static451.aClass250_3.method6143(local14.anInt4556);
			if (Static304.method5085(local21)) {
				@Pc(33) boolean local33 = Static59.method1640(arg0, local14, local21);
				if (local33) {
					Static373.method5704(arg0, local14, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B[[BLclient!hf;)V")
	public static void method1233(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class118_Sub1 arg1) {
		@Pc(10) int[] local10 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(12) int local12 = 0; local12 < arg1.anInt3843; local12++) {
			Static443.method6413();
			for (@Pc(22) int local22 = 0; local22 < Static542.anInt9387 >> 3; local22++) {
				for (@Pc(25) int local25 = 0; local25 < Static36.anInt1324 >> 3; local25++) {
					@Pc(34) int local34 = Static131.anIntArrayArrayArray3[local12][local22][local25];
					if (local34 != -1) {
						@Pc(43) int local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean242 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = local69 / 8 + (local63 / 8 << 8);
							for (@Pc(81) int local81 = 0; local81 < Static85.anIntArray178.length; local81++) {
								if (Static85.anIntArray178[local81] == local79 && arg0[local81] != null) {
									@Pc(102) Class1_Sub13 local102 = new Class1_Sub13(arg0[local81]);
									arg1.method3438(local25 * 8, local12, local63, local43, Static70.aClass299Array1, local22 * 8, local102, local57, local69);
									arg1.method3456(local63, local10[0] == -1 ? local10 : null, local43, local12, local69, local25 * 8, Static478.aClass9_10, local22 * 8, local102, local57);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local10[0] != -1) {
			Static446.aClass89_1 = Static27.aClass310_1.method7429(local10[0], local10[3], Static86.aClass254_1, local10[1], local10[2]);
			Static419.anInt7311 = local10[4];
		}
	}
}
