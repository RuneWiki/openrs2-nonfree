import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!pg;")
	public static Class260 aClass260_2;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjava/lang/String;III)V")
	public static void method7908(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static1.method8533(null, arg1, false, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!kba;I)V")
	public static void method7910(@OriginalArg(0) Class2_Sub3_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt6278 - Static251.anInt5580;
		@Pc(20) int local20 = arg0.anInt6330 * 512 + arg0.method5308() * 256;
		@Pc(32) int local32 = arg0.anInt6298 * 512 + arg0.method5308() * 256;
		arg0.anInt10428 += (local20 - arg0.anInt10428) / local9;
		arg0.anInt10424 += (local32 - arg0.anInt10424) / local9;
		arg0.anInt6345 = 0;
		if (arg0.anInt6271 == 0) {
			arg0.method5319(8192);
		}
		if (arg0.anInt6271 == 1) {
			arg0.method5319(12288);
		}
		if (arg0.anInt6271 == 2) {
			arg0.method5319(0);
		}
		if (arg0.anInt6271 == 3) {
			arg0.method5319(4096);
		}
	}
}
