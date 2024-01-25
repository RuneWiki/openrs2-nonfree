import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class15 {

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "([I)V")
	public Class15(@OriginalArg(0) int[] arg0) {
		this.anIntArray13 = new int[256];
		this.anIntArray12 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray13[local13] = arg0[local13];
		}
		this.method465();
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
	private void method463() {
		this.anInt452 += ++this.anInt450;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray12[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt447 ^= this.anInt447 << 13;
				} else {
					this.anInt447 ^= this.anInt447 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt447 ^= this.anInt447 << 2;
			} else {
				this.anInt447 ^= this.anInt447 >>> 16;
			}
			this.anInt447 += this.anIntArray12[local23 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray12[local23] = local126 = this.anIntArray12[local30 >> 2 & 0xFF] + this.anInt447 + this.anInt452;
			this.anIntArray13[local23] = this.anInt452 = this.anIntArray12[local126 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
	private void method465() {
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray13[local23 + 5];
			local8 += this.anIntArray13[local23 + 7];
			local18 += this.anIntArray13[local23 + 2];
			local16 += this.anIntArray13[local23 + 3];
			local14 += this.anIntArray13[local23 + 4];
			local20 += this.anIntArray13[local23 + 1];
			local21 += this.anIntArray13[local23];
			local10 += this.anIntArray13[local23 + 6];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray12[local23] = local21;
			this.anIntArray12[local23 + 1] = local20;
			this.anIntArray12[local23 + 2] = local18;
			this.anIntArray12[local23 + 3] = local16;
			this.anIntArray12[local23 + 4] = local14;
			this.anIntArray12[local23 + 5] = local12;
			this.anIntArray12[local23 + 6] = local10;
			this.anIntArray12[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray12[local23 + 5];
			local21 += this.anIntArray12[local23];
			local14 += this.anIntArray12[local23 + 4];
			local20 += this.anIntArray12[local23 + 1];
			local10 += this.anIntArray12[local23 + 6];
			local8 += this.anIntArray12[local23 + 7];
			local18 += this.anIntArray12[local23 + 2];
			local16 += this.anIntArray12[local23 + 3];
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
			local21 += local20;
			local18 += local8;
			this.anIntArray12[local23] = local21;
			this.anIntArray12[local23 + 1] = local20;
			this.anIntArray12[local23 + 2] = local18;
			this.anIntArray12[local23 + 3] = local16;
			this.anIntArray12[local23 + 4] = local14;
			this.anIntArray12[local23 + 5] = local12;
			this.anIntArray12[local23 + 6] = local10;
			this.anIntArray12[local23 + 7] = local8;
		}
		this.method463();
		this.anInt444 = 256;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)I")
	public int method466() {
		if (this.anInt444 == 0) {
			this.method463();
			this.anInt444 = 256;
		}
		return this.anIntArray13[--this.anInt444];
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)I")
	public int method468() {
		if (this.anInt444 == 0) {
			this.method463();
			this.anInt444 = 256;
		}
		return this.anIntArray13[this.anInt444 - 1];
	}
}
