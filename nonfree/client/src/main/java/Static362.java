import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "Lclient!tr;")
	public static Class110 aClass110_19;

	@OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
	public static int anInt6079;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
	public static int anInt6083;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
	public static int anInt6084;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
	public static void method5404(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static84.anIntArray167[local7] = Static84.anIntArray167[local7 - 1];
			Static109.anIntArray213[local7] = Static109.anIntArray213[local7 - 1];
			Static69.aStringArray7[local7] = Static69.aStringArray7[local7 - 1];
			Static261.aStringArray31[local7] = Static261.aStringArray31[local7 - 1];
			Static179.aStringArray24[local7] = Static179.aStringArray24[local7 - 1];
			Static329.aStringArray38[local7] = Static329.aStringArray38[local7 - 1];
			Static304.anIntArray360[local7] = Static304.anIntArray360[local7 - 1];
		}
		Static84.anIntArray167[0] = arg1;
		Static69.aStringArray7[0] = arg3;
		Static109.anIntArray213[0] = arg4;
		Static261.aStringArray31[0] = arg0;
		Static179.aStringArray24[0] = arg6;
		Static65.anInt1298 = Static28.anInt360;
		Static30.anInt547++;
		Static304.anIntArray360[0] = arg5;
		Static329.aStringArray38[0] = arg2;
	}
}
