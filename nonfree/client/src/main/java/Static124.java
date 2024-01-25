import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!iq;")
	public static Class104 aClass104_77;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	public static int anInt2618;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
	public static final int[] anIntArray214 = new int[14];

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_90 = new Class221(40, -2);

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_91 = new Class221(101, 17);

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public static int anInt2617 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)Z")
	public static boolean method2397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static258.aBoolean470) {
			return false;
		}
		@Pc(18) int local18 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static264.aClass68ArrayArray1[local18] == null || Static264.aClass68ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class68 local40 = Static264.aClass68ArrayArray1[local18][local22];
		@Pc(55) Class2_Sub31 local55;
		if (arg1 == -1 && local40.anInt1871 == 0) {
			for (local55 = (Class2_Sub31) Static103.aClass180_24.method4919(); local55 != null; local55 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
				if (local55.anInt5368 == 9 || local55.anInt5368 == 1006 || local55.anInt5368 == 25 || local55.anInt5368 == 60 || local55.anInt5368 == 21) {
					for (@Pc(141) Class68 local141 = Static8.method144(local55.anInt5370); local141 != null; local141 = Static227.method4206(local141)) {
						if (local40.anInt1857 == local141.anInt1857) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class2_Sub31) Static103.aClass180_24.method4919(); local55 != null; local55 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
				if (local55.anInt5369 == arg1 && local55.anInt5370 == local40.anInt1857 && (local55.anInt5368 == 9 || local55.anInt5368 == 1006 || local55.anInt5368 == 25 || local55.anInt5368 == 60 || local55.anInt5368 == 21)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2398(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)Lclient!gg;")
	public static Class78 method2399(@OriginalArg(1) int arg0) {
		@Pc(10) Class78 local10 = (Class78) Static41.aClass107_40.method3021((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static212.aClass104_118.method2756(0, arg0);
		local10 = new Class78();
		if (local26 != null) {
			local10.method2104(new Class2_Sub12(local26));
		}
		local10.method2102();
		Static41.aClass107_40.method3018((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method2400() {
		@Pc(1) Class107 local1 = Static150.aClass107_17;
		synchronized (Static150.aClass107_17) {
			Static150.aClass107_17.method3015();
		}
		local1 = Static88.aClass107_10;
		synchronized (Static88.aClass107_10) {
			Static88.aClass107_10.method3015();
		}
		local1 = Static224.aClass107_53;
		synchronized (Static224.aClass107_53) {
			Static224.aClass107_53.method3015();
		}
		local1 = Static356.aClass107_59;
		synchronized (Static356.aClass107_59) {
			Static356.aClass107_59.method3015();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method2401() {
		@Pc(1) Class107 local1 = Static196.aClass107_21;
		synchronized (Static196.aClass107_21) {
			Static196.aClass107_21.method3015();
		}
	}
}
