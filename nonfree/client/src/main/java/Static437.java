import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_95 = new Class208(8, -1);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!mw;I)I")
	public static int method6204(@OriginalArg(0) Class1_Sub3_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method4994(2);
		@Pc(22) int local22;
		if (local10 == 0) {
			local22 = 0;
		} else if (local10 == 1) {
			local22 = arg0.method4994(5);
		} else if (local10 == 2) {
			local22 = arg0.method4994(8);
		} else {
			local22 = arg0.method4994(11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZ[BLjava/lang/String;)I")
	public static int method6207(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static120.method2184(arg2.charAt(local12));
			@Pc(35) int local35 = local12 + 1 < local10 ? Static120.method2184(arg2.charAt(local12 + 1)) : -1;
			@Pc(50) int local50 = local10 <= local12 + 2 ? -1 : Static120.method2184(arg2.charAt(local12 + 2));
			@Pc(65) int local65 = local12 + 3 < local10 ? Static120.method2184(arg2.charAt(local12 + 3)) : -1;
			arg1[arg0++] = (byte) (local20 << 2 | local35 >>> 4);
			if (local50 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local35 & 0xF) << 4 | local50 >>> 2);
			if (local65 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local50 & 0x3) << 6 | local65);
		}
		return arg0;
	}
}
