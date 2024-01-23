import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class180 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "[I")
	private int[] anIntArray520;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
	private int[] anIntArray517;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[I")
	private int[] anIntArray521;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
	private int[] anIntArray523;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	private int anInt5824;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class180() {
		@Pc(4) int local4 = Static51.method986(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static51.method986(5);
		@Pc(16) int local16 = 0;
		this.anIntArray520 = new int[local14];
		@Pc(22) int local22;
		@Pc(28) int local28;
		for (local22 = 0; local22 < local14; local22++) {
			local28 = Static51.method986(4);
			this.anIntArray520[local22] = local28;
			if (local28 >= local16) {
				local16 = local28 + 1;
			}
		}
		this.anIntArray517 = new int[local16];
		this.anIntArray521 = new int[local16];
		this.anIntArray523 = new int[local16];
		this.anIntArrayArray74 = new int[local16][];
		@Pc(101) int local101;
		for (local22 = 0; local22 < local16; local22++) {
			this.anIntArray517[local22] = Static51.method986(3) + 1;
			local28 = this.anIntArray521[local22] = Static51.method986(2);
			if (local28 != 0) {
				this.anIntArray523[local22] = Static51.method986(8);
			}
			local28 = 0x1 << local28;
			@Pc(94) int[] local94 = new int[local28];
			this.anIntArrayArray74[local22] = local94;
			for (local101 = 0; local101 < local28; local101++) {
				local94[local101] = Static51.method986(8) - 1;
			}
		}
		this.anInt5824 = Static51.method986(2) + 1;
		local22 = Static51.method986(4);
		local28 = 2;
		@Pc(128) int local128;
		for (local128 = 0; local128 < local14; local128++) {
			local28 += this.anIntArray517[this.anIntArray520[local128]];
		}
		this.anIntArray522 = new int[local28];
		this.anIntArray522[0] = 0;
		this.anIntArray522[1] = 0x1 << local22;
		local28 = 2;
		for (local128 = 0; local128 < local14; local128++) {
			local101 = this.anIntArray520[local128];
			for (@Pc(173) int local173 = 0; local173 < this.anIntArray517[local101]; local173++) {
				this.anIntArray522[local28++] = Static51.method986(local22);
			}
		}
		if (Static291.anIntArray518 == null || Static291.anIntArray518.length < local28) {
			Static291.anIntArray518 = new int[local28];
			Static291.anIntArray519 = new int[local28];
			Static291.aBooleanArray27 = new boolean[local28];
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()Z")
	public boolean method4445() {
		@Pc(5) boolean local5 = Static51.method989() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray522.length;
		@Pc(15) int local15;
		for (local15 = 0; local15 < local13; local15++) {
			Static291.anIntArray518[local15] = this.anIntArray522[local15];
		}
		local15 = Static291.anIntArray524[this.anInt5824 - 1];
		@Pc(40) int local40 = Static115.method1850(local15 - 1);
		Static291.anIntArray519[0] = Static51.method986(local40);
		Static291.anIntArray519[1] = Static51.method986(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray520.length; local54++) {
			@Pc(64) int local64 = this.anIntArray520[local54];
			@Pc(69) int local69 = this.anIntArray517[local64];
			@Pc(74) int local74 = this.anIntArray521[local64];
			@Pc(80) int local80 = (0x1 << local74) - 1;
			@Pc(82) int local82 = 0;
			if (local74 > 0) {
				local82 = Static51.aClass12Array1[this.anIntArray523[local64]].method309();
			}
			for (@Pc(94) int local94 = 0; local94 < local69; local94++) {
				@Pc(106) int local106 = this.anIntArrayArray74[local64][local82 & local80];
				local82 >>>= local74;
				Static291.anIntArray519[local52++] = local106 >= 0 ? Static51.aClass12Array1[local106].method309() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)I")
	private int method4446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([FI)V")
	public void method4447(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray522.length;
		@Pc(10) int local10 = Static291.anIntArray524[this.anInt5824 - 1];
		Static291.aBooleanArray27[0] = Static291.aBooleanArray27[1] = true;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(49) int local49;
		@Pc(53) int local53;
		for (local20 = 2; local20 < local3; local20++) {
			local27 = Static291.method4452(Static291.anIntArray518, local20);
			local31 = Static291.method4451(Static291.anIntArray518, local20);
			local49 = this.method4446(Static291.anIntArray518[local27], Static291.anIntArray519[local27], Static291.anIntArray518[local31], Static291.anIntArray519[local31], Static291.anIntArray518[local20]);
			local53 = Static291.anIntArray519[local20];
			@Pc(57) int local57 = local10 - local49;
			@Pc(68) int local68 = (local57 < local49 ? local57 : local49) << 1;
			if (local53 == 0) {
				Static291.aBooleanArray27[local20] = false;
				Static291.anIntArray519[local20] = local49;
			} else {
				Static291.aBooleanArray27[local27] = Static291.aBooleanArray27[local31] = true;
				Static291.aBooleanArray27[local20] = true;
				if (local53 >= local68) {
					Static291.anIntArray519[local20] = local57 > local49 ? local53 + local49 - local49 : local49 - local53 + local57 - 1;
				} else {
					Static291.anIntArray519[local20] = (local53 & 0x1) == 0 ? local49 + local53 / 2 : local49 - (local53 + 1) / 2;
				}
			}
		}
		this.method4450(0, local3 - 1);
		local20 = 0;
		local27 = Static291.anIntArray519[0] * this.anInt5824;
		for (local31 = 1; local31 < local3; local31++) {
			if (Static291.aBooleanArray27[local31]) {
				local49 = Static291.anIntArray518[local31];
				local53 = Static291.anIntArray519[local31] * this.anInt5824;
				this.method4448(local20, local27, local49, local53, arg0, arg1);
				if (local49 >= arg1) {
					return;
				}
				local20 = local49;
				local27 = local53;
			}
		}
		@Pc(193) float local193 = Static291.aFloatArray31[local27];
		for (local49 = local20; local49 < arg1; local49++) {
			arg0[local49] *= local193;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII[FI)V")
	private void method4448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static291.aFloatArray31[arg1];
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
			arg4[local61] *= Static291.aFloatArray31[local20];
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	private void method4450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static291.anIntArray518[arg0];
		@Pc(13) int local13 = Static291.anIntArray519[arg0];
		@Pc(17) boolean local17 = Static291.aBooleanArray27[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(28) int local28 = Static291.anIntArray518[local21];
			if (local28 < local9) {
				Static291.anIntArray518[local5] = local28;
				Static291.anIntArray519[local5] = Static291.anIntArray519[local21];
				Static291.aBooleanArray27[local5] = Static291.aBooleanArray27[local21];
				local5++;
				Static291.anIntArray518[local21] = Static291.anIntArray518[local5];
				Static291.anIntArray519[local21] = Static291.anIntArray519[local5];
				Static291.aBooleanArray27[local21] = Static291.aBooleanArray27[local5];
			}
		}
		Static291.anIntArray518[local5] = local9;
		Static291.anIntArray519[local5] = local13;
		Static291.aBooleanArray27[local5] = local17;
		this.method4450(arg0, local5 - 1);
		this.method4450(local5 + 1, arg1);
	}
}
