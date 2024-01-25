import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public static int anInt7922 = 0;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
	public static int anInt7923 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!rv;Z)Lclient!hha;")
	public static Class110_Sub1_Sub1 method6728(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) Class110_Sub1 local7 = Static136.method2042(arg0);
		@Pc(20) int local20 = arg0.method3638();
		return new Class110_Sub1_Sub1(local7.aClass112_16, local7.aClass4_11, local7.anInt8734, local7.anInt8739, local7.anInt8729, local7.anInt8731, local7.anInt8738, local7.anInt8732, local7.anInt8733, local7.anInt3556, local7.anInt3560, local7.anInt3563, local7.anInt3558, local7.anInt3559, local7.anInt3561, local20);
	}
}
