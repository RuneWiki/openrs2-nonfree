import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
	public static int anInt6495;

	@OriginalMember(owner = "client!nba", name = "D", descriptor = "Lclient!te;")
	public static Class335 aClass335_2;

	@OriginalMember(owner = "client!nba", name = "s", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_103 = new Class171(34, 20);

	@OriginalMember(owner = "client!nba", name = "I", descriptor = "B")
	public static byte aByte90 = -6;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[I[Ljava/lang/String;IB)V")
	public static void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg0; local46++) {
			if (local20 == null || arg2[local46] != null && (local46 & 0x1) > arg2[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local67;
				@Pc(81) int local81 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local81;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method5450(local16 - 1, arg1, arg2, arg3);
		method5450(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5451(@OriginalArg(1) Class95 arg0) {
		if (Static211.aClass302_21.method6608() == 0) {
			return;
		}
		@Pc(51) Class3_Sub50 local51;
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 0) {
			for (local51 = (Class3_Sub50) Static211.aClass302_21.method6603(); local51 != null; local51 = (Class3_Sub50) Static211.aClass302_21.method6605()) {
				Static117.aClass197_2.method4517(arg0, false, local51.anInt10078, local51.anInt10079, local51.aBoolean708 ? Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 : null, Static261.aClass67_5, local51.anInt10076, false, arg0, local51.anInt10080, local51.anInt10077);
				local51.method9034();
			}
			Static184.method2885();
			return;
		}
		if (Static663.aClass95_15 == null) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(36, 32);
			Static663.aClass95_15 = Static599.method6438(Static545.aClass362_122, 0, Static559.anInterface2_11, 0, local21);
			Static663.aClass67_16 = Static663.aClass95_15.method8032(Static362.method5238(Static583.aClass362_138, Static206.anInt3612), Static688.method8597(Static142.aClass362_32, Static206.anInt3612));
		}
		for (local51 = (Class3_Sub50) Static211.aClass302_21.method6603(); local51 != null; local51 = (Class3_Sub50) Static211.aClass302_21.method6605()) {
			Static117.aClass197_2.method4517(Static663.aClass95_15, false, local51.anInt10078, local51.anInt10079, local51.aBoolean708 ? Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 : null, Static663.aClass67_16, local51.anInt10076, false, arg0, local51.anInt10080, local51.anInt10077);
			local51.method9034();
		}
	}
}
