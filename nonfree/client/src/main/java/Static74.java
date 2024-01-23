import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "Z")
	public static boolean aBoolean115;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString39 = "shake:";

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	public static void method1120(@OriginalArg(0) int arg0) {
		if (Static42.anInt863 == 0) {
			Static67.aClass4_Sub9_Sub2_1.method1169(arg0);
		} else {
			Static217.anInt4316 = arg0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(BI)V")
	public static void method1121(@OriginalArg(1) int arg0) {
		Static270.aFloatArray30[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static270.aFloatArray30[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static270.aFloatArray30[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static6.method137(3);
		Static6.method137(4);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)V")
	public static void method1122(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub21 local8 = Static39.method4121(arg0, 10);
		local8.method4361();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V")
	public static void method1123() {
		aString39 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILclient!en;JLclient!en;Lclient!en;)V")
	public static void method1124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class12 arg6, @OriginalArg(7) Class12 arg7) {
		@Pc(3) Class18 local3 = new Class18();
		local3.aClass12_2 = arg4;
		local3.anInt445 = arg1 * 128 + 64;
		local3.anInt449 = arg2 * 128 + 64;
		local3.anInt451 = arg3;
		local3.aLong25 = arg5;
		local3.aClass12_3 = arg6;
		local3.aClass12_1 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class4_Sub11 local42 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1054; local46++) {
				@Pc(55) Class173 local55 = local42.aClass173Array1[local46];
				if ((local55.aLong183 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass12_10.method3355();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt446 = -local34;
		if (Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub11(arg0, arg1, arg2);
		}
		Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass18_1 = local3;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!cc;I)Lclient!cc;")
	public static Class22 method1125(@OriginalArg(0) Class22 arg0) {
		if (arg0.anInt587 != -1) {
			return Static21.method3453(arg0.anInt587);
		}
		@Pc(26) int local26 = arg0.anInt596 >>> 16;
		@Pc(31) Class167 local31 = new Class167(Static227.aClass97_16);
		for (@Pc(36) Class4_Sub10 local36 = (Class4_Sub10) local31.method3968(); local36 != null; local36 = (Class4_Sub10) local31.method3966()) {
			if (local36.anInt1032 == local26) {
				return Static21.method3453((int) local36.aLong200);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)I")
	public static int method1127(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
