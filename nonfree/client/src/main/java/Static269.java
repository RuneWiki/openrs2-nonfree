import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "Lclient!qa;")
	public static Class39 aClass39_7;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
	public static int anInt4936;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
	public static int anInt4939;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[4];

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "Lclient!mba;")
	public static final Class184 aClass184_8 = new Class184();

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString107 = null;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)[Lclient!vv;")
	public static Class306[] method4298() {
		return new Class306[] { Static523.aClass306_4, Static231.aClass306_2, Static324.aClass306_3 };
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)Z")
	public static boolean method4299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static466.method7016(arg1, arg0)) {
			return Static261.method4058(arg1, arg0) | (arg0 & 0xB000) != 0 | Static311.method4813(arg0, arg1) ? true : (Static368.method5871(arg1, arg0) | Static431.method6615(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V")
	public static void method4301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg1, 16);
		local8.method6968();
		local8.anInt8318 = arg0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method4302(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}
}
