import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class3_Sub13_Sub1 extends Class3_Sub13 {

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt6668;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	private int anInt6669;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	private int anInt6671;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public int anInt6672;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
	private int anInt6673;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
	private int anInt6676;

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
	public int anInt6678;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Z")
	public boolean aBoolean447;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	private Class3_Sub13_Sub1() {
		if (Static317.anIntArray446 == null) {
			Static316.method5249();
		}
		this.method5599();
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class3_Sub13_Sub1(@OriginalArg(0) Class3_Sub4 arg0) {
		if (Static317.anIntArray446 == null) {
			Static316.method5249();
		}
		this.anInt6672 = arg0.method3643();
		this.aBoolean447 = (this.anInt6672 & 0x8) != 0;
		this.aBoolean446 = (this.anInt6672 & 0x10) != 0;
		this.anInt6672 &= 0x7;
		super.anInt6662 = arg0.method3649();
		super.anInt6666 = arg0.method3649();
		super.anInt6667 = arg0.method3649();
		super.anInt6661 = arg0.method3643();
		@Pc(65) int local65 = super.anInt6661 * 2 + 1;
		this.aShortArray112 = new short[local65];
		for (@Pc(71) int local71 = 0; local71 < this.aShortArray112.length; local71++) {
			@Pc(78) short local78 = (short) arg0.method3649();
			@Pc(82) int local82 = local78 >>> 8;
			@Pc(86) int local86 = local78 & 0xFF;
			if (local82 >= local65) {
				local82 = local65 - 1;
			}
			if (local86 > local65 - local82) {
				local86 = local65 - local82;
			}
			this.aShortArray112[local71] = (short) (local86 | local82 << 8);
		}
		super.anInt6661 = (super.anInt6661 << 7) + 64;
		if (Static295.anIntArray477 == null) {
			super.anInt6665 = Static113.anIntArray533[Static298.method5060(arg0.method3649()) & 0xFFFF];
		} else {
			super.anInt6665 = Static295.anIntArray477[arg0.method3649()];
		}
		@Pc(157) int local157 = arg0.method3643();
		this.anInt6678 = local157 & 0x1F;
		this.anInt6676 = (local157 & 0xE0) << 3;
		if (this.anInt6678 != 31) {
			this.method5599();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	private void method5599() {
		@Pc(10) int local10 = this.anInt6678;
		if (local10 == 2) {
			this.anInt6668 = 2048;
			this.anInt6669 = 2048;
			this.anInt6671 = 0;
			this.anInt6673 = 1;
		} else if (local10 == 3) {
			this.anInt6668 = 2048;
			this.anInt6669 = 4096;
			this.anInt6673 = 1;
			this.anInt6671 = 0;
		} else if (local10 == 4) {
			this.anInt6671 = 0;
			this.anInt6669 = 2048;
			this.anInt6673 = 4;
			this.anInt6668 = 2048;
		} else if (local10 == 5) {
			this.anInt6668 = 2048;
			this.anInt6669 = 8192;
			this.anInt6671 = 0;
			this.anInt6673 = 4;
		} else if (local10 == 12) {
			this.anInt6669 = 2048;
			this.anInt6671 = 0;
			this.anInt6673 = 2;
			this.anInt6668 = 2048;
		} else if (local10 == 13) {
			this.anInt6668 = 2048;
			this.anInt6669 = 8192;
			this.anInt6673 = 2;
			this.anInt6671 = 0;
		} else if (local10 == 10) {
			this.anInt6671 = 1536;
			this.anInt6673 = 3;
			this.anInt6668 = 512;
			this.anInt6669 = 2048;
		} else if (local10 == 11) {
			this.anInt6669 = 4096;
			this.anInt6673 = 3;
			this.anInt6668 = 512;
			this.anInt6671 = 1536;
		} else if (local10 == 6) {
			this.anInt6671 = 1280;
			this.anInt6673 = 3;
			this.anInt6668 = 768;
			this.anInt6669 = 2048;
		} else if (local10 == 7) {
			this.anInt6668 = 768;
			this.anInt6671 = 1280;
			this.anInt6669 = 4096;
			this.anInt6673 = 3;
		} else if (local10 == 8) {
			this.anInt6673 = 3;
			this.anInt6671 = 1024;
			this.anInt6668 = 1024;
			this.anInt6669 = 2048;
		} else if (local10 == 9) {
			this.anInt6669 = 4096;
			this.anInt6673 = 3;
			this.anInt6668 = 1024;
			this.anInt6671 = 1024;
		} else if (local10 == 14) {
			this.anInt6668 = 768;
			this.anInt6669 = 2048;
			this.anInt6671 = 1280;
			this.anInt6673 = 1;
		} else if (local10 == 15) {
			this.anInt6669 = 4096;
			this.anInt6673 = 1;
			this.anInt6668 = 512;
			this.anInt6671 = 1536;
		} else if (local10 == 16) {
			this.anInt6668 = 256;
			this.anInt6671 = 1792;
			this.anInt6673 = 1;
			this.anInt6669 = 8192;
		} else {
			this.anInt6673 = 0;
			this.anInt6671 = 0;
			this.anInt6668 = 2048;
			this.anInt6669 = 2048;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZB)V")
	public void method5601(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(64) int local64;
		if (arg1) {
			local64 = 2048;
		} else {
			@Pc(28) int local28 = this.anInt6676 + this.anInt6669 * arg0 / 50 & 0x7FF;
			@Pc(31) int local31 = this.anInt6673;
			if (local31 == 1) {
				local64 = (Class19.anIntArray20[local28 << 3] >> 5) + 1024;
			} else if (local31 == 3) {
				local64 = Static317.anIntArray446[local28] >> 1;
			} else if (local31 == 4) {
				local64 = local28 >> 10 << 11;
			} else if (local31 == 2) {
				local64 = local28;
			} else if (local31 == 5) {
				local64 = (local28 >= 1024 ? 2048 - local28 : local28) << 1;
			} else {
				local64 = 2048;
			}
		}
		super.aFloat77 = (float) (this.anInt6671 + (this.anInt6668 * local64 >> 11)) / 2048.0F;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V")
	public void method5602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6668 = arg1;
		this.anInt6671 = arg0;
		this.anInt6673 = arg3;
		this.anInt6669 = arg2;
	}
}
