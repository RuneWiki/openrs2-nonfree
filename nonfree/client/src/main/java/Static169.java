import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Lclient!lm;")
	public static Class134 aClass134_81;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	public static int anInt3544 = -50;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	public static int anInt3547 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public static void method2991(@OriginalArg(0) int arg0) {
		Static208.anInt4361 = arg0;
		@Pc(15) Class37 local15 = Static53.aClass37_25;
		synchronized (Static53.aClass37_25) {
			Static53.aClass37_25.method919();
		}
		local15 = Static354.aClass37_112;
		synchronized (Static354.aClass37_112) {
			Static354.aClass37_112.method919();
		}
		local15 = Static79.aClass37_109;
		synchronized (Static79.aClass37_109) {
			Static79.aClass37_109.method919();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIBZ)Lclient!lm;")
	public static Class134 method2992(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class203 local10 = null;
		if (Static35.aClass171_2 != null) {
			local10 = new Class203(arg1, Static35.aClass171_2, Static348.aClass171Array3[arg1], 1000000);
		}
		Static60.aClass113_Sub1Array1[arg1] = Static85.aClass204_1.method5502(local10, arg1, Static323.aClass203_11);
		if (arg0) {
			Static60.aClass113_Sub1Array1[arg1].method4974();
		}
		return new Class134(Static60.aClass113_Sub1Array1[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIII[I[[B[I[[B)I")
	public static int method2994(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg5[arg2];
		@Pc(15) int local15 = arg3[arg2] + local9;
		@Pc(19) int local19 = arg5[arg1];
		@Pc(25) int local25 = arg3[arg1] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local25 < local15) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg0[arg2] & 0xFF;
		if (local45 > (arg0[arg1] & 0xFF)) {
			local45 = arg0[arg1] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg6[arg2];
		@Pc(70) byte[] local70 = arg4[arg1];
		@Pc(75) int local75 = local27 - local9;
		@Pc(80) int local80 = local27 - local19;
		for (@Pc(82) int local82 = local27; local82 < local34; local82++) {
			@Pc(95) int local95 = local66[local75++] + local70[local80++];
			if (local45 > local95) {
				local45 = local95;
			}
		}
		return -local45;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!nj;Ljava/lang/String;)I")
	public static int method2995(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt6611;
		@Pc(18) byte[] local18 = Static192.method3380(arg1);
		arg0.method5713(local18.length);
		arg0.anInt6611 += Static183.aClass216_1.method5775(arg0.aByteArray82, local18, 0, arg0.anInt6611, local18.length);
		return arg0.anInt6611 - local6;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILjava/lang/String;JLjava/lang/String;IZI)V")
	public static void method2996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) long arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (!Static308.aBoolean499 && Static61.anInt1413 < 500) {
			@Pc(16) int local16 = arg1 == -1 ? Static10.anInt163 : arg1;
			@Pc(27) Class1_Sub12 local27 = new Class1_Sub12(arg2, arg4, local16, arg5, arg3, arg6, arg0);
			Static58.aClass14_4.method300(local27);
			Static61.anInt1413++;
		}
	}
}
