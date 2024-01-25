import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
	public static int anInt9568;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!kh;ILclient!ha;)V")
	public static void method8092(@OriginalArg(0) Class208 arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(31) boolean local31 = Static237.aClass371_2.method8306(arg0.anInt5645, arg0.anInt5665 | 0xFF000000, arg0.anInt5606, arg0.anInt5605, arg1, arg0.aBoolean433 ? Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 : null, arg0.anInt5612) == null;
		if (local31) {
			Static51.aClass193_6.method4462(new Class3_Sub42(arg0.anInt5645, arg0.anInt5605, arg0.anInt5612, arg0.anInt5665 | 0xFF000000, arg0.anInt5606, arg0.aBoolean433));
			Static374.method5525(arg0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
	public static int method8094(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V")
	public static void method8095() {
		Static428.aClass279_39.method6630(50);
		Static81.aClass279_9.method6630(50);
		Static384.aClass279_3.method6630(50);
		Static268.aClass279_27.method6630(50);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)I")
	public static int method8096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static518.method7342(arg0 + 45365, arg1 + 91923, 4) + (Static518.method7342(arg0 + 10294, arg1 + 37821, 2) + -128 >> 1) + (Static518.method7342(arg0, arg1, 1) + -128 >> 2) - 128;
		local49 = (int) ((double) local49 * 0.3D) + 35;
		if (local49 < 10) {
			local49 = 10;
		} else if (local49 > 60) {
			local49 = 60;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public static void method8097() {
		Static344.anInt6196 = 0;
		Static76.anInt1726++;
		Static9.anInt110 = 0;
		Static22.method747();
		Static461.method6627();
		Static172.method2909();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static9.anInt110; local23++) {
			local29 = Static238.anIntArray290[local23];
			@Pc(36) Class3_Sub11 local36 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local29);
			@Pc(39) Class23_Sub2_Sub1_Sub2_Sub2 local39 = local36.aClass23_Sub2_Sub1_Sub2_Sub2_1;
			if (Static463.aBoolean600 && Static399.method4482(local29)) {
				Static376.method5544();
			}
			if (Static76.anInt1726 != local39.anInt10155) {
				if (local39.aClass5_1.method61()) {
					Static360.method5393(local39);
				}
				local39.method8636((Class5) null);
				local21 = true;
				local36.method8770();
			}
		}
		if (local21) {
			Static609.anInt6433 = Static500.aClass62_40.method1688();
			Static500.aClass62_40.method1687(Static43.aClass3_Sub11Array1);
		}
		if (Static67.aClass3_Sub17_Sub2_4.lb != Static548.anInt8905) {
			throw new RuntimeException("gnp1 pos:" + Static67.aClass3_Sub17_Sub2_4.lb + " psize:" + Static548.anInt8905);
		}
		for (local29 = 0; local29 < Static308.anInt5687; local29++) {
			if (Static500.aClass62_40.method1682((long) Static390.anIntArray424[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static308.anInt5687);
			}
		}
		if (Static609.anInt6433 - Static308.anInt5687 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static609.anInt6433 - Static308.anInt5687));
		}
		for (@Pc(171) int local171 = 0; local171 < Static609.anInt6433; local171++) {
			if (Static43.aClass3_Sub11Array1[local171].aClass23_Sub2_Sub1_Sub2_Sub2_1.anInt10155 != Static76.anInt1726) {
				throw new RuntimeException("gnp4 uk:" + Static43.aClass3_Sub11Array1[local171].aClass23_Sub2_Sub1_Sub2_Sub2_1.anInt10180);
			}
		}
	}
}
