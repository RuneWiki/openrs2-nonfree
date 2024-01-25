import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class6_Sub3_Sub9 extends Class6_Sub3 {

	@OriginalMember(owner = "client!gfa", name = "K", descriptor = "I")
	private int anInt2831 = 1;

	@OriginalMember(owner = "client!gfa", name = "N", descriptor = "I")
	private int anInt2833 = 1;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2831 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt2833 = arg1.method6041();
		} else if (arg0 == 2) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(32) int local32 = this.anInt2833 + this.anInt2833 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt2831 + this.anInt2831 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local32][];
			@Pc(72) int local72;
			for (@Pc(57) int local57 = arg0 - this.anInt2833; local57 <= this.anInt2833 + arg0; local57++) {
				@Pc(67) int[] local67 = this.method7824(0, local57 & Static252.anInt4135);
				@Pc(70) int[] local70 = new int[Static447.anInt8568];
				local72 = 0;
				for (@Pc(76) int local76 = -this.anInt2831; local76 <= this.anInt2831; local76++) {
					local72 += local67[local76 & Static392.anInt6966];
				}
				@Pc(97) int local97 = 0;
				while (Static447.anInt8568 > local97) {
					local70[local97] = local48 * local72 >> 16;
					local72 -= local67[local97 - this.anInt2831 & Static392.anInt6966];
					local97++;
					local72 += local67[Static392.anInt6966 & local97 + this.anInt2831];
				}
				local51[local57 + this.anInt2833 - arg0] = local70;
			}
			for (@Pc(159) int local159 = 0; local159 < Static447.anInt8568; local159++) {
				@Pc(163) int local163 = 0;
				for (local72 = 0; local72 < local32; local72++) {
					local163 += local51[local72][local159];
				}
				local11[local159] = local36 * local163 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(31) int local31 = this.anInt2833 + this.anInt2833 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt2831 + this.anInt2831 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt2833; local56 <= this.anInt2833 + arg0; local56++) {
				@Pc(66) int[][] local66 = this.method7823(0, Static252.anInt4135 & local56);
				@Pc(70) int[][] local70 = new int[3][Static447.anInt8568];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt2831; local92 <= this.anInt2831; local92++) {
					@Pc(98) int local98 = Static392.anInt6966 & local92;
					local74 += local84[local98];
					local72 += local80[local98];
					local76 += local88[local98];
				}
				@Pc(129) int[] local129 = local70[0];
				@Pc(133) int[] local133 = local70[1];
				@Pc(137) int[] local137 = local70[2];
				@Pc(139) int local139 = 0;
				while (local139 < Static447.anInt8568) {
					local129[local139] = local72 * local47 >> 16;
					local133[local139] = local74 * local47 >> 16;
					local137[local139] = local47 * local76 >> 16;
					@Pc(172) int local172 = local139 - this.anInt2831 & Static392.anInt6966;
					local139++;
					local76 -= local88[local172];
					local72 -= local80[local172];
					local74 -= local84[local172];
					@Pc(199) int local199 = local139 + this.anInt2831 & Static392.anInt6966;
					local76 += local88[local199];
					local74 += local84[local199];
					local72 += local80[local199];
				}
				local50[this.anInt2833 + local56 - arg0] = local70;
			}
			@Pc(248) int[] local248 = local19[0];
			@Pc(252) int[] local252 = local19[1];
			@Pc(256) int[] local256 = local19[2];
			for (local74 = 0; local74 < Static447.anInt8568; local74++) {
				local76 = 0;
				@Pc(264) int local264 = 0;
				@Pc(266) int local266 = 0;
				for (@Pc(268) int local268 = 0; local268 < local31; local268++) {
					@Pc(274) int[][] local274 = local50[local268];
					local264 += local274[1][local74];
					local76 += local274[0][local74];
					local266 += local274[2][local74];
				}
				local248[local74] = local35 * local76 >> 16;
				local252[local74] = local35 * local264 >> 16;
				local256[local74] = local35 * local266 >> 16;
			}
		}
		return local19;
	}
}
