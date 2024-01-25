import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBLclient!ha;Z)Lclient!lt;")
	public static Class221 method3354(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static368.anIntArray419 != null) {
			for (@Pc(20) int local20 = 0; local20 < Static368.anIntArray419.length; local20++) {
				if (arg0 == Static368.anIntArray419[local20]) {
					return Static14.aClass221Array1[local20];
				}
			}
		}
		@Pc(47) Class221 local47 = (Class221) Static380.aClass352_47.method7653((long) arg0);
		if (local47 != null) {
			if (arg2 && local47.aClass31_7 == null) {
				@Pc(59) Class31 local59 = Static662.method8784(Static456.aClass34_96, arg0);
				if (local59 == null) {
					return null;
				}
				local47.aClass31_7 = local59;
			}
			return local47;
		}
		@Pc(72) Class51[] local72 = Static682.method1652(Static201.aClass34_51, arg0);
		if (local72 == null) {
			return null;
		}
		@Pc(81) Class31 local81 = Static662.method8784(Static456.aClass34_96, arg0);
		if (local81 == null) {
			return null;
		}
		if (arg2) {
			local47 = new Class221(arg1.method8081(local81, local72), local81);
		} else {
			local47 = new Class221(arg1.method8081(local81, local72));
		}
		Static380.aClass352_47.method7655((long) arg0, local47);
		return local47;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
	public static void method3355() {
		if (!Static92.aBoolean127) {
			return;
		}
		while (true) {
			while (Static614.anInt9420 < Static382.aClass22_Sub1Array1.length) {
				@Pc(22) Class22_Sub1 local22 = Static382.aClass22_Sub1Array1[Static614.anInt9420];
				if (local22 != null && local22.anInt1419 == -1) {
					if (Static72.aClass4_Sub14_1 == null) {
						Static72.aClass4_Sub14_1 = Static408.aClass19_1.method475(local22.aString12);
					}
					@Pc(45) int local45 = Static72.aClass4_Sub14_1.anInt2029;
					if (local45 == -1) {
						return;
					}
					local22.anInt1419 = local45;
					Static72.aClass4_Sub14_1 = null;
					Static614.anInt9420++;
				} else {
					Static614.anInt9420++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public static void method3356(@OriginalArg(0) int arg0) {
		Static451.anInt7047 = -1;
		Static379.anInt5638 = arg0;
		Static451.anInt7047 = -1;
		Static258.method3733();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)[Lclient!pn;")
	public static Class288[] method3357() {
		return new Class288[] { Static603.aClass288_4, Static277.aClass288_2, Static331.aClass288_3 };
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!bt;B)V")
	public static void method3359(@OriginalArg(0) Class34 arg0) {
		Static599.aClass34_117 = arg0;
	}
}
