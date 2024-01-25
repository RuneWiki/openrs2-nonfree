import java.awt.Canvas;
import java.awt.Color;
import java.lang.reflect.Constructor;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!g;")
	public static Class83 aClass83_89;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public static int anInt4929;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_143 = new Class208(16, -1);

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static33.anIntArrayArrayArray2[arg0][local16][local20] == -Static301.anInt5604) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static162.anInt3362) + 1;
			@Pc(142) int local142 = (arg3 << Static162.anInt3362) + 2;
			@Pc(151) int local151 = Static128.aClass149Array1[arg0].method5837(arg1, arg3) + arg5;
			if (!Static151.method3887(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static162.anInt3362) - 1;
			if (!Static151.method3887(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static162.anInt3362) - 1;
			if (!Static151.method3887(local20, local151, local177)) {
				return false;
			} else if (Static151.method3887(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static69.method1256(arg0, arg1, arg3)) {
			local16 = arg1 << Static162.anInt3362;
			local20 = arg3 << Static162.anInt3362;
			return Static151.method3887(local16 + 1, Static128.aClass149Array1[arg0].method5837(arg1, arg3) + arg5, local20 + 1) && Static151.method3887(local16 + Static169.anInt5687 - 1, Static128.aClass149Array1[arg0].method5837(arg1 + 1, arg3) + arg5, local20 + 1) && Static151.method3887(local16 + Static169.anInt5687 - 1, Static128.aClass149Array1[arg0].method5837(arg1 + 1, arg3 + 1) + arg5, local20 + Static169.anInt5687 - 1) && Static151.method3887(local16 + 1, Static128.aClass149Array1[arg0].method5837(arg1, arg3 + 1) + arg5, local20 + Static169.anInt5687 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!ab;Z)Ljava/lang/String;")
	public static String method4423(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		if (!Static51.method778(arg1).method3755(arg0) && arg1.anObjectArray13 == null) {
			return null;
		} else if (arg1.aStringArray1 == null || arg1.aStringArray1.length <= arg0 || arg1.aStringArray1[arg0] == null || arg1.aStringArray1[arg0].trim().length() == 0) {
			return Static119.aBoolean188 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray1[arg0];
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!kd;ILjava/awt/Canvas;Lclient!eg;I)Lclient!oj;")
	public static Class48 method4424(@OriginalArg(0) int arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) Interface3 arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class48_Sub2");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, eg.class, Integer.TYPE, Integer.TYPE, kd.class);
			return (Class48) local57.newInstance(arg3, arg4, Integer.valueOf(arg2), new Integer(arg0), arg1);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ab;B)Ljava/lang/String;")
	public static String method4425(@OriginalArg(0) Class3 arg0) {
		if (Static51.method778(arg0).method3759() == 0) {
			return null;
		} else if (arg0.aString1 == null || arg0.aString1.trim().length() == 0) {
			return Static119.aBoolean188 ? "Hidden-use" : null;
		} else {
			return arg0.aString1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!kd;)[Lclient!ep;")
	public static Class68[] method4426(@OriginalArg(1) Class123 arg0) {
		if (!arg0.method3253()) {
			return new Class68[0];
		}
		@Pc(16) Class86 local16 = arg0.method3261();
		while (local16.anInt2590 == 0) {
			Static215.method3855(10L);
		}
		if (local16.anInt2590 == 2) {
			return new Class68[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject2;
		@Pc(43) Class68[] local43 = new Class68[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class68 local51 = new Class68();
			local43[local45] = local51;
			local51.anInt1896 = local37[local45 << 2];
			local51.anInt1899 = local37[(local45 << 2) + 1];
			local51.anInt1895 = local37[(local45 << 2) + 2];
			local51.anInt1890 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
