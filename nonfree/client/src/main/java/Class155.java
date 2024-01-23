import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class155 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	public int anInt4687;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public int anInt4688;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	private int anInt4690;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
	public int anInt4691;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public int anInt4692;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	private int anInt4693;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "Z")
	public boolean aBoolean305;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	public int anInt4700;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	private int anInt4701;

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
	private int anInt4703;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "Lclient!wc;")
	public Class179 aClass179_1;

	@OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
	private int anInt4705;

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "[F")
	public float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class155(@OriginalArg(0) Class4_Sub17 arg0) {
		if (Static233.anIntArray423 == null) {
			Static180.method2835();
		}
		this.anInt4698 = arg0.method1874();
		this.aBoolean303 = (this.anInt4698 & 0x10) != 0;
		this.aBoolean305 = (this.anInt4698 & 0x8) != 0;
		this.anInt4698 &= 0x7;
		this.anInt4688 = arg0.method1837();
		this.anInt4691 = arg0.method1837();
		this.anInt4687 = arg0.method1837();
		this.anInt4700 = arg0.method1874();
		this.method3751();
		this.aShortArray77 = new short[this.anInt4700 * 2 + 1];
		@Pc(87) int local87;
		for (local87 = 0; local87 < this.aShortArray77.length; local87++) {
			this.aShortArray77[local87] = (short) arg0.method1837();
		}
		this.anInt4696 = Static204.anIntArray354[arg0.method1837()];
		local87 = arg0.method1874();
		this.anInt4690 = (local87 & 0xE0) << 3;
		this.anInt4692 = local87 & 0x1F;
		if (this.anInt4692 != 31) {
			this.method3753();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
	private void method3751() {
		@Pc(14) int local14 = (this.anInt4700 << 7) + 64;
		this.aFloat46 = 1.0F / (float) (local14 * local14);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZII)V")
	public void method3752(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt4690 + arg1 * this.anInt4703 / 50 & 0x7FF;
		@Pc(21) int local21 = this.anInt4701;
		@Pc(54) int local54;
		if (local21 == 1) {
			local54 = (Class131.anIntArray355[local18] >> 6) + 1024;
		} else if (local21 == 3) {
			local54 = Static233.anIntArray423[local18] >> 1;
		} else if (local21 == 4) {
			local54 = local18 >> 10 << 11;
		} else if (local21 == 2) {
			local54 = local18;
		} else if (local21 == 5) {
			local54 = (local18 >= 1024 ? 2048 - local18 : local18) << 1;
		} else {
			local54 = 2048;
		}
		if (arg0) {
			local54 = 2048;
		}
		this.aFloat45 = (float) ((local54 * this.anInt4693 >> 11) + this.anInt4705) / 2048.0F;
		@Pc(120) float local120 = this.aFloat45 / 255.0F;
		this.aFloatArray26[1] = local120 * (float) (this.anInt4696 >> 8 & 0xFF);
		this.aFloatArray26[2] = (float) (this.anInt4696 & 0xFF) * local120;
		this.aFloatArray26[0] = (float) (this.anInt4696 >> 16 & 0xFF) * local120;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	private void method3753() {
		@Pc(4) int local4 = this.anInt4692;
		if (local4 == 2) {
			this.anInt4701 = 1;
			this.anInt4703 = 2048;
			this.anInt4693 = 2048;
			this.anInt4705 = 0;
		} else if (local4 == 3) {
			this.anInt4705 = 0;
			this.anInt4693 = 2048;
			this.anInt4701 = 1;
			this.anInt4703 = 4096;
		} else if (local4 == 4) {
			this.anInt4705 = 0;
			this.anInt4693 = 2048;
			this.anInt4703 = 2048;
			this.anInt4701 = 4;
		} else if (local4 == 5) {
			this.anInt4703 = 8192;
			this.anInt4701 = 4;
			this.anInt4705 = 0;
			this.anInt4693 = 2048;
		} else if (local4 == 12) {
			this.anInt4703 = 2048;
			this.anInt4701 = 2;
			this.anInt4693 = 2048;
			this.anInt4705 = 0;
		} else if (local4 == 13) {
			this.anInt4705 = 0;
			this.anInt4701 = 2;
			this.anInt4693 = 2048;
			this.anInt4703 = 8192;
		} else if (local4 == 10) {
			this.anInt4701 = 3;
			this.anInt4705 = 1536;
			this.anInt4703 = 2048;
			this.anInt4693 = 512;
		} else if (local4 == 11) {
			this.anInt4705 = 1536;
			this.anInt4693 = 512;
			this.anInt4703 = 4096;
			this.anInt4701 = 3;
		} else if (local4 == 6) {
			this.anInt4703 = 2048;
			this.anInt4701 = 3;
			this.anInt4705 = 1280;
			this.anInt4693 = 768;
		} else if (local4 == 7) {
			this.anInt4703 = 4096;
			this.anInt4693 = 768;
			this.anInt4701 = 3;
			this.anInt4705 = 1280;
		} else if (local4 == 8) {
			this.anInt4703 = 2048;
			this.anInt4701 = 3;
			this.anInt4693 = 1024;
			this.anInt4705 = 1024;
		} else if (local4 == 9) {
			this.anInt4701 = 3;
			this.anInt4693 = 1024;
			this.anInt4705 = 1024;
			this.anInt4703 = 4096;
		} else if (local4 == 14) {
			this.anInt4705 = 1280;
			this.anInt4701 = 1;
			this.anInt4703 = 2048;
			this.anInt4693 = 768;
		} else if (local4 == 15) {
			this.anInt4705 = 1536;
			this.anInt4693 = 512;
			this.anInt4701 = 1;
			this.anInt4703 = 4096;
		} else if (local4 == 16) {
			this.anInt4703 = 8192;
			this.anInt4693 = 256;
			this.anInt4701 = 1;
			this.anInt4705 = 1792;
		} else {
			this.anInt4703 = 2048;
			this.anInt4693 = 2048;
			this.anInt4701 = 0;
			this.anInt4705 = 0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIII)V")
	public void method3754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4703 = arg2;
		this.anInt4693 = arg1;
		this.anInt4701 = arg0;
		this.anInt4705 = arg3;
	}
}
