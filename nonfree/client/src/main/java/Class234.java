import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class234 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "I")
	public int anInt6524;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "[I")
	public int[] anIntArray559;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
	public int[] anIntArray560;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "[I")
	public int[] anIntArray561;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "[I")
	public int[] anIntArray562;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "[Lclient!is;")
	public Class110[] aClass110Array1;

	@OriginalMember(owner = "client!up", name = "k", descriptor = "I")
	public int anInt6526;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "[I")
	public int[] anIntArray563;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "I")
	public int anInt6528;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "[I")
	public int[] anIntArray564;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Lclient!is;")
	public Class110 aClass110_1;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "I")
	public final int anInt6529;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "([BI)V")
	public Class234(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6529 = Static113.method5097(arg0.length, arg0);
		if (this.anInt6529 != arg1) {
			throw new RuntimeException();
		}
		this.method5629(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([BB)V")
	private void method5629(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub24 local12 = new Class2_Sub24(Static321.method5187(arg0));
		@Pc(16) int local16 = local12.method5732();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6526 = 0;
		} else {
			this.anInt6526 = local12.method5776();
		}
		@Pc(49) int local49 = local12.method5732();
		this.anInt6524 = local12.method5753();
		@Pc(56) int local56 = 0;
		this.anIntArray559 = new int[this.anInt6524];
		@Pc(63) int local63 = -1;
		for (@Pc(65) int local65 = 0; local65 < this.anInt6524; local65++) {
			this.anIntArray559[local65] = local56 += local12.method5753();
			if (local63 < this.anIntArray559[local65]) {
				local63 = this.anIntArray559[local65];
			}
		}
		this.anInt6528 = local63 + 1;
		this.anIntArray564 = new int[this.anInt6528];
		this.anIntArrayArray59 = new int[this.anInt6528][];
		this.anIntArray563 = new int[this.anInt6528];
		this.anIntArray561 = new int[this.anInt6528];
		this.anIntArray562 = new int[this.anInt6528];
		@Pc(140) int local140;
		@Pc(154) int local154;
		if (local49 != 0) {
			this.anIntArray560 = new int[this.anInt6528];
			for (local140 = 0; local140 < this.anInt6528; local140++) {
				this.anIntArray560[local140] = -1;
			}
			for (local154 = 0; local154 < this.anInt6524; local154++) {
				this.anIntArray560[this.anIntArray559[local154]] = local12.method5776();
			}
			this.aClass110_1 = new Class110(this.anIntArray560);
		}
		for (local140 = 0; local140 < this.anInt6524; local140++) {
			this.anIntArray562[this.anIntArray559[local140]] = local12.method5776();
		}
		for (local154 = 0; local154 < this.anInt6524; local154++) {
			this.anIntArray561[this.anIntArray559[local154]] = local12.method5776();
		}
		for (@Pc(222) int local222 = 0; local222 < this.anInt6524; local222++) {
			this.anIntArray564[this.anIntArray559[local222]] = local12.method5753();
		}
		@Pc(260) int local260;
		@Pc(265) int local265;
		@Pc(275) int local275;
		@Pc(277) int local277;
		@Pc(294) int local294;
		for (@Pc(253) int local253 = 0; local253 < this.anInt6524; local253++) {
			local260 = this.anIntArray559[local253];
			local265 = this.anIntArray564[local260];
			local56 = 0;
			this.anIntArrayArray59[local260] = new int[local265];
			local275 = -1;
			for (local277 = 0; local277 < local265; local277++) {
				local294 = this.anIntArrayArray59[local260][local277] = local56 += local12.method5753();
				if (local275 < local294) {
					local275 = local294;
				}
			}
			this.anIntArray563[local260] = local275 + 1;
			if (local275 + 1 == local265) {
				this.anIntArrayArray59[local260] = null;
			}
		}
		if (local49 == 0) {
			return;
		}
		this.aClass110Array1 = new Class110[local63 + 1];
		this.anIntArrayArray60 = new int[local63 + 1][];
		for (local260 = 0; local260 < this.anInt6524; local260++) {
			local265 = this.anIntArray559[local260];
			local275 = this.anIntArray564[local265];
			this.anIntArrayArray60[local265] = new int[this.anIntArray563[local265]];
			for (local277 = 0; local277 < this.anIntArray563[local265]; local277++) {
				this.anIntArrayArray60[local265][local277] = -1;
			}
			for (local294 = 0; local294 < local275; local294++) {
				@Pc(411) int local411;
				if (this.anIntArrayArray59[local265] == null) {
					local411 = local294;
				} else {
					local411 = this.anIntArrayArray59[local265][local294];
				}
				this.anIntArrayArray60[local265][local411] = local12.method5776();
			}
			this.aClass110Array1[local265] = new Class110(this.anIntArrayArray60[local265]);
		}
	}
}
