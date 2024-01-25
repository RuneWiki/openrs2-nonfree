import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard2;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
	public static int anInt5296;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!ug;")
	public static Class51 aClass51_6;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)V")
	public static void method4559(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static199.anInt4137 - Static354.anInt6741;
		if (local8 >= 100) {
			Static353.anInt2640 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static77.aFloat23;
		if (Static114.anInt2732 >> 8 > local23) {
			local23 = Static114.anInt2732 >> 8;
		}
		if (Static298.aBooleanArray26[4] && local23 < Static305.anIntArray512[4] + 128) {
			local23 = Static305.anIntArray512[4] + 128;
		}
		@Pc(65) int local65 = (int) Static106.aFloat31 + Static70.anInt1840 & 0x3FFF;
		Static168.method5619(Static354.anInt6740, arg0, local65, local23, Static193.anInt4286, Static81.method2010(Static12.anInt267, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701) - 50, (local23 >> 3) * 3 + 600);
		@Pc(108) float local108 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static337.anInt6445 = (int) ((float) Static173.anInt3688 + local108 * (float) (Static337.anInt6445 - Static173.anInt3688));
		Static240.anInt4829 = (int) ((float) Static29.anInt636 + local108 * (float) (Static240.anInt4829 - Static29.anInt636));
		Static129.anInt3039 = (int) ((float) Static25.anInt538 + (float) (Static129.anInt3039 - Static25.anInt538) * local108);
		Static112.anInt2705 = (int) ((float) Static356.anInt6792 + (float) (Static112.anInt2705 - Static356.anInt6792) * local108);
		@Pc(158) int local158 = Static217.anInt4437 - Static104.anInt2631;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static217.anInt4437 = (int) ((float) Static104.anInt2631 + local108 * (float) local158);
		Static217.anInt4437 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I")
	public static int method4560(@OriginalArg(1) int arg0) {
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
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}
}
