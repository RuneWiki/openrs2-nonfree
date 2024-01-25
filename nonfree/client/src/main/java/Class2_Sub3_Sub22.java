import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oj", name = "L", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!oj", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!oj", name = "R", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
	private int anInt7649 = 0;

	@OriginalMember(owner = "client!oj", name = "S", descriptor = "[S")
	private final short[] aShortArray101 = new short[257];

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt7649 = arg0.method8383();
		this.anIntArrayArray40 = new int[arg0.method8383()][2];
		for (@Pc(19) int local19 = 0; local19 < this.anIntArrayArray40.length; local19++) {
			this.anIntArrayArray40[local19][0] = arg0.method8326();
			this.anIntArrayArray40[local19][1] = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
	private void method6556() {
		@Pc(4) int local4 = this.anInt7649;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(53) int[] local53;
		@Pc(58) int[] local58;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray40.length - 1 > local26 && this.anIntArrayArray40[local26][0] <= local24; local26++) {
				}
				local53 = this.anIntArrayArray40[local26 - 1];
				local58 = this.anIntArrayArray40[local26];
				local67 = this.method6558(local26 - 2)[1];
				local71 = local53[1];
				local75 = local58[1];
				local84 = this.method6558(local26 + 1)[1];
				@Pc(102) int local102 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(118) int local118 = local71 + local84 - local75 - local67;
				@Pc(125) int local125 = local67 - local118 - local71;
				@Pc(130) int local130 = local75 - local67;
				@Pc(142) int local142 = (local102 * local118 >> 12) * local108 >> 12;
				@Pc(148) int local148 = local125 * local108 >> 12;
				@Pc(154) int local154 = local102 * local130 >> 12;
				@Pc(162) int local162 = local71 + local154 + local148 + local142;
				if (local162 <= -32768) {
					local162 = -32767;
				}
				if (local162 >= 32768) {
					local162 = 32767;
				}
				this.aShortArray101[local4] = (short) local162;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray40.length - 1 > local26 && this.anIntArrayArray40[local26][0] <= local24; local26++) {
				}
				local53 = this.anIntArrayArray40[local26 - 1];
				local58 = this.anIntArrayArray40[local26];
				local67 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - Static375.anIntArray163[local67 >> 5 & 0xFF] >> 1;
				local75 = 4096 - local71;
				local84 = local53[1] * local75 + local58[1] * local71 >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray101[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray40.length - 1 && local24 >= this.anIntArrayArray40[local26][0]; local26++) {
				}
				local53 = this.anIntArrayArray40[local26 - 1];
				local58 = this.anIntArrayArray40[local26];
				local67 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - local67;
				local75 = local58[1] * local67 + local71 * local53[1] >> 12;
				if (local75 <= -32768) {
					local75 = -32767;
				}
				if (local75 >= 32768) {
					local75 = 32767;
				}
				this.aShortArray101[local4] = (short) local75;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(27) int[] local27 = this.method9156(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static222.anInt4971; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray101[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	private void method6557() {
		@Pc(8) int[] local8 = this.anIntArrayArray40[0];
		@Pc(13) int[] local13 = this.anIntArrayArray40[1];
		@Pc(22) int[] local22 = this.anIntArrayArray40[this.anIntArrayArray40.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray40[this.anIntArrayArray40.length - 1];
		this.anIntArray489 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (-local22[1] + local31[1]) };
		this.anIntArray490 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] - -local13[1]) };
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		if (this.anIntArrayArray40 == null) {
			this.anIntArrayArray40 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray40.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7649 == 2) {
			this.method6557();
		}
		Static508.method7815();
		this.method6556();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[I")
	private int[] method6558(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray490;
		} else if (arg0 >= this.anIntArrayArray40.length) {
			return this.anIntArray489;
		} else {
			return this.anIntArrayArray40[arg0];
		}
	}
}
