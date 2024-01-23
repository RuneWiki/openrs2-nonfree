import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class118 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public int anInt3551;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public int anInt3552;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	private int anInt3553;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	private int anInt3556;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	private int anInt3557;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!hg;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Z")
	public boolean aBoolean314;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	private int anInt3562;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	public int anInt3563;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
	public int anInt3564;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	public int anInt3565;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	private int anInt3567;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "Z")
	public boolean aBoolean315;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
	public int anInt3568;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
	public int anInt3569;

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "[F")
	public float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class118(@OriginalArg(0) Class1_Sub13 arg0) {
		if (Static270.anIntArray555 == null) {
			Static110.method2026();
		}
		this.anInt3552 = arg0.method1853();
		this.aBoolean315 = (this.anInt3552 & 0x10) != 0;
		this.aBoolean314 = (this.anInt3552 & 0x8) != 0;
		this.anInt3552 &= 0x7;
		this.anInt3551 = arg0.method1879();
		this.anInt3569 = arg0.method1879();
		this.anInt3565 = arg0.method1879();
		this.anInt3568 = arg0.method1853();
		this.method3150();
		this.aShortArray74 = new short[this.anInt3568 * 2 + 1];
		@Pc(85) int local85;
		for (local85 = 0; local85 < this.aShortArray74.length; local85++) {
			this.aShortArray74[local85] = (short) arg0.method1879();
		}
		this.anInt3564 = Static119.anIntArray174[arg0.method1879()];
		local85 = arg0.method1853();
		this.anInt3563 = local85 & 0x1F;
		this.anInt3567 = (local85 & 0xE0) << 3;
		if (this.anInt3563 != 31) {
			this.method3147();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)V")
	public void method3146(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23 = arg1 * this.anInt3562 / 50 + this.anInt3567 & 0x7FF;
		@Pc(26) int local26 = this.anInt3556;
		@Pc(60) int local60;
		if (local26 == 1) {
			local60 = (Class87.anIntArray173[local23] >> 6) + 1024;
		} else if (local26 == 3) {
			local60 = Static270.anIntArray555[local23] >> 1;
		} else if (local26 == 4) {
			local60 = local23 >> 10 << 11;
		} else if (local26 == 2) {
			local60 = local23;
		} else if (local26 == 5) {
			local60 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
		} else {
			local60 = 2048;
		}
		if (arg0) {
			local60 = 2048;
		}
		this.aFloat71 = (float) ((this.anInt3553 * local60 >> 11) + this.anInt3557) / 2048.0F;
		@Pc(122) float local122 = this.aFloat71 / 255.0F;
		this.aFloatArray24[2] = local122 * (float) (this.anInt3564 & 0xFF);
		this.aFloatArray24[1] = (float) (this.anInt3564 >> 8 & 0xFF) * local122;
		this.aFloatArray24[0] = local122 * (float) (this.anInt3564 >> 16 & 0xFF);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	private void method3147() {
		@Pc(4) int local4 = this.anInt3563;
		if (local4 == 2) {
			this.anInt3557 = 0;
			this.anInt3553 = 2048;
			this.anInt3556 = 1;
			this.anInt3562 = 2048;
		} else if (local4 == 3) {
			this.anInt3553 = 2048;
			this.anInt3557 = 0;
			this.anInt3562 = 4096;
			this.anInt3556 = 1;
		} else if (local4 == 4) {
			this.anInt3557 = 0;
			this.anInt3562 = 2048;
			this.anInt3556 = 4;
			this.anInt3553 = 2048;
		} else if (local4 == 5) {
			this.anInt3557 = 0;
			this.anInt3562 = 8192;
			this.anInt3556 = 4;
			this.anInt3553 = 2048;
		} else if (local4 == 12) {
			this.anInt3562 = 2048;
			this.anInt3557 = 0;
			this.anInt3556 = 2;
			this.anInt3553 = 2048;
		} else if (local4 == 13) {
			this.anInt3562 = 8192;
			this.anInt3557 = 0;
			this.anInt3553 = 2048;
			this.anInt3556 = 2;
		} else if (local4 == 10) {
			this.anInt3562 = 2048;
			this.anInt3557 = 1536;
			this.anInt3556 = 3;
			this.anInt3553 = 512;
		} else if (local4 == 11) {
			this.anInt3557 = 1536;
			this.anInt3556 = 3;
			this.anInt3553 = 512;
			this.anInt3562 = 4096;
		} else if (local4 == 6) {
			this.anInt3553 = 768;
			this.anInt3562 = 2048;
			this.anInt3556 = 3;
			this.anInt3557 = 1280;
		} else if (local4 == 7) {
			this.anInt3556 = 3;
			this.anInt3562 = 4096;
			this.anInt3553 = 768;
			this.anInt3557 = 1280;
		} else if (local4 == 8) {
			this.anInt3557 = 1024;
			this.anInt3562 = 2048;
			this.anInt3556 = 3;
			this.anInt3553 = 1024;
		} else if (local4 == 9) {
			this.anInt3562 = 4096;
			this.anInt3557 = 1024;
			this.anInt3556 = 3;
			this.anInt3553 = 1024;
		} else if (local4 == 14) {
			this.anInt3553 = 768;
			this.anInt3556 = 1;
			this.anInt3557 = 1280;
			this.anInt3562 = 2048;
		} else if (local4 == 15) {
			this.anInt3562 = 4096;
			this.anInt3556 = 1;
			this.anInt3553 = 512;
			this.anInt3557 = 1536;
		} else if (local4 == 16) {
			this.anInt3557 = 1792;
			this.anInt3553 = 256;
			this.anInt3562 = 8192;
			this.anInt3556 = 1;
		} else {
			this.anInt3562 = 2048;
			this.anInt3557 = 0;
			this.anInt3553 = 2048;
			this.anInt3556 = 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	private void method3150() {
		@Pc(15) int local15 = (this.anInt3568 << 7) + 64;
		this.aFloat70 = 1.0F / (float) (local15 * local15);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBIII)V")
	public void method3151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3557 = arg2;
		this.anInt3553 = arg0;
		this.anInt3562 = arg3;
		this.anInt3556 = arg1;
	}
}
