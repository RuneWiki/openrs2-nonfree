import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class85 {

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "Lclient!kp;")
	public Class4_Sub29 aClass4_Sub29_2;

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
	private int anInt2261;

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "I")
	private int anInt2266;

	@OriginalMember(owner = "client!eda", name = "i", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
	public int anInt2270;

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
	private int anInt2273;

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
	private int anInt2274;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	private Class85() {
		if (Static85.anIntArray116 == null) {
			Static523.method7047();
		}
		this.method2168();
	}

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!ha;Lclient!es;I)V")
	public Class85(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class4_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (Static85.anIntArray116 == null) {
			Static523.method7047();
		}
		this.anInt2270 = arg1.method8865();
		this.aBoolean153 = (this.anInt2270 & 0x8) != 0;
		this.aBoolean152 = (this.anInt2270 & 0x10) != 0;
		this.anInt2270 &= 0x7;
		@Pc(47) int local47 = arg1.method8859() << arg2;
		@Pc(53) int local53 = arg1.method8859() << arg2;
		@Pc(59) int local59 = arg1.method8859() << arg2;
		@Pc(63) int local63 = arg1.method8865();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray34 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray34.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method8859();
			local86 = local82 >>> 8;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local69 - local86 < local101) {
				local101 = local69 - local86;
			}
			this.aShortArray34[local75] = (short) (local86 << 8 | local101);
		}
		local63 = (local63 << Static273.anInt4424) + Static85.anInt1770;
		@Pc(153) int local153 = Static411.anIntArray448 == null ? Static84.anIntArray114[Static391.method5048(arg1.method8859()) & 0xFFFF] : Static411.anIntArray448[arg1.method8859()];
		local86 = arg1.method8865();
		this.anInt2273 = (local86 & 0xE0) << 3;
		this.anInt2272 = local86 & 0x1F;
		if (this.anInt2272 != 31) {
			this.method2168();
		}
		this.method2166(local59, arg0, local63, local153, local47, local53);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!ha;IIIII)V")
	private void method2166(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass4_Sub29_2 = arg1.method8075(arg4, arg0, arg5, arg2, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIII)V")
	public void method2167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2261 = arg2;
		this.anInt2265 = arg3;
		this.anInt2266 = arg1;
		this.anInt2274 = arg0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
	private void method2168() {
		@Pc(12) int local12 = this.anInt2272;
		if (local12 == 2) {
			this.anInt2265 = 2048;
			this.anInt2266 = 1;
			this.anInt2261 = 0;
			this.anInt2274 = 2048;
		} else if (local12 == 3) {
			this.anInt2261 = 0;
			this.anInt2274 = 2048;
			this.anInt2265 = 4096;
			this.anInt2266 = 1;
		} else if (local12 == 4) {
			this.anInt2265 = 2048;
			this.anInt2261 = 0;
			this.anInt2274 = 2048;
			this.anInt2266 = 4;
		} else if (local12 == 5) {
			this.anInt2261 = 0;
			this.anInt2266 = 4;
			this.anInt2265 = 8192;
			this.anInt2274 = 2048;
		} else if (local12 == 12) {
			this.anInt2261 = 0;
			this.anInt2266 = 2;
			this.anInt2274 = 2048;
			this.anInt2265 = 2048;
		} else if (local12 == 13) {
			this.anInt2266 = 2;
			this.anInt2274 = 2048;
			this.anInt2261 = 0;
			this.anInt2265 = 8192;
		} else if (local12 == 10) {
			this.anInt2265 = 2048;
			this.anInt2266 = 3;
			this.anInt2261 = 1536;
			this.anInt2274 = 512;
		} else if (local12 == 11) {
			this.anInt2266 = 3;
			this.anInt2261 = 1536;
			this.anInt2274 = 512;
			this.anInt2265 = 4096;
		} else if (local12 == 6) {
			this.anInt2266 = 3;
			this.anInt2274 = 768;
			this.anInt2261 = 1280;
			this.anInt2265 = 2048;
		} else if (local12 == 7) {
			this.anInt2261 = 1280;
			this.anInt2274 = 768;
			this.anInt2266 = 3;
			this.anInt2265 = 4096;
		} else if (local12 == 8) {
			this.anInt2265 = 2048;
			this.anInt2266 = 3;
			this.anInt2261 = 1024;
			this.anInt2274 = 1024;
		} else if (local12 == 9) {
			this.anInt2265 = 4096;
			this.anInt2261 = 1024;
			this.anInt2274 = 1024;
			this.anInt2266 = 3;
		} else if (local12 == 14) {
			this.anInt2266 = 1;
			this.anInt2261 = 1280;
			this.anInt2265 = 2048;
			this.anInt2274 = 768;
		} else if (local12 == 15) {
			this.anInt2274 = 512;
			this.anInt2266 = 1;
			this.anInt2265 = 4096;
			this.anInt2261 = 1536;
		} else if (local12 == 16) {
			this.anInt2265 = 8192;
			this.anInt2266 = 1;
			this.anInt2274 = 256;
			this.anInt2261 = 1792;
		} else {
			this.anInt2274 = 2048;
			this.anInt2266 = 0;
			this.anInt2261 = 0;
			this.anInt2265 = 2048;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZII)V")
	public void method2170(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15;
		if (arg0) {
			local15 = 2048;
		} else {
			@Pc(29) int local29 = arg1 * this.anInt2265 / 50 + this.anInt2273 & 0x7FF;
			@Pc(32) int local32 = this.anInt2266;
			if (local32 == 1) {
				local15 = (Class4_Sub2_Sub26.anIntArray563[local29 << 3] >> 4) + 1024;
			} else if (local32 == 3) {
				local15 = Static85.anIntArray116[local29] >> 1;
			} else if (local32 == 4) {
				local15 = local29 >> 10 << 11;
			} else if (local32 == 2) {
				local15 = local29;
			} else if (local32 == 5) {
				local15 = (local29 >= 1024 ? 2048 - local29 : local29) << 1;
			} else {
				local15 = 2048;
			}
		}
		this.aClass4_Sub29_2.method7625((float) (this.anInt2261 + (local15 * this.anInt2274 >> 11)) / 2048.0F);
	}
}
