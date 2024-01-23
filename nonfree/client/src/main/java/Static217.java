import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
	public static int anInt4265 = -1;

	@OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
	public static volatile int anInt4270 = 0;

	@OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
	public static int anInt4274 = -1;

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "[I")
	public static int[] anIntArray342 = new int[25];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ)V")
	public static void method3425(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte[][] local11;
		if (Static291.aBoolean404 && arg0) {
			local11 = Static70.aByteArrayArray3;
		} else {
			local11 = Static90.aByteArrayArray13;
		}
		@Pc(22) int local22 = Static156.aByteArrayArray10.length;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) byte[] local35 = local11[local24];
			if (local35 != null) {
				@Pc(48) int local48 = (Static278.anIntArray487[local24] >> 8) * 64 - Static290.anInt5497;
				@Pc(59) int local59 = (Static278.anIntArray487[local24] & 0xFF) * 64 - Static118.anInt2409;
				Static82.method1238();
				Static241.method3766(local59, local48, Static56.aClass122Array1, arg0, local35);
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)Lclient!od;")
	public static Class1_Sub1_Sub15 method3426(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub15 local10 = (Class1_Sub1_Sub15) Static36.aClass58_1.method1233((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static175.aClass138_49.method3346(11, arg0);
		local10 = new Class1_Sub1_Sub15();
		if (local22 != null) {
			local10.method3176(new Class1_Sub14(local22));
		}
		Static36.aClass58_1.method1229((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
	public static void method3427() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glDisableClientState(32886);
		Static291.method4331(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static291.method4330();
		for (@Pc(19) int local19 = 0; local19 < Static232.aClass1_Sub20ArrayArray4[0].length; local19++) {
			@Pc(31) Class1_Sub20 local31 = Static232.aClass1_Sub20ArrayArray4[0][local19];
			if (local31.anInt3735 >= 0 && Static143.method2283(Static18.anInterface1_1.method1626(local31.anInt3735))) {
				local1.glColor4fv(Static73.method1183(local31.anInt3741), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean259 ? 1.0F : 0.5F);
				local31.method3044(Static122.aClass1_Sub17ArrayArrayArray3, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static291.method4293();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static291.method4333();
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(III)V")
	public static void method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(13, arg0);
		local8.method294();
		local8.anInt293 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(B)Z")
	public static boolean method3429() {
		if (Static213.aBoolean287) {
			try {
				return !((Boolean) Static324.method4224("showingVideoAd", Static117.aClass117_3.anApplet1));
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}
}
