import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class349 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public int anInt9613;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!cf;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[Lclient!cf;")
	public Class51[] aClass51Array1;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "[I")
	public int[] anIntArray532;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[[B")
	public byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "[I")
	public int[] anIntArray533;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	public int anInt9618;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
	public int anInt9620;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "[I")
	public int[] anIntArray534;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public final int anInt9612;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([BI[B)V")
	public Class349(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt9612 = Static5.method102(arg0.length, arg0);
		if (this.anInt9612 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray102 = Static430.method6207(arg0.length, 0, arg0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray102[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method8259(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B[B)V")
	private void method8259(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class5_Sub22 local12 = new Class5_Sub22(Static323.method4916(arg0));
		@Pc(16) int local16 = local12.method5966();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt9620 = 0;
		} else {
			this.anInt9620 = local12.method5913();
		}
		@Pc(47) int local47 = local12.method5966();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(66) boolean local66 = (local47 & 0x2) != 0;
		this.anInt9613 = local12.method5968();
		@Pc(81) int local81 = 0;
		this.anIntArray532 = new int[this.anInt9613];
		@Pc(88) int local88 = -1;
		for (@Pc(90) int local90 = 0; local90 < this.anInt9613; local90++) {
			this.anIntArray532[local90] = local81 += local12.method5968();
			if (local88 < this.anIntArray532[local90]) {
				local88 = this.anIntArray532[local90];
			}
		}
		this.anInt9618 = local88 + 1;
		this.anIntArray534 = new int[this.anInt9618];
		this.anIntArray531 = new int[this.anInt9618];
		this.anIntArray528 = new int[this.anInt9618];
		this.anIntArray530 = new int[this.anInt9618];
		this.anIntArrayArray65 = new int[this.anInt9618][];
		if (local66) {
			this.aByteArrayArray24 = new byte[this.anInt9618][];
		}
		@Pc(169) int local169;
		@Pc(187) int local187;
		if (local55) {
			this.anIntArray533 = new int[this.anInt9618];
			for (local169 = 0; local169 < this.anInt9618; local169++) {
				this.anIntArray533[local169] = -1;
			}
			for (local187 = 0; local187 < this.anInt9613; local187++) {
				this.anIntArray533[this.anIntArray532[local187]] = local12.method5913();
			}
			this.aClass51_1 = new Class51(this.anIntArray533);
		}
		for (local169 = 0; local169 < this.anInt9613; local169++) {
			this.anIntArray528[this.anIntArray532[local169]] = local12.method5913();
		}
		if (local66) {
			for (local187 = 0; local187 < this.anInt9613; local187++) {
				@Pc(239) byte[] local239 = new byte[64];
				local12.method5915(0, 64, local239);
				this.aByteArrayArray24[this.anIntArray532[local187]] = local239;
			}
		}
		for (local187 = 0; local187 < this.anInt9613; local187++) {
			this.anIntArray531[this.anIntArray532[local187]] = local12.method5913();
		}
		for (@Pc(283) int local283 = 0; local283 < this.anInt9613; local283++) {
			this.anIntArray530[this.anIntArray532[local283]] = local12.method5968();
		}
		@Pc(313) int local313;
		@Pc(318) int local318;
		@Pc(328) int local328;
		@Pc(330) int local330;
		@Pc(347) int local347;
		for (@Pc(306) int local306 = 0; local306 < this.anInt9613; local306++) {
			local313 = this.anIntArray532[local306];
			local318 = this.anIntArray530[local313];
			local81 = 0;
			this.anIntArrayArray65[local313] = new int[local318];
			local328 = -1;
			for (local330 = 0; local330 < local318; local330++) {
				local347 = this.anIntArrayArray65[local313][local330] = local81 += local12.method5968();
				if (local328 < local347) {
					local328 = local347;
				}
			}
			this.anIntArray534[local313] = local328 + 1;
			if (local318 == local328 + 1) {
				this.anIntArrayArray65[local313] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.anIntArrayArray66 = new int[local88 + 1][];
		this.aClass51Array1 = new Class51[local88 + 1];
		for (local313 = 0; local313 < this.anInt9613; local313++) {
			local318 = this.anIntArray532[local313];
			local328 = this.anIntArray530[local318];
			this.anIntArrayArray66[local318] = new int[this.anIntArray534[local318]];
			for (local330 = 0; local330 < this.anIntArray534[local318]; local330++) {
				this.anIntArrayArray66[local318][local330] = -1;
			}
			for (local347 = 0; local347 < local328; local347++) {
				@Pc(465) int local465;
				if (this.anIntArrayArray65[local318] == null) {
					local465 = local347;
				} else {
					local465 = this.anIntArrayArray65[local318][local347];
				}
				this.anIntArrayArray66[local318][local465] = local12.method5913();
			}
			this.aClass51Array1[local318] = new Class51(this.anIntArrayArray66[local318]);
		}
	}
}
