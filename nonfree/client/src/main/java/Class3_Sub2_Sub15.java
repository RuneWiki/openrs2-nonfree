import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!iia", name = "z", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!iia", name = "B", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!iia", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!iia", name = "I", descriptor = "[S")
	private final short[] aShortArray69 = new short[257];

	@OriginalMember(owner = "client!iia", name = "L", descriptor = "I")
	private int anInt4530 = 0;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)V")
	private void method3989() {
		@Pc(8) int[] local8 = this.anIntArrayArray34[0];
		@Pc(13) int[] local13 = this.anIntArrayArray34[1];
		@Pc(22) int[] local22 = this.anIntArrayArray34[this.anIntArrayArray34.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray34[this.anIntArrayArray34.length - 1];
		this.anIntArray239 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] + local8[1] + local8[1] };
		this.anIntArray238 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] + local22[1] + local22[1] };
	}

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(II)[I")
	private int[] method3990(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray239;
		} else if (arg0 >= this.anIntArrayArray34.length) {
			return this.anIntArray238;
		} else {
			return this.anIntArrayArray34[arg0];
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(30) int[] local30 = this.method8603(arg0, 0);
			for (@Pc(32) int local32 = 0; local32 < Static491.anInt8519; local32++) {
				@Pc(40) int local40 = local30[local32] >> 4;
				if (local40 < 0) {
					local40 = 0;
				}
				if (local40 > 256) {
					local40 = 256;
				}
				local20[local32] = this.aShortArray69[local40];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)V")
	private void method3992() {
		@Pc(4) int local4 = this.anInt4530;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray34.length - 1 && local22 >= this.anIntArrayArray34[local24][0]; local24++) {
				}
				local59 = this.anIntArrayArray34[local24 - 1];
				local64 = this.anIntArrayArray34[local24];
				local73 = this.method3990(local24 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method3990(local24 + 1)[1];
				@Pc(108) int local108 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(124) int local124 = local77 + local90 - local73 - local81;
				@Pc(132) int local132 = local73 - local124 - local77;
				@Pc(137) int local137 = local81 - local73;
				@Pc(149) int local149 = (local124 * local108 >> 12) * local114 >> 12;
				@Pc(155) int local155 = local114 * local132 >> 12;
				@Pc(161) int local161 = local108 * local137 >> 12;
				@Pc(171) int local171 = local155 + local149 + local161 + local77;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray69[local4] = (short) local171;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray34.length - 1 && this.anIntArrayArray34[local24][0] <= local22; local24++) {
				}
				local59 = this.anIntArrayArray34[local24 - 1];
				local64 = this.anIntArrayArray34[local24];
				local73 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static587.anIntArray621[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local81 * local59[1] + local64[1] * local77 >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray69[local4] = (short) local90;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray34.length - 1 && this.anIntArrayArray34[local24][0] <= local22; local24++) {
				}
				local59 = this.anIntArrayArray34[local24 - 1];
				local64 = this.anIntArrayArray34[local24];
				local73 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local73 * local64[1] + local77 * local59[1] >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray69[local4] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		if (this.anIntArrayArray34 == null) {
			this.anIntArrayArray34 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray34.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4530 == 2) {
			this.method3989();
		}
		Static511.method7631();
		this.method3992();
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4530 = arg0.method4225();
		this.anIntArrayArray34 = new int[arg0.method4225()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray34.length; local20++) {
			this.anIntArrayArray34[local20][0] = arg0.method4221();
			this.anIntArrayArray34[local20][1] = arg0.method4221();
		}
	}
}
