import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class157 {

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "[B")
	public static final byte[] aByteArray77;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
	private int anInt4426;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "[I")
	private int[] anIntArray290;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
	private int anInt4431;

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
	private int anInt4434;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
	private int anInt4435;

	static {
		@Pc(7) int local7 = 0;
		aByteArray77 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray77[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local12 * local12 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V")
	private Class157() {
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "([I)V")
	public Class157(@OriginalArg(0) int[] arg0) {
		this.anIntArray290 = new int[256];
		this.anIntArray291 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray290[local13] = arg0[local13];
		}
		this.method3700();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
	public int method3696() {
		if (this.anInt4426 == 0) {
			this.method3697();
			this.anInt4426 = 256;
		}
		return this.anIntArray290[this.anInt4426 - 1];
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
	private void method3697() {
		this.anInt4434 += ++this.anInt4435;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray291[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt4431 ^= this.anInt4431 << 13;
				} else {
					this.anInt4431 ^= this.anInt4431 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt4431 ^= this.anInt4431 << 2;
			} else {
				this.anInt4431 ^= this.anInt4431 >>> 16;
			}
			this.anInt4431 += this.anIntArray291[local24 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray291[local24] = local124 = this.anInt4434 + this.anIntArray291[local31 >> 2 & 0xFF] + this.anInt4431;
			this.anIntArray290[local24] = this.anInt4434 = this.anIntArray291[local124 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	private void method3700() {
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray290[local29 + 3];
			local14 += this.anIntArray290[local29 + 7];
			local20 += this.anIntArray290[local29 + 4];
			local24 += this.anIntArray290[local29 + 2];
			local16 += this.anIntArray290[local29 + 6];
			local26 += this.anIntArray290[local29 + 1];
			local18 += this.anIntArray290[local29 + 5];
			local27 += this.anIntArray290[local29];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray291[local29] = local27;
			this.anIntArray291[local29 + 1] = local26;
			this.anIntArray291[local29 + 2] = local24;
			this.anIntArray291[local29 + 3] = local22;
			this.anIntArray291[local29 + 4] = local20;
			this.anIntArray291[local29 + 5] = local18;
			this.anIntArray291[local29 + 6] = local16;
			this.anIntArray291[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray291[local29 + 6];
			local26 += this.anIntArray291[local29 + 1];
			local22 += this.anIntArray291[local29 + 3];
			local14 += this.anIntArray291[local29 + 7];
			local18 += this.anIntArray291[local29 + 5];
			local27 += this.anIntArray291[local29];
			local20 += this.anIntArray291[local29 + 4];
			local24 += this.anIntArray291[local29 + 2];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray291[local29] = local27;
			this.anIntArray291[local29 + 1] = local26;
			this.anIntArray291[local29 + 2] = local24;
			this.anIntArray291[local29 + 3] = local22;
			this.anIntArray291[local29 + 4] = local20;
			this.anIntArray291[local29 + 5] = local18;
			this.anIntArray291[local29 + 6] = local16;
			this.anIntArray291[local29 + 7] = local14;
		}
		this.method3697();
		this.anInt4426 = 256;
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)I")
	public int method3701() {
		if (this.anInt4426 == 0) {
			this.method3697();
			this.anInt4426 = 256;
		}
		return this.anIntArray290[--this.anInt4426];
	}
}
