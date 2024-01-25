import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	public static int anInt5187;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_40 = new Class126(64);

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_80 = new Class217(33, 7);

	@OriginalMember(owner = "client!od", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public static int anInt5188 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!cu;I)V")
	public static void method4038(@OriginalArg(0) Class3_Sub7 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static181.anInt3617; local1++) {
			@Pc(11) int local11 = arg0.method2638();
			@Pc(15) int local15 = arg0.method2588();
			if (local15 == 65535) {
				local15 = -1;
			}
			if (Static292.aClass117_Sub1Array4[local11] != null) {
				Static292.aClass117_Sub1Array4[local11].anInt7353 = local15;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	public static void method4041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class7_Sub3 local13 = local7.aClass7_Sub3_3;
		@Pc(16) Class7_Sub3 local16 = local7.aClass7_Sub3_2;
		if (local13 != null) {
			local13.anInt3664 = local13.anInt3664 * arg3 / (0x10 << Static336.anInt5747 - 7);
			local13.anInt3660 = local13.anInt3660 * arg3 / (0x10 << Static336.anInt5747 - 7);
		}
		if (local16 != null) {
			local16.anInt3664 = local16.anInt3664 * arg3 / (0x10 << Static336.anInt5747 - 7);
			local16.anInt3660 = local16.anInt3660 * arg3 / (0x10 << Static336.anInt5747 - 7);
		}
	}
}
