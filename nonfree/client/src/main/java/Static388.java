import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!pt", name = "z", descriptor = "Lclient!vf;")
	public static final Class302 aClass302_3 = new Class302();

	@OriginalMember(owner = "client!pt", name = "C", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_111 = new Class45(17, 5);

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_67 = new Class77(44, 3);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BZIIII)V")
	public static void method6140(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static241.aFrame25 != null && (arg2 != 3 || arg1 != Static208.aClass12_Sub10_Sub1_1.anInt2236 || arg4 != Static208.aClass12_Sub10_Sub1_1.anInt2223)) {
			Static540.method7945(Static375.aClass71_3, Static241.aFrame25);
			Static241.aFrame25 = null;
		}
		if (arg2 == 3 && Static241.aFrame25 == null) {
			Static241.aFrame25 = Static55.method1413(arg1, 0, arg4, Static375.aClass71_3);
			if (Static241.aFrame25 != null) {
				Static208.aClass12_Sub10_Sub1_1.anInt2223 = arg4;
				Static208.aClass12_Sub10_Sub1_1.anInt2236 = arg1;
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
			}
		}
		if (arg2 == 3 && Static241.aFrame25 == null) {
			method6140(true, -1, Static208.aClass12_Sub10_Sub1_1.anInt2225, arg3, -1);
			return;
		}
		@Pc(71) Container local71;
		@Pc(95) Insets local95;
		if (Static241.aFrame25 != null) {
			local71 = Static241.aFrame25;
			Static121.anInt2757 = arg4;
			Static352.anInt6601 = arg1;
		} else if (Static308.aFrame17 == null) {
			local71 = Static375.aClass71_3.anApplet1;
			Static352.anInt6601 = local71.getSize().width;
			Static121.anInt2757 = local71.getSize().height;
		} else {
			local95 = Static308.aFrame17.getInsets();
			@Pc(104) int local104 = local95.left + local95.right;
			Static352.anInt6601 = Static308.aFrame17.getSize().width - local104;
			Static121.anInt2757 = Static308.aFrame17.getSize().height - local95.top - local95.bottom;
			local71 = Static308.aFrame17;
		}
		@Pc(154) int local154;
		if (arg2 == 1) {
			Static169.anInt3893 = Static152.anInt3345;
			Static37.anInt7517 = (Static352.anInt6601 - Static152.anInt3345) / 2;
			Static127.anInt2936 = Static82.anInt1959;
			Static193.anInt4312 = 0;
		} else if (Static458.anInt8335 < 96 && Static148.anInt6867 == 0) {
			@Pc(136) int local136 = Static352.anInt6601 > 1024 ? 1024 : Static352.anInt6601;
			Static169.anInt3893 = local136;
			Static37.anInt7517 = (Static352.anInt6601 - local136) / 2;
			local154 = Static121.anInt2757 > 768 ? 768 : Static121.anInt2757;
			Static193.anInt4312 = 0;
			Static127.anInt2936 = local154;
		} else {
			Static193.anInt4312 = 0;
			Static37.anInt7517 = 0;
			Static169.anInt3893 = Static352.anInt6601;
			Static127.anInt2936 = Static121.anInt2757;
		}
		if (Static171.aClass285_4 != Static79.aClass285_2) {
			@Pc(195) boolean local195;
			if (Static169.anInt3893 < 1024 && Static127.anInt2936 < 768) {
				local195 = true;
			} else {
				local195 = false;
			}
		}
		if (arg0) {
			Static417.method7771();
		} else {
			Static301.aCanvas11.setSize(Static169.anInt3893, Static127.anInt2936);
			Static243.aClass42_4.method5799(Static301.aCanvas11);
			if (Static308.aFrame17 == local71) {
				local95 = Static308.aFrame17.getInsets();
				Static301.aCanvas11.setLocation(local95.left + Static37.anInt7517, local95.top - -Static193.anInt4312);
			} else {
				Static301.aCanvas11.setLocation(Static37.anInt7517, Static193.anInt4312);
			}
		}
		if (arg2 < 2) {
			Static173.aBoolean323 = false;
		} else {
			Static173.aBoolean323 = true;
		}
		if (Static406.anInt7660 != -1) {
			Static53.method1407(true);
		}
		if (Static491.aClass277_2 != null && Static224.method6975(Static96.anInt2243)) {
			Static397.method6233();
		}
		for (local154 = 0; local154 < 100; local154++) {
			Static154.aBooleanArray31[local154] = true;
		}
		Static117.aBoolean219 = true;
	}
}
