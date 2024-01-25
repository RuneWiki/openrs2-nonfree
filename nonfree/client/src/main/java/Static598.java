import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public static int anInt9770;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_186 = new Class136(101, 4);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Lclient!pda;")
	public static Class5_Sub39 method8367() {
		if (Static203.aClass306_2 == null || Static39.aClass268_1 == null) {
			return null;
		}
		for (@Pc(21) Class5_Sub39 local21 = (Class5_Sub39) Static39.aClass268_1.method6395(); local21 != null; local21 = (Class5_Sub39) Static39.aClass268_1.method6395()) {
			@Pc(29) Class72 local29 = Static203.aClass273_2.method6529(local21.anInt7217);
			if (local29 != null && local29.aBoolean118 && local29.method1445(Static203.anInterface4_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)Z")
	public static boolean method8368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!kk;Ljava/lang/String;B)Lclient!tj;")
	public static Class330 method8369(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) String arg2) {
		if (arg0 == 0) {
			return arg1.method4331(arg2);
		} else if (arg0 == 1) {
			@Pc(34) Class330 local34;
			try {
				Static652.method1916("openjs", new Object[] { (new URL(Static270.anApplet5.getCodeBase(), arg2)).toString() }, Static270.anApplet5);
				local34 = new Class330();
				local34.anInt9132 = 1;
				return local34;
			} catch (@Pc(40) Throwable local40) {
				local34 = new Class330();
				local34.anInt9132 = 2;
				return local34;
			}
		} else {
			@Pc(74) Class330 local74;
			if (arg0 == 2) {
				try {
					Static270.anApplet5.getAppletContext().showDocument(new URL(Static270.anApplet5.getCodeBase(), arg2), "_blank");
					local74 = new Class330();
					local74.anInt9132 = 1;
					return local74;
				} catch (@Pc(80) Exception local80) {
					local74 = new Class330();
					local74.anInt9132 = 2;
					return local74;
				}
			} else if (arg0 == 3) {
				try {
					Static652.method1918("loggedout", Static270.anApplet5);
				} catch (@Pc(99) Throwable local99) {
				}
				try {
					Static270.anApplet5.getAppletContext().showDocument(new URL(Static270.anApplet5.getCodeBase(), arg2), "_top");
					local74 = new Class330();
					local74.anInt9132 = 1;
					return local74;
				} catch (@Pc(119) Exception local119) {
					local74 = new Class330();
					local74.anInt9132 = 2;
					return local74;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public static void method8370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static139.method2092(local7.aClass14_Sub1_Sub5_1);
			if (local7.aClass14_Sub1_Sub5_1 != null) {
				local7.aClass14_Sub1_Sub5_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!kf;Z[[[BIB)Z")
	public static boolean method8372(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static631.aBoolean829) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9317 >> Static162.anInt2830;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt9315 >> Static162.anInt2830;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class14_Sub1_Sub1) {
			local10 = ((Class14_Sub1_Sub1) arg0).aShort73;
			local17 = ((Class14_Sub1_Sub1) arg0).aShort72;
			local8 = ((Class14_Sub1_Sub1) arg0).aShort74;
			local15 = ((Class14_Sub1_Sub1) arg0).aShort71;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte126 < Static36.anInt662 && local38 >= Static188.anInt10382 && local38 < Static465.anInt7141 && local41 >= Static143.anInt4618 && local41 < Static97.anInt1545) {
					if ((arg2 == null || arg0.aByte125 < arg3 || arg2[arg0.aByte125][local38][local41] != arg4) && arg0.method7993() && !arg0.method8000(Static480.aClass126_12)) {
						return false;
					}
					if (!arg1 && local38 >= Static484.anInt8046 - 16 && local38 <= Static484.anInt8046 + 16 && local41 >= Static263.anInt4379 - 16 && local41 <= Static263.anInt4379 + 16) {
						if (Static425.aBoolean601) {
							Static589.aClass350Array3[Static67.anInt1075++].method8253(arg0);
							Static67.anInt1075 %= Static401.anInt8429;
						} else {
							arg0.method7997(Static480.aClass126_12);
						}
					}
				}
			}
		}
		return true;
	}
}
