import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!st", name = "u", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_198 = new Class362(7, 1);

	@OriginalMember(owner = "client!st", name = "y", descriptor = "[I")
	public static final int[] anIntArray481 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!st", name = "C", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_111 = new Class173(14, -1);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!un;I)V")
	public static void method7269(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (Static340.aClass134_3 == null) {
			return;
		}
		try {
			Static340.aClass134_3.method3241(0L);
			Static340.aClass134_3.method3245(24, arg1, arg0.aByteArray68);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([BLclient!dda;II)Lclient!qd;")
	public static Class270 method7271(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class44_Sub2_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static444.anIntArray454, 0);
		if (Static444.anIntArray454[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class270(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)Lclient!n;")
	public static Class225 method7272(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(20) int local20 = arg0 & 0xFFFF;
		if (Static343.aClass225ArrayArray1[local7] == null || Static343.aClass225ArrayArray1[local7][local20] == null) {
			@Pc(34) boolean local34 = Static478.method7175(local7);
			if (!local34) {
				return null;
			}
		}
		return Static343.aClass225ArrayArray1[local7][local20];
	}

	@OriginalMember(owner = "client!st", name = "h", descriptor = "(I)V")
	public static void method7273() {
		Static24.method316();
		Static518.method7586(Static214.aClass4_Sub19_Sub1_1.aBoolean254);
		Static43.aClass80_1 = Static295.method8179(Static406.aClass354_5, 22050, 0, Static475.aCanvas12);
		Static24.method317(Static265.method4455(null));
		Static269.aClass80_3 = Static295.method8179(Static406.aClass354_5, 2048, 1, Static475.aCanvas12);
		Static269.aClass80_3.method5607(Static444.aClass4_Sub7_Sub1_2);
	}
}
