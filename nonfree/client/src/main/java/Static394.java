import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!pca", name = "B", descriptor = "Z")
	public static boolean aBoolean520;

	@OriginalMember(owner = "client!pca", name = "F", descriptor = "J")
	public static long aLong192;

	@OriginalMember(owner = "client!pca", name = "D", descriptor = "[J")
	public static final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!pca", name = "G", descriptor = "[S")
	public static short[] aShortArray98 = new short[256];

	@OriginalMember(owner = "client!pca", name = "J", descriptor = "I")
	public static final int anInt7576 = 1406;

	@OriginalMember(owner = "client!pca", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray50 = new String[8];

	@OriginalMember(owner = "client!pca", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(III)Z")
	public static boolean method6249(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static107.method6922(arg1, arg0) | (arg1 & 0x70000) != 0 || Static335.method5481(arg0, arg1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!ih;")
	public static Class4_Sub12 method6250(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(14) Class local14 = Class.forName("Class4_Sub12_Sub2");
			@Pc(18) Class4_Sub12 local18 = (Class4_Sub12) local14.getDeclaredConstructor().newInstance();
			local18.method6131(arg0);
			return local18;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class4_Sub12_Sub1 local29 = new Class4_Sub12_Sub1();
			local29.method6131(arg0);
			return local29;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)I")
	public static int method6252(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static122.method2549(arg0);
	}

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "(III)Z")
	public static boolean method6254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
