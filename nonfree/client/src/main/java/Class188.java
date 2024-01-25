import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class188 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	private int anInt5087;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	private int anInt5090;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private int anInt5092;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	private int anInt5099;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	private Class188() {
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([I)V")
	public Class188(@OriginalArg(0) int[] arg0) {
		this.anIntArray381 = new int[256];
		this.anIntArray382 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray381[local13] = arg0[local13];
		}
		this.method4073();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	private void method4064() {
		this.anInt5092 += ++this.anInt5090;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray382[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt5087 ^= this.anInt5087 << 13;
				} else {
					this.anInt5087 ^= this.anInt5087 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt5087 ^= this.anInt5087 << 2;
			} else {
				this.anInt5087 ^= this.anInt5087 >>> 16;
			}
			this.anInt5087 += this.anIntArray382[local27 + 128 & 0xFF];
			@Pc(129) int local129;
			this.anIntArray382[local27] = local129 = this.anInt5092 + this.anIntArray382[local34 >> 2 & 0xFF] + this.anInt5087;
			this.anIntArray381[local27] = this.anInt5092 = this.anIntArray382[local129 >> 8 >> 2 & 0xFF] + local34;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I")
	public int method4065() {
		if (this.anInt5099 == 0) {
			this.method4064();
			this.anInt5099 = 256;
		}
		return this.anIntArray381[this.anInt5099 - 1];
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)I")
	public int method4071() {
		if (this.anInt5099 == 0) {
			this.method4064();
			this.anInt5099 = 256;
		}
		return this.anIntArray381[--this.anInt5099];
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	private void method4073() {
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray381[local23 + 4];
			local18 += this.anIntArray381[local23 + 2];
			local16 += this.anIntArray381[local23 + 3];
			local20 += this.anIntArray381[local23 + 1];
			local8 += this.anIntArray381[local23 + 7];
			local21 += this.anIntArray381[local23];
			local12 += this.anIntArray381[local23 + 5];
			local10 += this.anIntArray381[local23 + 6];
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray382[local23] = local21;
			this.anIntArray382[local23 + 1] = local20;
			this.anIntArray382[local23 + 2] = local18;
			this.anIntArray382[local23 + 3] = local16;
			this.anIntArray382[local23 + 4] = local14;
			this.anIntArray382[local23 + 5] = local12;
			this.anIntArray382[local23 + 6] = local10;
			this.anIntArray382[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray382[local23];
			local20 += this.anIntArray382[local23 + 1];
			local14 += this.anIntArray382[local23 + 4];
			local8 += this.anIntArray382[local23 + 7];
			local18 += this.anIntArray382[local23 + 2];
			local16 += this.anIntArray382[local23 + 3];
			local10 += this.anIntArray382[local23 + 6];
			local12 += this.anIntArray382[local23 + 5];
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
			this.anIntArray382[local23] = local21;
			this.anIntArray382[local23 + 1] = local20;
			this.anIntArray382[local23 + 2] = local18;
			this.anIntArray382[local23 + 3] = local16;
			this.anIntArray382[local23 + 4] = local14;
			this.anIntArray382[local23 + 5] = local12;
			this.anIntArray382[local23 + 6] = local10;
			this.anIntArray382[local23 + 7] = local8;
		}
		this.method4064();
		this.anInt5099 = 256;
	}
}
