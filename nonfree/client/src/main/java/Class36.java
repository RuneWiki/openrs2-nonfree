import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class36 {

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	private int anInt1196;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	private int anInt1197;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	private int anInt1201;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	private int anInt1202;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([I)V")
	public Class36(@OriginalArg(0) int[] arg0) {
		this.anIntArray108 = new int[256];
		this.anIntArray109 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray108[local13] = arg0[local13];
		}
		this.method1148();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	private void method1143() {
		this.anInt1201 += ++this.anInt1202;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(33) int local33 = this.anIntArray109[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt1196 ^= this.anInt1196 << 13;
				} else {
					this.anInt1196 ^= this.anInt1196 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt1196 ^= this.anInt1196 << 2;
			} else {
				this.anInt1196 ^= this.anInt1196 >>> 16;
			}
			this.anInt1196 += this.anIntArray109[local26 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray109[local26] = local119 = this.anInt1201 + this.anInt1196 + this.anIntArray109[local33 >> 2 & 0xFF];
			this.anIntArray108[local26] = this.anInt1201 = local33 + this.anIntArray109[local119 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)I")
	public int method1146() {
		if (this.anInt1197 == 0) {
			this.method1143();
			this.anInt1197 = 256;
		}
		return this.anIntArray108[this.anInt1197 - 1];
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
	public int method1147() {
		if (this.anInt1197 == 0) {
			this.method1143();
			this.anInt1197 = 256;
		}
		return this.anIntArray108[--this.anInt1197];
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	private void method1148() {
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
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
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
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray108[local29 + 6];
			local22 += this.anIntArray108[local29 + 3];
			local20 += this.anIntArray108[local29 + 4];
			local14 += this.anIntArray108[local29 + 7];
			local27 += this.anIntArray108[local29];
			local26 += this.anIntArray108[local29 + 1];
			local18 += this.anIntArray108[local29 + 5];
			local24 += this.anIntArray108[local29 + 2];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray109[local29] = local27;
			this.anIntArray109[local29 + 1] = local26;
			this.anIntArray109[local29 + 2] = local24;
			this.anIntArray109[local29 + 3] = local22;
			this.anIntArray109[local29 + 4] = local20;
			this.anIntArray109[local29 + 5] = local18;
			this.anIntArray109[local29 + 6] = local16;
			this.anIntArray109[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray109[local29 + 3];
			local27 += this.anIntArray109[local29];
			local20 += this.anIntArray109[local29 + 4];
			local18 += this.anIntArray109[local29 + 5];
			local14 += this.anIntArray109[local29 + 7];
			local24 += this.anIntArray109[local29 + 2];
			local26 += this.anIntArray109[local29 + 1];
			local16 += this.anIntArray109[local29 + 6];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
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
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray109[local29] = local27;
			this.anIntArray109[local29 + 1] = local26;
			this.anIntArray109[local29 + 2] = local24;
			this.anIntArray109[local29 + 3] = local22;
			this.anIntArray109[local29 + 4] = local20;
			this.anIntArray109[local29 + 5] = local18;
			this.anIntArray109[local29 + 6] = local16;
			this.anIntArray109[local29 + 7] = local14;
		}
		this.method1143();
		this.anInt1197 = 256;
	}
}
