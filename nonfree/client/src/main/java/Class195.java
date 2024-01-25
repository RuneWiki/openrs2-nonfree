import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class195 {

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
	private int anInt5495;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
	private int anInt5498;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	private int anInt5499;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
	private int anInt5501;

	static {
		new Class96("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	private Class195() {
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "([I)V")
	public Class195(@OriginalArg(0) int[] arg0) {
		this.anIntArray411 = new int[256];
		this.anIntArray410 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray410[local13] = arg0[local13];
		}
		this.method4372();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	private void method4367() {
		this.anInt5499 += ++this.anInt5498;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray411[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt5501 ^= this.anInt5501 << 13;
				} else {
					this.anInt5501 ^= this.anInt5501 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt5501 ^= this.anInt5501 << 2;
			} else {
				this.anInt5501 ^= this.anInt5501 >>> 16;
			}
			this.anInt5501 += this.anIntArray411[local25 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray411[local25] = local126 = this.anIntArray411[local32 >> 2 & 0xFF] + this.anInt5501 + this.anInt5499;
			this.anIntArray410[local25] = this.anInt5499 = this.anIntArray411[local126 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I")
	public int method4370() {
		if (this.anInt5495 == 0) {
			this.method4367();
			this.anInt5495 = 256;
		}
		return this.anIntArray410[--this.anInt5495];
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
	public int method4371() {
		if (this.anInt5495 == 0) {
			this.method4367();
			this.anInt5495 = 256;
		}
		return this.anIntArray410[this.anInt5495 - 1];
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	private void method4372() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray410[local23 + 1];
			local18 += this.anIntArray410[local23 + 2];
			local8 += this.anIntArray410[local23 + 7];
			local21 += this.anIntArray410[local23];
			local10 += this.anIntArray410[local23 + 6];
			local16 += this.anIntArray410[local23 + 3];
			local12 += this.anIntArray410[local23 + 5];
			local14 += this.anIntArray410[local23 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray411[local23] = local21;
			this.anIntArray411[local23 + 1] = local20;
			this.anIntArray411[local23 + 2] = local18;
			this.anIntArray411[local23 + 3] = local16;
			this.anIntArray411[local23 + 4] = local14;
			this.anIntArray411[local23 + 5] = local12;
			this.anIntArray411[local23 + 6] = local10;
			this.anIntArray411[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray411[local23];
			local16 += this.anIntArray411[local23 + 3];
			local18 += this.anIntArray411[local23 + 2];
			local20 += this.anIntArray411[local23 + 1];
			local12 += this.anIntArray411[local23 + 5];
			local14 += this.anIntArray411[local23 + 4];
			local10 += this.anIntArray411[local23 + 6];
			local8 += this.anIntArray411[local23 + 7];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray411[local23] = local21;
			this.anIntArray411[local23 + 1] = local20;
			this.anIntArray411[local23 + 2] = local18;
			this.anIntArray411[local23 + 3] = local16;
			this.anIntArray411[local23 + 4] = local14;
			this.anIntArray411[local23 + 5] = local12;
			this.anIntArray411[local23 + 6] = local10;
			this.anIntArray411[local23 + 7] = local8;
		}
		this.method4367();
		this.anInt5495 = 256;
	}
}
