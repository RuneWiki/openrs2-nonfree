import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!c", name = "I", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!c", name = "S", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	private int anInt1254 = 0;

	@OriginalMember(owner = "client!c", name = "P", descriptor = "[S")
	private final short[] aShortArray19 = new short[257];

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V")
	private void method1266() {
		@Pc(8) int local8 = this.anInt1254;
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
				for (local30 = 1; local30 < this.anIntArrayArray16.length - 1 && local28 >= this.anIntArrayArray16[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray16[local30 - 1];
				local66 = this.anIntArrayArray16[local30];
				local75 = this.method1269(local30 - 2)[1];
				local79 = local61[1];
				local83 = local66[1];
				local92 = this.method1269(local30 + 1)[1];
				@Pc(109) int local109 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(123) int local123 = local79 + local92 - local83 - local75;
				@Pc(131) int local131 = local75 - local123 - local79;
				@Pc(136) int local136 = local83 - local75;
				@Pc(148) int local148 = local115 * (local109 * local123 >> 12) >> 12;
				@Pc(154) int local154 = local131 * local115 >> 12;
				@Pc(160) int local160 = local136 * local109 >> 12;
				@Pc(168) int local168 = local79 + local148 + local154 + local160;
				if (local168 <= -32768) {
					local168 = -32767;
				}
				if (local168 >= 32768) {
					local168 = 32767;
				}
				this.aShortArray19[local8] = (short) local168;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray16.length - 1 > local30 && local28 >= this.anIntArrayArray16[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray16[local30 - 1];
				local66 = this.anIntArrayArray16[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - Static251.anIntArray323[local75 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local79;
				local92 = local61[1] * local83 + local66[1] * local79 >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray19[local8] = (short) local92;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray16.length - 1 > local30 && local28 >= this.anIntArrayArray16[local30][0]; local30++) {
				}
				local61 = this.anIntArrayArray16[local30 - 1];
				local66 = this.anIntArrayArray16[local30];
				local75 = (local28 - local61[0] << 12) / (local66[0] - local61[0]);
				local79 = 4096 - local75;
				local83 = local79 * local61[1] + local75 * local66[1] >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray19[local8] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(28) int[] local28 = this.method8362(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static131.anInt2935; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local30] = this.aShortArray19[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1254 = arg1.method6538();
		this.anIntArrayArray16 = new int[arg1.method6538()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray16.length; local21++) {
			this.anIntArrayArray16[local21][0] = arg1.method6535();
			this.anIntArrayArray16[local21][1] = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	private void method1268() {
		@Pc(8) int[] local8 = this.anIntArrayArray16[0];
		@Pc(13) int[] local13 = this.anIntArrayArray16[1];
		@Pc(22) int[] local22 = this.anIntArrayArray16[this.anIntArrayArray16.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray16[this.anIntArrayArray16.length - 1];
		this.anIntArray74 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + local22[1] - local31[1] };
		this.anIntArray73 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		if (this.anIntArrayArray16 == null) {
			this.anIntArrayArray16 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray16.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1254 == 2) {
			this.method1268();
		}
		Static535.method7879();
		this.method1266();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
	private int[] method1269(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray73;
		} else if (arg0 >= this.anIntArrayArray16.length) {
			return this.anIntArray74;
		} else {
			return this.anIntArrayArray16[arg0];
		}
	}
}
