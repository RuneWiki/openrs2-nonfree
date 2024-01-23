import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!gn;")
	public static Class1_Sub5_Sub2 aClass1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
	public static int anInt3508;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_14;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!km;")
	public static Class91 aClass91_129;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!km;")
	public static Class91 aClass91_130;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[I")
	public static int[] anIntArray311 = new int[500];

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
	public static int[] anIntArray312 = new int[14];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2827(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static283.aString315 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static162.aString200 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Lclient!in;")
	public static Class71 method2829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class71 local7 = Static56.method1058(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass71Array1 == null || arg1 >= local7.aClass71Array1.length) {
			return null;
		} else {
			return local7.aClass71Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	public static void method2830() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glDisableClientState(32886);
		Static277.method4193(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static277.method4208();
		for (@Pc(19) int local19 = 0; local19 < Static192.aClass1_Sub32ArrayArray2[0].length; local19++) {
			@Pc(31) Class1_Sub32 local31 = Static192.aClass1_Sub32ArrayArray2[0][local19];
			if (local31.anInt5042 >= 0 && Static171.method2928(Static110.anInterface2_1.method2264(local31.anInt5042))) {
				local1.glColor4fv(Static298.method4462(local31.anInt5038), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean381 ? 1.0F : 0.5F);
				local31.method3947(Static74.aClass1_Sub26ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static277.method4216();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static277.method4215();
	}
}
