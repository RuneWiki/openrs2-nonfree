import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class35 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
	private int anInt607;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([I)V")
	public Class35(@OriginalArg(0) int[] arg0) {
		this.anIntArray58 = new int[256];
		this.anIntArray57 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray57[local13] = arg0[local13];
		}
		this.method546();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	private void method546() {
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
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray57[local23 + 7];
			local10 += this.anIntArray57[local23 + 6];
			local12 += this.anIntArray57[local23 + 5];
			local21 += this.anIntArray57[local23];
			local16 += this.anIntArray57[local23 + 3];
			local14 += this.anIntArray57[local23 + 4];
			local20 += this.anIntArray57[local23 + 1];
			local18 += this.anIntArray57[local23 + 2];
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
			this.anIntArray58[local23] = local21;
			this.anIntArray58[local23 + 1] = local20;
			this.anIntArray58[local23 + 2] = local18;
			this.anIntArray58[local23 + 3] = local16;
			this.anIntArray58[local23 + 4] = local14;
			this.anIntArray58[local23 + 5] = local12;
			this.anIntArray58[local23 + 6] = local10;
			this.anIntArray58[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray58[local23 + 6];
			local14 += this.anIntArray58[local23 + 4];
			local20 += this.anIntArray58[local23 + 1];
			local21 += this.anIntArray58[local23];
			local8 += this.anIntArray58[local23 + 7];
			local12 += this.anIntArray58[local23 + 5];
			local16 += this.anIntArray58[local23 + 3];
			local18 += this.anIntArray58[local23 + 2];
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray58[local23] = local21;
			this.anIntArray58[local23 + 1] = local20;
			this.anIntArray58[local23 + 2] = local18;
			this.anIntArray58[local23 + 3] = local16;
			this.anIntArray58[local23 + 4] = local14;
			this.anIntArray58[local23 + 5] = local12;
			this.anIntArray58[local23 + 6] = local10;
			this.anIntArray58[local23 + 7] = local8;
		}
		this.method550();
		this.anInt603 = 256;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)I")
	public int method548() {
		if (this.anInt603 == 0) {
			this.method550();
			this.anInt603 = 256;
		}
		return this.anIntArray57[--this.anInt603];
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)I")
	public int method549() {
		if (this.anInt603 == 0) {
			this.method550();
			this.anInt603 = 256;
		}
		return this.anIntArray57[this.anInt603 - 1];
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
	private void method550() {
		this.anInt607 += ++this.anInt602;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray58[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt608 ^= this.anInt608 << 13;
				} else {
					this.anInt608 ^= this.anInt608 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt608 ^= this.anInt608 << 2;
			} else {
				this.anInt608 ^= this.anInt608 >>> 16;
			}
			this.anInt608 += this.anIntArray58[local19 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray58[local19] = local118 = this.anInt607 + this.anInt608 + this.anIntArray58[local26 >> 2 & 0xFF];
			this.anIntArray57[local19] = this.anInt607 = this.anIntArray58[local118 >> 8 >> 2 & 0xFF] + local26;
		}
	}
}
