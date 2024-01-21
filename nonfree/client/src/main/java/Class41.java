import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class41 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	private int anInt2514;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	private final int[] anIntArray278 = new int[256];

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	private int anInt2516;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
	private final int[] anIntArray279 = new int[256];

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	private int anInt2521;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([I)V")
	public Class41(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray278[local11] = arg0[local11];
		}
		this.method1994();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	private void method1988() {
		this.anInt2516 += ++this.anInt2514;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(30) int local30 = this.anIntArray279[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt2520 ^= this.anInt2520 << 13;
				} else {
					this.anInt2520 ^= this.anInt2520 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt2520 ^= this.anInt2520 << 2;
			} else {
				this.anInt2520 ^= this.anInt2520 >>> 16;
			}
			this.anInt2520 += this.anIntArray279[local24 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray279[local24] = local116 = this.anInt2516 + this.anInt2520 + this.anIntArray279[local30 >> 2 & 0xFF];
			this.anIntArray278[local24] = this.anInt2516 = this.anIntArray279[local116 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public int method1989() {
		if (this.anInt2521-- == 0) {
			this.method1988();
			this.anInt2521 = 255;
		}
		return this.anIntArray278[this.anInt2521];
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	private void method1994() {
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21;
		for (local21 = 0; local21 < 4; local21++) {
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 << 10;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local6 += local12;
			local8 += local6;
			local8 ^= local6 << 8;
			local19 += local10;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local18 += local8;
			local19 += local18;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local14 += this.anIntArray278[local21 + 3];
			local19 += this.anIntArray278[local21];
			local18 += this.anIntArray278[local21 + 1];
			local8 += this.anIntArray278[local21 + 6];
			local16 += this.anIntArray278[local21 + 2];
			local10 += this.anIntArray278[local21 + 5];
			local6 += this.anIntArray278[local21 + 7];
			local12 += this.anIntArray278[local21 + 4];
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 << 10;
			local10 += local8;
			local6 += local12;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
			this.anIntArray279[local21] = local19;
			this.anIntArray279[local21 + 1] = local18;
			this.anIntArray279[local21 + 2] = local16;
			this.anIntArray279[local21 + 3] = local14;
			this.anIntArray279[local21 + 4] = local12;
			this.anIntArray279[local21 + 5] = local10;
			this.anIntArray279[local21 + 6] = local8;
			this.anIntArray279[local21 + 7] = local6;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local12 += this.anIntArray279[local21 + 4];
			local10 += this.anIntArray279[local21 + 5];
			local16 += this.anIntArray279[local21 + 2];
			local6 += this.anIntArray279[local21 + 7];
			local19 += this.anIntArray279[local21];
			local8 += this.anIntArray279[local21 + 6];
			local14 += this.anIntArray279[local21 + 3];
			local18 += this.anIntArray279[local21 + 1];
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 << 10;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local6 += local12;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
			this.anIntArray279[local21] = local19;
			this.anIntArray279[local21 + 1] = local18;
			this.anIntArray279[local21 + 2] = local16;
			this.anIntArray279[local21 + 3] = local14;
			this.anIntArray279[local21 + 4] = local12;
			this.anIntArray279[local21 + 5] = local10;
			this.anIntArray279[local21 + 6] = local8;
			this.anIntArray279[local21 + 7] = local6;
		}
		this.method1988();
		this.anInt2521 = 256;
	}
}
