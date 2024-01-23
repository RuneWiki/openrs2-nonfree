import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class61 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Z")
	public boolean aBoolean109;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt1991;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	private int anInt1992;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
	public boolean aBoolean110;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!cj;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public int anInt1993;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	private int anInt1995;

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	public int anInt1997;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "I")
	private int anInt1998;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "I")
	public int anInt1999;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "I")
	private int anInt2001;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	public int anInt2004;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!h", name = "z", descriptor = "I")
	public int anInt2006;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "[F")
	public float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!h", name = "o", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class61(@OriginalArg(0) Class1_Sub14 arg0) {
		if (Static306.anIntArray482 == null) {
			Static64.method1154();
		}
		this.anInt1999 = arg0.method1378();
		this.aBoolean110 = (this.anInt1999 & 0x8) != 0;
		this.aBoolean109 = (this.anInt1999 & 0x10) != 0;
		this.anInt1999 &= 0x7;
		this.anInt2004 = arg0.method1386();
		this.anInt2006 = arg0.method1386();
		this.anInt1993 = arg0.method1386();
		this.anInt2002 = arg0.method1378();
		this.method1801();
		this.aShortArray36 = new short[this.anInt2002 * 2 + 1];
		@Pc(80) int local80;
		for (local80 = 0; local80 < this.aShortArray36.length; local80++) {
			this.aShortArray36[local80] = (short) arg0.method1386();
		}
		this.anInt1991 = Static215.anIntArray340[arg0.method1386()];
		local80 = arg0.method1378();
		this.anInt1998 = (local80 & 0xE0) << 3;
		this.anInt1997 = local80 & 0x1F;
		if (this.anInt1997 != 31) {
			this.method1800();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	private void method1800() {
		@Pc(12) int local12 = this.anInt1997;
		if (local12 == 2) {
			this.anInt1992 = 2048;
			this.anInt2005 = 1;
			this.anInt2001 = 2048;
			this.anInt1995 = 0;
		} else if (local12 == 3) {
			this.anInt2005 = 1;
			this.anInt1995 = 0;
			this.anInt1992 = 2048;
			this.anInt2001 = 4096;
		} else if (local12 == 4) {
			this.anInt2001 = 2048;
			this.anInt2005 = 4;
			this.anInt1995 = 0;
			this.anInt1992 = 2048;
		} else if (local12 == 5) {
			this.anInt1992 = 2048;
			this.anInt2001 = 8192;
			this.anInt2005 = 4;
			this.anInt1995 = 0;
		} else if (local12 == 12) {
			this.anInt2005 = 2;
			this.anInt1992 = 2048;
			this.anInt1995 = 0;
			this.anInt2001 = 2048;
		} else if (local12 == 13) {
			this.anInt1992 = 2048;
			this.anInt2001 = 8192;
			this.anInt1995 = 0;
			this.anInt2005 = 2;
		} else if (local12 == 10) {
			this.anInt1992 = 512;
			this.anInt1995 = 1536;
			this.anInt2001 = 2048;
			this.anInt2005 = 3;
		} else if (local12 == 11) {
			this.anInt2001 = 4096;
			this.anInt1995 = 1536;
			this.anInt2005 = 3;
			this.anInt1992 = 512;
		} else if (local12 == 6) {
			this.anInt1992 = 768;
			this.anInt2001 = 2048;
			this.anInt2005 = 3;
			this.anInt1995 = 1280;
		} else if (local12 == 7) {
			this.anInt1995 = 1280;
			this.anInt1992 = 768;
			this.anInt2001 = 4096;
			this.anInt2005 = 3;
		} else if (local12 == 8) {
			this.anInt2001 = 2048;
			this.anInt1992 = 1024;
			this.anInt2005 = 3;
			this.anInt1995 = 1024;
		} else if (local12 == 9) {
			this.anInt1995 = 1024;
			this.anInt2005 = 3;
			this.anInt2001 = 4096;
			this.anInt1992 = 1024;
		} else if (local12 == 14) {
			this.anInt1995 = 1280;
			this.anInt2005 = 1;
			this.anInt2001 = 2048;
			this.anInt1992 = 768;
		} else if (local12 == 15) {
			this.anInt1992 = 512;
			this.anInt1995 = 1536;
			this.anInt2001 = 4096;
			this.anInt2005 = 1;
		} else if (local12 == 16) {
			this.anInt1992 = 256;
			this.anInt2005 = 1;
			this.anInt1995 = 1792;
			this.anInt2001 = 8192;
		} else {
			this.anInt2005 = 0;
			this.anInt1992 = 2048;
			this.anInt2001 = 2048;
			this.anInt1995 = 0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	private void method1801() {
		@Pc(10) int local10 = (this.anInt2002 << 7) + 64;
		this.aFloat65 = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZB)V")
	public void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) int local17 = this.anInt1998 + this.anInt2001 * arg0 / 50 & 0x7FF;
		@Pc(20) int local20 = this.anInt2005;
		@Pc(53) int local53;
		if (local20 == 1) {
			local53 = (Class135.anIntArray335[local17] >> 6) + 1024;
		} else if (local20 == 3) {
			local53 = Static306.anIntArray482[local17] >> 1;
		} else if (local20 == 4) {
			local53 = local17 >> 10 << 11;
		} else if (local20 == 2) {
			local53 = local17;
		} else if (local20 == 5) {
			local53 = (local17 >= 1024 ? 2048 - local17 : local17) << 1;
		} else {
			local53 = 2048;
		}
		if (arg1) {
			local53 = 2048;
		}
		this.aFloat66 = (float) ((this.anInt1992 * local53 >> 11) + this.anInt1995) / 2048.0F;
		@Pc(117) float local117 = this.aFloat66 / 255.0F;
		this.aFloatArray7[0] = (float) (this.anInt1991 >> 16 & 0xFF) * local117;
		this.aFloatArray7[1] = local117 * (float) (this.anInt1991 >> 8 & 0xFF);
		this.aFloatArray7[2] = local117 * (float) (this.anInt1991 & 0xFF);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBI)V")
	public void method1805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2001 = arg3;
		this.anInt2005 = arg1;
		this.anInt1992 = arg2;
		this.anInt1995 = arg0;
	}
}
