import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!kea;")
	public static final Class188 aClass188_12 = new Class188(4);

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
	public static final int[] anIntArray461 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZ)V")
	public static void method5366(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static193.aClass2_Sub2_Sub9_3 != null) {
			Static262.anInt5604 = Static193.aClass2_Sub2_Sub9_3.anInt2906;
		} else {
			Static262.anInt5604 = -1;
		}
		Static193.aClass2_Sub2_Sub9_3 = null;
		Static93.aClass261_2 = null;
		Static619.anInt9953 = 0;
		Static372.aClass109_37 = null;
		Static193.method1288();
		Static193.aClass109_9.method2329();
		Static301.aClass55_4 = null;
		Static253.aClass55_2 = null;
		Static468.aClass55_7 = null;
		Static27.anInt643 = -1;
		Static193.aClass84_2 = null;
		Static160.anInt2883 = -1;
		Static245.aClass55_1 = null;
		Static293.aClass55_3 = null;
		Static349.aClass55_5 = null;
		Static493.aClass55_8 = null;
		Static527.aClass61_28 = null;
		Static442.aClass55_6 = null;
		if (Static193.aClass197_2 != null) {
			Static193.aClass197_2.method4164();
			Static193.aClass197_2.method4165(128, 64);
		}
		if (Static193.aClass207_2 != null) {
			Static193.aClass207_2.method4283(64, 64);
		}
		if (Static193.aClass141_2 != null) {
			Static193.aClass141_2.method2970(64);
		}
		Static89.aClass330_3.method7450(64);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!mr;III)Ljava/awt/Frame;")
	public static Frame method5367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method4840()) {
			return null;
		}
		@Pc(17) Class210[] local17 = Static3.method8594(arg2);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt5212 == arg1 && arg0 == local17[local25].anInt5208 && (!local23 || arg3 < local17[local25].anInt5211)) {
				local23 = true;
				arg3 = local17[local25].anInt5211;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(87) Class108 local87 = arg2.method4843(arg0, arg3, arg1);
		while (local87.anInt2766 == 0) {
			Static444.method6061(10L);
		}
		@Pc(104) Frame local104 = (Frame) local87.anObject6;
		if (local104 == null) {
			return null;
		} else if (local87.anInt2766 == 2) {
			Static120.method1758(local104, arg2);
			return null;
		} else {
			return local104;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
	public static boolean method5372() {
		return Static474.anInt7600 > 0;
	}
}
