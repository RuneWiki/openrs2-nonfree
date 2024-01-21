import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZPIYFABJ")
public final class Class50 {

	@OriginalMember(owner = "client!ZPIYFABJ", name = "a", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!ZPIYFABJ", name = "d", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!ZPIYFABJ", name = "e", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!ZPIYFABJ", name = "f", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!ZPIYFABJ", name = "c", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ZPIYFABJ", name = "b", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ZPIYFABJ", name = "<init>", descriptor = "(I[I)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray209 = new int[256];
			this.anIntArray208 = new int[256];
			for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
				this.anIntArray208[local13] = arg1[local13];
			}
			this.method567();
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("47397, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPIYFABJ", name = "a", descriptor = "()I")
	public int method565() {
		if (this.anInt816-- == 0) {
			this.method566();
			this.anInt816 = 255;
		}
		return this.anIntArray208[this.anInt816];
	}

	@OriginalMember(owner = "client!ZPIYFABJ", name = "b", descriptor = "()V")
	private void method566() {
		this.anInt818 += ++this.anInt819;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray209[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt817 ^= this.anInt817 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt817 ^= this.anInt817 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt817 ^= this.anInt817 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt817 ^= this.anInt817 >>> 16;
			}
			this.anInt817 += this.anIntArray209[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray209[local15] = local115 = this.anIntArray209[local22 >> 2 & 0xFF] + this.anInt817 + this.anInt818;
			this.anIntArray208[local15] = this.anInt818 = this.anIntArray209[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!ZPIYFABJ", name = "c", descriptor = "()V")
	private void method567() {
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
			local17 += this.anIntArray208[local19];
			local16 += this.anIntArray208[local19 + 1];
			local14 += this.anIntArray208[local19 + 2];
			local12 += this.anIntArray208[local19 + 3];
			local10 += this.anIntArray208[local19 + 4];
			local8 += this.anIntArray208[local19 + 5];
			local6 += this.anIntArray208[local19 + 6];
			local4 += this.anIntArray208[local19 + 7];
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
			this.anIntArray209[local19] = local17;
			this.anIntArray209[local19 + 1] = local16;
			this.anIntArray209[local19 + 2] = local14;
			this.anIntArray209[local19 + 3] = local12;
			this.anIntArray209[local19 + 4] = local10;
			this.anIntArray209[local19 + 5] = local8;
			this.anIntArray209[local19 + 6] = local6;
			this.anIntArray209[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray209[local19];
			local16 += this.anIntArray209[local19 + 1];
			local14 += this.anIntArray209[local19 + 2];
			local12 += this.anIntArray209[local19 + 3];
			local10 += this.anIntArray209[local19 + 4];
			local8 += this.anIntArray209[local19 + 5];
			local6 += this.anIntArray209[local19 + 6];
			local4 += this.anIntArray209[local19 + 7];
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
			this.anIntArray209[local19] = local17;
			this.anIntArray209[local19 + 1] = local16;
			this.anIntArray209[local19 + 2] = local14;
			this.anIntArray209[local19 + 3] = local12;
			this.anIntArray209[local19 + 4] = local10;
			this.anIntArray209[local19 + 5] = local8;
			this.anIntArray209[local19 + 6] = local6;
			this.anIntArray209[local19 + 7] = local4;
		}
		this.method566();
		this.anInt816 = 256;
	}
}
