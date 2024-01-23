import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!sc", name = "R", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "Lclient!b;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "Z")
	private boolean aBoolean257;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
	private int anInt4106;

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
	private int anInt4116;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ea;)V")
	public Class2_Sub2_Sub19(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass7_1 = new Class7(arg0);
		this.aBoolean255 = arg0.method209() == 1;
		this.aBoolean257 = arg0.method209() == 1;
		arg0.method209();
		arg0.method209();
		@Pc(46) int local46 = arg0.method209() & 0x3;
		this.anInt4106 = arg0.method186();
		this.anInt4116 = arg0.method186();
		arg0.method209();
		arg0.method209();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!nb;ZZLclient!fe;)[I")
	public int[] method2828(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Interface1 arg2) {
		if (this.aClass7_1.method287(arg2, arg0)) {
			@Pc(23) int local23 = arg1 ? 64 : 128;
			return this.aClass7_1.method284(1.0D, local23, this.aBoolean257, arg0, arg2, local23, false);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IZ)V")
	public void method2829(@OriginalArg(0) int arg0) {
		if (this.anIntArray428 == null || this.anInt4116 == 0 && this.anInt4106 == 0) {
			return;
		}
		if (Static199.anIntArray465 == null || Static199.anIntArray465.length < this.anIntArray428.length) {
			Static199.anIntArray465 = new int[this.anIntArray428.length];
		}
		@Pc(40) int local40 = this.anIntArray428.length;
		@Pc(45) int local45 = this.anInt4106 * arg0;
		@Pc(49) int local49 = local40 - 1;
		@Pc(60) int local60 = this.anIntArray428.length == 4096 ? 64 : 128;
		@Pc(67) int local67 = local60 * arg0 * this.anInt4116;
		@Pc(71) int local71 = local60 - 1;
		for (@Pc(73) int local73 = 0; local73 < local40; local73 += local60) {
			@Pc(82) int local82 = local73 + local67 & local49;
			for (@Pc(84) int local84 = 0; local84 < local60; local84++) {
				@Pc(91) int local91 = local73 + local84;
				@Pc(99) int local99 = local82 + (local71 & local45 + local84);
				Static199.anIntArray465[local91] = this.anIntArray428[local99];
			}
		}
		@Pc(124) int[] local124 = this.anIntArray428;
		this.anIntArray428 = Static199.anIntArray465;
		Static199.anIntArray465 = local124;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fe;ILclient!nb;)Z")
	public boolean method2830(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Class15 arg1) {
		return this.aClass7_1.method287(arg0, arg1);
	}

	@OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fe;FLclient!nb;ZZ)[I")
	public int[] method2831(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray428 == null || arg1 != this.aFloat3) {
			if (!this.aClass7_1.method287(arg0, arg2)) {
				return null;
			}
			@Pc(34) int local34 = arg3 ? 64 : 128;
			this.anIntArray428 = this.aClass7_1.method284((double) arg1, local34, this.aBoolean257, arg2, arg0, local34, true);
			this.aFloat3 = arg1;
			if (this.aBoolean255) {
				@Pc(58) int[] local58 = new int[local34];
				@Pc(63) int[] local63 = new int[local34 * local34];
				@Pc(66) int[] local66 = new int[local34];
				@Pc(69) int[] local69 = new int[local34];
				@Pc(76) int local76 = local34;
				@Pc(77) int local77 = local34;
				@Pc(81) int local81 = local34 - 1;
				@Pc(85) int local85 = local34 - 1;
				@Pc(89) int local89 = local34 * local34;
				@Pc(95) int local95;
				for (@Pc(91) int local91 = 2; local91 >= 0; local91--) {
					for (local95 = local85; local95 >= 0; local95--) {
						local76--;
						@Pc(103) int local103 = this.anIntArray428[local76];
						local58[local95] += local103 >> 16 & 0xFF;
						local69[local95] += local103 >> 8 & 0xFF;
						local66[local95] += local103 & 0xFF;
					}
					if (local76 == 0) {
						local76 = local89;
					}
				}
				@Pc(149) int local149 = local89;
				for (@Pc(151) int local151 = local81; local151 >= 0; local151--) {
					@Pc(155) int local155 = 1;
					@Pc(158) int local158 = 0;
					@Pc(160) int local160 = 0;
					@Pc(161) int local161 = 0;
					@Pc(163) int local163 = 1;
					for (local95 = 2; local95 >= 0; local95--) {
						local163--;
						local161 += local58[local163];
						local160 += local66[local163];
						local158 += local69[local163];
						if (local163 == 0) {
							local163 = local34;
						}
					}
					for (local95 = local85; local95 >= 0; local95--) {
						local155--;
						local163--;
						@Pc(203) int local203 = local161 / 9;
						@Pc(207) int local207 = local160 / 9;
						@Pc(211) int local211 = local158 / 9;
						local149--;
						local63[local149] = local207 | local211 << 8 | local203 << 16;
						local158 += local69[local163] - local69[local155];
						local161 += local58[local163] - local58[local155];
						local160 += local66[local163] - local66[local155];
						if (local163 == 0) {
							local163 = local34;
						}
						if (local155 == 0) {
							local155 = local34;
						}
					}
					for (local95 = local85; local95 >= 0; local95--) {
						local77--;
						@Pc(280) int local280 = this.anIntArray428[local77];
						local76--;
						@Pc(286) int local286 = this.anIntArray428[local76];
						local58[local95] += (local286 >> 16 & 0xFF) - ((local280 & 0xFF6387) >> 16);
						local69[local95] += (local286 >> 8 & 0xFF) - (local280 >> 8 & 0xFF);
						local66[local95] += (local286 & 0xFF) - (local280 & 0xFF);
					}
					if (local77 == 0) {
						local77 = local89;
					}
					if (local76 == 0) {
						local76 = local89;
					}
				}
				this.anIntArray428 = local63;
			}
		}
		return this.anIntArray428;
	}
}
