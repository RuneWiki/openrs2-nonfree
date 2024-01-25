import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class47 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	private int anInt1139;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	private int anInt1142;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	private int anInt1143;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	private Class47() {
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([I)V")
	public Class47(@OriginalArg(0) int[] arg0) {
		this.anIntArray53 = new int[256];
		this.anIntArray54 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray54[local13] = arg0[local13];
		}
		this.method993();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	public int method990() {
		if (this.anInt1142 == 0) {
			this.method992();
			this.anInt1142 = 256;
		}
		return this.anIntArray54[--this.anInt1142];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	private void method992() {
		this.anInt1138 += ++this.anInt1139;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray53[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt1143 ^= this.anInt1143 << 13;
				} else {
					this.anInt1143 ^= this.anInt1143 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt1143 ^= this.anInt1143 << 2;
			} else {
				this.anInt1143 ^= this.anInt1143 >>> 16;
			}
			this.anInt1143 += this.anIntArray53[local25 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray53[local25] = local119 = this.anIntArray53[local32 >> 2 & 0xFF] + this.anInt1143 + this.anInt1138;
			this.anIntArray54[local25] = this.anInt1138 = local32 + this.anIntArray53[local119 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	private void method993() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
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
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray54[local23 + 5];
			local10 += this.anIntArray54[local23 + 6];
			local21 += this.anIntArray54[local23];
			local8 += this.anIntArray54[local23 + 7];
			local14 += this.anIntArray54[local23 + 4];
			local20 += this.anIntArray54[local23 + 1];
			local16 += this.anIntArray54[local23 + 3];
			local18 += this.anIntArray54[local23 + 2];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
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
			this.anIntArray53[local23] = local21;
			this.anIntArray53[local23 + 1] = local20;
			this.anIntArray53[local23 + 2] = local18;
			this.anIntArray53[local23 + 3] = local16;
			this.anIntArray53[local23 + 4] = local14;
			this.anIntArray53[local23 + 5] = local12;
			this.anIntArray53[local23 + 6] = local10;
			this.anIntArray53[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray53[local23 + 5];
			local10 += this.anIntArray53[local23 + 6];
			local8 += this.anIntArray53[local23 + 7];
			local14 += this.anIntArray53[local23 + 4];
			local21 += this.anIntArray53[local23];
			local16 += this.anIntArray53[local23 + 3];
			local18 += this.anIntArray53[local23 + 2];
			local20 += this.anIntArray53[local23 + 1];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
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
			local21 += local20;
			local18 += local8;
			this.anIntArray53[local23] = local21;
			this.anIntArray53[local23 + 1] = local20;
			this.anIntArray53[local23 + 2] = local18;
			this.anIntArray53[local23 + 3] = local16;
			this.anIntArray53[local23 + 4] = local14;
			this.anIntArray53[local23 + 5] = local12;
			this.anIntArray53[local23 + 6] = local10;
			this.anIntArray53[local23 + 7] = local8;
		}
		this.method992();
		this.anInt1142 = 256;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I")
	public int method994() {
		if (this.anInt1142 == 0) {
			this.method992();
			this.anInt1142 = 256;
		}
		return this.anIntArray54[this.anInt1142 - 1];
	}
}
