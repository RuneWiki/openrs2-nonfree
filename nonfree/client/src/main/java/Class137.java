import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class137 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
	private int anInt3788;

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
	private int anInt3789;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
	private int anInt3791;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	private int anInt3793;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "[I")
	private int[] anIntArray273;

	static {
		new Class267("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	private Class137() {
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([I)V")
	public Class137(@OriginalArg(0) int[] arg0) {
		this.anIntArray273 = new int[256];
		this.anIntArray272 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray272[local13] = arg0[local13];
		}
		this.method3121();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	private void method3121() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
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
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray272[local27 + 4];
			local12 += this.anIntArray272[local27 + 5];
			local21 += this.anIntArray272[local27];
			local10 += this.anIntArray272[local27 + 6];
			local16 += this.anIntArray272[local27 + 3];
			local18 += this.anIntArray272[local27 + 2];
			local20 += this.anIntArray272[local27 + 1];
			local8 += this.anIntArray272[local27 + 7];
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
			local10 += local16;
			local14 += local12;
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
			local18 += local8;
			local21 += local20;
			this.anIntArray273[local27] = local21;
			this.anIntArray273[local27 + 1] = local20;
			this.anIntArray273[local27 + 2] = local18;
			this.anIntArray273[local27 + 3] = local16;
			this.anIntArray273[local27 + 4] = local14;
			this.anIntArray273[local27 + 5] = local12;
			this.anIntArray273[local27 + 6] = local10;
			this.anIntArray273[local27 + 7] = local8;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local10 += this.anIntArray273[local27 + 6];
			local14 += this.anIntArray273[local27 + 4];
			local12 += this.anIntArray273[local27 + 5];
			local8 += this.anIntArray273[local27 + 7];
			local18 += this.anIntArray273[local27 + 2];
			local16 += this.anIntArray273[local27 + 3];
			local21 += this.anIntArray273[local27];
			local20 += this.anIntArray273[local27 + 1];
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray273[local27] = local21;
			this.anIntArray273[local27 + 1] = local20;
			this.anIntArray273[local27 + 2] = local18;
			this.anIntArray273[local27 + 3] = local16;
			this.anIntArray273[local27 + 4] = local14;
			this.anIntArray273[local27 + 5] = local12;
			this.anIntArray273[local27 + 6] = local10;
			this.anIntArray273[local27 + 7] = local8;
		}
		this.method3122();
		this.anInt3791 = 256;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	private void method3122() {
		this.anInt3793 += ++this.anInt3788;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray273[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3789 ^= this.anInt3789 << 13;
				} else {
					this.anInt3789 ^= this.anInt3789 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3789 ^= this.anInt3789 << 2;
			} else {
				this.anInt3789 ^= this.anInt3789 >>> 16;
			}
			this.anInt3789 += this.anIntArray273[local19 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray273[local19] = local116 = this.anInt3793 + this.anIntArray273[local26 >> 2 & 0xFF] + this.anInt3789;
			this.anIntArray272[local19] = this.anInt3793 = local26 + this.anIntArray273[local116 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)I")
	public int method3125() {
		if (this.anInt3791 == 0) {
			this.method3122();
			this.anInt3791 = 256;
		}
		return this.anIntArray272[this.anInt3791 - 1];
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)I")
	public int method3127() {
		if (this.anInt3791 == 0) {
			this.method3122();
			this.anInt3791 = 256;
		}
		return this.anIntArray272[--this.anInt3791];
	}
}
