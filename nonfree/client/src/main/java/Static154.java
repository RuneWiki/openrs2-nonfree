import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fba", name = "M", descriptor = "Lclient!aj;")
	public static Class15 aClass15_42;

	@OriginalMember(owner = "client!fba", name = "N", descriptor = "Z")
	public static boolean aBoolean234;

	@OriginalMember(owner = "client!fba", name = "O", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!fba", name = "P", descriptor = "I")
	public static int anInt3055;

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_4 = new Class228(6, 0, 4, 2);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIII)V")
	public static void method2813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static287.anInt4910 + arg2;
		@Pc(13) int local13 = arg0 + Static72.anInt1361;
		if (Static15.aClass164ArrayArrayArray5 == null || arg2 < 0 || arg0 < 0 || arg2 >= Static158.anInt927 || arg0 >= Static515.anInt8292 || Static24.aClass3_Sub22_4.lb.method7116() == 0 && arg1 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174) {
			return;
		}
		@Pc(62) long local62 = (long) (local9 | arg1 << 28 | local13 << 14);
		@Pc(68) Class3_Sub16 local68 = (Class3_Sub16) Static98.aClass83_6.method2368(local62);
		if (local68 == null) {
			Static127.method2386(arg1, arg2, arg0);
			return;
		}
		@Pc(82) Class3_Sub27 local82 = (Class3_Sub27) local68.aClass338_44.method8177();
		if (local82 == null) {
			Static127.method2386(arg1, arg2, arg0);
			return;
		}
		@Pc(96) Class28_Sub1_Sub5_Sub1 local96 = (Class28_Sub1_Sub5_Sub1) Static127.method2386(arg1, arg2, arg0);
		if (local96 == null) {
			local96 = new Class28_Sub1_Sub5_Sub1(arg2 << 9, Static121.aClass21Array2[arg1].method7973(arg2, arg0), arg0 << 9, arg1, arg1);
		} else {
			local96.anInt7918 = local96.anInt7927 = -1;
		}
		local96.anInt7920 = local82.anInt3843;
		local96.anInt7916 = local82.anInt3845;
		label56: while (true) {
			@Pc(139) Class3_Sub27 local139 = (Class3_Sub27) local68.aClass338_44.method8168();
			if (local139 == null) {
				break;
			}
			if (local96.anInt7920 != local139.anInt3843) {
				local96.anInt7922 = local139.anInt3845;
				local96.anInt7918 = local139.anInt3843;
				while (true) {
					@Pc(160) Class3_Sub27 local160 = (Class3_Sub27) local68.aClass338_44.method8168();
					if (local160 == null) {
						break label56;
					}
					if (local96.anInt7920 != local160.anInt3843 && local96.anInt7918 != local160.anInt3843) {
						local96.anInt7924 = local160.anInt3845;
						local96.anInt7927 = local160.anInt3843;
					}
				}
			}
		}
		@Pc(204) int local204 = Static168.method3058(arg1, (arg2 << 9) + 256, (arg0 << 9) - -256);
		local96.anInt10731 = arg0 << 9;
		local96.anInt7929 = 0;
		local96.aByte173 = (byte) arg1;
		local96.anInt10729 = arg2 << 9;
		local96.aByte174 = (byte) arg1;
		local96.anInt10722 = local204;
		if (Static488.method7052(arg2, arg0)) {
			local96.aByte173++;
		}
		Static469.method6800(arg1, arg2, arg0, local204, local96);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(JJ)J")
	public static long method2815(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BII)Z")
	public static boolean method2816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(III)Z")
	public static boolean method2818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static623.method8759(arg0, arg1) | (arg1 & 0x70000) != 0 || Static94.method1709(arg1, arg0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIBIII)V")
	public static void method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg0 + 1;
		Static483.method7014(Static392.anIntArrayArray39[arg0], arg1, arg2, arg3);
		@Pc(15) int local15 = arg4 - 1;
		Static483.method7014(Static392.anIntArrayArray39[arg4], arg1, arg2, arg3);
		for (@Pc(23) int local23 = local6; local23 <= local15; local23++) {
			@Pc(31) int[] local31 = Static392.anIntArrayArray39[local23];
			local31[arg1] = local31[arg2] = arg3;
		}
	}
}
