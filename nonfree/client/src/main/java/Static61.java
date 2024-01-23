import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!sn;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	public static int anInt1268;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public static int anInt1269;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public static int anInt1270 = -1;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "[Lclient!se;")
	public static Class143_Sub1[] aClass143_Sub1Array2 = new Class143_Sub1[29];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZZZI)V")
	public static void method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= arg5) {
			return;
		}
		@Pc(21) int local21 = (arg2 + arg5) / 2;
		@Pc(23) int local23 = arg2;
		@Pc(27) Class152_Sub1 local27 = Static32.aClass152_Sub1Array1[local21];
		Static32.aClass152_Sub1Array1[local21] = Static32.aClass152_Sub1Array1[arg5];
		Static32.aClass152_Sub1Array1[arg5] = local27;
		for (@Pc(39) int local39 = arg2; local39 < arg5; local39++) {
			if (Static8.method183(arg4, local27, arg1, Static32.aClass152_Sub1Array1[local39], arg3, arg0) <= 0) {
				@Pc(62) Class152_Sub1 local62 = Static32.aClass152_Sub1Array1[local39];
				Static32.aClass152_Sub1Array1[local39] = Static32.aClass152_Sub1Array1[local23];
				Static32.aClass152_Sub1Array1[local23++] = local62;
			}
		}
		Static32.aClass152_Sub1Array1[arg5] = Static32.aClass152_Sub1Array1[local23];
		Static32.aClass152_Sub1Array1[local23] = local27;
		method1027(arg0, arg1, arg2, arg3, arg4, local23 - 1);
		method1027(arg0, arg1, local23 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	public static void method1029(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static163.method3579(10, arg0);
		local4.method1853();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Lclient!t;")
	public static Class152_Sub1 method1032() {
		Static174.anInt3204 = 0;
		return Static126.method1948();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
	public static void method1033() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glDisableClientState(32886);
		Static240.method3787(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static240.method3800();
		for (@Pc(19) int local19 = 0; local19 < Static32.aClass1_Sub25ArrayArray1[0].length; local19++) {
			@Pc(31) Class1_Sub25 local31 = Static32.aClass1_Sub25ArrayArray1[0][local19];
			if (local31.anInt4710 >= 0 && Static165.method2524(Static208.anInterface4_1.method995(local31.anInt4710))) {
				local1.glColor4fv(Static65.method1078(local31.anInt4715), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean352 ? 1.0F : 0.5F);
				local31.method3603(Static130.aClass1_Sub19ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static240.method3775();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static240.method3808();
	}
}
