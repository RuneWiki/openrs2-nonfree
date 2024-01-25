import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public static int anInt3111;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public static int anInt3115 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lclient!gr;")
	public static Class1_Sub4_Sub11 method2875(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub4_Sub11 local15 = (Class1_Sub4_Sub11) Static105.aClass44_5.method1612((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static341.aClass30_100.method1161(arg0, 5);
		local15 = new Class1_Sub4_Sub11();
		if (local25 != null) {
			local15.method2326(new Class1_Sub7(local25));
		}
		Static105.aClass44_5.method1616((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!uk;III)V")
	public static void method2877(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static275.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5183 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub5_Sub1Array3[arg0.anInt5183++] = Static13.aClass1_Sub5_Sub1Array1[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt5183; local21 < 4; local21++) {
			arg0.aClass1_Sub5_Sub1Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Lclient!th;")
	public static Class196 method2878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class196 local7 = new Class196();
		local7.anInt5901 = arg0 + 5 + 1;
		local7.anInt5919 = arg1 + 5 + 1;
		local7.anInt5923 = -1;
		local7.anInt5905 = -1;
		local7.anIntArrayArray66 = new int[local7.anInt5919][local7.anInt5901];
		local7.method5327();
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
	public static void method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class54 local9 = Static247.aClass54ArrayArray1[arg0][arg1];
		Static122.method1328(local9 == null ? Static346.aClass54_1 : local9, 5000);
	}
}
