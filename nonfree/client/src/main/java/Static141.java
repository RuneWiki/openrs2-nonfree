import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!il", name = "V", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!il", name = "Z", descriptor = "Lclient!rn;")
	public static Class205 aClass205_2;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IIB)V", line = 24)
	public static void method2739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub2_Sub7 local16 = Static293.method5414(6, arg0);
		local16.method2313();
		local16.anInt2286 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 53)
	public static String method2741(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)[Lclient!kk;", line = 64)
	public static Class127[] method2742() {
		return new Class127[] { Class132.aClass127_6, Class90.aClass127_8, Class24.aClass127_1, client.aClass127_2, Class12_Sub4.aClass127_7, Class39.aClass127_3 };
	}
}
