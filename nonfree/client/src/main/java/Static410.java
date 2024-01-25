import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!mia", name = "v", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array5;

	@OriginalMember(owner = "client!mia", name = "u", descriptor = "[I")
	public static final int[] anIntArray184 = new int[25];

	@OriginalMember(owner = "client!mia", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[8];

	@OriginalMember(owner = "client!mia", name = "r", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_45 = new Class397(84, 10);

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILclient!nt;)V")
	public static void method2595(@OriginalArg(1) Class270 arg0) {
		if (arg0.anInt7042 != Static639.anInt9893) {
			return;
		}
		if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4 == null) {
			arg0.anInt6977 = 0;
			arg0.anInt7007 = 0;
			return;
		}
		arg0.anInt6989 = 150;
		arg0.anInt6993 = (int) (Math.sin((double) Static716.anInt11157 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7027 = 5;
		arg0.anInt7007 = Static574.anInt8718;
		arg0.anInt6977 = Static411.method5499(92, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4);
		@Pc(56) Class45 local56 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass45_9;
		if (local56 == null) {
			arg0.aClass45_8 = null;
			return;
		}
		if (arg0.aClass45_8 == null) {
			arg0.aClass45_8 = new Class45_Sub1();
		}
		arg0.anInt7026 = local56.method6577();
		arg0.aClass45_8.method6573(local56);
	}

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "(I)I")
	public static int method2597(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static174.anInt3082 - 1; local3++) {
			if (arg0 < Static124.anIntArray148[local3] + Static583.anIntArray646[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static174.anInt3082 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIIII)V")
	public static void method2598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(172) Class364 local172 = Static448.aClass364ArrayArrayArray2[arg4][arg5][arg2];
			if (local172 == null) {
				local172 = new Class364(arg4);
			}
			if (arg0 == 1) {
				local172.aShort100 = (short) arg3;
				local172.aShort101 = (short) arg1;
			} else if (arg0 == 2) {
				local172.aShort103 = (short) arg3;
				local172.aShort102 = (short) arg1;
			}
			if (Static298.aBoolean294) {
				Static175.method2821();
			}
			return;
		}
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(54) int local54;
		@Pc(64) int local64;
		if (arg0 != 8) {
			local29 = (arg5 << Static626.anInt9669) + Static308.anInt4969;
			local34 = local29 - Static308.anInt4969;
			local38 = arg2 << Static626.anInt9669;
			local42 = Static308.anInt4969 + local38;
			local54 = Static43.aClass259Array1[arg4].method9295(arg2, arg5 + 1);
			local64 = Static43.aClass259Array1[arg4].method9295(arg2 + 1, arg5);
			Static131.aClass108Array4[Static340.anInt5461++] = new Class108(arg0, arg4, local29, local34, local34, local29, local54, local64, local64 - arg1, -arg1 + local54, local38, local42, local42, local38);
			return;
		}
		local29 = arg5 << Static626.anInt9669;
		local34 = local29 + Static308.anInt4969;
		local38 = arg2 << Static626.anInt9669;
		local42 = Static308.anInt4969 + local38;
		local54 = Static43.aClass259Array1[arg4].method9295(arg2, arg5);
		local64 = Static43.aClass259Array1[arg4].method9295(arg2 + 1, arg5 + 1);
		Static131.aClass108Array4[Static340.anInt5461++] = new Class108(arg0, arg4, local29, local34, local34, local29, local54, local64, local64 - arg1, -arg1 + local54, local38, local42, local42, local38);
	}
}
