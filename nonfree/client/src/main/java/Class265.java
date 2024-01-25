import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class265 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	public boolean aBoolean551;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt7421;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	private int anInt7424;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	private int anInt7427;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	private int anInt7428;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	private int anInt7429;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public int anInt7432;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	public int anInt7434;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Lclient!uca;")
	public Class3_Sub15 aClass3_Sub15_2;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class265() {
		if (Static601.anIntArray838 == null) {
			Static654.method9100();
		}
		this.method6564();
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!ha;Lclient!jp;I)V")
	public Class265(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class3_Sub25 arg1, @OriginalArg(2) int arg2) {
		if (Static601.anIntArray838 == null) {
			Static654.method9100();
		}
		this.anInt7434 = arg1.method8632();
		this.aBoolean551 = (this.anInt7434 & 0x8) != 0;
		this.aBoolean552 = (this.anInt7434 & 0x10) != 0;
		this.anInt7434 &= 0x7;
		@Pc(47) int local47 = arg1.method8593() << arg2;
		@Pc(53) int local53 = arg1.method8593() << arg2;
		@Pc(59) int local59 = arg1.method8593() << arg2;
		@Pc(63) int local63 = arg1.method8632();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray109 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray109.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method8593();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray109[local75] = (short) (local90 | local86 << 8);
		}
		local63 = Static597.anInt9602 + (local63 << Static391.anInt10262);
		@Pc(151) int local151 = Static363.anIntArray518 == null ? Static211.anIntArray738[Static502.method3753(arg1.method8593()) & 0xFFFF] : Static363.anIntArray518[arg1.method8593()];
		local86 = arg1.method8632();
		this.anInt7421 = (local86 & 0xE0) << 3;
		this.anInt7432 = local86 & 0x1F;
		if (this.anInt7432 != 31) {
			this.method6564();
		}
		this.method6566(arg0, local63, local53, local151, local47, local59);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	private void method6564() {
		@Pc(4) int local4 = this.anInt7432;
		if (local4 == 2) {
			this.anInt7424 = 1;
			this.anInt7428 = 0;
			this.anInt7429 = 2048;
			this.anInt7427 = 2048;
		} else if (local4 == 3) {
			this.anInt7424 = 1;
			this.anInt7427 = 4096;
			this.anInt7428 = 0;
			this.anInt7429 = 2048;
		} else if (local4 == 4) {
			this.anInt7428 = 0;
			this.anInt7427 = 2048;
			this.anInt7424 = 4;
			this.anInt7429 = 2048;
		} else if (local4 == 5) {
			this.anInt7424 = 4;
			this.anInt7427 = 8192;
			this.anInt7429 = 2048;
			this.anInt7428 = 0;
		} else if (local4 == 12) {
			this.anInt7424 = 2;
			this.anInt7429 = 2048;
			this.anInt7427 = 2048;
			this.anInt7428 = 0;
		} else if (local4 == 13) {
			this.anInt7429 = 2048;
			this.anInt7428 = 0;
			this.anInt7427 = 8192;
			this.anInt7424 = 2;
		} else if (local4 == 10) {
			this.anInt7429 = 512;
			this.anInt7428 = 1536;
			this.anInt7424 = 3;
			this.anInt7427 = 2048;
		} else if (local4 == 11) {
			this.anInt7429 = 512;
			this.anInt7428 = 1536;
			this.anInt7424 = 3;
			this.anInt7427 = 4096;
		} else if (local4 == 6) {
			this.anInt7424 = 3;
			this.anInt7428 = 1280;
			this.anInt7427 = 2048;
			this.anInt7429 = 768;
		} else if (local4 == 7) {
			this.anInt7428 = 1280;
			this.anInt7424 = 3;
			this.anInt7429 = 768;
			this.anInt7427 = 4096;
		} else if (local4 == 8) {
			this.anInt7429 = 1024;
			this.anInt7428 = 1024;
			this.anInt7427 = 2048;
			this.anInt7424 = 3;
		} else if (local4 == 9) {
			this.anInt7428 = 1024;
			this.anInt7424 = 3;
			this.anInt7429 = 1024;
			this.anInt7427 = 4096;
		} else if (local4 == 14) {
			this.anInt7428 = 1280;
			this.anInt7429 = 768;
			this.anInt7427 = 2048;
			this.anInt7424 = 1;
		} else if (local4 == 15) {
			this.anInt7424 = 1;
			this.anInt7428 = 1536;
			this.anInt7429 = 512;
			this.anInt7427 = 4096;
		} else if (local4 == 16) {
			this.anInt7424 = 1;
			this.anInt7427 = 8192;
			this.anInt7429 = 256;
			this.anInt7428 = 1792;
		} else {
			this.anInt7427 = 2048;
			this.anInt7429 = 2048;
			this.anInt7428 = 0;
			this.anInt7424 = 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIZI)V")
	public void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7428 = arg2;
		this.anInt7427 = arg1;
		this.anInt7429 = arg0;
		this.anInt7424 = arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ha;IIZIII)V")
	private void method6566(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub15_2 = arg0.method8504(arg4, arg5, arg2, arg1, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ)V")
	public void method6567(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(58) int local58;
		if (arg1) {
			local58 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt7421 + arg0 * this.anInt7427 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt7424;
			if (local27 == 1) {
				local58 = (Class3_Sub20.anIntArray206[local24 << 3] >> 4) + 1024;
			} else if (local27 == 3) {
				local58 = Static601.anIntArray838[local24] >> 1;
			} else if (local27 == 4) {
				local58 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local58 = local24;
			} else if (local27 == 5) {
				local58 = (local24 >= 1024 ? 2048 - local24 : local24) << 1;
			} else {
				local58 = 2048;
			}
		}
		this.aClass3_Sub15_2.method8382((float) ((this.anInt7429 * local58 >> 11) + this.anInt7428) / 2048.0F);
	}
}
