import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class394 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	private int anInt11166;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
	private int anInt11167;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	private int anInt11168;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
	private int[] anIntArray825;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
	private int anInt11175;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "[I")
	private int[] anIntArray826;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	private Class394() {
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "([I)V")
	public Class394(@OriginalArg(0) int[] arg0) {
		this.anIntArray825 = new int[256];
		this.anIntArray826 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray826[local13] = arg0[local13];
		}
		this.method9284();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	private void method9277() {
		this.anInt11166 += ++this.anInt11175;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray825[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt11168 ^= this.anInt11168 << 13;
				} else {
					this.anInt11168 ^= this.anInt11168 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt11168 ^= this.anInt11168 << 2;
			} else {
				this.anInt11168 ^= this.anInt11168 >>> 16;
			}
			this.anInt11168 += this.anIntArray825[local23 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray825[local23] = local120 = this.anIntArray825[local30 >> 2 & 0xFF] + this.anInt11168 + this.anInt11166;
			this.anIntArray826[local23] = this.anInt11166 = this.anIntArray825[local120 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)I")
	public int method9279() {
		if (this.anInt11167 == 0) {
			this.method9277();
			this.anInt11167 = 256;
		}
		return this.anIntArray826[--this.anInt11167];
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)I")
	public int method9281() {
		if (this.anInt11167 == 0) {
			this.method9277();
			this.anInt11167 = 256;
		}
		return this.anIntArray826[this.anInt11167 - 1];
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	private void method9284() {
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray826[local23 + 4];
			local10 += this.anIntArray826[local23 + 6];
			local8 += this.anIntArray826[local23 + 7];
			local12 += this.anIntArray826[local23 + 5];
			local18 += this.anIntArray826[local23 + 2];
			local16 += this.anIntArray826[local23 + 3];
			local20 += this.anIntArray826[local23 + 1];
			local21 += this.anIntArray826[local23];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
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
			this.anIntArray825[local23] = local21;
			this.anIntArray825[local23 + 1] = local20;
			this.anIntArray825[local23 + 2] = local18;
			this.anIntArray825[local23 + 3] = local16;
			this.anIntArray825[local23 + 4] = local14;
			this.anIntArray825[local23 + 5] = local12;
			this.anIntArray825[local23 + 6] = local10;
			this.anIntArray825[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray825[local23 + 2];
			local21 += this.anIntArray825[local23];
			local16 += this.anIntArray825[local23 + 3];
			local10 += this.anIntArray825[local23 + 6];
			local14 += this.anIntArray825[local23 + 4];
			local20 += this.anIntArray825[local23 + 1];
			local12 += this.anIntArray825[local23 + 5];
			local8 += this.anIntArray825[local23 + 7];
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
			this.anIntArray825[local23] = local21;
			this.anIntArray825[local23 + 1] = local20;
			this.anIntArray825[local23 + 2] = local18;
			this.anIntArray825[local23 + 3] = local16;
			this.anIntArray825[local23 + 4] = local14;
			this.anIntArray825[local23 + 5] = local12;
			this.anIntArray825[local23 + 6] = local10;
			this.anIntArray825[local23 + 7] = local8;
		}
		this.method9277();
		this.anInt11167 = 256;
	}
}
