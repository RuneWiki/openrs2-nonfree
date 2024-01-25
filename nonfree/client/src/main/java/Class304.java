import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class304 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[Lclient!kfa;")
	public Class181[] aClass181Array1;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	public int anInt9148;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "[[B")
	public byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	public int anInt9149;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
	public int[] anIntArray590;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[I")
	public int[] anIntArray591;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!kfa;")
	public Class181 aClass181_1;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
	public int[] anIntArray592;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "[I")
	public int[] anIntArray593;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "[I")
	public int[] anIntArray594;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "[I")
	public int[] anIntArray595;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public int anInt9153;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public final int anInt9147;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([BI[B)V")
	public Class304(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt9147 = Static182.method3231(arg0, arg0.length);
		if (arg1 != this.anInt9147) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray104 = Static284.method6244(arg0.length, arg0, 0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (this.aByteArray104[local40] != arg2[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method7481(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)V")
	private void method7481(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7(Static548.method8014(arg0));
		@Pc(16) int local16 = local12.method6538();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt9153 = 0;
		} else {
			this.anInt9153 = local12.method6497();
		}
		@Pc(53) int local53 = local12.method6538();
		@Pc(64) boolean local64 = (local53 & 0x1) != 0;
		@Pc(75) boolean local75 = (local53 & 0x2) != 0;
		this.anInt9148 = local12.method6535();
		@Pc(82) int local82 = 0;
		this.anIntArray592 = new int[this.anInt9148];
		@Pc(89) int local89 = -1;
		for (@Pc(91) int local91 = 0; local91 < this.anInt9148; local91++) {
			this.anIntArray592[local91] = local82 += local12.method6535();
			if (this.anIntArray592[local91] > local89) {
				local89 = this.anIntArray592[local91];
			}
		}
		this.anInt9149 = local89 + 1;
		this.anIntArray594 = new int[this.anInt9149];
		if (local75) {
			this.aByteArrayArray29 = new byte[this.anInt9149][];
		}
		this.anIntArray590 = new int[this.anInt9149];
		this.anIntArray593 = new int[this.anInt9149];
		this.anIntArrayArray75 = new int[this.anInt9149][];
		this.anIntArray591 = new int[this.anInt9149];
		@Pc(166) int local166;
		@Pc(180) int local180;
		if (local64) {
			this.anIntArray595 = new int[this.anInt9149];
			for (local166 = 0; local166 < this.anInt9149; local166++) {
				this.anIntArray595[local166] = -1;
			}
			for (local180 = 0; local180 < this.anInt9148; local180++) {
				this.anIntArray595[this.anIntArray592[local180]] = local12.method6497();
			}
			this.aClass181_1 = new Class181(this.anIntArray595);
		}
		for (local166 = 0; local166 < this.anInt9148; local166++) {
			this.anIntArray591[this.anIntArray592[local166]] = local12.method6497();
		}
		if (local75) {
			for (local180 = 0; local180 < this.anInt9148; local180++) {
				@Pc(236) byte[] local236 = new byte[64];
				local12.method6540(local236, 64);
				this.aByteArrayArray29[this.anIntArray592[local180]] = local236;
			}
		}
		for (local180 = 0; local180 < this.anInt9148; local180++) {
			this.anIntArray594[this.anIntArray592[local180]] = local12.method6497();
		}
		for (@Pc(280) int local280 = 0; local280 < this.anInt9148; local280++) {
			this.anIntArray590[this.anIntArray592[local280]] = local12.method6535();
		}
		@Pc(310) int local310;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(327) int local327;
		@Pc(344) int local344;
		for (@Pc(303) int local303 = 0; local303 < this.anInt9148; local303++) {
			local310 = this.anIntArray592[local303];
			local82 = 0;
			local317 = this.anIntArray590[local310];
			local319 = -1;
			this.anIntArrayArray75[local310] = new int[local317];
			for (local327 = 0; local327 < local317; local327++) {
				local344 = this.anIntArrayArray75[local310][local327] = local82 += local12.method6535();
				if (local344 > local319) {
					local319 = local344;
				}
			}
			this.anIntArray593[local310] = local319 + 1;
			if (local317 == local319 + 1) {
				this.anIntArrayArray75[local310] = null;
			}
		}
		if (!local64) {
			return;
		}
		this.anIntArrayArray76 = new int[local89 + 1][];
		this.aClass181Array1 = new Class181[local89 + 1];
		for (local310 = 0; local310 < this.anInt9148; local310++) {
			local317 = this.anIntArray592[local310];
			local319 = this.anIntArray590[local317];
			this.anIntArrayArray76[local317] = new int[this.anIntArray593[local317]];
			for (local327 = 0; local327 < this.anIntArray593[local317]; local327++) {
				this.anIntArrayArray76[local317][local327] = -1;
			}
			for (local344 = 0; local344 < local319; local344++) {
				@Pc(454) int local454;
				if (this.anIntArrayArray75[local317] == null) {
					local454 = local344;
				} else {
					local454 = this.anIntArrayArray75[local317][local344];
				}
				this.anIntArrayArray76[local317][local454] = local12.method6497();
			}
			this.aClass181Array1[local317] = new Class181(this.anIntArrayArray76[local317]);
		}
	}
}
