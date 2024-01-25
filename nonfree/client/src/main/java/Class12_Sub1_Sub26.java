import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class12_Sub1_Sub26 extends Class12_Sub1 {

	@OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
	private int anInt7704 = 1;

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
	private int anInt7709 = 1;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(29) int local29 = this.anInt7709 + this.anInt7709 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt7704 + this.anInt7704 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local29][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt7709; local54 <= this.anInt7709 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method7790(0, Static162.anInt3758 & local54);
				@Pc(68) int[][] local68 = new int[3][Static357.anInt6670];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt7704; local90 <= this.anInt7704; local90++) {
					@Pc(96) int local96 = Static149.anInt3278 & local90;
					local74 += local86[local96];
					local72 += local82[local96];
					local70 += local78[local96];
				}
				@Pc(123) int[] local123 = local68[0];
				@Pc(127) int[] local127 = local68[1];
				@Pc(131) int[] local131 = local68[2];
				@Pc(133) int local133 = 0;
				while (Static357.anInt6670 > local133) {
					local123[local133] = local70 * local45 >> 16;
					local127[local133] = local72 * local45 >> 16;
					local131[local133] = local74 * local45 >> 16;
					@Pc(166) int local166 = local133 - this.anInt7704 & Static149.anInt3278;
					local70 -= local78[local166];
					local72 -= local82[local166];
					local133++;
					local74 -= local86[local166];
					@Pc(193) int local193 = local133 + this.anInt7704 & Static149.anInt3278;
					local70 += local78[local193];
					local72 += local82[local193];
					local74 += local86[local193];
				}
				local48[this.anInt7709 + local54 - arg0] = local68;
			}
			@Pc(234) int[] local234 = local11[0];
			@Pc(238) int[] local238 = local11[1];
			@Pc(242) int[] local242 = local11[2];
			for (local72 = 0; local72 < Static357.anInt6670; local72++) {
				local74 = 0;
				@Pc(250) int local250 = 0;
				@Pc(252) int local252 = 0;
				for (@Pc(254) int local254 = 0; local254 < local29; local254++) {
					@Pc(260) int[][] local260 = local48[local254];
					local74 += local260[0][local72];
					local250 += local260[1][local72];
					local252 += local260[2][local72];
				}
				local234[local72] = local74 * local33 >> 16;
				local238[local72] = local250 * local33 >> 16;
				local242[local72] = local33 * local252 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(28) int local28 = this.anInt7709 + this.anInt7709 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt7704 + this.anInt7704 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt7709; local54 <= arg0 + this.anInt7709; local54++) {
				@Pc(64) int[] local64 = this.method7795(0, local54 & Static162.anInt3758);
				@Pc(67) int[] local67 = new int[Static357.anInt6670];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt7704; local73 <= this.anInt7704; local73++) {
					local69 += local64[Static149.anInt3278 & local73];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static357.anInt6670) {
					local67[local94] = local45 * local69 >> 16;
					local69 -= local64[local94 - this.anInt7704 & Static149.anInt3278];
					local94++;
					local69 += local64[this.anInt7704 + local94 & Static149.anInt3278];
				}
				local48[this.anInt7709 + local54 - arg0] = local67;
			}
			for (@Pc(154) int local154 = 0; local154 < Static357.anInt6670; local154++) {
				@Pc(158) int local158 = 0;
				for (local69 = 0; local69 < local28; local69++) {
					local158 += local48[local69][local154];
				}
				local11[local154] = local32 * local158 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7704 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt7709 = arg0.method5216();
		} else if (arg1 == 2) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}
}
