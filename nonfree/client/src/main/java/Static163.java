import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[200];

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_25 = new Class277(4);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;[BII)I")
	public static int method2924(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20 += 4) {
			@Pc(28) int local28 = Static480.method7475(arg0.charAt(local20));
			@Pc(43) int local43 = local20 + 1 >= local18 ? -1 : Static480.method7475(arg0.charAt(local20 + 1));
			@Pc(58) int local58 = local20 + 2 >= local18 ? -1 : Static480.method7475(arg0.charAt(local20 + 2));
			@Pc(77) int local77 = local18 <= local20 + 3 ? -1 : Static480.method7475(arg0.charAt(local20 + 3));
			arg1[arg2++] = (byte) (local43 >>> 4 | local28 << 2);
			if (local58 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local58 >>> 2 | (local43 & 0xF) << 4);
			if (local77 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local77 | (local58 & 0x3) << 6);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!dn;ILjava/awt/Canvas;Lclient!n;)Lclient!qa;")
	public static Class4 method2930(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface13 arg3) {
		if (!Static510.method7784()) {
			throw new RuntimeException("");
		} else if (Static259.method4668("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg2, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class4_Sub2_Sub2 local60 = new Class4_Sub2_Sub2(local29, arg2, local39, arg3, arg1, arg0);
			local60.method7340();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}
}
