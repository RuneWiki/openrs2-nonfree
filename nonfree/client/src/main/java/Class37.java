import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class37 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	public int anInt1015;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
	public int anInt1019;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
	public int anInt1020;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "[Lclient!ro;")
	public Class260[] aClass260Array1;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "[[B")
	public byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "Lclient!ro;")
	public Class260 aClass260_1;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public final int anInt1017;

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([BI[B)V")
	public Class37(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt1017 = Static359.method5618(arg0, arg0.length);
		if (this.anInt1017 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray17 = Static332.method5280(arg0.length, arg0, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (this.aByteArray17[local42] != arg2[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method956(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B[B)V")
	private void method956(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub27 local12 = new Class3_Sub27(Static508.method7284(arg0));
		@Pc(16) int local16 = local12.method7548();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt1015 = 0;
		} else {
			this.anInt1015 = local12.method7549();
		}
		@Pc(47) int local47 = local12.method7548();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(66) boolean local66 = (local47 & 0x2) != 0;
		this.anInt1019 = local12.method7591();
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = -1;
		this.anIntArray137 = new int[this.anInt1019];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1019; local84++) {
			this.anIntArray137[local84] = local75 += local12.method7591();
			if (local77 < this.anIntArray137[local84]) {
				local77 = this.anIntArray137[local84];
			}
		}
		this.anInt1020 = local77 + 1;
		this.anIntArray136 = new int[this.anInt1020];
		this.anIntArray141 = new int[this.anInt1020];
		this.anIntArray139 = new int[this.anInt1020];
		this.anIntArray138 = new int[this.anInt1020];
		this.anIntArrayArray15 = new int[this.anInt1020][];
		if (local66) {
			this.aByteArrayArray1 = new byte[this.anInt1020][];
		}
		@Pc(159) int local159;
		@Pc(177) int local177;
		if (local55) {
			this.anIntArray140 = new int[this.anInt1020];
			for (local159 = 0; local159 < this.anInt1020; local159++) {
				this.anIntArray140[local159] = -1;
			}
			for (local177 = 0; local177 < this.anInt1019; local177++) {
				this.anIntArray140[this.anIntArray137[local177]] = local12.method7549();
			}
			this.aClass260_1 = new Class260(this.anIntArray140);
		}
		for (local159 = 0; local159 < this.anInt1019; local159++) {
			this.anIntArray136[this.anIntArray137[local159]] = local12.method7549();
		}
		if (local66) {
			for (local177 = 0; local177 < this.anInt1019; local177++) {
				@Pc(235) byte[] local235 = new byte[64];
				local12.method7571(local235, 64);
				this.aByteArrayArray1[this.anIntArray137[local177]] = local235;
			}
		}
		for (local177 = 0; local177 < this.anInt1019; local177++) {
			this.anIntArray141[this.anIntArray137[local177]] = local12.method7549();
		}
		for (@Pc(279) int local279 = 0; local279 < this.anInt1019; local279++) {
			this.anIntArray138[this.anIntArray137[local279]] = local12.method7591();
		}
		@Pc(305) int local305;
		@Pc(310) int local310;
		@Pc(314) int local314;
		@Pc(322) int local322;
		@Pc(339) int local339;
		for (@Pc(298) int local298 = 0; local298 < this.anInt1019; local298++) {
			local305 = this.anIntArray137[local298];
			local310 = this.anIntArray138[local305];
			local75 = 0;
			local314 = -1;
			this.anIntArrayArray15[local305] = new int[local310];
			for (local322 = 0; local322 < local310; local322++) {
				local339 = this.anIntArrayArray15[local305][local322] = local75 += local12.method7591();
				if (local339 > local314) {
					local314 = local339;
				}
			}
			this.anIntArray139[local305] = local314 + 1;
			if (local314 + 1 == local310) {
				this.anIntArrayArray15[local305] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.aClass260Array1 = new Class260[local77 + 1];
		this.anIntArrayArray16 = new int[local77 + 1][];
		for (local305 = 0; local305 < this.anInt1019; local305++) {
			local310 = this.anIntArray137[local305];
			local314 = this.anIntArray138[local310];
			this.anIntArrayArray16[local310] = new int[this.anIntArray139[local310]];
			for (local322 = 0; local322 < this.anIntArray139[local310]; local322++) {
				this.anIntArrayArray16[local310][local322] = -1;
			}
			for (local339 = 0; local339 < local314; local339++) {
				@Pc(448) int local448;
				if (this.anIntArrayArray15[local310] == null) {
					local448 = local339;
				} else {
					local448 = this.anIntArrayArray15[local310][local339];
				}
				this.anIntArrayArray16[local310][local448] = local12.method7549();
			}
			this.aClass260Array1[local310] = new Class260(this.anIntArrayArray16[local310]);
		}
	}
}
