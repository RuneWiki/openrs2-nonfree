import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class2_Sub3_Sub34 extends Class2_Sub3 {

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
	private int anInt3497;

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
	private int anInt3495;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(28) int local28 = this.anInt3497 + this.anInt3497 + 1;
			@Pc(31) int[][] local31 = new int[local28][];
			@Pc(39) int local39 = this.anInt3495 + this.anInt3495 + 1;
			@Pc(49) int local49;
			for (@Pc(45) int local45 = arg0 - this.anInt3497; local45 <= this.anInt3497 + arg0; local45++) {
				local49 = 0;
				@Pc(57) int[] local57 = this.method3011(Static134.anInt2915 & local45, 0);
				for (@Pc(61) int local61 = -this.anInt3495; local61 <= this.anInt3495; local61++) {
					local49 += local57[local61 & Static27.anInt588];
				}
				@Pc(83) int[] local83 = new int[Static53.anInt1184];
				@Pc(85) int local85 = 0;
				while (local85 < Static53.anInt1184) {
					local83[local85] = local49 / local39;
					local49 -= local57[local85 - this.anInt3495 & Static27.anInt588];
					local85++;
					local49 += local57[Static27.anInt588 & this.anInt3495 + local85];
				}
				local31[this.anInt3497 + local45 - arg0] = local83;
			}
			for (@Pc(138) int local138 = 0; local138 < Static53.anInt1184; local138++) {
				@Pc(142) int local142 = 0;
				for (local49 = 0; local49 < local28; local49++) {
					local142 += local31[local49][local138];
				}
				local11[local138] = local142 / local28;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(29) int local29 = this.anInt3497 + this.anInt3497 + 1;
			@Pc(32) int[][][] local32 = new int[local29][][];
			@Pc(40) int local40 = this.anInt3495 + this.anInt3495 + 1;
			@Pc(64) int local64;
			@Pc(66) int local66;
			for (@Pc(46) int local46 = arg0 - this.anInt3497; local46 <= this.anInt3497 + arg0; local46++) {
				@Pc(56) int[][] local56 = this.method3017(Static134.anInt2915 & local46, 0);
				@Pc(60) int[][] local60 = new int[3][Static53.anInt1184];
				@Pc(62) int local62 = 0;
				local64 = 0;
				local66 = 0;
				@Pc(70) int[] local70 = local56[0];
				@Pc(74) int[] local74 = local56[1];
				@Pc(78) int[] local78 = local56[2];
				for (@Pc(82) int local82 = -this.anInt3495; local82 <= this.anInt3495; local82++) {
					@Pc(88) int local88 = local82 & Static27.anInt588;
					local62 += local70[local88];
					local66 += local78[local88];
					local64 += local74[local88];
				}
				@Pc(119) int[] local119 = local60[0];
				@Pc(123) int[] local123 = local60[1];
				@Pc(127) int[] local127 = local60[2];
				@Pc(129) int local129 = 0;
				while (local129 < Static53.anInt1184) {
					local119[local129] = local62 / local40;
					local123[local129] = local64 / local40;
					local127[local129] = local66 / local40;
					@Pc(157) int local157 = local129 - this.anInt3495 & Static27.anInt588;
					local64 -= local74[local157];
					local62 -= local70[local157];
					local66 -= local78[local157];
					local129++;
					@Pc(183) int local183 = this.anInt3495 + local129 & Static27.anInt588;
					local66 += local78[local183];
					local62 += local70[local183];
					local64 += local74[local183];
				}
				local32[this.anInt3497 + local46 - arg0] = local60;
			}
			@Pc(224) int[] local224 = local17[0];
			@Pc(228) int[] local228 = local17[1];
			@Pc(232) int[] local232 = local17[2];
			for (local64 = 0; local64 < Static53.anInt1184; local64++) {
				local66 = 0;
				@Pc(240) int local240 = 0;
				@Pc(242) int local242 = 0;
				for (@Pc(244) int local244 = 0; local244 < local29; local244++) {
					@Pc(250) int[][] local250 = local32[local244];
					local66 += local250[0][local64];
					local240 += local250[1][local64];
					local242 += local250[2][local64];
				}
				local224[local64] = local66 / local29;
				local228[local64] = local240 / local29;
				local232[local64] = local242 / local29;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt3495 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt3497 = arg1.method2962();
		} else if (arg0 == 2) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}
}
