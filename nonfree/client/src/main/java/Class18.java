import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class18 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class18() {
		@Pc(4) int local4 = Static231.method3674(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static231.method3674(5);
		@Pc(16) int local16 = 0;
		this.anIntArray29 = new int[local14];
		@Pc(22) int local22;
		@Pc(28) int local28;
		for (local22 = 0; local22 < local14; local22++) {
			local28 = Static231.method3674(4);
			this.anIntArray29[local22] = local28;
			if (local28 >= local16) {
				local16 = local28 + 1;
			}
		}
		this.anIntArray30 = new int[local16];
		this.anIntArray28 = new int[local16];
		this.anIntArray34 = new int[local16];
		this.anIntArrayArray4 = new int[local16][];
		@Pc(101) int local101;
		for (local22 = 0; local22 < local16; local22++) {
			this.anIntArray30[local22] = Static231.method3674(3) + 1;
			local28 = this.anIntArray28[local22] = Static231.method3674(2);
			if (local28 != 0) {
				this.anIntArray34[local22] = Static231.method3674(8);
			}
			local28 = 0x1 << local28;
			@Pc(94) int[] local94 = new int[local28];
			this.anIntArrayArray4[local22] = local94;
			for (local101 = 0; local101 < local28; local101++) {
				local94[local101] = Static231.method3674(8) - 1;
			}
		}
		this.anInt272 = Static231.method3674(2) + 1;
		local22 = Static231.method3674(4);
		local28 = 2;
		@Pc(128) int local128;
		for (local128 = 0; local128 < local14; local128++) {
			local28 += this.anIntArray30[this.anIntArray29[local128]];
		}
		this.anIntArray33 = new int[local28];
		this.anIntArray33[0] = 0;
		this.anIntArray33[1] = 0x1 << local22;
		local28 = 2;
		for (local128 = 0; local128 < local14; local128++) {
			local101 = this.anIntArray29[local128];
			for (@Pc(173) int local173 = 0; local173 < this.anIntArray30[local101]; local173++) {
				this.anIntArray33[local28++] = Static231.method3674(local22);
			}
		}
		if (Static19.anIntArray31 == null || Static19.anIntArray31.length < local28) {
			Static19.anIntArray31 = new int[local28];
			Static19.anIntArray32 = new int[local28];
			Static19.aBooleanArray3 = new boolean[local28];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([FI)V")
	public void method266(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray33.length;
		@Pc(10) int local10 = Static19.anIntArray35[this.anInt272 - 1];
		Static19.aBooleanArray3[0] = Static19.aBooleanArray3[1] = true;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(49) int local49;
		@Pc(53) int local53;
		for (local20 = 2; local20 < local3; local20++) {
			local27 = Static19.method265(Static19.anIntArray31, local20);
			local31 = Static19.method270(Static19.anIntArray31, local20);
			local49 = this.method272(Static19.anIntArray31[local27], Static19.anIntArray32[local27], Static19.anIntArray31[local31], Static19.anIntArray32[local31], Static19.anIntArray31[local20]);
			local53 = Static19.anIntArray32[local20];
			@Pc(57) int local57 = local10 - local49;
			@Pc(68) int local68 = (local57 < local49 ? local57 : local49) << 1;
			if (local53 == 0) {
				Static19.aBooleanArray3[local20] = false;
				Static19.anIntArray32[local20] = local49;
			} else {
				Static19.aBooleanArray3[local27] = Static19.aBooleanArray3[local31] = true;
				Static19.aBooleanArray3[local20] = true;
				if (local53 >= local68) {
					Static19.anIntArray32[local20] = local57 > local49 ? local53 + local49 - local49 : local49 - local53 + local57 - 1;
				} else {
					Static19.anIntArray32[local20] = (local53 & 0x1) == 0 ? local49 + local53 / 2 : local49 - (local53 + 1) / 2;
				}
			}
		}
		this.method267(0, local3 - 1);
		local20 = 0;
		local27 = Static19.anIntArray32[0] * this.anInt272;
		for (local31 = 1; local31 < local3; local31++) {
			if (Static19.aBooleanArray3[local31]) {
				local49 = Static19.anIntArray31[local31];
				local53 = Static19.anIntArray32[local31] * this.anInt272;
				this.method271(local20, local27, local49, local53, arg0, arg1);
				if (local49 >= arg1) {
					return;
				}
				local20 = local49;
				local27 = local53;
			}
		}
		@Pc(193) float local193 = Static19.aFloatArray7[local27];
		for (local49 = local20; local49 < arg1; local49++) {
			arg0[local49] *= local193;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	private void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static19.anIntArray31[arg0];
		@Pc(13) int local13 = Static19.anIntArray32[arg0];
		@Pc(17) boolean local17 = Static19.aBooleanArray3[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(28) int local28 = Static19.anIntArray31[local21];
			if (local28 < local9) {
				Static19.anIntArray31[local5] = local28;
				Static19.anIntArray32[local5] = Static19.anIntArray32[local21];
				Static19.aBooleanArray3[local5] = Static19.aBooleanArray3[local21];
				local5++;
				Static19.anIntArray31[local21] = Static19.anIntArray31[local5];
				Static19.anIntArray32[local21] = Static19.anIntArray32[local5];
				Static19.aBooleanArray3[local21] = Static19.aBooleanArray3[local5];
			}
		}
		Static19.anIntArray31[local5] = local9;
		Static19.anIntArray32[local5] = local13;
		Static19.aBooleanArray3[local5] = local17;
		this.method267(arg0, local5 - 1);
		this.method267(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()Z")
	public boolean method269() {
		@Pc(5) boolean local5 = Static231.method3669() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray33.length;
		@Pc(15) int local15;
		for (local15 = 0; local15 < local13; local15++) {
			Static19.anIntArray31[local15] = this.anIntArray33[local15];
		}
		local15 = Static19.anIntArray35[this.anInt272 - 1];
		@Pc(40) int local40 = Static170.method2713(local15 - 1);
		Static19.anIntArray32[0] = Static231.method3674(local40);
		Static19.anIntArray32[1] = Static231.method3674(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray29.length; local54++) {
			@Pc(64) int local64 = this.anIntArray29[local54];
			@Pc(69) int local69 = this.anIntArray30[local64];
			@Pc(74) int local74 = this.anIntArray28[local64];
			@Pc(80) int local80 = (0x1 << local74) - 1;
			@Pc(82) int local82 = 0;
			if (local74 > 0) {
				local82 = Static231.aClass134Array1[this.anIntArray34[local64]].method3408();
			}
			for (@Pc(94) int local94 = 0; local94 < local69; local94++) {
				@Pc(106) int local106 = this.anIntArrayArray4[local64][local82 & local80];
				local82 >>>= local74;
				Static19.anIntArray32[local52++] = local106 >= 0 ? Static231.aClass134Array1[local106].method3408() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[FI)V")
	private void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static19.aFloatArray7[arg1];
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
			arg4[local61] *= Static19.aFloatArray7[local20];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)I")
	private int method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}
}
