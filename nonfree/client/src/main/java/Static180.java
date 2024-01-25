import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_117 = new Class225(35, 10);

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[200];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5442(@OriginalArg(1) String arg0) {
		if (Static371.aStringArray22 == null) {
			Static204.method2897();
		}
		Static151.aCalendar5.setTime(new Date(Static567.method7863()));
		@Pc(22) int local22 = Static151.aCalendar5.get(11);
		@Pc(26) int local26 = Static151.aCalendar5.get(12);
		@Pc(30) int local30 = Static151.aCalendar5.get(13);
		@Pc(64) String local64 = Integer.toString(local22 / 10) + local22 % 10 + ":" + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
		@Pc(69) String[] local69 = Static100.method1530(arg0, '\n');
		for (@Pc(79) int local79 = 0; local79 < local69.length; local79++) {
			for (@Pc(83) int local83 = Static646.anInt9910; local83 > 0; local83--) {
				Static371.aStringArray22[local83] = Static371.aStringArray22[local83 - 1];
			}
			Static371.aStringArray22[0] = local64 + ": " + local69[local79];
			if (Static129.aFileOutputStream1 != null) {
				try {
					Static129.aFileOutputStream1.write(Static491.method7041(Static371.aStringArray22[0] + "\n"));
				} catch (@Pc(138) IOException local138) {
				}
			}
			if (Static371.aStringArray22.length - 1 > Static646.anInt9910) {
				Static646.anInt9910++;
				if (Static371.anInt5925 > 0) {
					Static371.anInt5925++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)Z")
	public static boolean method5443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[Lclient!oh;)V")
	public static void method5444(@OriginalArg(1) int arg0, @OriginalArg(2) Class273[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class273 local18 = arg1[local12];
			if (local18 != null) {
				if (local18.anInt7371 == 0) {
					if (local18.aClass273Array3 != null) {
						method5444(arg0, local18.aClass273Array3);
					}
					@Pc(48) Class2_Sub26 local48 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local18.anInt7350, 0);
					if (local48 != null) {
						Static627.method8472(local48.anInt3020, arg0);
					}
				}
				@Pc(71) Class2_Sub36 local71;
				if (arg0 == 0 && local18.anObjectArray32 != null) {
					local71 = new Class2_Sub36();
					local71.anObjectArray2 = local18.anObjectArray32;
					local71.aClass273_6 = local18;
					Static484.method6919(local71);
				}
				if (arg0 == 1 && local18.anObjectArray36 != null) {
					if (local18.anInt7410 >= 0) {
						@Pc(100) Class273 local100 = Static417.method6111(local18.anInt7350);
						if (local100 == null || local100.aClass273Array4 == null || local18.anInt7410 >= local100.aClass273Array4.length || local100.aClass273Array4[local18.anInt7410] != local18) {
							continue;
						}
					}
					local71 = new Class2_Sub36();
					local71.aClass273_6 = local18;
					local71.anObjectArray2 = local18.anObjectArray36;
					Static484.method6919(local71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLclient!nca;)V")
	public static void method5446(@OriginalArg(1) Class254 arg0) {
		Static245.anInt3829 = 0;
		Static660.anInt10311 = 0;
		Static624.aClass320_8 = new Class320();
		Static249.aClass4_Sub1_Sub1_Sub1Array1 = new Class4_Sub1_Sub1_Sub1[1024];
		Static317.aClass4_Sub7Array5 = new Class4_Sub7[Static429.anIntArray123[Static261.anInt10710] + 1];
		Static518.anInt8266 = 0;
		Static6.anInt5790 = 0;
		Static552.method4264(arg0);
		Static531.method7479(arg0);
	}
}
