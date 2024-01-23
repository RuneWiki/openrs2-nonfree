import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub4_Sub10 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
	private int anInt1929 = 1;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
	private int anInt1927 = 1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(26) int[] local26 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(39) int local39 = this.anInt1929 + this.anInt1929 + 1;
			@Pc(43) int local43 = 65536 / local39;
			@Pc(52) int local52 = this.anInt1927 + this.anInt1927 + 1;
			@Pc(55) int[][] local55 = new int[local52][];
			@Pc(59) int local59 = 65536 / local52;
			@Pc(65) int local65;
			for (local65 = arg0 - this.anInt1927; local65 <= arg0 + this.anInt1927; local65++) {
				@Pc(79) int[] local79 = this.method4750(local65 & Static171.anInt3359, 0);
				@Pc(81) int local81 = 0;
				@Pc(85) int local85;
				for (local85 = -this.anInt1929; local85 <= this.anInt1929; local85++) {
					local81 += local79[Static61.anInt1166 & local85];
				}
				@Pc(107) int[] local107 = new int[Static182.anInt3492];
				local85 = 0;
				while (Static182.anInt3492 > local85) {
					local107[local85] = local43 * local81 >> 16;
					local81 -= local79[local85 - this.anInt1929 & Static61.anInt1166];
					local85++;
					local81 += local79[Static61.anInt1166 & this.anInt1929 + local85];
				}
				local55[this.anInt1927 + local65 - arg0] = local107;
			}
			for (local65 = 0; local65 < Static182.anInt3492; local65++) {
				@Pc(173) int local173 = 0;
				for (@Pc(175) int local175 = 0; local175 < local52; local175++) {
					local173 += local55[local175][local65];
				}
				local26[local65] = local59 * local173 >> 16;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1929 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt1927 = arg0.method1378();
		} else if (arg1 == 2) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(33) int local33 = this.anInt1927 + this.anInt1927 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(45) int local45 = this.anInt1929 + this.anInt1929 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][][] local52 = new int[local33][][];
			@Pc(84) int local84;
			@Pc(86) int local86;
			@Pc(82) int local82;
			for (@Pc(58) int local58 = arg0 - this.anInt1927; local58 <= this.anInt1927 + arg0; local58++) {
				@Pc(76) int[][] local76 = this.method4749(0, Static171.anInt3359 & local58);
				@Pc(80) int[][] local80 = new int[3][Static182.anInt3492];
				local82 = 0;
				local84 = 0;
				local86 = 0;
				@Pc(90) int[] local90 = local76[0];
				@Pc(94) int[] local94 = local76[1];
				@Pc(98) int[] local98 = local76[2];
				for (@Pc(102) int local102 = -this.anInt1929; local102 <= this.anInt1929; local102++) {
					@Pc(114) int local114 = Static61.anInt1166 & local102;
					local86 += local94[local114];
					local82 += local98[local114];
					local84 += local90[local114];
				}
				@Pc(139) int[] local139 = local80[0];
				@Pc(143) int[] local143 = local80[1];
				@Pc(147) int[] local147 = local80[2];
				@Pc(149) int local149 = 0;
				while (local149 < Static182.anInt3492) {
					local139[local149] = local49 * local84 >> 16;
					local143[local149] = local86 * local49 >> 16;
					local147[local149] = local49 * local82 >> 16;
					@Pc(184) int local184 = Static61.anInt1166 & local149 - this.anInt1929;
					local149++;
					local86 -= local94[local184];
					local84 -= local90[local184];
					local82 -= local98[local184];
					@Pc(211) int local211 = local149 + this.anInt1929 & Static61.anInt1166;
					local84 += local90[local211];
					local86 += local94[local211];
					local82 += local98[local211];
				}
				local52[local58 + this.anInt1927 - arg0] = local80;
			}
			@Pc(247) int[] local247 = local20[0];
			@Pc(251) int[] local251 = local20[2];
			@Pc(255) int[] local255 = local20[1];
			for (local84 = 0; local84 < Static182.anInt3492; local84++) {
				local86 = 0;
				local82 = 0;
				@Pc(266) int local266 = 0;
				for (@Pc(268) int local268 = 0; local268 < local33; local268++) {
					@Pc(275) int[][] local275 = local52[local268];
					local82 += local275[1][local84];
					local266 += local275[2][local84];
					local86 += local275[0][local84];
				}
				local247[local84] = local37 * local86 >> 16;
				local255[local84] = local37 * local82 >> 16;
				local251[local84] = local266 * local37 >> 16;
			}
		}
		return local20;
	}
}
