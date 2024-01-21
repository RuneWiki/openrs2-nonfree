import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!ag", name = "qb", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt225 = this.anInt228 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt226 = arg1.method1461();
		} else if (arg0 == 2) {
			this.anInt244 = arg1.method1456();
		} else if (arg0 == 3) {
			this.anInt238 = arg1.method1461();
		} else if (arg0 == 4) {
			this.anInt235 = arg1.method1461();
		} else if (arg0 == 5) {
			this.anInt225 = arg1.method1461();
		} else if (arg0 == 6) {
			this.anInt228 = arg1.method1461();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)[I")
	private int[] method155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int[] local4 = new int[arg0];
		for (@Pc(6) int local6 = 0; local6 < arg0; local6++) {
			local4[local6] = Integer.MAX_VALUE;
		}
		arg1 += this.anInt243;
		arg2 += this.anInt231;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(36) int local36 = -1;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		@Pc(42) int local42 = -1;
		@Pc(49) int local49 = this.anInt225 * arg1 >> 12;
		@Pc(56) int local56 = this.anInt228 * arg2 >> 12;
		@Pc(69) int local69 = this.anInt225 > 2 ? 2 : this.anInt225 - 1;
		@Pc(71) int local71 = Integer.MAX_VALUE;
		@Pc(84) int local84 = this.anInt228 > 2 ? 2 : this.anInt228 - 1;
		@Pc(86) int local86 = Integer.MAX_VALUE;
		@Pc(100) int local100;
		@Pc(106) int local106;
		@Pc(126) int local126;
		@Pc(154) int local154;
		@Pc(161) int local161;
		for (@Pc(89) int local89 = -local69; local89 <= local69; local89++) {
			for (local100 = -local84; local100 <= local84; local100++) {
				local106 = local89 + local49;
				if (local106 < 0) {
					local106 += this.anInt225;
				}
				if (local106 >= this.anInt225) {
					local106 -= this.anInt225;
				}
				local126 = local56 + local100;
				if (local126 < 0) {
					local126 += this.anInt228;
				}
				if (this.anInt228 <= local126) {
					local126 -= this.anInt228;
				}
				local154 = local126 * this.anInt225 + local106;
				local161 = this.anIntArrayArray1[local154][0];
				@Pc(168) int local168 = this.anIntArrayArray1[local154][1];
				@Pc(173) int local173 = arg1 - local161;
				@Pc(178) int local178 = arg2 - local168;
				if (local173 < 0) {
					local173 = -local173;
				}
				if (local173 > 2048) {
					local173 = 4096 - local173;
				}
				if (local178 < 0) {
					local178 = -local178;
				}
				if (local178 > 2048) {
					local178 = 4096 - local178;
				}
				@Pc(219) int local219 = local173 * local173 + local178 * local178 >> 12;
				if (local86 > local219) {
					if (local36 == -1) {
						local71 = local219;
						local36 = local154;
					} else {
						local36 = local42;
						local71 = local86;
					}
					local42 = local154;
					local86 = local219;
				} else if (local42 == local36 && local154 != local36 || local71 > local219 && local42 != local154) {
					local36 = local154;
					local71 = local219;
				}
			}
		}
		local126 = arg1 - this.anIntArrayArray1[local36][0];
		local154 = arg2 - this.anIntArrayArray1[local36][1];
		local106 = arg2 - this.anIntArrayArray1[local42][1];
		if (local154 < 0) {
			local154 = -local154;
		}
		if (local106 < 0) {
			local106 = -local106;
		}
		local100 = arg1 - this.anIntArrayArray1[local42][0];
		if (local106 > 2048) {
			local106 = 4096 - local106;
		}
		if (local154 > 2048) {
			local154 = 4096 - local154;
		}
		if (local126 < 0) {
			local126 = -local126;
		}
		if (local100 < 0) {
			local100 = -local100;
		}
		if (local126 > 2048) {
			local126 = 4096 - local126;
		}
		if (local100 > 2048) {
			local100 = 4096 - local100;
		}
		local161 = this.anInt235;
		if (local161 == 1) {
			local86 = (int) Math.sqrt((double) (local100 * local100 + local106 * local106));
			local71 = (int) Math.sqrt((double) (local126 * local126 + local154 * local154));
		} else if (local161 == 2) {
			local86 = Math.max(local100, local106);
			local71 = Math.max(local126, local154);
		} else {
			local71 = local154 * local154 + local126 * local126;
			local86 = local106 * local106 + local100 * local100;
		}
		local4[0] = this.anInt240 * local86;
		if (arg0 > 1) {
			local4[1] = this.anInt240 * local71;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		this.method161();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(28) int local28 = Static86.anIntArray218[arg0];
			@Pc(31) int local31 = this.anInt238;
			@Pc(49) int local49;
			if (local31 == 2) {
				for (local31 = 0; local31 < Static149.anInt3233; local31++) {
					local49 = Static154.anIntArray354[local31];
					@Pc(56) int[] local56 = this.method155(2, local49, local28);
					local16[local31] = local56[1] - local56[0];
				}
			} else if (local31 == 1) {
				for (local31 = 0; local31 < Static149.anInt3233; local31++) {
					local49 = Static154.anIntArray354[local31];
					local16[local31] = this.method155(2, local49, local28)[1];
				}
			} else {
				for (local31 = 0; local31 < Static149.anInt3233; local31++) {
					local49 = Static154.anIntArray354[local31];
					local16[local31] = this.method155(1, local49, local28)[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
	private void method161() {
		@Pc(8) Random local8 = new Random((long) this.anInt226);
		@Pc(13) int local13 = 4096 / this.anInt225;
		this.anInt243 = local13 >> 1;
		this.anInt229 = this.anInt228 * this.anInt225;
		this.anIntArrayArray1 = new int[this.anInt229][2];
		@Pc(43) int local43 = this.anInt243 * this.anInt244 >> 12;
		@Pc(48) int local48 = 4096 / this.anInt228;
		this.anInt231 = local48 >> 1;
		@Pc(61) int local61 = this.anInt244 * this.anInt231 >> 12;
		for (@Pc(73) int local73 = 0; local73 < this.anInt228; local73++) {
			@Pc(79) int local79 = local73 * local48;
			for (@Pc(81) int local81 = 0; local81 < this.anInt225; local81++) {
				@Pc(90) int local90 = local81 + this.anInt225 * local73;
				@Pc(101) int local101 = local43 * (Static137.method2174(local8, 8192) - 4096) >> 12;
				@Pc(112) int local112 = local61 * (Static137.method2174(local8, 8192) - 4096) >> 12;
				this.anIntArrayArray1[local90][0] = local13 * local81 + local101;
				this.anIntArrayArray1[local90][1] = local79 + local112;
			}
		}
		this.anInt240 = this.anInt228 < this.anInt225 ? this.anInt225 : this.anInt228;
	}
}
