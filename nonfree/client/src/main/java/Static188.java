import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[J")
	public static final long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public static int anInt3240 = 0;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B[B)Lclient!nc;")
	public static Class1_Sub5_Sub14 method2687(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub5_Sub14 local15 = new Class1_Sub5_Sub14();
		@Pc(20) Class1_Sub28 local20 = new Class1_Sub28(arg0);
		local20.anInt6812 = local20.aByteArray86.length - 2;
		@Pc(31) int local31 = local20.method5335();
		@Pc(42) int local42 = local20.aByteArray86.length - local31 - 12 - 2;
		local20.anInt6812 = local42;
		@Pc(49) int local49 = local20.method5355();
		local15.anInt4769 = local20.method5335();
		local15.anInt4767 = local20.method5335();
		local15.anInt4771 = local20.method5335();
		local15.anInt4766 = local20.method5335();
		@Pc(73) int local73 = local20.method5337();
		@Pc(81) int local81;
		@Pc(87) int local87;
		if (local73 > 0) {
			local15.aClass199Array1 = new Class199[local73];
			for (local81 = 0; local81 < local73; local81++) {
				local87 = local20.method5335();
				@Pc(94) Class199 local94 = new Class199(Static191.method2740(local87));
				local15.aClass199Array1[local81] = local94;
				while (local87-- > 0) {
					@Pc(105) int local105 = local20.method5355();
					@Pc(109) int local109 = local20.method5355();
					local94.method4383((long) local105, new Class1_Sub26(local109));
				}
			}
		}
		local20.anInt6812 = 0;
		local15.aString56 = local20.method5334();
		local15.aStringArray28 = new String[local49];
		local15.anIntArray303 = new int[local49];
		local15.anIntArray304 = new int[local49];
		local81 = 0;
		while (local20.anInt6812 < local42) {
			local87 = local20.method5335();
			if (local87 == 3) {
				local15.aStringArray28[local81] = local20.method5381().intern();
			} else if (local87 >= 100 || local87 == 21 || local87 == 38 || local87 == 39) {
				local15.anIntArray304[local81] = local20.method5337();
			} else {
				local15.anIntArray304[local81] = local20.method5355();
			}
			local15.anIntArray303[local81++] = local87;
		}
		return local15;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Lclient!ja;")
	public static Class1_Sub5_Sub11 method2688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub5_Sub11 local15 = (Class1_Sub5_Sub11) Static106.aClass199_62.method4387((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class1_Sub5_Sub11(arg1, arg0);
			Static106.aClass199_62.method4383(local15.aLong230, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
	public static void method2690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg1 > arg0) {
			for (local14 = arg0; local14 < arg1; local14++) {
				Static67.anIntArrayArray13[local14][arg2] = arg3;
			}
		} else {
			for (local14 = arg1; local14 < arg0; local14++) {
				Static67.anIntArrayArray13[local14][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2692(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static440.method5809(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static446.anInt7396; local25++) {
			@Pc(31) String local31 = Static264.aStringArray29[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static440.method5809(local31);
			if (local31 != null && local31.equals(local20)) {
				Static446.anInt7396--;
				for (@Pc(55) int local55 = local25; local55 < Static446.anInt7396; local55++) {
					Static264.aStringArray29[local55] = Static264.aStringArray29[local55 + 1];
					Static131.aStringArray13[local55] = Static131.aStringArray13[local55 + 1];
					Static80.aStringArray10[local55] = Static80.aStringArray10[local55 + 1];
					Static357.aStringArray42[local55] = Static357.aStringArray42[local55 + 1];
					Static294.aBooleanArray17[local55] = Static294.aBooleanArray17[local55 + 1];
				}
				Static183.anInt3199 = Static18.anInt379;
				Static52.method867(Static42.aClass103_30);
				Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(arg0));
				Static18.aClass1_Sub28_Sub1_1.method5364(arg0);
				break;
			}
		}
	}
}
