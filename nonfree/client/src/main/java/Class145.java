import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class145 {

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "[Lclient!su;")
	public Class328[] aClass328Array1;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public int anInt3194;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "Lclient!su;")
	public Class328 aClass328_1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[[B")
	public byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public int anInt3197;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	public int anInt3201;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	public final int anInt3198;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([BI[B)V")
	public Class145(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt3198 = Static134.method1939(arg0.length, arg0);
		if (this.anInt3198 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray15 = Static470.method7564(arg0.length, 0, arg0);
			for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
				if (this.aByteArray15[local45] != arg2[local45]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2832(arg0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[B)V")
	private void method2832(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class5_Sub23 local12 = new Class5_Sub23(Static121.method1706(arg0));
		@Pc(16) int local16 = local12.method8529();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3197 = local12.method8527();
		} else {
			this.anInt3197 = 0;
		}
		@Pc(54) int local54 = local12.method8529();
		@Pc(66) boolean local66 = (local54 & 0x1) != 0;
		this.anInt3201 = local12.method8519();
		@Pc(80) boolean local80 = (local54 & 0x2) != 0;
		@Pc(82) int local82 = 0;
		this.anIntArray181 = new int[this.anInt3201];
		@Pc(89) int local89 = -1;
		for (@Pc(91) int local91 = 0; local91 < this.anInt3201; local91++) {
			this.anIntArray181[local91] = local82 += local12.method8519();
			if (local89 < this.anIntArray181[local91]) {
				local89 = this.anIntArray181[local91];
			}
		}
		this.anInt3194 = local89 + 1;
		this.anIntArray185 = new int[this.anInt3194];
		if (local80) {
			this.aByteArrayArray7 = new byte[this.anInt3194][];
		}
		this.anIntArray188 = new int[this.anInt3194];
		this.anIntArrayArray22 = new int[this.anInt3194][];
		this.anIntArray187 = new int[this.anInt3194];
		this.anIntArray184 = new int[this.anInt3194];
		@Pc(180) int local180;
		@Pc(196) int local196;
		if (local66) {
			this.anIntArray182 = new int[this.anInt3194];
			for (local180 = 0; local180 < this.anInt3194; local180++) {
				this.anIntArray182[local180] = -1;
			}
			for (local196 = 0; local196 < this.anInt3201; local196++) {
				this.anIntArray182[this.anIntArray181[local196]] = local12.method8527();
			}
			this.aClass328_1 = new Class328(this.anIntArray182);
		}
		for (local180 = 0; local180 < this.anInt3201; local180++) {
			this.anIntArray184[this.anIntArray181[local180]] = local12.method8527();
		}
		if (local80) {
			for (local196 = 0; local196 < this.anInt3201; local196++) {
				@Pc(270) byte[] local270 = new byte[64];
				local12.method8487(local270, 64, 0);
				this.aByteArrayArray7[this.anIntArray181[local196]] = local270;
			}
		}
		for (local196 = 0; local196 < this.anInt3201; local196++) {
			this.anIntArray188[this.anIntArray181[local196]] = local12.method8527();
		}
		for (@Pc(316) int local316 = 0; local316 < this.anInt3201; local316++) {
			this.anIntArray187[this.anIntArray181[local316]] = local12.method8519();
		}
		@Pc(350) int local350;
		@Pc(357) int local357;
		@Pc(365) int local365;
		@Pc(367) int local367;
		@Pc(384) int local384;
		for (@Pc(339) int local339 = 0; local339 < this.anInt3201; local339++) {
			local350 = this.anIntArray181[local339];
			local82 = 0;
			local357 = this.anIntArray187[local350];
			this.anIntArrayArray22[local350] = new int[local357];
			local365 = -1;
			for (local367 = 0; local367 < local357; local367++) {
				local384 = this.anIntArrayArray22[local350][local367] = local82 += local12.method8519();
				if (local384 > local365) {
					local365 = local384;
				}
			}
			this.anIntArray185[local350] = local365 + 1;
			if (local365 + 1 == local357) {
				this.anIntArrayArray22[local350] = null;
			}
		}
		if (!local66) {
			return;
		}
		this.anIntArrayArray21 = new int[local89 + 1][];
		this.aClass328Array1 = new Class328[local89 + 1];
		for (local350 = 0; local350 < this.anInt3201; local350++) {
			local357 = this.anIntArray181[local350];
			local365 = this.anIntArray187[local357];
			this.anIntArrayArray21[local357] = new int[this.anIntArray185[local357]];
			for (local367 = 0; local367 < this.anIntArray185[local357]; local367++) {
				this.anIntArrayArray21[local357][local367] = -1;
			}
			for (local384 = 0; local384 < local365; local384++) {
				@Pc(510) int local510;
				if (this.anIntArrayArray22[local357] == null) {
					local510 = local384;
				} else {
					local510 = this.anIntArrayArray22[local357][local384];
				}
				this.anIntArrayArray21[local357][local510] = local12.method8527();
			}
			this.aClass328Array1[local357] = new Class328(this.anIntArrayArray21[local357]);
		}
	}
}
