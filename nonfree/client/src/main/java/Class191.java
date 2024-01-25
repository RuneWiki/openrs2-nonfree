import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class191 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[S")
	public short[] aShortArray189;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private int anInt5561;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public int anInt5562;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!vp;")
	public Class4_Sub21 aClass4_Sub21_2;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	private int anInt5565;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt5566;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	private int anInt5567;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	private int anInt5568;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public int anInt5570;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Z")
	public boolean aBoolean499;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Z")
	public boolean aBoolean500;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class191() {
		if (Static119.anIntArray169 == null) {
			Static244.method2568();
		}
		this.method4333();
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!ya;Lclient!iv;I)V")
	public Class191(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class4_Sub12 arg1, @OriginalArg(2) int arg2) {
		if (Static119.anIntArray169 == null) {
			Static244.method2568();
		}
		this.anInt5570 = arg1.method2490();
		this.aBoolean499 = (this.anInt5570 & 0x8) != 0;
		this.aBoolean500 = (this.anInt5570 & 0x10) != 0;
		this.anInt5570 &= 0x7;
		@Pc(50) int local50 = arg1.method2536() << arg2;
		@Pc(56) int local56 = arg1.method2536() << arg2;
		@Pc(62) int local62 = arg1.method2536() << arg2;
		@Pc(66) int local66 = arg1.method2490();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray189 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray189.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method2536();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local72 <= local89) {
				local89 = local72 - 1;
			}
			if (local93 > local72 - local89) {
				local93 = local72 - local89;
			}
			this.aShortArray189[local78] = (short) (local93 | local89 << 8);
		}
		local66 = (local66 << Static231.anInt4434) + Static333.anInt5747;
		@Pc(160) int local160 = Static72.anIntArray115 == null ? Static335.anIntArray423[Static82.method1470(arg1.method2536()) & 0xFFFF] : Static72.anIntArray115[arg1.method2536()];
		local89 = arg1.method2490();
		this.anInt5562 = local89 & 0x1F;
		this.anInt5566 = (local89 & 0xE0) << 3;
		if (this.anInt5562 != 31) {
			this.method4333();
		}
		this.method4338(arg0, local50, local56, local62, local160, local66);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZI)V")
	public void method4332(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) int local14;
		if (arg1) {
			local14 = 2048;
		} else {
			@Pc(28) int local28 = arg0 * this.anInt5568 / 50 + this.anInt5566 & 0x7FF;
			@Pc(31) int local31 = this.anInt5567;
			if (local31 == 1) {
				local14 = (Class50_Sub1.anIntArray225[local28 << 3] >> 5) + 1024;
			} else if (local31 == 3) {
				local14 = Static119.anIntArray169[local28] >> 1;
			} else if (local31 == 4) {
				local14 = local28 >> 10 << 11;
			} else if (local31 == 2) {
				local14 = local28;
			} else if (local31 == 5) {
				local14 = (local28 < 1024 ? local28 : 2048 - local28) << 1;
			} else {
				local14 = 2048;
			}
		}
		this.aClass4_Sub21_2.method3158((float) (this.anInt5565 + (this.anInt5561 * local14 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	private void method4333() {
		@Pc(12) int local12 = this.anInt5562;
		if (local12 == 2) {
			this.anInt5565 = 0;
			this.anInt5567 = 1;
			this.anInt5561 = 2048;
			this.anInt5568 = 2048;
		} else if (local12 == 3) {
			this.anInt5565 = 0;
			this.anInt5561 = 2048;
			this.anInt5568 = 4096;
			this.anInt5567 = 1;
		} else if (local12 == 4) {
			this.anInt5567 = 4;
			this.anInt5568 = 2048;
			this.anInt5565 = 0;
			this.anInt5561 = 2048;
		} else if (local12 == 5) {
			this.anInt5568 = 8192;
			this.anInt5561 = 2048;
			this.anInt5567 = 4;
			this.anInt5565 = 0;
		} else if (local12 == 12) {
			this.anInt5565 = 0;
			this.anInt5568 = 2048;
			this.anInt5561 = 2048;
			this.anInt5567 = 2;
		} else if (local12 == 13) {
			this.anInt5561 = 2048;
			this.anInt5565 = 0;
			this.anInt5567 = 2;
			this.anInt5568 = 8192;
		} else if (local12 == 10) {
			this.anInt5565 = 1536;
			this.anInt5561 = 512;
			this.anInt5568 = 2048;
			this.anInt5567 = 3;
		} else if (local12 == 11) {
			this.anInt5565 = 1536;
			this.anInt5568 = 4096;
			this.anInt5561 = 512;
			this.anInt5567 = 3;
		} else if (local12 == 6) {
			this.anInt5561 = 768;
			this.anInt5565 = 1280;
			this.anInt5568 = 2048;
			this.anInt5567 = 3;
		} else if (local12 == 7) {
			this.anInt5561 = 768;
			this.anInt5565 = 1280;
			this.anInt5568 = 4096;
			this.anInt5567 = 3;
		} else if (local12 == 8) {
			this.anInt5568 = 2048;
			this.anInt5561 = 1024;
			this.anInt5567 = 3;
			this.anInt5565 = 1024;
		} else if (local12 == 9) {
			this.anInt5561 = 1024;
			this.anInt5568 = 4096;
			this.anInt5567 = 3;
			this.anInt5565 = 1024;
		} else if (local12 == 14) {
			this.anInt5567 = 1;
			this.anInt5561 = 768;
			this.anInt5568 = 2048;
			this.anInt5565 = 1280;
		} else if (local12 == 15) {
			this.anInt5567 = 1;
			this.anInt5565 = 1536;
			this.anInt5568 = 4096;
			this.anInt5561 = 512;
		} else if (local12 == 16) {
			this.anInt5561 = 256;
			this.anInt5567 = 1;
			this.anInt5565 = 1792;
			this.anInt5568 = 8192;
		} else {
			this.anInt5568 = 2048;
			this.anInt5561 = 2048;
			this.anInt5565 = 0;
			this.anInt5567 = 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIB)V")
	public void method4334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5565 = arg3;
		this.anInt5567 = arg0;
		this.anInt5568 = arg1;
		this.anInt5561 = arg2;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ya;IIIIII)V")
	private void method4338(@OriginalArg(0) Class19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass4_Sub21_2 = arg0.method4310(arg1, arg3, arg2, arg5, arg4, 1.0F);
	}
}
