import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!be", name = "vd", descriptor = "Lclient!nh;")
	public static Class143 aClass143_2;

	@OriginalMember(owner = "client!be", name = "xd", descriptor = "Lclient!uo;")
	public static Class32 aClass32_4;

	@OriginalMember(owner = "client!be", name = "bd", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!be", name = "ld", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!be", name = "td", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_3 = new Class87(64);

	@OriginalMember(owner = "client!be", name = "yd", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!be", name = "zd", descriptor = "[I")
	public static final int[] anIntArray76 = new int[25];

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(BI)Lclient!k;")
	public static Class111 method561(@OriginalArg(1) int arg0) {
		@Pc(7) Class87 local7 = Static108.aClass87_21;
		@Pc(16) Class111 local16;
		synchronized (Static108.aClass87_21) {
			local16 = (Class111) Static108.aClass87_21.method2482((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) byte[] local36 = Static166.aClass216_59.method5648(Static95.method2043(arg0), Static325.method5300(arg0));
		local16 = new Class111();
		local16.anInt3294 = arg0;
		local16.aStringArray30 = new String[] { null, null, Static17.aClass34_14.method1285(Static2.anInt73), null, null };
		local16.aStringArray29 = new String[] { null, null, null, null, Static190.aClass34_122.method1285(Static2.anInt73) };
		if (local36 != null) {
			local16.method2987(new Class1_Sub8(local36));
		}
		local16.method3001();
		if (local16.anInt3320 != -1) {
			local16.method2986(method561(local16.anInt3320), method561(local16.anInt3333));
		}
		if (local16.anInt3324 != -1) {
			local16.method2999(method561(local16.anInt3311), method561(local16.anInt3324));
		}
		if (!Static357.aBoolean413 && local16.aBoolean318) {
			local16.aString30 = Static246.aClass34_144.method1285(Static2.anInt73);
			local16.anIntArray273 = null;
			local16.aStringArray29 = Static194.aStringArray40;
			local16.aBoolean319 = false;
			local16.aStringArray30 = Static39.aStringArray12;
			local16.anInt3332 = 0;
			if (local16.aClass197_15 != null) {
				@Pc(176) boolean local176 = false;
				for (@Pc(181) Class1 local181 = local16.aClass197_15.method5161(); local181 != null; local181 = local16.aClass197_15.method5154()) {
					@Pc(189) Class1_Sub4_Sub15 local189 = Static357.method3867((int) local181.aLong213);
					if (local189.aBoolean326) {
						local181.method5628();
					} else {
						local176 = true;
					}
				}
				if (!local176) {
					local16.aClass197_15 = null;
				}
			}
		}
		@Pc(218) Class87 local218 = Static108.aClass87_21;
		synchronized (Static108.aClass87_21) {
			Static108.aClass87_21.method2481(local16, (long) arg0);
			return local16;
		}
	}
}
