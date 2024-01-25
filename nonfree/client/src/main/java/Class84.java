import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class84 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public int anInt2617;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "[Lclient!ru;")
	public Class220[] aClass220Array1;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Lclient!ru;")
	public Class220 aClass220_1;

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!fv", name = "q", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
	public final int anInt2622;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "([BI)V")
	public Class84(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2622 = Static86.method1647(arg0, arg0.length);
		if (this.anInt2622 != arg1) {
			throw new RuntimeException();
		}
		this.method1981(arg0);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([BB)V")
	private void method1981(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7(Static153.method2480(arg0));
		@Pc(16) int local16 = local12.method2582();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt2623 = local12.method2589();
		} else {
			this.anInt2623 = 0;
		}
		@Pc(47) int local47 = local12.method2582();
		this.anInt2617 = local12.method2588();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray153 = new int[this.anInt2617];
		for (@Pc(63) int local63 = 0; local63 < this.anInt2617; local63++) {
			this.anIntArray153[local63] = local54 += local12.method2588();
			if (local56 < this.anIntArray153[local63]) {
				local56 = this.anIntArray153[local63];
			}
		}
		this.anInt2621 = local56 + 1;
		this.anIntArray154 = new int[this.anInt2621];
		this.anIntArrayArray18 = new int[this.anInt2621][];
		this.anIntArray149 = new int[this.anInt2621];
		this.anIntArray151 = new int[this.anInt2621];
		this.anIntArray150 = new int[this.anInt2621];
		@Pc(148) int local148;
		@Pc(166) int local166;
		if (local47 != 0) {
			this.anIntArray152 = new int[this.anInt2621];
			for (local148 = 0; local148 < this.anInt2621; local148++) {
				this.anIntArray152[local148] = -1;
			}
			for (local166 = 0; local166 < this.anInt2617; local166++) {
				this.anIntArray152[this.anIntArray153[local166]] = local12.method2589();
			}
			this.aClass220_1 = new Class220(this.anIntArray152);
		}
		for (local148 = 0; local148 < this.anInt2617; local148++) {
			this.anIntArray151[this.anIntArray153[local148]] = local12.method2589();
		}
		for (local166 = 0; local166 < this.anInt2617; local166++) {
			this.anIntArray149[this.anIntArray153[local166]] = local12.method2589();
		}
		for (@Pc(230) int local230 = 0; local230 < this.anInt2617; local230++) {
			this.anIntArray154[this.anIntArray153[local230]] = local12.method2588();
		}
		@Pc(260) int local260;
		@Pc(265) int local265;
		@Pc(269) int local269;
		@Pc(277) int local277;
		@Pc(294) int local294;
		for (@Pc(253) int local253 = 0; local253 < this.anInt2617; local253++) {
			local260 = this.anIntArray153[local253];
			local265 = this.anIntArray154[local260];
			local54 = 0;
			local269 = -1;
			this.anIntArrayArray18[local260] = new int[local265];
			for (local277 = 0; local277 < local265; local277++) {
				local294 = this.anIntArrayArray18[local260][local277] = local54 += local12.method2588();
				if (local269 < local294) {
					local269 = local294;
				}
			}
			this.anIntArray150[local260] = local269 + 1;
			if (local269 + 1 == local265) {
				this.anIntArrayArray18[local260] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass220Array1 = new Class220[local56 + 1];
		this.anIntArrayArray19 = new int[local56 + 1][];
		for (local260 = 0; local260 < this.anInt2617; local260++) {
			local265 = this.anIntArray153[local260];
			local269 = this.anIntArray154[local265];
			this.anIntArrayArray19[local265] = new int[this.anIntArray150[local265]];
			for (local277 = 0; local277 < this.anIntArray150[local265]; local277++) {
				this.anIntArrayArray19[local265][local277] = -1;
			}
			for (local294 = 0; local294 < local269; local294++) {
				@Pc(400) int local400;
				if (this.anIntArrayArray18[local265] == null) {
					local400 = local294;
				} else {
					local400 = this.anIntArrayArray18[local265][local294];
				}
				this.anIntArrayArray19[local265][local400] = local12.method2589();
			}
			this.aClass220Array1[local265] = new Class220(this.anIntArrayArray19[local265]);
		}
	}
}
