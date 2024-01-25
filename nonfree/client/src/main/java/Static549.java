import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z")
	public static boolean method6482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method6483() {
		for (@Pc(10) Class1_Sub20 local10 = (Class1_Sub20) Static27.aClass353_3.method7677(); local10 != null; local10 = (Class1_Sub20) Static27.aClass353_3.method7687()) {
			if (local10.anInt2945 > 0) {
				local10.anInt2945--;
			}
			if (local10.anInt2945 != 0) {
				if (local10.anInt2956 > 0) {
					local10.anInt2956--;
				}
				if (local10.anInt2956 == 0 && local10.anInt2953 >= 1 && local10.anInt2957 >= 1 && local10.anInt2953 <= Static71.anInt1410 - 2 && local10.anInt2957 <= Static471.anInt8012 - 2 && (local10.anInt2952 < 0 || Static190.method2924(local10.anInt2952, local10.anInt2944))) {
					Static484.method6553(local10.anInt2957, local10.anInt2944, local10.anInt2942, -1, local10.anInt2953, local10.anInt2952, local10.anInt2955, local10.anInt2946);
					local10.anInt2956 = -1;
					if (local10.anInt2952 == local10.anInt2949 && local10.anInt2949 == -1) {
						local10.method7859();
					} else if (local10.anInt2949 == local10.anInt2952 && local10.anInt2946 == local10.anInt2941 && local10.anInt2943 == local10.anInt2944) {
						local10.method7859();
					}
				}
			} else if (local10.anInt2949 < 0 || Static190.method2924(local10.anInt2949, local10.anInt2943)) {
				Static484.method6553(local10.anInt2957, local10.anInt2943, local10.anInt2942, -1, local10.anInt2953, local10.anInt2949, local10.anInt2955, local10.anInt2941);
				local10.method7859();
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;[BB)I")
	public static int method6484(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = arg0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg1.charAt(local20);
			if (local26 <= '\u007f') {
				arg2[local10++] = (byte) local26;
			} else if (local26 > '\u07ff') {
				arg2[local10++] = (byte) (local26 >> 12 | 0xE0);
				arg2[local10++] = (byte) (local26 >> 6 & 0x3F | 0x80);
				arg2[local10++] = (byte) (local26 & 0x3F | 0x80);
			} else {
				arg2[local10++] = (byte) (local26 >> 6 | 0xC0);
				arg2[local10++] = (byte) (local26 & 0x3F | 0x80);
			}
		}
		return local10 - arg0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	public static void method6486() {
		if (Static216.anInt4135 == 9) {
			Static426.method5887(5);
		} else if (Static216.anInt4135 == 5 || Static216.anInt4135 == 6) {
			Static426.method5887(3);
		} else if (Static216.anInt4135 == 12) {
			Static426.method5887(3);
		}
	}
}
