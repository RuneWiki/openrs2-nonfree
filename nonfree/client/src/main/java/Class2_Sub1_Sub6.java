import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!de", name = "M", descriptor = "I")
	private int anInt905 = 1;

	@OriginalMember(owner = "client!de", name = "W", descriptor = "I")
	private int anInt911 = 1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt911 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt905 = arg0.method260();
		} else if (arg1 == 2) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(28) int local28 = this.anInt905 + this.anInt905 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(35) int[][][] local35 = new int[local28][][];
			@Pc(44) int local44 = this.anInt911 + this.anInt911 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(70) int local70;
			@Pc(84) int local84;
			for (@Pc(54) int local54 = arg0 - this.anInt905; local54 <= this.anInt905 + arg0; local54++) {
				@Pc(66) int[][] local66 = this.method3259(local54 & Static207.anInt4078, 0);
				@Pc(68) int local68 = 0;
				local70 = 0;
				@Pc(74) int[][] local74 = new int[3][Static135.anInt2897];
				@Pc(78) int[] local78 = local66[0];
				@Pc(82) int[] local82 = local66[1];
				local84 = 0;
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt911; local92 <= this.anInt911; local92++) {
					@Pc(98) int local98 = local92 & Static201.anInt3995;
					local68 += local78[local98];
					local84 += local88[local98];
					local70 += local82[local98];
				}
				@Pc(129) int[] local129 = local74[1];
				@Pc(133) int[] local133 = local74[2];
				@Pc(137) int[] local137 = local74[0];
				@Pc(139) int local139 = 0;
				while (local139 < Static135.anInt2897) {
					local137[local139] = local48 * local68 >> 16;
					local129[local139] = local70 * local48 >> 16;
					local133[local139] = local48 * local84 >> 16;
					@Pc(173) int local173 = Static201.anInt3995 & local139 - this.anInt911;
					local68 -= local78[local173];
					local84 -= local88[local173];
					local139++;
					local70 -= local82[local173];
					@Pc(200) int local200 = Static201.anInt3995 & local139 + this.anInt911;
					local84 += local88[local200];
					local70 += local82[local200];
					local68 += local78[local200];
				}
				local35[local54 + this.anInt905 - arg0] = local74;
			}
			@Pc(243) int[] local243 = local16[0];
			@Pc(247) int[] local247 = local16[1];
			@Pc(251) int[] local251 = local16[2];
			for (local70 = 0; local70 < Static135.anInt2897; local70++) {
				@Pc(257) int local257 = 0;
				local84 = 0;
				@Pc(261) int local261 = 0;
				for (@Pc(263) int local263 = 0; local263 < local28; local263++) {
					@Pc(269) int[][] local269 = local35[local263];
					local261 += local269[2][local70];
					local84 += local269[0][local70];
					local257 += local269[1][local70];
				}
				local243[local70] = local32 * local84 >> 16;
				local247[local70] = local257 * local32 >> 16;
				local251[local70] = local261 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(29) int local29 = this.anInt911 + this.anInt911 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt905 + this.anInt905 + 1;
			@Pc(44) int[][] local44 = new int[local41][];
			@Pc(65) int local65;
			for (@Pc(50) int local50 = arg0 - this.anInt905; local50 <= arg0 + this.anInt905; local50++) {
				@Pc(60) int[] local60 = this.method3265(Static207.anInt4078 & local50, 0);
				@Pc(63) int[] local63 = new int[Static135.anInt2897];
				local65 = 0;
				for (@Pc(69) int local69 = -this.anInt911; local69 <= this.anInt911; local69++) {
					local65 += local60[local69 & Static201.anInt3995];
				}
				@Pc(90) int local90 = 0;
				while (Static135.anInt2897 > local90) {
					local63[local90] = local65 * local33 >> 16;
					local65 -= local60[local90 - this.anInt911 & Static201.anInt3995];
					local90++;
					local65 += local60[this.anInt911 + local90 & Static201.anInt3995];
				}
				local44[local50 + this.anInt905 - arg0] = local63;
			}
			@Pc(149) int local149 = 65536 / local41;
			for (@Pc(151) int local151 = 0; local151 < Static135.anInt2897; local151++) {
				@Pc(155) int local155 = 0;
				for (local65 = 0; local65 < local41; local65++) {
					local155 += local44[local65][local151];
				}
				local16[local151] = local149 * local155 >> 16;
			}
		}
		return local16;
	}
}
