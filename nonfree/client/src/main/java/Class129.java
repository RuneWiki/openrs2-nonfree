import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class129 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "Z")
	public boolean aBoolean277;

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Lclient!eq;")
	public Class3_Sub10 aClass3_Sub10_2;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	private int anInt3698;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	public int anInt3699;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
	private int anInt3700;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
	private int anInt3701;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
	private int anInt3704;

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "Z")
	public boolean aBoolean278;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	public int anInt3705;

	@OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
	private int anInt3707;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
	private Class129() {
		if (Static527.anIntArray554 == null) {
			Static225.method3530();
		}
		this.method3311();
	}

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!r;Lclient!np;I)V")
	public Class129(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class3_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (Static527.anIntArray554 == null) {
			Static225.method3530();
		}
		this.anInt3699 = arg1.method5175();
		this.aBoolean278 = (this.anInt3699 & 0x10) != 0;
		this.aBoolean277 = (this.anInt3699 & 0x8) != 0;
		this.anInt3699 &= 0x7;
		@Pc(47) int local47 = arg1.method5198() << arg2;
		@Pc(53) int local53 = arg1.method5198() << arg2;
		@Pc(59) int local59 = arg1.method5198() << arg2;
		@Pc(63) int local63 = arg1.method5175();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray51 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray51.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method5198();
			local86 = local82 >>> 8;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			@Pc(97) int local97 = local82 & 0xFF;
			if (local69 - local86 < local97) {
				local97 = local69 - local86;
			}
			this.aShortArray51[local75] = (short) (local86 << 8 | local97);
		}
		local63 = Static323.anInt5468 + (local63 << Static315.anInt5369);
		@Pc(150) int local150 = Static214.anIntArray203 == null ? Static271.anIntArray256[Static249.method3866(arg1.method5198()) & 0xFFFF] : Static214.anIntArray203[arg1.method5198()];
		local86 = arg1.method5175();
		this.anInt3705 = local86 & 0x1F;
		this.anInt3701 = (local86 & 0xE0) << 3;
		if (this.anInt3705 != 31) {
			this.method3311();
		}
		this.method3314(local63, local53, local59, local47, local150, arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
	private void method3311() {
		@Pc(4) int local4 = this.anInt3705;
		if (local4 == 2) {
			this.anInt3698 = 2048;
			this.anInt3700 = 2048;
			this.anInt3707 = 1;
			this.anInt3704 = 0;
		} else if (local4 == 3) {
			this.anInt3700 = 2048;
			this.anInt3707 = 1;
			this.anInt3704 = 0;
			this.anInt3698 = 4096;
		} else if (local4 == 4) {
			this.anInt3707 = 4;
			this.anInt3704 = 0;
			this.anInt3698 = 2048;
			this.anInt3700 = 2048;
		} else if (local4 == 5) {
			this.anInt3707 = 4;
			this.anInt3698 = 8192;
			this.anInt3700 = 2048;
			this.anInt3704 = 0;
		} else if (local4 == 12) {
			this.anInt3704 = 0;
			this.anInt3707 = 2;
			this.anInt3698 = 2048;
			this.anInt3700 = 2048;
		} else if (local4 == 13) {
			this.anInt3704 = 0;
			this.anInt3700 = 2048;
			this.anInt3707 = 2;
			this.anInt3698 = 8192;
		} else if (local4 == 10) {
			this.anInt3707 = 3;
			this.anInt3698 = 2048;
			this.anInt3700 = 512;
			this.anInt3704 = 1536;
		} else if (local4 == 11) {
			this.anInt3704 = 1536;
			this.anInt3707 = 3;
			this.anInt3698 = 4096;
			this.anInt3700 = 512;
		} else if (local4 == 6) {
			this.anInt3704 = 1280;
			this.anInt3707 = 3;
			this.anInt3700 = 768;
			this.anInt3698 = 2048;
		} else if (local4 == 7) {
			this.anInt3700 = 768;
			this.anInt3704 = 1280;
			this.anInt3698 = 4096;
			this.anInt3707 = 3;
		} else if (local4 == 8) {
			this.anInt3700 = 1024;
			this.anInt3707 = 3;
			this.anInt3698 = 2048;
			this.anInt3704 = 1024;
		} else if (local4 == 9) {
			this.anInt3704 = 1024;
			this.anInt3698 = 4096;
			this.anInt3700 = 1024;
			this.anInt3707 = 3;
		} else if (local4 == 14) {
			this.anInt3707 = 1;
			this.anInt3700 = 768;
			this.anInt3698 = 2048;
			this.anInt3704 = 1280;
		} else if (local4 == 15) {
			this.anInt3704 = 1536;
			this.anInt3698 = 4096;
			this.anInt3700 = 512;
			this.anInt3707 = 1;
		} else if (local4 == 16) {
			this.anInt3707 = 1;
			this.anInt3704 = 1792;
			this.anInt3700 = 256;
			this.anInt3698 = 8192;
		} else {
			this.anInt3704 = 0;
			this.anInt3698 = 2048;
			this.anInt3707 = 0;
			this.anInt3700 = 2048;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZZI)V")
	public void method3312(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(54) int local54;
		if (arg0) {
			local54 = 2048;
		} else {
			@Pc(19) int local19 = this.anInt3701 + this.anInt3698 * arg1 / 50 & 0x7FF;
			@Pc(22) int local22 = this.anInt3707;
			if (local22 == 1) {
				local54 = (Class356.anIntArray597[local19 << 3] >> 4) + 1024;
			} else if (local22 == 3) {
				local54 = Static527.anIntArray554[local19] >> 1;
			} else if (local22 == 4) {
				local54 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local54 = local19;
			} else if (local22 == 5) {
				local54 = (local19 >= 1024 ? 2048 - local19 : local19) << 1;
			} else {
				local54 = 2048;
			}
		}
		this.aClass3_Sub10_2.method6012((float) (this.anInt3704 + (local54 * this.anInt3700 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIII)V")
	public void method3313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3704 = arg0;
		this.anInt3707 = arg1;
		this.anInt3698 = arg3;
		this.anInt3700 = arg2;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BIIIIILclient!r;)V")
	private void method3314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class45 arg5) {
		this.aClass3_Sub10_2 = arg5.method7357(arg3, arg2, arg1, arg0, arg4, 1.0F);
	}
}
