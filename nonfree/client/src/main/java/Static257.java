import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
	public static int anInt4642;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_149 = new Class202("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
	public static int anInt4643 = -1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method4024(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static19.aHashtable1.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(31) File local31 = (File) Static517.aHashtable7.get(arg0);
		if (local31 != null) {
			try {
				local31 = new File(local31.getCanonicalPath());
				@Pc(42) Class local42 = Class.forName("java.lang.Runtime");
				@Pc(45) Class local45 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(55) Method local55 = local45.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(71) Method local71 = local42.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local55.invoke(local71, Boolean.TRUE);
				local71.invoke(Runtime.getRuntime(), arg1, local31.getPath());
				local55.invoke(local71, Boolean.FALSE);
				Static19.aHashtable1.put(arg0, arg1);
				return true;
			} catch (@Pc(114) NoSuchMethodException local114) {
				System.load(local31.getPath());
				Static19.aHashtable1.put(arg0, cn.class);
				return true;
			} catch (@Pc(132) Throwable local132) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BILjava/awt/Canvas;Lclient!n;)Lclient!qa;")
	public static Class39 method4025(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface12 arg2) {
		return new Class39_Sub3(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([[B[BII[[B[II[I)I")
	public static int method4027(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg2];
		@Pc(15) int local15 = arg5[arg2] + local9;
		@Pc(19) int local19 = arg6[arg3];
		@Pc(25) int local25 = arg5[arg3] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg1[arg2] & 0xFF;
		if ((arg1[arg3] & 0xFF) < local49) {
			local49 = arg1[arg3] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg0[arg2];
		@Pc(74) byte[] local74 = arg4[arg3];
		@Pc(78) int local78 = local27 - local9;
		@Pc(83) int local83 = local27 - local19;
		for (@Pc(85) int local85 = local27; local85 < local38; local85++) {
			@Pc(98) int local98 = local70[local78++] + local74[local83++];
			if (local98 < local49) {
				local49 = local98;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIIII)V")
	public static void method4030(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static106.method1964(arg3)) {
			Static20.method548(arg1, arg0, Static235.aClass310ArrayArray2[arg3], arg2, -1);
		}
	}
}
