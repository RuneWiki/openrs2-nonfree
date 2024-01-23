import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
	private int anInt2604 = 1;

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
	private int anInt2610 = 1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(26) int local26 = this.anInt2610 + this.anInt2610 + 1;
			@Pc(30) int local30 = 65536 / local26;
			@Pc(38) int local38 = this.anInt2604 + this.anInt2604 + 1;
			@Pc(42) int local42 = 65536 / local38;
			@Pc(45) int[][] local45 = new int[local26][];
			@Pc(51) int local51;
			for (local51 = arg0 - this.anInt2610; local51 <= this.anInt2610 + arg0; local51++) {
				@Pc(59) int local59 = 0;
				@Pc(67) int[] local67 = this.method4450(0, Static9.anInt244 & local51);
				@Pc(70) int[] local70 = new int[Static131.anInt2513];
				@Pc(74) int local74;
				for (local74 = -this.anInt2604; local74 <= this.anInt2604; local74++) {
					local59 += local67[Static11.anInt321 & local74];
				}
				local74 = 0;
				while (local74 < Static131.anInt2513) {
					local70[local74] = local59 * local42 >> 16;
					local59 -= local67[Static11.anInt321 & local74 - this.anInt2604];
					local74++;
					local59 += local67[local74 + this.anInt2604 & Static11.anInt321];
				}
				local45[local51 + this.anInt2610 - arg0] = local70;
			}
			for (local51 = 0; local51 < Static131.anInt2513; local51++) {
				@Pc(152) int local152 = 0;
				for (@Pc(154) int local154 = 0; local154 < local26; local154++) {
					local152 += local45[local154][local51];
				}
				local7[local51] = local30 * local152 >> 16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(31) int local31 = this.anInt2610 + this.anInt2610 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt2604 + this.anInt2604 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(76) int local76;
			@Pc(82) int local82;
			@Pc(88) int local88;
			for (@Pc(56) int local56 = arg0 - this.anInt2610; local56 <= this.anInt2610 + arg0; local56++) {
				@Pc(74) int[][] local74 = this.method4457(0, local56 & Static9.anInt244);
				local76 = 0;
				@Pc(80) int[][] local80 = new int[3][Static131.anInt2513];
				local82 = 0;
				@Pc(86) int[] local86 = local74[2];
				local88 = 0;
				@Pc(92) int[] local92 = local74[1];
				@Pc(96) int[] local96 = local74[0];
				for (@Pc(100) int local100 = -this.anInt2604; local100 <= this.anInt2604; local100++) {
					@Pc(112) int local112 = local100 & Static11.anInt321;
					local76 += local96[local112];
					local88 += local86[local112];
					local82 += local92[local112];
				}
				@Pc(137) int[] local137 = local80[2];
				@Pc(141) int[] local141 = local80[0];
				@Pc(145) int[] local145 = local80[1];
				@Pc(147) int local147 = 0;
				while (Static131.anInt2513 > local147) {
					local141[local147] = local47 * local76 >> 16;
					local145[local147] = local82 * local47 >> 16;
					local137[local147] = local47 * local88 >> 16;
					@Pc(182) int local182 = local147 - this.anInt2604 & Static11.anInt321;
					local76 -= local96[local182];
					local82 -= local92[local182];
					local88 -= local86[local182];
					local147++;
					@Pc(208) int local208 = Static11.anInt321 & this.anInt2604 + local147;
					local88 += local86[local208];
					local82 += local92[local208];
					local76 += local96[local208];
				}
				local50[local56 + this.anInt2610 - arg0] = local80;
			}
			@Pc(246) int[] local246 = local7[1];
			@Pc(250) int[] local250 = local7[2];
			@Pc(254) int[] local254 = local7[0];
			for (local76 = 0; local76 < Static131.anInt2513; local76++) {
				local82 = 0;
				local88 = 0;
				@Pc(269) int local269 = 0;
				for (@Pc(271) int local271 = 0; local271 < local31; local271++) {
					@Pc(278) int[][] local278 = local50[local271];
					local269 += local278[2][local76];
					local88 += local278[1][local76];
					local82 += local278[0][local76];
				}
				local254[local76] = local35 * local82 >> 16;
				local246[local76] = local88 * local35 >> 16;
				local250[local76] = local269 * local35 >> 16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2604 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt2610 = arg0.method3122();
		} else if (arg1 == 2) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}
}
