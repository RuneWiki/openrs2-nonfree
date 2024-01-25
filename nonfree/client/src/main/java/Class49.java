import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class49 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "([I)V")
	public Class49(@OriginalArg(0) int[] arg0) {
		this.anIntArray46 = new int[256];
		this.anIntArray47 = new int[256];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray46[local11] = arg0[local11];
		}
		this.method826();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
	public int method825() {
		if (this.anInt936 == 0) {
			this.method830();
			this.anInt936 = 256;
		}
		return this.anIntArray46[--this.anInt936];
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	private void method826() {
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21;
		for (local21 = 0; local21 < 4; local21++) {
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local10 += local8;
			local6 += local12;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local14 += this.anIntArray46[local21 + 3];
			local6 += this.anIntArray46[local21 + 7];
			local8 += this.anIntArray46[local21 + 6];
			local12 += this.anIntArray46[local21 + 4];
			local16 += this.anIntArray46[local21 + 2];
			local19 += this.anIntArray46[local21];
			local18 += this.anIntArray46[local21 + 1];
			local10 += this.anIntArray46[local21 + 5];
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local10 += local8;
			local6 += local12;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
			this.anIntArray47[local21] = local19;
			this.anIntArray47[local21 + 1] = local18;
			this.anIntArray47[local21 + 2] = local16;
			this.anIntArray47[local21 + 3] = local14;
			this.anIntArray47[local21 + 4] = local12;
			this.anIntArray47[local21 + 5] = local10;
			this.anIntArray47[local21 + 6] = local8;
			this.anIntArray47[local21 + 7] = local6;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local12 += this.anIntArray47[local21 + 4];
			local19 += this.anIntArray47[local21];
			local16 += this.anIntArray47[local21 + 2];
			local10 += this.anIntArray47[local21 + 5];
			local14 += this.anIntArray47[local21 + 3];
			local8 += this.anIntArray47[local21 + 6];
			local18 += this.anIntArray47[local21 + 1];
			local6 += this.anIntArray47[local21 + 7];
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local10 += local8;
			local6 += local12;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
			this.anIntArray47[local21] = local19;
			this.anIntArray47[local21 + 1] = local18;
			this.anIntArray47[local21 + 2] = local16;
			this.anIntArray47[local21 + 3] = local14;
			this.anIntArray47[local21 + 4] = local12;
			this.anIntArray47[local21 + 5] = local10;
			this.anIntArray47[local21 + 6] = local8;
			this.anIntArray47[local21 + 7] = local6;
		}
		this.method830();
		this.anInt936 = 256;
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)I")
	public int method829() {
		if (this.anInt936 == 0) {
			this.method830();
			this.anInt936 = 256;
		}
		return this.anIntArray46[this.anInt936 - 1];
	}

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V")
	private void method830() {
		this.anInt940 += ++this.anInt935;
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(28) int local28 = this.anIntArray47[local22];
			if ((local22 & 0x2) == 0) {
				if ((local22 & 0x1) == 0) {
					this.anInt938 ^= this.anInt938 << 13;
				} else {
					this.anInt938 ^= this.anInt938 >>> 6;
				}
			} else if ((local22 & 0x1) == 0) {
				this.anInt938 ^= this.anInt938 << 2;
			} else {
				this.anInt938 ^= this.anInt938 >>> 16;
			}
			this.anInt938 += this.anIntArray47[local22 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray47[local22] = local116 = this.anIntArray47[local28 >> 2 & 0xFF] + this.anInt938 + this.anInt940;
			this.anIntArray46[local22] = this.anInt940 = local28 + this.anIntArray47[local116 >> 8 >> 2 & 0xFF];
		}
	}
}
