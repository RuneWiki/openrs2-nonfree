import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class313 {

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
	private int[] anIntArray512;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	private int anInt8855;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "[I")
	private int[] anIntArray513;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	private int anInt8858;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	private int anInt8859;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	private int anInt8862;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	private Class313() {
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([I)V")
	public Class313(@OriginalArg(0) int[] arg0) {
		this.anIntArray513 = new int[256];
		this.anIntArray512 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray513[local13] = arg0[local13];
		}
		this.method7592();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	public int method7587() {
		if (this.anInt8855 == 0) {
			this.method7588();
			this.anInt8855 = 256;
		}
		return this.anIntArray513[this.anInt8855 - 1];
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	private void method7588() {
		this.anInt8859 += ++this.anInt8862;
		for (@Pc(28) int local28 = 0; local28 < 256; local28++) {
			@Pc(35) int local35 = this.anIntArray512[local28];
			if ((local28 & 0x2) == 0) {
				if ((local28 & 0x1) == 0) {
					this.anInt8858 ^= this.anInt8858 << 13;
				} else {
					this.anInt8858 ^= this.anInt8858 >>> 6;
				}
			} else if ((local28 & 0x1) == 0) {
				this.anInt8858 ^= this.anInt8858 << 2;
			} else {
				this.anInt8858 ^= this.anInt8858 >>> 16;
			}
			this.anInt8858 += this.anIntArray512[local28 + 128 & 0xFF];
			@Pc(133) int local133;
			this.anIntArray512[local28] = local133 = this.anInt8859 + this.anInt8858 + this.anIntArray512[local35 >> 2 & 0xFF];
			this.anIntArray513[local28] = this.anInt8859 = this.anIntArray512[local133 >> 8 >> 2 & 0xFF] + local35;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
	public int method7589() {
		if (this.anInt8855 == 0) {
			this.method7588();
			this.anInt8855 = 256;
		}
		return this.anIntArray513[--this.anInt8855];
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	private void method7592() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(31) int local31;
		for (local31 = 0; local31 < 4; local31++) {
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local8 += this.anIntArray513[local31 + 7];
			local12 += this.anIntArray513[local31 + 5];
			local10 += this.anIntArray513[local31 + 6];
			local20 += this.anIntArray513[local31 + 1];
			local21 += this.anIntArray513[local31];
			local14 += this.anIntArray513[local31 + 4];
			local16 += this.anIntArray513[local31 + 3];
			local18 += this.anIntArray513[local31 + 2];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray512[local31] = local21;
			this.anIntArray512[local31 + 1] = local20;
			this.anIntArray512[local31 + 2] = local18;
			this.anIntArray512[local31 + 3] = local16;
			this.anIntArray512[local31 + 4] = local14;
			this.anIntArray512[local31 + 5] = local12;
			this.anIntArray512[local31 + 6] = local10;
			this.anIntArray512[local31 + 7] = local8;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local21 += this.anIntArray512[local31];
			local16 += this.anIntArray512[local31 + 3];
			local20 += this.anIntArray512[local31 + 1];
			local12 += this.anIntArray512[local31 + 5];
			local10 += this.anIntArray512[local31 + 6];
			local18 += this.anIntArray512[local31 + 2];
			local8 += this.anIntArray512[local31 + 7];
			local14 += this.anIntArray512[local31 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray512[local31] = local21;
			this.anIntArray512[local31 + 1] = local20;
			this.anIntArray512[local31 + 2] = local18;
			this.anIntArray512[local31 + 3] = local16;
			this.anIntArray512[local31 + 4] = local14;
			this.anIntArray512[local31 + 5] = local12;
			this.anIntArray512[local31 + 6] = local10;
			this.anIntArray512[local31 + 7] = local8;
		}
		this.method7588();
		this.anInt8855 = 256;
	}
}
