import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "Lclient!tk;")
	public static Class159 aClass159_13;

	@OriginalMember(owner = "client!ml", name = "W", descriptor = "Lclient!wn;")
	public static Class182 aClass182_13 = new Class182();

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
	public static void method2604() {
		Static28.aClass61_4.method1378();
		Static187.aClass61_32.method1378();
		Static240.aClass61_46.method1378();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
	public static void method2605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class8_Sub12 local12;
		for (local12 = (Class8_Sub12) Static52.aClass182_5.method4319(); local12 != null; local12 = (Class8_Sub12) Static52.aClass182_5.method4329()) {
			Static249.method3692(arg1, arg0, local12, arg2, arg3);
		}
		@Pc(43) byte local43;
		@Pc(48) Class12 local48;
		@Pc(134) int local134;
		for (local12 = (Class8_Sub12) Static191.aClass182_24.method4319(); local12 != null; local12 = (Class8_Sub12) Static191.aClass182_24.method4329()) {
			local43 = 1;
			local48 = local12.aClass36_Sub3_Sub2_1.method3105();
			if (local48.anInt423 == local12.aClass36_Sub3_Sub2_1.anInt4067) {
				local43 = 0;
			} else if (local48.anInt421 == local12.aClass36_Sub3_Sub2_1.anInt4067 || local12.aClass36_Sub3_Sub2_1.anInt4067 == local48.anInt399 || local48.anInt413 == local12.aClass36_Sub3_Sub2_1.anInt4067 || local12.aClass36_Sub3_Sub2_1.anInt4067 == local48.anInt397) {
				local43 = 2;
			} else if (local12.aClass36_Sub3_Sub2_1.anInt4067 == local48.anInt408 || local48.anInt386 == local12.aClass36_Sub3_Sub2_1.anInt4067 || local48.anInt416 == local12.aClass36_Sub3_Sub2_1.anInt4067 || local48.anInt394 == local12.aClass36_Sub3_Sub2_1.anInt4067) {
				local43 = 3;
			}
			if (local43 != local12.anInt2182) {
				local134 = Static151.method3108(local12.aClass36_Sub3_Sub2_1);
				if (local134 != local12.anInt2196) {
					if (local12.aClass8_Sub8_Sub4_3 != null) {
						Static84.aClass8_Sub8_Sub1_1.method837(local12.aClass8_Sub8_Sub4_3);
						local12.aClass8_Sub8_Sub4_3 = null;
					}
					local12.anInt2196 = local134;
				}
				local12.anInt2182 = local43;
			}
			local12.anInt2180 = local12.aClass36_Sub3_Sub2_1.anInt4117;
			local12.anInt2195 = local12.aClass36_Sub3_Sub2_1.anInt4117 + local12.aClass36_Sub3_Sub2_1.method3110() * 64;
			local12.anInt2193 = local12.aClass36_Sub3_Sub2_1.anInt4118;
			local12.anInt2189 = local12.aClass36_Sub3_Sub2_1.anInt4118 + local12.aClass36_Sub3_Sub2_1.method3110() * 64;
			Static249.method3692(arg1, arg0, local12, arg2, arg3);
		}
		for (local12 = (Class8_Sub12) Static247.aClass129_29.method3035(); local12 != null; local12 = (Class8_Sub12) Static247.aClass129_29.method3048()) {
			local43 = 1;
			local48 = local12.aClass36_Sub3_Sub1_2.method3105();
			if (local48.anInt423 == local12.aClass36_Sub3_Sub1_2.anInt4067) {
				local43 = 0;
			} else if (local48.anInt421 == local12.aClass36_Sub3_Sub1_2.anInt4067 || local48.anInt399 == local12.aClass36_Sub3_Sub1_2.anInt4067 || local12.aClass36_Sub3_Sub1_2.anInt4067 == local48.anInt413 || local48.anInt397 == local12.aClass36_Sub3_Sub1_2.anInt4067) {
				local43 = 2;
			} else if (local48.anInt408 == local12.aClass36_Sub3_Sub1_2.anInt4067 || local12.aClass36_Sub3_Sub1_2.anInt4067 == local48.anInt386 || local12.aClass36_Sub3_Sub1_2.anInt4067 == local48.anInt416 || local12.aClass36_Sub3_Sub1_2.anInt4067 == local48.anInt394) {
				local43 = 3;
			}
			if (local43 != local12.anInt2182) {
				local134 = Static298.method256(local12.aClass36_Sub3_Sub1_2);
				if (local134 != local12.anInt2196) {
					if (local12.aClass8_Sub8_Sub4_3 != null) {
						Static84.aClass8_Sub8_Sub1_1.method837(local12.aClass8_Sub8_Sub4_3);
						local12.aClass8_Sub8_Sub4_3 = null;
					}
					local12.anInt2196 = local134;
				}
				local12.anInt2182 = local43;
			}
			local12.anInt2180 = local12.aClass36_Sub3_Sub1_2.anInt4117;
			local12.anInt2195 = local12.aClass36_Sub3_Sub1_2.anInt4117 + local12.aClass36_Sub3_Sub1_2.method3110() * 64;
			local12.anInt2193 = local12.aClass36_Sub3_Sub1_2.anInt4118;
			local12.anInt2189 = local12.aClass36_Sub3_Sub1_2.anInt4118 + local12.aClass36_Sub3_Sub1_2.method3110() * 64;
			Static249.method3692(arg1, arg0, local12, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public static void method2607(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && Static136.aBooleanArray9.length > arg0) {
			Static136.aBooleanArray9[arg0] = !Static136.aBooleanArray9[arg0];
		}
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V")
	public static void method2608() {
		Static87.aClass61_15.method1378();
		Static219.aClass61_40.method1378();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)I")
	public static int method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
