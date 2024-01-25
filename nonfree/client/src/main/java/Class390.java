import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class390 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "[I")
	public int[] anIntArray619;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "[I")
	public int[] anIntArray620;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public int anInt10820;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public int anInt10821;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
	public int[] anIntArray621;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
	public int anInt10823;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "[I")
	public int[] anIntArray622;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "[[B")
	public byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Lclient!uca;")
	public Class349 aClass349_1;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "[Lclient!uca;")
	public Class349[] aClass349Array1;

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "[I")
	public int[] anIntArray623;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "[I")
	public int[] anIntArray624;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	public final int anInt10822;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "[B")
	private byte[] aByteArray106;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([BI[B)V")
	public Class390(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt10822 = Static516.method6720(arg0, arg0.length);
		if (this.anInt10822 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray106 = Static318.method4562(arg0, arg0.length, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (this.aByteArray106[local42] != arg2[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method8919(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([BI)V")
	private void method8919(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub4 local12 = new Class3_Sub4(Static152.method8487(arg0));
		@Pc(16) int local16 = local12.method7954();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt10823 = 0;
		} else {
			this.anInt10823 = local12.method7895();
		}
		@Pc(47) int local47 = local12.method7954();
		@Pc(58) boolean local58 = (local47 & 0x1) != 0;
		@Pc(69) boolean local69 = (local47 & 0x2) != 0;
		this.anInt10820 = local12.method7951();
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = -1;
		this.anIntArray623 = new int[this.anInt10820];
		for (@Pc(85) int local85 = 0; local85 < this.anInt10820; local85++) {
			this.anIntArray623[local85] = local76 += local12.method7951();
			if (local78 < this.anIntArray623[local85]) {
				local78 = this.anIntArray623[local85];
			}
		}
		this.anInt10821 = local78 + 1;
		if (local69) {
			this.aByteArrayArray27 = new byte[this.anInt10821][];
		}
		this.anIntArrayArray66 = new int[this.anInt10821][];
		this.anIntArray620 = new int[this.anInt10821];
		this.anIntArray624 = new int[this.anInt10821];
		this.anIntArray622 = new int[this.anInt10821];
		this.anIntArray621 = new int[this.anInt10821];
		@Pc(160) int local160;
		@Pc(174) int local174;
		if (local58) {
			this.anIntArray619 = new int[this.anInt10821];
			for (local160 = 0; local160 < this.anInt10821; local160++) {
				this.anIntArray619[local160] = -1;
			}
			for (local174 = 0; local174 < this.anInt10820; local174++) {
				this.anIntArray619[this.anIntArray623[local174]] = local12.method7895();
			}
			this.aClass349_1 = new Class349(this.anIntArray619);
		}
		for (local160 = 0; local160 < this.anInt10820; local160++) {
			this.anIntArray621[this.anIntArray623[local160]] = local12.method7895();
		}
		if (local69) {
			for (local174 = 0; local174 < this.anInt10820; local174++) {
				@Pc(234) byte[] local234 = new byte[64];
				local12.method7958(0, local234, 64);
				this.aByteArrayArray27[this.anIntArray623[local174]] = local234;
			}
		}
		for (local174 = 0; local174 < this.anInt10820; local174++) {
			this.anIntArray622[this.anIntArray623[local174]] = local12.method7895();
		}
		for (@Pc(278) int local278 = 0; local278 < this.anInt10820; local278++) {
			this.anIntArray620[this.anIntArray623[local278]] = local12.method7951();
		}
		@Pc(311) int local311;
		@Pc(316) int local316;
		@Pc(320) int local320;
		@Pc(328) int local328;
		@Pc(345) int local345;
		for (@Pc(304) int local304 = 0; local304 < this.anInt10820; local304++) {
			local311 = this.anIntArray623[local304];
			local316 = this.anIntArray620[local311];
			local76 = 0;
			local320 = -1;
			this.anIntArrayArray66[local311] = new int[local316];
			for (local328 = 0; local328 < local316; local328++) {
				local345 = this.anIntArrayArray66[local311][local328] = local76 += local12.method7951();
				if (local345 > local320) {
					local320 = local345;
				}
			}
			this.anIntArray624[local311] = local320 + 1;
			if (local320 + 1 == local316) {
				this.anIntArrayArray66[local311] = null;
			}
		}
		if (!local58) {
			return;
		}
		this.aClass349Array1 = new Class349[local78 + 1];
		this.anIntArrayArray67 = new int[local78 + 1][];
		for (local311 = 0; local311 < this.anInt10820; local311++) {
			local316 = this.anIntArray623[local311];
			local320 = this.anIntArray620[local316];
			this.anIntArrayArray67[local316] = new int[this.anIntArray624[local316]];
			for (local328 = 0; local328 < this.anIntArray624[local316]; local328++) {
				this.anIntArrayArray67[local316][local328] = -1;
			}
			for (local345 = 0; local345 < local320; local345++) {
				@Pc(455) int local455;
				if (this.anIntArrayArray66[local316] == null) {
					local455 = local345;
				} else {
					local455 = this.anIntArrayArray66[local316][local345];
				}
				this.anIntArrayArray67[local316][local455] = local12.method7895();
			}
			this.aClass349Array1[local316] = new Class349(this.anIntArrayArray67[local316]);
		}
	}
}
