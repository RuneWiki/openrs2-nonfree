import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class314 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	private int anInt8442;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
	private int[] anIntArray624;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	private int anInt8446;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	private int anInt8448;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
	private int[] anIntArray625;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	private int anInt8451;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	private Class314() {
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([I)V")
	public Class314(@OriginalArg(0) int[] arg0) {
		this.anIntArray625 = new int[256];
		this.anIntArray624 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray624[local13] = arg0[local13];
		}
		this.method7268();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	private void method7268() {
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local26 += this.anIntArray624[local29 + 1];
			local18 += this.anIntArray624[local29 + 5];
			local14 += this.anIntArray624[local29 + 7];
			local16 += this.anIntArray624[local29 + 6];
			local22 += this.anIntArray624[local29 + 3];
			local20 += this.anIntArray624[local29 + 4];
			local24 += this.anIntArray624[local29 + 2];
			local27 += this.anIntArray624[local29];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray625[local29] = local27;
			this.anIntArray625[local29 + 1] = local26;
			this.anIntArray625[local29 + 2] = local24;
			this.anIntArray625[local29 + 3] = local22;
			this.anIntArray625[local29 + 4] = local20;
			this.anIntArray625[local29 + 5] = local18;
			this.anIntArray625[local29 + 6] = local16;
			this.anIntArray625[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray625[local29 + 6];
			local22 += this.anIntArray625[local29 + 3];
			local18 += this.anIntArray625[local29 + 5];
			local20 += this.anIntArray625[local29 + 4];
			local26 += this.anIntArray625[local29 + 1];
			local24 += this.anIntArray625[local29 + 2];
			local14 += this.anIntArray625[local29 + 7];
			local27 += this.anIntArray625[local29];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray625[local29] = local27;
			this.anIntArray625[local29 + 1] = local26;
			this.anIntArray625[local29 + 2] = local24;
			this.anIntArray625[local29 + 3] = local22;
			this.anIntArray625[local29 + 4] = local20;
			this.anIntArray625[local29 + 5] = local18;
			this.anIntArray625[local29 + 6] = local16;
			this.anIntArray625[local29 + 7] = local14;
		}
		this.method7269();
		this.anInt8446 = 256;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	private void method7269() {
		this.anInt8442 += ++this.anInt8451;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(29) int local29 = this.anIntArray625[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt8448 ^= this.anInt8448 << 13;
				} else {
					this.anInt8448 ^= this.anInt8448 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt8448 ^= this.anInt8448 << 2;
			} else {
				this.anInt8448 ^= this.anInt8448 >>> 16;
			}
			this.anInt8448 += this.anIntArray625[local23 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray625[local23] = local115 = this.anIntArray625[local29 >> 2 & 0xFF] + this.anInt8448 + this.anInt8442;
			this.anIntArray624[local23] = this.anInt8442 = this.anIntArray625[local115 >> 8 >> 2 & 0xFF] + local29;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I")
	public int method7270() {
		if (this.anInt8446 == 0) {
			this.method7269();
			this.anInt8446 = 256;
		}
		return this.anIntArray624[this.anInt8446 - 1];
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I")
	public int method7271() {
		if (this.anInt8446 == 0) {
			this.method7269();
			this.anInt8446 = 256;
		}
		return this.anIntArray624[--this.anInt8446];
	}
}
