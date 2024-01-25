import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class141 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
	private int anInt3493;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	private int anInt3496;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	private int anInt3497;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	private int anInt3501;

	static {
		new Class15("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
		new Class15("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	private Class141() {
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "([I)V")
	public Class141(@OriginalArg(0) int[] arg0) {
		this.anIntArray263 = new int[256];
		this.anIntArray262 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray262[local13] = arg0[local13];
		}
		this.method2780();
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
	public int method2776() {
		if (this.anInt3493 == 0) {
			this.method2778();
			this.anInt3493 = 256;
		}
		return this.anIntArray262[--this.anInt3493];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)I")
	public int method2777() {
		if (this.anInt3493 == 0) {
			this.method2778();
			this.anInt3493 = 256;
		}
		return this.anIntArray262[this.anInt3493 - 1];
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	private void method2778() {
		this.anInt3497 += ++this.anInt3501;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray263[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt3496 ^= this.anInt3496 << 13;
				} else {
					this.anInt3496 ^= this.anInt3496 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt3496 ^= this.anInt3496 << 2;
			} else {
				this.anInt3496 ^= this.anInt3496 >>> 16;
			}
			this.anInt3496 += this.anIntArray263[local25 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray263[local25] = local126 = this.anIntArray263[local32 >> 2 & 0xFF] + this.anInt3496 + this.anInt3497;
			this.anIntArray262[local25] = this.anInt3497 = this.anIntArray263[local126 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	private void method2780() {
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(30) int local30;
		for (local30 = 0; local30 < 4; local30++) {
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local19 += this.anIntArray262[local30 + 5];
			local15 += this.anIntArray262[local30 + 7];
			local23 += this.anIntArray262[local30 + 3];
			local21 += this.anIntArray262[local30 + 4];
			local27 += this.anIntArray262[local30 + 1];
			local17 += this.anIntArray262[local30 + 6];
			local25 += this.anIntArray262[local30 + 2];
			local28 += this.anIntArray262[local30];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
			this.anIntArray263[local30] = local28;
			this.anIntArray263[local30 + 1] = local27;
			this.anIntArray263[local30 + 2] = local25;
			this.anIntArray263[local30 + 3] = local23;
			this.anIntArray263[local30 + 4] = local21;
			this.anIntArray263[local30 + 5] = local19;
			this.anIntArray263[local30 + 6] = local17;
			this.anIntArray263[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local21 += this.anIntArray263[local30 + 4];
			local27 += this.anIntArray263[local30 + 1];
			local17 += this.anIntArray263[local30 + 6];
			local28 += this.anIntArray263[local30];
			local15 += this.anIntArray263[local30 + 7];
			local19 += this.anIntArray263[local30 + 5];
			local25 += this.anIntArray263[local30 + 2];
			local23 += this.anIntArray263[local30 + 3];
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
			this.anIntArray263[local30] = local28;
			this.anIntArray263[local30 + 1] = local27;
			this.anIntArray263[local30 + 2] = local25;
			this.anIntArray263[local30 + 3] = local23;
			this.anIntArray263[local30 + 4] = local21;
			this.anIntArray263[local30 + 5] = local19;
			this.anIntArray263[local30 + 6] = local17;
			this.anIntArray263[local30 + 7] = local15;
		}
		this.method2778();
		this.anInt3493 = 256;
	}
}
