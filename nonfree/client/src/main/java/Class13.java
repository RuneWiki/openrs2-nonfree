import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FKXPJREN")
public final class Class13 {

	@OriginalMember(owner = "client!FKXPJREN", name = "b", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!FKXPJREN", name = "e", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!FKXPJREN", name = "f", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!FKXPJREN", name = "g", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!FKXPJREN", name = "a", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!FKXPJREN", name = "d", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!FKXPJREN", name = "c", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!FKXPJREN", name = "<init>", descriptor = "([IZ)V")
	public Class13(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anIntArray40 = new int[256];
			this.anIntArray39 = new int[256];
			for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
				this.anIntArray39[local24] = arg0[local24];
			}
			this.method80();
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("91307, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKXPJREN", name = "a", descriptor = "()I")
	public int method78() {
		if (this.anInt175-- == 0) {
			this.method79();
			this.anInt175 = 255;
		}
		return this.anIntArray39[this.anInt175];
	}

	@OriginalMember(owner = "client!FKXPJREN", name = "b", descriptor = "()V")
	private void method79() {
		this.anInt177 += ++this.anInt178;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray40[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt176 ^= this.anInt176 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt176 ^= this.anInt176 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt176 ^= this.anInt176 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt176 ^= this.anInt176 >>> 16;
			}
			this.anInt176 += this.anIntArray40[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray40[local15] = local115 = this.anIntArray40[local22 >> 2 & 0xFF] + this.anInt176 + this.anInt177;
			this.anIntArray39[local15] = this.anInt177 = this.anIntArray40[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!FKXPJREN", name = "c", descriptor = "()V")
	private void method80() {
		@Pc(4) int local4 = -1640531527;
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray39[local19];
			local16 += this.anIntArray39[local19 + 1];
			local14 += this.anIntArray39[local19 + 2];
			local12 += this.anIntArray39[local19 + 3];
			local10 += this.anIntArray39[local19 + 4];
			local8 += this.anIntArray39[local19 + 5];
			local6 += this.anIntArray39[local19 + 6];
			local4 += this.anIntArray39[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray40[local19] = local17;
			this.anIntArray40[local19 + 1] = local16;
			this.anIntArray40[local19 + 2] = local14;
			this.anIntArray40[local19 + 3] = local12;
			this.anIntArray40[local19 + 4] = local10;
			this.anIntArray40[local19 + 5] = local8;
			this.anIntArray40[local19 + 6] = local6;
			this.anIntArray40[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray40[local19];
			local16 += this.anIntArray40[local19 + 1];
			local14 += this.anIntArray40[local19 + 2];
			local12 += this.anIntArray40[local19 + 3];
			local10 += this.anIntArray40[local19 + 4];
			local8 += this.anIntArray40[local19 + 5];
			local6 += this.anIntArray40[local19 + 6];
			local4 += this.anIntArray40[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray40[local19] = local17;
			this.anIntArray40[local19 + 1] = local16;
			this.anIntArray40[local19 + 2] = local14;
			this.anIntArray40[local19 + 3] = local12;
			this.anIntArray40[local19 + 4] = local10;
			this.anIntArray40[local19 + 5] = local8;
			this.anIntArray40[local19 + 6] = local6;
			this.anIntArray40[local19 + 7] = local4;
		}
		this.method79();
		this.anInt175 = 256;
	}
}
