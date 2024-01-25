import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class110 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	private int anInt3226;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	private int anInt3228;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	private int anInt3229;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	private int anInt3236;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	private Class110() {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([I)V")
	public Class110(@OriginalArg(0) int[] arg0) {
		this.anIntArray336 = new int[256];
		this.anIntArray335 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray335[local13] = arg0[local13];
		}
		this.method2868();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	private void method2866() {
		this.anInt3229 += ++this.anInt3236;
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(28) int local28 = this.anIntArray336[local22];
			if ((local22 & 0x2) == 0) {
				if ((local22 & 0x1) == 0) {
					this.anInt3226 ^= this.anInt3226 << 13;
				} else {
					this.anInt3226 ^= this.anInt3226 >>> 6;
				}
			} else if ((local22 & 0x1) == 0) {
				this.anInt3226 ^= this.anInt3226 << 2;
			} else {
				this.anInt3226 ^= this.anInt3226 >>> 16;
			}
			this.anInt3226 += this.anIntArray336[local22 + 128 & 0xFF];
			@Pc(111) int local111;
			this.anIntArray336[local22] = local111 = this.anIntArray336[local28 >> 2 & 0xFF] + this.anInt3226 + this.anInt3229;
			this.anIntArray335[local22] = this.anInt3229 = this.anIntArray336[local111 >> 8 >> 2 & 0xFF] + local28;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	private void method2868() {
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
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray335[local29 + 3];
			local16 += this.anIntArray335[local29 + 6];
			local27 += this.anIntArray335[local29];
			local20 += this.anIntArray335[local29 + 4];
			local18 += this.anIntArray335[local29 + 5];
			local14 += this.anIntArray335[local29 + 7];
			local24 += this.anIntArray335[local29 + 2];
			local26 += this.anIntArray335[local29 + 1];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
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
			this.anIntArray336[local29] = local27;
			this.anIntArray336[local29 + 1] = local26;
			this.anIntArray336[local29 + 2] = local24;
			this.anIntArray336[local29 + 3] = local22;
			this.anIntArray336[local29 + 4] = local20;
			this.anIntArray336[local29 + 5] = local18;
			this.anIntArray336[local29 + 6] = local16;
			this.anIntArray336[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local26 += this.anIntArray336[local29 + 1];
			local16 += this.anIntArray336[local29 + 6];
			local22 += this.anIntArray336[local29 + 3];
			local27 += this.anIntArray336[local29];
			local14 += this.anIntArray336[local29 + 7];
			local20 += this.anIntArray336[local29 + 4];
			local18 += this.anIntArray336[local29 + 5];
			local24 += this.anIntArray336[local29 + 2];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray336[local29] = local27;
			this.anIntArray336[local29 + 1] = local26;
			this.anIntArray336[local29 + 2] = local24;
			this.anIntArray336[local29 + 3] = local22;
			this.anIntArray336[local29 + 4] = local20;
			this.anIntArray336[local29 + 5] = local18;
			this.anIntArray336[local29 + 6] = local16;
			this.anIntArray336[local29 + 7] = local14;
		}
		this.method2866();
		this.anInt3228 = 256;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)I")
	public int method2871() {
		if (this.anInt3228-- == 0) {
			this.method2866();
			this.anInt3228 = 255;
		}
		return this.anIntArray335[this.anInt3228];
	}
}
