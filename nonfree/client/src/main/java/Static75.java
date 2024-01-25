import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!wr;")
	public static Class109 aClass109_13;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "Lclient!wo;")
	public static Class216 aClass216_29;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "F")
	public static float aFloat13 = 0.0F;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	public static int anInt1967 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	public static void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub4_Sub9 local13 = Static139.method4227(0, 15);
		local13.method1869();
		local13.anInt2142 = arg1;
		local13.anInt2148 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method1714(@OriginalArg(1) Class216 arg0) {
		Static213.aClass216_72 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!gi;III[Z)Z")
	public static boolean method1716(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static298.aClass53Array3 != Static269.aClass53Array2) {
			@Pc(11) int local11 = Static190.aClass53Array1[arg1].method2792(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class53 local18 = Static190.aClass53Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method2792(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method2796(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method2788(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)V")
	public static void method1718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class165 local13 = Static37.aClass165ArrayArray1[arg0][arg1];
		if (local13 != null) {
			Static341.anInt6553 = local13.anInt4976;
			Static219.anInt4616 = local13.anInt4978;
			Static306.anInt6045 = local13.anInt4983;
		}
		Static37.method903();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;ILclient!nh;I)Lclient!ph;")
	public static Class162 method1720(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		if (arg1 == 0) {
			return arg2.method3911(arg0);
		}
		@Pc(41) Class162 local41;
		if (arg1 == 1) {
			try {
				Static359.method1279(new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", arg2.anApplet1);
				local41 = new Class162();
				local41.anInt4801 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class162();
				local41.anInt4801 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_blank");
				local41 = new Class162();
				local41.anInt4801 = 1;
				return local41;
			} catch (@Pc(83) Exception local83) {
				local41 = new Class162();
				local41.anInt4801 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static359.method1280(arg2.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_top");
				local41 = new Class162();
				local41.anInt4801 = 1;
				return local41;
			} catch (@Pc(127) Exception local127) {
				local41 = new Class162();
				local41.anInt4801 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)V")
	public static void method1723(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 14);
		local8.method1868();
	}
}
