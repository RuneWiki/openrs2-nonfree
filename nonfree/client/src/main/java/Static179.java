import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Z")
	public static boolean aBoolean321 = false;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_27 = new Class169(8);

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static int anInt4295 = -1;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public static int anInt4296 = -1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ua;)V")
	public static void method3749(@OriginalArg(1) Class2_Sub11_Sub2 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static229.anInt5073; local12++) {
			@Pc(18) int local18 = Static210.anIntArray244[local12];
			@Pc(22) Class3_Sub1_Sub3_Sub3_Sub2 local22 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local18];
			@Pc(26) int local26 = arg0.method8383();
			if ((local26 & 0x40) != 0) {
				local26 += arg0.method8383() << 8;
			}
			if ((local26 & 0x4000) != 0) {
				local26 += arg0.method8383() << 16;
			}
			Static381.method6296(arg0, local18, local26, local22);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILclient!wm;I)V")
	public static void method3751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub52 arg3) {
		arg3.aClass2_Sub11_Sub2_7.method8387(arg0);
		arg3.aClass2_Sub11_Sub2_7.method8333(arg2);
		arg3.aClass2_Sub11_Sub2_7.method8333(arg1);
	}
}
