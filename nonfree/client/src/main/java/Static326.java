import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Lclient!nq;")
	public static Class144 aClass144_95;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
	public static int anInt5865 = 127;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!ko;ILclient!ja;I)Lclient!uo;")
	public static synchronized Class129 method4946(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Class118 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface2 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static327.aBooleanArray26[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(47) Class129 local47;
		if (arg2 == 0) {
			local47 = Static239.method4235(arg0, local7, arg3);
		} else if (arg2 == 1) {
			local47 = Static221.method3951(arg4, arg1, arg0, arg3, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static327.aBooleanArray26[local7] = true;
		return local47;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
	public static void method4949() {
		Static212.aClass26_40.method333();
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIII)Lclient!ck;")
	public static Class39 method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class46[] local7 = null;
		@Pc(11) Class146 local11 = Static174.method2822(arg0);
		if (local11.anIntArray340 != null) {
			local7 = new Class46[local11.anIntArray340.length];
			for (@Pc(25) int local25 = 0; local25 < local7.length; local25++) {
				@Pc(36) Class216 local36 = Static252.method5139(local11.anIntArray340[local25]);
				local7[local25] = new Class46(local36.anInt6720, local36.anInt6721, local36.anInt6714, local36.anInt6717, local36.anInt6716, local36.anInt6722, local36.anInt6723, local36.aBoolean425);
			}
		}
		return new Class39(local11.anInt4499, local7, local11.anInt4492, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	public static void method4985() {
		Static253.aClass58_30.method1011();
		Static303.aClass58_29.method1011();
	}
}
