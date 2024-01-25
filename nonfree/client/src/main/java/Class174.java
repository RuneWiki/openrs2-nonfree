import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class174 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	public int anInt4603;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	private int anInt4604;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	private int anInt4606;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public int anInt4609;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	private int anInt4610;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!vt;")
	public Class5_Sub11 aClass5_Sub11_2;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	private int anInt4615;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	private int anInt4616;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	private Class174() {
		if (Static365.anIntArray233 == null) {
			Static326.method4973();
		}
		this.method4172();
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!ha;Lclient!ofa;I)V")
	public Class174(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class5_Sub22 arg1, @OriginalArg(2) int arg2) {
		if (Static365.anIntArray233 == null) {
			Static326.method4973();
		}
		this.anInt4603 = arg1.method5966();
		this.aBoolean328 = (this.anInt4603 & 0x10) != 0;
		this.aBoolean327 = (this.anInt4603 & 0x8) != 0;
		this.anInt4603 &= 0x7;
		@Pc(47) int local47 = arg1.method5968() << arg2;
		@Pc(53) int local53 = arg1.method5968() << arg2;
		@Pc(59) int local59 = arg1.method5968() << arg2;
		@Pc(63) int local63 = arg1.method5966();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray60 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray60.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method5968();
			local86 = local82 >>> 8;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local101 > local69 - local86) {
				local101 = local69 - local86;
			}
			this.aShortArray60[local75] = (short) (local101 | local86 << 8);
		}
		local63 = (local63 << Static115.anInt2156) + Static147.anInt2575;
		@Pc(152) int local152 = Static349.anIntArray330 == null ? Static66.anIntArray97[Static547.method7982(arg1.method5968()) & 0xFFFF] : Static349.anIntArray330[arg1.method5968()];
		local86 = arg1.method5966();
		this.anInt4609 = local86 & 0x1F;
		this.anInt4606 = (local86 & 0xE0) << 3;
		if (this.anInt4609 != 31) {
			this.method4172();
		}
		this.method4177(local47, local152, local53, arg0, local63, local59);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	private void method4172() {
		@Pc(4) int local4 = this.anInt4609;
		if (local4 == 2) {
			this.anInt4604 = 0;
			this.anInt4610 = 1;
			this.anInt4616 = 2048;
			this.anInt4615 = 2048;
		} else if (local4 == 3) {
			this.anInt4615 = 2048;
			this.anInt4610 = 1;
			this.anInt4616 = 4096;
			this.anInt4604 = 0;
		} else if (local4 == 4) {
			this.anInt4604 = 0;
			this.anInt4616 = 2048;
			this.anInt4610 = 4;
			this.anInt4615 = 2048;
		} else if (local4 == 5) {
			this.anInt4610 = 4;
			this.anInt4615 = 2048;
			this.anInt4604 = 0;
			this.anInt4616 = 8192;
		} else if (local4 == 12) {
			this.anInt4610 = 2;
			this.anInt4615 = 2048;
			this.anInt4604 = 0;
			this.anInt4616 = 2048;
		} else if (local4 == 13) {
			this.anInt4616 = 8192;
			this.anInt4615 = 2048;
			this.anInt4604 = 0;
			this.anInt4610 = 2;
		} else if (local4 == 10) {
			this.anInt4615 = 512;
			this.anInt4604 = 1536;
			this.anInt4616 = 2048;
			this.anInt4610 = 3;
		} else if (local4 == 11) {
			this.anInt4610 = 3;
			this.anInt4615 = 512;
			this.anInt4616 = 4096;
			this.anInt4604 = 1536;
		} else if (local4 == 6) {
			this.anInt4616 = 2048;
			this.anInt4615 = 768;
			this.anInt4610 = 3;
			this.anInt4604 = 1280;
		} else if (local4 == 7) {
			this.anInt4616 = 4096;
			this.anInt4604 = 1280;
			this.anInt4610 = 3;
			this.anInt4615 = 768;
		} else if (local4 == 8) {
			this.anInt4615 = 1024;
			this.anInt4610 = 3;
			this.anInt4604 = 1024;
			this.anInt4616 = 2048;
		} else if (local4 == 9) {
			this.anInt4616 = 4096;
			this.anInt4615 = 1024;
			this.anInt4604 = 1024;
			this.anInt4610 = 3;
		} else if (local4 == 14) {
			this.anInt4616 = 2048;
			this.anInt4615 = 768;
			this.anInt4604 = 1280;
			this.anInt4610 = 1;
		} else if (local4 == 15) {
			this.anInt4615 = 512;
			this.anInt4616 = 4096;
			this.anInt4604 = 1536;
			this.anInt4610 = 1;
		} else if (local4 == 16) {
			this.anInt4604 = 1792;
			this.anInt4615 = 256;
			this.anInt4616 = 8192;
			this.anInt4610 = 1;
		} else {
			this.anInt4616 = 2048;
			this.anInt4615 = 2048;
			this.anInt4604 = 0;
			this.anInt4610 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)V")
	public void method4175(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt4606 + this.anInt4616 * arg0 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt4610;
			if (local26 == 1) {
				local9 = (Class377.anIntArray600[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local9 = Static365.anIntArray233[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 >= 1024 ? 2048 - local23 : local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass5_Sub11_2.method8095((float) (this.anInt4604 + (this.anInt4615 * local9 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILclient!ha;III)V")
	private void method4177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5_Sub11_2 = arg3.method7293(arg0, arg5, arg2, arg4, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V")
	public void method4178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4610 = arg0;
		this.anInt4616 = arg1;
		this.anInt4615 = arg2;
		this.anInt4604 = arg3;
	}
}
