import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_207 = new Class12(6, 16);

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "[Lclient!dn;")
	public static final Class58[] aClass58Array2 = new Class58[14];

	@OriginalMember(owner = "client!lk", name = "N", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_208 = new Class12(92, 2);

	@OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
	public static int anInt4025 = -2;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIBI)V")
	public static void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static320.aLong161 = 0L;
		@Pc(8) int local8 = Static174.method2768();
		if (arg3 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static447.aClass121_11.method4626()) {
			arg1 = true;
		}
		Static368.method5240(arg0, arg1, arg3, local8, arg2);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!bw;)V")
	public static void method3355(@OriginalArg(1) Class36_Sub1 arg0) {
		arg0.aClass47_1 = null;
		@Pc(16) int local16 = arg0.aClass36_Sub8Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass36_Sub8Array1[local18].aBoolean534 = false;
		}
		@Pc(32) Class242[] local32 = Class1_Sub2_Sub10.aClass242Array1;
		synchronized (Class1_Sub2_Sub10.aClass242Array1) {
			if (local16 < Class1_Sub2_Sub10.aClass242Array1.length && Static10.anIntArray553[local16] < 200) {
				Class1_Sub2_Sub10.aClass242Array1[local16].method5501(arg0);
				@Pc(59) int local59 = Static10.anIntArray553[local16]++;
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method3356(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static278.aBoolean642) {
			try {
				@Pc(25) Class98 local25 = (Class98) Class.forName("Class98_Sub1").getDeclaredConstructor().newInstance();
				local25.method2919(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static278.aBoolean642 = true;
			}
		}
		return arg0;
	}
}
