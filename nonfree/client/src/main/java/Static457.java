import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
	public static int anInt7976;

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "Lclient!qfa;")
	public static final Class276 aClass276_1 = new Class276();

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "Lclient!qfa;")
	public static final Class276 aClass276_2 = new Class276();

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "Lclient!qfa;")
	public static final Class276 aClass276_3 = new Class276();

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "Lclient!qfa;")
	public static final Class276 aClass276_4 = new Class276();

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_76 = new Class269(59, 4);

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "Lclient!kca;")
	public static final Class187 aClass187_13 = new Class187(2);

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!qfa", name = "m", descriptor = "Z")
	public static boolean aBoolean598 = false;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)Z")
	public static boolean method6671() {
		if (Static190.aClass2_Sub5_Sub20_23 == null) {
			return false;
		} else {
			if (Static190.aClass2_Sub5_Sub20_23.anInt10077 >= 2000) {
				Static190.aClass2_Sub5_Sub20_23.anInt10077 -= 2000;
			}
			return Static190.aClass2_Sub5_Sub20_23.anInt10077 == 1001;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
	public static void method6672() {
		Static183.aBoolean337 = false;
		Static539.method7534();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[B)[B")
	public static byte[] method6673(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static649.method4863(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)Z")
	public static boolean method6674(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
