import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class34 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	private int anInt1207;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	private int anInt1208;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
	private int anInt1213;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private int anInt1216;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "[I")
	private final int[] anIntArray182 = new int[256];

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
	private final int[] anIntArray183 = new int[256];

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([I)V")
	public Class34(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray183[local13] = arg0[local13];
		}
		this.method849();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	private void method849() {
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
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray183[local23 + 5];
			local18 += this.anIntArray183[local23 + 2];
			local20 += this.anIntArray183[local23 + 1];
			local8 += this.anIntArray183[local23 + 7];
			local14 += this.anIntArray183[local23 + 4];
			local21 += this.anIntArray183[local23];
			local21 ^= local20 << 11;
			local16 += this.anIntArray183[local23 + 3];
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local10 += this.anIntArray183[local23 + 6];
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
			this.anIntArray182[local23] = local21;
			this.anIntArray182[local23 + 1] = local20;
			this.anIntArray182[local23 + 2] = local18;
			this.anIntArray182[local23 + 3] = local16;
			this.anIntArray182[local23 + 4] = local14;
			this.anIntArray182[local23 + 5] = local12;
			this.anIntArray182[local23 + 6] = local10;
			this.anIntArray182[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray182[local23 + 1];
			local16 += this.anIntArray182[local23 + 3];
			local18 += this.anIntArray182[local23 + 2];
			local12 += this.anIntArray182[local23 + 5];
			local8 += this.anIntArray182[local23 + 7];
			local21 += this.anIntArray182[local23];
			local14 += this.anIntArray182[local23 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local10 += this.anIntArray182[local23 + 6];
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray182[local23] = local21;
			this.anIntArray182[local23 + 1] = local20;
			this.anIntArray182[local23 + 2] = local18;
			this.anIntArray182[local23 + 3] = local16;
			this.anIntArray182[local23 + 4] = local14;
			this.anIntArray182[local23 + 5] = local12;
			this.anIntArray182[local23 + 6] = local10;
			this.anIntArray182[local23 + 7] = local8;
		}
		this.method850();
		this.anInt1216 = 256;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	private void method850() {
		this.anInt1207 += ++this.anInt1208;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray182[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt1213 ^= this.anInt1213 << 13;
				} else {
					this.anInt1213 ^= this.anInt1213 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt1213 ^= this.anInt1213 << 2;
			} else {
				this.anInt1213 ^= this.anInt1213 >>> 16;
			}
			this.anInt1213 += this.anIntArray182[local23 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray182[local23] = local125 = this.anInt1207 + this.anInt1213 + this.anIntArray182[local30 >> 2 & 0xFF];
			this.anIntArray183[local23] = this.anInt1207 = this.anIntArray182[local125 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	public int method852() {
		if (this.anInt1216-- == 0) {
			this.method850();
			this.anInt1216 = 255;
		}
		return this.anIntArray183[this.anInt1216];
	}
}
