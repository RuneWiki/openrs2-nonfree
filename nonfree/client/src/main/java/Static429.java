import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_52 = new Class209(16);

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "Z")
	public static boolean aBoolean694 = false;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZI)Z")
	public static boolean method8197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static277.aBoolean303) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static109.aClass321ArrayArray1[local13] == null || Static109.aClass321ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(43) Class321 local43 = Static109.aClass321ArrayArray1[local13][local17];
		@Pc(57) Class6_Sub4_Sub12 local57;
		if (arg1 == -1 && local43.anInt9105 == 0) {
			for (local57 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local57 != null; local57 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
				if (local57.anInt7577 == 22 || local57.anInt7577 == 1008 || local57.anInt7577 == 57 || local57.anInt7577 == 20 || local57.anInt7577 == 11) {
					for (@Pc(92) Class321 local92 = Static286.method4134(local57.anInt7581); local92 != null; local92 = Static97.method1587(local92)) {
						if (local43.anInt9040 == local92.anInt9040) {
							return true;
						}
					}
				}
			}
		} else {
			for (local57 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local57 != null; local57 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
				if (arg1 == local57.anInt7579 && local43.anInt9040 == local57.anInt7581 && (local57.anInt7577 == 22 || local57.anInt7577 == 1008 || local57.anInt7577 == 57 || local57.anInt7577 == 20 || local57.anInt7577 == 11)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIILclient!ai;I)V")
	public static void method8198(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub3 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg0 << 14 | arg1 << 28);
		@Pc(22) Class6_Sub52 local22 = (Class6_Sub52) Static33.aClass209_3.method5038(local16);
		if (local22 == null) {
			local22 = new Class6_Sub52();
			Static33.aClass209_3.method5035(local16, local22);
			local22.aClass362_61.method8536(arg2);
			return;
		}
		@Pc(50) Class216 local50 = Static340.aClass121_1.method2647(arg2.anInt439);
		@Pc(53) int local53 = local50.anInt6075;
		if (local50.anInt6041 == 1) {
			local53 *= arg2.anInt441 + 1;
		}
		for (@Pc(72) Class6_Sub3 local72 = (Class6_Sub3) local22.aClass362_61.method8538(); local72 != null; local72 = (Class6_Sub3) local22.aClass362_61.method8530()) {
			local50 = Static340.aClass121_1.method2647(local72.anInt439);
			@Pc(83) int local83 = local50.anInt6075;
			if (local50.anInt6041 == 1) {
				local83 *= local72.anInt441 + 1;
			}
			if (local83 < local53) {
				Static651.method8874(local72, arg2);
				return;
			}
		}
		local22.aClass362_61.method8536(arg2);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method8203(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static2.method8467(arg0.charAt(local17)) - local15;
		}
		return local15;
	}
}
