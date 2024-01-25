import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 {

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	private int anInt6085;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	private int anInt6086;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	public int anInt6088;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	private int anInt6089;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	public int anInt6093;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "I")
	private int anInt6094;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "Z")
	public boolean aBoolean533;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	private int anInt6096;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	private Class4_Sub12_Sub1() {
		if (Static27.anIntArray86 == null) {
			Static338.method4479();
		}
		this.method5114();
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class4_Sub12_Sub1(@OriginalArg(0) Class4_Sub7 arg0) {
		if (Static27.anIntArray86 == null) {
			Static338.method4479();
		}
		this.anInt6093 = arg0.method2380();
		this.aBoolean533 = (this.anInt6093 & 0x8) != 0;
		this.aBoolean534 = (this.anInt6093 & 0x10) != 0;
		this.anInt6093 &= 0x7;
		super.anInt6082 = arg0.method2404();
		super.anInt6081 = arg0.method2404();
		super.anInt6079 = arg0.method2404();
		super.anInt6083 = arg0.method2380();
		@Pc(71) int local71 = super.anInt6083 * 2 + 1;
		this.aShortArray111 = new short[local71];
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray111.length; local77++) {
			@Pc(84) short local84 = (short) arg0.method2404();
			@Pc(88) int local88 = local84 >>> 8;
			@Pc(92) int local92 = local84 & 0xFF;
			if (local71 <= local88) {
				local88 = local71 - 1;
			}
			if (local92 > local71 - local88) {
				local92 = local71 - local88;
			}
			this.aShortArray111[local77] = (short) (local88 << 8 | local92);
		}
		super.anInt6083 = (super.anInt6083 << 7) + 64;
		if (Static133.anIntArray277 == null) {
			super.anInt6078 = Static56.anIntArray139[Static176.method3333(arg0.method2404()) & 0xFFFF];
		} else {
			super.anInt6078 = Static133.anIntArray277[arg0.method2404()];
		}
		@Pc(168) int local168 = arg0.method2380();
		this.anInt6088 = local168 & 0x1F;
		this.anInt6085 = (local168 & 0xE0) << 3;
		if (this.anInt6088 != 31) {
			this.method5114();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public void method5111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6089 = arg1;
		this.anInt6096 = arg0;
		this.anInt6086 = arg2;
		this.anInt6094 = arg3;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZII)V")
	public void method5112(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0) {
			local13 = 2048;
		} else {
			@Pc(27) int local27 = arg1 * this.anInt6086 / 50 + this.anInt6085 & 0x7FF;
			@Pc(30) int local30 = this.anInt6094;
			if (local30 == 1) {
				local13 = (Class4_Sub4_Sub25.anIntArray384[local27 << 3] >> 5) + 1024;
			} else if (local30 == 3) {
				local13 = Static27.anIntArray86[local27] >> 1;
			} else if (local30 == 4) {
				local13 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local13 = local27;
			} else if (local30 == 5) {
				local13 = (local27 >= 1024 ? 2048 - local27 : local27) << 1;
			} else {
				local13 = 2048;
			}
		}
		super.aFloat72 = (float) (this.anInt6089 + (this.anInt6096 * local13 >> 11)) / 2048.0F;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	private void method5114() {
		@Pc(12) int local12 = this.anInt6088;
		if (local12 == 2) {
			this.anInt6096 = 2048;
			this.anInt6094 = 1;
			this.anInt6086 = 2048;
			this.anInt6089 = 0;
		} else if (local12 == 3) {
			this.anInt6094 = 1;
			this.anInt6089 = 0;
			this.anInt6096 = 2048;
			this.anInt6086 = 4096;
		} else if (local12 == 4) {
			this.anInt6086 = 2048;
			this.anInt6094 = 4;
			this.anInt6089 = 0;
			this.anInt6096 = 2048;
		} else if (local12 == 5) {
			this.anInt6096 = 2048;
			this.anInt6094 = 4;
			this.anInt6086 = 8192;
			this.anInt6089 = 0;
		} else if (local12 == 12) {
			this.anInt6086 = 2048;
			this.anInt6089 = 0;
			this.anInt6094 = 2;
			this.anInt6096 = 2048;
		} else if (local12 == 13) {
			this.anInt6096 = 2048;
			this.anInt6094 = 2;
			this.anInt6086 = 8192;
			this.anInt6089 = 0;
		} else if (local12 == 10) {
			this.anInt6089 = 1536;
			this.anInt6094 = 3;
			this.anInt6086 = 2048;
			this.anInt6096 = 512;
		} else if (local12 == 11) {
			this.anInt6096 = 512;
			this.anInt6089 = 1536;
			this.anInt6086 = 4096;
			this.anInt6094 = 3;
		} else if (local12 == 6) {
			this.anInt6094 = 3;
			this.anInt6086 = 2048;
			this.anInt6089 = 1280;
			this.anInt6096 = 768;
		} else if (local12 == 7) {
			this.anInt6086 = 4096;
			this.anInt6094 = 3;
			this.anInt6089 = 1280;
			this.anInt6096 = 768;
		} else if (local12 == 8) {
			this.anInt6089 = 1024;
			this.anInt6094 = 3;
			this.anInt6096 = 1024;
			this.anInt6086 = 2048;
		} else if (local12 == 9) {
			this.anInt6089 = 1024;
			this.anInt6086 = 4096;
			this.anInt6094 = 3;
			this.anInt6096 = 1024;
		} else if (local12 == 14) {
			this.anInt6096 = 768;
			this.anInt6089 = 1280;
			this.anInt6094 = 1;
			this.anInt6086 = 2048;
		} else if (local12 == 15) {
			this.anInt6094 = 1;
			this.anInt6086 = 4096;
			this.anInt6089 = 1536;
			this.anInt6096 = 512;
		} else if (local12 == 16) {
			this.anInt6089 = 1792;
			this.anInt6096 = 256;
			this.anInt6086 = 8192;
			this.anInt6094 = 1;
		} else {
			this.anInt6089 = 0;
			this.anInt6094 = 0;
			this.anInt6086 = 2048;
			this.anInt6096 = 2048;
		}
	}
}
