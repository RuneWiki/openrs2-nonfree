import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class44 {

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(I[I)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray252 = new int[256];
			this.anIntArray251 = new int[256];
			@Pc(13) int local13 = 54 / arg0;
			for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
				this.anIntArray251[local15] = arg1[local15];
			}
			this.method637();
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("54992, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "()I")
	public int method635() {
		if (this.anInt983-- == 0) {
			this.method636();
			this.anInt983 = 255;
		}
		return this.anIntArray251[this.anInt983];
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "()V")
	private void method636() {
		this.anInt985 += ++this.anInt986;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray252[local15];
			switch(local15 & 0x3) {
				case 0:
					this.anInt984 ^= this.anInt984 << 13;
					break;
				case 1:
					this.anInt984 ^= this.anInt984 >>> 6;
					break;
				case 2:
					this.anInt984 ^= this.anInt984 << 2;
					break;
				case 3:
					this.anInt984 ^= this.anInt984 >>> 16;
			}
			this.anInt984 += this.anIntArray252[local15 + 128 & 0xFF];
			@Pc(101) int local101;
			this.anIntArray252[local15] = local101 = this.anIntArray252[local22 >> 2 & 0xFF] + this.anInt984 + this.anInt985;
			this.anIntArray251[local15] = this.anInt985 = this.anIntArray252[local101 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "()V")
	private void method637() {
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
			local17 += this.anIntArray251[local19];
			local16 += this.anIntArray251[local19 + 1];
			local14 += this.anIntArray251[local19 + 2];
			local12 += this.anIntArray251[local19 + 3];
			local10 += this.anIntArray251[local19 + 4];
			local8 += this.anIntArray251[local19 + 5];
			local6 += this.anIntArray251[local19 + 6];
			local4 += this.anIntArray251[local19 + 7];
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
			this.anIntArray252[local19] = local17;
			this.anIntArray252[local19 + 1] = local16;
			this.anIntArray252[local19 + 2] = local14;
			this.anIntArray252[local19 + 3] = local12;
			this.anIntArray252[local19 + 4] = local10;
			this.anIntArray252[local19 + 5] = local8;
			this.anIntArray252[local19 + 6] = local6;
			this.anIntArray252[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray252[local19];
			local16 += this.anIntArray252[local19 + 1];
			local14 += this.anIntArray252[local19 + 2];
			local12 += this.anIntArray252[local19 + 3];
			local10 += this.anIntArray252[local19 + 4];
			local8 += this.anIntArray252[local19 + 5];
			local6 += this.anIntArray252[local19 + 6];
			local4 += this.anIntArray252[local19 + 7];
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
			this.anIntArray252[local19] = local17;
			this.anIntArray252[local19 + 1] = local16;
			this.anIntArray252[local19 + 2] = local14;
			this.anIntArray252[local19 + 3] = local12;
			this.anIntArray252[local19 + 4] = local10;
			this.anIntArray252[local19 + 5] = local8;
			this.anIntArray252[local19 + 6] = local6;
			this.anIntArray252[local19 + 7] = local4;
		}
		this.method636();
		this.anInt983 = 256;
	}
}
