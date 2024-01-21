import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class12 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
	private final int[] anIntArray39 = new int[256];

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "[I")
	private final int[] anIntArray38 = new int[256];

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([I)V")
	public Class12(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray39[local13] = arg0[local13];
		}
		this.method160();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	private void method160() {
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
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray39[local23 + 6];
			local16 += this.anIntArray39[local23 + 3];
			local20 += this.anIntArray39[local23 + 1];
			local8 += this.anIntArray39[local23 + 7];
			local21 += this.anIntArray39[local23];
			local12 += this.anIntArray39[local23 + 5];
			local14 += this.anIntArray39[local23 + 4];
			local21 ^= local20 << 11;
			local18 += this.anIntArray39[local23 + 2];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray38[local23] = local21;
			this.anIntArray38[local23 + 1] = local20;
			this.anIntArray38[local23 + 2] = local18;
			this.anIntArray38[local23 + 3] = local16;
			this.anIntArray38[local23 + 4] = local14;
			this.anIntArray38[local23 + 5] = local12;
			this.anIntArray38[local23 + 6] = local10;
			this.anIntArray38[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray38[local23 + 3];
			local21 += this.anIntArray38[local23];
			local18 += this.anIntArray38[local23 + 2];
			local10 += this.anIntArray38[local23 + 6];
			local8 += this.anIntArray38[local23 + 7];
			local20 += this.anIntArray38[local23 + 1];
			local14 += this.anIntArray38[local23 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local12 += this.anIntArray38[local23 + 5];
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray38[local23] = local21;
			this.anIntArray38[local23 + 1] = local20;
			this.anIntArray38[local23 + 2] = local18;
			this.anIntArray38[local23 + 3] = local16;
			this.anIntArray38[local23 + 4] = local14;
			this.anIntArray38[local23 + 5] = local12;
			this.anIntArray38[local23 + 6] = local10;
			this.anIntArray38[local23 + 7] = local8;
		}
		this.method162();
		this.anInt228 = 256;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	private void method162() {
		this.anInt224 += ++this.anInt225;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray38[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt222 ^= this.anInt222 << 13;
				} else {
					this.anInt222 ^= this.anInt222 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt222 ^= this.anInt222 << 2;
			} else {
				this.anInt222 ^= this.anInt222 >>> 16;
			}
			this.anInt222 += this.anIntArray38[local25 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray38[local25] = local125 = this.anIntArray38[local32 >> 2 & 0xFF] + this.anInt222 + this.anInt224;
			this.anIntArray39[local25] = this.anInt224 = local32 + this.anIntArray38[local125 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I")
	public int method163() {
		if (this.anInt228-- == 0) {
			this.method162();
			this.anInt228 = 255;
		}
		return this.anIntArray39[this.anInt228];
	}
}
