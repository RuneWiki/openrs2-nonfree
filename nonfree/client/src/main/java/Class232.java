import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class232 {

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
	public int[] anIntArray580;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!gb;")
	public Class87 aClass87_1;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "[I")
	public int[] anIntArray583;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "[Lclient!gb;")
	public Class87[] aClass87Array1;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public int anInt6725;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	public int anInt6729;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "[I")
	public int[] anIntArray584;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "[I")
	public int[] anIntArray585;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!to", name = "w", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public final int anInt6723;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "([BI)V")
	public Class232(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6723 = Static183.method2712(arg0.length, arg0);
		if (this.anInt6723 != arg1) {
			throw new RuntimeException();
		}
		this.method5229(arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([BB)V")
	private void method5229(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub30 local12 = new Class4_Sub30(Static444.method5711(arg0));
		@Pc(16) int local16 = local12.method4864();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6725 = 0;
		} else {
			this.anInt6725 = local12.method4872();
		}
		@Pc(43) int local43 = local12.method4864();
		this.anInt6721 = local12.method4877();
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = -1;
		this.anIntArray582 = new int[this.anInt6721];
		for (@Pc(64) int local64 = 0; local64 < this.anInt6721; local64++) {
			this.anIntArray582[local64] = local55 += local12.method4877();
			if (local57 < this.anIntArray582[local64]) {
				local57 = this.anIntArray582[local64];
			}
		}
		this.anInt6729 = local57 + 1;
		this.anIntArray583 = new int[this.anInt6729];
		this.anIntArray586 = new int[this.anInt6729];
		this.anIntArray580 = new int[this.anInt6729];
		this.anIntArrayArray59 = new int[this.anInt6729][];
		this.anIntArray584 = new int[this.anInt6729];
		@Pc(139) int local139;
		@Pc(157) int local157;
		if (local43 != 0) {
			this.anIntArray585 = new int[this.anInt6729];
			for (local139 = 0; local139 < this.anInt6729; local139++) {
				this.anIntArray585[local139] = -1;
			}
			for (local157 = 0; local157 < this.anInt6721; local157++) {
				this.anIntArray585[this.anIntArray582[local157]] = local12.method4872();
			}
			this.aClass87_1 = new Class87(this.anIntArray585);
		}
		for (local139 = 0; local139 < this.anInt6721; local139++) {
			this.anIntArray580[this.anIntArray582[local139]] = local12.method4872();
		}
		for (local157 = 0; local157 < this.anInt6721; local157++) {
			this.anIntArray586[this.anIntArray582[local157]] = local12.method4872();
		}
		for (@Pc(233) int local233 = 0; local233 < this.anInt6721; local233++) {
			this.anIntArray583[this.anIntArray582[local233]] = local12.method4877();
		}
		@Pc(265) int local265;
		@Pc(272) int local272;
		@Pc(274) int local274;
		@Pc(282) int local282;
		@Pc(299) int local299;
		for (@Pc(258) int local258 = 0; local258 < this.anInt6721; local258++) {
			local265 = this.anIntArray582[local258];
			local55 = 0;
			local272 = this.anIntArray583[local265];
			local274 = -1;
			this.anIntArrayArray59[local265] = new int[local272];
			for (local282 = 0; local282 < local272; local282++) {
				local299 = this.anIntArrayArray59[local265][local282] = local55 += local12.method4877();
				if (local299 > local274) {
					local274 = local299;
				}
			}
			this.anIntArray584[local265] = local274 + 1;
			if (local274 + 1 == local272) {
				this.anIntArrayArray59[local265] = null;
			}
		}
		if (local43 == 0) {
			return;
		}
		this.anIntArrayArray60 = new int[local57 + 1][];
		this.aClass87Array1 = new Class87[local57 + 1];
		for (local265 = 0; local265 < this.anInt6721; local265++) {
			local272 = this.anIntArray582[local265];
			local274 = this.anIntArray583[local272];
			this.anIntArrayArray60[local272] = new int[this.anIntArray584[local272]];
			for (local282 = 0; local282 < this.anIntArray584[local272]; local282++) {
				this.anIntArrayArray60[local272][local282] = -1;
			}
			for (local299 = 0; local299 < local274; local299++) {
				@Pc(407) int local407;
				if (this.anIntArrayArray59[local272] == null) {
					local407 = local299;
				} else {
					local407 = this.anIntArrayArray59[local272][local299];
				}
				this.anIntArrayArray60[local272][local407] = local12.method4872();
			}
			this.aClass87Array1[local272] = new Class87(this.anIntArrayArray60[local272]);
		}
	}
}
