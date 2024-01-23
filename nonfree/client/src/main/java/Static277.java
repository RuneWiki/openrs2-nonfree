import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	public static int anInt4987;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "I")
	public static int anInt4994;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public static int anInt4986 = 0;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method4285() {
		try {
			if (Static190.anInt3615 == 1) {
				@Pc(17) int local17 = Static217.aClass1_Sub24_Sub4_3.method4664();
				if (local17 > 0 && Static217.aClass1_Sub24_Sub4_3.method4659()) {
					local17 -= Static111.anInt2293;
					if (local17 < 0) {
						local17 = 0;
					}
					Static217.aClass1_Sub24_Sub4_3.method4663(local17);
					return;
				}
				Static217.aClass1_Sub24_Sub4_3.method4652();
				Static217.aClass1_Sub24_Sub4_3.method4649();
				if (Static13.aClass121_11 == null) {
					Static190.anInt3615 = 0;
				} else {
					Static190.anInt3615 = 2;
				}
				Static262.aClass1_Sub26_1 = null;
				Static42.aClass51_1 = null;
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static217.aClass1_Sub24_Sub4_3.method4652();
			Static190.anInt3615 = 0;
			Static13.aClass121_11 = null;
			Static262.aClass1_Sub26_1 = null;
			Static42.aClass51_1 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!nk;ZLclient!nk;II)Lclient!ui;")
	public static Class1_Sub2_Sub22 method4286(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = arg1.method3135(arg2);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
			@Pc(32) byte[] local32 = arg1.method3112(local6[local14], arg2);
			if (local32 == null) {
				local12 = false;
			} else {
				@Pc(53) int local53 = local32[1] & 0xFF | (local32[0] & 0xFF) << 8;
				@Pc(61) byte[] local61 = arg0.method3112(0, local53);
				if (local61 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub22(arg1, arg0, arg2, false);
		} catch (@Pc(94) Exception local94) {
			return null;
		}
	}
}
