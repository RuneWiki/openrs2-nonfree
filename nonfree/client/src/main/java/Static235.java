import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_64 = new Class194(38, 7);

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_93 = new Class129(62, 2);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
	public static void method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static31.anInt618 + arg2;
		@Pc(19) int local19 = arg0 + Static226.anInt3768;
		if (Static319.aClass258ArrayArrayArray3 == null || arg2 < 0 || arg0 < 0 || Static433.anInt7210 <= arg2 || Static418.anInt6969 <= arg0) {
			return;
		}
		@Pc(47) long local47 = (long) (local19 << 14 | arg1 << 28 | local9);
		@Pc(53) Class5_Sub24 local53 = (Class5_Sub24) Static400.aClass252_38.method5659(local47);
		if (local53 == null) {
			Static2.method6030(arg1, arg2, arg0);
			return;
		}
		@Pc(67) Class5_Sub27 local67 = (Class5_Sub27) local53.aClass177_21.method3618();
		if (local67 == null) {
			Static2.method6030(arg1, arg2, arg0);
			return;
		}
		@Pc(81) Class2_Sub5_Sub1 local81 = (Class2_Sub5_Sub1) Static2.method6030(arg1, arg2, arg0);
		if (local81 == null) {
			local81 = new Class2_Sub5_Sub1();
		} else {
			local81.anInt1604 = local81.anInt1596 = -1;
		}
		local81.anInt1602 = local67.anInt4204;
		local81.anInt1600 = local67.anInt4203;
		label46: while (true) {
			@Pc(109) Class5_Sub27 local109 = (Class5_Sub27) local53.aClass177_21.method3619();
			if (local109 == null) {
				break;
			}
			if (local109.anInt4203 != local81.anInt1600) {
				local81.anInt1604 = local109.anInt4203;
				local81.anInt1599 = local109.anInt4204;
				while (true) {
					@Pc(134) Class5_Sub27 local134 = (Class5_Sub27) local53.aClass177_21.method3619();
					if (local134 == null) {
						break label46;
					}
					if (local134.anInt4203 != local81.anInt1600 && local81.anInt1604 != local134.anInt4203) {
						local81.anInt1598 = local134.anInt4204;
						local81.anInt1596 = local134.anInt4203;
					}
				}
			}
		}
		@Pc(178) int local178 = Static192.method2572((arg0 << 7) + 64, (arg2 << 7) - -64, arg1);
		Static319.method3935(arg1, arg2, arg0, local178, local81);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!fh;I)Lclient!ei;")
	public static Class61_Sub1 method3047(@OriginalArg(0) Class5_Sub15 arg0) {
		return new Class61_Sub1(arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5541(), arg0.method5541(), arg0.method5539());
	}
}
