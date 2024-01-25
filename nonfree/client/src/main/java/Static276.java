import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
	public static int anInt4862 = 0;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
	public static int anInt4866 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIBI)V")
	public static void method3719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg1 >= Static414.anInt7043 && arg1 + arg0 <= Static198.anInt3778 && Static388.anInt6740 <= arg2 - arg1 && arg1 + arg2 <= Static387.anInt6727) {
			Static263.method3584(arg1, arg0, arg3, arg2);
		} else {
			Static290.method4027(arg0, arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public static void method3720() {
		if (Static269.aFrame1 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static373.aFrame2 == null) {
			local17 = Static89.aClass114_3.anApplet1;
		} else {
			local17 = Static373.aFrame2;
		}
		Static290.anInt5237 = local17.getSize().width;
		Static274.anInt4847 = local17.getSize().height;
		@Pc(36) Insets local36;
		if (local17 == Static373.aFrame2) {
			local36 = Static373.aFrame2.getInsets();
			Static274.anInt4847 -= local36.bottom + local36.top;
			Static290.anInt5237 -= local36.right + local36.left;
		}
		if (Static144.method2104() == 1) {
			Static353.anInt6357 = (Static290.anInt5237 - Static200.anInt3847) / 2;
			Static76.anInt1789 = 0;
			Static349.anInt6303 = Static410.anInt6809;
			Static87.anInt1948 = Static200.anInt3847;
		} else if (Static346.anInt6291 < 96 && Static286.anInt5207 == 0) {
			@Pc(100) int local100 = Static290.anInt5237 > 1024 ? 1024 : Static290.anInt5237;
			Static353.anInt6357 = (Static290.anInt5237 - local100) / 2;
			@Pc(116) int local116 = Static274.anInt4847 > 768 ? 768 : Static274.anInt4847;
			Static87.anInt1948 = local100;
			Static76.anInt1789 = 0;
			Static349.anInt6303 = local116;
		} else {
			Static76.anInt1789 = 0;
			Static349.anInt6303 = Static274.anInt4847;
			Static87.anInt1948 = Static290.anInt5237;
			Static353.anInt6357 = 0;
		}
		if (Static130.aClass239_4 != Static427.aClass239_7) {
			@Pc(132) boolean local132;
			if (Static87.anInt1948 < 1024 && Static349.anInt6303 < 768) {
				local132 = true;
			} else {
				local132 = false;
			}
		}
		Static248.aCanvas5.setSize(Static87.anInt1948, Static349.anInt6303);
		if (Static16.aClass30_11 != null) {
			Static16.aClass30_11.method4650(Static248.aCanvas5);
		}
		if (Static373.aFrame2 == local17) {
			local36 = Static373.aFrame2.getInsets();
			Static248.aCanvas5.setLocation(Static353.anInt6357 + local36.left, local36.top - -Static76.anInt1789);
		} else {
			Static248.aCanvas5.setLocation(Static353.anInt6357, Static76.anInt1789);
		}
		if (Static404.anInt6892 != -1) {
			Static21.method451(true);
		}
		Static244.method3362();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!qa;Lclient!ns;I)V")
	public static void method3722(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class166 arg1) {
		@Pc(10) Class205[] local10 = Static464.method4784(arg1, Static81.anInt1878);
		Static402.aClass3Array4 = new Class3[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static402.aClass3Array4[local16] = arg0.method4656(local10[local16]);
		}
		local10 = Static464.method4784(arg1, Static344.anInt6188);
		Static397.aClass3Array15 = new Class3[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static397.aClass3Array15[local43] = arg0.method4656(local10[local43]);
		}
		local10 = Static464.method4784(arg1, Static220.anInt5565);
		Static332.aClass3Array11 = new Class3[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static332.aClass3Array11[local74] = arg0.method4656(local10[local74]);
		}
		local10 = Static464.method4784(arg1, Static314.anInt5624);
		Static171.aClass3Array8 = new Class3[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static171.aClass3Array8[local105] = arg0.method4656(local10[local105]);
		}
		local10 = Static464.method4784(arg1, Static353.anInt6358);
		Static136.aClass3Array6 = new Class3[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static136.aClass3Array6[local132] = arg0.method4656(local10[local132]);
		}
		local10 = Static464.method4784(arg1, Static34.anInt802);
		Static39.aClass3Array2 = new Class3[local10.length];
		for (@Pc(159) int local159 = 0; local159 < local10.length; local159++) {
			Static39.aClass3Array2[local159] = arg0.method4656(local10[local159]);
		}
		local10 = Static464.method4784(arg1, Static53.anInt1393);
		Static350.aClass3Array12 = new Class3[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static350.aClass3Array12[local186] = arg0.method4656(local10[local186]);
		}
		local10 = Static464.method4784(arg1, Static270.anInt4789);
		Static145.aClass3Array7 = new Class3[local10.length];
		for (@Pc(217) int local217 = 0; local217 < local10.length; local217++) {
			Static145.aClass3Array7[local217] = arg0.method4656(local10[local217]);
		}
		local10 = Static464.method4784(arg1, Static381.anInt6680);
		Static327.aClass3Array10 = new Class3[local10.length];
		for (@Pc(244) int local244 = 0; local244 < local10.length; local244++) {
			Static327.aClass3Array10[local244] = arg0.method4656(local10[local244]);
		}
		local10 = Static464.method4784(arg1, Static339.anInt5970);
		Static134.aClass3Array5 = new Class3[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static134.aClass3Array5[local275] = arg0.method4656(local10[local275]);
		}
		local10 = Static464.method4784(arg1, Static294.anInt5304);
		Static449.aClass3Array17 = new Class3[local10.length];
		for (@Pc(302) int local302 = 0; local302 < local10.length; local302++) {
			Static449.aClass3Array17[local302] = arg0.method4656(local10[local302]);
		}
		local10 = Static464.method4784(arg1, Static160.anInt3011);
		Static352.aClass3Array13 = new Class3[local10.length];
		for (@Pc(329) int local329 = 0; local329 < local10.length; local329++) {
			Static352.aClass3Array13[local329] = arg0.method4656(local10[local329]);
		}
		Static454.aClass3_25 = arg0.method4656(Static464.method4782(arg1, Static403.anInt6876, 0));
		Static241.aClass3_13 = arg0.method4656(Static464.method4782(arg1, Static302.anInt5438, 0));
		local10 = Static464.method4784(arg1, Static278.anInt7280);
		Static356.aClass3Array14 = new Class3[local10.length];
		for (@Pc(376) int local376 = 0; local376 < local10.length; local376++) {
			Static356.aClass3Array14[local376] = arg0.method4656(local10[local376]);
		}
	}
}
