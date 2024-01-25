import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class105 {

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "[Lclient!qo;")
	public static final Class267[] aClass267Array1 = new Class267[5];

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
	private int anInt3002;

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
	private int anInt3005;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass267Array1.length; local4++) {
			aClass267Array1[local4] = new Class267();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
	private Class105() {
	}

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "([I)V")
	public Class105(@OriginalArg(0) int[] arg0) {
		this.anIntArray227 = new int[256];
		this.anIntArray228 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray228[local13] = arg0[local13];
		}
		this.method2655();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	private void method2655() {
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
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local24 += this.anIntArray228[local29 + 2];
			local27 += this.anIntArray228[local29];
			local22 += this.anIntArray228[local29 + 3];
			local14 += this.anIntArray228[local29 + 7];
			local18 += this.anIntArray228[local29 + 5];
			local16 += this.anIntArray228[local29 + 6];
			local26 += this.anIntArray228[local29 + 1];
			local20 += this.anIntArray228[local29 + 4];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray227[local29] = local27;
			this.anIntArray227[local29 + 1] = local26;
			this.anIntArray227[local29 + 2] = local24;
			this.anIntArray227[local29 + 3] = local22;
			this.anIntArray227[local29 + 4] = local20;
			this.anIntArray227[local29 + 5] = local18;
			this.anIntArray227[local29 + 6] = local16;
			this.anIntArray227[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local14 += this.anIntArray227[local29 + 7];
			local18 += this.anIntArray227[local29 + 5];
			local20 += this.anIntArray227[local29 + 4];
			local27 += this.anIntArray227[local29];
			local26 += this.anIntArray227[local29 + 1];
			local16 += this.anIntArray227[local29 + 6];
			local22 += this.anIntArray227[local29 + 3];
			local24 += this.anIntArray227[local29 + 2];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray227[local29] = local27;
			this.anIntArray227[local29 + 1] = local26;
			this.anIntArray227[local29 + 2] = local24;
			this.anIntArray227[local29 + 3] = local22;
			this.anIntArray227[local29 + 4] = local20;
			this.anIntArray227[local29 + 5] = local18;
			this.anIntArray227[local29 + 6] = local16;
			this.anIntArray227[local29 + 7] = local14;
		}
		this.method2657();
		this.anInt3001 = 256;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	private void method2657() {
		this.anInt3002 += ++this.anInt2998;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(32) int local32 = this.anIntArray227[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3005 ^= this.anInt3005 << 13;
				} else {
					this.anInt3005 ^= this.anInt3005 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3005 ^= this.anInt3005 << 2;
			} else {
				this.anInt3005 ^= this.anInt3005 >>> 16;
			}
			this.anInt3005 += this.anIntArray227[local19 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray227[local19] = local118 = this.anInt3002 + this.anInt3005 + this.anIntArray227[local32 >> 2 & 0xFF];
			this.anIntArray228[local19] = this.anInt3002 = local32 + this.anIntArray227[local118 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)I")
	public int method2658() {
		if (this.anInt3001 == 0) {
			this.method2657();
			this.anInt3001 = 256;
		}
		return this.anIntArray228[--this.anInt3001];
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)I")
	public int method2659() {
		if (this.anInt3001 == 0) {
			this.method2657();
			this.anInt3001 = 256;
		}
		return this.anIntArray228[this.anInt3001 - 1];
	}
}
