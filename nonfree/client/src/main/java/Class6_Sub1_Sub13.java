import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class6_Sub1_Sub13 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	private int anInt2071 = 0;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "[S")
	private final short[] aShortArray53 = new short[257];

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V")
	private void method2242() {
		@Pc(8) int[] local8 = this.anIntArrayArray82[0];
		@Pc(13) int[] local13 = this.anIntArrayArray82[1];
		@Pc(22) int[] local22 = this.anIntArrayArray82[this.anIntArrayArray82.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray82[this.anIntArrayArray82.length - 1];
		this.anIntArray280 = new int[] { local22[0] + local22[0] - local39[0], local22[1] + -local39[1] + local22[1] };
		this.anIntArray279 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	private void method2243() {
		@Pc(12) int local12 = this.anInt2071;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(67) int[] local67;
		@Pc(72) int[] local72;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(98) int local98;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray82.length - 1 && local30 >= this.anIntArrayArray82[local32][0]; local32++) {
				}
				local67 = this.anIntArrayArray82[local32 - 1];
				local72 = this.anIntArrayArray82[local32];
				local81 = this.method2244(local32 - 2)[1];
				local85 = local67[1];
				local89 = local72[1];
				local98 = this.method2244(local32 + 1)[1];
				@Pc(116) int local116 = (local30 - local67[0] << 12) / (local72[0] - local67[0]);
				@Pc(122) int local122 = local116 * local116 >> 12;
				@Pc(132) int local132 = local85 + local98 - local81 - local89;
				@Pc(139) int local139 = local81 - local85 - local132;
				@Pc(144) int local144 = local89 - local81;
				@Pc(156) int local156 = (local132 * local116 >> 12) * local122 >> 12;
				@Pc(162) int local162 = local122 * local139 >> 12;
				@Pc(168) int local168 = local144 * local116 >> 12;
				@Pc(178) int local178 = local85 + local156 + local162 + local168;
				if (local178 <= -32768) {
					local178 = -32767;
				}
				if (local178 >= 32768) {
					local178 = 32767;
				}
				this.aShortArray53[local12] = (short) local178;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray82.length - 1 && local30 >= this.anIntArrayArray82[local32][0]; local32++) {
				}
				local67 = this.anIntArrayArray82[local32 - 1];
				local72 = this.anIntArrayArray82[local32];
				local81 = (local30 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - Static313.anIntArray665[local81 >> 5 & 0xFF] >> 1;
				local89 = 4096 - local85;
				local98 = local85 * local72[1] + local89 * local67[1] >> 12;
				if (local98 <= -32768) {
					local98 = -32767;
				}
				if (local98 >= 32768) {
					local98 = 32767;
				}
				this.aShortArray53[local12] = (short) local98;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; this.anIntArrayArray82.length - 1 > local32 && local30 >= this.anIntArrayArray82[local32][0]; local32++) {
				}
				local67 = this.anIntArrayArray82[local32 - 1];
				local72 = this.anIntArrayArray82[local32];
				local81 = (local30 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - local81;
				local89 = local81 * local72[1] + local85 * local67[1] >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray53[local12] = (short) local89;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)[I")
	private int[] method2244(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray279;
		} else if (arg0 >= this.anIntArrayArray82.length) {
			return this.anIntArray280;
		} else {
			return this.anIntArrayArray82[arg0];
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(29) int[] local29 = this.method5609(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static299.anInt5659; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray53[local39];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		if (this.anIntArrayArray82 == null) {
			this.anIntArrayArray82 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray82.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2071 == 2) {
			this.method2242();
		}
		Static86.method1476();
		this.method2243();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2071 = arg0.method3972();
		this.anIntArrayArray82 = new int[arg0.method3972()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray82.length; local21++) {
			this.anIntArrayArray82[local21][0] = arg0.method4021();
			this.anIntArrayArray82[local21][1] = arg0.method4021();
		}
	}
}
