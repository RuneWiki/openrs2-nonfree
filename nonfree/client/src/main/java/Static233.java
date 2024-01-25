import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_195 = new Class22(2, -2);

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_196 = new Class22(23, 8);

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3478(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static49.anInt2346 >= 100 && !Static246.aBoolean423 || Static49.anInt2346 >= 200) {
			Static415.method5323(Static386.aClass83_80.method2267(Static178.anInt3423));
			return;
		}
		@Pc(27) String local27 = Static123.method4868(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(75) String local75;
		for (@Pc(37) int local37 = 0; local37 < Static49.anInt2346; local37++) {
			@Pc(45) String local45 = Static123.method4868(Static194.aStringArray14[local37]);
			if (local45 != null && local45.equals(local27)) {
				Static415.method5323(arg0 + Static294.aClass83_17.method2267(Static178.anInt3423));
				return;
			}
			if (Static57.aStringArray6[local37] != null) {
				local75 = Static123.method4868(Static57.aStringArray6[local37]);
				if (local75 != null && local75.equals(local27)) {
					Static415.method5323(arg0 + Static294.aClass83_17.method2267(Static178.anInt3423));
					return;
				}
			}
		}
		for (@Pc(105) int local105 = 0; local105 < Static413.anInt6823; local105++) {
			local75 = Static123.method4868(Static326.aStringArray27[local105]);
			if (local75 != null && local75.equals(local27)) {
				Static415.method5323(Static368.aClass83_124.method2267(Static178.anInt3423) + arg0 + Static422.aClass83_144.method2267(Static178.anInt3423));
				return;
			}
			if (Static315.aStringArray26[local105] != null) {
				@Pc(152) String local152 = Static123.method4868(Static315.aStringArray26[local105]);
				if (local152 != null && local152.equals(local27)) {
					Static415.method5323(Static368.aClass83_124.method2267(Static178.anInt3423) + arg0 + Static422.aClass83_144.method2267(Static178.anInt3423));
					return;
				}
			}
		}
		if (Static123.method4868(Static1.aClass16_Sub1_Sub5_Sub1_1.aString44).equals(local27)) {
			Static415.method5323(Static18.aClass83_8.method2267(Static178.anInt3423));
		} else {
			Static429.method5476(Static211.aClass215_41);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(arg0));
			Static3.aClass4_Sub12_Sub1_5.method2518(arg0);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IBII)I")
	public static int method3479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static79.aByteArrayArrayArray2[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static79.aByteArrayArrayArray2[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(CI)Z")
	public static boolean method3481(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
