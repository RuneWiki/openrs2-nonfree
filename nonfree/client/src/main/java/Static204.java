import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_55 = new Class218(39, -1);

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Lclient!hv;")
	public static final Class146 aClass146_15 = new Class146(8, 1);

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "[I")
	public static final int[] anIntArray353 = new int[8];

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "[I")
	public static final int[] anIntArray354 = new int[1000];

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	public static final int anInt3995 = 1401;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIII)V")
	public static void method3643(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(15) Class28_Sub6 local15 = (Class28_Sub6) Static476.aClass371_4.method8911(); local15 != null; local15 = (Class28_Sub6) Static476.aClass371_4.method8917()) {
			if (Static588.anInt9467 >= local15.anInt8392) {
				local15.method9276();
			} else {
				Static316.method4829((local15.anInt8385 << 9) + 256, arg0 >> 1, arg2 >> 1, local15.anInt8386 * 2, local15.anInt8390, (local15.anInt8387 << 9) + 256);
				Static303.aClass69_6.method8858(Static396.anIntArray551[0] + arg1, 0, local15.anInt8395 | 0xFF000000, local15.aString102, arg3 + Static396.anIntArray551[1]);
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[FI)[F")
	public static float[] method3644(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static684.method5323(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Z")
	public static boolean method3648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)Lclient!jp;")
	public static Class3_Sub25 method3649() {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(518);
		Static54.anIntArray98 = new int[4];
		Static54.anIntArray98[1] = (int) (Math.random() * 9.9999999E7D);
		Static54.anIntArray98[2] = (int) (Math.random() * 9.9999999E7D);
		Static54.anIntArray98[3] = (int) (Math.random() * 9.9999999E7D);
		Static54.anIntArray98[0] = (int) (Math.random() * 9.9999999E7D);
		local8.method8614(10);
		local8.method8588(Static54.anIntArray98[0]);
		local8.method8588(Static54.anIntArray98[1]);
		local8.method8588(Static54.anIntArray98[2]);
		local8.method8588(Static54.anIntArray98[3]);
		return local8;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)[Lclient!hv;")
	public static Class146[] method3650() {
		return new Class146[] { Static198.aClass146_43, Static89.aClass146_9, Static69.aClass146_6, Static215.aClass146_16, Static150.aClass146_21, Static237.aClass146_17, Static633.aClass146_39, Static492.aClass146_28, aClass146_15, Static47.aClass146_5 };
	}
}
