import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
	public static final int[] anIntArray532 = new int[25];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[8];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIILclient!cu;Lclient!kda;)V")
	public static void method7827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class60 arg9, @OriginalArg(11) Class173 arg10) {
		Static317.anInt9286 = arg8;
		Static615.anInt10352 = arg0;
		Static518.anInt9046 = arg3;
		Static8.aClass173_3 = arg10;
		Static304.anInt6063 = arg1;
		Static169.aClass111_1 = null;
		Class15_Sub1_Sub2_Sub1.lb = arg7;
		Static365.aClass111_4 = null;
		Static307.anInt6236 = arg2;
		Static614.aClass111_3 = null;
		Static637.anInt10651 = arg6;
		Static346.anInt6722 = arg4;
		Static391.anInt7561 = arg5;
		Static180.aClass60_3 = arg9;
		Static8.method90();
		Static559.aBoolean618 = true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB[Lclient!tp;)V")
	public static void method7828(@OriginalArg(0) int arg0, @OriginalArg(2) Class331[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class331 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt9509 && !Static73.method1927(local13)) {
				if (local13.anInt9490 == 0) {
					method7828(local13.anInt9578, arg1);
					if (local13.aClass331Array2 != null) {
						method7828(local13.anInt9578, local13.aClass331Array2);
					}
					@Pc(51) Class8_Sub51 local51 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local13.anInt9578);
					if (local51 != null) {
						Static414.method6511(local51.anInt10454);
					}
				}
				if (local13.anInt9490 == 6 && local13.anInt9579 != -1) {
					@Pc(74) Class97 local74 = Static28.aClass220_1.method5670(local13.anInt9579);
					if (local74 != null) {
						local13.anInt9538 += Static77.anInt2367;
						@Pc(85) int local85 = local13.anInt9493;
						while (local13.anInt9538 > local74.anIntArray180[local13.anInt9493]) {
							local13.anInt9538 -= local74.anIntArray180[local13.anInt9493];
							local13.anInt9493++;
							if (local74.anIntArray182.length <= local13.anInt9493) {
								local13.anInt9493 -= local74.anInt3609;
								if (local13.anInt9493 < 0 || local13.anInt9493 >= local74.anIntArray182.length) {
									local13.anInt9493 = 0;
								}
							}
							local13.anInt9573 = local13.anInt9493 + 1;
							if (local74.anIntArray182.length <= local13.anInt9573) {
								local13.anInt9573 -= local74.anInt3609;
								if (local13.anInt9573 < 0 || local74.anIntArray182.length <= local13.anInt9573) {
									local13.anInt9573 = -1;
								}
							}
							Static86.method2113(local13);
						}
						if (local85 != local13.anInt9493) {
							Static168.method3340(local74, local13.anInt9493);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I")
	public static int method7829() {
		if (Static211.aBoolean370) {
			return 6;
		} else if (Static193.aClass8_Sub5_Sub7_1 == null) {
			return 0;
		} else {
			@Pc(18) int local18 = Static193.aClass8_Sub5_Sub7_1.anInt3779;
			if (Static16.method765(local18)) {
				return 1;
			} else if (Static529.method7476(local18)) {
				return 2;
			} else if (Static85.method7007(local18)) {
				return 3;
			} else if (Static95.method2218(local18)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method7830(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static34.aClass86Array5 != Static253.aClass86Array4) {
			@Pc(12) int local12 = Static86.aClass86Array2[arg1].method8088(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class86 local19 = Static86.aClass86Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8088(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method8084(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
