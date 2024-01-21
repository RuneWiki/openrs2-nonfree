import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub4_Sub14 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ih", name = "eb", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!ih", name = "fb", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!ih", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "[S")
	private final short[] aShortArray68 = new short[257];

	@OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
	private int anInt1829 = 0;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(23) int[] local23 = this.method3129(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static118.anInt2608; local25++) {
				@Pc(33) int local33 = local23[local25] >> 4;
				if (local33 < 0) {
					local33 = 0;
				}
				if (local33 > 256) {
					local33 = 256;
				}
				local13[local25] = this.aShortArray68[local33];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)V")
	private void method1231() {
		@Pc(8) int[] local8 = this.anIntArrayArray15[0];
		@Pc(13) int[] local13 = this.anIntArrayArray15[1];
		@Pc(22) int[] local22 = this.anIntArrayArray15[this.anIntArrayArray15.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray15[this.anIntArrayArray15.length - 1];
		this.anIntArray161 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - -local8[1] + local8[1] };
		this.anIntArray160 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] - -local22[1] + local22[1] };
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	private void method1232() {
		@Pc(15) int local15 = this.anInt1829;
		@Pc(35) int local35;
		@Pc(33) int local33;
		@Pc(66) int[] local66;
		@Pc(71) int[] local71;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (local15 == 2) {
			for (local15 = 0; local15 < 257; local15++) {
				local33 = local15 << 4;
				for (local35 = 1; local35 < this.anIntArrayArray15.length - 1 && this.anIntArrayArray15[local35][0] <= local33; local35++) {
				}
				local66 = this.anIntArrayArray15[local35 - 1];
				local71 = this.anIntArrayArray15[local35];
				local80 = this.method1234(local35 - 2)[1];
				local84 = local66[1];
				local88 = local71[1];
				local97 = this.method1234(local35 + 1)[1];
				@Pc(115) int local115 = (local33 - local66[0] << 12) / (local71[0] - local66[0]);
				@Pc(121) int local121 = local115 * local115 >> 12;
				@Pc(131) int local131 = local84 + local97 - local80 - local88;
				@Pc(137) int local137 = local80 - local84 - local131;
				@Pc(142) int local142 = local88 - local80;
				@Pc(154) int local154 = local121 * (local131 * local115 >> 12) >> 12;
				@Pc(160) int local160 = local137 * local121 >> 12;
				@Pc(166) int local166 = local142 * local115 >> 12;
				@Pc(174) int local174 = local84 + local166 + local154 + local160;
				if (local174 <= -32768) {
					local174 = -32767;
				}
				if (local174 >= 32768) {
					local174 = 32767;
				}
				this.aShortArray68[local15] = (short) local174;
			}
		} else if (local15 == 1) {
			for (local15 = 0; local15 < 257; local15++) {
				local33 = local15 << 4;
				for (local35 = 1; local35 < this.anIntArrayArray15.length - 1 && local33 >= this.anIntArrayArray15[local35][0]; local35++) {
				}
				local66 = this.anIntArrayArray15[local35 - 1];
				local71 = this.anIntArrayArray15[local35];
				local80 = (local33 - local66[0] << 12) / (local71[0] - local66[0]);
				local84 = 4096 - Static63.anIntArray104[local80 >> 5 & 0xFF] >> 1;
				local88 = 4096 - local84;
				local97 = local66[1] * local88 + local71[1] * local84 >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray68[local15] = (short) local97;
			}
		} else {
			for (local15 = 0; local15 < 257; local15++) {
				local33 = local15 << 4;
				for (local35 = 1; this.anIntArrayArray15.length - 1 > local35 && local33 >= this.anIntArrayArray15[local35][0]; local35++) {
				}
				local66 = this.anIntArrayArray15[local35 - 1];
				local71 = this.anIntArrayArray15[local35];
				local80 = (local33 - local66[0] << 12) / (local71[0] - local66[0]);
				local84 = 4096 - local80;
				local88 = local71[1] * local80 + local66[1] * local84 >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray68[local15] = (short) local88;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)[I")
	private int[] method1234(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray161;
		} else if (this.anIntArrayArray15.length <= arg0) {
			return this.anIntArray160;
		} else {
			return this.anIntArrayArray15[arg0];
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		if (this.anIntArrayArray15 == null) {
			this.anIntArrayArray15 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray15.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1829 == 2) {
			this.method1231();
		}
		Static172.method516();
		this.method1232();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1829 = arg1.method1534();
		this.anIntArrayArray15 = new int[arg1.method1534()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray15.length; local22++) {
			this.anIntArrayArray15[local22][0] = arg1.method1557();
			this.anIntArrayArray15[local22][1] = arg1.method1557();
		}
	}
}
