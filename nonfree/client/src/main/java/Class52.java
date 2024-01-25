import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class52 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	private int anInt1856;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	private int anInt1857;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	private int anInt1860;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	private int anInt1869;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	private Class52() {
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([I)V")
	public Class52(@OriginalArg(0) int[] arg0) {
		this.anIntArray145 = new int[256];
		this.anIntArray146 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray145[local13] = arg0[local13];
		}
		this.method1771();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	private void method1771() {
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
			local18 += local16;
			local14 += local20;
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray145[local23 + 7];
			local21 += this.anIntArray145[local23];
			local14 += this.anIntArray145[local23 + 4];
			local12 += this.anIntArray145[local23 + 5];
			local10 += this.anIntArray145[local23 + 6];
			local18 += this.anIntArray145[local23 + 2];
			local20 += this.anIntArray145[local23 + 1];
			local16 += this.anIntArray145[local23 + 3];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray146[local23] = local21;
			this.anIntArray146[local23 + 1] = local20;
			this.anIntArray146[local23 + 2] = local18;
			this.anIntArray146[local23 + 3] = local16;
			this.anIntArray146[local23 + 4] = local14;
			this.anIntArray146[local23 + 5] = local12;
			this.anIntArray146[local23 + 6] = local10;
			this.anIntArray146[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray146[local23 + 3];
			local18 += this.anIntArray146[local23 + 2];
			local8 += this.anIntArray146[local23 + 7];
			local12 += this.anIntArray146[local23 + 5];
			local14 += this.anIntArray146[local23 + 4];
			local21 += this.anIntArray146[local23];
			local20 += this.anIntArray146[local23 + 1];
			local10 += this.anIntArray146[local23 + 6];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray146[local23] = local21;
			this.anIntArray146[local23 + 1] = local20;
			this.anIntArray146[local23 + 2] = local18;
			this.anIntArray146[local23 + 3] = local16;
			this.anIntArray146[local23 + 4] = local14;
			this.anIntArray146[local23 + 5] = local12;
			this.anIntArray146[local23 + 6] = local10;
			this.anIntArray146[local23 + 7] = local8;
		}
		this.method1773();
		this.anInt1856 = 256;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	private void method1773() {
		this.anInt1857 += ++this.anInt1869;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray146[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt1860 ^= this.anInt1860 << 13;
				} else {
					this.anInt1860 ^= this.anInt1860 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt1860 ^= this.anInt1860 << 2;
			} else {
				this.anInt1860 ^= this.anInt1860 >>> 16;
			}
			this.anInt1860 += this.anIntArray146[local23 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray146[local23] = local126 = this.anInt1860 + this.anIntArray146[local30 >> 2 & 0xFF] + this.anInt1857;
			this.anIntArray145[local23] = this.anInt1857 = local30 + this.anIntArray146[local126 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I")
	public int method1775() {
		if (this.anInt1856 == 0) {
			this.method1773();
			this.anInt1856 = 256;
		}
		return this.anIntArray145[this.anInt1856 - 1];
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)I")
	public int method1780() {
		if (this.anInt1856 == 0) {
			this.method1773();
			this.anInt1856 = 256;
		}
		return this.anIntArray145[--this.anInt1856];
	}
}
