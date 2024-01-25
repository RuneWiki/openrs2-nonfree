import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class5_Sub2_Sub35 extends Class5_Sub2 {

	@OriginalMember(owner = "client!v", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "[I")
	private int[] anIntArray556;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "[S")
	private final short[] aShortArray141 = new short[257];

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
	private int anInt9805 = 0;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	private void method8427() {
		@Pc(8) int local8 = this.anInt9805;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray68.length - 1 && local26 >= this.anIntArrayArray68[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray68[local28 - 1];
				local64 = this.anIntArrayArray68[local28];
				local73 = this.method8428(local28 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method8428(local28 + 1)[1];
				@Pc(108) int local108 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(123) int local123 = local77 + local90 - local73 - local81;
				@Pc(131) int local131 = local73 - local123 - local77;
				@Pc(136) int local136 = local81 - local73;
				@Pc(148) int local148 = local114 * (local123 * local108 >> 12) >> 12;
				@Pc(154) int local154 = local114 * local131 >> 12;
				@Pc(160) int local160 = local136 * local108 >> 12;
				@Pc(168) int local168 = local154 + local148 + local160 + local77;
				if (local168 <= -32768) {
					local168 = -32767;
				}
				if (local168 >= 32768) {
					local168 = 32767;
				}
				this.aShortArray141[local8] = (short) local168;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray68.length - 1 && this.anIntArrayArray68[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray68[local28 - 1];
				local64 = this.anIntArrayArray68[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static556.anIntArray515[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local59[1] * local81 + local77 * local64[1] >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray141[local8] = (short) local90;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray68.length - 1 && this.anIntArrayArray68[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray68[local28 - 1];
				local64 = this.anIntArrayArray68[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local73 * local64[1] + local59[1] * local77 >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray141[local8] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(II)[I")
	private int[] method8428(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray556;
		} else if (arg0 >= this.anIntArrayArray68.length) {
			return this.anIntArray557;
		} else {
			return this.anIntArrayArray68[arg0];
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		if (this.anIntArrayArray68 == null) {
			this.anIntArrayArray68 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray68.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt9805 == 2) {
			this.method8432();
		}
		Static528.method7829();
		this.method8427();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(23) int[] local23 = this.method9042(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static597.anInt10025; local25++) {
				@Pc(33) int local33 = local23[local25] >> 4;
				if (local33 < 0) {
					local33 = 0;
				}
				if (local33 > 256) {
					local33 = 256;
				}
				local11[local25] = this.aShortArray141[local33];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(B)V")
	private void method8432() {
		@Pc(8) int[] local8 = this.anIntArrayArray68[0];
		@Pc(13) int[] local13 = this.anIntArrayArray68[1];
		@Pc(22) int[] local22 = this.anIntArrayArray68[this.anIntArrayArray68.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray68[this.anIntArrayArray68.length - 1];
		this.anIntArray557 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + -local31[1] + local22[1] };
		this.anIntArray556 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - -local8[1] + -local13[1] };
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt9805 = arg0.method5966();
		this.anIntArrayArray68 = new int[arg0.method5966()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray68.length; local21++) {
			this.anIntArrayArray68[local21][0] = arg0.method5968();
			this.anIntArrayArray68[local21][1] = arg0.method5968();
		}
	}
}
