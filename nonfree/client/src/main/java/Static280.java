import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_64 = new Class208(48, 7);

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
	public static final int[] anIntArray420 = new int[14];

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_118 = new Class25(77, 3);

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public static int anInt5044 = -1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!mn;)Lclient!mu;")
	public static Class176 method3978(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class171 arg2) {
		@Pc(10) int local10 = arg2.method3668(arg0);
		if (local10 == -1) {
			return new Class176(0);
		}
		@Pc(23) int[] local23 = arg2.method3670(local10);
		@Pc(35) Class176 local35 = new Class176(local23.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local35.anInt4630) {
				@Pc(53) Class2_Sub17 local53 = new Class2_Sub17(arg2.method3658(local10, local23[local39++]));
				@Pc(57) int local57 = local53.method6129();
				@Pc(61) int local61 = local53.method6148();
				@Pc(65) int local65 = local53.method6138();
				if (!arg1 && local65 == 1) {
					local35.anInt4630--;
				} else {
					local35.anIntArray400[local37] = local57;
					local35.anIntArray399[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
	public static void method3979() {
		if (Static222.aClass129_6 != Static429.aClass129_8) {
			try {
				Static471.method4356(Static94.aClient2, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!mn;)V")
	public static void method3980(@OriginalArg(1) Class171 arg0) {
		Static357.anInt6321 = 0;
		Static227.anInt3811 = 0;
		Static315.aClass97_4 = new Class97();
		Static407.aClass28_Sub2_Sub1_Sub1Array2 = new Class28_Sub2_Sub1_Sub1[1024];
		Static9.method5082(arg0);
		Static45.method699(arg0);
	}
}
