import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class209 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	public int anInt6109;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "[I")
	public int[] anIntArray429;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "Lclient!ud;")
	public Class235 aClass235_1;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
	public int anInt6112;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	public int anInt6113;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "[Lclient!ud;")
	public Class235[] aClass235Array1;

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "[I")
	public int[] anIntArray432;

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	public final int anInt6111;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "([BI)V")
	public Class209(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6111 = Static276.method879(arg0.length, arg0);
		if (this.anInt6111 != arg1) {
			throw new RuntimeException();
		}
		this.method4767(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([BI)V")
	private void method4767(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub12 local12 = new Class4_Sub12(Static453.method5680(arg0));
		@Pc(16) int local16 = local12.method2490();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt6113 = local12.method2529();
		} else {
			this.anInt6113 = 0;
		}
		@Pc(45) int local45 = local12.method2490();
		this.anInt6109 = local12.method2536();
		@Pc(52) int local52 = 0;
		this.anIntArray431 = new int[this.anInt6109];
		@Pc(59) int local59 = -1;
		for (@Pc(61) int local61 = 0; local61 < this.anInt6109; local61++) {
			this.anIntArray431[local61] = local52 += local12.method2536();
			if (local59 < this.anIntArray431[local61]) {
				local59 = this.anIntArray431[local61];
			}
		}
		this.anInt6112 = local59 + 1;
		this.anIntArray429 = new int[this.anInt6112];
		this.anIntArray433 = new int[this.anInt6112];
		this.anIntArray430 = new int[this.anInt6112];
		this.anIntArray428 = new int[this.anInt6112];
		this.anIntArrayArray46 = new int[this.anInt6112][];
		@Pc(133) int local133;
		@Pc(151) int local151;
		if (local45 != 0) {
			this.anIntArray432 = new int[this.anInt6112];
			for (local133 = 0; local133 < this.anInt6112; local133++) {
				this.anIntArray432[local133] = -1;
			}
			for (local151 = 0; local151 < this.anInt6109; local151++) {
				this.anIntArray432[this.anIntArray431[local151]] = local12.method2529();
			}
			this.aClass235_1 = new Class235(this.anIntArray432);
		}
		for (local133 = 0; local133 < this.anInt6109; local133++) {
			this.anIntArray430[this.anIntArray431[local133]] = local12.method2529();
		}
		for (local151 = 0; local151 < this.anInt6109; local151++) {
			this.anIntArray429[this.anIntArray431[local151]] = local12.method2529();
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt6109; local223++) {
			this.anIntArray428[this.anIntArray431[local223]] = local12.method2536();
		}
		@Pc(249) int local249;
		@Pc(256) int local256;
		@Pc(258) int local258;
		@Pc(266) int local266;
		@Pc(283) int local283;
		for (@Pc(242) int local242 = 0; local242 < this.anInt6109; local242++) {
			local249 = this.anIntArray431[local242];
			local52 = 0;
			local256 = this.anIntArray428[local249];
			local258 = -1;
			this.anIntArrayArray46[local249] = new int[local256];
			for (local266 = 0; local266 < local256; local266++) {
				local283 = this.anIntArrayArray46[local249][local266] = local52 += local12.method2536();
				if (local258 < local283) {
					local258 = local283;
				}
			}
			this.anIntArray433[local249] = local258 + 1;
			if (local256 == local258 + 1) {
				this.anIntArrayArray46[local249] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.aClass235Array1 = new Class235[local59 + 1];
		this.anIntArrayArray47 = new int[local59 + 1][];
		for (local249 = 0; local249 < this.anInt6109; local249++) {
			local256 = this.anIntArray431[local249];
			local258 = this.anIntArray428[local256];
			this.anIntArrayArray47[local256] = new int[this.anIntArray433[local256]];
			for (local266 = 0; local266 < this.anIntArray433[local256]; local266++) {
				this.anIntArrayArray47[local256][local266] = -1;
			}
			for (local283 = 0; local283 < local258; local283++) {
				@Pc(391) int local391;
				if (this.anIntArrayArray46[local256] == null) {
					local391 = local283;
				} else {
					local391 = this.anIntArrayArray46[local256][local283];
				}
				this.anIntArrayArray47[local256][local391] = local12.method2529();
			}
			this.aClass235Array1[local256] = new Class235(this.anIntArrayArray47[local256]);
		}
	}
}
