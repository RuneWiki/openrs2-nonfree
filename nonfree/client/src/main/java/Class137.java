import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class137 {

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
	private final int[] anIntArray229;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[I")
	private final int[] anIntArray225;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
	private final int[] anIntArray230;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "[I")
	private final int[] anIntArray226;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "[[I")
	private final int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	private final int anInt4268;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "[I")
	private final int[] anIntArray227;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class137() {
		@Pc(4) int local4 = Static446.method6556(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = Static446.method6556(5);
		@Pc(17) int local17 = 0;
		this.anIntArray229 = new int[local15];
		@Pc(27) int local27;
		for (@Pc(23) int local23 = 0; local23 < local15; local23++) {
			local27 = Static446.method6556(4);
			this.anIntArray229[local23] = local27;
			if (local27 >= local17) {
				local17 = local27 + 1;
			}
		}
		this.anIntArray225 = new int[local17];
		this.anIntArray230 = new int[local17];
		this.anIntArray226 = new int[local17];
		this.anIntArrayArray18 = new int[local17][];
		@Pc(78) int local78;
		@Pc(102) int local102;
		for (local27 = 0; local27 < local17; local27++) {
			this.anIntArray225[local27] = Static446.method6556(3) + 1;
			local78 = this.anIntArray230[local27] = Static446.method6556(2);
			if (local78 != 0) {
				this.anIntArray226[local27] = Static446.method6556(8);
			}
			local78 = 0x1 << local78;
			@Pc(95) int[] local95 = new int[local78];
			this.anIntArrayArray18[local27] = local95;
			for (local102 = 0; local102 < local78; local102++) {
				local95[local102] = Static446.method6556(8) - 1;
			}
		}
		this.anInt4268 = Static446.method6556(2) + 1;
		local78 = Static446.method6556(4);
		@Pc(131) int local131 = 2;
		for (local102 = 0; local102 < local15; local102++) {
			local131 += this.anIntArray225[this.anIntArray229[local102]];
		}
		this.anIntArray227 = new int[local131];
		this.anIntArray227[0] = 0;
		this.anIntArray227[1] = 0x1 << local78;
		local131 = 2;
		for (@Pc(168) int local168 = 0; local168 < local15; local168++) {
			@Pc(174) int local174 = this.anIntArray229[local168];
			for (@Pc(176) int local176 = 0; local176 < this.anIntArray225[local174]; local176++) {
				this.anIntArray227[local131++] = Static446.method6556(local78);
			}
		}
		if (Static222.anIntArray223 == null || Static222.anIntArray223.length < local131) {
			Static222.anIntArray223 = new int[local131];
			Static222.anIntArray224 = new int[local131];
			Static222.aBooleanArray13 = new boolean[local131];
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	private void method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(6) int local6 = arg0;
		@Pc(10) int local10 = Static222.anIntArray223[arg0];
		@Pc(14) int local14 = Static222.anIntArray224[arg0];
		@Pc(18) boolean local18 = Static222.aBooleanArray13[arg0];
		for (@Pc(22) int local22 = arg0 + 1; local22 <= arg1; local22++) {
			@Pc(27) int local27 = Static222.anIntArray223[local22];
			if (local27 < local10) {
				Static222.anIntArray223[local6] = local27;
				Static222.anIntArray224[local6] = Static222.anIntArray224[local22];
				Static222.aBooleanArray13[local6] = Static222.aBooleanArray13[local22];
				local6++;
				Static222.anIntArray223[local22] = Static222.anIntArray223[local6];
				Static222.anIntArray224[local22] = Static222.anIntArray224[local6];
				Static222.aBooleanArray13[local22] = Static222.aBooleanArray13[local6];
			}
		}
		Static222.anIntArray223[local6] = local10;
		Static222.anIntArray224[local6] = local14;
		Static222.aBooleanArray13[local6] = local18;
		this.method3515(arg0, local6 - 1);
		this.method3515(local6 + 1, arg1);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII[FI)V")
	private void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(15) int local15 = local3 < 0 ? -local3 : local3;
		@Pc(19) int local19 = local3 / local7;
		@Pc(21) int local21 = arg1;
		@Pc(23) int local23 = 0;
		@Pc(34) int local34 = local3 < 0 ? local19 - 1 : local19 + 1;
		@Pc(46) int local46 = local15 - (local19 < 0 ? -local19 : local19) * local7;
		arg4[arg0] *= Static222.aFloatArray43[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(64) int local64 = arg0 + 1; local64 < arg2; local64++) {
			local23 += local46;
			if (local23 >= local7) {
				local23 -= local7;
				local21 += local34;
			} else {
				local21 += local19;
			}
			arg4[local64] *= Static222.aFloatArray43[local21];
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)I")
	private int method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(15) int local15 = local3 < 0 ? -local3 : local3;
		@Pc(21) int local21 = local15 * (arg4 - arg0);
		@Pc(25) int local25 = local21 / local7;
		return local3 < 0 ? arg1 - local25 : arg1 + local25;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([FI)V")
	public void method3519(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray227.length;
		@Pc(10) int local10 = Static222.anIntArray228[this.anInt4268 - 1];
		Static222.aBooleanArray13[0] = Static222.aBooleanArray13[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static222.method3514(Static222.anIntArray223, local20);
			local29 = Static222.method3513(Static222.anIntArray223, local20);
			local47 = this.method3518(Static222.anIntArray223[local25], Static222.anIntArray224[local25], Static222.anIntArray223[local29], Static222.anIntArray224[local29], Static222.anIntArray223[local20]);
			local51 = Static222.anIntArray224[local20];
			local55 = local10 - local47;
			@Pc(67) int local67 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static222.aBooleanArray13[local20] = false;
				Static222.anIntArray224[local20] = local47;
			} else {
				Static222.aBooleanArray13[local25] = Static222.aBooleanArray13[local29] = true;
				Static222.aBooleanArray13[local20] = true;
				if (local51 >= local67) {
					Static222.anIntArray224[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static222.anIntArray224[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method3515(0, local3 - 1);
		local25 = 0;
		local29 = Static222.anIntArray224[0] * this.anInt4268;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static222.aBooleanArray13[local47]) {
				local51 = Static222.anIntArray223[local47];
				local55 = Static222.anIntArray224[local47] * this.anInt4268;
				this.method3516(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(201) float local201 = Static222.aFloatArray43[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local201;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()Z")
	public boolean method3520() {
		@Pc(6) boolean local6 = Static446.method6548() != 0;
		if (!local6) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray227.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			Static222.anIntArray223[local17] = this.anIntArray227[local17];
		}
		@Pc(36) int local36 = Static222.anIntArray228[this.anInt4268 - 1];
		@Pc(42) int local42 = Static700.method9156(local36 - 1);
		Static222.anIntArray224[0] = Static446.method6556(local42);
		Static222.anIntArray224[1] = Static446.method6556(local42);
		@Pc(54) int local54 = 2;
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray229.length; local56++) {
			@Pc(62) int local62 = this.anIntArray229[local56];
			@Pc(67) int local67 = this.anIntArray225[local62];
			@Pc(72) int local72 = this.anIntArray230[local62];
			@Pc(78) int local78 = (0x1 << local72) - 1;
			@Pc(80) int local80 = 0;
			if (local72 > 0) {
				local80 = Static446.aClass394Array1[this.anIntArray226[local62]].method9162();
			}
			for (@Pc(92) int local92 = 0; local92 < local67; local92++) {
				@Pc(102) int local102 = this.anIntArrayArray18[local62][local80 & local78];
				local80 >>>= local72;
				Static222.anIntArray224[local54++] = local102 >= 0 ? Static446.aClass394Array1[local102].method9162() : 0;
			}
		}
		return true;
	}
}
