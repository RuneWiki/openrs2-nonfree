import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_248 = new Class288(29, -1);

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public static int anInt7433 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!haa;ZLclient!ju;)Lclient!rea;")
	public static Class2_Sub40 method6285(@OriginalArg(0) Class131 arg0, @OriginalArg(2) Class179 arg1) {
		@Pc(8) Class2_Sub40 local8 = Static40.method643();
		local8.anInt8041 = arg1.anInt4448;
		local8.aClass179_105 = arg1;
		if (local8.anInt8041 == -1) {
			local8.aClass2_Sub22_Sub2_2 = new Class2_Sub22_Sub2(260);
		} else if (local8.anInt8041 == -2) {
			local8.aClass2_Sub22_Sub2_2 = new Class2_Sub22_Sub2(10000);
		} else if (local8.anInt8041 <= 18) {
			local8.aClass2_Sub22_Sub2_2 = new Class2_Sub22_Sub2(20);
		} else if (local8.anInt8041 <= 98) {
			local8.aClass2_Sub22_Sub2_2 = new Class2_Sub22_Sub2(100);
		} else {
			local8.aClass2_Sub22_Sub2_2 = new Class2_Sub22_Sub2(260);
		}
		local8.aClass2_Sub22_Sub2_2.method8561(arg0);
		local8.aClass2_Sub22_Sub2_2.method8559(local8.aClass179_105.method3853());
		local8.anInt8040 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIIII)V")
	public static void method6286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(21) Class53 local21 = Static28.aClass53ArrayArrayArray1[arg0][arg3][arg1];
			if (local21 != null) {
				if (arg2 == 1) {
					local21.aShort24 = 0;
				} else if (arg2 == 2) {
					local21.aShort22 = 0;
				}
			}
			Static46.method752();
			return;
		}
		for (@Pc(43) int local43 = 0; local43 < Static296.anInt4855; local43++) {
			@Pc(49) Class327 local49 = Static422.aClass327Array4[local43];
			if (arg2 == local49.aByte114 && local49.aShort116 == arg3 && local49.aShort115 == arg1 || local49.aShort114 == arg3 && arg1 == local49.aShort115) {
				if (local43 != Static296.anInt4855) {
					Static653.method5395(Static422.aClass327Array4, local43 + 1, Static422.aClass327Array4, local43, Static422.aClass327Array4.length - local43 - 1);
				}
				Static296.anInt4855--;
				return;
			}
		}
	}
}
