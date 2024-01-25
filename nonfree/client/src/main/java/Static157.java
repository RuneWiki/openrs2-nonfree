import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gba", name = "m", descriptor = "Lclient!jn;")
	public static Class176 aClass176_43;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2909(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static590.aClass364_37.method8334(Static154.anInt3181) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static590.aClass364_39.method8334(Static154.anInt3181) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method2911(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		for (@Pc(40) int local40 = arg0 / 10; local40 != 0; local40 /= 10) {
			local36++;
		}
		@Pc(52) char[] local52 = new char[local36];
		local52[0] = '+';
		for (@Pc(65) int local65 = local36 - 1; local65 > 0; local65--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local69 - arg0 * 10;
			if (local80 >= 10) {
				local52[local65] = (char) (local80 + 87);
			} else {
				local52[local65] = (char) (local80 + 48);
			}
		}
		return new String(local52);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
	public static void method2912() {
		Static537.aBoolean647 = true;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V")
	public static void method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class1_Sub4_Sub1 local13 = local7.aClass1_Sub4_Sub1_2;
		@Pc(16) Class1_Sub4_Sub1 local16 = local7.aClass1_Sub4_Sub1_1;
		if (local13 != null) {
			local13.aShort86 = (short) (local13.aShort86 * arg3 / (0x10 << Static145.anInt3093 - 7));
			local13.aShort87 = (short) (local13.aShort87 * arg3 / (0x10 << Static145.anInt3093 - 7));
		}
		if (local16 != null) {
			local16.aShort86 = (short) (local16.aShort86 * arg3 / (0x10 << Static145.anInt3093 - 7));
			local16.aShort87 = (short) (local16.aShort87 * arg3 / (0x10 << Static145.anInt3093 - 7));
		}
	}
}
