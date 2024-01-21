import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class5_Sub1_Sub17 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
	private int anInt1805 = 1;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
	private int anInt1802 = 1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(31) int local31 = this.anInt1805 + this.anInt1805 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt1802 + this.anInt1802 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(68) int local68;
			@Pc(88) int local88;
			for (@Pc(56) int local56 = arg0 - this.anInt1805; local56 <= arg0 + this.anInt1805; local56++) {
				@Pc(66) int[][] local66 = this.method3191(0, local56 & Static3.anInt74);
				local68 = 0;
				@Pc(72) int[][] local72 = new int[3][Static174.anInt3489];
				@Pc(76) int[] local76 = local66[0];
				@Pc(80) int[] local80 = local66[2];
				@Pc(82) int local82 = 0;
				@Pc(86) int[] local86 = local66[1];
				local88 = 0;
				for (@Pc(92) int local92 = -this.anInt1802; local92 <= this.anInt1802; local92++) {
					@Pc(98) int local98 = local92 & Static189.anInt3753;
					local82 += local76[local98];
					local68 += local86[local98];
					local88 += local80[local98];
				}
				@Pc(125) int[] local125 = local72[0];
				@Pc(129) int[] local129 = local72[1];
				@Pc(133) int[] local133 = local72[2];
				@Pc(135) int local135 = 0;
				while (Static174.anInt3489 > local135) {
					local125[local135] = local47 * local82 >> 16;
					local129[local135] = local68 * local47 >> 16;
					local133[local135] = local88 * local47 >> 16;
					@Pc(169) int local169 = Static189.anInt3753 & local135 - this.anInt1802;
					local88 -= local80[local169];
					local82 -= local76[local169];
					local135++;
					local68 -= local86[local169];
					@Pc(196) int local196 = local135 + this.anInt1802 & Static189.anInt3753;
					local68 += local86[local196];
					local82 += local76[local196];
					local88 += local80[local196];
				}
				local50[local56 + this.anInt1805 - arg0] = local72;
			}
			@Pc(242) int[] local242 = local18[0];
			@Pc(246) int[] local246 = local18[1];
			@Pc(250) int[] local250 = local18[2];
			for (local68 = 0; local68 < Static174.anInt3489; local68++) {
				local88 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local31; local262++) {
					@Pc(268) int[][] local268 = local50[local262];
					local258 += local268[1][local68];
					local88 += local268[0][local68];
					local260 += local268[2][local68];
				}
				local242[local68] = local35 * local88 >> 16;
				local246[local68] = local258 * local35 >> 16;
				local250[local68] = local35 * local260 >> 16;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1802 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt1805 = arg0.method3062();
		} else if (arg1 == 2) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(23) int local23 = this.anInt1805 + this.anInt1805 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(30) int[][] local30 = new int[local23][];
			@Pc(39) int local39 = this.anInt1802 + this.anInt1802 + 1;
			@Pc(43) int local43 = 65536 / local39;
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt1805; local48 <= arg0 + this.anInt1805; local48++) {
				@Pc(58) int[] local58 = this.method3196(Static3.anInt74 & local48, 0);
				@Pc(61) int[] local61 = new int[Static174.anInt3489];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt1802; local67 <= this.anInt1802; local67++) {
					local63 += local58[local67 & Static189.anInt3753];
				}
				@Pc(88) int local88 = 0;
				while (Static174.anInt3489 > local88) {
					local61[local88] = local43 * local63 >> 16;
					local63 -= local58[Static189.anInt3753 & local88 - this.anInt1802];
					local88++;
					local63 += local58[Static189.anInt3753 & this.anInt1802 + local88];
				}
				local30[this.anInt1805 + local48 - arg0] = local61;
			}
			for (@Pc(145) int local145 = 0; local145 < Static174.anInt3489; local145++) {
				@Pc(149) int local149 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local149 += local30[local63][local145];
				}
				local11[local145] = local149 * local27 >> 16;
			}
		}
		return local11;
	}
}
