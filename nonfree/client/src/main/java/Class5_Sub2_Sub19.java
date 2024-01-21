import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class5_Sub2_Sub19 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "Z")
	public boolean aBoolean159 = false;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "Lclient!aa;")
	private final Class2 aClass2_1;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "Z")
	public boolean aBoolean157;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "Z")
	public final boolean aBoolean160;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
	public final int anInt3512;

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "Z")
	private boolean aBoolean161;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
	public int anInt3504;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
	private int anInt3510;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
	private int anInt3520;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	private int anInt3505;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class5_Sub2_Sub19(@OriginalArg(0) Class5_Sub6 arg0) {
		this.aClass2_1 = new Class2(arg0);
		@Pc(14) int local14 = arg0.method3062();
		this.aBoolean157 = (local14 & 0x2) != 0;
		this.aBoolean160 = (local14 & 0x1) != 0;
		@Pc(42) int local42 = arg0.method3062();
		this.anInt3512 = 0x1 << (local42 & 0x7) + 1;
		this.aBoolean158 = (local42 & 0x80) != 0;
		this.aBoolean161 = (local42 & 0x8) != 0;
		this.anInt3504 = arg0.method3077();
		this.anInt3510 = arg0.method3062();
		if (this.anInt3510 == 255) {
			this.anInt3510 = 256;
		}
		this.anInt3520 = arg0.method3053();
		this.anInt3505 = arg0.method3053();
		arg0.method3062();
		arg0.method3062();
		arg0.method3062();
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub19() {
		this.aClass2_1 = new Class2();
		this.aBoolean160 = true;
		this.anInt3512 = 64;
	}

	@OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!wa;ILclient!cj;)[I")
	public int[] method2663(@OriginalArg(1) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface1 arg2) {
		if (this.aClass2_1.method40(arg2, arg0)) {
			@Pc(30) int local30 = this.anInt3512 > arg1 ? arg1 : this.anInt3512;
			return this.aClass2_1.method41(false, local30, arg0, local30, this.aBoolean158, arg2, 1.0D);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
	public void method2664(@OriginalArg(0) int arg0) {
		if (this.anIntArray370 == null || this.anInt3505 == 0 && this.anInt3520 == 0) {
			return;
		}
		if (Static154.anIntArray341 == null || Static154.anIntArray341.length < this.anIntArray370.length) {
			Static154.anIntArray341 = new int[this.anIntArray370.length];
		}
		@Pc(51) int local51 = this.anIntArray370.length == 4096 ? 64 : 128;
		@Pc(56) int local56 = this.anInt3520 * arg0;
		@Pc(60) int local60 = this.anIntArray370.length;
		@Pc(64) int local64 = local51 - 1;
		@Pc(71) int local71 = local51 * arg0 * this.anInt3505;
		@Pc(75) int local75 = local60 - 1;
		for (@Pc(77) int local77 = 0; local77 < local60; local77 += local51) {
			@Pc(85) int local85 = local75 & local71 + local77;
			for (@Pc(87) int local87 = 0; local87 < local51; local87++) {
				@Pc(94) int local94 = local77 + local87;
				@Pc(102) int local102 = (local56 + local87 & local64) + local85;
				Static154.anIntArray341[local94] = this.anIntArray370[local102];
			}
		}
		@Pc(131) int[] local131 = this.anIntArray370;
		this.anIntArray370 = Static154.anIntArray341;
		Static154.anIntArray341 = local131;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!wa;Lclient!cj;)Z")
	public boolean method2666(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Interface1 arg1) {
		return this.aClass2_1.method40(arg1, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IFLclient!cj;Lclient!wa;I)[I")
	public int[] method2668(@OriginalArg(1) float arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray370 == null || arg0 != this.aFloat3) {
			if (!this.aClass2_1.method40(arg1, arg2)) {
				return null;
			}
			@Pc(36) int local36 = arg3 < this.anInt3512 ? arg3 : this.anInt3512;
			this.anIntArray370 = this.aClass2_1.method41(true, local36, arg2, local36, this.aBoolean158, arg1, (double) arg0);
			this.aFloat3 = arg0;
			if (this.aBoolean161) {
				@Pc(60) int[] local60 = new int[local36];
				@Pc(63) int[] local63 = new int[local36];
				@Pc(66) int[] local66 = new int[local36];
				@Pc(71) int[] local71 = new int[local36 * local36];
				@Pc(76) int local76 = local36;
				@Pc(77) int local77 = local36;
				@Pc(81) int local81 = local36 - 1;
				@Pc(87) int local87 = local36 - 1;
				@Pc(91) int local91 = local36 * local36;
				@Pc(97) int local97;
				for (@Pc(93) int local93 = 2; local93 >= 0; local93--) {
					for (local97 = local81; local97 >= 0; local97--) {
						local76--;
						@Pc(105) int local105 = this.anIntArray370[local76];
						local60[local97] += local105 >> 16 & 0xFF;
						local63[local97] += local105 >> 8 & 0xFF;
						local66[local97] += local105 & 0xFF;
					}
					if (local76 == 0) {
						local76 = local91;
					}
				}
				@Pc(148) int local148 = local91;
				for (@Pc(150) int local150 = local87; local150 >= 0; local150--) {
					@Pc(154) int local154 = 1;
					@Pc(157) int local157 = 0;
					@Pc(159) int local159 = 0;
					@Pc(160) int local160 = 0;
					@Pc(162) int local162 = 1;
					for (local97 = 2; local97 >= 0; local97--) {
						local162--;
						local159 += local66[local162];
						local160 += local60[local162];
						local157 += local63[local162];
						if (local162 == 0) {
							local162 = local36;
						}
					}
					for (local97 = local81; local97 >= 0; local97--) {
						@Pc(203) int local203 = local160 / 9;
						local154--;
						local162--;
						@Pc(209) int local209 = local159 / 9;
						@Pc(213) int local213 = local157 / 9;
						local148--;
						local71[local148] = local213 << 8 | local203 << 16 | local209;
						local160 += local60[local162] - local60[local154];
						local157 += local63[local162] - local63[local154];
						local159 += local66[local162] - local66[local154];
						if (local162 == 0) {
							local162 = local36;
						}
						if (local154 == 0) {
							local154 = local36;
						}
					}
					for (local97 = local81; local97 >= 0; local97--) {
						local77--;
						@Pc(285) int local285 = this.anIntArray370[local77];
						local76--;
						@Pc(291) int local291 = this.anIntArray370[local76];
						local60[local97] += (local291 >> 16 & 0xFF) - (local285 >> 16 & 0xFF);
						local63[local97] += (local291 >> 8 & 0xFF) - ((local285 & 0xFF1F) >> 8);
						local66[local97] += (local291 & 0xFF) - (local285 & 0xFF);
					}
					if (local76 == 0) {
						local76 = local91;
					}
					if (local77 == 0) {
						local77 = local91;
					}
				}
				this.anIntArray370 = local71;
			}
		}
		return this.anIntArray370;
	}
}
