import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray103;

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "[S")
	private final short[] aShortArray75 = new short[257];

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
	private int anInt4029 = 0;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V")
	private void method3261() {
		@Pc(8) int[] local8 = this.anIntArrayArray103[0];
		@Pc(13) int[] local13 = this.anIntArrayArray103[1];
		@Pc(30) int[] local30 = this.anIntArrayArray103[this.anIntArrayArray103.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray103[this.anIntArrayArray103.length - 1];
		this.anIntArray360 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - local39[1] + local30[1] };
		this.anIntArray359 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
	private void method3263() {
		@Pc(8) int local8 = this.anInt4029;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(61) int[] local61;
		@Pc(66) int[] local66;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray103.length - 1 && this.anIntArrayArray103[local30][0] <= local28; local30++) {
				}
				local61 = this.anIntArrayArray103[local30 - 1];
				local66 = this.anIntArrayArray103[local30];
				local75 = this.method3264(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method3264(local30 + 1)[1];
				@Pc(109) int local109 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(125) int local125 = local92 + local79 - local83 - local75;
				@Pc(133) int local133 = local75 - local125 - local79;
				@Pc(138) int local138 = local83 - local75;
				@Pc(150) int local150 = local115 * (local109 * local125 >> 12) >> 12;
				@Pc(156) int local156 = local115 * local133 >> 12;
				@Pc(162) int local162 = local138 * local109 >> 12;
				@Pc(170) int local170 = local79 + local162 + local156 + local150;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray75[local8] = (short) local170;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray103.length - 1 && local28 >= this.anIntArrayArray103[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray103[local30 - 1];
				local66 = this.anIntArrayArray103[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static314.anIntArray477[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local83 * local61[1] + local79 * local66[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray75[local8] = (short) local92;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray103.length - 1 > local30 && local28 >= this.anIntArrayArray103[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray103[local30 - 1];
				local66 = this.anIntArrayArray103[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local79 * local61[1] + local66[1] * local75 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray75[local8] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)[I")
	private int[] method3264(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray359;
		} else if (arg0 >= this.anIntArrayArray103.length) {
			return this.anIntArray360;
		} else {
			return this.anIntArrayArray103[arg0];
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(26) int[] local26 = this.method6266(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static398.anInt6955; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray75[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4029 = arg0.method6138();
		this.anIntArrayArray103 = new int[arg0.method6138()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray103.length; local28++) {
			this.anIntArrayArray103[local28][0] = arg0.method6148();
			this.anIntArrayArray103[local28][1] = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		if (this.anIntArrayArray103 == null) {
			this.anIntArrayArray103 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray103.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4029 == 2) {
			this.method3261();
		}
		Static193.method2769();
		this.method3263();
	}
}
