import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class207 {

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
	private int anInt6124;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
	private int[] anIntArray453;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	private int anInt6126;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	private int anInt6128;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
	private int anInt6129;

	static {
		new Class114("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	private Class207() {
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([I)V")
	public Class207(@OriginalArg(0) int[] arg0) {
		this.anIntArray453 = new int[256];
		this.anIntArray452 = new int[256];
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray453[local11] = arg0[local11];
		}
		this.method5301();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	private void method5301() {
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
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local16 += this.anIntArray453[local21 + 2];
			local12 += this.anIntArray453[local21 + 4];
			local10 += this.anIntArray453[local21 + 5];
			local8 += this.anIntArray453[local21 + 6];
			local6 += this.anIntArray453[local21 + 7];
			local19 += this.anIntArray453[local21];
			local14 += this.anIntArray453[local21 + 3];
			local18 += this.anIntArray453[local21 + 1];
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
			this.anIntArray452[local21] = local19;
			this.anIntArray452[local21 + 1] = local18;
			this.anIntArray452[local21 + 2] = local16;
			this.anIntArray452[local21 + 3] = local14;
			this.anIntArray452[local21 + 4] = local12;
			this.anIntArray452[local21 + 5] = local10;
			this.anIntArray452[local21 + 6] = local8;
			this.anIntArray452[local21 + 7] = local6;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local18 += this.anIntArray452[local21 + 1];
			local16 += this.anIntArray452[local21 + 2];
			local8 += this.anIntArray452[local21 + 6];
			local10 += this.anIntArray452[local21 + 5];
			local12 += this.anIntArray452[local21 + 4];
			local19 += this.anIntArray452[local21];
			local14 += this.anIntArray452[local21 + 3];
			local6 += this.anIntArray452[local21 + 7];
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
			local12 += local10;
			local8 += local14;
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
			local19 += local18;
			local16 += local6;
			this.anIntArray452[local21] = local19;
			this.anIntArray452[local21 + 1] = local18;
			this.anIntArray452[local21 + 2] = local16;
			this.anIntArray452[local21 + 3] = local14;
			this.anIntArray452[local21 + 4] = local12;
			this.anIntArray452[local21 + 5] = local10;
			this.anIntArray452[local21 + 6] = local8;
			this.anIntArray452[local21 + 7] = local6;
		}
		this.method5303();
		this.anInt6128 = 256;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I")
	public int method5302() {
		if (this.anInt6128 == 0) {
			this.method5303();
			this.anInt6128 = 256;
		}
		return this.anIntArray453[--this.anInt6128];
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
	private void method5303() {
		this.anInt6126 += ++this.anInt6124;
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(27) int local27 = this.anIntArray452[local21];
			if ((local21 & 0x2) == 0) {
				if ((local21 & 0x1) == 0) {
					this.anInt6129 ^= this.anInt6129 << 13;
				} else {
					this.anInt6129 ^= this.anInt6129 >>> 6;
				}
			} else if ((local21 & 0x1) == 0) {
				this.anInt6129 ^= this.anInt6129 << 2;
			} else {
				this.anInt6129 ^= this.anInt6129 >>> 16;
			}
			this.anInt6129 += this.anIntArray452[local21 + 128 & 0xFF];
			@Pc(114) int local114;
			this.anIntArray452[local21] = local114 = this.anInt6129 + this.anIntArray452[local27 >> 2 & 0xFF] + this.anInt6126;
			this.anIntArray453[local21] = this.anInt6126 = this.anIntArray452[local114 >> 8 >> 2 & 0xFF] + local27;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)I")
	public int method5304() {
		if (this.anInt6128 == 0) {
			this.method5303();
			this.anInt6128 = 256;
		}
		return this.anIntArray453[this.anInt6128 - 1];
	}
}
