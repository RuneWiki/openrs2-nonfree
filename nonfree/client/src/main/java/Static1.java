import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILclient!ig;I)J")
	public static long method56(@OriginalArg(1) int arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) long local12 = 4194304L;
		@Pc(14) long local14 = 2147483648L;
		@Pc(16) long local16 = Long.MIN_VALUE;
		@Pc(23) Class129 local23 = Static349.aClass115_4.method2766(arg1.method5176());
		@Pc(44) long local44 = (long) (arg1.method5172() << 14 | arg0 | arg2 << 7 | arg1.method5169() << 20 | 0x40000000);
		if (local23.anInt3504 == 0) {
			local44 |= local16;
		}
		if (local23.anInt3524 == 1) {
			local44 |= local12;
		}
		if (local23.aBoolean212) {
			local44 |= local14;
		}
		return local44 | (long) arg1.method5176() << 32;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!sp;Lclient!sp;I)V")
	public static void method58(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		if (arg1.aClass1_Sub2_58 != null) {
			arg1.method5813();
		}
		arg1.aClass1_Sub2_57 = arg0.aClass1_Sub2_57;
		arg1.aClass1_Sub2_58 = arg0;
		arg1.aClass1_Sub2_58.aClass1_Sub2_57 = arg1;
		arg1.aClass1_Sub2_57.aClass1_Sub2_58 = arg1;
	}
}
