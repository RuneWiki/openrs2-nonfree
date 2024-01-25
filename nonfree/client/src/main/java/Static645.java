import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vr", name = "F", descriptor = "Lclient!ae;")
	public static Class8 aClass8_145;

	@OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
	public static int anInt10423 = 0;

	@OriginalMember(owner = "client!vr", name = "J", descriptor = "Z")
	public static boolean aBoolean726 = false;

	@OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
	public static int anInt10427 = -1;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIII)I")
	public static int method8799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public static void method8800() {
		for (@Pc(15) Class6_Sub34 local15 = (Class6_Sub34) Static60.aClass209_5.method5037(); local15 != null; local15 = (Class6_Sub34) Static60.aClass209_5.method5036()) {
			if (local15.aClass204_Sub1_1.method6608()) {
				Static270.method3993(local15.anInt5400);
			} else {
				local15.aClass204_Sub1_1.method6611();
				try {
					local15.aClass204_Sub1_1.method6602();
				} catch (@Pc(38) Exception local38) {
					Static664.method9007(local38, "TV: " + local15.anInt5400);
					Static270.method3993(local15.anInt5400);
				}
				if (!local15.aBoolean341 && !local15.aBoolean343) {
					@Pc(64) Class6_Sub14_Sub1 local64 = local15.aClass204_Sub1_1.method6607();
					if (local64 != null) {
						@Pc(70) Class6_Sub8_Sub2 local70 = local64.method1703();
						if (local70 != null) {
							local70.method2081(local15.anInt5399);
							Static106.aClass6_Sub8_Sub3_2.method4256(local70);
							local15.aBoolean341 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!vt;Ljava/lang/String;II)Lclient!fe;")
	public static Class103 method8801(@OriginalArg(0) Class380 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg0.method8813(arg1);
		}
		@Pc(44) Class103 local44;
		if (arg2 == 1) {
			try {
				Static683.method5176("openjs", Static180.anApplet6, new Object[] { (new URL(Static180.anApplet6.getCodeBase(), arg1)).toString() });
				local44 = new Class103();
				local44.anInt2541 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class103();
				local44.anInt2541 = 2;
				return local44;
			}
		} else if (arg2 == 2) {
			try {
				Static180.anApplet6.getAppletContext().showDocument(new URL(Static180.anApplet6.getCodeBase(), arg1), "_blank");
				local44 = new Class103();
				local44.anInt2541 = 1;
				return local44;
			} catch (@Pc(84) Exception local84) {
				local44 = new Class103();
				local44.anInt2541 = 2;
				return local44;
			}
		} else if (arg2 == 3) {
			try {
				Static683.method5174(Static180.anApplet6, "loggedout");
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				Static180.anApplet6.getAppletContext().showDocument(new URL(Static180.anApplet6.getCodeBase(), arg1), "_top");
				local44 = new Class103();
				local44.anInt2541 = 1;
				return local44;
			} catch (@Pc(123) Exception local123) {
				local44 = new Class103();
				local44.anInt2541 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V")
	public static void method8803() {
		Static83.aClass132_3.xa(((float) Static96.aClass6_Sub22_7.aClass29_Sub7_1.method1675() * 0.1F + 0.7F) * Static244.aFloat30);
		Static83.aClass132_3.ZA(Static391.anInt6569, Static668.aFloat203, Static314.aFloat36, (float) (Static84.anInt1659 << 2), (float) (Static146.anInt4859 << 2), (float) (Static155.anInt2583 << 2));
		Static83.aClass132_3.method7452(Static602.aClass25_4);
	}
}
