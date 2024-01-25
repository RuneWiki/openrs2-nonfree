import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array7;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public static int anInt1559;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt1561 = 0;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public static void method1264() {
		Static273.aClass51_13 = null;
		Static224.anInt3825 = -1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[BII)Z")
	public static boolean method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class1_Sub33 local17 = new Class1_Sub33(arg2);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method5155();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method5181();
					if (local39 == 0) {
						continue label56;
					}
					local31 += local39 - 1;
					@Pc(68) int local68 = local31 & 0x3F;
					@Pc(74) int local74 = local31 >> 6 & 0x3F;
					@Pc(80) int local80 = local17.method5174() >> 2;
					@Pc(84) int local84 = arg0 + local74;
					@Pc(89) int local89 = local68 + arg1;
					if (local84 > 0 && local89 > 0 && local84 < arg3 - 1 && local89 < arg4 - 1) {
						@Pc(119) Class236 local119 = Static54.aClass153_1.method3081(local19);
						if (local80 != 22 || Static188.aClass135_Sub1_1.aBoolean326 || local119.anInt5915 != 0 || local119.anInt5925 == 1 || local119.aBoolean544) {
							if (!local119.method5084()) {
								local12 = false;
								Static164.anInt2966++;
							}
							local33 = true;
						}
					}
				}
				local39 = local17.method5181();
				if (local39 == 0) {
					break;
				}
				local17.method5174();
			}
		}
	}
}
