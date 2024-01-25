import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class251 {

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	private int anInt6271;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	private int anInt6272;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	private int anInt6273;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	private int anInt6277;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	private Class251() {
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "([I)V")
	public Class251(@OriginalArg(0) int[] arg0) {
		this.anIntArray350 = new int[256];
		this.anIntArray349 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray350[local13] = arg0[local13];
		}
		this.method5559();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
	private void method5559() {
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
			local25 ^= local24 << 11;
			local24 += local22;
			local20 += local25;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray350[local27 + 6];
			local12 += this.anIntArray350[local27 + 7];
			local24 += this.anIntArray350[local27 + 1];
			local18 += this.anIntArray350[local27 + 4];
			local20 += this.anIntArray350[local27 + 3];
			local25 += this.anIntArray350[local27];
			local22 += this.anIntArray350[local27 + 2];
			local16 += this.anIntArray350[local27 + 5];
			local25 ^= local24 << 11;
			local24 += local22;
			local20 += local25;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray349[local27] = local25;
			this.anIntArray349[local27 + 1] = local24;
			this.anIntArray349[local27 + 2] = local22;
			this.anIntArray349[local27 + 3] = local20;
			this.anIntArray349[local27 + 4] = local18;
			this.anIntArray349[local27 + 5] = local16;
			this.anIntArray349[local27 + 6] = local14;
			this.anIntArray349[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local22 += this.anIntArray349[local27 + 2];
			local14 += this.anIntArray349[local27 + 6];
			local20 += this.anIntArray349[local27 + 3];
			local24 += this.anIntArray349[local27 + 1];
			local25 += this.anIntArray349[local27];
			local16 += this.anIntArray349[local27 + 5];
			local12 += this.anIntArray349[local27 + 7];
			local18 += this.anIntArray349[local27 + 4];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
			this.anIntArray349[local27] = local25;
			this.anIntArray349[local27 + 1] = local24;
			this.anIntArray349[local27 + 2] = local22;
			this.anIntArray349[local27 + 3] = local20;
			this.anIntArray349[local27 + 4] = local18;
			this.anIntArray349[local27 + 5] = local16;
			this.anIntArray349[local27 + 6] = local14;
			this.anIntArray349[local27 + 7] = local12;
		}
		this.method5563();
		this.anInt6271 = 256;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	public int method5561() {
		if (this.anInt6271 == 0) {
			this.method5563();
			this.anInt6271 = 256;
		}
		return this.anIntArray350[this.anInt6271 - 1];
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
	public int method5562() {
		if (this.anInt6271 == 0) {
			this.method5563();
			this.anInt6271 = 256;
		}
		return this.anIntArray350[--this.anInt6271];
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	private void method5563() {
		this.anInt6273 += ++this.anInt6272;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray349[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt6277 ^= this.anInt6277 << 13;
				} else {
					this.anInt6277 ^= this.anInt6277 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt6277 ^= this.anInt6277 << 2;
			} else {
				this.anInt6277 ^= this.anInt6277 >>> 16;
			}
			this.anInt6277 += this.anIntArray349[local23 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray349[local23] = local123 = this.anIntArray349[local30 >> 2 & 0xFF] + this.anInt6277 + this.anInt6273;
			this.anIntArray350[local23] = this.anInt6273 = local30 + this.anIntArray349[local123 >> 8 >> 2 & 0xFF];
		}
	}
}
