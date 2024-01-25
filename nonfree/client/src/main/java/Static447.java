import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "[Lclient!je;")
	public static Class12_Sub2[] aClass12_Sub2Array8;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
	public static int anInt10238 = 0;

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
	public static int anInt10239 = -2;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!vn;B)V")
	public static void method8524(@OriginalArg(0) Class12_Sub2_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt2938 - Static87.anInt1951;
		@Pc(25) int local25 = arg0.anInt2905 * 512 + arg0.method2422() * 256;
		@Pc(36) int local36 = arg0.anInt2909 * 512 + arg0.method2422() * 256;
		arg0.anInt11002 += (local36 - arg0.anInt11002) / local9;
		arg0.anInt2967 = 0;
		arg0.anInt10998 += (local25 - arg0.anInt10998) / local9;
		if (arg0.anInt2912 == 0) {
			arg0.method2419(8192);
		}
		if (arg0.anInt2912 == 1) {
			arg0.method2419(12288);
		}
		if (arg0.anInt2912 == 2) {
			arg0.method2419(0);
		}
		if (arg0.anInt2912 == 3) {
			arg0.method2419(4096);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method8525(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static533.aClass137_41 = arg0;
		Static434.anInt7761 = arg1;
		Static267.aBoolean322 = Static434.anInt7761 > 1 && Static533.aClass137_41.method7899();
		Static579.anInt9935 = 9;
		Static222.anInt4166 = 0x1 << Static579.anInt9935;
		Static96.anInt2065 = Static222.anInt4166 >> 1;
		Math.sqrt((double) (Static96.anInt2065 * Static96.anInt2065 + Static96.anInt2065 * Static96.anInt2065));
		Static613.anInt10338 = 4;
		Static28.anInt704 = arg2;
		Static55.anInt1384 = arg3;
		Static64.anInt1476 = arg4;
		Static247.aClass99_1 = Static318.method5027();
		Static620.method8695();
		Static33.aClass58ArrayArrayArray1 = new Class58[4][Static28.anInt704][Static55.anInt1384];
		Static343.aClass51Array1 = new Class51[4];
		if (arg5) {
			Static676.anIntArrayArray62 = new int[Static28.anInt704][Static55.anInt1384];
			Static553.aByteArrayArray46 = new byte[Static28.anInt704][Static55.anInt1384];
			Static75.aShortArrayArray4 = new short[Static28.anInt704][Static55.anInt1384];
			Static646.aClass58ArrayArrayArray3 = new Class58[1][Static28.anInt704][Static55.anInt1384];
			Static473.aClass51Array2 = new Class51[1];
		} else {
			Static676.anIntArrayArray62 = null;
			Static553.aByteArrayArray46 = null;
			Static75.aShortArrayArray4 = null;
			Static646.aClass58ArrayArrayArray3 = null;
			Static473.aClass51Array2 = null;
		}
		if (arg6) {
			Static295.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static260.aClass328Array1 = new Class328[65535];
			Static526.aBooleanArray20 = new boolean[65535];
			Static253.anInt4485 = 0;
		} else {
			Static295.aLongArrayArrayArray1 = null;
			Static260.aClass328Array1 = null;
			Static526.aBooleanArray20 = null;
			Static253.anInt4485 = 0;
		}
		Static357.method5408(false);
		aClass12_Sub2Array8 = new Class12_Sub2[2];
		Static154.aClass12_Sub2Array1 = new Class12_Sub2[2];
		Static177.aClass12_Sub2Array2 = new Class12_Sub2[2];
		Static530.aClass12_Sub2Array6 = new Class12_Sub2[10000];
		Static288.anInt8152 = 0;
		Static601.aClass12_Sub2Array7 = new Class12_Sub2[5000];
		Static415.anInt7536 = 0;
		Static217.aClass12_Sub2_Sub2Array1 = new Class12_Sub2_Sub2[5000];
		Static585.anInt10026 = 0;
		Static255.aBooleanArrayArray2 = new boolean[Static64.anInt1476 + Static64.anInt1476 + 1][Static64.anInt1476 + Static64.anInt1476 + 1];
		Static519.aBooleanArrayArray5 = new boolean[Static64.anInt1476 + Static64.anInt1476 + 2][Static64.anInt1476 + Static64.anInt1476 + 2];
		Static465.anIntArray621 = new int[Static64.anInt1476 + Static64.anInt1476 + 2];
		Static326.aClass23_1 = Static326.aClass23_2;
		if (Static267.aBoolean322) {
			Static256.aBooleanArrayArrayArray2 = new boolean[4][Static64.anInt1476 + Static64.anInt1476 + 1][Static64.anInt1476 + Static64.anInt1476 + 1];
			Static51.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static113.aClass109Array1 != null) {
				Static305.method4467();
			}
			Static113.aClass109Array1 = new Class109[Static434.anInt7761];
			Static533.aClass137_41.method7913(Static113.aClass109Array1.length + 1);
			Static533.aClass137_41.method7926(0);
			for (@Pc(205) int local205 = 0; local205 < Static113.aClass109Array1.length; local205++) {
				Static113.aClass109Array1[local205] = new Class109(local205 + 1, Static533.aClass137_41);
				(new Thread(Static113.aClass109Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static434.anInt7761 == 2) {
				local240 = 4;
				Static535.anInt9236 = 2;
			} else if (Static434.anInt7761 == 3) {
				local240 = 6;
				Static535.anInt9236 = 3;
			} else {
				local240 = 8;
				Static535.anInt9236 = 4;
			}
			Static400.aClass134Array1 = new Class134[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static400.aClass134Array1[local260] = new Class134(Static89.aStringArrayArray1[Static434.anInt7761 - 2][local260]);
			}
		} else {
			Static535.anInt9236 = 1;
		}
		Static133.anIntArray213 = new int[Static535.anInt9236 - 1];
		Static230.anIntArray334 = new int[Static535.anInt9236 - 1];
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!td;Ljava/lang/Object;I)V")
	public static void method8527(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static20.method9254(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method8529(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0.length() > 320 || !Static14.method139()) {
			return;
		}
		Static41.method904();
		Static12.aString1 = arg1;
		Static238.aString49 = arg0;
		Static652.anInt10896 = arg2;
		Static67.method1345(6);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!tea;)V")
	public static void method8530(@OriginalArg(1) Class335 arg0) {
		Static655.aClass335_1 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(III)Z")
	public static boolean method8531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)I")
	public static int method8532() {
		@Pc(12) boolean local12 = false;
		@Pc(14) boolean local14 = false;
		@Pc(16) boolean local16 = false;
		if (Static234.aClass333_5.aBoolean693 && !Static234.aClass333_5.aBoolean694) {
			local12 = true;
			if (Static58.aClass14_Sub11_1.anInt1980 < 512 && Static58.aClass14_Sub11_1.anInt1980 != 0) {
				local12 = false;
			}
			if (Static565.aString98.startsWith("win")) {
				local16 = true;
				local14 = true;
			} else {
				local14 = true;
			}
		}
		if (Static345.aBoolean438) {
			local16 = false;
		}
		if (Static504.aBoolean628) {
			local14 = false;
		}
		if (Static534.aBoolean651) {
			local12 = false;
		}
		if (!local12 && !local14 && !local16) {
			return Static119.method2072();
		}
		@Pc(71) int local71 = -1;
		@Pc(73) int local73 = -1;
		@Pc(75) int local75 = -1;
		if (local12) {
			try {
				local71 = Static428.method6310(2, 1000);
			} catch (@Pc(84) Exception local84) {
			}
		}
		if (local16) {
			try {
				local75 = Static428.method6310(3, 1000);
				if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 3) {
					@Pc(105) Class64 local105 = Static677.aClass137_47.method7953();
					@Pc(110) long local110 = local105.aLong43 & 0xFFFFFFFFFFFFL;
					@Pc(113) int local113 = local105.anInt1799;
					if (local113 == 4318) {
						local14 &= local110 >= 64425238954L;
					} else if (local113 == 4098) {
						local14 &= local110 >= 60129613779L;
					}
				}
			} catch (@Pc(151) Exception local151) {
			}
		}
		if (local14) {
			try {
				local73 = Static428.method6310(1, 1000);
			} catch (@Pc(161) Exception local161) {
			}
		}
		if (local71 == -1 && local73 == -1 && local75 == -1) {
			return Static119.method2072();
		}
		local75 = (int) ((float) local75 * 1.1F);
		local73 = (int) ((float) local73 * 1.1F);
		if (local71 > local75 && local73 < local71) {
			return Static487.method7828(local71);
		} else if (local73 < local75) {
			return Static357.method5410(3, local75);
		} else {
			return Static357.method5410(1, local73);
		}
	}
}
