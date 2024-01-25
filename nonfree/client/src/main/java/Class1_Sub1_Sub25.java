import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	private int anInt6285 = 1;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	private int anInt6289 = 1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(23) int local23 = this.anInt6285 + this.anInt6285 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt6289 + this.anInt6289 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt6285; local48 <= this.anInt6285 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method7836(Static98.anInt1743 & local48, 0);
				@Pc(61) int[] local61 = new int[Static501.anInt8748];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt6289; local67 <= this.anInt6289; local67++) {
					local63 += local58[local67 & Static326.anInt4973];
				}
				@Pc(84) int local84 = 0;
				while (local84 < Static501.anInt8748) {
					local61[local84] = local39 * local63 >> 16;
					local63 -= local58[Static326.anInt4973 & local84 - this.anInt6289];
					local84++;
					local63 += local58[local84 + this.anInt6289 & Static326.anInt4973];
				}
				local42[local48 + this.anInt6285 - arg0] = local61;
			}
			for (@Pc(140) int local140 = 0; local140 < Static501.anInt8748; local140++) {
				@Pc(144) int local144 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local144 += local42[local63][local140];
				}
				local11[local140] = local27 * local144 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6289 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt6285 = arg1.method7974();
		} else if (arg0 == 2) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(28) int local28 = this.anInt6285 + this.anInt6285 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt6289 + this.anInt6289 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(53) int local53 = arg0 - this.anInt6285; local53 <= arg0 + this.anInt6285; local53++) {
				@Pc(65) int[][] local65 = this.method7833(0, local53 & Static98.anInt1743);
				@Pc(69) int[][] local69 = new int[3][Static501.anInt8748];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt6289; local91 <= this.anInt6289; local91++) {
					@Pc(97) int local97 = local91 & Static326.anInt4973;
					local75 += local87[local97];
					local71 += local79[local97];
					local73 += local83[local97];
				}
				@Pc(128) int[] local128 = local69[0];
				@Pc(132) int[] local132 = local69[1];
				@Pc(136) int[] local136 = local69[2];
				@Pc(138) int local138 = 0;
				while (local138 < Static501.anInt8748) {
					local128[local138] = local71 * local44 >> 16;
					local132[local138] = local44 * local73 >> 16;
					local136[local138] = local44 * local75 >> 16;
					@Pc(172) int local172 = Static326.anInt4973 & local138 - this.anInt6289;
					local71 -= local79[local172];
					local75 -= local87[local172];
					local138++;
					local73 -= local83[local172];
					@Pc(198) int local198 = Static326.anInt4973 & this.anInt6289 + local138;
					local75 += local87[local198];
					local73 += local83[local198];
					local71 += local79[local198];
				}
				local47[this.anInt6285 + local53 - arg0] = local69;
			}
			@Pc(249) int[] local249 = local11[0];
			@Pc(253) int[] local253 = local11[1];
			@Pc(257) int[] local257 = local11[2];
			for (local73 = 0; local73 < Static501.anInt8748; local73++) {
				local75 = 0;
				@Pc(265) int local265 = 0;
				@Pc(267) int local267 = 0;
				for (@Pc(269) int local269 = 0; local269 < local28; local269++) {
					@Pc(275) int[][] local275 = local47[local269];
					local267 += local275[2][local73];
					local75 += local275[0][local73];
					local265 += local275[1][local73];
				}
				local249[local73] = local32 * local75 >> 16;
				local253[local73] = local32 * local265 >> 16;
				local257[local73] = local32 * local267 >> 16;
			}
		}
		return local11;
	}
}
