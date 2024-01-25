import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!ak;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "Lclient!ob;")
	public static Class3 aClass3_4;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
	public static int anInt7534 = 0;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
	public static boolean aBoolean820 = false;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!fq;ZLjava/lang/String;I)Lclient!tc;")
	public static Class232 method5943(@OriginalArg(0) Class83 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method1881(arg1);
		}
		@Pc(38) Class232 local38;
		if (arg2 == 1) {
			try {
				Static461.method3100("openjs", arg0.anApplet1, new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg1)).toString() });
				local38 = new Class232();
				local38.anInt6402 = 1;
				return local38;
			} catch (@Pc(44) Throwable local44) {
				local38 = new Class232();
				local38.anInt6402 = 2;
				return local38;
			}
		} else if (arg2 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_blank");
				local38 = new Class232();
				local38.anInt6402 = 1;
				return local38;
			} catch (@Pc(80) Exception local80) {
				local38 = new Class232();
				local38.anInt6402 = 2;
				return local38;
			}
		} else if (arg2 == 3) {
			try {
				Static461.method3101(arg0.anApplet1, "loggedout");
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_top");
				local38 = new Class232();
				local38.anInt6402 = 1;
				return local38;
			} catch (@Pc(122) Exception local122) {
				local38 = new Class232();
				local38.anInt6402 = 2;
				return local38;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(FFIF)I")
	public static int method5944(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local26 && local26 > local35) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local35 > local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ii;IIIII)V")
	public static void method5945(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6702 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub7Array2[local4] != null) {
				arg0.anInt6702++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6702; local22++) {
			@Pc(31) long local31 = Static261.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class137 local41;
			while (local31 != 0L) {
				local41 = Static45.aClass137Array4[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub7_2 == arg0.aClass1_Sub7Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static261.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static45.aClass137Array4[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub7_2 == arg0.aClass1_Sub7Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt6702 - 1; local93++) {
				arg0.aClass1_Sub7Array2[local93] = arg0.aClass1_Sub7Array2[local93 + 1];
			}
			arg0.anInt6702--;
		}
	}
}
