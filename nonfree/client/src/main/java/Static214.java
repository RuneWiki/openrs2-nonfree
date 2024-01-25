import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ni", name = "X", descriptor = "Lclient!ae;")
	public static Class4 aClass4_9;

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_82 = new Class93("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ni", name = "T", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_127 = new Class119(30);

	@OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
	public static int anInt4132 = 0;

	@OriginalMember(owner = "client!ni", name = "V", descriptor = "Lclient!va;")
	public static final Class199 aClass199_21 = new Class199(8);

	@OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
	public static int anInt4133 = 0;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)Lclient!dk;")
	public static Class45 method3803(@OriginalArg(1) int arg0) {
		@Pc(5) Class119 local5 = Static139.aClass119_90;
		@Pc(14) Class45 local14;
		synchronized (Static139.aClass119_90) {
			local14 = (Class45) Static139.aClass119_90.method3311((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static342.aClass191_220.method5459(3, arg0);
		local14 = new Class45();
		if (local30 != null) {
			local14.method1358(new Class2_Sub10(local30));
		}
		@Pc(50) Class119 local50 = Static139.aClass119_90;
		synchronized (Static139.aClass119_90) {
			Static139.aClass119_90.method3308(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)I")
	public static int method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class24.anIntArray36[arg1 * 8192 / arg0] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (arg3 * local21 >> 16);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIII)V")
	public static void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(4, arg3);
		local8.method5537();
		local8.anInt6365 = arg2;
		local8.anInt6362 = arg0;
		local8.anInt6368 = arg1;
	}
}
