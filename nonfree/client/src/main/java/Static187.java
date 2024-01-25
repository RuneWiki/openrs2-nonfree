import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hc", name = "pb", descriptor = "[B")
	public static byte[] aByteArray37;

	@OriginalMember(owner = "client!hc", name = "qb", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array6;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_15 = new Class130();

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lclient!bw;")
	public static final Class3_Sub11_Sub1 aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(7500);

	@OriginalMember(owner = "client!hc", name = "rb", descriptor = "I")
	public static int anInt3653 = 0;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(B)V")
	public static void method3225() {
		for (@Pc(10) Class3_Sub17 local10 = (Class3_Sub17) Static200.aClass130_19.method3543(); local10 != null; local10 = (Class3_Sub17) Static200.aClass130_19.method3551()) {
			if (local10.aBoolean203) {
				local10.method2233();
			}
		}
		for (@Pc(30) Class3_Sub17 local30 = (Class3_Sub17) Static312.aClass130_37.method3543(); local30 != null; local30 = (Class3_Sub17) Static312.aClass130_37.method3551()) {
			if (local30.aBoolean203) {
				local30.method2233();
			}
		}
	}
}
