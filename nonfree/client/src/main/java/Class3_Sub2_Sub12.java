import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "[S")
	private final short[] aShortArray43 = new short[257];

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
	private int anInt3621 = 0;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(29) int[] local29 = this.method8669(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static201.anInt3738; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray43[local39];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)[I")
	private int[] method3098(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray213;
		} else if (arg0 >= this.anIntArrayArray20.length) {
			return this.anIntArray214;
		} else {
			return this.anIntArrayArray20[arg0];
		}
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	private void method3099() {
		@Pc(10) int local10 = this.anInt3621;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (local10 == 2) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; this.anIntArrayArray20.length - 1 > local30 && local28 >= this.anIntArrayArray20[local30][0]; local30++) {
				}
				local57 = this.anIntArrayArray20[local30 - 1];
				local62 = this.anIntArrayArray20[local30];
				local71 = this.method3098(local30 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method3098(local30 + 1)[1];
				@Pc(106) int local106 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(112) int local112 = local106 * local106 >> 12;
				@Pc(122) int local122 = local75 + local88 - local79 - local71;
				@Pc(129) int local129 = local71 - local75 - local122;
				@Pc(134) int local134 = local79 - local71;
				@Pc(146) int local146 = local112 * (local106 * local122 >> 12) >> 12;
				@Pc(152) int local152 = local112 * local129 >> 12;
				@Pc(158) int local158 = local106 * local134 >> 12;
				@Pc(168) int local168 = local158 + local146 + local152 + local75;
				if (local168 <= -32768) {
					local168 = -32767;
				}
				if (local168 >= 32768) {
					local168 = 32767;
				}
				this.aShortArray43[local10] = (short) local168;
			}
		} else if (local10 == 1) {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; this.anIntArrayArray20.length - 1 > local30 && this.anIntArrayArray20[local30][0] <= local28; local30++) {
				}
				local57 = this.anIntArrayArray20[local30 - 1];
				local62 = this.anIntArrayArray20[local30];
				local71 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static57.anIntArray535[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local79 * local57[1] + local75 * local62[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray43[local10] = (short) local88;
			}
		} else {
			for (local10 = 0; local10 < 257; local10++) {
				local28 = local10 << 4;
				for (local30 = 1; this.anIntArrayArray20.length - 1 > local30 && local28 >= this.anIntArrayArray20[local30][0]; local30++) {
				}
				local57 = this.anIntArrayArray20[local30 - 1];
				local62 = this.anIntArrayArray20[local30];
				local71 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local62[1] * local71 + local57[1] * local75 >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray43[local10] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		if (this.anIntArrayArray20 == null) {
			this.anIntArrayArray20 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray20.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3621 == 2) {
			this.method3100();
		}
		Static3.method41();
		this.method3099();
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
	private void method3100() {
		@Pc(8) int[] local8 = this.anIntArrayArray20[0];
		@Pc(13) int[] local13 = this.anIntArrayArray20[1];
		@Pc(22) int[] local22 = this.anIntArrayArray20[this.anIntArrayArray20.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray20[this.anIntArrayArray20.length - 1];
		this.anIntArray214 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] - local22[1]) };
		this.anIntArray213 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3621 = arg0.method5633();
		this.anIntArrayArray20 = new int[arg0.method5633()][2];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray20.length; local25++) {
			this.anIntArrayArray20[local25][0] = arg0.method5610();
			this.anIntArrayArray20[local25][1] = arg0.method5610();
		}
	}
}
