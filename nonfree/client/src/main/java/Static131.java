import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!hh;")
	public static Class109 aClass109_31;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "[[[Lclient!kf;")
	public static Class137[][][] aClass137ArrayArrayArray2;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public static int anInt2418 = -1;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	public static final int anInt2420 = 1;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2034(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(7) int local7 = arg1.indexOf(arg0); local7 != -1; local7 = arg1.indexOf(arg0, arg2.length() + local7)) {
			arg1 = arg1.substring(0, local7) + arg2 + arg1.substring(arg0.length() + local7);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/awt/Frame;Lclient!ci;)V")
	public static void method2036(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class42 arg1) {
		while (true) {
			@Pc(6) Class159 local6 = arg1.method642(arg0);
			while (local6.anInt4271 == 0) {
				Static366.method5214(10L);
			}
			if (local6.anInt4271 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static366.method5214(100L);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZIII[B)Z")
	public static boolean method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(16) int local16 = arg2 % 8;
		@Pc(23) int local23;
		if (local16 == 0) {
			local23 = 0;
		} else {
			local23 = 8 - local16;
		}
		@Pc(37) int local37 = -((arg3 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg2 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local23;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}
}
