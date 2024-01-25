import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public static int anInt2517;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!io;B)Lclient!pda;")
	public static Class251_Sub1 method2124(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(7) Class251 local7 = Static480.method6743(arg0);
		@Pc(11) int local11 = arg0.method4410();
		return new Class251_Sub1(local7.anInt6885, local7.aClass314_12, local7.aClass103_18, local7.anInt6883, local7.anInt6884, local11);
	}
}
