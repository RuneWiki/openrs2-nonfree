import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	public static int anInt9842;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!in;")
	public static Class157 aClass157_268;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_64 = new Class341();

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_222 = new Class215(107, 6);

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)I")
	public static int method8218() {
		return Static607.anInt10669++;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)Z")
	public static boolean method8220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static65.aBoolean754) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static631.aClass24ArrayArray2[local18] == null || Static631.aClass24ArrayArray2[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class24 local40 = Static631.aClass24ArrayArray2[local18][local22];
		@Pc(51) Class2_Sub6_Sub3 local51;
		if (arg0 == -1 && local40.anInt480 == 0) {
			for (local51 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local51 != null; local51 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
				if (local51.anInt2631 == 6 || local51.anInt2631 == 1011 || local51.anInt2631 == 13 || local51.anInt2631 == 18 || local51.anInt2631 == 16) {
					for (@Pc(82) Class24 local82 = Static87.method8101(local51.anInt2630); local82 != null; local82 = Static524.method8704(local82)) {
						if (local82.anInt510 == local40.anInt510) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local51 != null; local51 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
				if (local51.anInt2627 == arg0 && local51.anInt2630 == local40.anInt510 && (local51.anInt2631 == 6 || local51.anInt2631 == 1011 || local51.anInt2631 == 13 || local51.anInt2631 == 18 || local51.anInt2631 == 16)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!bf;I)I")
	public static int method8221(@OriginalArg(0) Class31 arg0) {
		if (arg0 == Static13.aClass31_1) {
			return 9216;
		} else if (arg0 == Static228.aClass31_2) {
			return 34065;
		} else if (Static570.aClass31_4 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ua;)I")
	public static int method8223(@OriginalArg(1) Class2_Sub11_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method8400(2);
		@Pc(25) int local25;
		if (local10 == 0) {
			local25 = 0;
		} else if (local10 == 1) {
			local25 = arg0.method8400(5);
		} else if (local10 == 2) {
			local25 = arg0.method8400(8);
		} else {
			local25 = arg0.method8400(11);
		}
		return local25;
	}
}
