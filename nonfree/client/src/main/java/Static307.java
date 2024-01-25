import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "[I")
	public static final int[] anIntArray743 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Z")
	public static boolean aBoolean518 = true;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "I")
	public static int anInt5908 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Lclient!ur;")
	public static Class1_Sub1_Sub19 method5167(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub19 local10 = (Class1_Sub1_Sub19) Static8.aClass156_3.method4258((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static4.aClass165_4.method4508(Static147.method2791(arg0), Static162.method3082(arg0));
		local10 = new Class1_Sub1_Sub19();
		if (local31 != null) {
			local10.method5406(new Class1_Sub7(local31));
		}
		Static8.aClass156_3.method4256(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)I")
	public static int method5168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(21) int local21 = local7 >= 8 ? arg3 : arg1;
		@Pc(40) int local40 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg1 : arg2;
		return ((local7 & 0x1) == 0 ? local21 : -local21) + ((local7 & 0x2) == 0 ? local40 : -local40);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public static void method5171(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub1_Sub8 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class41 local8 = Static288.aClass41Array5[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static74.anInt3404; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static222.anInt4391; local15++) {
						local1 = local8.method5429(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class41 local41 = Static288.aClass41Array5[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5434(local15, local12) - local41.method5434(local15, local12);
									@Pc(67) int local67 = local8.method5434(local15 + 1, local12) - local41.method5434(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5434(local15 + 1, local12 + 1) - local41.method5434(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5434(local15, local12 + 1) - local41.method5434(local15, local12 + 1);
									local41.method5426(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)C")
	public static char method5174(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(39) char local39 = Static273.aCharArray5[local7 - 128];
			if (local39 == '\u0000') {
				local39 = '?';
			}
			local7 = local39;
		}
		return (char) local7;
	}
}
