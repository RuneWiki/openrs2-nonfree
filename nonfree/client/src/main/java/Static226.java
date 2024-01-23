import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public static int anInt6054;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt6056 = 0;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString208 = "M";

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Z")
	public static boolean aBoolean403 = true;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt6057 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public static void method4755() {
		Static28.aClass157_6.method4034(5);
		Static154.aClass157_28.method4034(5);
		Static174.aClass157_32.method4034(5);
		Static204.aClass157_35.method4034(5);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ek;BI)Lclient!ob;")
	public static Class93 method4756(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		return Static47.method882(arg0, arg1) ? Static287.method4459() : null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method4757() {
		Static101.aClass16_1.method4239();
		@Pc(14) int local14;
		for (local14 = 0; local14 < 32; local14++) {
			Static297.aLongArray10[local14] = 0L;
		}
		for (local14 = 0; local14 < 32; local14++) {
			Static166.aLongArray5[local14] = 0L;
		}
		Static14.anInt277 = 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZB)V")
	public static void method4758(@OriginalArg(2) boolean arg0) {
		Static107.anInt2456 = 22050;
		Static161.anInt3593 = 2;
		Static49.aBoolean84 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Lclient!vk;")
	public static Class2_Sub8_Sub23 method4759(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub8_Sub23 local6 = (Class2_Sub8_Sub23) Static206.aClass106_7.method2986((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static11.aClass42_3.method1256(26, arg0);
		local6 = new Class2_Sub8_Sub23();
		if (local26 != null) {
			local6.method4573(new Class2_Sub16(local26));
		}
		Static206.aClass106_7.method2990((long) arg0, local6);
		return local6;
	}
}
