import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!pc", name = "hb", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "[S")
	private final short[] aShortArray36 = new short[257];

	@OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
	private int anInt2960 = 0;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2960 = arg0.method3010();
		this.anIntArrayArray26 = new int[arg0.method3010()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray26.length; local17++) {
			this.anIntArrayArray26[local17][0] = arg0.method3023();
			this.anIntArrayArray26[local17][1] = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(25) int[] local25 = this.method3393(arg0, 0);
			for (@Pc(27) int local27 = 0; local27 < Static107.anInt2321; local27++) {
				@Pc(35) int local35 = local25[local27] >> 4;
				if (local35 < 0) {
					local35 = 0;
				}
				if (local35 > 256) {
					local35 = 256;
				}
				local15[local27] = this.aShortArray36[local35];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		if (this.anIntArrayArray26 == null) {
			this.anIntArrayArray26 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray26.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2960 == 2) {
			this.method2179();
		}
		Static110.method1653();
		this.method2177();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)[I")
	private int[] method2176(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray256;
		} else if (arg0 >= this.anIntArrayArray26.length) {
			return this.anIntArray255;
		} else {
			return this.anIntArrayArray26[arg0];
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
	private void method2177() {
		@Pc(13) int local13 = this.anInt2960;
		@Pc(33) int local33;
		@Pc(31) int local31;
		@Pc(60) int[] local60;
		@Pc(65) int[] local65;
		@Pc(76) int local76;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray26.length - 1 > local33 && local31 >= this.anIntArrayArray26[local33][0]; local33++) {
				}
				local60 = this.anIntArrayArray26[local33 - 1];
				local65 = this.anIntArrayArray26[local33];
				local76 = this.method2176(local33 - 2)[1];
				local80 = local60[1];
				local84 = local65[1];
				local93 = this.method2176(local33 + 1)[1];
				@Pc(111) int local111 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				@Pc(121) int local121 = local93 + local80 - local76 - local84;
				@Pc(127) int local127 = local111 * local111 >> 12;
				@Pc(132) int local132 = local84 - local76;
				@Pc(139) int local139 = local76 - local80 - local121;
				@Pc(149) int local149 = (local111 * local121 >> 12) * local127 >> 12;
				@Pc(155) int local155 = local127 * local139 >> 12;
				@Pc(163) int local163 = local132 * local111 >> 12;
				@Pc(171) int local171 = local80 + local163 + local155 + local149;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray36[local13] = (short) local171;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray26.length - 1 && this.anIntArrayArray26[local33][0] <= local31; local33++) {
				}
				local65 = this.anIntArrayArray26[local33];
				local60 = this.anIntArrayArray26[local33 - 1];
				local76 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				local80 = 4096 - Static7.anIntArray17[local76 >> 5 & 0xFF] >> 1;
				local84 = 4096 - local80;
				local93 = local65[1] * local80 + local60[1] * local84 >> 12;
				if (local93 <= -32768) {
					local93 = -32767;
				}
				if (local93 >= 32768) {
					local93 = 32767;
				}
				this.aShortArray36[local13] = (short) local93;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray26.length - 1 > local33 && local31 >= this.anIntArrayArray26[local33][0]; local33++) {
				}
				local65 = this.anIntArrayArray26[local33];
				local60 = this.anIntArrayArray26[local33 - 1];
				local76 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				local80 = 4096 - local76;
				local84 = local65[1] * local76 + local60[1] * local80 >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray36[local13] = (short) local84;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
	private void method2179() {
		@Pc(8) int[] local8 = this.anIntArrayArray26[0];
		@Pc(13) int[] local13 = this.anIntArrayArray26[1];
		@Pc(22) int[] local22 = this.anIntArrayArray26[this.anIntArrayArray26.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray26[this.anIntArrayArray26.length - 1];
		this.anIntArray256 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] + local8[1] };
		this.anIntArray255 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + local22[1] - local31[1] };
	}
}
