import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
	private int anInt2663 = 1;

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
	private int anInt2667 = 1;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2667 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt2663 = arg1.method4393();
		} else if (arg0 == 2) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(28) int local28 = this.anInt2663 + this.anInt2663 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt2667 + this.anInt2667 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt2663; local53 <= arg0 + this.anInt2663; local53++) {
				@Pc(63) int[][] local63 = this.method7880(Static561.anInt6003 & local53, 0);
				@Pc(67) int[][] local67 = new int[3][Static87.anInt1964];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt2667; local89 <= this.anInt2667; local89++) {
					@Pc(95) int local95 = Static451.anInt8721 & local89;
					local73 += local85[local95];
					local71 += local81[local95];
					local69 += local77[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (local132 < Static87.anInt1964) {
					local122[local132] = local69 * local44 >> 16;
					local126[local132] = local44 * local71 >> 16;
					local130[local132] = local73 * local44 >> 16;
					@Pc(165) int local165 = Static451.anInt8721 & local132 - this.anInt2667;
					local69 -= local77[local165];
					local132++;
					local71 -= local81[local165];
					local73 -= local85[local165];
					@Pc(191) int local191 = local132 + this.anInt2667 & Static451.anInt8721;
					local71 += local81[local191];
					local69 += local77[local191];
					local73 += local85[local191];
				}
				local47[local53 + this.anInt2663 - arg0] = local67;
			}
			@Pc(242) int[] local242 = local16[0];
			@Pc(246) int[] local246 = local16[1];
			@Pc(250) int[] local250 = local16[2];
			for (local71 = 0; local71 < Static87.anInt1964; local71++) {
				local73 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local28; local262++) {
					@Pc(268) int[][] local268 = local47[local262];
					local260 += local268[2][local71];
					local73 += local268[0][local71];
					local258 += local268[1][local71];
				}
				local242[local71] = local73 * local32 >> 16;
				local246[local71] = local32 * local258 >> 16;
				local250[local71] = local32 * local260 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(31) int local31 = this.anInt2663 + this.anInt2663 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt2667 + this.anInt2667 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt2663; local56 <= this.anInt2663 + arg0; local56++) {
				@Pc(66) int[] local66 = this.method7882(0, Static561.anInt6003 & local56);
				@Pc(69) int[] local69 = new int[Static87.anInt1964];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt2667; local75 <= this.anInt2667; local75++) {
					local71 += local66[Static451.anInt8721 & local75];
				}
				@Pc(92) int local92 = 0;
				while (local92 < Static87.anInt1964) {
					local69[local92] = local71 * local47 >> 16;
					local71 -= local66[local92 - this.anInt2667 & Static451.anInt8721];
					local92++;
					local71 += local66[local92 + this.anInt2667 & Static451.anInt8721];
				}
				local50[this.anInt2663 + local56 - arg0] = local69;
			}
			for (@Pc(152) int local152 = 0; local152 < Static87.anInt1964; local152++) {
				@Pc(156) int local156 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local156 += local50[local71][local152];
				}
				local19[local152] = local156 * local35 >> 16;
			}
		}
		return local19;
	}
}
