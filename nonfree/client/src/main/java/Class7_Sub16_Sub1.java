import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class7_Sub16_Sub1 extends Class7_Sub16 {

	@OriginalMember(owner = "client!mp", name = "D", descriptor = "Z")
	public boolean aBoolean318;

	@OriginalMember(owner = "client!mp", name = "F", descriptor = "I")
	private int anInt4083;

	@OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
	private int anInt4087;

	@OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
	public int anInt4088;

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!mp", name = "P", descriptor = "I")
	private int anInt4091;

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "I")
	private int anInt4092;

	@OriginalMember(owner = "client!mp", name = "R", descriptor = "I")
	private int anInt4093;

	@OriginalMember(owner = "client!mp", name = "S", descriptor = "Z")
	public boolean aBoolean319;

	@OriginalMember(owner = "client!mp", name = "V", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	private Class7_Sub16_Sub1() {
		if (Static51.anIntArray206 == null) {
			Static37.method835();
		}
		this.method3644();
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class7_Sub16_Sub1(@OriginalArg(0) Class7_Sub3 arg0) {
		if (Static51.anIntArray206 == null) {
			Static37.method835();
		}
		this.anInt4088 = arg0.method2772();
		this.aBoolean319 = (this.anInt4088 & 0x8) != 0;
		this.aBoolean318 = (this.anInt4088 & 0x10) != 0;
		this.anInt4088 &= 0x7;
		super.anInt4070 = arg0.method2764();
		super.anInt4072 = arg0.method2764();
		super.anInt4074 = arg0.method2764();
		super.anInt4076 = arg0.method2772();
		@Pc(63) int local63 = super.anInt4076 * 2 + 1;
		this.aShortArray70 = new short[local63];
		for (@Pc(69) int local69 = 0; local69 < this.aShortArray70.length; local69++) {
			@Pc(75) short local75 = (short) arg0.method2764();
			@Pc(79) int local79 = local75 >>> 8;
			if (local79 >= local63) {
				local79 = local63 - 1;
			}
			@Pc(90) int local90 = local75 & 0xFF;
			if (local63 - local79 < local90) {
				local90 = local63 - local79;
			}
			this.aShortArray70[local69] = (short) (local79 << 8 | local90);
		}
		super.anInt4076 = (super.anInt4076 << 7) + 64;
		if (Static80.anIntArray288 == null) {
			super.anInt4075 = Static200.anIntArray548[Static110.method2132(arg0.method2764()) & 0xFFFF];
		} else {
			super.anInt4075 = Static80.anIntArray288[arg0.method2764()];
		}
		@Pc(158) int local158 = arg0.method2772();
		this.anInt4089 = local158 & 0x1F;
		this.anInt4093 = (local158 & 0xE0) << 3;
		if (this.anInt4089 != 31) {
			this.method3644();
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(Z)V")
	private void method3644() {
		@Pc(7) int local7 = this.anInt4089;
		if (local7 == 2) {
			this.anInt4091 = 1;
			this.anInt4083 = 2048;
			this.anInt4087 = 0;
			this.anInt4092 = 2048;
		} else if (local7 == 3) {
			this.anInt4091 = 1;
			this.anInt4087 = 0;
			this.anInt4083 = 4096;
			this.anInt4092 = 2048;
		} else if (local7 == 4) {
			this.anInt4092 = 2048;
			this.anInt4091 = 4;
			this.anInt4083 = 2048;
			this.anInt4087 = 0;
		} else if (local7 == 5) {
			this.anInt4087 = 0;
			this.anInt4083 = 8192;
			this.anInt4091 = 4;
			this.anInt4092 = 2048;
		} else if (local7 == 12) {
			this.anInt4092 = 2048;
			this.anInt4087 = 0;
			this.anInt4083 = 2048;
			this.anInt4091 = 2;
		} else if (local7 == 13) {
			this.anInt4083 = 8192;
			this.anInt4091 = 2;
			this.anInt4092 = 2048;
			this.anInt4087 = 0;
		} else if (local7 == 10) {
			this.anInt4092 = 512;
			this.anInt4087 = 1536;
			this.anInt4091 = 3;
			this.anInt4083 = 2048;
		} else if (local7 == 11) {
			this.anInt4087 = 1536;
			this.anInt4092 = 512;
			this.anInt4083 = 4096;
			this.anInt4091 = 3;
		} else if (local7 == 6) {
			this.anInt4092 = 768;
			this.anInt4091 = 3;
			this.anInt4083 = 2048;
			this.anInt4087 = 1280;
		} else if (local7 == 7) {
			this.anInt4083 = 4096;
			this.anInt4092 = 768;
			this.anInt4087 = 1280;
			this.anInt4091 = 3;
		} else if (local7 == 8) {
			this.anInt4087 = 1024;
			this.anInt4083 = 2048;
			this.anInt4091 = 3;
			this.anInt4092 = 1024;
		} else if (local7 == 9) {
			this.anInt4087 = 1024;
			this.anInt4091 = 3;
			this.anInt4083 = 4096;
			this.anInt4092 = 1024;
		} else if (local7 == 14) {
			this.anInt4083 = 2048;
			this.anInt4092 = 768;
			this.anInt4091 = 1;
			this.anInt4087 = 1280;
		} else if (local7 == 15) {
			this.anInt4087 = 1536;
			this.anInt4083 = 4096;
			this.anInt4091 = 1;
			this.anInt4092 = 512;
		} else if (local7 == 16) {
			this.anInt4092 = 256;
			this.anInt4087 = 1792;
			this.anInt4083 = 8192;
			this.anInt4091 = 1;
		} else {
			this.anInt4092 = 2048;
			this.anInt4083 = 2048;
			this.anInt4091 = 0;
			this.anInt4087 = 0;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBZ)V")
	public void method3645(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15;
		if (arg1) {
			local15 = 2048;
		} else {
			@Pc(28) int local28 = this.anInt4093 + arg0 * this.anInt4083 / 50 & 0x7FF;
			@Pc(31) int local31 = this.anInt4091;
			if (local31 == 1) {
				local15 = (Class147.anIntArray604[local28 << 3] >> 5) + 1024;
			} else if (local31 == 3) {
				local15 = Static51.anIntArray206[local28] >> 1;
			} else if (local31 == 4) {
				local15 = local28 >> 10 << 11;
			} else if (local31 == 2) {
				local15 = local28;
			} else if (local31 == 5) {
				local15 = (local28 < 1024 ? local28 : 2048 - local28) << 1;
			} else {
				local15 = 2048;
			}
		}
		super.aFloat55 = (float) ((this.anInt4092 * local15 >> 11) + this.anInt4087) / 2048.0F;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIII)V")
	public void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4083 = arg3;
		this.anInt4092 = arg1;
		this.anInt4087 = arg2;
		this.anInt4091 = arg0;
	}
}
