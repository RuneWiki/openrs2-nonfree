import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI)V")
	public static void method5427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(0, 15);
		local8.method1327();
		local8.anInt1437 = arg1;
		local8.anInt1433 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method5429() {
		if (Static254.aFrame32 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static265.aFrame25 == null) {
			local12 = Static159.aClass9_10.anApplet1;
		} else {
			local12 = Static265.aFrame25;
		}
		Static149.anInt3095 = local12.getSize().width;
		Static295.anInt5920 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (local12 == Static265.aFrame25) {
			local31 = Static265.aFrame25.getInsets();
			Static149.anInt3095 -= local31.left + local31.right;
			Static295.anInt5920 -= local31.bottom + local31.top;
		}
		if (Static503.method6935() == 1) {
			Static10.anInt149 = 0;
			Static186.anInt3583 = (Static149.anInt3095 - Static508.anInt8634) / 2;
			Static383.anInt6994 = Static508.anInt8634;
			Static456.anInt7874 = Static495.anInt8489;
		} else if (Static193.anInt3735 < 96 && Static17.anInt459 == 0) {
			@Pc(94) int local94 = Static149.anInt3095 > 1024 ? 1024 : Static149.anInt3095;
			Static383.anInt6994 = local94;
			@Pc(105) int local105 = Static295.anInt5920 <= 768 ? Static295.anInt5920 : 768;
			Static186.anInt3583 = (Static149.anInt3095 - local94) / 2;
			Static456.anInt7874 = local105;
			Static10.anInt149 = 0;
		} else {
			Static186.anInt3583 = 0;
			Static456.anInt7874 = Static295.anInt5920;
			Static383.anInt6994 = Static149.anInt3095;
			Static10.anInt149 = 0;
		}
		if (Static134.aClass199_4 != Static124.aClass199_3) {
			@Pc(128) boolean local128;
			if (Static383.anInt6994 < 1024 && Static456.anInt7874 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static209.aCanvas6.setSize(Static383.anInt6994, Static456.anInt7874);
		if (Static110.aClass62_15 != null) {
			Static110.aClass62_15.method7038(Static209.aCanvas6);
		}
		if (local12 == Static265.aFrame25) {
			local31 = Static265.aFrame25.getInsets();
			Static209.aCanvas6.setLocation(local31.left + Static186.anInt3583, local31.top - -Static10.anInt149);
		} else {
			Static209.aCanvas6.setLocation(Static186.anInt3583, Static10.anInt149);
		}
		if (Static395.anInt7085 != -1) {
			Static92.method1973(true);
		}
		Static275.method4502();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!gp;BLclient!qa;Lclient!gp;)V")
	public static void method5430(@OriginalArg(0) Class117 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class117 arg2) {
		Static291.aClass256_6 = Static242.method4123(Static220.anInt4154, arg0);
		Static121.aClass13_1 = arg1.method7054(Static291.aClass256_6, Static551.method2429(arg2, Static220.anInt4154));
		Static73.aClass256_3 = Static242.method4123(Static357.anInt6718, arg0);
		Static492.aClass13_3 = arg1.method7054(Static73.aClass256_3, Static551.method2429(arg2, Static357.anInt6718));
		Static312.aClass256_7 = Static242.method4123(Static59.anInt1209, arg0);
		Static130.aClass13_2 = arg1.method7054(Static312.aClass256_7, Static551.method2429(arg2, Static59.anInt1209));
	}
}
