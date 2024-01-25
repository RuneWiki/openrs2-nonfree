import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class276 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	private int anInt7569;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
	private int anInt7573;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "[I")
	private int[] anIntArray584;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	private int anInt7574;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
	private int anInt7577;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	private Class276() {
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "([I)V")
	public Class276(@OriginalArg(0) int[] arg0) {
		this.anIntArray583 = new int[256];
		this.anIntArray584 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray583[local13] = arg0[local13];
		}
		this.method6028();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	private void method6027() {
		this.anInt7577 += ++this.anInt7573;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(33) int local33 = this.anIntArray584[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt7569 ^= this.anInt7569 << 13;
				} else {
					this.anInt7569 ^= this.anInt7569 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt7569 ^= this.anInt7569 << 2;
			} else {
				this.anInt7569 ^= this.anInt7569 >>> 16;
			}
			this.anInt7569 += this.anIntArray584[local26 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray584[local26] = local119 = this.anInt7577 + this.anIntArray584[local33 >> 2 & 0xFF] + this.anInt7569;
			this.anIntArray583[local26] = this.anInt7577 = local33 + this.anIntArray584[local119 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	private void method6028() {
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(30) int local30;
		for (local30 = 0; local30 < 4; local30++) {
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local17 += this.anIntArray583[local30 + 6];
			local28 += this.anIntArray583[local30];
			local21 += this.anIntArray583[local30 + 4];
			local19 += this.anIntArray583[local30 + 5];
			local25 += this.anIntArray583[local30 + 2];
			local23 += this.anIntArray583[local30 + 3];
			local15 += this.anIntArray583[local30 + 7];
			local27 += this.anIntArray583[local30 + 1];
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.anIntArray584[local30] = local28;
			this.anIntArray584[local30 + 1] = local27;
			this.anIntArray584[local30 + 2] = local25;
			this.anIntArray584[local30 + 3] = local23;
			this.anIntArray584[local30 + 4] = local21;
			this.anIntArray584[local30 + 5] = local19;
			this.anIntArray584[local30 + 6] = local17;
			this.anIntArray584[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local15 += this.anIntArray584[local30 + 7];
			local27 += this.anIntArray584[local30 + 1];
			local19 += this.anIntArray584[local30 + 5];
			local17 += this.anIntArray584[local30 + 6];
			local23 += this.anIntArray584[local30 + 3];
			local21 += this.anIntArray584[local30 + 4];
			local28 += this.anIntArray584[local30];
			local25 += this.anIntArray584[local30 + 2];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.anIntArray584[local30] = local28;
			this.anIntArray584[local30 + 1] = local27;
			this.anIntArray584[local30 + 2] = local25;
			this.anIntArray584[local30 + 3] = local23;
			this.anIntArray584[local30 + 4] = local21;
			this.anIntArray584[local30 + 5] = local19;
			this.anIntArray584[local30 + 6] = local17;
			this.anIntArray584[local30 + 7] = local15;
		}
		this.method6027();
		this.anInt7574 = 256;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	public int method6031() {
		if (this.anInt7574 == 0) {
			this.method6027();
			this.anInt7574 = 256;
		}
		return this.anIntArray583[--this.anInt7574];
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)I")
	public int method6032() {
		if (this.anInt7574 == 0) {
			this.method6027();
			this.anInt7574 = 256;
		}
		return this.anIntArray583[this.anInt7574 - 1];
	}
}
