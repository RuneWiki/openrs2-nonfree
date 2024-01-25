import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt9943;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!g;")
	public static Class127 aClass127_11;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!s;)V")
	public static void method8272(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1) {
		Static495.aClass109Array4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8273(@OriginalArg(1) String arg0) {
		@Pc(6) Class5_Sub21 local6 = Static63.method894();
		local6.aClass5_Sub41_Sub2_1.method7798(Static146.aClass111_12.anInt3148);
		local6.aClass5_Sub41_Sub2_1.method7848(0);
		@Pc(21) int local21 = local6.aClass5_Sub41_Sub2_1.anInt9230;
		local6.aClass5_Sub41_Sub2_1.method7848(647);
		@Pc(30) int[] local30 = Static249.method3856(local6);
		@Pc(34) int local34 = local6.aClass5_Sub41_Sub2_1.anInt9230;
		local6.aClass5_Sub41_Sub2_1.method7854(arg0);
		local6.aClass5_Sub41_Sub2_1.method7798(Static544.anInt8937);
		local6.aClass5_Sub41_Sub2_1.anInt9230 += 7;
		local6.aClass5_Sub41_Sub2_1.method7844(local34, local30, local6.aClass5_Sub41_Sub2_1.anInt9230);
		local6.aClass5_Sub41_Sub2_1.method7841(local6.aClass5_Sub41_Sub2_1.anInt9230 - local21);
		Static495.method7092(local6);
		Static358.anInt6495 = 0;
		Static83.anInt1914 = 1;
		Static345.anInt6331 = -3;
		Static286.anInt5571 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lclient!vb;")
	public static Class361 method8274(@OriginalArg(0) int arg0) {
		@Pc(10) Class361 local10 = (Class361) Static567.aClass340_58.method7999((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static163.aClass390_36.method8914(0, arg0);
		local10 = new Class361();
		if (local20 != null) {
			local10.method8413(new Class5_Sub41(local20));
		}
		local10.method8414();
		Static567.aClass340_58.method7986((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	public static int method8276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static390.anIntArrayArray33 == null ? 0 : Static390.anIntArrayArray33[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILjava/awt/Component;ILclient!oq;)Lclient!nr;")
	public static Class255 method8277(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class268 arg3) {
		if (Static302.anInt5797 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class255 local30 = (Class255) Class.forName("Class255_Sub2").getDeclaredConstructor().newInstance();
			local30.anInt8773 = arg0;
			local30.anIntArray493 = new int[(Static143.aBoolean243 ? 2 : 1) * 256];
			local30.method7455(arg1);
			local30.anInt8769 = (arg0 & 0xFFFFFC00) + 1024;
			if (local30.anInt8769 > 16384) {
				local30.anInt8769 = 16384;
			}
			local30.method7459(local30.anInt8769);
			if (Static58.anInt859 > 0 && Static610.aClass283_1 == null) {
				Static610.aClass283_1 = new Class283();
				Static610.aClass283_1.aClass268_3 = arg3;
				arg3.method6340(Static610.aClass283_1, Static58.anInt859);
			}
			if (Static610.aClass283_1 != null) {
				if (Static610.aClass283_1.aClass255Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static610.aClass283_1.aClass255Array1[arg2] = local30;
			}
			return local30;
		} catch (@Pc(112) Throwable local112) {
			try {
				@Pc(118) Class255_Sub1 local118 = new Class255_Sub1(arg3, arg2);
				local118.anInt8773 = arg0;
				local118.anIntArray493 = new int[(Static143.aBoolean243 ? 2 : 1) * 256];
				local118.method7455(arg1);
				local118.anInt8769 = 16384;
				local118.method7459(local118.anInt8769);
				if (Static58.anInt859 > 0 && Static610.aClass283_1 == null) {
					Static610.aClass283_1 = new Class283();
					Static610.aClass283_1.aClass268_3 = arg3;
					arg3.method6340(Static610.aClass283_1, Static58.anInt859);
				}
				if (Static610.aClass283_1 != null) {
					if (Static610.aClass283_1.aClass255Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static610.aClass283_1.aClass255Array1[arg2] = local118;
				}
				return local118;
			} catch (@Pc(182) Throwable local182) {
				return new Class255();
			}
		}
	}
}
