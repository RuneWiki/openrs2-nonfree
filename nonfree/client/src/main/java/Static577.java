import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_40 = new Class305(32);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[BIB)Z")
	public static boolean method8132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class6_Sub26 local17 = new Class6_Sub26(arg3);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(25) int local25 = local17.method4947();
			if (local25 == 0) {
				return local12;
			}
			local19 += local25;
			@Pc(36) int local36 = 0;
			@Pc(38) boolean local38 = false;
			while (true) {
				@Pc(44) int local44;
				while (!local38) {
					local44 = local17.method4973();
					if (local44 == 0) {
						continue label56;
					}
					local36 += local44 - 1;
					@Pc(68) int local68 = local36 & 0x3F;
					@Pc(74) int local74 = local36 >> 6 & 0x3F;
					@Pc(80) int local80 = local17.method4966() >> 2;
					@Pc(84) int local84 = arg4 + local74;
					@Pc(88) int local88 = arg1 + local68;
					if (local84 > 0 && local88 > 0 && arg2 - 1 > local84 && arg0 - 1 > local88) {
						@Pc(110) Class31 local110 = Static480.aClass57_11.method1469(local19);
						if (local80 != 22 || Static104.aClass6_Sub6_Sub1_4.aBoolean121 || local110.anInt1107 != 0 || local110.anInt1093 == 1 || local110.aBoolean91) {
							if (!local110.method1030()) {
								Static483.anInt8763++;
								local12 = false;
							}
							local38 = true;
						}
					}
				}
				local44 = local17.method4973();
				if (local44 == 0) {
					break;
				}
				local17.method4966();
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
	public static void method8135() {
		if (Static350.aBoolean441) {
			return;
		}
		Static399.aBoolean713 = true;
		Static350.aBoolean441 = true;
		if (Static104.aClass6_Sub6_Sub1_4.aBoolean137) {
			Static412.aFloat175 = (int) Static412.aFloat175 + 191 & 0xFFFFFF80;
		} else {
			Static471.aFloat184 += (24.0F - Static471.aFloat184) / 2.0F;
		}
	}
}
