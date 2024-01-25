import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class2_Sub11_Sub7 extends Class2_Sub11 {

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!gr", name = "P", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
	private int anInt3503 = 0;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "[S")
	private final short[] aShortArray76 = new short[257];

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		if (this.anIntArrayArray29 == null) {
			this.anIntArrayArray29 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray29.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3503 == 2) {
			this.method3079();
		}
		Static652.method8957();
		this.method3081();
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V")
	private void method3079() {
		@Pc(8) int[] local8 = this.anIntArrayArray29[0];
		@Pc(21) int[] local21 = this.anIntArrayArray29[1];
		@Pc(30) int[] local30 = this.anIntArrayArray29[this.anIntArrayArray29.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray29[this.anIntArrayArray29.length - 1];
		this.anIntArray277 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - (local39[1] + -local30[1]) };
		this.anIntArray276 = new int[] { local8[0] + local8[0] - local21[0], -local21[1] + local8[1] + local8[1] };
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3503 = arg1.method8581(-17416);
		this.anIntArrayArray29 = new int[arg1.method8581(-17416)][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray29.length; local29++) {
			this.anIntArrayArray29[local29][0] = arg1.method8575();
			this.anIntArrayArray29[local29][1] = arg1.method8575();
		}
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)V")
	private void method3081() {
		@Pc(9) int local9 = this.anInt3503;
		@Pc(31) int local31;
		@Pc(29) int local29;
		@Pc(66) int[] local66;
		@Pc(71) int[] local71;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (local9 == 2) {
			for (local9 = 0; local9 < 257; local9++) {
				local29 = local9 << 4;
				for (local31 = 1; local31 < this.anIntArrayArray29.length - 1 && this.anIntArrayArray29[local31][0] <= local29; local31++) {
				}
				local66 = this.anIntArrayArray29[local31 - 1];
				local71 = this.anIntArrayArray29[local31];
				local80 = this.method3082(local31 - 2)[1];
				local84 = local66[1];
				local88 = local71[1];
				local97 = this.method3082(local31 + 1)[1];
				@Pc(115) int local115 = (local29 - local66[0] << 12) / (local71[0] - local66[0]);
				@Pc(121) int local121 = local115 * local115 >> 12;
				@Pc(131) int local131 = local97 + local84 - local80 - local88;
				@Pc(138) int local138 = local80 - local131 - local84;
				@Pc(142) int local142 = local88 - local80;
				@Pc(154) int local154 = (local131 * local115 >> 12) * local121 >> 12;
				@Pc(160) int local160 = local121 * local138 >> 12;
				@Pc(166) int local166 = local115 * local142 >> 12;
				@Pc(175) int local175 = local166 + local160 + local154 + local84;
				if (local175 <= -32768) {
					local175 = -32767;
				}
				if (local175 >= 32768) {
					local175 = 32767;
				}
				this.aShortArray76[local9] = (short) local175;
			}
		} else if (local9 == 1) {
			for (local9 = 0; local9 < 257; local9++) {
				local29 = local9 << 4;
				for (local31 = 1; this.anIntArrayArray29.length - 1 > local31 && local29 >= this.anIntArrayArray29[local31][0]; local31++) {
				}
				local66 = this.anIntArrayArray29[local31 - 1];
				local71 = this.anIntArrayArray29[local31];
				local80 = (local29 - local66[0] << 12) / (local71[0] - local66[0]);
				local84 = 4096 - Static519.anIntArray590[local80 >> 5 & 0xFF] >> 1;
				local88 = 4096 - local84;
				local97 = local84 * local71[1] + local88 * local66[1] >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray76[local9] = (short) local97;
			}
		} else {
			for (local9 = 0; local9 < 257; local9++) {
				local29 = local9 << 4;
				for (local31 = 1; local31 < this.anIntArrayArray29.length - 1 && local29 >= this.anIntArrayArray29[local31][0]; local31++) {
				}
				local66 = this.anIntArrayArray29[local31 - 1];
				local71 = this.anIntArrayArray29[local31];
				local80 = (local29 - local66[0] << 12) / (local71[0] - local66[0]);
				local84 = 4096 - local80;
				local88 = local80 * local71[1] + local84 * local66[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray76[local9] = (short) local88;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)[I")
	private int[] method3082(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray276;
		} else if (arg0 >= this.anIntArrayArray29.length) {
			return this.anIntArray277;
		} else {
			return this.anIntArrayArray29[arg0];
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(29) int[] local29 = this.method9540(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static301.anInt10214; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray76[local39];
			}
		}
		return local11;
	}
}
