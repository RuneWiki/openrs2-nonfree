import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class79 {

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	private int anInt2423;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
	private int anInt2426;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	private int anInt2429;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
	private int anInt2431;

	static {
		new Class34("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	private Class79() {
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "([I)V")
	public Class79(@OriginalArg(0) int[] arg0) {
		this.anIntArray225 = new int[256];
		this.anIntArray227 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray225[local13] = arg0[local13];
		}
		this.method2115();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)I")
	public int method2111() {
		if (this.anInt2423-- == 0) {
			this.method2112();
			this.anInt2423 = 255;
		}
		return this.anIntArray225[this.anInt2423];
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
	private void method2112() {
		this.anInt2431 += ++this.anInt2429;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(33) int local33 = this.anIntArray227[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt2426 ^= this.anInt2426 << 13;
				} else {
					this.anInt2426 ^= this.anInt2426 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt2426 ^= this.anInt2426 << 2;
			} else {
				this.anInt2426 ^= this.anInt2426 >>> 16;
			}
			this.anInt2426 += this.anIntArray227[local26 + 128 & 0xFF];
			@Pc(127) int local127;
			this.anIntArray227[local26] = local127 = this.anIntArray227[local33 >> 2 & 0xFF] + this.anInt2426 + this.anInt2431;
			this.anIntArray225[local26] = this.anInt2431 = this.anIntArray227[local127 >> 8 >> 2 & 0xFF] + local33;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	private void method2115() {
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
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray225[local23 + 1];
			local16 += this.anIntArray225[local23 + 3];
			local10 += this.anIntArray225[local23 + 6];
			local21 += this.anIntArray225[local23];
			local18 += this.anIntArray225[local23 + 2];
			local8 += this.anIntArray225[local23 + 7];
			local12 += this.anIntArray225[local23 + 5];
			local14 += this.anIntArray225[local23 + 4];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
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
			this.anIntArray227[local23] = local21;
			this.anIntArray227[local23 + 1] = local20;
			this.anIntArray227[local23 + 2] = local18;
			this.anIntArray227[local23 + 3] = local16;
			this.anIntArray227[local23 + 4] = local14;
			this.anIntArray227[local23 + 5] = local12;
			this.anIntArray227[local23 + 6] = local10;
			this.anIntArray227[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray227[local23 + 6];
			local8 += this.anIntArray227[local23 + 7];
			local14 += this.anIntArray227[local23 + 4];
			local16 += this.anIntArray227[local23 + 3];
			local21 += this.anIntArray227[local23];
			local12 += this.anIntArray227[local23 + 5];
			local20 += this.anIntArray227[local23 + 1];
			local18 += this.anIntArray227[local23 + 2];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
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
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray227[local23] = local21;
			this.anIntArray227[local23 + 1] = local20;
			this.anIntArray227[local23 + 2] = local18;
			this.anIntArray227[local23 + 3] = local16;
			this.anIntArray227[local23 + 4] = local14;
			this.anIntArray227[local23 + 5] = local12;
			this.anIntArray227[local23 + 6] = local10;
			this.anIntArray227[local23 + 7] = local8;
		}
		this.method2112();
		this.anInt2423 = 256;
	}
}
