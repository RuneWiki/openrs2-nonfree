import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
	public static int anInt10865;

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_109 = new Class144(84, 0);

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "[F")
	public static final float[] aFloatArray83 = new float[2];

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZLclient!hla;)V")
	public static void method9220(@OriginalArg(1) Class3_Sub7_Sub10 arg0) {
		if (arg0 == null) {
			return;
		}
		Static419.aClass342_81.method7654(arg0);
		Static716.anInt11158++;
		@Pc(35) Class3_Sub7_Sub5 local35;
		if (arg0.aBoolean243 || "".equals(arg0.aString58)) {
			local35 = new Class3_Sub7_Sub5(arg0.aString58);
			Static239.anInt3802++;
		} else {
			@Pc(43) long local43 = arg0.aLong144;
			for (local35 = (Class3_Sub7_Sub5) Static158.aClass313_15.method7104(local43); local35 != null && !local35.aString40.equals(arg0.aString58); local35 = (Class3_Sub7_Sub5) Static158.aClass313_15.method7106()) {
			}
			if (local35 == null) {
				local35 = (Class3_Sub7_Sub5) Static365.aClass307_60.method7002(local43);
				if (local35 != null && !local35.aString40.equals(arg0.aString58)) {
					local35 = null;
				}
				if (local35 == null) {
					local35 = new Class3_Sub7_Sub5(arg0.aString58);
				}
				Static158.aClass313_15.method7107(local43, local35);
				Static239.anInt3802++;
			}
		}
		if (local35.method2142(arg0)) {
			Static727.method9600(local35);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZ)Z")
	public static boolean method9221(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
