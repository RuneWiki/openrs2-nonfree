import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub5_Sub31 extends Class1_Sub5 {

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	private int anInt3299;

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
	private int anInt3301;

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
	private int anInt3298;

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
	private int anInt3292;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
	private int anInt3296;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
	private int anInt3294;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
	private int anInt3300;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
	private int anInt3309;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	private int anInt3305;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3298 = this.anInt3300 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt3296 = arg0.method336();
		} else if (arg1 == 2) {
			this.anInt3294 = arg0.method359();
		} else if (arg1 == 3) {
			this.anInt3305 = arg0.method336();
		} else if (arg1 == 4) {
			this.anInt3309 = arg0.method336();
		} else if (arg1 == 5) {
			this.anInt3298 = arg0.method336();
		} else if (arg1 == 6) {
			this.anInt3300 = arg0.method336();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		this.method2527();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(24) int local24 = Static34.anIntArray75[arg0];
			@Pc(27) int local27 = this.anInt3305;
			@Pc(45) int local45;
			if (local27 == 2) {
				for (local27 = 0; local27 < Static177.anInt4018; local27++) {
					local45 = Static116.anIntArray275[local27];
					@Pc(52) int[] local52 = this.method2529(local24, 2, local45);
					local11[local27] = local52[1] - local52[0];
				}
			} else if (local27 == 1) {
				for (local27 = 0; local27 < Static177.anInt4018; local27++) {
					local45 = Static116.anIntArray275[local27];
					local11[local27] = this.method2529(local24, 2, local45)[1];
				}
			} else {
				for (local27 = 0; local27 < Static177.anInt4018; local27++) {
					local45 = Static116.anIntArray275[local27];
					local11[local27] = this.method2529(local24, 1, local45)[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
	private void method2527() {
		@Pc(16) Random local16 = new Random((long) this.anInt3296);
		@Pc(21) int local21 = 4096 / this.anInt3298;
		@Pc(26) int local26 = 4096 / this.anInt3300;
		this.anInt3299 = local26 >> 1;
		this.anInt3292 = this.anInt3298 * this.anInt3300;
		this.anIntArrayArray26 = new int[this.anInt3292][2];
		this.anInt3301 = local21 >> 1;
		@Pc(57) int local57 = this.anInt3294 * this.anInt3299 >> 12;
		@Pc(65) int local65 = this.anInt3301 * this.anInt3294 >> 12;
		for (@Pc(67) int local67 = 0; local67 < this.anInt3300; local67++) {
			@Pc(73) int local73 = local26 * local67;
			for (@Pc(75) int local75 = 0; local75 < this.anInt3298; local75++) {
				@Pc(84) int local84 = local67 * this.anInt3298 + local75;
				@Pc(95) int local95 = local65 * (Static103.method1706(8192, local16) - 4096) >> 12;
				@Pc(106) int local106 = local57 * (Static103.method1706(8192, local16) - 4096) >> 12;
				this.anIntArrayArray26[local84][0] = local75 * local21 + local95;
				this.anIntArrayArray26[local84][1] = local106 + local73;
			}
		}
		this.anInt3303 = this.anInt3298 > this.anInt3300 ? this.anInt3298 : this.anInt3300;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)[I")
	private int[] method2529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int[] local8 = new int[arg1];
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg0 += this.anInt3299;
		arg2 += this.anInt3301;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		@Pc(44) int local44 = -1;
		@Pc(51) int local51 = arg2 * this.anInt3298 >> 12;
		@Pc(58) int local58 = this.anInt3300 * arg0 >> 12;
		@Pc(69) int local69 = this.anInt3298 <= 2 ? this.anInt3298 - 1 : 2;
		@Pc(71) int local71 = Integer.MAX_VALUE;
		@Pc(73) int local73 = Integer.MAX_VALUE;
		@Pc(75) int local75 = -1;
		@Pc(86) int local86 = this.anInt3300 > 2 ? 2 : this.anInt3300 - 1;
		@Pc(94) int local94;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(147) int local147;
		@Pc(161) int local161;
		for (@Pc(89) int local89 = -local69; local89 <= local69; local89++) {
			for (local94 = -local86; local94 <= local86; local94++) {
				local100 = local51 + local89;
				local104 = local58 + local94;
				if (local104 < 0) {
					local104 += this.anInt3300;
				}
				if (local104 >= this.anInt3300) {
					local104 -= this.anInt3300;
				}
				if (local100 < 0) {
					local100 += this.anInt3298;
				}
				if (local100 >= this.anInt3298) {
					local100 -= this.anInt3298;
				}
				local147 = this.anInt3298 * local104 + local100;
				@Pc(154) int local154 = this.anIntArrayArray26[local147][1];
				local161 = this.anIntArrayArray26[local147][0];
				@Pc(166) int local166 = arg0 - local154;
				@Pc(171) int local171 = arg2 - local161;
				if (local166 < 0) {
					local166 = -local166;
				}
				if (local166 > 2048) {
					local166 = 4096 - local166;
				}
				if (local171 < 0) {
					local171 = -local171;
				}
				if (local171 > 2048) {
					local171 = 4096 - local171;
				}
				@Pc(209) int local209 = local166 * local166 + local171 * local171 >> 12;
				if (local209 < local73) {
					if (local75 == -1) {
						local71 = local209;
						local75 = local147;
					} else {
						local75 = local44;
						local71 = local73;
					}
					local44 = local147;
					local73 = local209;
				} else if (local75 == local44 && local147 != local75 || local209 < local71 && local147 != local44) {
					local75 = local147;
					local71 = local209;
				}
			}
		}
		local94 = arg2 - this.anIntArrayArray26[local44][0];
		if (local94 < 0) {
			local94 = -local94;
		}
		local104 = arg2 - this.anIntArrayArray26[local75][0];
		if (local94 > 2048) {
			local94 = 4096 - local94;
		}
		if (local104 < 0) {
			local104 = -local104;
		}
		if (local104 > 2048) {
			local104 = 4096 - local104;
		}
		local147 = arg0 - this.anIntArrayArray26[local75][1];
		local100 = arg0 - this.anIntArrayArray26[local44][1];
		if (local147 < 0) {
			local147 = -local147;
		}
		if (local100 < 0) {
			local100 = -local100;
		}
		if (local147 > 2048) {
			local147 = 4096 - local147;
		}
		if (local100 > 2048) {
			local100 = 4096 - local100;
		}
		local161 = this.anInt3309;
		if (local161 == 1) {
			local73 = (int) Math.sqrt((double) (local94 * local94 + local100 * local100));
			local71 = (int) Math.sqrt((double) (local104 * local104 + local147 * local147));
		} else if (local161 == 2) {
			local73 = Math.max(local94, local100);
			local71 = Math.max(local104, local147);
		} else {
			local71 = local104 * local104 + local147 * local147;
			local73 = local100 * local100 + local94 * local94;
		}
		local8[0] = this.anInt3303 * local73;
		if (arg1 > 1) {
			local8[1] = this.anInt3303 * local71;
		}
		return local8;
	}
}
