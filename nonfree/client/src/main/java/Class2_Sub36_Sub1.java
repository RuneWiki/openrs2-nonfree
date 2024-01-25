import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class2_Sub36_Sub1 extends Class2_Sub36 {

	@OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
	private int anInt5118;

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
	private int anInt5120;

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "Z")
	public boolean aBoolean467;

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
	private int anInt5123;

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	public int anInt5126;

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
	private int anInt5128;

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	public int anInt5129;

	@OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
	private int anInt5130;

	static {
		new Class93(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Class93(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	private Class2_Sub36_Sub1() {
		if (Static218.anIntArray332 == null) {
			Static141.method2770();
		}
		this.method4673();
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!dg;)V")
	public Class2_Sub36_Sub1(@OriginalArg(0) Class2_Sub10 arg0) {
		if (Static218.anIntArray332 == null) {
			Static141.method2770();
		}
		this.anInt5129 = arg0.method4421();
		this.aBoolean467 = (this.anInt5129 & 0x8) != 0;
		this.aBoolean468 = (this.anInt5129 & 0x10) != 0;
		this.anInt5129 &= 0x7;
		super.anInt5111 = arg0.method4464();
		super.anInt5115 = arg0.method4464();
		super.anInt5109 = arg0.method4464();
		super.anInt5108 = arg0.method4421();
		@Pc(65) int local65 = super.anInt5108 * 2 + 1;
		this.aShortArray77 = new short[local65];
		for (@Pc(71) int local71 = 0; local71 < this.aShortArray77.length; local71++) {
			@Pc(78) short local78 = (short) arg0.method4464();
			@Pc(82) int local82 = local78 >>> 8;
			if (local65 <= local82) {
				local82 = local65 - 1;
			}
			@Pc(93) int local93 = local78 & 0xFF;
			if (local93 > local65 - local82) {
				local93 = local65 - local82;
			}
			this.aShortArray77[local71] = (short) (local93 | local82 << 8);
		}
		super.anInt5108 = (super.anInt5108 << 7) + 64;
		if (Static267.anIntArray400 == null) {
			super.anInt5117 = Static120.anIntArray232[Static39.method939(arg0.method4464()) & 0xFFFF];
		} else {
			super.anInt5117 = Static267.anIntArray400[arg0.method4464()];
		}
		@Pc(158) int local158 = arg0.method4421();
		this.anInt5126 = local158 & 0x1F;
		this.anInt5128 = (local158 & 0xE0) << 3;
		if (this.anInt5126 != 31) {
			this.method4673();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BIIII)V")
	public void method4672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5118 = arg1;
		this.anInt5130 = arg0;
		this.anInt5120 = arg2;
		this.anInt5123 = arg3;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
	private void method4673() {
		@Pc(4) int local4 = this.anInt5126;
		if (local4 == 2) {
			this.anInt5120 = 0;
			this.anInt5123 = 2048;
			this.anInt5130 = 2048;
			this.anInt5118 = 1;
		} else if (local4 == 3) {
			this.anInt5123 = 2048;
			this.anInt5118 = 1;
			this.anInt5120 = 0;
			this.anInt5130 = 4096;
		} else if (local4 == 4) {
			this.anInt5123 = 2048;
			this.anInt5130 = 2048;
			this.anInt5120 = 0;
			this.anInt5118 = 4;
		} else if (local4 == 5) {
			this.anInt5118 = 4;
			this.anInt5120 = 0;
			this.anInt5130 = 8192;
			this.anInt5123 = 2048;
		} else if (local4 == 12) {
			this.anInt5123 = 2048;
			this.anInt5120 = 0;
			this.anInt5130 = 2048;
			this.anInt5118 = 2;
		} else if (local4 == 13) {
			this.anInt5118 = 2;
			this.anInt5120 = 0;
			this.anInt5130 = 8192;
			this.anInt5123 = 2048;
		} else if (local4 == 10) {
			this.anInt5123 = 512;
			this.anInt5130 = 2048;
			this.anInt5118 = 3;
			this.anInt5120 = 1536;
		} else if (local4 == 11) {
			this.anInt5123 = 512;
			this.anInt5130 = 4096;
			this.anInt5120 = 1536;
			this.anInt5118 = 3;
		} else if (local4 == 6) {
			this.anInt5118 = 3;
			this.anInt5120 = 1280;
			this.anInt5123 = 768;
			this.anInt5130 = 2048;
		} else if (local4 == 7) {
			this.anInt5118 = 3;
			this.anInt5123 = 768;
			this.anInt5130 = 4096;
			this.anInt5120 = 1280;
		} else if (local4 == 8) {
			this.anInt5120 = 1024;
			this.anInt5118 = 3;
			this.anInt5123 = 1024;
			this.anInt5130 = 2048;
		} else if (local4 == 9) {
			this.anInt5120 = 1024;
			this.anInt5130 = 4096;
			this.anInt5123 = 1024;
			this.anInt5118 = 3;
		} else if (local4 == 14) {
			this.anInt5130 = 2048;
			this.anInt5123 = 768;
			this.anInt5120 = 1280;
			this.anInt5118 = 1;
		} else if (local4 == 15) {
			this.anInt5130 = 4096;
			this.anInt5118 = 1;
			this.anInt5120 = 1536;
			this.anInt5123 = 512;
		} else if (local4 == 16) {
			this.anInt5123 = 256;
			this.anInt5130 = 8192;
			this.anInt5120 = 1792;
			this.anInt5118 = 1;
		} else {
			this.anInt5130 = 2048;
			this.anInt5118 = 0;
			this.anInt5120 = 0;
			this.anInt5123 = 2048;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
	public void method4676(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt5128 + arg0 * this.anInt5130 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt5118;
			if (local26 == 1) {
				local9 = (Class24.anIntArray35[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static218.anIntArray332[local23] >> 1;
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
		super.aFloat71 = (float) ((this.anInt5123 * local9 >> 11) + this.anInt5120) / 2048.0F;
	}
}
