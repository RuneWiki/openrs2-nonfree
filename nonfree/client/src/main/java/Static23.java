import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "Lclient!ka;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
	public static int anInt420;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
	public static int anInt421 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([BIZ)V")
	public static void method344(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static471.aClass6_Sub12_6 == null) {
			Static471.aClass6_Sub12_6 = new Class6_Sub12(20000);
		}
		Static471.aClass6_Sub12_6.method6025(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static67.method951(Static471.aClass6_Sub12_6.aByteArray97);
		Static446.aClass139_Sub1Array2 = new Class139_Sub1[Static213.anInt4004];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static217.anInt4047; local37 <= Static561.anInt7076; local37++) {
			@Pc(43) Class139_Sub1 local43 = Static246.method7301(local37);
			if (local43 != null) {
				Static446.aClass139_Sub1Array2[local35++] = local43;
			}
		}
		Static211.aBoolean213 = false;
		Static435.aLong192 = Static416.method5922();
		Static471.aClass6_Sub12_6 = null;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)Z")
	public static boolean method346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z[Ljava/lang/String;II[S)V")
	public static void method347(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg1) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) String local25 = arg0[local19];
		arg0[local19] = arg0[arg2];
		arg0[arg2] = local25;
		@Pc(39) short local39 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local39;
		for (@Pc(51) int local51 = arg1; local51 < arg2; local51++) {
			if (local25 == null || arg0[local51] != null && (local51 & 0x1) > arg0[local51].compareTo(local25)) {
				@Pc(72) String local72 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local72;
				@Pc(86) short local86 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21++] = local86;
			}
		}
		arg0[arg2] = arg0[local21];
		arg0[local21] = local25;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local39;
		method347(arg0, arg1, local21 - 1, arg3);
		method347(arg0, local21 + 1, arg2, arg3);
	}
}
