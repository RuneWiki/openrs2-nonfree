import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class74 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	private int anInt2036;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public int anInt2037;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Z")
	public boolean aBoolean109;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "I")
	private int anInt2039;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	public int anInt2041;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	private int anInt2043;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "I")
	private int anInt2045;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Z")
	public boolean aBoolean110;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	private int anInt2046;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "Lclient!wr;")
	public Class7_Sub30 aClass7_Sub30_2;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	private Class74() {
		if (Static378.anIntArray552 == null) {
			Static64.method945();
		}
		this.method1751();
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ya;Lclient!gk;I)V")
	public Class74(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class7_Sub14 arg1, @OriginalArg(2) int arg2) {
		if (Static378.anIntArray552 == null) {
			Static64.method945();
		}
		this.anInt2041 = arg1.method3981();
		this.aBoolean109 = (this.anInt2041 & 0x8) != 0;
		this.aBoolean110 = (this.anInt2041 & 0x10) != 0;
		this.anInt2041 &= 0x7;
		@Pc(44) int local44 = arg1.method3943() << arg2;
		@Pc(50) int local50 = arg1.method3943() << arg2;
		@Pc(56) int local56 = arg1.method3943() << arg2;
		@Pc(60) int local60 = arg1.method3981();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray33 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray33.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method3943();
			local83 = local79 >>> 8;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			@Pc(98) int local98 = local79 & 0xFF;
			if (local66 - local83 < local98) {
				local98 = local66 - local83;
			}
			this.aShortArray33[local72] = (short) (local83 << 8 | local98);
		}
		local60 = (local60 << Static168.anInt3026) + Static297.anInt4923;
		@Pc(152) int local152 = Static165.anIntArray263 == null ? Static434.anIntArray609[Static86.method1478(arg1.method3943()) & 0xFFFF] : Static165.anIntArray263[arg1.method3943()];
		local83 = arg1.method3981();
		this.anInt2045 = (local83 & 0xE0) << 3;
		this.anInt2037 = local83 & 0x1F;
		if (this.anInt2037 != 31) {
			this.method1751();
		}
		this.method1749(arg0, local60, local152, local56, local50, local44);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ya;IIIBII)V")
	private void method1749(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass7_Sub30_2 = arg0.method5335(arg5, arg3, arg4, arg1, arg2, 1.0F);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZB)V")
	public void method1750(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt2045 + arg0 * this.anInt2046 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt2036;
			if (local26 == 1) {
				local9 = (Class22_Sub7.anIntArray411[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static378.anIntArray552[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass7_Sub30_2.method5026((float) ((this.anInt2039 * local9 >> 11) + this.anInt2043) / 2048.0F);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	private void method1751() {
		@Pc(8) int local8 = this.anInt2037;
		if (local8 == 2) {
			this.anInt2046 = 2048;
			this.anInt2036 = 1;
			this.anInt2043 = 0;
			this.anInt2039 = 2048;
		} else if (local8 == 3) {
			this.anInt2043 = 0;
			this.anInt2036 = 1;
			this.anInt2039 = 2048;
			this.anInt2046 = 4096;
		} else if (local8 == 4) {
			this.anInt2039 = 2048;
			this.anInt2046 = 2048;
			this.anInt2036 = 4;
			this.anInt2043 = 0;
		} else if (local8 == 5) {
			this.anInt2036 = 4;
			this.anInt2043 = 0;
			this.anInt2046 = 8192;
			this.anInt2039 = 2048;
		} else if (local8 == 12) {
			this.anInt2036 = 2;
			this.anInt2046 = 2048;
			this.anInt2043 = 0;
			this.anInt2039 = 2048;
		} else if (local8 == 13) {
			this.anInt2039 = 2048;
			this.anInt2036 = 2;
			this.anInt2046 = 8192;
			this.anInt2043 = 0;
		} else if (local8 == 10) {
			this.anInt2039 = 512;
			this.anInt2036 = 3;
			this.anInt2046 = 2048;
			this.anInt2043 = 1536;
		} else if (local8 == 11) {
			this.anInt2046 = 4096;
			this.anInt2043 = 1536;
			this.anInt2036 = 3;
			this.anInt2039 = 512;
		} else if (local8 == 6) {
			this.anInt2036 = 3;
			this.anInt2046 = 2048;
			this.anInt2039 = 768;
			this.anInt2043 = 1280;
		} else if (local8 == 7) {
			this.anInt2036 = 3;
			this.anInt2039 = 768;
			this.anInt2043 = 1280;
			this.anInt2046 = 4096;
		} else if (local8 == 8) {
			this.anInt2036 = 3;
			this.anInt2046 = 2048;
			this.anInt2039 = 1024;
			this.anInt2043 = 1024;
		} else if (local8 == 9) {
			this.anInt2046 = 4096;
			this.anInt2039 = 1024;
			this.anInt2036 = 3;
			this.anInt2043 = 1024;
		} else if (local8 == 14) {
			this.anInt2046 = 2048;
			this.anInt2043 = 1280;
			this.anInt2036 = 1;
			this.anInt2039 = 768;
		} else if (local8 == 15) {
			this.anInt2046 = 4096;
			this.anInt2036 = 1;
			this.anInt2043 = 1536;
			this.anInt2039 = 512;
		} else if (local8 == 16) {
			this.anInt2036 = 1;
			this.anInt2039 = 256;
			this.anInt2043 = 1792;
			this.anInt2046 = 8192;
		} else {
			this.anInt2043 = 0;
			this.anInt2046 = 2048;
			this.anInt2036 = 0;
			this.anInt2039 = 2048;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V")
	public void method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2036 = arg1;
		this.anInt2046 = arg3;
		this.anInt2039 = arg2;
		this.anInt2043 = arg0;
	}
}
