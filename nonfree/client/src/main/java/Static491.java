import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
	public static int anInt8353;

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
	public static int anInt8354;

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
	public static int anInt8355;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
	public static int anInt8356;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_8 = new Class379("", 14);

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lclient!iv;")
	public static final Class168 aClass168_11 = new Class168(1);

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
	public static int anInt8357 = 1;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
	public static void method7205() {
		@Pc(7) int local7 = Static174.anInt3362;
		@Pc(9) int[] local9 = Static495.anIntArray529;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class9_Sub2_Sub1_Sub2_Sub1 local24 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local9[local16]];
			if (local24 != null && local24.anInt10187 > 0) {
				local24.anInt10187--;
				if (local24.anInt10187 == 0) {
					local24.aString107 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static596.anInt9702; local54++) {
			@Pc(61) long local61 = (long) Static43.anIntArray50[local54];
			@Pc(67) Class3_Sub43 local67 = (Class3_Sub43) Static545.aClass25_40.method426(local61);
			if (local67 != null) {
				@Pc(72) Class9_Sub2_Sub1_Sub2_Sub2 local72 = local67.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				if (local72.anInt10187 > 0) {
					local72.anInt10187--;
					if (local72.anInt10187 == 0) {
						local72.aString107 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method7207(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString41 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(60) String local60 = local53.readLine();
		while (true) {
			@Pc(63) String local63 = local53.readLine();
			if (local63 == null) {
				return local24 + "| " + local60;
			}
			@Pc(69) int local69 = local63.indexOf(40);
			@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
			@Pc(81) String local81;
			if (local69 == -1) {
				local81 = local63;
			} else {
				local81 = local63.substring(0, local69);
			}
			local81 = local81.trim();
			local81 = local81.substring(local81.lastIndexOf(32) + 1);
			local81 = local81.substring(local81.lastIndexOf(9) + 1);
			local24 = local24 + local81;
			if (local69 != -1 && local76 != -1) {
				@Pc(128) int local128 = local63.indexOf(".java:", local69);
				if (local128 >= 0) {
					local24 = local24 + local63.substring(local128 + 5, local76);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!pia;II)V")
	public static void method7210(@OriginalArg(0) Class267 arg0, @OriginalArg(1) int arg1) {
		if (Static154.anInt3152 >= 50 || (arg0 == null || arg0.anIntArrayArray40 == null || arg1 >= arg0.anIntArrayArray40.length || arg0.anIntArrayArray40[arg1] == null)) {
			return;
		}
		@Pc(39) int local39 = arg0.anIntArrayArray40[arg1][0];
		@Pc(43) int local43 = local39 >> 8;
		@Pc(49) int local49 = local39 >> 5 & 0x7;
		@Pc(66) int local66;
		if (arg0.anIntArrayArray40[arg1].length > 1) {
			local66 = (int) (Math.random() * (double) arg0.anIntArrayArray40[arg1].length);
			if (local66 > 0) {
				local43 = arg0.anIntArrayArray40[arg1][local66];
			}
		}
		local66 = 256;
		if (arg0.anIntArray457 != null && arg0.anIntArray459 != null) {
			local66 = Static395.method6222(arg0.anIntArray457[arg1], arg0.anIntArray459[arg1]);
		}
		if (arg0.aBoolean544) {
			Static84.method7777(255, local43, local66, false, 0, local49);
		} else {
			Static93.method1568(local43, local66, 255, local49, 0);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BLclient!dc;)Lclient!tca;")
	public static Class35_Sub3 method7211(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(9) Class35 local9 = Static232.method3992(arg0);
		@Pc(13) int local13 = arg0.method5585();
		@Pc(17) int local17 = arg0.method5585();
		return new Class35_Sub3(local9.aClass293_11, local9.aClass15_12, local9.anInt9052, local9.anInt9054, local9.anInt9053, local9.anInt9046, local9.anInt9050, local9.anInt9045, local9.anInt9055, local13, local17);
	}
}
