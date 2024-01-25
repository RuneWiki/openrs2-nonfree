import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class191 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public int anInt4780;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	public int[] anIntArray359;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public int anInt4782;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "[Lclient!tfa;")
	public Class348[] aClass348Array1;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[[B")
	public byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Lclient!tfa;")
	public Class348 aClass348_1;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	public int anInt4787;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public final int anInt4788;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([BI[B)V")
	public Class191(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt4788 = Static303.method4270(arg0, arg0.length);
		if (arg1 != this.anInt4788) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray53 = Static249.method3664(arg0, 0, arg0.length);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (this.aByteArray53[local42] != arg2[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method4271(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B)V")
	private void method4271(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class4_Sub11 local12 = new Class4_Sub11(Static540.method7233(arg0));
		@Pc(16) int local16 = local12.method8865();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt4787 = 0;
		} else {
			this.anInt4787 = local12.method8850();
		}
		@Pc(43) int local43 = local12.method8865();
		@Pc(51) boolean local51 = (local43 & 0x1) != 0;
		this.anInt4780 = local12.method8859();
		@Pc(67) boolean local67 = (local43 & 0x2) != 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = -1;
		this.anIntArray363 = new int[this.anInt4780];
		for (@Pc(78) int local78 = 0; local78 < this.anInt4780; local78++) {
			this.anIntArray363[local78] = local69 += local12.method8859();
			if (this.anIntArray363[local78] > local71) {
				local71 = this.anIntArray363[local78];
			}
		}
		this.anInt4782 = local71 + 1;
		this.anIntArrayArray28 = new int[this.anInt4782][];
		this.anIntArray364 = new int[this.anInt4782];
		this.anIntArray362 = new int[this.anInt4782];
		if (local67) {
			this.aByteArrayArray15 = new byte[this.anInt4782][];
		}
		this.anIntArray359 = new int[this.anInt4782];
		this.anIntArray360 = new int[this.anInt4782];
		@Pc(157) int local157;
		@Pc(171) int local171;
		if (local51) {
			this.anIntArray361 = new int[this.anInt4782];
			for (local157 = 0; local157 < this.anInt4782; local157++) {
				this.anIntArray361[local157] = -1;
			}
			for (local171 = 0; local171 < this.anInt4780; local171++) {
				this.anIntArray361[this.anIntArray363[local171]] = local12.method8850();
			}
			this.aClass348_1 = new Class348(this.anIntArray361);
		}
		for (local157 = 0; local157 < this.anInt4780; local157++) {
			this.anIntArray364[this.anIntArray363[local157]] = local12.method8850();
		}
		if (local67) {
			for (local171 = 0; local171 < this.anInt4780; local171++) {
				@Pc(231) byte[] local231 = new byte[64];
				local12.method8870(local231, 0, 64);
				this.aByteArrayArray15[this.anIntArray363[local171]] = local231;
			}
		}
		for (local171 = 0; local171 < this.anInt4780; local171++) {
			this.anIntArray362[this.anIntArray363[local171]] = local12.method8850();
		}
		for (@Pc(281) int local281 = 0; local281 < this.anInt4780; local281++) {
			this.anIntArray359[this.anIntArray363[local281]] = local12.method8859();
		}
		@Pc(311) int local311;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(345) int local345;
		for (@Pc(304) int local304 = 0; local304 < this.anInt4780; local304++) {
			local311 = this.anIntArray363[local304];
			local316 = this.anIntArray359[local311];
			local69 = 0;
			this.anIntArrayArray28[local311] = new int[local316];
			local326 = -1;
			for (local328 = 0; local328 < local316; local328++) {
				local345 = this.anIntArrayArray28[local311][local328] = local69 += local12.method8859();
				if (local345 > local326) {
					local326 = local345;
				}
			}
			this.anIntArray360[local311] = local326 + 1;
			if (local326 + 1 == local316) {
				this.anIntArrayArray28[local311] = null;
			}
		}
		if (!local51) {
			return;
		}
		this.anIntArrayArray29 = new int[local71 + 1][];
		this.aClass348Array1 = new Class348[local71 + 1];
		for (local311 = 0; local311 < this.anInt4780; local311++) {
			local316 = this.anIntArray363[local311];
			local326 = this.anIntArray359[local316];
			this.anIntArrayArray29[local316] = new int[this.anIntArray360[local316]];
			for (local328 = 0; local328 < this.anIntArray360[local316]; local328++) {
				this.anIntArrayArray29[local316][local328] = -1;
			}
			for (local345 = 0; local345 < local326; local345++) {
				@Pc(446) int local446;
				if (this.anIntArrayArray28[local316] == null) {
					local446 = local345;
				} else {
					local446 = this.anIntArrayArray28[local316][local345];
				}
				this.anIntArrayArray29[local316][local446] = local12.method8850();
			}
			this.aClass348Array1[local316] = new Class348(this.anIntArrayArray29[local316]);
		}
	}
}
