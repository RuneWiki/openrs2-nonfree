import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public static int anInt4939;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "[S")
	public static short[] aShortArray87;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "[I")
	public static final int[] anIntArray389 = new int[2048];

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString46 = null;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Z")
	public static boolean aBoolean430 = false;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	public static int anInt4941 = 0;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lclient!fq;")
	public static Class74 method4210(@OriginalArg(1) int arg0) {
		@Pc(5) Class107 local5 = Static150.aClass107_17;
		@Pc(16) Class74 local16;
		synchronized (Static150.aClass107_17) {
			local16 = (Class74) Static150.aClass107_17.method3021((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) byte[] local36 = Static210.aClass104_117.method2756(Static80.method1632(arg0), Static204.method3875(arg0));
		local16 = new Class74();
		local16.anInt2071 = arg0;
		if (local36 != null) {
			local16.method2000(new Class2_Sub12(local36));
		}
		local16.method2001();
		if (local16.aBoolean190) {
			local16.aBoolean200 = false;
			local16.anInt2064 = 0;
		}
		if (!Static222.aBoolean607 && local16.aBoolean188) {
			local16.anIntArray164 = null;
			local16.aStringArray13 = null;
		}
		@Pc(77) Class107 local77 = Static150.aClass107_17;
		synchronized (Static150.aClass107_17) {
			Static150.aClass107_17.method3018((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)Lclient!qf;")
	public static Class162 method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) Class24[] local11 = null;
		@Pc(15) Class182 local15 = Static147.method2855(arg1);
		if (local15.anIntArray455 != null) {
			local11 = new Class24[local15.anIntArray455.length];
			for (@Pc(25) int local25 = 0; local25 < local11.length; local25++) {
				@Pc(34) Class181 local34 = Static57.method1231(local15.anIntArray455[local25]);
				local11[local25] = new Class24(local34.anInt5859, local34.anInt5846, local34.anInt5850, local34.anInt5855, local34.anInt5857, local34.anInt5849, local34.anInt5848, local34.aBoolean518);
			}
		}
		return new Class162(local15.anInt5868, local11, local15.anInt5863, arg0, arg2, arg3);
	}
}
