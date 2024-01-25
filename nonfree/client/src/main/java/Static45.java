import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Z")
	public static boolean aBoolean764 = false;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
	public static int anInt10277 = 0;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!ca;")
	public static Class5_Sub7 aClass5_Sub7_4 = null;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method8834(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) long local18 = 0L;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = (local18 << 5) + ((long) arg0.charAt(local20)) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!ot;)Lclient!ot;")
	public static Class5_Sub16_Sub4 method8835(@OriginalArg(1) Class5_Sub16_Sub4 arg0) {
		@Pc(23) Class5_Sub16_Sub4 local23 = arg0 == null ? new Class5_Sub16_Sub4() : new Class5_Sub16_Sub4(arg0);
		local23.method6381();
		return local23;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Z")
	public static boolean method8836(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public static void method8838(@OriginalArg(1) Canvas arg0) {
		@Pc(11) Dimension local11 = arg0.getSize();
		Static558.method8061(local11.height, local11.width);
		if (Static659.anInt10597 == 1) {
			Static617.aClass57_14.method7727(arg0, Static227.anInt3689, Static370.anInt10370);
		} else {
			Static617.aClass57_14.method7727(arg0, Static539.anInt9220, Static116.anInt3315);
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method8839() {
		Static81.anInt1318 = Static594.aClass224_12.anInt6133 + Static594.aClass224_12.anInt6135 + 2;
		Static117.aStringArray15 = new String[500];
		Static78.anInt9557 = Static570.aClass224_11.anInt6135 + Static570.aClass224_11.anInt6133 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static117.aStringArray15.length; local27++) {
			Static117.aStringArray15[local27] = "";
		}
		Static619.method3013(Static582.aClass335_3.method8349(Static323.anInt5795));
	}
}
