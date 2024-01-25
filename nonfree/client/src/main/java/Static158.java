import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
	public static int[] anIntArray634;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
	public static final int[] anIntArray632 = new int[3];

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public static int anInt5619 = 13156520;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	public static final int[] anIntArray633 = new int[6];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!dp;Z)Lclient!mi;")
	public static Class6_Sub26 method5098(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(8) byte[] local8 = arg1.method1014(arg0);
		return local8 == null ? null : new Class6_Sub26(local8);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)Z")
	public static boolean method5099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface7 local9 = (Interface7) Static9.method161(arg1, arg0, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static197.method4803(local9) & true;
		}
		local9 = (Interface7) Static162.method3236(arg1, arg0, arg2, sc.class);
		if (local9 != null) {
			local11 &= Static197.method4803(local9);
		}
		local9 = (Interface7) Static68.method4012(arg1, arg0, arg2);
		if (local9 != null) {
			local11 &= Static197.method4803(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!vj;ILjava/lang/String;I)Lclient!ue;")
	public static Class196 method5100(@OriginalArg(0) Class206 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method5510(arg1);
		}
		@Pc(36) Class196 local36;
		if (arg2 == 1) {
			try {
				Static365.method3242(new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg1)).toString() }, "openjs", arg0.anApplet1);
				local36 = new Class196();
				local36.anInt5851 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class196();
				local36.anInt5851 = 2;
				return local36;
			}
		} else if (arg2 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_blank");
				local36 = new Class196();
				local36.anInt5851 = 1;
				return local36;
			} catch (@Pc(78) Exception local78) {
				local36 = new Class196();
				local36.anInt5851 = 2;
				return local36;
			}
		} else if (arg2 == 3) {
			try {
				Static365.method3241(arg0.anApplet1, "loggedout");
			} catch (@Pc(106) Throwable local106) {
			}
			@Pc(122) Class196 local122;
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_top");
				local122 = new Class196();
				local122.anInt5851 = 1;
				return local122;
			} catch (@Pc(128) Exception local128) {
				local122 = new Class196();
				local122.anInt5851 = 2;
				return local122;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5101(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static110.aStringArray13.length; local12++) {
			if (Static110.aStringArray13[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
