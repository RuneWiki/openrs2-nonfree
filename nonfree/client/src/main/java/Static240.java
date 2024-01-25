import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!js", name = "n", descriptor = "[Lclient!ln;")
	public static final Class192[] aClass192Array1 = new Class192[4];

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([BZI)V")
	public static void method4174(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static204.aClass12_Sub8_3 == null) {
			Static204.aClass12_Sub8_3 = new Class12_Sub8(20000);
		}
		Static204.aClass12_Sub8_3.method5193(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static115.method2385(Static204.aClass12_Sub8_3.aByteArray82);
		Static197.aClass23_Sub1Array1 = new Class23_Sub1[Static527.anInt9426];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static131.anInt2991; local41 <= Static136.anInt3074; local41++) {
			@Pc(47) Class23_Sub1 local47 = Static212.method4973(local41);
			if (local47 != null) {
				Static197.aClass23_Sub1Array1[local39++] = local47;
			}
		}
		Static314.aBoolean457 = false;
		Static146.aLong92 = Static76.method1679();
		Static204.aClass12_Sub8_3 = null;
	}
}
