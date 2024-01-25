import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_78 = new Class73(73, 6);

	@OriginalMember(owner = "client!gr", name = "W", descriptor = "[I")
	public static int[] anIntArray209 = new int[1];

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public static void method3167() {
		if (Static164.aClass178_1 != null) {
			Static509.aClass236_6 = new Class236();
			Static509.aClass236_6.method5506(Static152.aLong215, Static164.aClass178_1.aClass156_62.method4065(Static25.anInt769), Static164.aClass178_1, Static164.aClass178_1.anInt5101);
			Static111.aThread3 = new Thread(Static509.aClass236_6, "");
			Static111.aThread3.start();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BIIIZI)V")
	public static void method3170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static15.aFrame1 != null && (arg0 != 3 || arg4 != Static140.aClass6_Sub48_Sub1_1.anInt9006 || arg2 != Static140.aClass6_Sub48_Sub1_1.anInt8998)) {
			Static449.method6347(Static352.aClass272_2, Static15.aFrame1);
			Static15.aFrame1 = null;
		}
		if (arg0 == 3 && Static15.aFrame1 == null) {
			Static15.aFrame1 = Static497.method6751(Static352.aClass272_2, arg4, arg2, 0);
			if (Static15.aFrame1 != null) {
				Static140.aClass6_Sub48_Sub1_1.anInt8998 = arg2;
				Static140.aClass6_Sub48_Sub1_1.anInt9006 = arg4;
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
			}
		}
		if (arg0 == 3 && Static15.aFrame1 == null) {
			method3170(Static140.aClass6_Sub48_Sub1_1.anInt9003, arg1, -1, true, -1);
			return;
		}
		@Pc(77) Container local77;
		@Pc(94) Insets local94;
		if (Static15.aFrame1 != null) {
			Static1.anInt9404 = arg4;
			Static120.anInt2852 = arg2;
			local77 = Static15.aFrame1;
		} else if (Static547.aFrame2 == null) {
			if (Static249.anApplet1 == null) {
				local77 = Static340.anApplet_Sub1_1;
			} else {
				local77 = Static249.anApplet1;
			}
			Static1.anInt9404 = local77.getSize().width;
			Static120.anInt2852 = local77.getSize().height;
		} else {
			local94 = Static547.aFrame2.getInsets();
			@Pc(100) int local100 = -local94.right;
			Static1.anInt9404 = Static547.aFrame2.getSize().width + local100 - local94.left;
			@Pc(114) int local114 = local94.top + local94.bottom;
			Static120.anInt2852 = Static547.aFrame2.getSize().height - local114;
			local77 = Static547.aFrame2;
		}
		if (arg0 == 1) {
			Static240.anInt4852 = Static592.anInt9585;
			Static543.anInt8951 = (Static1.anInt9404 - Static592.anInt9585) / 2;
			Static309.anInt5674 = 0;
			Static196.anInt4059 = Static579.anInt9514;
		} else {
			Static278.method4564();
		}
		if (Static580.aClass194_7 != Static542.aClass194_5) {
			@Pc(160) boolean local160;
			if (Static240.anInt4852 < 1024 && Static196.anInt4059 < 768) {
				local160 = true;
			} else {
				local160 = false;
			}
		}
		if (arg3) {
			Static483.method6646();
		} else {
			Static32.aCanvas3.setSize(Static240.anInt4852, Static196.anInt4059);
			Static240.aClass14_7.method6823(Static32.aCanvas3);
			if (Static547.aFrame2 == local77) {
				local94 = Static547.aFrame2.getInsets();
				Static32.aCanvas3.setLocation(Static543.anInt8951 + local94.left, local94.top - -Static309.anInt5674);
			} else {
				Static32.aCanvas3.setLocation(Static543.anInt8951, Static309.anInt5674);
			}
		}
		if (arg0 >= 2) {
			Static388.aBoolean466 = true;
		} else {
			Static388.aBoolean466 = false;
		}
		if (Static468.anInt8036 != -1) {
			Static396.method7542(true);
		}
		if (Static563.aClass127_2 != null && Static230.method4063(Static557.anInt9206)) {
			Static180.method3269();
		}
		for (@Pc(224) int local224 = 0; local224 < 100; local224++) {
			Static31.aBooleanArray17[local224] = true;
		}
		Static136.aBoolean218 = true;
	}
}
