import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class277 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
	public int[] anIntArray727;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
	public int[] anIntArray728;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "[I")
	public int[] anIntArray729;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
	public int[] anIntArray730;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!lc;")
	public Class179 aClass179_1;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[[B")
	public byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray100;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
	public int anInt7777;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray101;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "[I")
	public int[] anIntArray731;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "[Lclient!lc;")
	public Class179[] aClass179Array1;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
	public int anInt7780;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "[I")
	public int[] anIntArray732;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public int anInt7782;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	public final int anInt7781;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "[B")
	private byte[] aByteArray109;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([BI[B)V")
	public Class277(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7781 = Static31.method746(arg0, arg0.length);
		if (this.anInt7781 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray109 = Static464.method4175(arg0.length, 0, arg0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (arg2[local42] != this.aByteArray109[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6473(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BB)V")
	private void method6473(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub6 local12 = new Class1_Sub6(Static404.method6675(arg0));
		@Pc(16) int local16 = local12.method3922();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt7780 = local12.method3925();
		} else {
			this.anInt7780 = 0;
		}
		@Pc(47) int local47 = local12.method3922();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(69) boolean local69 = (local47 & 0x2) != 0;
		this.anInt7777 = local12.method3967();
		@Pc(76) int local76 = 0;
		this.anIntArray727 = new int[this.anInt7777];
		@Pc(83) int local83 = -1;
		for (@Pc(85) int local85 = 0; local85 < this.anInt7777; local85++) {
			this.anIntArray727[local85] = local76 += local12.method3967();
			if (local83 < this.anIntArray727[local85]) {
				local83 = this.anIntArray727[local85];
			}
		}
		this.anInt7782 = local83 + 1;
		this.anIntArray729 = new int[this.anInt7782];
		this.anIntArray732 = new int[this.anInt7782];
		this.anIntArray730 = new int[this.anInt7782];
		this.anIntArray728 = new int[this.anInt7782];
		if (local69) {
			this.aByteArrayArray28 = new byte[this.anInt7782][];
		}
		this.anIntArrayArray101 = new int[this.anInt7782][];
		@Pc(164) int local164;
		@Pc(182) int local182;
		if (local55) {
			this.anIntArray731 = new int[this.anInt7782];
			for (local164 = 0; local164 < this.anInt7782; local164++) {
				this.anIntArray731[local164] = -1;
			}
			for (local182 = 0; local182 < this.anInt7777; local182++) {
				this.anIntArray731[this.anIntArray727[local182]] = local12.method3925();
			}
			this.aClass179_1 = new Class179(this.anIntArray731);
		}
		for (local164 = 0; local164 < this.anInt7777; local164++) {
			this.anIntArray728[this.anIntArray727[local164]] = local12.method3925();
		}
		if (local69) {
			for (local182 = 0; local182 < this.anInt7777; local182++) {
				@Pc(238) byte[] local238 = new byte[64];
				local12.method3963(local238, 64);
				this.aByteArrayArray28[this.anIntArray727[local182]] = local238;
			}
		}
		for (local182 = 0; local182 < this.anInt7777; local182++) {
			this.anIntArray729[this.anIntArray727[local182]] = local12.method3925();
		}
		for (@Pc(286) int local286 = 0; local286 < this.anInt7777; local286++) {
			this.anIntArray732[this.anIntArray727[local286]] = local12.method3967();
		}
		@Pc(312) int local312;
		@Pc(317) int local317;
		@Pc(327) int local327;
		@Pc(329) int local329;
		@Pc(346) int local346;
		for (@Pc(305) int local305 = 0; local305 < this.anInt7777; local305++) {
			local312 = this.anIntArray727[local305];
			local317 = this.anIntArray732[local312];
			local76 = 0;
			this.anIntArrayArray101[local312] = new int[local317];
			local327 = -1;
			for (local329 = 0; local329 < local317; local329++) {
				local346 = this.anIntArrayArray101[local312][local329] = local76 += local12.method3967();
				if (local327 < local346) {
					local327 = local346;
				}
			}
			this.anIntArray730[local312] = local327 + 1;
			if (local327 + 1 == local317) {
				this.anIntArrayArray101[local312] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.anIntArrayArray100 = new int[local83 + 1][];
		this.aClass179Array1 = new Class179[local83 + 1];
		for (local312 = 0; local312 < this.anInt7777; local312++) {
			local317 = this.anIntArray727[local312];
			local327 = this.anIntArray732[local317];
			this.anIntArrayArray100[local317] = new int[this.anIntArray730[local317]];
			for (local329 = 0; local329 < this.anIntArray730[local317]; local329++) {
				this.anIntArrayArray100[local317][local329] = -1;
			}
			for (local346 = 0; local346 < local327; local346++) {
				@Pc(455) int local455;
				if (this.anIntArrayArray101[local317] == null) {
					local455 = local346;
				} else {
					local455 = this.anIntArrayArray101[local317][local346];
				}
				this.anIntArrayArray100[local317][local455] = local12.method3925();
			}
			this.aClass179Array1[local317] = new Class179(this.anIntArrayArray100[local317]);
		}
	}
}
