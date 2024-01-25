import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_107 = new Class194(52, 6);

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "Lclient!fv;")
	public static final Class117 aClass117_4 = new Class117();

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;Z)V")
	public static void method3219(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class3_Sub27 local6 = Static458.method6779();
		local6.aClass3_Sub9_Sub2_2.method5572(Static284.aClass126_7.anInt3445);
		local6.aClass3_Sub9_Sub2_2.method5620(0);
		@Pc(21) int local21 = local6.aClass3_Sub9_Sub2_2.anInt6453;
		local6.aClass3_Sub9_Sub2_2.method5620(641);
		@Pc(30) int[] local30 = Static196.method3128(local6);
		@Pc(34) int local34 = local6.aClass3_Sub9_Sub2_2.anInt6453;
		local6.aClass3_Sub9_Sub2_2.method5638(arg0);
		local6.aClass3_Sub9_Sub2_2.method5620(Static541.anInt9077);
		local6.aClass3_Sub9_Sub2_2.method5638(arg2);
		local6.aClass3_Sub9_Sub2_2.method5579(Static145.aLong103);
		local6.aClass3_Sub9_Sub2_2.method5572(Static455.anInt7738);
		local6.aClass3_Sub9_Sub2_2.method5572(Static431.aClass133_11.anInt3574);
		Static620.method8442(local6.aClass3_Sub9_Sub2_2);
		@Pc(71) String local71 = Static451.aString66;
		local6.aClass3_Sub9_Sub2_2.method5572(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass3_Sub9_Sub2_2.method5638(local71);
		}
		local6.aClass3_Sub9_Sub2_2.method5572(arg1);
		local6.aClass3_Sub9_Sub2_2.method5572(arg3 ? 1 : 0);
		local6.aClass3_Sub9_Sub2_2.anInt6453 += 7;
		local6.aClass3_Sub9_Sub2_2.method5576(local6.aClass3_Sub9_Sub2_2.anInt6453, local30, local34);
		local6.aClass3_Sub9_Sub2_2.method5629(local6.aClass3_Sub9_Sub2_2.anInt6453 - local21);
		Static148.method2572(local6);
		Static187.anInt3550 = 1;
		Static560.anInt9308 = 0;
		Static32.anInt482 = -3;
		Static469.anInt8027 = 0;
		if (arg1 < 13) {
			Static502.aBoolean614 = true;
			Static9.method188();
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)Z")
	public static boolean method3222() {
		return Static471.aBoolean575;
	}
}
