import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class68 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	public int anInt2166;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	private int anInt2167;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	private int anInt2168;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Z")
	public boolean aBoolean161;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	private int anInt2169;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	private int anInt2170;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	private int anInt2173;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Z")
	public boolean aBoolean162;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	public int anInt2176;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!raa;")
	public Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	private Class68() {
		if (Static97.anIntArray126 == null) {
			Static516.method7741();
		}
		this.method1830();
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ha;Lclient!rg;I)V")
	public Class68(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class6_Sub40 arg1, @OriginalArg(2) int arg2) {
		if (Static97.anIntArray126 == null) {
			Static516.method7741();
		}
		this.anInt2166 = arg1.method8604();
		this.aBoolean162 = (this.anInt2166 & 0x10) != 0;
		this.aBoolean161 = (this.anInt2166 & 0x8) != 0;
		this.anInt2166 &= 0x7;
		@Pc(47) int local47 = arg1.method8571() << arg2;
		@Pc(53) int local53 = arg1.method8571() << arg2;
		@Pc(59) int local59 = arg1.method8571() << arg2;
		@Pc(63) int local63 = arg1.method8604();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray49 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray49.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method8571();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray49[local75] = (short) (local90 | local86 << 8);
		}
		local63 = (local63 << Static643.anInt10682) + Static557.anInt9470;
		@Pc(161) int local161 = Static91.anIntArray99 == null ? Static152.anIntArray292[Static163.method3033(arg1.method8571()) & 0xFFFF] : Static91.anIntArray99[arg1.method8571()];
		local86 = arg1.method8604();
		this.anInt2173 = (local86 & 0xE0) << 3;
		this.anInt2176 = local86 & 0x1F;
		if (this.anInt2176 != 31) {
			this.method1830();
		}
		this.method1828(local47, local59, local161, local63, local53, arg0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZI)V")
	public void method1827(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) int local17;
		if (arg1) {
			local17 = 2048;
		} else {
			@Pc(31) int local31 = arg0 * this.anInt2169 / 50 + this.anInt2173 & 0x7FF;
			@Pc(34) int local34 = this.anInt2167;
			if (local34 == 1) {
				local17 = (Class100_Sub1.anIntArray428[local31 << 3] >> 4) + 1024;
			} else if (local34 == 3) {
				local17 = Static97.anIntArray126[local31] >> 1;
			} else if (local34 == 4) {
				local17 = local31 >> 10 << 11;
			} else if (local34 == 2) {
				local17 = local31;
			} else if (local34 == 5) {
				local17 = (local31 >= 1024 ? 2048 - local31 : local31) << 1;
			} else {
				local17 = 2048;
			}
		}
		this.aClass6_Sub1_1.method8261((float) ((this.anInt2168 * local17 >> 11) + this.anInt2170) / 2048.0F);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIILclient!ha;)V")
	private void method1828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class100 arg5) {
		this.aClass6_Sub1_1 = arg5.method8786(arg0, arg1, arg4, arg3, arg2, 1.0F);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZIIII)V")
	public void method1829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2167 = arg3;
		this.anInt2168 = arg1;
		this.anInt2169 = arg0;
		this.anInt2170 = arg2;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	private void method1830() {
		@Pc(4) int local4 = this.anInt2176;
		if (local4 == 2) {
			this.anInt2168 = 2048;
			this.anInt2170 = 0;
			this.anInt2167 = 1;
			this.anInt2169 = 2048;
		} else if (local4 == 3) {
			this.anInt2167 = 1;
			this.anInt2169 = 4096;
			this.anInt2170 = 0;
			this.anInt2168 = 2048;
		} else if (local4 == 4) {
			this.anInt2167 = 4;
			this.anInt2170 = 0;
			this.anInt2169 = 2048;
			this.anInt2168 = 2048;
		} else if (local4 == 5) {
			this.anInt2167 = 4;
			this.anInt2168 = 2048;
			this.anInt2170 = 0;
			this.anInt2169 = 8192;
		} else if (local4 == 12) {
			this.anInt2170 = 0;
			this.anInt2168 = 2048;
			this.anInt2169 = 2048;
			this.anInt2167 = 2;
		} else if (local4 == 13) {
			this.anInt2167 = 2;
			this.anInt2168 = 2048;
			this.anInt2169 = 8192;
			this.anInt2170 = 0;
		} else if (local4 == 10) {
			this.anInt2170 = 1536;
			this.anInt2169 = 2048;
			this.anInt2167 = 3;
			this.anInt2168 = 512;
		} else if (local4 == 11) {
			this.anInt2167 = 3;
			this.anInt2169 = 4096;
			this.anInt2170 = 1536;
			this.anInt2168 = 512;
		} else if (local4 == 6) {
			this.anInt2170 = 1280;
			this.anInt2167 = 3;
			this.anInt2169 = 2048;
			this.anInt2168 = 768;
		} else if (local4 == 7) {
			this.anInt2170 = 1280;
			this.anInt2168 = 768;
			this.anInt2167 = 3;
			this.anInt2169 = 4096;
		} else if (local4 == 8) {
			this.anInt2167 = 3;
			this.anInt2169 = 2048;
			this.anInt2168 = 1024;
			this.anInt2170 = 1024;
		} else if (local4 == 9) {
			this.anInt2170 = 1024;
			this.anInt2167 = 3;
			this.anInt2169 = 4096;
			this.anInt2168 = 1024;
		} else if (local4 == 14) {
			this.anInt2169 = 2048;
			this.anInt2168 = 768;
			this.anInt2167 = 1;
			this.anInt2170 = 1280;
		} else if (local4 == 15) {
			this.anInt2169 = 4096;
			this.anInt2168 = 512;
			this.anInt2167 = 1;
			this.anInt2170 = 1536;
		} else if (local4 == 16) {
			this.anInt2168 = 256;
			this.anInt2170 = 1792;
			this.anInt2169 = 8192;
			this.anInt2167 = 1;
		} else {
			this.anInt2168 = 2048;
			this.anInt2170 = 0;
			this.anInt2167 = 0;
			this.anInt2169 = 2048;
		}
	}
}
