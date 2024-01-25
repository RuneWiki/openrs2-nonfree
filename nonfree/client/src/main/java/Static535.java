import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!rea;II)V")
	public static void method7742(@OriginalArg(0) Class291 arg0, @OriginalArg(1) int arg1) {
		if (Static119.aBoolean204) {
			Static119.aBoolean204 = false;
			arg1 = 0;
		}
		if (Static508.aClass291_7 != null && Static508.aClass291_7.method7194(arg0)) {
			return;
		}
		Static508.aClass291_7 = arg0;
		Static408.aLong189 = Static191.method3071();
		Static13.anInt233 = arg1;
		Static340.anInt6306 = arg1;
		if (Static340.anInt6306 != 0) {
			Static28.anInt407 = Static465.anInt7959;
			Static138.aFloat63 = Static265.aFloat121;
			Static473.anInt8108 = Static159.anInt3199;
			Static543.aFloat179 = Static56.aFloat22;
			Static442.aFloat149 = Static15.aFloat2;
			Static458.aClass141_3 = Static28.aClass141_1;
			Static368.aFloat144 = Static570.aFloat75;
			Static473.aFloat154 = Static454.aFloat150;
			Static511.aFloat162 = Static462.aFloat151;
			Static85.anInt1683 = Static21.anInt292;
			return;
		}
		Static415.method6436();
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!uu;ZLclient!rp;)V")
	public static void method7743(@OriginalArg(0) Class343 arg0, @OriginalArg(2) Class298 arg1) {
		Static574.aClass298_13 = arg1;
		Static340.aClass343_164 = arg0;
		Static96.aString12 = "";
		if (Class82_Sub3_Sub1.aString25.startsWith("win")) {
			Static96.aString12 = Static96.aString12 + "windows/";
		} else if (Class82_Sub3_Sub1.aString25.startsWith("linux")) {
			Static96.aString12 = Static96.aString12 + "linux/";
		} else if (Class82_Sub3_Sub1.aString25.startsWith("mac")) {
			Static96.aString12 = Static96.aString12 + "macos/";
		}
		if (Static574.aClass298_13.aBoolean612) {
			Static96.aString12 = Static96.aString12 + "msjava/";
		} else if (Class82_Sub3_Sub1.aString26.startsWith("amd64") || Class82_Sub3_Sub1.aString26.startsWith("x86_64")) {
			Static96.aString12 = Static96.aString12 + "x86_64/";
		} else if (Class82_Sub3_Sub1.aString26.startsWith("i386") || Class82_Sub3_Sub1.aString26.startsWith("i486") || Class82_Sub3_Sub1.aString26.startsWith("i586") || Class82_Sub3_Sub1.aString26.startsWith("x86")) {
			Static96.aString12 = Static96.aString12 + "x86/";
		} else if (Class82_Sub3_Sub1.aString26.startsWith("ppc")) {
			Static96.aString12 = Static96.aString12 + "ppc/";
		} else {
			Static96.aString12 = Static96.aString12 + "universal/";
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "([Lclient!uv;BI)V")
	public static void method7744(@OriginalArg(0) Class344[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class344 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt9554 == 0) {
					if (local13.aClass344Array2 != null) {
						method7744(local13.aClass344Array2, arg1);
					}
					@Pc(34) Class3_Sub1 local34 = (Class3_Sub1) Static128.aClass25_7.method426((long) local13.anInt9571);
					if (local34 != null) {
						Static24.method329(local34.anInt24, arg1);
					}
				}
				@Pc(53) Class3_Sub36 local53;
				if (arg1 == 0 && local13.anObjectArray9 != null) {
					local53 = new Class3_Sub36();
					local53.anObjectArray1 = local13.anObjectArray9;
					local53.aClass344_6 = local13;
					Static400.method6288(local53);
				}
				if (arg1 == 1 && local13.anObjectArray30 != null) {
					if (local13.anInt9586 >= 0) {
						@Pc(76) Class344 local76 = Static324.method5363(local13.anInt9571);
						if (local76 == null || local76.aClass344Array2 == null || local76.aClass344Array2.length <= local13.anInt9586 || local13 != local76.aClass344Array2[local13.anInt9586]) {
							continue;
						}
					}
					local53 = new Class3_Sub36();
					local53.aClass344_6 = local13;
					local53.anObjectArray1 = local13.anObjectArray30;
					Static400.method6288(local53);
				}
			}
		}
	}
}
