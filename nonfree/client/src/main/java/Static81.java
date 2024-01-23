import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!ml;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
	public static int[] anIntArray137 = new int[128];

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
	public static int[] anIntArray138 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
	public static int[] anIntArray139 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Z")
	public static boolean aBoolean176 = true;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1670(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(2, arg0);
		local8.method4062();
		local8.aString185 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static void method1671(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static275.anInt5043;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(16) int local16;
		@Pc(32) Class11_Sub4_Sub1 local32;
		@Pc(81) int local81;
		@Pc(181) int local181;
		@Pc(187) int local187;
		@Pc(212) int local212;
		@Pc(221) int local221;
		@Pc(111) int local111;
		for (local16 = 0; local16 < local7; local16++) {
			if (arg0 == 0) {
				local32 = Static138.aClass11_Sub4_Sub1_3;
			} else {
				local32 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local16]];
			}
			if (local32 != null && local32.method3354()) {
				@Pc(47) int local47 = local32.method3347();
				if (arg0 == 0 || arg0 == local47) {
					@Pc(86) int local86;
					if (local47 == 1) {
						if ((local32.anInt3865 & 0x7F) == 64 && (local32.anInt3856 & 0x7F) == 64) {
							local81 = local32.anInt3856 >> 7;
							local86 = local32.anInt3865 >> 7;
							if (local86 >= 0 && local86 < 104 && local81 >= 0 && local81 < 104) {
								local111 = Static287.anIntArrayArray39[local86][local81]++;
							}
						}
					} else if (((local47 & 0x1) != 0 || (local32.anInt3865 & 0x7F) == 0 && (local32.anInt3856 & 0x7F) == 0) && ((local47 & 0x1) != 1 || (local32.anInt3865 & 0x7F) == 64 && (local32.anInt3856 & 0x7F) == 64)) {
						local81 = local32.anInt3856 - local47 * 64 >> 7;
						local86 = local32.anInt3865 - local47 * 64 >> 7;
						local181 = local32.method3347() + local86;
						local187 = local81 + local32.method3347();
						if (local187 > 104) {
							local187 = 104;
						}
						if (local86 < 0) {
							local86 = 0;
						}
						if (local81 < 0) {
							local81 = 0;
						}
						if (local181 > 104) {
							local181 = 104;
						}
						for (local212 = local86; local212 < local181; local212++) {
							for (local221 = local81; local221 < local187; local221++) {
								local111 = Static287.anIntArrayArray39[local212][local221]++;
							}
						}
					}
				}
			}
		}
		label222: for (local16 = 0; local16 < local7; local16++) {
			@Pc(260) long local260;
			if (arg0 == 0) {
				local32 = Static138.aClass11_Sub4_Sub1_3;
				local260 = 8791798054912L;
			} else {
				local32 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local16]];
				local260 = (long) Static135.anIntArray210[local16] << 32;
			}
			if (local32 != null && local32.method3354()) {
				local81 = local32.method3347();
				if (arg0 == 0 || arg0 == local81) {
					local32.aBoolean332 = true;
					local32.aBoolean259 = false;
					if ((Static271.aBoolean476 && Static275.anInt5043 > 200 || Static275.anInt5043 > 50) && arg0 != 0 && local32.anInt3828 == local32.method3348().anInt869) {
						local32.aBoolean259 = true;
					}
					if (local81 == 1) {
						if ((local32.anInt3865 & 0x7F) == 64 && (local32.anInt3856 & 0x7F) == 64) {
							local181 = local32.anInt3865 >> 7;
							local187 = local32.anInt3856 >> 7;
							if (local181 < 0 || local181 >= 104 || local187 < 0 || local187 >= 104) {
								continue;
							}
							if (Static287.anIntArrayArray39[local181][local187] > 1) {
								local111 = Static287.anIntArrayArray39[local181][local187]--;
								continue;
							}
						}
					} else if ((local81 & 0x1) == 0 && (local32.anInt3865 & 0x7F) == 0 && (local32.anInt3856 & 0x7F) == 0 || (local81 & 0x1) == 1 && (local32.anInt3865 & 0x7F) == 64 && (local32.anInt3856 & 0x7F) == 0) {
						local181 = local32.anInt3865 - local81 * 64 >> 7;
						local187 = local32.anInt3856 - local81 * 64 >> 7;
						local212 = local81 + local181;
						local221 = local187 + local81;
						if (local181 < 0) {
							local181 = 0;
						}
						if (local212 > 104) {
							local212 = 104;
						}
						if (local187 < 0) {
							local187 = 0;
						}
						if (local221 > 104) {
							local221 = 104;
						}
						@Pc(417) boolean local417 = true;
						@Pc(419) int local419;
						@Pc(424) int local424;
						for (local419 = local181; local419 < local212; local419++) {
							for (local424 = local187; local424 < local221; local424++) {
								if (Static287.anIntArrayArray39[local419][local424] <= 1) {
									local417 = false;
									break;
								}
							}
						}
						if (local417) {
							local419 = local181;
							while (true) {
								if (local419 >= local212) {
									continue label222;
								}
								for (local424 = local187; local424 < local221; local424++) {
									local111 = Static287.anIntArrayArray39[local419][local424]--;
								}
								local419++;
							}
						}
					}
					if (local32.anObject5 == null || local32.anInt3785 > Static167.anInt637 || Static167.anInt637 >= local32.anInt3841) {
						local32.aBoolean332 = false;
						local32.anInt3839 = Static42.method768(local32.anInt3865, Static132.anInt2608, local32.anInt3856);
						Static168.method2837(Static132.anInt2608, local32.anInt3865, local32.anInt3856, local32.anInt3839, local81 * 64 + 60 - 64, local32, local32.anInt3852, local260, local32.aBoolean338);
					} else {
						local32.aBoolean332 = false;
						local32.aBoolean259 = false;
						local32.anInt3839 = Static42.method768(local32.anInt3865, Static132.anInt2608, local32.anInt3856);
						Static297.method4442(Static132.anInt2608, local32.anInt3865, local32.anInt3856, local32.anInt3839, local32, local32.anInt3852, local260, local32.anInt3823, local32.anInt3811, local32.anInt3862, local32.anInt3845);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ro;Z)V")
	public static void method1673(@OriginalArg(0) Class1_Sub7 arg0) {
		if (arg0.aClass1_Sub23_5 != null) {
			arg0.aClass1_Sub23_5.anInt4000 = 0;
		}
		arg0.aBoolean393 = false;
		for (@Pc(20) Class1_Sub7 local20 = arg0.method3724(); local20 != null; local20 = arg0.method3722()) {
			method1673(local20);
		}
	}
}
