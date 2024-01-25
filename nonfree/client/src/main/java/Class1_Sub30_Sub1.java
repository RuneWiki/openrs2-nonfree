import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class1_Sub30_Sub1 extends Class1_Sub30 {

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	private int anInt5302;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
	private int anInt5304;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "Z")
	public boolean aBoolean511;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
	public int anInt5307;

	@OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
	private int anInt5308;

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "Z")
	public boolean aBoolean512;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
	public int anInt5311;

	@OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
	private int anInt5312;

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	private Class1_Sub30_Sub1() {
		if (Static271.anIntArray461 == null) {
			Static51.method1311();
		}
		this.method4621();
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!bg;)V")
	public Class1_Sub30_Sub1(@OriginalArg(0) Class1_Sub8 arg0) {
		if (Static271.anIntArray461 == null) {
			Static51.method1311();
		}
		this.anInt5311 = arg0.method4532();
		this.aBoolean511 = (this.anInt5311 & 0x10) != 0;
		this.aBoolean512 = (this.anInt5311 & 0x8) != 0;
		this.anInt5311 &= 0x7;
		super.anInt5299 = arg0.method4556();
		super.anInt5297 = arg0.method4556();
		super.anInt5298 = arg0.method4556();
		super.anInt5300 = arg0.method4532();
		@Pc(71) int local71 = super.anInt5300 * 2 + 1;
		this.aShortArray104 = new short[local71];
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray104.length; local77++) {
			@Pc(84) short local84 = (short) arg0.method4556();
			@Pc(88) int local88 = local84 >>> 8;
			@Pc(92) int local92 = local84 & 0xFF;
			if (local88 >= local71) {
				local88 = local71 - 1;
			}
			if (local92 > local71 - local88) {
				local92 = local71 - local88;
			}
			this.aShortArray104[local77] = (short) (local88 << 8 | local92);
		}
		super.anInt5300 = (super.anInt5300 << 7) + 64;
		if (Static177.anIntArray371 == null) {
			super.anInt5301 = Static102.anIntArray226[Static64.method1567(arg0.method4556()) & 0xFFFF];
		} else {
			super.anInt5301 = Static177.anIntArray371[arg0.method4556()];
		}
		@Pc(164) int local164 = arg0.method4532();
		this.anInt5312 = (local164 & 0xE0) << 3;
		this.anInt5307 = local164 & 0x1F;
		if (this.anInt5307 != 31) {
			this.method4621();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZZ)V")
	public void method4618(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(64) int local64;
		if (arg1) {
			local64 = 2048;
		} else {
			@Pc(26) int local26 = this.anInt5312 + arg0 * this.anInt5308 / 50 & 0x7FF;
			@Pc(29) int local29 = this.anInt5302;
			if (local29 == 1) {
				local64 = (Class1_Sub3_Sub8.anIntArray159[local26 << 3] >> 5) + 1024;
			} else if (local29 == 3) {
				local64 = Static271.anIntArray461[local26] >> 1;
			} else if (local29 == 4) {
				local64 = local26 >> 10 << 11;
			} else if (local29 == 2) {
				local64 = local26;
			} else if (local29 == 5) {
				local64 = (local26 < 1024 ? local26 : 2048 - local26) << 1;
			} else {
				local64 = 2048;
			}
		}
		super.aFloat74 = (float) ((this.anInt5304 * local64 >> 11) + this.anInt5315) / 2048.0F;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	private void method4621() {
		@Pc(8) int local8 = this.anInt5307;
		if (local8 == 2) {
			this.anInt5308 = 2048;
			this.anInt5302 = 1;
			this.anInt5315 = 0;
			this.anInt5304 = 2048;
		} else if (local8 == 3) {
			this.anInt5302 = 1;
			this.anInt5315 = 0;
			this.anInt5308 = 4096;
			this.anInt5304 = 2048;
		} else if (local8 == 4) {
			this.anInt5315 = 0;
			this.anInt5308 = 2048;
			this.anInt5302 = 4;
			this.anInt5304 = 2048;
		} else if (local8 == 5) {
			this.anInt5315 = 0;
			this.anInt5304 = 2048;
			this.anInt5308 = 8192;
			this.anInt5302 = 4;
		} else if (local8 == 12) {
			this.anInt5308 = 2048;
			this.anInt5304 = 2048;
			this.anInt5315 = 0;
			this.anInt5302 = 2;
		} else if (local8 == 13) {
			this.anInt5315 = 0;
			this.anInt5304 = 2048;
			this.anInt5308 = 8192;
			this.anInt5302 = 2;
		} else if (local8 == 10) {
			this.anInt5315 = 1536;
			this.anInt5308 = 2048;
			this.anInt5302 = 3;
			this.anInt5304 = 512;
		} else if (local8 == 11) {
			this.anInt5315 = 1536;
			this.anInt5308 = 4096;
			this.anInt5302 = 3;
			this.anInt5304 = 512;
		} else if (local8 == 6) {
			this.anInt5304 = 768;
			this.anInt5308 = 2048;
			this.anInt5315 = 1280;
			this.anInt5302 = 3;
		} else if (local8 == 7) {
			this.anInt5315 = 1280;
			this.anInt5308 = 4096;
			this.anInt5302 = 3;
			this.anInt5304 = 768;
		} else if (local8 == 8) {
			this.anInt5315 = 1024;
			this.anInt5308 = 2048;
			this.anInt5302 = 3;
			this.anInt5304 = 1024;
		} else if (local8 == 9) {
			this.anInt5304 = 1024;
			this.anInt5315 = 1024;
			this.anInt5308 = 4096;
			this.anInt5302 = 3;
		} else if (local8 == 14) {
			this.anInt5304 = 768;
			this.anInt5315 = 1280;
			this.anInt5308 = 2048;
			this.anInt5302 = 1;
		} else if (local8 == 15) {
			this.anInt5302 = 1;
			this.anInt5304 = 512;
			this.anInt5315 = 1536;
			this.anInt5308 = 4096;
		} else if (local8 == 16) {
			this.anInt5308 = 8192;
			this.anInt5304 = 256;
			this.anInt5315 = 1792;
			this.anInt5302 = 1;
		} else {
			this.anInt5304 = 2048;
			this.anInt5308 = 2048;
			this.anInt5302 = 0;
			this.anInt5315 = 0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
	public void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5308 = arg0;
		this.anInt5302 = arg2;
		this.anInt5304 = arg1;
		this.anInt5315 = arg3;
	}
}
