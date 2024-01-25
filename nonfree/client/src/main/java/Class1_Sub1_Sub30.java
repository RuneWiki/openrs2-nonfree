import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "[S")
	private final short[] aShortArray89 = new short[257];

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
	private int anInt7223 = 0;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(26) int[] local26 = this.method7836(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static501.anInt8748; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray89[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
	private void method5805() {
		@Pc(16) int local16 = this.anInt7223;
		@Pc(34) int local34;
		@Pc(32) int local32;
		@Pc(69) int[] local69;
		@Pc(74) int[] local74;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local32 = local16 << 4;
				for (local34 = 1; this.anIntArrayArray41.length - 1 > local34 && local32 >= this.anIntArrayArray41[local34][0]; local34++) {
				}
				local69 = this.anIntArrayArray41[local34 - 1];
				local74 = this.anIntArrayArray41[local34];
				local83 = this.method5808(local34 - 2)[1];
				local87 = local69[1];
				local91 = local74[1];
				local100 = this.method5808(local34 + 1)[1];
				@Pc(118) int local118 = (local32 - local69[0] << 12) / (local74[0] - local69[0]);
				@Pc(124) int local124 = local118 * local118 >> 12;
				@Pc(134) int local134 = local100 + local87 - local83 - local91;
				@Pc(142) int local142 = local83 - local134 - local87;
				@Pc(147) int local147 = local91 - local83;
				@Pc(159) int local159 = local124 * (local134 * local118 >> 12) >> 12;
				@Pc(165) int local165 = local142 * local124 >> 12;
				@Pc(171) int local171 = local147 * local118 >> 12;
				@Pc(179) int local179 = local87 + local165 + local159 + local171;
				if (local179 <= -32768) {
					local179 = -32767;
				}
				if (local179 >= 32768) {
					local179 = 32767;
				}
				this.aShortArray89[local16] = (short) local179;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local32 = local16 << 4;
				for (local34 = 1; local34 < this.anIntArrayArray41.length - 1 && this.anIntArrayArray41[local34][0] <= local32; local34++) {
				}
				local69 = this.anIntArrayArray41[local34 - 1];
				local74 = this.anIntArrayArray41[local34];
				local83 = (local32 - local69[0] << 12) / (local74[0] - local69[0]);
				local87 = 4096 - Static133.anIntArray110[local83 >> 5 & 0xFF] >> 1;
				local91 = 4096 - local87;
				local100 = local74[1] * local87 + local69[1] * local91 >> 12;
				if (local100 <= -32768) {
					local100 = -32767;
				}
				if (local100 >= 32768) {
					local100 = 32767;
				}
				this.aShortArray89[local16] = (short) local100;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local32 = local16 << 4;
				for (local34 = 1; local34 < this.anIntArrayArray41.length - 1 && this.anIntArrayArray41[local34][0] <= local32; local34++) {
				}
				local69 = this.anIntArrayArray41[local34 - 1];
				local74 = this.anIntArrayArray41[local34];
				local83 = (local32 - local69[0] << 12) / (local74[0] - local69[0]);
				local87 = 4096 - local83;
				local91 = local74[1] * local83 + local87 * local69[1] >> 12;
				if (local91 <= -32768) {
					local91 = -32767;
				}
				if (local91 >= 32768) {
					local91 = 32767;
				}
				this.aShortArray89[local16] = (short) local91;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		if (this.anIntArrayArray41 == null) {
			this.anIntArrayArray41 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray41.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7223 == 2) {
			this.method5807();
		}
		Static263.method3803();
		this.method5805();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt7223 = arg1.method7974();
		this.anIntArrayArray41 = new int[arg1.method7974()][2];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray41.length; local23++) {
			this.anIntArrayArray41[local23][0] = arg1.method7945();
			this.anIntArrayArray41[local23][1] = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
	private void method5807() {
		@Pc(8) int[] local8 = this.anIntArrayArray41[0];
		@Pc(13) int[] local13 = this.anIntArrayArray41[1];
		@Pc(30) int[] local30 = this.anIntArrayArray41[this.anIntArrayArray41.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray41[this.anIntArrayArray41.length - 1];
		this.anIntArray429 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray428 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)[I")
	private int[] method5808(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray429;
		} else if (arg0 >= this.anIntArrayArray41.length) {
			return this.anIntArray428;
		} else {
			return this.anIntArrayArray41[arg0];
		}
	}
}
