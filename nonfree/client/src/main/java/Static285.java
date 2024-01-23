import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
	public static int anInt5431 = 3;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Lclient!di;")
	public static Class31 method4284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class31 local14 = local7.aClass31_1;
			local7.aClass31_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4289(@OriginalArg(0) String arg0) {
		if (Static117.aClass1_Sub4Array1 == null) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) long local15 = Static93.method1658(arg0);
		if (local15 == 0L) {
			return;
		}
		while (local11 < Static117.aClass1_Sub4Array1.length && Static117.aClass1_Sub4Array1[local11].aLong205 != local15) {
			local11++;
		}
		if (local11 < Static117.aClass1_Sub4Array1.length && Static117.aClass1_Sub4Array1[local11] != null) {
			Static283.aClass1_Sub11_Sub1_3.method2697(222);
			Static283.aClass1_Sub11_Sub1_3.method2673(Static117.aClass1_Sub4Array1[local11].aLong205);
		}
	}
}
