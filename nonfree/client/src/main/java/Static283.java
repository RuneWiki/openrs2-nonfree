import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public static int anInt6027;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
	public static boolean aBoolean322 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lclient!ij;")
	public static Class1_Sub2_Sub12 method4670(@OriginalArg(1) int arg0) {
		@Pc(25) Class1_Sub2_Sub12 local25 = (Class1_Sub2_Sub12) Static146.aClass155_29.method4358((long) arg0);
		if (local25 != null) {
			return local25;
		}
		local25 = Static233.method4060(Static210.aClass83_140, Static86.aClass83_54, arg0);
		if (local25 != null) {
			Static146.aClass155_29.method4360((long) arg0, local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!c;ILclient!ch;IILclient!ek;)V")
	public static void method4671(@OriginalArg(0) int arg0, @OriginalArg(2) Class25_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class25_Sub1_Sub2 arg6) {
		@Pc(5) Class1_Sub5 local5 = new Class1_Sub5();
		local5.anInt1231 = arg2;
		local5.anInt1223 = arg4 * 128;
		local5.anInt1224 = arg0 * 128;
		if (arg3 != null) {
			local5.anIntArray116 = arg3.anIntArray92;
			local5.anInt1234 = arg3.anInt829 * 128;
			local5.anInt1225 = arg3.anInt844;
			@Pc(160) int local160 = arg3.anInt863;
			@Pc(163) int local163 = arg3.anInt848;
			local5.anInt1235 = arg3.anInt839;
			if (arg5 == 1 || arg5 == 3) {
				local163 = arg3.anInt863;
				local160 = arg3.anInt848;
			}
			local5.anInt1230 = arg3.anInt857;
			local5.anInt1232 = (local163 + arg0) * 128;
			local5.aClass30_1 = arg3;
			local5.anInt1227 = (local160 + arg4) * 128;
			local5.anInt1229 = arg3.anInt869;
			if (arg3.anIntArray93 != null) {
				local5.aBoolean73 = true;
				local5.method926();
			}
			if (local5.anIntArray116 != null) {
				local5.anInt1226 = local5.anInt1235 + (int) ((double) (local5.anInt1225 - local5.anInt1235) * Math.random());
			}
			Static130.aClass131_6.method3799(local5);
		} else if (arg6 != null) {
			local5.aClass25_Sub1_Sub2_1 = arg6;
			@Pc(37) Class143 local37 = arg6.aClass143_1;
			if (local37.anIntArray535 != null) {
				local5.aBoolean73 = true;
				local37 = local37.method4065();
			}
			if (local37 != null) {
				local5.anInt1227 = (local37.anInt5188 + arg4) * 128;
				local5.anInt1232 = (local37.anInt5188 + arg0) * 128;
				local5.anInt1230 = Static158.method2960(arg6);
				local5.anInt1229 = local37.anInt5176;
				local5.anInt1234 = local37.anInt5163 * 128;
			}
			Static234.aClass131_16.method3799(local5);
		} else if (arg1 != null) {
			local5.aClass25_Sub1_Sub1_1 = arg1;
			local5.anInt1232 = (arg1.method1243() + arg0) * 128;
			local5.anInt1227 = (arg1.method1243() + arg4) * 128;
			local5.anInt1230 = Static192.method3418(arg1);
			local5.anInt1229 = arg1.anInt725;
			local5.anInt1234 = arg1.anInt712 * 128;
			Static156.aClass117_13.method3445(local5, Static94.method4774(arg1.aString26));
		}
	}
}
