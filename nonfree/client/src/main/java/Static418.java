import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
	public static int anInt6552 = -1;

	@OriginalMember(owner = "client!ov", name = "I", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
	public static int anInt6556 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!d;BLjava/awt/Canvas;I)Lclient!ha;")
	public static Class95 method5592(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new Class95_Sub2(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "(I)V")
	public static void method5593() {
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub13_2);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub13_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub18_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub18_2);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub4_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub10_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub12_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub16_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub23_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub24_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub25_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub17_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub15_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub6_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub11_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub11_2);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub19_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub9_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub8_1);
		Static238.method3337();
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub5_1);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub7_1);
		Static45.method741();
		Static249.method3418();
		Static555.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BI)I")
	public static int method5598(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
