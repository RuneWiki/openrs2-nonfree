import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_145 = new Class186(123, 1);

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "[I")
	public static int[] anIntArray459 = null;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	public static void method7024() {
		if (Static699.aFileOutputStream1 != null) {
			try {
				Static699.aFileOutputStream1.close();
			} catch (@Pc(17) IOException local17) {
			}
		}
		Static699.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V")
	public static void method7026() {
		@Pc(1) Class338 local1 = Static595.aClass338_57;
		synchronized (Static595.aClass338_57) {
			Static595.aClass338_57.method8052(5);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	public static void method7027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(10, (long) arg3);
		local9.method630();
		local9.anInt804 = arg1;
		local9.anInt803 = arg2;
		local9.anInt805 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZII)Z")
	public static boolean method7028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!wka;Z)V")
	public static void method7029(@OriginalArg(1) Class19_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = -1;
		@Pc(16) int local16 = 0;
		if (Static269.anInt4883 < arg0.anInt7812) {
			Static24.method9442(arg0);
		} else if (arg0.anInt7814 < Static269.anInt4883) {
			Static405.method6061(arg1, arg0);
			local16 = Static255.anInt4769;
			local14 = Static258.anInt4778;
		} else {
			Static625.method8475(arg0);
		}
		@Pc(97) int local97;
		if (arg0.anInt11204 < 512 || arg0.anInt11211 < 512 || (Static362.anInt8653 - 1) * 512 <= arg0.anInt11204 || (Static206.anInt11291 - 1) * 512 <= arg0.anInt11211) {
			arg0.aClass100_9.method8962(-1);
			for (local97 = 0; local97 < arg0.aClass385Array3.length; local97++) {
				arg0.aClass385Array3[local97].anInt10760 = -1;
				arg0.aClass385Array3[local97].aClass100_11.method8962(-1);
			}
			arg0.anIntArray425 = null;
			local16 = 0;
			local14 = -1;
			arg0.anInt7814 = 0;
			arg0.anInt7812 = 0;
			arg0.anInt11204 = arg0.anIntArray430[0] * 512 + arg0.method6592() * 256;
			arg0.anInt11211 = arg0.lb[0] * 512 + arg0.method6592() * 256;
			arg0.method6609();
		}
		if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == arg0 && (arg0.anInt11204 < 6144 || arg0.anInt11211 < 6144 || (Static362.anInt8653 - 12) * 512 <= arg0.anInt11204 || (Static206.anInt11291 - 12) * 512 <= arg0.anInt11211)) {
			arg0.aClass100_9.method8962(-1);
			for (local97 = 0; local97 < arg0.aClass385Array3.length; local97++) {
				arg0.aClass385Array3[local97].anInt10760 = -1;
				arg0.aClass385Array3[local97].aClass100_11.method8962(-1);
			}
			local14 = -1;
			arg0.anIntArray425 = null;
			arg0.anInt7812 = 0;
			local16 = 0;
			arg0.anInt7814 = 0;
			arg0.anInt11204 = arg0.anIntArray430[0] * 512 + arg0.method6592() * 256;
			arg0.anInt11211 = arg0.lb[0] * 512 + arg0.method6592() * 256;
			arg0.method6609();
		}
		local97 = Static364.method5201(arg0);
		Static605.method8304(arg0);
		Static344.method5027(local14, local16, arg0, local97);
		Static649.method8733(local14, arg0);
		Static460.method6824(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBII)I")
	public static int method7030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7) + (arg2 >> 1);
	}
}
