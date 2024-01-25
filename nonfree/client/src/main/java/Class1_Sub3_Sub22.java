import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray127;

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "[S")
	private final short[] aShortArray55 = new short[257];

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
	private int anInt4520 = 0;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		if (this.anIntArrayArray127 == null) {
			this.anIntArrayArray127 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray127.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4520 == 2) {
			this.method3703();
		}
		Static443.method5895();
		this.method3697();
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V")
	private void method3697() {
		@Pc(12) int local12 = this.anInt4520;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(90) int local90;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray127.length - 1 > local30 && local28 >= this.anIntArrayArray127[local30][0]; local30++) {
				}
				local57 = this.anIntArrayArray127[local30 - 1];
				local62 = this.anIntArrayArray127[local30];
				local71 = this.method3702(local30 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local90 = this.method3702(local30 + 1)[1];
				@Pc(108) int local108 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(124) int local124 = local75 + local90 - local71 - local79;
				@Pc(130) int local130 = local71 - local75 - local124;
				@Pc(134) int local134 = local79 - local71;
				@Pc(146) int local146 = local114 * (local108 * local124 >> 12) >> 12;
				@Pc(152) int local152 = local114 * local130 >> 12;
				@Pc(158) int local158 = local108 * local134 >> 12;
				@Pc(167) int local167 = local158 + local146 + local152 + local75;
				if (local167 <= -32768) {
					local167 = -32767;
				}
				if (local167 >= 32768) {
					local167 = 32767;
				}
				this.aShortArray55[local12] = (short) local167;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray127.length - 1 && local28 >= this.anIntArrayArray127[local30][0]; local30++) {
				}
				local57 = this.anIntArrayArray127[local30 - 1];
				local62 = this.anIntArrayArray127[local30];
				local71 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static292.anIntArray372[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local90 = local75 * local62[1] + local79 * local57[1] >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray55[local12] = (short) local90;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray127.length - 1 && this.anIntArrayArray127[local30][0] <= local28; local30++) {
				}
				local57 = this.anIntArrayArray127[local30 - 1];
				local62 = this.anIntArrayArray127[local30];
				local71 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local62[1] * local71 + local75 * local57[1] >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray55[local12] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4520 = arg0.method4130();
		this.anIntArrayArray127 = new int[arg0.method4130()][2];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray127.length; local32++) {
			this.anIntArrayArray127[local32][0] = arg0.method4093();
			this.anIntArrayArray127[local32][1] = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(29) int[] local29 = this.method6076(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static347.anInt5974; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local17[local31] = this.aShortArray55[local39];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)[I")
	private int[] method3702(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray362;
		} else if (this.anIntArrayArray127.length <= arg0) {
			return this.anIntArray363;
		} else {
			return this.anIntArrayArray127[arg0];
		}
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V")
	private void method3703() {
		@Pc(8) int[] local8 = this.anIntArrayArray127[0];
		@Pc(21) int[] local21 = this.anIntArrayArray127[1];
		@Pc(30) int[] local30 = this.anIntArrayArray127[this.anIntArrayArray127.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray127[this.anIntArrayArray127.length - 1];
		this.anIntArray363 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - (local39[1] + -local30[1]) };
		this.anIntArray362 = new int[] { local8[0] + local8[0] - local21[0], -local21[1] + local8[1] + local8[1] };
	}
}
