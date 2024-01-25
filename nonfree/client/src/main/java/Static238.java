import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lr", name = "yd", descriptor = "I")
	public static int anInt4348;

	@OriginalMember(owner = "client!lr", name = "Nc", descriptor = "[I")
	public static final int[] anIntArray285 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!lr", name = "xd", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_28 = new Class102(4);

	@OriginalMember(owner = "client!lr", name = "zd", descriptor = "[I")
	public static final int[] anIntArray286 = new int[6];

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method3436(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class124 local8 = Static334.method4492(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray28 != null) {
			@Pc(18) Class1_Sub40 local18 = new Class1_Sub40();
			local18.anObjectArray36 = local8.anObjectArray28;
			local18.aClass124_14 = local8;
			local18.anInt6792 = arg1;
			local18.aString75 = arg0;
			Static298.method4076(local18);
		}
		if (Static312.anInt5414 != 9) {
			return;
		}
		@Pc(41) boolean local41 = true;
		if (local8.anInt3413 != 0) {
			local41 = Static41.method587(local8);
		}
		if (!local41 || !Static55.method970(local8).method2817(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static52.method867(Static60.aClass103_52);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 2) {
			Static52.method867(Static413.aClass103_240);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 3) {
			Static52.method867(Static106.aClass103_85);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 4) {
			Static52.method867(Static76.aClass103_61);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 5) {
			Static52.method867(Static452.aClass103_255);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 6) {
			Static52.method867(Static80.aClass103_64);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 7) {
			Static52.method867(Static311.aClass103_197);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 8) {
			Static52.method867(Static300.aClass103_190);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 9) {
			Static52.method867(Static110.aClass103_90);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
		if (arg1 == 10) {
			Static52.method867(Static84.aClass103_47);
			Static294.method4022(arg2, local8.anInt3405, arg3);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BII)Z")
	public static boolean method3444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(II)I")
	public static int method3445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static438.aByteArrayArray19 == null ? 0 : Static438.aByteArrayArray19[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(Z)V")
	public static void method3446() {
		Static138.aClass6_26 = null;
		Static145.aClass6_19 = null;
		Static112.aClass6_21 = null;
		Static3.aClass6_46 = null;
		Static142.aClass6_28 = null;
		Static340.aClass6_45 = null;
		Static243.aClass6_39 = null;
		Static196.aClass6_51 = null;
		Static57.aClass6Array3 = null;
	}
}
