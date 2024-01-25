import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class52 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	private int anInt1522;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	private int anInt1524;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
	private int anInt1529;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
	private int anInt1530;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	private Class52() {
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "([I)V")
	public Class52(@OriginalArg(0) int[] arg0) {
		this.anIntArray118 = new int[256];
		this.anIntArray117 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray118[local13] = arg0[local13];
		}
		this.method1360();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	private void method1360() {
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
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
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
			local25 += local24;
			local22 += local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local22 += this.anIntArray118[local27 + 2];
			local12 += this.anIntArray118[local27 + 7];
			local16 += this.anIntArray118[local27 + 5];
			local18 += this.anIntArray118[local27 + 4];
			local14 += this.anIntArray118[local27 + 6];
			local20 += this.anIntArray118[local27 + 3];
			local25 += this.anIntArray118[local27];
			local24 += this.anIntArray118[local27 + 1];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
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
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray117[local27] = local25;
			this.anIntArray117[local27 + 1] = local24;
			this.anIntArray117[local27 + 2] = local22;
			this.anIntArray117[local27 + 3] = local20;
			this.anIntArray117[local27 + 4] = local18;
			this.anIntArray117[local27 + 5] = local16;
			this.anIntArray117[local27 + 6] = local14;
			this.anIntArray117[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local18 += this.anIntArray117[local27 + 4];
			local20 += this.anIntArray117[local27 + 3];
			local24 += this.anIntArray117[local27 + 1];
			local22 += this.anIntArray117[local27 + 2];
			local14 += this.anIntArray117[local27 + 6];
			local25 += this.anIntArray117[local27];
			local12 += this.anIntArray117[local27 + 7];
			local16 += this.anIntArray117[local27 + 5];
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
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray117[local27] = local25;
			this.anIntArray117[local27 + 1] = local24;
			this.anIntArray117[local27 + 2] = local22;
			this.anIntArray117[local27 + 3] = local20;
			this.anIntArray117[local27 + 4] = local18;
			this.anIntArray117[local27 + 5] = local16;
			this.anIntArray117[local27 + 6] = local14;
			this.anIntArray117[local27 + 7] = local12;
		}
		this.method1363();
		this.anInt1530 = 256;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)I")
	public int method1362() {
		if (this.anInt1530 == 0) {
			this.method1363();
			this.anInt1530 = 256;
		}
		return this.anIntArray118[--this.anInt1530];
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
	private void method1363() {
		this.anInt1522 += ++this.anInt1529;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray117[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt1524 ^= this.anInt1524 << 13;
				} else {
					this.anInt1524 ^= this.anInt1524 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt1524 ^= this.anInt1524 << 2;
			} else {
				this.anInt1524 ^= this.anInt1524 >>> 16;
			}
			this.anInt1524 += this.anIntArray117[local25 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray117[local25] = local125 = this.anInt1522 + this.anIntArray117[local32 >> 2 & 0xFF] + this.anInt1524;
			this.anIntArray118[local25] = this.anInt1522 = local32 + this.anIntArray117[local125 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)I")
	public int method1364() {
		if (this.anInt1530 == 0) {
			this.method1363();
			this.anInt1530 = 256;
		}
		return this.anIntArray118[this.anInt1530 - 1];
	}
}
