import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class8 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class8() {
		@Pc(4) int local4 = Static182.method3055(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static182.method3055(5);
		@Pc(16) int local16 = 0;
		this.anIntArray23 = new int[local14];
		@Pc(22) int local22;
		@Pc(28) int local28;
		for (local22 = 0; local22 < local14; local22++) {
			local28 = Static182.method3055(4);
			this.anIntArray23[local22] = local28;
			if (local28 >= local16) {
				local16 = local28 + 1;
			}
		}
		this.anIntArray24 = new int[local16];
		this.anIntArray25 = new int[local16];
		this.anIntArray28 = new int[local16];
		this.anIntArrayArray2 = new int[local16][];
		@Pc(101) int local101;
		for (local22 = 0; local22 < local16; local22++) {
			this.anIntArray24[local22] = Static182.method3055(3) + 1;
			local28 = this.anIntArray25[local22] = Static182.method3055(2);
			if (local28 != 0) {
				this.anIntArray28[local22] = Static182.method3055(8);
			}
			local28 = 0x1 << local28;
			@Pc(94) int[] local94 = new int[local28];
			this.anIntArrayArray2[local22] = local94;
			for (local101 = 0; local101 < local28; local101++) {
				local94[local101] = Static182.method3055(8) - 1;
			}
		}
		this.anInt247 = Static182.method3055(2) + 1;
		local22 = Static182.method3055(4);
		local28 = 2;
		@Pc(128) int local128;
		for (local128 = 0; local128 < local14; local128++) {
			local28 += this.anIntArray24[this.anIntArray23[local128]];
		}
		this.anIntArray29 = new int[local28];
		this.anIntArray29[0] = 0;
		this.anIntArray29[1] = 0x1 << local22;
		local28 = 2;
		for (local128 = 0; local128 < local14; local128++) {
			local101 = this.anIntArray23[local128];
			for (@Pc(173) int local173 = 0; local173 < this.anIntArray24[local101]; local173++) {
				this.anIntArray29[local28++] = Static182.method3055(local22);
			}
		}
		if (Static11.anIntArray30 == null || Static11.anIntArray30.length < local28) {
			Static11.anIntArray30 = new int[local28];
			Static11.anIntArray26 = new int[local28];
			Static11.aBooleanArray6 = new boolean[local28];
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)I")
	private int method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "()Z")
	public boolean method253() {
		@Pc(5) boolean local5 = Static182.method3053() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray29.length;
		@Pc(15) int local15;
		for (local15 = 0; local15 < local13; local15++) {
			Static11.anIntArray30[local15] = this.anIntArray29[local15];
		}
		local15 = Static11.anIntArray27[this.anInt247 - 1];
		@Pc(40) int local40 = Static52.method1026(local15 - 1);
		Static11.anIntArray26[0] = Static182.method3055(local40);
		Static11.anIntArray26[1] = Static182.method3055(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray23.length; local54++) {
			@Pc(64) int local64 = this.anIntArray23[local54];
			@Pc(69) int local69 = this.anIntArray24[local64];
			@Pc(74) int local74 = this.anIntArray25[local64];
			@Pc(80) int local80 = (0x1 << local74) - 1;
			@Pc(82) int local82 = 0;
			if (local74 > 0) {
				local82 = Static182.aClass102Array1[this.anIntArray28[local64]].method2783();
			}
			for (@Pc(94) int local94 = 0; local94 < local69; local94++) {
				@Pc(106) int local106 = this.anIntArrayArray2[local64][local82 & local80];
				local82 >>>= local74;
				Static11.anIntArray26[local52++] = local106 >= 0 ? Static182.aClass102Array1[local106].method2783() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII[FI)V")
	private void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static11.aFloatArray2[arg1];
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
			arg4[local61] *= Static11.aFloatArray2[local20];
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	private void method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static11.anIntArray30[arg0];
		@Pc(13) int local13 = Static11.anIntArray26[arg0];
		@Pc(17) boolean local17 = Static11.aBooleanArray6[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(28) int local28 = Static11.anIntArray30[local21];
			if (local28 < local9) {
				Static11.anIntArray30[local5] = local28;
				Static11.anIntArray26[local5] = Static11.anIntArray26[local21];
				Static11.aBooleanArray6[local5] = Static11.aBooleanArray6[local21];
				local5++;
				Static11.anIntArray30[local21] = Static11.anIntArray30[local5];
				Static11.anIntArray26[local21] = Static11.anIntArray26[local5];
				Static11.aBooleanArray6[local21] = Static11.aBooleanArray6[local5];
			}
		}
		Static11.anIntArray30[local5] = local9;
		Static11.anIntArray26[local5] = local13;
		Static11.aBooleanArray6[local5] = local17;
		this.method257(arg0, local5 - 1);
		this.method257(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([FI)V")
	public void method258(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray29.length;
		@Pc(10) int local10 = Static11.anIntArray27[this.anInt247 - 1];
		Static11.aBooleanArray6[0] = Static11.aBooleanArray6[1] = true;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(49) int local49;
		@Pc(53) int local53;
		for (local20 = 2; local20 < local3; local20++) {
			local27 = Static11.method259(Static11.anIntArray30, local20);
			local31 = Static11.method255(Static11.anIntArray30, local20);
			local49 = this.method252(Static11.anIntArray30[local27], Static11.anIntArray26[local27], Static11.anIntArray30[local31], Static11.anIntArray26[local31], Static11.anIntArray30[local20]);
			local53 = Static11.anIntArray26[local20];
			@Pc(57) int local57 = local10 - local49;
			@Pc(68) int local68 = (local57 < local49 ? local57 : local49) << 1;
			if (local53 == 0) {
				Static11.aBooleanArray6[local20] = false;
				Static11.anIntArray26[local20] = local49;
			} else {
				Static11.aBooleanArray6[local27] = Static11.aBooleanArray6[local31] = true;
				Static11.aBooleanArray6[local20] = true;
				if (local53 >= local68) {
					Static11.anIntArray26[local20] = local57 > local49 ? local53 + local49 - local49 : local49 - local53 + local57 - 1;
				} else {
					Static11.anIntArray26[local20] = (local53 & 0x1) == 0 ? local49 + local53 / 2 : local49 - (local53 + 1) / 2;
				}
			}
		}
		this.method257(0, local3 - 1);
		local20 = 0;
		local27 = Static11.anIntArray26[0] * this.anInt247;
		for (local31 = 1; local31 < local3; local31++) {
			if (Static11.aBooleanArray6[local31]) {
				local49 = Static11.anIntArray30[local31];
				local53 = Static11.anIntArray26[local31] * this.anInt247;
				this.method254(local20, local27, local49, local53, arg0, arg1);
				if (local49 >= arg1) {
					return;
				}
				local20 = local49;
				local27 = local53;
			}
		}
		@Pc(193) float local193 = Static11.aFloatArray2[local27];
		for (local49 = local20; local49 < arg1; local49++) {
			arg0[local49] *= local193;
		}
	}
}
