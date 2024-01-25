import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_85 = new Class47(78, 4);

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "[Lclient!nj;")
	public static final Class220[] aClass220Array1 = new Class220[4];

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
	public static int anInt5401 = -1;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIII)V")
	public static void method4669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub16 local10 = (Class6_Sub16) Static1.aClass361_67.method7838(); local10 != null; local10 = (Class6_Sub16) Static1.aClass361_67.method7845()) {
			Static197.method3548(arg2, local10, arg0, arg1, arg3);
		}
		for (@Pc(39) Class6_Sub16 local39 = (Class6_Sub16) Static427.aClass361_54.method7838(); local39 != null; local39 = (Class6_Sub16) Static427.aClass361_54.method7845()) {
			@Pc(43) byte local43 = 1;
			@Pc(48) Class118 local48 = local39.aClass4_Sub1_Sub1_Sub1_1.method5891();
			if (local39.aClass4_Sub1_Sub1_Sub1_1.aBoolean495) {
				local43 = 0;
			} else if (local48.anInt3607 == local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100 || local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100 == local48.anInt3604 || local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100 == local48.anInt3593 || local48.anInt3575 == local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100) {
				local43 = 2;
			} else if (local48.anInt3590 == local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100 || local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100 == local48.anInt3606 || local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100 == local48.anInt3572 || local39.aClass4_Sub1_Sub1_Sub1_1.anInt7100 == local48.anInt3610) {
				local43 = 3;
			}
			if (local39.anInt2203 != local43) {
				@Pc(139) int local139 = Static219.method3785(local39.aClass4_Sub1_Sub1_Sub1_1);
				@Pc(143) Class273 local143 = local39.aClass4_Sub1_Sub1_Sub1_1.aClass273_1;
				if (local143.anIntArray537 != null) {
					local143 = local143.method6159(Static498.aClass101_1);
				}
				if (local143 == null || local139 == -1) {
					local39.anInt2207 = -1;
					local39.aBoolean152 = false;
				} else if (local39.anInt2207 != local139 || local143.aBoolean517 != local39.aBoolean152) {
					if (local39.aClass6_Sub18_Sub1_3 != null) {
						Static374.aClass6_Sub18_Sub4_2.method6380(local39.aClass6_Sub18_Sub1_3);
						local39.aClass6_Sub18_Sub1_3 = null;
					}
					local39.aClass6_Sub22_2 = null;
					local39.aClass6_Sub19_Sub1_2 = null;
					local39.anInt2207 = local139;
					local39.aBoolean152 = local143.aBoolean517;
				}
				local39.anInt2203 = local43;
			}
			local39.anInt2206 = local39.aClass4_Sub1_Sub1_Sub1_1.anInt9542;
			local39.anInt2212 = local39.aClass4_Sub1_Sub1_Sub1_1.anInt9542 + (local39.aClass4_Sub1_Sub1_Sub1_1.method5892() << 8);
			local39.anInt2213 = local39.aClass4_Sub1_Sub1_Sub1_1.anInt9540;
			local39.anInt2211 = local39.aClass4_Sub1_Sub1_Sub1_1.anInt9540 + (local39.aClass4_Sub1_Sub1_Sub1_1.method5892() << 8);
			Static197.method3548(arg2, local39, arg0, arg1, arg3);
		}
		for (@Pc(258) Class6_Sub16 local258 = (Class6_Sub16) Static156.aClass128_12.method3265(); local258 != null; local258 = (Class6_Sub16) Static156.aClass128_12.method3273()) {
			@Pc(262) byte local262 = 1;
			@Pc(267) Class118 local267 = local258.aClass4_Sub1_Sub1_Sub2_1.method5891();
			if (local258.aClass4_Sub1_Sub1_Sub2_1.aBoolean495) {
				local262 = 0;
			} else if (local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100 == local267.anInt3607 || local267.anInt3604 == local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100 || local267.anInt3593 == local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100 || local267.anInt3575 == local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100) {
				local262 = 2;
			} else if (local267.anInt3590 == local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100 || local267.anInt3606 == local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100 || local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100 == local267.anInt3572 || local258.aClass4_Sub1_Sub1_Sub2_1.anInt7100 == local267.anInt3610) {
				local262 = 3;
			}
			if (local258.anInt2203 != local262) {
				@Pc(354) int local354 = Static449.method6351(local258.aClass4_Sub1_Sub1_Sub2_1);
				if (local258.anInt2207 != local354 || local258.aClass4_Sub1_Sub1_Sub2_1.aBoolean497 != local258.aBoolean152) {
					if (local258.aClass6_Sub18_Sub1_3 != null) {
						Static374.aClass6_Sub18_Sub4_2.method6380(local258.aClass6_Sub18_Sub1_3);
						local258.aClass6_Sub18_Sub1_3 = null;
					}
					local258.anInt2207 = local354;
					local258.aClass6_Sub22_2 = null;
					local258.aClass6_Sub19_Sub1_2 = null;
					local258.aBoolean152 = local258.aClass4_Sub1_Sub1_Sub2_1.aBoolean497;
				}
				local258.anInt2203 = local262;
			}
			local258.anInt2206 = local258.aClass4_Sub1_Sub1_Sub2_1.anInt9542;
			local258.anInt2212 = local258.aClass4_Sub1_Sub1_Sub2_1.anInt9542 + (local258.aClass4_Sub1_Sub1_Sub2_1.method5892() << 8);
			local258.anInt2213 = local258.aClass4_Sub1_Sub1_Sub2_1.anInt9540;
			local258.anInt2211 = local258.aClass4_Sub1_Sub1_Sub2_1.anInt9540 + (local258.aClass4_Sub1_Sub1_Sub2_1.method5892() << 8);
			Static197.method3548(arg2, local258, arg0, arg1, arg3);
		}
	}
}
