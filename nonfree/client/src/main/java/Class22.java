import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MRWOUQJV")
public final class Class22 {

	@OriginalMember(owner = "client!MRWOUQJV", name = "b", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!MRWOUQJV", name = "e", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!MRWOUQJV", name = "f", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!MRWOUQJV", name = "g", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!MRWOUQJV", name = "a", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!MRWOUQJV", name = "d", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!MRWOUQJV", name = "c", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!MRWOUQJV", name = "<init>", descriptor = "(I[I)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray130 = new int[256];
			this.anIntArray129 = new int[256];
			for (@Pc(24) int local24 = 0; local24 < arg1.length; local24++) {
				this.anIntArray129[local24] = arg1[local24];
			}
			this.method231();
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("79469, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MRWOUQJV", name = "a", descriptor = "()I")
	public int method229() {
		if (this.anInt385-- == 0) {
			this.method230();
			this.anInt385 = 255;
		}
		return this.anIntArray129[this.anInt385];
	}

	@OriginalMember(owner = "client!MRWOUQJV", name = "b", descriptor = "()V")
	private void method230() {
		this.anInt387 += ++this.anInt388;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray130[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt386 ^= this.anInt386 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt386 ^= this.anInt386 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt386 ^= this.anInt386 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt386 ^= this.anInt386 >>> 16;
			}
			this.anInt386 += this.anIntArray130[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray130[local15] = local115 = this.anIntArray130[local22 >> 2 & 0xFF] + this.anInt386 + this.anInt387;
			this.anIntArray129[local15] = this.anInt387 = this.anIntArray130[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!MRWOUQJV", name = "c", descriptor = "()V")
	private void method231() {
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
			local17 += this.anIntArray129[local19];
			local16 += this.anIntArray129[local19 + 1];
			local14 += this.anIntArray129[local19 + 2];
			local12 += this.anIntArray129[local19 + 3];
			local10 += this.anIntArray129[local19 + 4];
			local8 += this.anIntArray129[local19 + 5];
			local6 += this.anIntArray129[local19 + 6];
			local4 += this.anIntArray129[local19 + 7];
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
			this.anIntArray130[local19] = local17;
			this.anIntArray130[local19 + 1] = local16;
			this.anIntArray130[local19 + 2] = local14;
			this.anIntArray130[local19 + 3] = local12;
			this.anIntArray130[local19 + 4] = local10;
			this.anIntArray130[local19 + 5] = local8;
			this.anIntArray130[local19 + 6] = local6;
			this.anIntArray130[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray130[local19];
			local16 += this.anIntArray130[local19 + 1];
			local14 += this.anIntArray130[local19 + 2];
			local12 += this.anIntArray130[local19 + 3];
			local10 += this.anIntArray130[local19 + 4];
			local8 += this.anIntArray130[local19 + 5];
			local6 += this.anIntArray130[local19 + 6];
			local4 += this.anIntArray130[local19 + 7];
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
			this.anIntArray130[local19] = local17;
			this.anIntArray130[local19 + 1] = local16;
			this.anIntArray130[local19 + 2] = local14;
			this.anIntArray130[local19 + 3] = local12;
			this.anIntArray130[local19 + 4] = local10;
			this.anIntArray130[local19 + 5] = local8;
			this.anIntArray130[local19 + 6] = local6;
			this.anIntArray130[local19 + 7] = local4;
		}
		this.method230();
		this.anInt385 = 256;
	}
}
