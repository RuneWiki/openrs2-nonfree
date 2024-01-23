import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!af", name = "L", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "[S")
	private short[] aShortArray1 = new short[257];

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
	private int anInt182 = 0;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
	private void method198() {
		@Pc(8) int local8 = this.anInt182;
		@Pc(35) int local35;
		@Pc(33) int local33;
		@Pc(68) int[] local68;
		@Pc(73) int[] local73;
		@Pc(82) int local82;
		@Pc(90) int local90;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local33 = local8 << 4;
				for (local35 = 1; local35 < this.anIntArrayArray1.length - 1 && this.anIntArrayArray1[local35][0] <= local33; local35++) {
				}
				local68 = this.anIntArrayArray1[local35 - 1];
				local73 = this.anIntArrayArray1[local35];
				local82 = this.method204(local35 - 2)[1];
				local86 = local73[1];
				local90 = local68[1];
				local99 = this.method204(local35 + 1)[1];
				@Pc(104) int local104 = local86 - local82;
				@Pc(114) int local114 = local99 + local90 - local86 - local82;
				@Pc(131) int local131 = (local33 - local68[0] << 12) / (local73[0] - local68[0]);
				@Pc(139) int local139 = local131 * local131 >> 12;
				@Pc(147) int local147 = local82 - local90 - local114;
				@Pc(157) int local157 = local139 * (local131 * local114 >> 12) >> 12;
				@Pc(163) int local163 = local104 * local131 >> 12;
				@Pc(169) int local169 = local139 * local147 >> 12;
				@Pc(177) int local177 = local90 + local163 + local157 + local169;
				if (local177 <= -32768) {
					local177 = -32767;
				}
				if (local177 >= 32768) {
					local177 = 32767;
				}
				this.aShortArray1[local8] = (short) local177;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local33 = local8 << 4;
				for (local35 = 1; this.anIntArrayArray1.length - 1 > local35 && local33 >= this.anIntArrayArray1[local35][0]; local35++) {
				}
				local68 = this.anIntArrayArray1[local35 - 1];
				local73 = this.anIntArrayArray1[local35];
				local82 = (local33 - local68[0] << 12) / (local73[0] - local68[0]);
				local90 = 4096 - Static281.anIntArray463[local82 >> 5 & 0xFF] >> 1;
				local86 = 4096 - local90;
				local99 = local68[1] * local86 + local73[1] * local90 >> 12;
				if (local99 <= -32768) {
					local99 = -32767;
				}
				if (local99 >= 32768) {
					local99 = 32767;
				}
				this.aShortArray1[local8] = (short) local99;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local33 = local8 << 4;
				for (local35 = 1; this.anIntArrayArray1.length - 1 > local35 && this.anIntArrayArray1[local35][0] <= local33; local35++) {
				}
				local68 = this.anIntArrayArray1[local35 - 1];
				local73 = this.anIntArrayArray1[local35];
				local82 = (local33 - local68[0] << 12) / (local73[0] - local68[0]);
				local90 = 4096 - local82;
				local86 = local82 * local73[1] + local68[1] * local90 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray1[local8] = (short) local86;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt182 = arg0.method2690();
		this.anIntArrayArray1 = new int[arg0.method2690()][2];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray1.length; local33++) {
			this.anIntArrayArray1[local33][0] = arg0.method2691();
			this.anIntArrayArray1[local33][1] = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		if (this.anIntArrayArray1 == null) {
			this.anIntArrayArray1 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray1.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt182 == 2) {
			this.method200();
		}
		Static19.method365();
		this.method198();
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	private void method200() {
		@Pc(4) int[] local4 = this.anIntArrayArray1[0];
		@Pc(17) int[] local17 = this.anIntArrayArray1[this.anIntArrayArray1.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray1[1];
		@Pc(31) int[] local31 = this.anIntArrayArray1[this.anIntArrayArray1.length - 1];
		this.anIntArray18 = new int[] { local17[0] + local17[0] - local31[0], -local31[1] - (-local17[1] - local17[1]) };
		this.anIntArray19 = new int[] { local4[0] + local4[0] - local22[0], local4[1] - -local4[1] - local22[1] };
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(27) int[] local27 = this.method4450(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static227.anInt4511; local29++) {
				@Pc(38) int local38 = local27[local29] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local29] = this.aShortArray1[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[I")
	private int[] method204(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray19;
		} else if (arg0 < this.anIntArrayArray1.length) {
			return this.anIntArrayArray1[arg0];
		} else {
			return this.anIntArray18;
		}
	}
}
