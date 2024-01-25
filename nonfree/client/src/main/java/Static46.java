import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "[Lclient!mb;")
	public static final Class166[] aClass166Array1 = new Class166[4];

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_7 = new Class137(4);

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_4 = new Class43("", 11);

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public static void method608() {
		Static120.aClass137_17.method2739();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IBI)V")
	public static void method610(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static420.anIntArray532[local3] = Static420.anIntArray532[local3 - 1];
			Static457.anIntArray575[local3] = Static457.anIntArray575[local3 - 1];
			Static16.aStringArray2[local3] = Static16.aStringArray2[local3 - 1];
			Static110.aStringArray18[local3] = Static110.aStringArray18[local3 - 1];
			Static394.aStringArray24[local3] = Static394.aStringArray24[local3 - 1];
			Static215.aStringArray38[local3] = Static215.aStringArray38[local3 - 1];
			Static128.anIntArray555[local3] = Static128.anIntArray555[local3 - 1];
		}
		Static420.anIntArray532[0] = arg6;
		Static457.anIntArray575[0] = arg5;
		Static16.aStringArray2[0] = arg1;
		Static110.aStringArray18[0] = arg2;
		Static394.aStringArray24[0] = arg4;
		Static215.aStringArray38[0] = arg0;
		Static128.anIntArray555[0] = arg3;
		Static343.anInt5686++;
		Static193.anInt1359 = Static79.anInt1568;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public static void method611() {
		Static383.aClass4_Sub14_Sub1_2.method1918();
		Static350.anInt5812 = 1;
		Static252.aClass211_63 = null;
	}
}
