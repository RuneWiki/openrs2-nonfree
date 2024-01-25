import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eha")
public final class Class5_Sub3_Sub6 extends Class5_Sub3 {

	@OriginalMember(owner = "client!eha", name = "P", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!eha", name = "U", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!eha", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!eha", name = "O", descriptor = "[S")
	private final short[] aShortArray31 = new short[257];

	@OriginalMember(owner = "client!eha", name = "N", descriptor = "I")
	private int anInt2058 = 0;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(28) int[] local28 = this.method9205(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static7.anInt102; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local30] = this.aShortArray31[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "(I)V")
	private void method1847() {
		@Pc(13) int[] local13 = this.anIntArrayArray19[0];
		@Pc(18) int[] local18 = this.anIntArrayArray19[1];
		@Pc(27) int[] local27 = this.anIntArrayArray19[this.anIntArrayArray19.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray19[this.anIntArrayArray19.length - 1];
		this.anIntArray123 = new int[] { local27[0] + local27[0] - local36[0], local27[1] + -local36[1] + local27[1] };
		this.anIntArray122 = new int[] { local13[0] + local13[0] - local18[0], local13[1] + -local18[1] + local13[1] };
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2058 = arg0.method7291();
		this.anIntArrayArray19 = new int[arg0.method7291()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray19.length; local20++) {
			this.anIntArrayArray19[local20][0] = arg0.method7333();
			this.anIntArrayArray19[local20][1] = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "(II)[I")
	private int[] method1851(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray122;
		} else if (arg0 >= this.anIntArrayArray19.length) {
			return this.anIntArray123;
		} else {
			return this.anIntArrayArray19[arg0];
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		if (this.anIntArrayArray19 == null) {
			this.anIntArrayArray19 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray19.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2058 == 2) {
			this.method1847();
		}
		Static355.method5212();
		this.method1853();
	}

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V")
	private void method1853() {
		@Pc(11) int local11 = this.anInt2058;
		@Pc(33) int local33;
		@Pc(31) int local31;
		@Pc(64) int[] local64;
		@Pc(69) int[] local69;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (local11 == 2) {
			for (local11 = 0; local11 < 257; local11++) {
				local31 = local11 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray19.length - 1 && this.anIntArrayArray19[local33][0] <= local31; local33++) {
				}
				local64 = this.anIntArrayArray19[local33 - 1];
				local69 = this.anIntArrayArray19[local33];
				local80 = this.method1851(local33 - 2)[1];
				local84 = local64[1];
				local88 = local69[1];
				local97 = this.method1851(local33 + 1)[1];
				@Pc(115) int local115 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				@Pc(121) int local121 = local115 * local115 >> 12;
				@Pc(131) int local131 = local84 + local97 - local88 - local80;
				@Pc(138) int local138 = local80 - local84 - local131;
				@Pc(143) int local143 = local88 - local80;
				@Pc(155) int local155 = local121 * (local115 * local131 >> 12) >> 12;
				@Pc(161) int local161 = local121 * local138 >> 12;
				@Pc(167) int local167 = local143 * local115 >> 12;
				@Pc(175) int local175 = local84 + local167 + local161 + local155;
				if (local175 <= -32768) {
					local175 = -32767;
				}
				if (local175 >= 32768) {
					local175 = 32767;
				}
				this.aShortArray31[local11] = (short) local175;
			}
		} else if (local11 == 1) {
			for (local11 = 0; local11 < 257; local11++) {
				local31 = local11 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray19.length - 1 && local31 >= this.anIntArrayArray19[local33][0]; local33++) {
				}
				local64 = this.anIntArrayArray19[local33 - 1];
				local69 = this.anIntArrayArray19[local33];
				local80 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local84 = 4096 - Static153.anIntArray141[local80 >> 5 & 0xFF] >> 1;
				local88 = 4096 - local84;
				local97 = local64[1] * local88 + local69[1] * local84 >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray31[local11] = (short) local97;
			}
		} else {
			for (local11 = 0; local11 < 257; local11++) {
				local31 = local11 << 4;
				for (local33 = 1; this.anIntArrayArray19.length - 1 > local33 && this.anIntArrayArray19[local33][0] <= local31; local33++) {
				}
				local64 = this.anIntArrayArray19[local33 - 1];
				local69 = this.anIntArrayArray19[local33];
				local80 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local84 = 4096 - local80;
				local88 = local64[1] * local84 + local80 * local69[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray31[local11] = (short) local88;
			}
		}
	}
}
