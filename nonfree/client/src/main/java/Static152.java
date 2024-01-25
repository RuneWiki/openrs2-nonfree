import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "Lclient!rk;")
	public static Class180 aClass180_40;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
	public static int anInt3253 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!rk;Lclient!rk;B)V")
	public static void method2972(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1) {
		Static239.aClass180_61 = arg1;
		Static149.aClass180_39 = arg0;
		Static330.anInt6243 = Static239.aClass180_61.method4553(3);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	public static void method2974() {
		for (@Pc(5) int local5 = 0; local5 < Static85.anInt2209; local5++) {
			@Pc(10) int local10 = Static71.anIntArray241[local5];
			@Pc(14) Class22_Sub2_Sub1_Sub1 local14 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local10];
			@Pc(18) int local18 = Static200.aClass7_Sub3_Sub2_3.method2772();
			if ((local18 & 0x1) != 0) {
				local18 += Static200.aClass7_Sub3_Sub2_3.method2772() << 8;
			}
			Static172.method2487(local14, local18, local10);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
	public static int method2975(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
	public static void method2976() {
		@Pc(5) Class103 local5 = Static325.aClass103_64;
		synchronized (Static325.aClass103_64) {
			Static325.aClass103_64.method2679(5);
		}
		local5 = Static251.aClass103_66;
		synchronized (Static251.aClass103_66) {
			Static251.aClass103_66.method2679(5);
		}
		@Pc(33) Class62 local33 = Static17.aClass62_3;
		synchronized (Static17.aClass62_3) {
			Static17.aClass62_3.method1388();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method2977(@OriginalArg(0) Class180 arg0) {
		Static199.anInt3921 = arg0.method4570("p11_full");
		Static49.anInt1349 = arg0.method4570("p12_full");
		Static233.anInt4630 = arg0.method4570("b12_full");
		Static223.anInt4458 = arg0.method4570("hitmarks");
		Static185.anInt3759 = arg0.method4570("hitbar_default");
		Static144.anInt3127 = arg0.method4570("timerbar_default");
		Static171.anInt3545 = arg0.method4570("headicons_pk");
		Static206.anInt4122 = arg0.method4570("headicons_prayer");
		Static8.anInt156 = arg0.method4570("hint_headicons");
		Static338.anInt6370 = arg0.method4570("hint_mapmarkers");
		Static131.anInt2851 = arg0.method4570("mapflag");
		Static201.anInt4175 = arg0.method4570("cross");
		Static242.anInt3401 = arg0.method4570("mapdots");
		Static303.anInt5804 = arg0.method4570("scrollbar");
		Static218.anInt4349 = arg0.method4570("name_icons");
		Static205.anInt4090 = arg0.method4570("floorshadows");
		Static241.anInt4754 = arg0.method4570("compass");
		Static43.anInt1147 = arg0.method4570("hint_mapedge");
	}
}
