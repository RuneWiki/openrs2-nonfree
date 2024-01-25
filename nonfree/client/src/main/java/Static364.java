import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	public static int anInt6270;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!di;")
	public static final Class54 aClass54_89 = new Class54(63, 2);

	@OriginalMember(owner = "client!so", name = "g", descriptor = "[I")
	public static final int[] anIntArray528 = new int[14];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;BILclient!dr;)Lclient!jv;")
	public static Class138 method4966(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class59 arg2) {
		if (arg1 == 0) {
			return arg2.method1365(arg0);
		}
		@Pc(41) Class138 local41;
		if (arg1 == 1) {
			try {
				Static463.method4346(new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", arg2.anApplet1);
				local41 = new Class138();
				local41.anInt3723 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class138();
				local41.anInt3723 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_blank");
				local41 = new Class138();
				local41.anInt3723 = 1;
				return local41;
			} catch (@Pc(86) Exception local86) {
				local41 = new Class138();
				local41.anInt3723 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static463.method4344("loggedout", arg2.anApplet1);
			} catch (@Pc(106) Throwable local106) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_top");
				local41 = new Class138();
				local41.anInt3723 = 1;
				return local41;
			} catch (@Pc(128) Exception local128) {
				local41 = new Class138();
				local41.anInt3723 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void method4968() {
		for (@Pc(3) int local3 = 0; local3 < Static227.aByteArrayArrayArray8.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static227.aByteArrayArrayArray8[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static227.aByteArrayArrayArray8[0][0].length; local11++) {
					Static227.aByteArrayArrayArray8[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public static void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class106 local28 = Static440.aClass106ArrayArrayArray3[local9][arg0][arg1] = Static440.aClass106ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte45--;
				for (@Pc(40) Class4 local40 = local28.aClass4_3; local40 != null; local40 = local40.aClass4_1) {
					@Pc(44) Class3_Sub2 local44 = local40.aClass3_Sub2_1;
					if (local44.aShort85 == arg0 && local44.aShort86 == arg1) {
						local44.aByte89--;
					}
				}
			}
		}
		if (Static440.aClass106ArrayArrayArray3[0][arg0][arg1] == null) {
			Static440.aClass106ArrayArrayArray3[0][arg0][arg1] = new Class106(0, arg0, arg1);
			Static440.aClass106ArrayArrayArray3[0][arg0][arg1].aByte43 = 1;
		}
		Static440.aClass106ArrayArrayArray3[0][arg0][arg1].aClass106_1 = local7;
		Static440.aClass106ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
