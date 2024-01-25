import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!qh;ZLjava/lang/String;)I")
	public static int method2346(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) String arg1) {
		@Pc(14) int local14 = arg0.anInt3520;
		@Pc(18) byte[] local18 = Static540.method7116(arg1);
		arg0.method3134(local18.length);
		arg0.anInt3520 += Static203.aClass49_1.method1531(arg0.anInt3520, local18.length, arg0.aByteArray36, local18, 0);
		return arg0.anInt3520 - local14;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(JJ)J")
	public static long method2347(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
