import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	public static int anInt5776;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
	public static int anInt5779;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "[Lclient!ic;")
	public static Class1_Sub19_Sub1[] aClass1_Sub19_Sub1Array4;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	public static int anInt5775 = 0;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
	public static int anInt5777 = -1;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray21 = new byte[250][];

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "[I")
	public static final int[] anIntArray561 = new int[25];

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	public static volatile int anInt5783 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method5038(@OriginalArg(0) Class10_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt4073 - Static282.anInt3516;
		@Pc(20) int local20 = arg0.anInt4040 * 128 + arg0.method3402() * 64;
		@Pc(34) int local34 = arg0.anInt4022 * 128 + arg0.method3402() * 64;
		arg0.anInt4081 = 0;
		arg0.anInt6728 += (local20 - arg0.anInt6728) / local8;
		arg0.anInt6726 += (local34 - arg0.anInt6726) / local8;
		if (arg0.anInt4031 == 0) {
			arg0.method3409(8192);
		}
		if (arg0.anInt4031 == 1) {
			arg0.method3409(12288);
		}
		if (arg0.anInt4031 == 2) {
			arg0.method3409(0);
		}
		if (arg0.anInt4031 == 3) {
			arg0.method3409(4096);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIII)V")
	public static void method5040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static54.method1088(Static60.anInt1399, arg2 + arg0, Static138.anInt6334);
		@Pc(32) int local32 = Static54.method1088(Static60.anInt1399, arg2 - arg0, Static138.anInt6334);
		Static244.method5351(local32, local23, Static319.anIntArrayArray31[arg3], arg1);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(61) int local61;
			@Pc(65) int local65;
			@Pc(85) int local85;
			@Pc(94) int local94;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local61 = arg3 - local9;
				local65 = local9 + arg3;
				if (Static41.anInt1131 <= local65 && Static165.anInt3409 >= local61) {
					local85 = Static54.method1088(Static60.anInt1399, local7 + arg2, Static138.anInt6334);
					local94 = Static54.method1088(Static60.anInt1399, arg2 - local7, Static138.anInt6334);
					if (local65 <= Static165.anInt3409) {
						Static244.method5351(local94, local85, Static319.anIntArrayArray31[local65], arg1);
					}
					if (local61 >= Static41.anInt1131) {
						Static244.method5351(local94, local85, Static319.anIntArrayArray31[local61], arg1);
					}
				}
			}
			local7++;
			local61 = arg3 - local7;
			local65 = local7 + arg3;
			if (Static41.anInt1131 <= local65 && Static165.anInt3409 >= local61) {
				local85 = Static54.method1088(Static60.anInt1399, local9 + arg2, Static138.anInt6334);
				local94 = Static54.method1088(Static60.anInt1399, arg2 - local9, Static138.anInt6334);
				if (Static165.anInt3409 >= local65) {
					Static244.method5351(local94, local85, Static319.anIntArrayArray31[local65], arg1);
				}
				if (local61 >= Static41.anInt1131) {
					Static244.method5351(local94, local85, Static319.anIntArrayArray31[local61], arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
	public static boolean method5048() {
		try {
			return Static109.method1758();
		} catch (@Pc(13) IOException local13) {
			Static287.method5029();
			return true;
		} catch (@Pc(18) Exception local18) {
			@Pc(59) String local59 = "T2 - " + Static74.anInt1559 + "," + Static48.anInt1219 + "," + Static257.anInt5276 + " - " + Static237.anInt4904 + "," + (Static92.anInt1755 + Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0]) + "," + (Static98.anInt1911 + Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0]) + " - ";
			for (@Pc(61) int local61 = 0; local61 < Static237.anInt4904 && local61 < 50; local61++) {
				local59 = local59 + Static142.aClass1_Sub21_Sub2_1.aByteArray82[local61] + ",";
			}
			Static268.method4816(local59, local18);
			Static324.method5503();
			return true;
		}
	}
}
