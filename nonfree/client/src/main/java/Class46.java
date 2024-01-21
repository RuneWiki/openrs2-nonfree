import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class46 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([II)V")
	public Class46(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anIntArray261 = new int[256];
			this.anIntArray260 = new int[256];
			@Pc(19) int local19;
			if (arg1 < 8 || arg1 > 8) {
				for (local19 = 1; local19 > 0; local19++) {
				}
			}
			for (local19 = 0; local19 < arg0.length; local19++) {
				this.anIntArray260[local19] = arg0[local19];
			}
			this.method658();
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("22756, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
	public int method656() {
		if (this.anInt975-- == 0) {
			this.method657();
			this.anInt975 = 255;
		}
		return this.anIntArray260[this.anInt975];
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	private void method657() {
		this.anInt977 += ++this.anInt978;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray261[local15];
			switch(local15 & 0x3) {
				case 0:
					this.anInt976 ^= this.anInt976 << 13;
					break;
				case 1:
					this.anInt976 ^= this.anInt976 >>> 6;
					break;
				case 2:
					this.anInt976 ^= this.anInt976 << 2;
					break;
				case 3:
					this.anInt976 ^= this.anInt976 >>> 16;
			}
			this.anInt976 += this.anIntArray261[local15 + 128 & 0xFF];
			@Pc(101) int local101;
			this.anIntArray261[local15] = local101 = this.anIntArray261[local22 >> 2 & 0xFF] + this.anInt976 + this.anInt977;
			this.anIntArray260[local15] = this.anInt977 = this.anIntArray261[local101 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	private void method658() {
		@Pc(4) int local4 = -1640531527;
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray260[local19];
			local16 += this.anIntArray260[local19 + 1];
			local14 += this.anIntArray260[local19 + 2];
			local12 += this.anIntArray260[local19 + 3];
			local10 += this.anIntArray260[local19 + 4];
			local8 += this.anIntArray260[local19 + 5];
			local6 += this.anIntArray260[local19 + 6];
			local4 += this.anIntArray260[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray261[local19] = local17;
			this.anIntArray261[local19 + 1] = local16;
			this.anIntArray261[local19 + 2] = local14;
			this.anIntArray261[local19 + 3] = local12;
			this.anIntArray261[local19 + 4] = local10;
			this.anIntArray261[local19 + 5] = local8;
			this.anIntArray261[local19 + 6] = local6;
			this.anIntArray261[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray261[local19];
			local16 += this.anIntArray261[local19 + 1];
			local14 += this.anIntArray261[local19 + 2];
			local12 += this.anIntArray261[local19 + 3];
			local10 += this.anIntArray261[local19 + 4];
			local8 += this.anIntArray261[local19 + 5];
			local6 += this.anIntArray261[local19 + 6];
			local4 += this.anIntArray261[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray261[local19] = local17;
			this.anIntArray261[local19 + 1] = local16;
			this.anIntArray261[local19 + 2] = local14;
			this.anIntArray261[local19 + 3] = local12;
			this.anIntArray261[local19 + 4] = local10;
			this.anIntArray261[local19 + 5] = local8;
			this.anIntArray261[local19 + 6] = local6;
			this.anIntArray261[local19 + 7] = local4;
		}
		this.method657();
		this.anInt975 = 256;
	}
}
