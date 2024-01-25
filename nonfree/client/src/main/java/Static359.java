import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public static int anInt6421;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Lclient!ns;")
	public static Class166 aClass166_251;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "I")
	public static int anInt6427;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
	public static final int[] anIntArray560 = new int[13];

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt6422 = 0;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	public static int anInt6423 = 2;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_116 = new Class36(32, 7);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!qa;IIIB)Lclient!c;")
	public static Class7 method4999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(12) Class7 local12 = (Class7) Static86.aClass69_60.method1591(local6);
		if (local12 == null) {
			@Pc(22) Class208 local22 = Static219.method3103(arg1, Static207.aClass166_151);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt6202 < 13) {
				local22.method4813();
			}
			local12 = arg2.method4655(local22, 2055, Static54.anInt7604, 64, 768);
			Static86.aClass69_60.method1590(local6, local12);
		}
		local12 = local12.method4077((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.k(arg4);
		}
		if (arg3 != 0) {
			local12.WA(arg3);
		}
		if (arg5 != 0) {
			local12.o(arg5);
		}
		if (arg0 != 0) {
			local12.ja(0, arg0, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!tl;I)V")
	public static void method5001(@OriginalArg(0) Class4_Sub30 arg0) {
		if (arg0.aByteArray79.length - arg0.anInt6244 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4864();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray79.length - arg0.anInt6244 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method4877();
		if (arg0.aByteArray79.length - arg0.anInt6244 != local44 * 6) {
			return;
		}
		while (true) {
			@Pc(59) int local59;
			@Pc(63) int local63;
			do {
				do {
					do {
						if (arg0.anInt6244 >= arg0.aByteArray79.length) {
							return;
						}
						local59 = arg0.method4877();
						local63 = arg0.method4872();
					} while (Static327.anIntArray505.length <= local59);
				} while (!Static291.aBooleanArray18[local59]);
			} while (Static254.aClass189_1.method4328(local59).aChar1 == '1' && (local63 < -1 || local63 > 1));
			Static327.anIntArray505[local59] = local63;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lclient!mb;")
	public static Class153 method5002(@OriginalArg(1) int arg0) {
		@Pc(10) Class153 local10 = (Class153) Static393.aClass69_68.method1591((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static440.aClass166_295.method3696(arg0, 1);
		local10 = new Class153();
		local10.anInt4412 = arg0;
		if (local25 != null) {
			local10.method3323(new Class4_Sub30(local25));
		}
		local10.method3324();
		if (local10.anInt4405 == 2 && Static98.aClass196_6.method4477((long) arg0) == null) {
			Static98.aClass196_6.method4474((long) arg0, new Class4_Sub15(Static363.anInt6460));
			Static439.aClass153Array1[Static363.anInt6460++] = local10;
		}
		Static393.aClass69_68.method1590((long) arg0, local10);
		return local10;
	}
}
