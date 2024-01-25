import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "[Lclient!ji;")
	public static final Class179[] aClass179Array1 = new Class179[37];

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!sga;")
	public static Class106 method6440(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class106 local8;
		try {
			local8 = (Class106) Class.forName("Class106_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class106_Sub2();
		}
		local8.aString106 = arg0;
		local8.anInt9885 = arg1;
		return local8;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I")
	public static int method6441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static553.aByteArrayArray46 == null ? 0 : Static553.aByteArrayArray46[arg0][arg1] & 0xFF;
	}
}
