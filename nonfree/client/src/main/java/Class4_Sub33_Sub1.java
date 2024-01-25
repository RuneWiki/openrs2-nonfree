import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class4_Sub33_Sub1 extends Class4_Sub33 {

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	private int anInt5300;

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "Z")
	public boolean aBoolean387;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
	private int anInt5302;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
	public int anInt5303;

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
	private int anInt5305;

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
	private int anInt5308;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
	private int anInt5309;

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
	public int anInt5312;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	private Class4_Sub33_Sub1() {
		if (Static295.anIntArray457 == null) {
			Static327.method5295();
		}
		this.method4561();
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class4_Sub33_Sub1(@OriginalArg(0) Class4_Sub11 arg0) {
		if (Static295.anIntArray457 == null) {
			Static327.method5295();
		}
		this.anInt5312 = arg0.method3440();
		this.aBoolean387 = (this.anInt5312 & 0x8) != 0;
		this.aBoolean388 = (this.anInt5312 & 0x10) != 0;
		this.anInt5312 &= 0x7;
		super.anInt5295 = arg0.method3401();
		super.anInt5298 = arg0.method3401();
		super.anInt5294 = arg0.method3401();
		super.anInt5292 = arg0.method3440();
		@Pc(68) int local68 = super.anInt5292 * 2 + 1;
		this.aShortArray88 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray88.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method3401();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local68 <= local85) {
				local85 = local68 - 1;
			}
			if (local68 - local85 < local89) {
				local89 = local68 - local85;
			}
			this.aShortArray88[local74] = (short) (local85 << 8 | local89);
		}
		super.anInt5292 = (super.anInt5292 << 7) + 64;
		if (Static26.anIntArray24 == null) {
			super.anInt5293 = Static194.anIntArray340[Static162.method3167(arg0.method3401()) & 0xFFFF];
		} else {
			super.anInt5293 = Static26.anIntArray24[arg0.method3401()];
		}
		@Pc(165) int local165 = arg0.method3440();
		this.anInt5308 = (local165 & 0xE0) << 3;
		this.anInt5303 = local165 & 0x1F;
		if (this.anInt5303 != 31) {
			this.method4561();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	private void method4561() {
		@Pc(8) int local8 = this.anInt5303;
		if (local8 == 2) {
			this.anInt5302 = 2048;
			this.anInt5300 = 2048;
			this.anInt5309 = 1;
			this.anInt5305 = 0;
		} else if (local8 == 3) {
			this.anInt5302 = 2048;
			this.anInt5309 = 1;
			this.anInt5305 = 0;
			this.anInt5300 = 4096;
		} else if (local8 == 4) {
			this.anInt5300 = 2048;
			this.anInt5309 = 4;
			this.anInt5305 = 0;
			this.anInt5302 = 2048;
		} else if (local8 == 5) {
			this.anInt5309 = 4;
			this.anInt5305 = 0;
			this.anInt5300 = 8192;
			this.anInt5302 = 2048;
		} else if (local8 == 12) {
			this.anInt5302 = 2048;
			this.anInt5300 = 2048;
			this.anInt5309 = 2;
			this.anInt5305 = 0;
		} else if (local8 == 13) {
			this.anInt5300 = 8192;
			this.anInt5302 = 2048;
			this.anInt5309 = 2;
			this.anInt5305 = 0;
		} else if (local8 == 10) {
			this.anInt5309 = 3;
			this.anInt5302 = 512;
			this.anInt5305 = 1536;
			this.anInt5300 = 2048;
		} else if (local8 == 11) {
			this.anInt5305 = 1536;
			this.anInt5309 = 3;
			this.anInt5302 = 512;
			this.anInt5300 = 4096;
		} else if (local8 == 6) {
			this.anInt5302 = 768;
			this.anInt5300 = 2048;
			this.anInt5309 = 3;
			this.anInt5305 = 1280;
		} else if (local8 == 7) {
			this.anInt5300 = 4096;
			this.anInt5305 = 1280;
			this.anInt5309 = 3;
			this.anInt5302 = 768;
		} else if (local8 == 8) {
			this.anInt5302 = 1024;
			this.anInt5309 = 3;
			this.anInt5305 = 1024;
			this.anInt5300 = 2048;
		} else if (local8 == 9) {
			this.anInt5305 = 1024;
			this.anInt5302 = 1024;
			this.anInt5300 = 4096;
			this.anInt5309 = 3;
		} else if (local8 == 14) {
			this.anInt5309 = 1;
			this.anInt5300 = 2048;
			this.anInt5302 = 768;
			this.anInt5305 = 1280;
		} else if (local8 == 15) {
			this.anInt5300 = 4096;
			this.anInt5305 = 1536;
			this.anInt5309 = 1;
			this.anInt5302 = 512;
		} else if (local8 == 16) {
			this.anInt5302 = 256;
			this.anInt5300 = 8192;
			this.anInt5305 = 1792;
			this.anInt5309 = 1;
		} else {
			this.anInt5309 = 0;
			this.anInt5302 = 2048;
			this.anInt5305 = 0;
			this.anInt5300 = 2048;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BIZ)V")
	public void method4563(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13;
		if (arg1) {
			local13 = 2048;
		} else {
			@Pc(27) int local27 = this.anInt5308 + this.anInt5300 * arg0 / 50 & 0x7FF;
			@Pc(30) int local30 = this.anInt5309;
			if (local30 == 1) {
				local13 = (Class118_Sub1.anIntArray314[local27 << 3] >> 5) + 1024;
			} else if (local30 == 3) {
				local13 = Static295.anIntArray457[local27] >> 1;
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
		super.aFloat85 = (float) (this.anInt5305 + (this.anInt5302 * local13 >> 11)) / 2048.0F;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
	public void method4564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5309 = arg1;
		this.anInt5305 = arg2;
		this.anInt5302 = arg3;
		this.anInt5300 = arg0;
	}
}
