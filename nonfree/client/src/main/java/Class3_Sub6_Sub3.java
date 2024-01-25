import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class3_Sub6_Sub3 extends Class3_Sub6 {

	@OriginalMember(owner = "client!bw", name = "N", descriptor = "I")
	private int anInt1381 = 1;

	@OriginalMember(owner = "client!bw", name = "S", descriptor = "I")
	private int anInt1386 = 1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(29) int local29 = this.anInt1381 + this.anInt1381 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt1386 + this.anInt1386 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt1381; local54 <= this.anInt1381 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method8001(0, Static527.anInt10285 & local54);
				@Pc(67) int[] local67 = new int[Static481.anInt8358];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt1386; local73 <= this.anInt1386; local73++) {
					local69 += local64[local73 & Static325.anInt5932];
				}
				@Pc(94) int local94 = 0;
				while (Static481.anInt8358 > local94) {
					local67[local94] = local45 * local69 >> 16;
					local69 -= local64[local94 - this.anInt1386 & Static325.anInt5932];
					local94++;
					local69 += local64[Static325.anInt5932 & this.anInt1386 + local94];
				}
				local48[local54 + this.anInt1381 - arg0] = local67;
			}
			for (@Pc(154) int local154 = 0; local154 < Static481.anInt8358; local154++) {
				@Pc(158) int local158 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local158 += local48[local69][local154];
				}
				local11[local154] = local158 * local33 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(31) int local31 = this.anInt1381 + this.anInt1381 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt1386 + this.anInt1386 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt1381; local56 <= this.anInt1381 + arg0; local56++) {
				@Pc(66) int[][] local66 = this.method8005(0, local56 & Static527.anInt10285);
				@Pc(70) int[][] local70 = new int[3][Static481.anInt8358];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt1386; local92 <= this.anInt1386; local92++) {
					@Pc(98) int local98 = local92 & Static325.anInt5932;
					local76 += local88[local98];
					local74 += local84[local98];
					local72 += local80[local98];
				}
				@Pc(129) int[] local129 = local70[0];
				@Pc(133) int[] local133 = local70[1];
				@Pc(137) int[] local137 = local70[2];
				@Pc(139) int local139 = 0;
				while (local139 < Static481.anInt8358) {
					local129[local139] = local72 * local47 >> 16;
					local133[local139] = local47 * local74 >> 16;
					local137[local139] = local47 * local76 >> 16;
					@Pc(172) int local172 = local139 - this.anInt1386 & Static325.anInt5932;
					local72 -= local80[local172];
					local76 -= local88[local172];
					local74 -= local84[local172];
					local139++;
					@Pc(198) int local198 = Static325.anInt5932 & this.anInt1386 + local139;
					local74 += local84[local198];
					local72 += local80[local198];
					local76 += local88[local198];
				}
				local50[local56 + this.anInt1381 - arg0] = local70;
			}
			@Pc(240) int[] local240 = local11[0];
			@Pc(244) int[] local244 = local11[1];
			@Pc(248) int[] local248 = local11[2];
			for (local74 = 0; local74 < Static481.anInt8358; local74++) {
				local76 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local31; local260++) {
					@Pc(266) int[][] local266 = local50[local260];
					local256 += local266[1][local74];
					local76 += local266[0][local74];
					local258 += local266[2][local74];
				}
				local240[local74] = local35 * local76 >> 16;
				local244[local74] = local35 * local256 >> 16;
				local248[local74] = local35 * local258 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1386 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt1381 = arg0.method6814();
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}
}
