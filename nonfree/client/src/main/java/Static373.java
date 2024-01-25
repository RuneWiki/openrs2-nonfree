import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "Lclient!fa;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "Lclient!cb;")
	public static Class50 aClass50_109;

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "Z")
	public static volatile boolean aBoolean466 = true;

	@OriginalMember(owner = "client!ml", name = "W", descriptor = "[F")
	public static final float[] aFloatArray44 = new float[4];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lclient!fk;")
	public static Class5_Sub2_Sub4 method5517() {
		@Pc(8) Class5_Sub2_Sub4 local8 = (Class5_Sub2_Sub4) Static524.aClass150_9.method3100();
		if (local8 != null) {
			local8.method8829();
			local8.method8569();
			return local8;
		}
		do {
			local8 = (Class5_Sub2_Sub4) Static428.aClass150_8.method3100();
			if (local8 == null) {
				return null;
			}
			if (local8.method2442() > Static124.method1947()) {
				return null;
			}
			local8.method8829();
			local8.method8569();
		} while ((local8.aLong319 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLclient!hk;)Lclient!hk;")
	public static Class5_Sub14_Sub4 method5519(@OriginalArg(1) Class5_Sub14_Sub4 arg0) {
		@Pc(21) Class5_Sub14_Sub4 local21 = arg0 == null ? new Class5_Sub14_Sub4() : new Class5_Sub14_Sub4(arg0);
		local21.method3220();
		return local21;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public static void method5520() {
		Static72.anInt9084 = 0;
		for (@Pc(7) int local7 = 0; local7 < 2048; local7++) {
			Static628.aClass5_Sub15Array1[local7] = null;
			Static209.aByteArray29[local7] = 1;
			Static105.aClass177Array1[local7] = null;
		}
	}
}
