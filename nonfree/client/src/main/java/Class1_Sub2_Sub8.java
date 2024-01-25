import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!fu", name = "N", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!fu", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
	private int anInt2247 = 0;

	@OriginalMember(owner = "client!fu", name = "S", descriptor = "[S")
	private final short[] aShortArray27 = new short[257];

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2247 = arg0.method4548();
		this.anIntArrayArray9 = new int[arg0.method4548()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray9.length; local17++) {
			this.anIntArrayArray9[local17][0] = arg0.method4498();
			this.anIntArrayArray9[local17][1] = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
	private void method1831() {
		@Pc(14) int local14 = this.anInt2247;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(67) int[] local67;
		@Pc(72) int[] local72;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(98) int local98;
		if (local14 == 2) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray9.length - 1 && local30 >= this.anIntArrayArray9[local32][0]; local32++) {
				}
				local67 = this.anIntArrayArray9[local32 - 1];
				local72 = this.anIntArrayArray9[local32];
				local81 = this.method1835(local32 - 2)[1];
				local85 = local67[1];
				local89 = local72[1];
				local98 = this.method1835(local32 + 1)[1];
				@Pc(116) int local116 = (local30 - local67[0] << 12) / (local72[0] - local67[0]);
				@Pc(122) int local122 = local116 * local116 >> 12;
				@Pc(133) int local133 = local98 + local85 - local89 - local81;
				@Pc(140) int local140 = local81 - local133 - local85;
				@Pc(145) int local145 = local89 - local81;
				@Pc(157) int local157 = local122 * (local116 * local133 >> 12) >> 12;
				@Pc(163) int local163 = local140 * local122 >> 12;
				@Pc(169) int local169 = local116 * local145 >> 12;
				@Pc(177) int local177 = local85 + local169 + local163 + local157;
				if (local177 <= -32768) {
					local177 = -32767;
				}
				if (local177 >= 32768) {
					local177 = 32767;
				}
				this.aShortArray27[local14] = (short) local177;
			}
		} else if (local14 == 1) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray9.length - 1 > local32 && this.anIntArrayArray9[local32][0] <= local30; local32++) {
				}
				local67 = this.anIntArrayArray9[local32 - 1];
				local72 = this.anIntArrayArray9[local32];
				local81 = (local30 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - Static108.anIntArray110[local81 >> 5 & 0xFF] >> 1;
				local89 = 4096 - local85;
				local98 = local67[1] * local89 + local72[1] * local85 >> 12;
				if (local98 <= -32768) {
					local98 = -32767;
				}
				if (local98 >= 32768) {
					local98 = 32767;
				}
				this.aShortArray27[local14] = (short) local98;
			}
		} else {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray9.length - 1 > local32 && this.anIntArrayArray9[local32][0] <= local30; local32++) {
				}
				local67 = this.anIntArrayArray9[local32 - 1];
				local72 = this.anIntArrayArray9[local32];
				local81 = (local30 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - local81;
				local89 = local72[1] * local81 + local85 * local67[1] >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray27[local14] = (short) local89;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(Z)V")
	private void method1834() {
		@Pc(8) int[] local8 = this.anIntArrayArray9[0];
		@Pc(13) int[] local13 = this.anIntArrayArray9[1];
		@Pc(26) int[] local26 = this.anIntArrayArray9[this.anIntArrayArray9.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray9[this.anIntArrayArray9.length - 1];
		this.anIntArray116 = new int[] { local26[0] + local26[0] - local35[0], local26[1] - -local26[1] - local35[1] };
		this.anIntArray117 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] - -local13[1]) };
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(29) int[] local29 = this.method5872(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static410.anInt7198; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray27[local39];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(ZI)[I")
	private int[] method1835(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray117;
		} else if (arg0 >= this.anIntArrayArray9.length) {
			return this.anIntArray116;
		} else {
			return this.anIntArrayArray9[arg0];
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		if (this.anIntArrayArray9 == null) {
			this.anIntArrayArray9 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray9.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2247 == 2) {
			this.method1834();
		}
		Static4.method126();
		this.method1831();
	}
}
