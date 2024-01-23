import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class95 {

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	private int anInt2934;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class95() {
		@Pc(4) int local4 = Static265.method4171(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static265.method4171(5);
		@Pc(16) int local16 = 0;
		this.anIntArray248 = new int[local14];
		@Pc(22) int local22;
		@Pc(28) int local28;
		for (local22 = 0; local22 < local14; local22++) {
			local28 = Static265.method4171(4);
			this.anIntArray248[local22] = local28;
			if (local28 >= local16) {
				local16 = local28 + 1;
			}
		}
		this.anIntArray246 = new int[local16];
		this.anIntArray251 = new int[local16];
		this.anIntArray247 = new int[local16];
		this.anIntArrayArray22 = new int[local16][];
		@Pc(101) int local101;
		for (local22 = 0; local22 < local16; local22++) {
			this.anIntArray246[local22] = Static265.method4171(3) + 1;
			local28 = this.anIntArray251[local22] = Static265.method4171(2);
			if (local28 != 0) {
				this.anIntArray247[local22] = Static265.method4171(8);
			}
			local28 = 0x1 << local28;
			@Pc(94) int[] local94 = new int[local28];
			this.anIntArrayArray22[local22] = local94;
			for (local101 = 0; local101 < local28; local101++) {
				local94[local101] = Static265.method4171(8) - 1;
			}
		}
		this.anInt2934 = Static265.method4171(2) + 1;
		local22 = Static265.method4171(4);
		local28 = 2;
		@Pc(128) int local128;
		for (local128 = 0; local128 < local14; local128++) {
			local28 += this.anIntArray246[this.anIntArray248[local128]];
		}
		this.anIntArray249 = new int[local28];
		this.anIntArray249[0] = 0;
		this.anIntArray249[1] = 0x1 << local22;
		local28 = 2;
		for (local128 = 0; local128 < local14; local128++) {
			local101 = this.anIntArray248[local128];
			for (@Pc(173) int local173 = 0; local173 < this.anIntArray246[local101]; local173++) {
				this.anIntArray249[local28++] = Static265.method4171(local22);
			}
		}
		if (Static149.anIntArray250 == null || Static149.anIntArray250.length < local28) {
			Static149.anIntArray250 = new int[local28];
			Static149.anIntArray252 = new int[local28];
			Static149.aBooleanArray11 = new boolean[local28];
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	private void method2521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static149.anIntArray250[arg0];
		@Pc(13) int local13 = Static149.anIntArray252[arg0];
		@Pc(17) boolean local17 = Static149.aBooleanArray11[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(28) int local28 = Static149.anIntArray250[local21];
			if (local28 < local9) {
				Static149.anIntArray250[local5] = local28;
				Static149.anIntArray252[local5] = Static149.anIntArray252[local21];
				Static149.aBooleanArray11[local5] = Static149.aBooleanArray11[local21];
				local5++;
				Static149.anIntArray250[local21] = Static149.anIntArray250[local5];
				Static149.anIntArray252[local21] = Static149.anIntArray252[local5];
				Static149.aBooleanArray11[local21] = Static149.aBooleanArray11[local5];
			}
		}
		Static149.anIntArray250[local5] = local9;
		Static149.anIntArray252[local5] = local13;
		Static149.aBooleanArray11[local5] = local17;
		this.method2521(arg0, local5 - 1);
		this.method2521(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([FI)V")
	public void method2523(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray249.length;
		@Pc(10) int local10 = Static149.anIntArray245[this.anInt2934 - 1];
		Static149.aBooleanArray11[0] = Static149.aBooleanArray11[1] = true;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(49) int local49;
		@Pc(53) int local53;
		for (local20 = 2; local20 < local3; local20++) {
			local27 = Static149.method2522(Static149.anIntArray250, local20);
			local31 = Static149.method2520(Static149.anIntArray250, local20);
			local49 = this.method2526(Static149.anIntArray250[local27], Static149.anIntArray252[local27], Static149.anIntArray250[local31], Static149.anIntArray252[local31], Static149.anIntArray250[local20]);
			local53 = Static149.anIntArray252[local20];
			@Pc(57) int local57 = local10 - local49;
			@Pc(68) int local68 = (local57 < local49 ? local57 : local49) << 1;
			if (local53 == 0) {
				Static149.aBooleanArray11[local20] = false;
				Static149.anIntArray252[local20] = local49;
			} else {
				Static149.aBooleanArray11[local27] = Static149.aBooleanArray11[local31] = true;
				Static149.aBooleanArray11[local20] = true;
				if (local53 >= local68) {
					Static149.anIntArray252[local20] = local57 > local49 ? local53 + local49 - local49 : local49 - local53 + local57 - 1;
				} else {
					Static149.anIntArray252[local20] = (local53 & 0x1) == 0 ? local49 + local53 / 2 : local49 - (local53 + 1) / 2;
				}
			}
		}
		this.method2521(0, local3 - 1);
		local20 = 0;
		local27 = Static149.anIntArray252[0] * this.anInt2934;
		for (local31 = 1; local31 < local3; local31++) {
			if (Static149.aBooleanArray11[local31]) {
				local49 = Static149.anIntArray250[local31];
				local53 = Static149.anIntArray252[local31] * this.anInt2934;
				this.method2527(local20, local27, local49, local53, arg0, arg1);
				if (local49 >= arg1) {
					return;
				}
				local20 = local49;
				local27 = local53;
			}
		}
		@Pc(193) float local193 = Static149.aFloatArray10[local27];
		for (local49 = local20; local49 < arg1; local49++) {
			arg0[local49] *= local193;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()Z")
	public boolean method2525() {
		@Pc(5) boolean local5 = Static265.method4173() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray249.length;
		@Pc(15) int local15;
		for (local15 = 0; local15 < local13; local15++) {
			Static149.anIntArray250[local15] = this.anIntArray249[local15];
		}
		local15 = Static149.anIntArray245[this.anInt2934 - 1];
		@Pc(40) int local40 = Static63.method2810(local15 - 1);
		Static149.anIntArray252[0] = Static265.method4171(local40);
		Static149.anIntArray252[1] = Static265.method4171(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray248.length; local54++) {
			@Pc(64) int local64 = this.anIntArray248[local54];
			@Pc(69) int local69 = this.anIntArray246[local64];
			@Pc(74) int local74 = this.anIntArray251[local64];
			@Pc(80) int local80 = (0x1 << local74) - 1;
			@Pc(82) int local82 = 0;
			if (local74 > 0) {
				local82 = Static265.aClass147Array1[this.anIntArray247[local64]].method3579();
			}
			for (@Pc(94) int local94 = 0; local94 < local69; local94++) {
				@Pc(106) int local106 = this.anIntArrayArray22[local64][local82 & local80];
				local82 >>>= local74;
				Static149.anIntArray252[local52++] = local106 >= 0 ? Static265.aClass147Array1[local106].method3579() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)I")
	private int method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII[FI)V")
	private void method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static149.aFloatArray10[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(61) int local61 = arg0 + 1; local61 < arg2; local61++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4[local61] *= Static149.aFloatArray10[local20];
		}
	}
}
