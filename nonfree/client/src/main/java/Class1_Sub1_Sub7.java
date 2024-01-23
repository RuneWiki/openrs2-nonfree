import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
	private int anInt682 = 0;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "[S")
	private short[] aShortArray26 = new short[257];

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
	private void method636() {
		@Pc(8) int[] local8 = this.anIntArrayArray5[0];
		@Pc(13) int[] local13 = this.anIntArrayArray5[1];
		@Pc(27) int[] local27 = this.anIntArrayArray5[this.anIntArrayArray5.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray5[this.anIntArrayArray5.length - 1];
		this.anIntArray72 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray71 = new int[] { local27[0] + local27[0] - local36[0], local27[1] - local36[1] - -local27[1] };
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(27) int[] local27 = this.method4464(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static6.anInt4960; local29++) {
				@Pc(38) int local38 = local27[local29] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local29] = this.aShortArray26[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)[I")
	private int[] method638(@OriginalArg(1) int arg0) {
		if (arg0 >= 0) {
			return this.anIntArrayArray5.length <= arg0 ? this.anIntArray71 : this.anIntArrayArray5[arg0];
		} else {
			return this.anIntArray72;
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		if (this.anIntArrayArray5 == null) {
			this.anIntArrayArray5 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray5.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt682 == 2) {
			this.method636();
		}
		Static129.method2272();
		this.method640();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt682 = arg0.method1853();
		this.anIntArrayArray5 = new int[arg0.method1853()][2];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArrayArray5.length; local18++) {
			this.anIntArrayArray5[local18][0] = arg0.method1879();
			this.anIntArrayArray5[local18][1] = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
	private void method640() {
		@Pc(4) int local4 = this.anInt682;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(94) int local94;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local28 = local4 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray5.length - 1 && this.anIntArrayArray5[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray5[local30 - 1];
				local66 = this.anIntArrayArray5[local30];
				local75 = this.method638(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local94 = this.method638(local30 + 1)[1];
				@Pc(112) int local112 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(123) int local123 = local94 + local79 - local83 - local75;
				@Pc(131) int local131 = local75 - local123 - local79;
				@Pc(137) int local137 = local112 * local112 >> 12;
				@Pc(147) int local147 = (local123 * local112 >> 12) * local137 >> 12;
				@Pc(152) int local152 = local83 - local75;
				@Pc(160) int local160 = local131 * local137 >> 12;
				@Pc(166) int local166 = local152 * local112 >> 12;
				@Pc(176) int local176 = local166 + local147 + local160 + local79;
				if (local176 <= -32768) {
					local176 = -32767;
				}
				if (local176 >= 32768) {
					local176 = 32767;
				}
				this.aShortArray26[local4] = (short) local176;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local28 = local4 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray5.length - 1 && this.anIntArrayArray5[local30][0] <= local28; local30++) {
				}
				local66 = this.anIntArrayArray5[local30];
				local61 = this.anIntArrayArray5[local30 - 1];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static192.anIntArray396[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local94 = local83 * local61[1] + local79 * local66[1] >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray26[local4] = (short) local94;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local28 = local4 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray5.length - 1 && this.anIntArrayArray5[local30][0] <= local28; local30++) {
				}
				local66 = this.anIntArrayArray5[local30];
				local61 = this.anIntArrayArray5[local30 - 1];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local79 * local61[1] + local75 * local66[1] >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray26[local4] = (short) local83;
			}
		}
	}
}
