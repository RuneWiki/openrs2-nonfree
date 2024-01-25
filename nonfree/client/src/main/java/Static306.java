import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "Lclient!bca;")
	public static final Class26 aClass26_4 = new Class26("", 17);

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZII)I")
	public static int method4925(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class6_Sub15 local13 = Static519.method7596(arg1, arg0);
		if (local13 == null) {
			return 0;
		} else if (arg2 >= 0 && local13.anIntArray174.length > arg2) {
			return local13.anIntArray174[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZJ)V")
	public static void method4926(@OriginalArg(1) long arg0) {
		if (Static256.aClass224ArrayArrayArray1 != null) {
			if (Static84.anInt1994 == 1 || Static84.anInt1994 == 5) {
				Static31.method1001(arg0);
			} else if (Static84.anInt1994 == 4) {
				Static305.method4921(arg0);
			}
		}
		Static342.method5385((long) Static508.anInt8998, Static323.aClass9_8);
		if (Static6.anInt302 != -1) {
			Static466.method7186(Static6.anInt302);
		}
		for (@Pc(49) int local49 = 0; local49 < Static190.anInt4121; local49++) {
			if (Static429.aBooleanArray27[local49]) {
				Static3.aBooleanArray22[local49] = true;
			}
			Static14.aBooleanArray2[local49] = Static429.aBooleanArray27[local49];
			Static429.aBooleanArray27[local49] = false;
		}
		Static299.anInt5681 = Static508.anInt8998;
		if (Static323.aClass9_8.method5458()) {
			Static459.aBoolean363 = true;
		}
		if (Static6.anInt302 != -1) {
			Static190.anInt4121 = 0;
			Static184.method3594();
		}
		Static323.aClass9_8.F();
		Static6.method500(Static323.aClass9_8);
		@Pc(104) int local104 = Static205.method3805();
		if (local104 == -1) {
			local104 = Static530.anInt9191;
		}
		if (local104 == -1) {
			local104 = Static440.anInt8040;
		}
		Static8.method605(local104);
		Static512.method7261(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351, Static388.anInt7269, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347);
		Static388.anInt7269 = 0;
	}
}
