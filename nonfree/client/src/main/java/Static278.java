import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_56 = new Class303(27, 8);

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public static final int anInt4854 = 1401;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	public static void method4183() {
		Static596.method7951(Static505.aClass45_11, (long) Static506.anInt8251);
		if (Static353.anInt6188 != -1) {
			Static18.method248(Static353.anInt6188);
		}
		for (@Pc(23) int local23 = 0; local23 < Static488.anInt7959; local23++) {
			if (Static319.aBooleanArray17[local23]) {
				Static93.aBooleanArray4[local23] = true;
			}
			Static326.aBooleanArray18[local23] = Static319.aBooleanArray17[local23];
			Static319.aBooleanArray17[local23] = false;
		}
		Static229.anInt4022 = Static506.anInt8251;
		if (Static353.anInt6188 != -1) {
			Static488.anInt7959 = 0;
			Static70.method1497();
		}
		Static505.aClass45_11.JA();
		Static208.method3390(Static505.aClass45_11);
		@Pc(65) int local65 = Static478.method6561();
		if (local65 == -1) {
			local65 = Static69.anInt1582;
		}
		if (local65 == -1) {
			local65 = Static87.anInt5456;
		}
		Static45.method737(local65);
		Static541.anInt8161 = 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!r;IIII)Lclient!da;")
	public static Class60 method4185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(12) Class60 local12 = (Class60) Static247.aClass6_26.method92(local6);
		if (local12 == null) {
			@Pc(22) Class84 local22 = Static416.method5935(Static521.aClass322_141, arg3);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt2725 < 13) {
				local22.method2433();
			}
			local12 = arg2.method7419(local22, 2055, Static338.anInt5645, 64, 768);
			Static247.aClass6_26.method106(local6, local12);
		}
		local12 = local12.method7229((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.M(arg4);
		}
		if (arg0 != 0) {
			local12.MA(arg0);
		}
		if (arg1 != 0) {
			local12.W(arg1);
		}
		if (arg5 != 0) {
			local12.oa(0, arg5, 0);
		}
		return local12;
	}
}
