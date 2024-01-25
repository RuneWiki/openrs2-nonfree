import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_48 = new Class244(56, -1);

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "[I")
	public static final int[] anIntArray380 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_49 = new Class244(61, 1);

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "Lclient!vp;")
	public static final Class240 aClass240_74 = new Class240("", 14);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBZ)V")
	public static void method3019(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class3_Sub18 local8 = Static214.method3324(arg0, arg1);
		if (local8 != null) {
			local8.method5700();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BILclient!rp;)Ljava/lang/String;")
	public static String method3022(@OriginalArg(2) Class3_Sub5 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2750();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt3121 += Static261.aClass198_1.method4513(arg0.aByteArray42, local15, arg0.anInt3121, local7, 0);
			return Static325.method5005(local7, local15, 0);
		} catch (@Pc(49) Exception local49) {
			return "Cabbage";
		}
	}
}
