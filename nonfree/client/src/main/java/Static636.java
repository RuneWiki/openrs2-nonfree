import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	public static int anInt10567;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	public static int anInt10568;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_110 = new Class46(23, -1);

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_48 = new Class273(16);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)Z")
	public static boolean method8977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIILclient!rs;I[BIZ)Lclient!sb;")
	public static Class167_Sub3_Sub1 method8978(@OriginalArg(0) int arg0, @OriginalArg(3) Class133_Sub3 arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) int arg3) {
		if (arg1.aBoolean620 || Static413.method8723(arg3) && Static413.method8723(arg0)) {
			return new Class167_Sub3_Sub1(arg1, 3553, 6406, arg3, arg0, false, arg2, 6406);
		} else if (arg1.aBoolean622) {
			return new Class167_Sub3_Sub1(arg1, 34037, 6406, arg3, arg0, false, arg2, 6406);
		} else {
			return new Class167_Sub3_Sub1(arg1, 6406, arg3, arg0, Static613.method8740(arg3), Static613.method8740(arg0), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public static void method8979() {
		if (Static213.aClass133_5 == null) {
			return;
		}
		if (Static428.aBoolean526) {
			Static310.method4804();
		}
		Static348.aClass155_3.method3773();
		Static202.method3545();
		Static347.method5204();
		Static212.method3648();
		Static68.method1114();
		Static593.method8545();
		if (Static360.aClass64_1 != null) {
			Static360.aClass64_1.method1357();
		}
		Static424.method6402();
		Static573.method2148();
		Static117.method1779();
		Static563.method8172();
		Static232.method3875(false);
		for (@Pc(43) int local43 = 0; local43 < 2048; local43++) {
			@Pc(49) Class4_Sub2_Sub1_Sub1_Sub1 local49 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local43];
			if (local49 != null) {
				for (@Pc(53) int local53 = 0; local53 < local49.aClass187Array3.length; local53++) {
					local49.aClass187Array3[local53] = null;
				}
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static235.anInt4322; local76++) {
			@Pc(83) Class4_Sub2_Sub1_Sub1_Sub2 local83 = Static467.aClass5_Sub3Array1[local76].aClass4_Sub2_Sub1_Sub1_Sub2_1;
			if (local83 != null) {
				for (@Pc(87) int local87 = 0; local87 < local83.aClass187Array3.length; local87++) {
					local83.aClass187Array3[local87] = null;
				}
			}
		}
		Static16.aClass113_2 = null;
		Static318.aClass113_4 = null;
		Static213.aClass133_5.method7295();
		Static213.aClass133_5 = null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BZII)V")
	public static void method8980(@OriginalArg(1) boolean arg0) {
		Static491.anInt8290 = 22050;
		Static227.anInt3909 = 2;
		Static21.aBoolean12 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
	public static void method8982() {
		for (@Pc(14) Class5_Sub5_Sub18 local14 = (Class5_Sub5_Sub18) Static14.aClass330_4.method7908(); local14 != null; local14 = (Class5_Sub5_Sub18) Static14.aClass330_4.method7914()) {
			@Pc(19) Class4_Sub2_Sub1_Sub4 local19 = local14.aClass4_Sub2_Sub1_Sub4_1;
			if (local19.aBoolean563) {
				local14.method9047();
				local19.method6978();
			} else if (Static631.anInt10493 >= local19.anInt7920) {
				local19.method6976(Static435.anInt7492);
				if (local19.aBoolean563) {
					local14.method9047();
				} else {
					Static37.method569(local19, true);
				}
			}
		}
	}
}
