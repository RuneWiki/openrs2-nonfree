import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class59 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public int anInt1840;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	private int anInt1841;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!wb;")
	public Class189 aClass189_1;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public int anInt1842;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	private int anInt1843;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Z")
	public boolean aBoolean126;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	public int anInt1845;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
	public int anInt1847;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
	public int anInt1848;

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
	private int anInt1850;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
	public int anInt1851;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
	public int anInt1852;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
	private int anInt1853;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
	private int anInt1855;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "[F")
	public float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!fn", name = "I", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class59(@OriginalArg(0) Class1_Sub14 arg0) {
		if (Static183.anIntArray357 == null) {
			Static18.method423();
		}
		this.anInt1851 = arg0.method2199();
		this.aBoolean126 = (this.anInt1851 & 0x8) != 0;
		this.aBoolean127 = (this.anInt1851 & 0x10) != 0;
		this.anInt1851 &= 0x7;
		this.anInt1852 = arg0.method2244();
		this.anInt1847 = arg0.method2244();
		this.anInt1848 = arg0.method2244();
		this.anInt1842 = arg0.method2199();
		this.method1357();
		this.aShortArray59 = new short[this.anInt1842 * 2 + 1];
		@Pc(80) int local80;
		for (local80 = 0; local80 < this.aShortArray59.length; local80++) {
			this.aShortArray59[local80] = (short) arg0.method2244();
		}
		this.anInt1845 = Static237.anIntArray462[arg0.method2244()];
		local80 = arg0.method2199();
		this.anInt1841 = (local80 & 0xE0) << 3;
		this.anInt1840 = local80 & 0x1F;
		if (this.anInt1840 != 31) {
			this.method1352();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	private void method1352() {
		@Pc(4) int local4 = this.anInt1840;
		if (local4 == 2) {
			this.anInt1843 = 2048;
			this.anInt1853 = 0;
			this.anInt1855 = 2048;
			this.anInt1850 = 1;
		} else if (local4 == 3) {
			this.anInt1850 = 1;
			this.anInt1843 = 4096;
			this.anInt1855 = 2048;
			this.anInt1853 = 0;
		} else if (local4 == 4) {
			this.anInt1850 = 4;
			this.anInt1855 = 2048;
			this.anInt1853 = 0;
			this.anInt1843 = 2048;
		} else if (local4 == 5) {
			this.anInt1850 = 4;
			this.anInt1855 = 2048;
			this.anInt1843 = 8192;
			this.anInt1853 = 0;
		} else if (local4 == 12) {
			this.anInt1853 = 0;
			this.anInt1850 = 2;
			this.anInt1855 = 2048;
			this.anInt1843 = 2048;
		} else if (local4 == 13) {
			this.anInt1855 = 2048;
			this.anInt1850 = 2;
			this.anInt1843 = 8192;
			this.anInt1853 = 0;
		} else if (local4 == 10) {
			this.anInt1855 = 512;
			this.anInt1850 = 3;
			this.anInt1843 = 2048;
			this.anInt1853 = 1536;
		} else if (local4 == 11) {
			this.anInt1855 = 512;
			this.anInt1850 = 3;
			this.anInt1853 = 1536;
			this.anInt1843 = 4096;
		} else if (local4 == 6) {
			this.anInt1855 = 768;
			this.anInt1850 = 3;
			this.anInt1843 = 2048;
			this.anInt1853 = 1280;
		} else if (local4 == 7) {
			this.anInt1853 = 1280;
			this.anInt1843 = 4096;
			this.anInt1855 = 768;
			this.anInt1850 = 3;
		} else if (local4 == 8) {
			this.anInt1855 = 1024;
			this.anInt1853 = 1024;
			this.anInt1843 = 2048;
			this.anInt1850 = 3;
		} else if (local4 == 9) {
			this.anInt1843 = 4096;
			this.anInt1855 = 1024;
			this.anInt1850 = 3;
			this.anInt1853 = 1024;
		} else if (local4 == 14) {
			this.anInt1853 = 1280;
			this.anInt1855 = 768;
			this.anInt1843 = 2048;
			this.anInt1850 = 1;
		} else if (local4 == 15) {
			this.anInt1855 = 512;
			this.anInt1843 = 4096;
			this.anInt1850 = 1;
			this.anInt1853 = 1536;
		} else if (local4 == 16) {
			this.anInt1843 = 8192;
			this.anInt1855 = 256;
			this.anInt1850 = 1;
			this.anInt1853 = 1792;
		} else {
			this.anInt1853 = 0;
			this.anInt1850 = 0;
			this.anInt1843 = 2048;
			this.anInt1855 = 2048;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)V")
	public void method1354(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(27) int local27 = this.anInt1841 + this.anInt1843 * arg1 / 50 & 0x7FF;
		@Pc(30) int local30 = this.anInt1850;
		@Pc(66) int local66;
		if (local30 == 1) {
			local66 = (Class146.anIntArray461[local27] >> 6) + 1024;
		} else if (local30 == 3) {
			local66 = Static183.anIntArray357[local27] >> 1;
		} else if (local30 == 4) {
			local66 = local27 >> 10 << 11;
		} else if (local30 == 2) {
			local66 = local27;
		} else if (local30 == 5) {
			local66 = (local27 < 1024 ? local27 : 2048 - local27) << 1;
		} else {
			local66 = 2048;
		}
		if (arg0) {
			local66 = 2048;
		}
		this.aFloat23 = (float) ((this.anInt1855 * local66 >> 11) + this.anInt1853) / 2048.0F;
		@Pc(128) float local128 = this.aFloat23 / 255.0F;
		this.aFloatArray12[1] = local128 * (float) (this.anInt1845 >> 8 & 0xFF);
		this.aFloatArray12[2] = (float) (this.anInt1845 & 0xFF) * local128;
		this.aFloatArray12[0] = (float) (this.anInt1845 >> 16 & 0xFF) * local128;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V")
	public void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1843 = arg2;
		this.anInt1850 = arg0;
		this.anInt1853 = arg3;
		this.anInt1855 = arg1;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
	private void method1357() {
		@Pc(16) int local16 = (this.anInt1842 << 7) + 64;
		this.aFloat22 = 1.0F / (float) (local16 * local16);
	}
}
