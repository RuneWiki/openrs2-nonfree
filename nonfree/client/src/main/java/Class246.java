import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class246 {

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[16384];

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[16384];

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "Z")
	public boolean aBoolean565;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Z")
	public boolean aBoolean566;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	public int anInt7226;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
	public int anInt7230;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
	private int anInt7233;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "Lclient!vj;")
	public Class3_Sub16 aClass3_Sub16_3;

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
	private int anInt7234;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
	private int anInt7236;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
	private int anInt7238;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
	private int anInt7240;

	static {
		@Pc(107) double local107 = 3.834951969714103E-4D;
		for (@Pc(109) int local109 = 0; local109 < 16384; local109++) {
			aFloatArray70[local109] = (float) Math.sin(local107 * (double) local109);
			aFloatArray69[local109] = (float) Math.cos(local107 * (double) local109);
		}
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	private Class246() {
		if (Static244.anIntArray245 == null) {
			Static602.method8288();
		}
		this.method6055();
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!ha;Lclient!rba;I)V")
	public Class246(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class3_Sub28 arg1, @OriginalArg(2) int arg2) {
		if (Static244.anIntArray245 == null) {
			Static602.method8288();
		}
		this.anInt7230 = arg1.method5322(-112);
		this.aBoolean565 = (this.anInt7230 & 0x10) != 0;
		this.aBoolean566 = (this.anInt7230 & 0x8) != 0;
		this.anInt7230 &= 0x7;
		@Pc(49) int local49 = arg1.method5272() << arg2;
		@Pc(55) int local55 = arg1.method5272() << arg2;
		@Pc(61) int local61 = arg1.method5272() << arg2;
		@Pc(65) int local65 = arg1.method5322(-93);
		@Pc(71) int local71 = local65 * 2 + 1;
		this.aShortArray123 = new short[local71];
		@Pc(90) int local90;
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray123.length; local77++) {
			@Pc(86) short local86 = (short) arg1.method5272();
			local90 = local86 >>> 8;
			@Pc(94) int local94 = local86 & 0xFF;
			if (local90 >= local71) {
				local90 = local71 - 1;
			}
			if (local71 - local90 < local94) {
				local94 = local71 - local90;
			}
			this.aShortArray123[local77] = (short) (local90 << 8 | local94);
		}
		local65 = (local65 << Static394.anInt7067) + Static198.anInt3490;
		@Pc(170) int local170 = Static305.anIntArray309 == null ? Static179.anIntArray162[Static702.method9174(arg1.method5272()) & 0xFFFF] : Static305.anIntArray309[arg1.method5272()];
		local90 = arg1.method5322(-41);
		this.anInt7233 = (local90 & 0xE0) << 3;
		this.anInt7226 = local90 & 0x1F;
		if (this.anInt7226 != 31) {
			this.method6055();
		}
		this.method6060(arg0, local170, local61, local65, local49, local55);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZZ)V")
	public void method6053(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) int local14;
		if (arg1) {
			local14 = 2048;
		} else {
			@Pc(28) int local28 = this.anInt7234 * arg0 / 50 + this.anInt7233 & 0x7FF;
			@Pc(31) int local31 = this.anInt7240;
			if (local31 == 1) {
				local14 = (Class3_Sub2_Sub21.anIntArray358[local28 << 3] >> 4) + 1024;
			} else if (local31 == 3) {
				local14 = Static244.anIntArray245[local28] >> 1;
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
		this.aClass3_Sub16_3.method6321((float) ((this.anInt7238 * local14 >> 11) + this.anInt7236) / 2048.0F);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	private void method6055() {
		@Pc(13) int local13 = this.anInt7226;
		if (local13 == 2) {
			this.anInt7240 = 1;
			this.anInt7236 = 0;
			this.anInt7234 = 2048;
			this.anInt7238 = 2048;
		} else if (local13 == 3) {
			this.anInt7238 = 2048;
			this.anInt7236 = 0;
			this.anInt7240 = 1;
			this.anInt7234 = 4096;
		} else if (local13 == 4) {
			this.anInt7238 = 2048;
			this.anInt7236 = 0;
			this.anInt7234 = 2048;
			this.anInt7240 = 4;
		} else if (local13 == 5) {
			this.anInt7236 = 0;
			this.anInt7234 = 8192;
			this.anInt7238 = 2048;
			this.anInt7240 = 4;
		} else if (local13 == 12) {
			this.anInt7240 = 2;
			this.anInt7234 = 2048;
			this.anInt7238 = 2048;
			this.anInt7236 = 0;
		} else if (local13 == 13) {
			this.anInt7234 = 8192;
			this.anInt7238 = 2048;
			this.anInt7240 = 2;
			this.anInt7236 = 0;
		} else if (local13 == 10) {
			this.anInt7240 = 3;
			this.anInt7234 = 2048;
			this.anInt7238 = 512;
			this.anInt7236 = 1536;
		} else if (local13 == 11) {
			this.anInt7240 = 3;
			this.anInt7234 = 4096;
			this.anInt7236 = 1536;
			this.anInt7238 = 512;
		} else if (local13 == 6) {
			this.anInt7234 = 2048;
			this.anInt7238 = 768;
			this.anInt7236 = 1280;
			this.anInt7240 = 3;
		} else if (local13 == 7) {
			this.anInt7234 = 4096;
			this.anInt7236 = 1280;
			this.anInt7238 = 768;
			this.anInt7240 = 3;
		} else if (local13 == 8) {
			this.anInt7240 = 3;
			this.anInt7234 = 2048;
			this.anInt7238 = 1024;
			this.anInt7236 = 1024;
		} else if (local13 == 9) {
			this.anInt7238 = 1024;
			this.anInt7234 = 4096;
			this.anInt7240 = 3;
			this.anInt7236 = 1024;
		} else if (local13 == 14) {
			this.anInt7234 = 2048;
			this.anInt7238 = 768;
			this.anInt7236 = 1280;
			this.anInt7240 = 1;
		} else if (local13 == 15) {
			this.anInt7240 = 1;
			this.anInt7234 = 4096;
			this.anInt7236 = 1536;
			this.anInt7238 = 512;
		} else if (local13 == 16) {
			this.anInt7238 = 256;
			this.anInt7240 = 1;
			this.anInt7234 = 8192;
			this.anInt7236 = 1792;
		} else {
			this.anInt7238 = 2048;
			this.anInt7240 = 0;
			this.anInt7234 = 2048;
			this.anInt7236 = 0;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	private void method6060(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub16_3 = arg0.method7703(arg4, arg2, arg5, arg3, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V")
	public void method6062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7240 = arg1;
		this.anInt7238 = arg2;
		this.anInt7236 = arg3;
		this.anInt7234 = arg0;
	}
}
