import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class5_Sub1_Sub11 extends Class5_Sub1 {

	@OriginalMember(owner = "client!er", name = "D", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!er", name = "F", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!er", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!er", name = "M", descriptor = "[S")
	private final short[] aShortArray14 = new short[257];

	@OriginalMember(owner = "client!er", name = "R", descriptor = "I")
	private int anInt1802 = 0;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(28) int[] local28 = this.method5772(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static148.anInt2666; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local30] = this.aShortArray14[local38];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V")
	private void method1474() {
		@Pc(8) int[] local8 = this.anIntArrayArray10[0];
		@Pc(19) int[] local19 = this.anIntArrayArray10[1];
		@Pc(28) int[] local28 = this.anIntArrayArray10[this.anIntArrayArray10.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray10[this.anIntArrayArray10.length - 1];
		this.anIntArray82 = new int[] { local8[0] + local8[0] - local19[0], -local19[1] - -local8[1] + local8[1] };
		this.anIntArray83 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + local28[1] + -local37[1] };
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[I")
	private int[] method1475(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray82;
		} else if (this.anIntArrayArray10.length <= arg0) {
			return this.anIntArray83;
		} else {
			return this.anIntArrayArray10[arg0];
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1802 = arg1.method5539();
		this.anIntArrayArray10 = new int[arg1.method5539()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray10.length; local24++) {
			this.anIntArrayArray10[local24][0] = arg1.method5598();
			this.anIntArrayArray10[local24][1] = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		if (this.anIntArrayArray10 == null) {
			this.anIntArrayArray10 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray10.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1802 == 2) {
			this.method1474();
		}
		Static56.method929();
		this.method1476();
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "(I)V")
	private void method1476() {
		@Pc(4) int local4 = this.anInt1802;
		@Pc(22) int local22;
		@Pc(20) int local20;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray10.length - 1 > local22 && this.anIntArrayArray10[local22][0] <= local20; local22++) {
				}
				local57 = this.anIntArrayArray10[local22 - 1];
				local62 = this.anIntArrayArray10[local22];
				local73 = this.method1475(local22 - 2)[1];
				local77 = local57[1];
				local81 = local62[1];
				local90 = this.method1475(local22 + 1)[1];
				@Pc(107) int local107 = (local20 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(123) int local123 = local77 + local90 - local73 - local81;
				@Pc(131) int local131 = local73 - local123 - local77;
				@Pc(136) int local136 = local81 - local73;
				@Pc(148) int local148 = (local107 * local123 >> 12) * local113 >> 12;
				@Pc(154) int local154 = local113 * local131 >> 12;
				@Pc(160) int local160 = local136 * local107 >> 12;
				@Pc(169) int local169 = local77 + local154 + local148 + local160;
				if (local169 <= -32768) {
					local169 = -32767;
				}
				if (local169 >= 32768) {
					local169 = 32767;
				}
				this.aShortArray14[local4] = (short) local169;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray10.length - 1 && this.anIntArrayArray10[local22][0] <= local20; local22++) {
				}
				local57 = this.anIntArrayArray10[local22 - 1];
				local62 = this.anIntArrayArray10[local22];
				local73 = (local20 - local57[0] << 12) / (local62[0] - local57[0]);
				local77 = 4096 - Static412.anIntArray467[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local62[1] * local77 + local57[1] * local81 >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray14[local4] = (short) local90;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray10.length - 1 > local22 && this.anIntArrayArray10[local22][0] <= local20; local22++) {
				}
				local57 = this.anIntArrayArray10[local22 - 1];
				local62 = this.anIntArrayArray10[local22];
				local73 = (local20 - local57[0] << 12) / (local62[0] - local57[0]);
				local77 = 4096 - local73;
				local81 = local73 * local62[1] + local57[1] * local77 >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray14[local4] = (short) local81;
			}
		}
	}
}
