import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
	private int anInt3966 = 1;

	@OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
	private int anInt3965 = 1;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(28) int local28 = this.anInt3965 + this.anInt3965 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3966 + this.anInt3966 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(67) int local67;
			for (@Pc(52) int local52 = arg0 - this.anInt3965; local52 <= this.anInt3965 + arg0; local52++) {
				@Pc(62) int[] local62 = this.method7911(Static226.anInt4534 & local52, 0);
				@Pc(65) int[] local65 = new int[Static236.anInt4609];
				local67 = 0;
				for (@Pc(71) int local71 = -this.anInt3966; local71 <= this.anInt3966; local71++) {
					local67 += local62[Static36.anInt1319 & local71];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static236.anInt4609) {
					local65[local88] = local44 * local67 >> 16;
					local67 -= local62[Static36.anInt1319 & local88 - this.anInt3966];
					local88++;
					local67 += local62[this.anInt3966 + local88 & Static36.anInt1319];
				}
				local47[this.anInt3965 + local52 - arg0] = local65;
			}
			for (@Pc(147) int local147 = 0; local147 < Static236.anInt4609; local147++) {
				@Pc(151) int local151 = 0;
				for (local67 = 0; local67 < local28; local67++) {
					local151 += local47[local67][local147];
				}
				local16[local147] = local151 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3966 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt3965 = arg0.method3043();
		} else if (arg1 == 2) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(23) int local23 = this.anInt3965 + this.anInt3965 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt3966 + this.anInt3966 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(65) int local65;
			@Pc(67) int local67;
			for (@Pc(47) int local47 = arg0 - this.anInt3965; local47 <= arg0 + this.anInt3965; local47++) {
				@Pc(57) int[][] local57 = this.method7910(0, local47 & Static226.anInt4534);
				@Pc(61) int[][] local61 = new int[3][Static236.anInt4609];
				@Pc(63) int local63 = 0;
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local57[0];
				@Pc(75) int[] local75 = local57[1];
				@Pc(79) int[] local79 = local57[2];
				for (@Pc(83) int local83 = -this.anInt3966; local83 <= this.anInt3966; local83++) {
					@Pc(89) int local89 = local83 & Static36.anInt1319;
					local65 += local75[local89];
					local67 += local79[local89];
					local63 += local71[local89];
				}
				@Pc(116) int[] local116 = local61[0];
				@Pc(120) int[] local120 = local61[1];
				@Pc(124) int[] local124 = local61[2];
				@Pc(126) int local126 = 0;
				while (local126 < Static236.anInt4609) {
					local116[local126] = local63 * local39 >> 16;
					local120[local126] = local39 * local65 >> 16;
					local124[local126] = local67 * local39 >> 16;
					@Pc(159) int local159 = Static36.anInt1319 & local126 - this.anInt3966;
					local63 -= local71[local159];
					local65 -= local75[local159];
					local126++;
					local67 -= local79[local159];
					@Pc(185) int local185 = this.anInt3966 + local126 & Static36.anInt1319;
					local67 += local79[local185];
					local63 += local71[local185];
					local65 += local75[local185];
				}
				local42[this.anInt3965 + local47 - arg0] = local61;
			}
			@Pc(231) int[] local231 = local11[0];
			@Pc(235) int[] local235 = local11[1];
			@Pc(239) int[] local239 = local11[2];
			for (local65 = 0; local65 < Static236.anInt4609; local65++) {
				local67 = 0;
				@Pc(247) int local247 = 0;
				@Pc(249) int local249 = 0;
				for (@Pc(251) int local251 = 0; local251 < local23; local251++) {
					@Pc(257) int[][] local257 = local42[local251];
					local249 += local257[2][local65];
					local247 += local257[1][local65];
					local67 += local257[0][local65];
				}
				local231[local65] = local27 * local67 >> 16;
				local235[local65] = local247 * local27 >> 16;
				local239[local65] = local249 * local27 >> 16;
			}
		}
		return local11;
	}
}
