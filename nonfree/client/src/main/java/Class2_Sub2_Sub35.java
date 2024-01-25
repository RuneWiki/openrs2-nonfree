import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!uh", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray173;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!uh", name = "Z", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
	private int anInt6458 = 0;

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "[S")
	private final short[] aShortArray101 = new short[257];

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "(B)V")
	private void method5609() {
		@Pc(16) int local16 = this.anInt6458;
		@Pc(36) int local36;
		@Pc(34) int local34;
		@Pc(67) int[] local67;
		@Pc(72) int[] local72;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(98) int local98;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local34 = local16 << 4;
				for (local36 = 1; local36 < this.anIntArrayArray173.length - 1 && this.anIntArrayArray173[local36][0] <= local34; local36++) {
				}
				local67 = this.anIntArrayArray173[local36 - 1];
				local72 = this.anIntArrayArray173[local36];
				local81 = this.method5611(local36 - 2)[1];
				local85 = local67[1];
				local89 = local72[1];
				local98 = this.method5611(local36 + 1)[1];
				@Pc(116) int local116 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				@Pc(122) int local122 = local116 * local116 >> 12;
				@Pc(131) int local131 = local85 + local98 - local89 - local81;
				@Pc(139) int local139 = local81 - local131 - local85;
				@Pc(144) int local144 = local89 - local81;
				@Pc(156) int local156 = local122 * (local131 * local116 >> 12) >> 12;
				@Pc(162) int local162 = local139 * local122 >> 12;
				@Pc(168) int local168 = local116 * local144 >> 12;
				@Pc(179) int local179 = local156 + local162 + local168 + local85;
				if (local179 <= -32768) {
					local179 = -32767;
				}
				if (local179 >= 32768) {
					local179 = 32767;
				}
				this.aShortArray101[local16] = (short) local179;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local34 = local16 << 4;
				for (local36 = 1; this.anIntArrayArray173.length - 1 > local36 && local34 >= this.anIntArrayArray173[local36][0]; local36++) {
				}
				local67 = this.anIntArrayArray173[local36 - 1];
				local72 = this.anIntArrayArray173[local36];
				local81 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - Static296.anIntArray435[local81 >> 5 & 0xFF] >> 1;
				local89 = 4096 - local85;
				local98 = local85 * local72[1] + local89 * local67[1] >> 12;
				if (local98 <= -32768) {
					local98 = -32767;
				}
				if (local98 >= 32768) {
					local98 = 32767;
				}
				this.aShortArray101[local16] = (short) local98;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local34 = local16 << 4;
				for (local36 = 1; this.anIntArrayArray173.length - 1 > local36 && this.anIntArrayArray173[local36][0] <= local34; local36++) {
				}
				local67 = this.anIntArrayArray173[local36 - 1];
				local72 = this.anIntArrayArray173[local36];
				local81 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - local81;
				local89 = local85 * local67[1] + local81 * local72[1] >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray101[local16] = (short) local89;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	private void method5610() {
		@Pc(8) int[] local8 = this.anIntArrayArray173[0];
		@Pc(13) int[] local13 = this.anIntArrayArray173[1];
		@Pc(30) int[] local30 = this.anIntArrayArray173[this.anIntArrayArray173.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray173[this.anIntArrayArray173.length - 1];
		this.anIntArray474 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
		this.anIntArray472 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(21) int[] local21 = this.method5876(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static339.anInt6735; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray101[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(IB)[I")
	private int[] method5611(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray474;
		} else if (this.anIntArrayArray173.length <= arg0) {
			return this.anIntArray472;
		} else {
			return this.anIntArrayArray173[arg0];
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt6458 = arg1.method4421();
		this.anIntArrayArray173 = new int[arg1.method4421()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray173.length; local22++) {
			this.anIntArrayArray173[local22][0] = arg1.method4464();
			this.anIntArrayArray173[local22][1] = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		if (this.anIntArrayArray173 == null) {
			this.anIntArrayArray173 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray173.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt6458 == 2) {
			this.method5610();
		}
		Static71.method1639();
		this.method5609();
	}
}
