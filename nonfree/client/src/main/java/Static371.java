import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!mja", name = "k", descriptor = "I")
	public static int anInt6494;

	@OriginalMember(owner = "client!mja", name = "z", descriptor = "Lclient!ha;")
	public static Class143 aClass143_7;

	@OriginalMember(owner = "client!mja", name = "v", descriptor = "Lclient!gq;")
	public static final Class139 aClass139_3 = new Class139(2);

	@OriginalMember(owner = "client!mja", name = "w", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_2 = new Class6();

	@OriginalMember(owner = "client!mja", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString65 = null;

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lclient!rs;")
	public static Class5_Sub8 method5447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		try {
			@Pc(10) Class local10 = Class.forName("Class5_Sub8_Sub2");
			@Pc(14) Class5_Sub8 local14 = (Class5_Sub8) local10.getDeclaredConstructor().newInstance();
			local14.method7712(arg1, arg2, arg0);
			return local14;
		} catch (@Pc(23) Throwable local23) {
			@Pc(27) Class5_Sub8_Sub1 local27 = new Class5_Sub8_Sub1();
			local27.method7712(arg1, arg2, arg0);
			return local27;
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5449(@OriginalArg(1) String arg0) {
		return Static552.aHashtable37.containsKey(arg0);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(CZ)Z")
	public static boolean method5454(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static635.method8429(arg0)) {
			return true;
		} else {
			@Pc(21) char[] local21 = Static97.aCharArray2;
			for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
				@Pc(28) char local28 = local21[local23];
				if (arg0 == local28) {
					return true;
				}
			}
			@Pc(44) char[] local44 = Static257.aCharArray4;
			for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
				@Pc(51) char local51 = local44[local46];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}
}
