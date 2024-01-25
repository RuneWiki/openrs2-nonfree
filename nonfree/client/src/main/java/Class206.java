import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class206 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	private int anInt5623;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	private int anInt5624;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	private int anInt5626;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	private int anInt5627;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "[I")
	private int[] anIntArray495;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "[I")
	private int[] anIntArray496;

	static {
		new Class134("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	private Class206() {
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "([I)V")
	public Class206(@OriginalArg(0) int[] arg0) {
		this.anIntArray496 = new int[256];
		this.anIntArray495 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray495[local13] = arg0[local13];
		}
		this.method4456();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	private void method4456() {
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(29) int local29 = -1640531527;
		@Pc(30) int local30 = -1640531527;
		@Pc(32) int local32;
		for (local32 = 0; local32 < 4; local32++) {
			local30 ^= local29 << 11;
			local29 += local27;
			local25 += local30;
			local29 ^= local27 >>> 2;
			local23 += local29;
			local27 += local25;
			local27 ^= local25 << 8;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 >>> 16;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 10;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 >>> 4;
			local19 += local17;
			local30 += local21;
			local19 ^= local17 << 8;
			local17 += local30;
			local29 += local19;
			local17 ^= local30 >>> 9;
			local30 += local29;
			local27 += local17;
		}
		for (local32 = 0; local32 < 256; local32 += 8) {
			local17 += this.anIntArray495[local32 + 7];
			local27 += this.anIntArray495[local32 + 2];
			local29 += this.anIntArray495[local32 + 1];
			local30 += this.anIntArray495[local32];
			local23 += this.anIntArray495[local32 + 4];
			local19 += this.anIntArray495[local32 + 6];
			local25 += this.anIntArray495[local32 + 3];
			local21 += this.anIntArray495[local32 + 5];
			local30 ^= local29 << 11;
			local25 += local30;
			local29 += local27;
			local29 ^= local27 >>> 2;
			local23 += local29;
			local27 += local25;
			local27 ^= local25 << 8;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 >>> 16;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 << 10;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 >>> 4;
			local30 += local21;
			local19 += local17;
			local19 ^= local17 << 8;
			local17 += local30;
			local29 += local19;
			local17 ^= local30 >>> 9;
			local27 += local17;
			local30 += local29;
			this.anIntArray496[local32] = local30;
			this.anIntArray496[local32 + 1] = local29;
			this.anIntArray496[local32 + 2] = local27;
			this.anIntArray496[local32 + 3] = local25;
			this.anIntArray496[local32 + 4] = local23;
			this.anIntArray496[local32 + 5] = local21;
			this.anIntArray496[local32 + 6] = local19;
			this.anIntArray496[local32 + 7] = local17;
		}
		for (local32 = 0; local32 < 256; local32 += 8) {
			local29 += this.anIntArray496[local32 + 1];
			local17 += this.anIntArray496[local32 + 7];
			local30 += this.anIntArray496[local32];
			local27 += this.anIntArray496[local32 + 2];
			local19 += this.anIntArray496[local32 + 6];
			local23 += this.anIntArray496[local32 + 4];
			local21 += this.anIntArray496[local32 + 5];
			local25 += this.anIntArray496[local32 + 3];
			local30 ^= local29 << 11;
			local25 += local30;
			local29 += local27;
			local29 ^= local27 >>> 2;
			local23 += local29;
			local27 += local25;
			local27 ^= local25 << 8;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 >>> 16;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 << 10;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 >>> 4;
			local19 += local17;
			local30 += local21;
			local19 ^= local17 << 8;
			local17 += local30;
			local29 += local19;
			local17 ^= local30 >>> 9;
			local27 += local17;
			local30 += local29;
			this.anIntArray496[local32] = local30;
			this.anIntArray496[local32 + 1] = local29;
			this.anIntArray496[local32 + 2] = local27;
			this.anIntArray496[local32 + 3] = local25;
			this.anIntArray496[local32 + 4] = local23;
			this.anIntArray496[local32 + 5] = local21;
			this.anIntArray496[local32 + 6] = local19;
			this.anIntArray496[local32 + 7] = local17;
		}
		this.method4459();
		this.anInt5623 = 256;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
	public int method4457() {
		if (this.anInt5623 == 0) {
			this.method4459();
			this.anInt5623 = 256;
		}
		return this.anIntArray495[--this.anInt5623];
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	private void method4459() {
		this.anInt5626 += ++this.anInt5627;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray496[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt5624 ^= this.anInt5624 << 13;
				} else {
					this.anInt5624 ^= this.anInt5624 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt5624 ^= this.anInt5624 << 2;
			} else {
				this.anInt5624 ^= this.anInt5624 >>> 16;
			}
			this.anInt5624 += this.anIntArray496[local25 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray496[local25] = local124 = this.anIntArray496[local32 >> 2 & 0xFF] + this.anInt5624 + this.anInt5626;
			this.anIntArray495[local25] = this.anInt5626 = local32 + this.anIntArray496[local124 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I")
	public int method4461() {
		if (this.anInt5623 == 0) {
			this.method4459();
			this.anInt5623 = 256;
		}
		return this.anIntArray495[this.anInt5623 - 1];
	}
}
