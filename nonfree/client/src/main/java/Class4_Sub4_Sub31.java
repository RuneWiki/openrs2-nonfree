import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class4_Sub4_Sub31 extends Class4_Sub4 {

	@OriginalMember(owner = "client!tu", name = "D", descriptor = "[I")
	private int[] anIntArray508;

	@OriginalMember(owner = "client!tu", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tu", name = "K", descriptor = "[I")
	private int[] anIntArray509;

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
	private int anInt6458 = 0;

	@OriginalMember(owner = "client!tu", name = "Q", descriptor = "[S")
	private final short[] aShortArray109 = new short[257];

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)[I")
	private int[] method5230(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray508;
		} else if (arg0 >= this.anIntArrayArray56.length) {
			return this.anIntArray509;
		} else {
			return this.anIntArrayArray56[arg0];
		}
	}

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "(Z)V")
	private void method5232() {
		@Pc(14) int local14 = this.anInt6458;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local14 == 2) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray56.length - 1 > local32 && this.anIntArrayArray56[local32][0] <= local30; local32++) {
				}
				local59 = this.anIntArrayArray56[local32 - 1];
				local64 = this.anIntArrayArray56[local32];
				local73 = this.method5230(local32 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method5230(local32 + 1)[1];
				@Pc(108) int local108 = (local30 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(123) int local123 = local77 + local90 - local81 - local73;
				@Pc(131) int local131 = local73 - local123 - local77;
				@Pc(136) int local136 = local81 - local73;
				@Pc(148) int local148 = (local108 * local123 >> 12) * local114 >> 12;
				@Pc(154) int local154 = local114 * local131 >> 12;
				@Pc(160) int local160 = local108 * local136 >> 12;
				@Pc(169) int local169 = local160 + local148 + local154 + local77;
				if (local169 <= -32768) {
					local169 = -32767;
				}
				if (local169 >= 32768) {
					local169 = 32767;
				}
				this.aShortArray109[local14] = (short) local169;
			}
		} else if (local14 == 1) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray56.length - 1 > local32 && local30 >= this.anIntArrayArray56[local32][0]; local32++) {
				}
				local59 = this.anIntArrayArray56[local32 - 1];
				local64 = this.anIntArrayArray56[local32];
				local73 = (local30 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static214.anIntArray275[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local77 * local64[1] + local59[1] * local81 >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray109[local14] = (short) local90;
			}
		} else {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray56.length - 1 && this.anIntArrayArray56[local32][0] <= local30; local32++) {
				}
				local59 = this.anIntArrayArray56[local32 - 1];
				local64 = this.anIntArrayArray56[local32];
				local73 = (local30 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local59[1] * local77 + local73 * local64[1] >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray109[local14] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(28) int[] local28 = this.method6040(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static419.anInt6404; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local18[local30] = this.aShortArray109[local38];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt6458 = arg1.method5007();
		this.anIntArrayArray56 = new int[arg1.method5007()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray56.length; local20++) {
			this.anIntArrayArray56[local20][0] = arg1.method5028();
			this.anIntArrayArray56[local20][1] = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		if (this.anIntArrayArray56 == null) {
			this.anIntArrayArray56 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray56.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt6458 == 2) {
			this.method5233();
		}
		Static232.method3165();
		this.method5232();
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
	private void method5233() {
		@Pc(8) int[] local8 = this.anIntArrayArray56[0];
		@Pc(13) int[] local13 = this.anIntArrayArray56[1];
		@Pc(22) int[] local22 = this.anIntArrayArray56[this.anIntArrayArray56.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray56[this.anIntArrayArray56.length - 1];
		this.anIntArray509 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - -local22[1] + -local31[1] };
		this.anIntArray508 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
	}
}
