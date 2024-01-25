import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[Lclient!fm;")
	public static Class103[] aClass103Array2;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt3987;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Z")
	public static boolean aBoolean324 = true;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBIIIIII)Z")
	public static boolean method3493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg1 + arg4 && arg4 < arg0 + arg6) {
			return arg7 + arg5 > arg2 && arg3 + arg2 > arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method3494() {
		if (Static241.aFrame25 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static308.aFrame17 == null) {
			local12 = Static375.aClass71_3.anApplet1;
		} else {
			local12 = Static308.aFrame17;
		}
		Static352.anInt6601 = local12.getSize().width;
		Static121.anInt2757 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (local12 == Static308.aFrame17) {
			local31 = Static308.aFrame17.getInsets();
			Static352.anInt6601 -= local31.left + local31.right;
			Static121.anInt2757 -= local31.bottom + local31.top;
		}
		if (Static256.method4386() == 1) {
			Static193.anInt4312 = 0;
			Static169.anInt3893 = Static152.anInt3345;
			Static37.anInt7517 = (Static352.anInt6601 - Static152.anInt3345) / 2;
			Static127.anInt2936 = Static82.anInt1959;
		} else if (Static458.anInt8335 < 96 && Static148.anInt6867 == 0) {
			@Pc(81) int local81 = Static352.anInt6601 > 1024 ? 1024 : Static352.anInt6601;
			@Pc(90) int local90 = Static121.anInt2757 <= 768 ? Static121.anInt2757 : 768;
			Static169.anInt3893 = local81;
			Static37.anInt7517 = (Static352.anInt6601 - local81) / 2;
			Static193.anInt4312 = 0;
			Static127.anInt2936 = local90;
		} else {
			Static193.anInt4312 = 0;
			Static127.anInt2936 = Static121.anInt2757;
			Static169.anInt3893 = Static352.anInt6601;
			Static37.anInt7517 = 0;
		}
		if (Static79.aClass285_2 != Static171.aClass285_4) {
			@Pc(130) boolean local130;
			if (Static169.anInt3893 < 1024 && Static127.anInt2936 < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		Static301.aCanvas11.setSize(Static169.anInt3893, Static127.anInt2936);
		if (Static243.aClass42_4 != null) {
			Static243.aClass42_4.method5799(Static301.aCanvas11);
		}
		if (local12 == Static308.aFrame17) {
			local31 = Static308.aFrame17.getInsets();
			Static301.aCanvas11.setLocation(Static37.anInt7517 + local31.left, Static193.anInt4312 + local31.top);
		} else {
			Static301.aCanvas11.setLocation(Static37.anInt7517, Static193.anInt4312);
		}
		if (Static406.anInt7660 != -1) {
			Static53.method1407(true);
		}
		Static357.method5572();
	}
}
