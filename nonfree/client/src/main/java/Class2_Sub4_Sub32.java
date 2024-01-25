import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class2_Sub4_Sub32 extends Class2_Sub4 {

	@OriginalMember(owner = "client!uba", name = "D", descriptor = "I")
	private int anInt8475 = 1;

	@OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
	private int anInt8476 = 1;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(28) int local28 = this.anInt8475 + this.anInt8475 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt8476 + this.anInt8476 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt8475; local53 <= arg0 + this.anInt8475; local53++) {
				@Pc(63) int[] local63 = this.method7568(local53 & Static407.anInt6676, 0);
				@Pc(66) int[] local66 = new int[Static143.anInt7434];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt8476; local72 <= this.anInt8476; local72++) {
					local68 += local63[local72 & Static464.anInt7427];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static143.anInt7434) {
					local66[local93] = local68 * local44 >> 16;
					local68 -= local63[Static464.anInt7427 & local93 - this.anInt8476];
					local93++;
					local68 += local63[this.anInt8476 + local93 & Static464.anInt7427];
				}
				local47[local53 + this.anInt8475 - arg0] = local66;
			}
			for (@Pc(158) int local158 = 0; local158 < Static143.anInt7434; local158++) {
				@Pc(162) int local162 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local162 += local47[local68][local158];
				}
				local11[local158] = local32 * local162 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt8476 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt8475 = arg1.method4464();
		} else if (arg0 == 2) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(25) int local25 = this.anInt8475 + this.anInt8475 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(37) int local37 = this.anInt8476 + this.anInt8476 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][][] local44 = new int[local25][][];
			@Pc(68) int local68;
			@Pc(70) int local70;
			for (@Pc(50) int local50 = arg0 - this.anInt8475; local50 <= arg0 + this.anInt8475; local50++) {
				@Pc(60) int[][] local60 = this.method7567(Static407.anInt6676 & local50, 0);
				@Pc(64) int[][] local64 = new int[3][Static143.anInt7434];
				@Pc(66) int local66 = 0;
				local68 = 0;
				local70 = 0;
				@Pc(74) int[] local74 = local60[0];
				@Pc(78) int[] local78 = local60[1];
				@Pc(82) int[] local82 = local60[2];
				for (@Pc(86) int local86 = -this.anInt8476; local86 <= this.anInt8476; local86++) {
					@Pc(92) int local92 = local86 & Static464.anInt7427;
					local66 += local74[local92];
					local68 += local78[local92];
					local70 += local82[local92];
				}
				@Pc(119) int[] local119 = local64[0];
				@Pc(123) int[] local123 = local64[1];
				@Pc(127) int[] local127 = local64[2];
				@Pc(129) int local129 = 0;
				while (local129 < Static143.anInt7434) {
					local119[local129] = local66 * local41 >> 16;
					local123[local129] = local68 * local41 >> 16;
					local127[local129] = local41 * local70 >> 16;
					@Pc(162) int local162 = local129 - this.anInt8476 & Static464.anInt7427;
					local129++;
					local70 -= local82[local162];
					local68 -= local78[local162];
					local66 -= local74[local162];
					@Pc(188) int local188 = Static464.anInt7427 & local129 + this.anInt8476;
					local66 += local74[local188];
					local70 += local82[local188];
					local68 += local78[local188];
				}
				local44[local50 + this.anInt8475 - arg0] = local64;
			}
			@Pc(235) int[] local235 = local13[0];
			@Pc(239) int[] local239 = local13[1];
			@Pc(243) int[] local243 = local13[2];
			for (local68 = 0; local68 < Static143.anInt7434; local68++) {
				local70 = 0;
				@Pc(251) int local251 = 0;
				@Pc(253) int local253 = 0;
				for (@Pc(255) int local255 = 0; local255 < local25; local255++) {
					@Pc(261) int[][] local261 = local44[local255];
					local253 += local261[2][local68];
					local70 += local261[0][local68];
					local251 += local261[1][local68];
				}
				local235[local68] = local29 * local70 >> 16;
				local239[local68] = local29 * local251 >> 16;
				local243[local68] = local253 * local29 >> 16;
			}
		}
		return local13;
	}
}
