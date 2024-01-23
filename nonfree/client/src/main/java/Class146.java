import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class146 {

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
	private int anInt4594;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class146() {
		@Pc(4) int local4 = Static223.method3731(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static223.method3731(5);
		@Pc(16) int local16 = 0;
		this.anIntArray386 = new int[local14];
		@Pc(22) int local22;
		@Pc(28) int local28;
		for (local22 = 0; local22 < local14; local22++) {
			local28 = Static223.method3731(4);
			this.anIntArray386[local22] = local28;
			if (local28 >= local16) {
				local16 = local28 + 1;
			}
		}
		this.anIntArray381 = new int[local16];
		this.anIntArray380 = new int[local16];
		this.anIntArray385 = new int[local16];
		this.anIntArrayArray41 = new int[local16][];
		@Pc(101) int local101;
		for (local22 = 0; local22 < local16; local22++) {
			this.anIntArray381[local22] = Static223.method3731(3) + 1;
			local28 = this.anIntArray380[local22] = Static223.method3731(2);
			if (local28 != 0) {
				this.anIntArray385[local22] = Static223.method3731(8);
			}
			local28 = 0x1 << local28;
			@Pc(94) int[] local94 = new int[local28];
			this.anIntArrayArray41[local22] = local94;
			for (local101 = 0; local101 < local28; local101++) {
				local94[local101] = Static223.method3731(8) - 1;
			}
		}
		this.anInt4594 = Static223.method3731(2) + 1;
		local22 = Static223.method3731(4);
		local28 = 2;
		@Pc(128) int local128;
		for (local128 = 0; local128 < local14; local128++) {
			local28 += this.anIntArray381[this.anIntArray386[local128]];
		}
		this.anIntArray379 = new int[local28];
		this.anIntArray379[0] = 0;
		this.anIntArray379[1] = 0x1 << local22;
		local28 = 2;
		for (local128 = 0; local128 < local14; local128++) {
			local101 = this.anIntArray386[local128];
			for (@Pc(173) int local173 = 0; local173 < this.anIntArray381[local101]; local173++) {
				this.anIntArray379[local28++] = Static223.method3731(local22);
			}
		}
		if (Static220.anIntArray382 == null || Static220.anIntArray382.length < local28) {
			Static220.anIntArray382 = new int[local28];
			Static220.anIntArray383 = new int[local28];
			Static220.aBooleanArray20 = new boolean[local28];
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)I")
	private int method3703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "()Z")
	public boolean method3704() {
		@Pc(5) boolean local5 = Static223.method3738() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray379.length;
		@Pc(15) int local15;
		for (local15 = 0; local15 < local13; local15++) {
			Static220.anIntArray382[local15] = this.anIntArray379[local15];
		}
		local15 = Static220.anIntArray384[this.anInt4594 - 1];
		@Pc(40) int local40 = Static137.method2423(local15 - 1);
		Static220.anIntArray383[0] = Static223.method3731(local40);
		Static220.anIntArray383[1] = Static223.method3731(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray386.length; local54++) {
			@Pc(64) int local64 = this.anIntArray386[local54];
			@Pc(69) int local69 = this.anIntArray381[local64];
			@Pc(74) int local74 = this.anIntArray380[local64];
			@Pc(80) int local80 = (0x1 << local74) - 1;
			@Pc(82) int local82 = 0;
			if (local74 > 0) {
				local82 = Static223.aClass18Array1[this.anIntArray385[local64]].method422();
			}
			for (@Pc(94) int local94 = 0; local94 < local69; local94++) {
				@Pc(106) int local106 = this.anIntArrayArray41[local64][local82 & local80];
				local82 >>>= local74;
				Static220.anIntArray383[local52++] = local106 >= 0 ? Static223.aClass18Array1[local106].method422() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([FI)V")
	public void method3708(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray379.length;
		@Pc(10) int local10 = Static220.anIntArray384[this.anInt4594 - 1];
		Static220.aBooleanArray20[0] = Static220.aBooleanArray20[1] = true;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(49) int local49;
		@Pc(53) int local53;
		for (local20 = 2; local20 < local3; local20++) {
			local27 = Static220.method3705(Static220.anIntArray382, local20);
			local31 = Static220.method3707(Static220.anIntArray382, local20);
			local49 = this.method3703(Static220.anIntArray382[local27], Static220.anIntArray383[local27], Static220.anIntArray382[local31], Static220.anIntArray383[local31], Static220.anIntArray382[local20]);
			local53 = Static220.anIntArray383[local20];
			@Pc(57) int local57 = local10 - local49;
			@Pc(68) int local68 = (local57 < local49 ? local57 : local49) << 1;
			if (local53 == 0) {
				Static220.aBooleanArray20[local20] = false;
				Static220.anIntArray383[local20] = local49;
			} else {
				Static220.aBooleanArray20[local27] = Static220.aBooleanArray20[local31] = true;
				Static220.aBooleanArray20[local20] = true;
				if (local53 >= local68) {
					Static220.anIntArray383[local20] = local57 > local49 ? local53 + local49 - local49 : local49 - local53 + local57 - 1;
				} else {
					Static220.anIntArray383[local20] = (local53 & 0x1) == 0 ? local49 + local53 / 2 : local49 - (local53 + 1) / 2;
				}
			}
		}
		this.method3709(0, local3 - 1);
		local20 = 0;
		local27 = Static220.anIntArray383[0] * this.anInt4594;
		for (local31 = 1; local31 < local3; local31++) {
			if (Static220.aBooleanArray20[local31]) {
				local49 = Static220.anIntArray382[local31];
				local53 = Static220.anIntArray383[local31] * this.anInt4594;
				this.method3710(local20, local27, local49, local53, arg0, arg1);
				if (local49 >= arg1) {
					return;
				}
				local20 = local49;
				local27 = local53;
			}
		}
		@Pc(193) float local193 = Static220.aFloatArray20[local27];
		for (local49 = local20; local49 < arg1; local49++) {
			arg0[local49] *= local193;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	private void method3709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static220.anIntArray382[arg0];
		@Pc(13) int local13 = Static220.anIntArray383[arg0];
		@Pc(17) boolean local17 = Static220.aBooleanArray20[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(28) int local28 = Static220.anIntArray382[local21];
			if (local28 < local9) {
				Static220.anIntArray382[local5] = local28;
				Static220.anIntArray383[local5] = Static220.anIntArray383[local21];
				Static220.aBooleanArray20[local5] = Static220.aBooleanArray20[local21];
				local5++;
				Static220.anIntArray382[local21] = Static220.anIntArray382[local5];
				Static220.anIntArray383[local21] = Static220.anIntArray383[local5];
				Static220.aBooleanArray20[local21] = Static220.aBooleanArray20[local5];
			}
		}
		Static220.anIntArray382[local5] = local9;
		Static220.anIntArray383[local5] = local13;
		Static220.aBooleanArray20[local5] = local17;
		this.method3709(arg0, local5 - 1);
		this.method3709(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII[FI)V")
	private void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static220.aFloatArray20[arg1];
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
			arg4[local61] *= Static220.aFloatArray20[local20];
		}
	}
}
