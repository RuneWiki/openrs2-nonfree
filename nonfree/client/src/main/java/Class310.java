import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class310 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
	private int anInt8767;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "[I")
	private int[] anIntArray604;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	private int anInt8769;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "[I")
	private int[] anIntArray605;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
	private int anInt8773;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
	private int anInt8774;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	private Class310() {
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "([I)V")
	public Class310(@OriginalArg(0) int[] arg0) {
		this.anIntArray605 = new int[256];
		this.anIntArray604 = new int[256];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray605[local11] = arg0[local11];
		}
		this.method7343();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)I")
	public int method7340() {
		if (this.anInt8774 == 0) {
			this.method7341();
			this.anInt8774 = 256;
		}
		return this.anIntArray605[this.anInt8774 - 1];
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(Z)V")
	private void method7341() {
		this.anInt8773 += ++this.anInt8769;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(23) int local23 = this.anIntArray604[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt8767 ^= this.anInt8767 << 13;
				} else {
					this.anInt8767 ^= this.anInt8767 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt8767 ^= this.anInt8767 << 2;
			} else {
				this.anInt8767 ^= this.anInt8767 >>> 16;
			}
			this.anInt8767 += this.anIntArray604[local17 + 128 & 0xFF];
			@Pc(110) int local110;
			this.anIntArray604[local17] = local110 = this.anInt8773 + this.anIntArray604[local23 >> 2 & 0xFF] + this.anInt8767;
			this.anIntArray605[local17] = this.anInt8773 = local23 + this.anIntArray604[local110 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
	private void method7343() {
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
			local22 += local27;
			local26 += local24;
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
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local18 += this.anIntArray605[local29 + 5];
			local20 += this.anIntArray605[local29 + 4];
			local22 += this.anIntArray605[local29 + 3];
			local26 += this.anIntArray605[local29 + 1];
			local16 += this.anIntArray605[local29 + 6];
			local24 += this.anIntArray605[local29 + 2];
			local14 += this.anIntArray605[local29 + 7];
			local27 += this.anIntArray605[local29];
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
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray604[local29] = local27;
			this.anIntArray604[local29 + 1] = local26;
			this.anIntArray604[local29 + 2] = local24;
			this.anIntArray604[local29 + 3] = local22;
			this.anIntArray604[local29 + 4] = local20;
			this.anIntArray604[local29 + 5] = local18;
			this.anIntArray604[local29 + 6] = local16;
			this.anIntArray604[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray604[local29 + 6];
			local27 += this.anIntArray604[local29];
			local14 += this.anIntArray604[local29 + 7];
			local22 += this.anIntArray604[local29 + 3];
			local18 += this.anIntArray604[local29 + 5];
			local26 += this.anIntArray604[local29 + 1];
			local24 += this.anIntArray604[local29 + 2];
			local20 += this.anIntArray604[local29 + 4];
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
			local24 += local14;
			local27 += local26;
			this.anIntArray604[local29] = local27;
			this.anIntArray604[local29 + 1] = local26;
			this.anIntArray604[local29 + 2] = local24;
			this.anIntArray604[local29 + 3] = local22;
			this.anIntArray604[local29 + 4] = local20;
			this.anIntArray604[local29 + 5] = local18;
			this.anIntArray604[local29 + 6] = local16;
			this.anIntArray604[local29 + 7] = local14;
		}
		this.method7341();
		this.anInt8774 = 256;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I")
	public int method7344() {
		if (this.anInt8774 == 0) {
			this.method7341();
			this.anInt8774 = 256;
		}
		return this.anIntArray605[--this.anInt8774];
	}
}
