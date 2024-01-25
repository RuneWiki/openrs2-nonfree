import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
	public static int anInt2986;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!co;")
	public static final Class41 aClass41_36 = new Class41(8);

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "S")
	public static short aShort34 = 320;

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "[I")
	public static final int[] anIntArray232 = new int[25];

	@OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
	public static int anInt2999 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Z")
	public static boolean method2410(@OriginalArg(1) int arg0) {
		@Pc(7) Class35_Sub1 local7 = Static131.method2289(arg0);
		if (local7 == null) {
			return false;
		} else if (Static175.anInt3717 == 3) {
			@Pc(39) String local39 = "";
			if (Static158.aClass49_3 != Static306.aClass49_7) {
				local39 = ":" + (local7.anInt5032 + 7000);
			}
			@Pc(55) String local55 = "";
			if (Static60.aString14 != null) {
				local55 = "/p=" + Static60.aString14;
			}
			@Pc(109) String local109 = "http://" + local7.aString48 + local39 + "/l=" + Static200.anInt4144 + "/a=" + Static369.anInt6788 + local55 + "/j" + (Static271.aBoolean375 ? "1" : "0") + ",o" + (Static199.aBoolean301 ? "1" : "0") + ",a2";
			try {
				Static12.aClient1.getAppletContext().showDocument(new URL(local109), "_self");
				return true;
			} catch (@Pc(119) Exception local119) {
				return false;
			}
		} else {
			Static283.aString49 = local7.aString48;
			Static4.anInt134 = local7.anInt5032;
			if (Static306.aClass49_7 != Static158.aClass49_3) {
				Static114.anInt2525 = Static4.anInt134 + 40000;
				Static167.anInt3451 = Static4.anInt134 + 50000;
				Static384.anInt6975 = Static114.anInt2525;
			}
			return true;
		}
	}
}
