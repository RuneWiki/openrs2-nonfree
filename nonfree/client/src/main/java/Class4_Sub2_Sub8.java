import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class4_Sub2_Sub8 extends Class4_Sub2 {

	@OriginalMember(owner = "client!di", name = "I", descriptor = "I")
	private int anInt1775 = 1;

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
	private int anInt1782 = 1;

	static {
		new Class242("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(28) int local28 = this.anInt1782 + this.anInt1782 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt1775 + this.anInt1775 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt1782; local54 <= this.anInt1782 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method5847(0, local54 & Static323.anInt5763);
				@Pc(67) int[] local67 = new int[Static350.anInt6330];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt1775; local73 <= this.anInt1775; local73++) {
					local69 += local64[Static144.anInt2707 & local73];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static350.anInt6330) {
					local67[local90] = local45 * local69 >> 16;
					local69 -= local64[Static144.anInt2707 & local90 - this.anInt1775];
					local90++;
					local69 += local64[Static144.anInt2707 & this.anInt1775 + local90];
				}
				local48[this.anInt1782 + local54 - arg0] = local67;
			}
			for (@Pc(145) int local145 = 0; local145 < Static350.anInt6330; local145++) {
				@Pc(149) int local149 = 0;
				for (local69 = 0; local69 < local28; local69++) {
					local149 += local48[local69][local145];
				}
				local11[local145] = local149 * local32 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt1775 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt1782 = arg1.method4864();
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(28) int local28 = this.anInt1782 + this.anInt1782 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt1775 + this.anInt1775 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt1782; local54 <= arg0 + this.anInt1782; local54++) {
				@Pc(64) int[][] local64 = this.method5848(0, Static323.anInt5763 & local54);
				@Pc(68) int[][] local68 = new int[3][Static350.anInt6330];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt1775; local90 <= this.anInt1775; local90++) {
					@Pc(96) int local96 = Static144.anInt2707 & local90;
					local70 += local78[local96];
					local72 += local82[local96];
					local74 += local86[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (Static350.anInt6330 > local137) {
					local127[local137] = local45 * local70 >> 16;
					local131[local137] = local72 * local45 >> 16;
					local135[local137] = local74 * local45 >> 16;
					@Pc(171) int local171 = local137 - this.anInt1775 & Static144.anInt2707;
					local74 -= local86[local171];
					local72 -= local82[local171];
					local70 -= local78[local171];
					local137++;
					@Pc(197) int local197 = Static144.anInt2707 & this.anInt1775 + local137;
					local72 += local82[local197];
					local70 += local78[local197];
					local74 += local86[local197];
				}
				local48[this.anInt1782 + local54 - arg0] = local68;
			}
			@Pc(240) int[] local240 = local11[0];
			@Pc(244) int[] local244 = local11[1];
			@Pc(248) int[] local248 = local11[2];
			for (local72 = 0; local72 < Static350.anInt6330; local72++) {
				local74 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local28; local260++) {
					@Pc(266) int[][] local266 = local48[local260];
					local74 += local266[0][local72];
					local258 += local266[2][local72];
					local256 += local266[1][local72];
				}
				local240[local72] = local32 * local74 >> 16;
				local244[local72] = local32 * local256 >> 16;
				local248[local72] = local32 * local258 >> 16;
			}
		}
		return local11;
	}
}
