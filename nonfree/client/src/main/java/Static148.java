import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fca", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!fca", name = "G", descriptor = "[B")
	public static final byte[] aByteArray34 = new byte[2048];

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2222(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg0[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(41) int local41 = arg2; local41 < local32; local41++) {
				@Pc(47) String local47 = arg0[local41];
				if (local47 == null) {
					local34 += 4;
				} else {
					local34 += local47.length();
				}
			}
			@Pc(66) StringBuffer local66 = new StringBuffer(local34);
			for (@Pc(68) int local68 = arg2; local68 < local32; local68++) {
				@Pc(74) String local74 = arg0[local68];
				if (local74 == null) {
					local66.append("null");
				} else {
					local66.append(local74);
				}
			}
			return local66.toString();
		}
	}

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "(I)V")
	public static void method2226() {
		while (true) {
			if (Static53.aClass2_Sub22_Sub2_1.method8562(Static84.anInt1498) >= 15) {
				@Pc(25) int local25 = Static53.aClass2_Sub22_Sub2_1.method8569(15);
				if (local25 != 32767) {
					@Pc(32) boolean local32 = false;
					@Pc(39) Class2_Sub43 local39 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
					@Pc(45) Class13_Sub1_Sub1_Sub1_Sub1 local45;
					if (local39 == null) {
						local45 = new Class13_Sub1_Sub1_Sub1_Sub1();
						local45.anInt4582 = local25;
						local39 = new Class2_Sub43(local45);
						Static440.aClass118_41.method2601(local39, (long) local25);
						Static38.aClass2_Sub43Array1[Static645.anInt9916++] = local39;
						local32 = true;
					}
					local45 = local39.aClass13_Sub1_Sub1_Sub1_Sub1_2;
					Static147.anIntArray182[Static639.anInt10306++] = local25;
					local45.anInt4601 = Static205.anInt6320;
					if (local45.aClass150_1 != null && local45.aClass150_1.method3197()) {
						Static475.method6410(local45);
					}
					@Pc(99) int local99 = Static53.aClass2_Sub22_Sub2_1.method8569(2);
					@Pc(104) int local104 = Static53.aClass2_Sub22_Sub2_1.method8569(1);
					@Pc(109) int local109 = Static53.aClass2_Sub22_Sub2_1.method8569(1);
					if (local109 == 1) {
						Static75.anIntArray108[Static140.anInt2578++] = local25;
					}
					@Pc(127) int local127 = Static53.aClass2_Sub22_Sub2_1.method8569(5);
					if (local127 > 15) {
						local127 -= 32;
					}
					@Pc(144) int local144 = (Static53.aClass2_Sub22_Sub2_1.method8569(3) + 4 & 0x64400007) << 11;
					@Pc(149) int local149 = Static53.aClass2_Sub22_Sub2_1.method8569(5);
					if (local149 > 15) {
						local149 -= 32;
					}
					local45.method405(Static409.aClass107_2.method2291(Static53.aClass2_Sub22_Sub2_1.method8569(14)));
					local45.method3955(local45.aClass150_1.anInt3793);
					local45.anInt4563 = local45.aClass150_1.anInt3800 << 3;
					if (local32) {
						local45.method3952(local144, true);
					}
					local45.method398(local99, local104 == 1, local45.method3950(), Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] + local149, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0] + local127);
					if (local45.aClass150_1.method3197()) {
						Static222.method3036(local45.anIntArray306[0], null, local45.aByte127, local45, local45.anIntArray307[0], 0, null);
					}
					continue;
				}
			}
			Static53.aClass2_Sub22_Sub2_1.method8560();
			return;
		}
	}
}
