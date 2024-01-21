import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "I")
	private int anInt3150 = 0;

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "[S")
	private final short[] aShortArray50 = new short[257];

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(26) int[] local26 = this.method3303(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static176.anInt3921; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local12[local28] = this.aShortArray50[local36];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		if (this.anIntArrayArray28 == null) {
			this.anIntArrayArray28 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray28.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3150 == 2) {
			this.method2415();
		}
		Static161.method2763();
		this.method2416();
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)[I")
	private int[] method2413(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray362;
		} else if (this.anIntArrayArray28.length <= arg0) {
			return this.anIntArray363;
		} else {
			return this.anIntArrayArray28[arg0];
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3150 = arg1.method1738();
		this.anIntArrayArray28 = new int[arg1.method1738()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray28.length; local22++) {
			this.anIntArrayArray28[local22][0] = arg1.method1753();
			this.anIntArrayArray28[local22][1] = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	private void method2415() {
		@Pc(4) int[] local4 = this.anIntArrayArray28[1];
		@Pc(9) int[] local9 = this.anIntArrayArray28[0];
		@Pc(26) int[] local26 = this.anIntArrayArray28[this.anIntArrayArray28.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray28[this.anIntArrayArray28.length - 1];
		this.anIntArray363 = new int[] { local26[0] + local26[0] - local35[0], local26[1] + -local35[1] + local26[1] };
		this.anIntArray362 = new int[] { local9[0] + local9[0] - local4[0], -local4[1] + local9[1] + local9[1] };
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
	private void method2416() {
		@Pc(8) int local8 = this.anInt3150;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(89) int local89;
		@Pc(81) int local81;
		@Pc(98) int local98;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray28.length - 1 && local26 >= this.anIntArrayArray28[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray28[local28 - 1];
				local68 = this.anIntArrayArray28[local28];
				local77 = this.method2413(local28 - 2)[1];
				local81 = local68[1];
				@Pc(85) int local85 = local81 - local77;
				local89 = local63[1];
				local98 = this.method2413(local28 + 1)[1];
				@Pc(117) int local117 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(123) int local123 = local117 * local117 >> 12;
				@Pc(129) int local129 = local117 * local85 >> 12;
				@Pc(139) int local139 = local98 + local89 - local77 - local81;
				@Pc(149) int local149 = local123 * (local117 * local139 >> 12) >> 12;
				@Pc(155) int local155 = local77 - local89 - local139;
				@Pc(161) int local161 = local155 * local123 >> 12;
				@Pc(170) int local170 = local129 + local161 + local149 + local89;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray50[local8] = (short) local170;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray28.length - 1 > local28 && this.anIntArrayArray28[local28][0] <= local26; local28++) {
				}
				local68 = this.anIntArrayArray28[local28];
				local63 = this.anIntArrayArray28[local28 - 1];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local89 = 4096 - Static143.anIntArray158[local77 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local89;
				local98 = local81 * local63[1] + local89 * local68[1] >> 12;
				if (local98 <= -32768) {
					local98 = -32767;
				}
				if (local98 >= 32768) {
					local98 = 32767;
				}
				this.aShortArray50[local8] = (short) local98;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray28.length - 1 && this.anIntArrayArray28[local28][0] <= local26; local28++) {
				}
				local68 = this.anIntArrayArray28[local28];
				local63 = this.anIntArrayArray28[local28 - 1];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local89 = 4096 - local77;
				local81 = local68[1] * local77 + local89 * local63[1] >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray50[local8] = (short) local81;
			}
		}
	}
}
