import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class2_Sub4_Sub21 extends Class2_Sub4 {

	@OriginalMember(owner = "client!kea", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!kea", name = "M", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!kea", name = "R", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "[S")
	private final short[] aShortArray58 = new short[257];

	@OriginalMember(owner = "client!kea", name = "F", descriptor = "I")
	private int anInt5256 = 0;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		if (this.anIntArrayArray53 == null) {
			this.anIntArrayArray53 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray53.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5256 == 2) {
			this.method4606();
		}
		Static154.method2691();
		this.method4608();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(21) int[] local21 = this.method8892(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static395.anInt6816; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray58[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(I)V")
	private void method4606() {
		@Pc(8) int[] local8 = this.anIntArrayArray53[0];
		@Pc(13) int[] local13 = this.anIntArrayArray53[1];
		@Pc(22) int[] local22 = this.anIntArrayArray53[this.anIntArrayArray53.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray53[this.anIntArrayArray53.length - 1];
		this.anIntArray334 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
		this.anIntArray333 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] - local22[1]) };
	}

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(I)V")
	private void method4608() {
		@Pc(4) int local4 = this.anInt5256;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(51) int[] local51;
		@Pc(56) int[] local56;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray53.length - 1 && local22 >= this.anIntArrayArray53[local24][0]; local24++) {
				}
				local51 = this.anIntArrayArray53[local24 - 1];
				local56 = this.anIntArrayArray53[local24];
				local67 = this.method4609(local24 - 2)[1];
				local71 = local51[1];
				local75 = local56[1];
				local84 = this.method4609(local24 + 1)[1];
				@Pc(102) int local102 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(118) int local118 = local84 + local71 - local67 - local75;
				@Pc(125) int local125 = local67 - local71 - local118;
				@Pc(130) int local130 = local75 - local67;
				@Pc(142) int local142 = (local118 * local102 >> 12) * local108 >> 12;
				@Pc(148) int local148 = local108 * local125 >> 12;
				@Pc(154) int local154 = local102 * local130 >> 12;
				@Pc(163) int local163 = local154 + local148 + local142 + local71;
				if (local163 <= -32768) {
					local163 = -32767;
				}
				if (local163 >= 32768) {
					local163 = 32767;
				}
				this.aShortArray58[local4] = (short) local163;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray53.length - 1 > local24 && local22 >= this.anIntArrayArray53[local24][0]; local24++) {
				}
				local51 = this.anIntArrayArray53[local24 - 1];
				local56 = this.anIntArrayArray53[local24];
				local67 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				local71 = 4096 - Static511.anIntArray605[local67 >> 5 & 0xFF] >> 1;
				local75 = 4096 - local71;
				local84 = local51[1] * local75 + local71 * local56[1] >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray58[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray53.length - 1 && this.anIntArrayArray53[local24][0] <= local22; local24++) {
				}
				local51 = this.anIntArrayArray53[local24 - 1];
				local56 = this.anIntArrayArray53[local24];
				local67 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				local71 = 4096 - local67;
				local75 = local71 * local51[1] + local67 * local56[1] >> 12;
				if (local75 <= -32768) {
					local75 = -32767;
				}
				if (local75 >= 32768) {
					local75 = 32767;
				}
				this.aShortArray58[local4] = (short) local75;
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5256 = arg0.method2859();
		this.anIntArrayArray53 = new int[arg0.method2859()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray53.length; local17++) {
			this.anIntArrayArray53[local17][0] = arg0.method2825();
			this.anIntArrayArray53[local17][1] = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(II)[I")
	private int[] method4609(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray334;
		} else if (this.anIntArrayArray53.length <= arg0) {
			return this.anIntArray333;
		} else {
			return this.anIntArrayArray53[arg0];
		}
	}
}
