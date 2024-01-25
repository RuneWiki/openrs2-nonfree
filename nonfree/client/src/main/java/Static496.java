import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
	public static int anInt9330;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("9bced750c65ca83ed15cc2afe45853e8f871f132e09381ea1b10cd2f16ee666fb27050fee6d3aa9a80deed0fd5b7a29af317f032e4fac77d29465ca67f281409", 16);

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_128 = new Class90(17, 7);

	@OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
	public static int anInt9339 = 0;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)V")
	public static void method7171(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class4_Sub43 local6 = (Class4_Sub43) Static10.aClass22_11.method895(); local6 != null; local6 = (Class4_Sub43) Static10.aClass22_11.method889()) {
			if (local6.aClass4_Sub21_Sub2_3 != null) {
				Static472.aClass4_Sub21_Sub3_2.method5931(local6.aClass4_Sub21_Sub2_3);
				local6.aClass4_Sub21_Sub2_3 = null;
			}
			if (local6.aClass4_Sub21_Sub2_2 != null) {
				Static472.aClass4_Sub21_Sub3_2.method5931(local6.aClass4_Sub21_Sub2_2);
				local6.aClass4_Sub21_Sub2_2 = null;
			}
			local6.method8193();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class4_Sub43 local54 = (Class4_Sub43) Static414.aClass22_53.method895(); local54 != null; local54 = (Class4_Sub43) Static414.aClass22_53.method889()) {
			if (local54.aClass4_Sub21_Sub2_3 != null) {
				Static472.aClass4_Sub21_Sub3_2.method5931(local54.aClass4_Sub21_Sub2_3);
				local54.aClass4_Sub21_Sub2_3 = null;
			}
			local54.method8193();
		}
		for (@Pc(81) Class4_Sub43 local81 = (Class4_Sub43) Static458.aClass221_32.method5072(); local81 != null; local81 = (Class4_Sub43) Static458.aClass221_32.method5071()) {
			if (local81.aClass4_Sub21_Sub2_3 != null) {
				Static472.aClass4_Sub21_Sub3_2.method5931(local81.aClass4_Sub21_Sub2_3);
				local81.aClass4_Sub21_Sub2_3 = null;
			}
			local81.method8193();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILclient!da;Lclient!eh;III)V")
	public static void method7173(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg1.method2180(arg0.J(), arg0.KA(), arg0.H(), arg0.l(), arg4, arg2, arg3, arg0.OA(), arg0.K(), arg0.za());
		}
	}
}
