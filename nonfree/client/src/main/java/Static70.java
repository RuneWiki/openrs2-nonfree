import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!el", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString55 = "Loading textures - ";

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(IB)Lclient!dl;")
	public static Class37 method1059(@OriginalArg(0) int arg0) {
		@Pc(6) Class37 local6 = (Class37) Static157.aClass98_24.method2570((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static39.aClass155_21.method4121(33, arg0);
		local6 = new Class37();
		if (local27 != null) {
			local6.method919(arg0, new Class3_Sub26(local27));
		}
		Static157.aClass98_24.method2568(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V")
	public static void method1061() {
		for (@Pc(7) int local7 = 0; local7 < Static11.anInt5178; local7++) {
			@Pc(14) int local14 = Static178.anIntArray405[local7];
			@Pc(18) Class10_Sub5_Sub1 local18 = Static52.aClass10_Sub5_Sub1Array1[local14];
			@Pc(22) int local22 = Static249.aClass3_Sub26_Sub1_3.method3915();
			if ((local22 & 0x40) != 0) {
				local22 += Static249.aClass3_Sub26_Sub1_3.method3915() << 8;
			}
			Static255.method4310(local22, local18, local14);
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V")
	public static void method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static178.aClass98_29 = new Class98(arg0);
		Static252.aClass98_41 = new Class98(arg1);
	}
}
