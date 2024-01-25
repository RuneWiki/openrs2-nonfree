import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!io", name = "N", descriptor = "Lclient!sea;")
	public static Class308 aClass308_91;

	@OriginalMember(owner = "client!io", name = "B", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_52 = new Class208(16, 3);

	@OriginalMember(owner = "client!io", name = "L", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZF)F")
	public static float method3385(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IB)Lclient!kba;")
	public static Class183 method3386(@OriginalArg(0) int arg0) {
		@Pc(15) Class183 local15 = (Class183) Static100.aClass207_7.method4390((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static68.aClass308_29.method6569(1, arg0);
		local15 = new Class183();
		local15.anInt4769 = arg0;
		if (local27 != null) {
			local15.method3794(new Class1_Sub3(local27));
		}
		local15.method3789();
		if (local15.anInt4758 == 2 && Static163.aClass91_7.method2271((long) arg0) == null) {
			Static163.aClass91_7.method2269((long) arg0, new Class1_Sub27(Static312.anInt5722));
			Static63.aClass183Array1[Static312.anInt5722++] = local15;
		}
		Static100.aClass207_7.method4391((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!qh;B)I")
	public static int method3387(@OriginalArg(0) Class11_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(8) Class354 local8 = arg0.aClass354_1;
		if (local8.anIntArray597 != null) {
			local8 = local8.method7683(Static390.aClass353_29);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt9437;
		@Pc(32) Class114 local32 = arg0.method6073();
		if (arg0.anInt7577 == -1 || arg0.aBoolean575) {
			local23 = local8.anInt9393;
		} else if (arg0.anInt7577 == local32.anInt2994 || local32.anInt3009 == arg0.anInt7577 || local32.anInt3023 == arg0.anInt7577 || local32.anInt2993 == arg0.anInt7577) {
			local23 = local8.lb;
		} else if (arg0.anInt7577 == local32.anInt3006 || arg0.anInt7577 == local32.anInt2989 || arg0.anInt7577 == local32.anInt3002 || local32.anInt3018 == arg0.anInt7577) {
			local23 = local8.anInt9427;
		}
		return local23;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static131.aShortArrayArray1 == null ? 0 : Static131.aShortArrayArray1[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)Lclient!de;")
	public static Class57 method3389(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static253.aClass57Array1[arg0] : null;
	}
}
