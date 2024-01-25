import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class4_Sub2_Sub9 extends Class4_Sub2 {

	@OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
	private int anInt1761 = 1;

	@OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
	private int anInt1759 = 1;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(23) int local23 = this.anInt1759 + this.anInt1759 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt1761 + this.anInt1761 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt1759; local48 <= arg0 + this.anInt1759; local48++) {
				@Pc(58) int[] local58 = this.method8768(0, local48 & Static489.anInt7677);
				@Pc(61) int[] local61 = new int[Static269.anInt4330];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt1761; local67 <= this.anInt1761; local67++) {
					local63 += local58[Static215.anInt3481 & local67];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static269.anInt4330) {
					local61[local88] = local63 * local39 >> 16;
					local63 -= local58[local88 - this.anInt1761 & Static215.anInt3481];
					local88++;
					local63 += local58[Static215.anInt3481 & this.anInt1761 + local88];
				}
				local42[this.anInt1759 + local48 - arg0] = local61;
			}
			for (@Pc(147) int local147 = 0; local147 < Static269.anInt4330; local147++) {
				@Pc(151) int local151 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local151 += local42[local63][local147];
				}
				local11[local147] = local27 * local151 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(28) int local28 = this.anInt1759 + this.anInt1759 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt1761 + this.anInt1761 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt1759; local54 <= this.anInt1759 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method8772(local54 & Static489.anInt7677, 0);
				@Pc(68) int[][] local68 = new int[3][Static269.anInt4330];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt1761; local90 <= this.anInt1761; local90++) {
					@Pc(96) int local96 = Static215.anInt3481 & local90;
					local70 += local78[local96];
					local74 += local86[local96];
					local72 += local82[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (local137 < Static269.anInt4330) {
					local127[local137] = local70 * local45 >> 16;
					local131[local137] = local45 * local72 >> 16;
					local135[local137] = local74 * local45 >> 16;
					@Pc(170) int local170 = Static215.anInt3481 & local137 - this.anInt1761;
					local70 -= local78[local170];
					local137++;
					local72 -= local82[local170];
					local74 -= local86[local170];
					@Pc(196) int local196 = Static215.anInt3481 & local137 + this.anInt1761;
					local70 += local78[local196];
					local72 += local82[local196];
					local74 += local86[local196];
				}
				local48[local54 + this.anInt1759 - arg0] = local68;
			}
			@Pc(246) int[] local246 = local16[0];
			@Pc(250) int[] local250 = local16[1];
			@Pc(254) int[] local254 = local16[2];
			for (local72 = 0; local72 < Static269.anInt4330; local72++) {
				local74 = 0;
				@Pc(262) int local262 = 0;
				@Pc(264) int local264 = 0;
				for (@Pc(266) int local266 = 0; local266 < local28; local266++) {
					@Pc(272) int[][] local272 = local48[local266];
					local262 += local272[1][local72];
					local74 += local272[0][local72];
					local264 += local272[2][local72];
				}
				local246[local72] = local74 * local32 >> 16;
				local250[local72] = local32 * local262 >> 16;
				local254[local72] = local32 * local264 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1761 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt1759 = arg1.method8865();
		} else if (arg0 == 2) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}
}
