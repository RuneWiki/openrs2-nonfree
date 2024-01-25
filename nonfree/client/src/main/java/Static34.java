import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public static int anInt9717;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
	public static final int[] anIntArray667 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_211 = new Class151(96, 7);

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_212 = new Class151(46, -2);

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public static void method8330() {
		if (!Static141.method2475()) {
			return;
		}
		if (Static489.aStringArray40 == null) {
			Static482.method6606();
		}
		Static61.aBoolean86 = true;
		Static132.anInt2496 = 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIZI)V")
	public static void method8331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(20) Class4_Sub54 local20 = (Class4_Sub54) Static31.aClass66_43.method1994(local14);
		if (local20 == null) {
			local20 = new Class4_Sub54();
			Static31.aClass66_43.method1985(local20, local14);
		}
		if (local20.anIntArray723.length <= arg4) {
			@Pc(45) int[] local45 = new int[arg4 + 1];
			@Pc(50) int[] local50 = new int[arg4 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray723.length; local52++) {
				local45[local52] = local20.anIntArray723[local52];
				local50[local52] = local20.anIntArray721[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray723.length; local78 < arg4; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray723 = local45;
			local20.anIntArray721 = local50;
		}
		local20.anIntArray723[arg4] = arg2;
		local20.anIntArray721[arg4] = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method8332() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static109.aBooleanArray4[local8] = true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JZIBI)Ljava/lang/String;")
	public static String method8333(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			local25 = true;
			arg0 = -arg0;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg3 > 0) {
			for (local48 = 0; local48 < arg3; local48++) {
				local53 = (int) arg0;
				arg0 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg0 * 10));
			}
			local41.append(local7);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg0;
			arg0 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg1) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}
}
