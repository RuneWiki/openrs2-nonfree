import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!je", name = "G", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!je", name = "H", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!je", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!je", name = "L", descriptor = "[S")
	private final short[] aShortArray42 = new short[257];

	@OriginalMember(owner = "client!je", name = "J", descriptor = "I")
	private int anInt3518 = 0;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3518 = arg0.method2915();
		this.anIntArrayArray27 = new int[arg0.method2915()][2];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray27.length; local27++) {
			this.anIntArrayArray27[local27][0] = arg0.method2896();
			this.anIntArrayArray27[local27][1] = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
	private void method2761() {
		@Pc(14) int local14 = this.anInt3518;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local14 == 2) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray27.length - 1 > local32 && this.anIntArrayArray27[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray27[local32 - 1];
				local68 = this.anIntArrayArray27[local32];
				local77 = this.method2767(local32 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method2767(local32 + 1)[1];
				@Pc(112) int local112 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(127) int local127 = local81 + local94 - local77 - local85;
				@Pc(135) int local135 = local77 - local127 - local81;
				@Pc(140) int local140 = local85 - local77;
				@Pc(152) int local152 = local118 * (local127 * local112 >> 12) >> 12;
				@Pc(158) int local158 = local118 * local135 >> 12;
				@Pc(164) int local164 = local112 * local140 >> 12;
				@Pc(173) int local173 = local81 + local158 + local152 + local164;
				if (local173 <= -32768) {
					local173 = -32767;
				}
				if (local173 >= 32768) {
					local173 = 32767;
				}
				this.aShortArray42[local14] = (short) local173;
			}
		} else if (local14 == 1) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray27[local32 - 1];
				local68 = this.anIntArrayArray27[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static117.anIntArray157[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local85 * local63[1] + local68[1] * local81 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray42[local14] = (short) local94;
			}
		} else {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; this.anIntArrayArray27.length - 1 > local32 && local30 >= this.anIntArrayArray27[local32][0]; local32++) {
				}
				local63 = this.anIntArrayArray27[local32 - 1];
				local68 = this.anIntArrayArray27[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local77 * local68[1] + local63[1] * local81 >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray42[local14] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(28) int[] local28 = this.method5964(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static218.anInt3990; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local18[local30] = this.aShortArray42[local38];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		if (this.anIntArrayArray27 == null) {
			this.anIntArrayArray27 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray27.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3518 == 2) {
			this.method2766();
		}
		Static1.method20();
		this.method2761();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	private void method2766() {
		@Pc(13) int[] local13 = this.anIntArrayArray27[0];
		@Pc(18) int[] local18 = this.anIntArrayArray27[1];
		@Pc(27) int[] local27 = this.anIntArrayArray27[this.anIntArrayArray27.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray27[this.anIntArrayArray27.length - 1];
		this.anIntArray261 = new int[] { local27[0] + local27[0] - local36[0], local27[1] - (local36[1] - local27[1]) };
		this.anIntArray262 = new int[] { local13[0] + local13[0] - local18[0], local13[1] - local18[1] - -local13[1] };
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(II)[I")
	private int[] method2767(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray262;
		} else if (arg0 >= this.anIntArrayArray27.length) {
			return this.anIntArray261;
		} else {
			return this.anIntArrayArray27[arg0];
		}
	}
}
