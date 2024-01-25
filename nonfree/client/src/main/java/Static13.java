import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	public static int anInt137;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "[I")
	public static final int[] anIntArray19 = new int[4];

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	public static int anInt138 = -1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;B[BI)I")
	public static int method190(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static90.method8848(arg0.charAt(local12));
			@Pc(39) int local39 = local10 <= local12 + 1 ? -1 : Static90.method8848(arg0.charAt(local12 + 1));
			@Pc(58) int local58 = local12 + 2 < local10 ? Static90.method8848(arg0.charAt(local12 + 2)) : -1;
			@Pc(73) int local73 = local12 + 3 < local10 ? Static90.method8848(arg0.charAt(local12 + 3)) : -1;
			arg1[arg2++] = (byte) (local20 << 2 | local39 >>> 4);
			if (local58 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local58 >>> 2 | (local39 & 0xF) << 4);
			if (local73 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local73 | (local58 & 0x3) << 6);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method192() {
		for (@Pc(7) int local7 = 0; local7 < Static90.aByteArrayArrayArray25.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static90.aByteArrayArrayArray25[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static90.aByteArrayArrayArray25[0][0].length; local15++) {
					Static90.aByteArrayArrayArray25[local7][local11][local15] = 0;
				}
			}
		}
	}
}
