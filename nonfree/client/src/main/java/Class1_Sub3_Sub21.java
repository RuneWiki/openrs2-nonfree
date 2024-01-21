import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!te", name = "L", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!te", name = "W", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "Lclient!he;")
	private final Class41 aClass41_1;

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "Z")
	public final boolean aBoolean217;

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
	public final int anInt3841;

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!te", name = "X", descriptor = "I")
	public int anInt3834;

	@OriginalMember(owner = "client!te", name = "R", descriptor = "I")
	private int anInt3830;

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
	private int anInt3836;

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
	private int anInt3837;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class1_Sub3_Sub21(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass41_1 = new Class41(arg0);
		@Pc(14) int local14 = arg0.method3010();
		this.aBoolean217 = (local14 & 0x1) != 0;
		this.aBoolean215 = (local14 & 0x2) != 0;
		@Pc(45) int local45 = arg0.method3010();
		this.anInt3841 = 0x1 << (local45 & 0x7) + 1;
		this.aBoolean218 = (local45 & 0x8) != 0;
		this.aBoolean214 = (local45 & 0x80) != 0;
		this.anInt3834 = arg0.method3023();
		this.anInt3830 = arg0.method3010();
		if (this.anInt3830 == 255) {
			this.anInt3830 = 256;
		}
		this.anInt3836 = arg0.method3009();
		this.anInt3837 = arg0.method3009();
		arg0.method3010();
		arg0.method3010();
		arg0.method3010();
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		this.aClass41_1 = new Class41();
		this.anInt3841 = 64;
		this.aBoolean217 = true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!sg;Lclient!ab;Z)Z")
	public boolean method2901(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class3 arg1) {
		return this.aClass41_1.method1120(arg0, arg1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IFBLclient!sg;Lclient!ab;)[I")
	public int[] method2903(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Class3 arg3) {
		if (this.anIntArray322 == null || arg1 != this.aFloat2) {
			if (!this.aClass41_1.method1120(arg2, arg3)) {
				return null;
			}
			@Pc(31) int local31 = arg0 >= this.anInt3841 ? this.anInt3841 : arg0;
			this.anIntArray322 = this.aClass41_1.method1122(this.aBoolean214, true, local31, local31, arg3, arg2, (double) arg1);
			this.aFloat2 = arg1;
			if (this.aBoolean218) {
				@Pc(55) int[] local55 = new int[local31];
				@Pc(58) int[] local58 = new int[local31];
				@Pc(63) int[] local63 = new int[local31 * local31];
				@Pc(66) int[] local66 = new int[local31];
				@Pc(71) int local71 = local31;
				@Pc(72) int local72 = local31;
				@Pc(78) int local78 = local31 - 1;
				@Pc(82) int local82 = local31 - 1;
				@Pc(86) int local86 = local31 * local31;
				@Pc(92) int local92;
				for (@Pc(88) int local88 = 2; local88 >= 0; local88--) {
					for (local92 = local78; local92 >= 0; local92--) {
						local71--;
						@Pc(100) int local100 = this.anIntArray322[local71];
						local55[local92] += local100 >> 16 & 0xFF;
						local58[local92] += local100 >> 8 & 0xFF;
						local66[local92] += local100 & 0xFF;
					}
					if (local71 == 0) {
						local71 = local86;
					}
				}
				@Pc(152) int local152 = local86;
				for (@Pc(154) int local154 = local82; local154 >= 0; local154--) {
					@Pc(158) int local158 = 1;
					@Pc(161) int local161 = 0;
					@Pc(163) int local163 = 0;
					@Pc(164) int local164 = 0;
					@Pc(166) int local166 = 1;
					for (local92 = 2; local92 >= 0; local92--) {
						local158--;
						local163 += local66[local158];
						local161 += local58[local158];
						local164 += local55[local158];
						if (local158 == 0) {
							local158 = local31;
						}
					}
					for (local92 = local78; local92 >= 0; local92--) {
						@Pc(207) int local207 = local161 / 9;
						local166--;
						local158--;
						@Pc(213) int local213 = local163 / 9;
						@Pc(217) int local217 = local164 / 9;
						local152--;
						local63[local152] = local213 | local207 << 8 | local217 << 16;
						local163 += local66[local158] - local66[local166];
						local161 += local58[local158] - local58[local166];
						local164 += local55[local158] - local55[local166];
						if (local158 == 0) {
							local158 = local31;
						}
						if (local166 == 0) {
							local166 = local31;
						}
					}
					for (local92 = local78; local92 >= 0; local92--) {
						local71--;
						@Pc(289) int local289 = this.anIntArray322[local71];
						local72--;
						@Pc(295) int local295 = this.anIntArray322[local72];
						local55[local92] += (local289 >> 16 & 0xFF) - ((local295 & 0xFFFE72) >> 16);
						local58[local92] += (local289 >> 8 & 0xFF) - (local295 >> 8 & 0xFF);
						local66[local92] += (local289 & 0xFF) - (local295 & 0xFF);
					}
					if (local71 == 0) {
						local71 = local86;
					}
					if (local72 == 0) {
						local72 = local86;
					}
				}
				this.anIntArray322 = local63;
			}
		}
		return this.anIntArray322;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
	public void method2904(@OriginalArg(1) int arg0) {
		if (this.anIntArray322 == null || this.anInt3837 == 0 && this.anInt3836 == 0) {
			return;
		}
		if (Static210.anIntArray367 == null || Static210.anIntArray367.length < this.anIntArray322.length) {
			Static210.anIntArray367 = new int[this.anIntArray322.length];
		}
		@Pc(50) int local50 = this.anIntArray322.length == 4096 ? 64 : 128;
		@Pc(54) int local54 = this.anIntArray322.length;
		@Pc(59) int local59 = this.anInt3836 * arg0;
		@Pc(63) int local63 = local54 - 1;
		@Pc(70) int local70 = this.anInt3837 * local50 * arg0;
		@Pc(74) int local74 = local50 - 1;
		for (@Pc(76) int local76 = 0; local76 < local54; local76 += local50) {
			@Pc(84) int local84 = local63 & local70 + local76;
			for (@Pc(86) int local86 = 0; local86 < local50; local86++) {
				@Pc(93) int local93 = local76 + local86;
				@Pc(102) int local102 = local84 + (local74 & local86 + local59);
				Static210.anIntArray367[local93] = this.anIntArray322[local102];
			}
		}
		@Pc(127) int[] local127 = this.anIntArray322;
		this.anIntArray322 = Static210.anIntArray367;
		Static210.anIntArray367 = local127;
	}

	@OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ab;ILclient!sg;)[I")
	public int[] method2907(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) Interface3 arg2) {
		if (this.aClass41_1.method1120(arg2, arg1)) {
			@Pc(29) int local29 = this.anInt3841 > arg0 ? arg0 : this.anInt3841;
			return this.aClass41_1.method1122(this.aBoolean214, false, local29, local29, arg1, arg2, 1.0D);
		} else {
			return null;
		}
	}
}
