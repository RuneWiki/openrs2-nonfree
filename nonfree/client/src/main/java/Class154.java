import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class154 {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
	private int anInt3695;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
	private int anInt3696;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "Z")
	public boolean aBoolean276;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	public int anInt3699;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	private int anInt3700;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "Lclient!ku;")
	public Class4_Sub7 aClass4_Sub7_1;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	private int anInt3701;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "Z")
	public boolean aBoolean277;

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
	private int anInt3703;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
	public int anInt3704;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
	private Class154() {
		if (Static451.anIntArray570 == null) {
			Static61.method861();
		}
		this.method2943();
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!ya;Lclient!fh;I)V")
	public Class154(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (Static451.anIntArray570 == null) {
			Static61.method861();
		}
		this.anInt3704 = arg1.method5007();
		this.aBoolean276 = (this.anInt3704 & 0x8) != 0;
		this.aBoolean277 = (this.anInt3704 & 0x10) != 0;
		this.anInt3704 &= 0x7;
		@Pc(47) int local47 = arg1.method5028() << arg2;
		@Pc(53) int local53 = arg1.method5028() << arg2;
		@Pc(59) int local59 = arg1.method5028() << arg2;
		@Pc(63) int local63 = arg1.method5007();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray57 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray57.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method5028();
			local86 = local82 >>> 8;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local101 > local69 - local86) {
				local101 = local69 - local86;
			}
			this.aShortArray57[local75] = (short) (local101 | local86 << 8);
		}
		local63 = (local63 << Static145.anInt2581) + Static390.anInt7654;
		@Pc(151) int local151 = Static365.anIntArray475 == null ? Static212.anIntArray274[Static408.method5551(arg1.method5028()) & 0xFFFF] : Static365.anIntArray475[arg1.method5028()];
		local86 = arg1.method5007();
		this.anInt3696 = (local86 & 0xE0) << 3;
		this.anInt3699 = local86 & 0x1F;
		if (this.anInt3699 != 31) {
			this.method2943();
		}
		this.method2944(local59, local63, local151, local53, arg0, local47);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZI)V")
	public void method2941(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11;
		if (arg1) {
			local11 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt3696 + this.anInt3703 * arg0 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt3700;
			if (local27 == 1) {
				local11 = (Class100.anIntArray206[local24 << 3] >> 5) + 1024;
			} else if (local27 == 3) {
				local11 = Static451.anIntArray570[local24] >> 1;
			} else if (local27 == 4) {
				local11 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local11 = local24;
			} else if (local27 == 5) {
				local11 = (local24 >= 1024 ? 2048 - local24 : local24) << 1;
			} else {
				local11 = 2048;
			}
		}
		this.aClass4_Sub7_1.method4453((float) (this.anInt3701 + (this.anInt3695 * local11 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
	public void method2942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3700 = arg2;
		this.anInt3695 = arg0;
		this.anInt3701 = arg1;
		this.anInt3703 = arg3;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	private void method2943() {
		@Pc(4) int local4 = this.anInt3699;
		if (local4 == 2) {
			this.anInt3700 = 1;
			this.anInt3703 = 2048;
			this.anInt3701 = 0;
			this.anInt3695 = 2048;
		} else if (local4 == 3) {
			this.anInt3695 = 2048;
			this.anInt3703 = 4096;
			this.anInt3700 = 1;
			this.anInt3701 = 0;
		} else if (local4 == 4) {
			this.anInt3695 = 2048;
			this.anInt3703 = 2048;
			this.anInt3700 = 4;
			this.anInt3701 = 0;
		} else if (local4 == 5) {
			this.anInt3703 = 8192;
			this.anInt3701 = 0;
			this.anInt3700 = 4;
			this.anInt3695 = 2048;
		} else if (local4 == 12) {
			this.anInt3695 = 2048;
			this.anInt3700 = 2;
			this.anInt3701 = 0;
			this.anInt3703 = 2048;
		} else if (local4 == 13) {
			this.anInt3703 = 8192;
			this.anInt3701 = 0;
			this.anInt3700 = 2;
			this.anInt3695 = 2048;
		} else if (local4 == 10) {
			this.anInt3703 = 2048;
			this.anInt3701 = 1536;
			this.anInt3695 = 512;
			this.anInt3700 = 3;
		} else if (local4 == 11) {
			this.anInt3703 = 4096;
			this.anInt3701 = 1536;
			this.anInt3700 = 3;
			this.anInt3695 = 512;
		} else if (local4 == 6) {
			this.anInt3695 = 768;
			this.anInt3700 = 3;
			this.anInt3703 = 2048;
			this.anInt3701 = 1280;
		} else if (local4 == 7) {
			this.anInt3695 = 768;
			this.anInt3701 = 1280;
			this.anInt3700 = 3;
			this.anInt3703 = 4096;
		} else if (local4 == 8) {
			this.anInt3701 = 1024;
			this.anInt3700 = 3;
			this.anInt3703 = 2048;
			this.anInt3695 = 1024;
		} else if (local4 == 9) {
			this.anInt3701 = 1024;
			this.anInt3695 = 1024;
			this.anInt3703 = 4096;
			this.anInt3700 = 3;
		} else if (local4 == 14) {
			this.anInt3695 = 768;
			this.anInt3700 = 1;
			this.anInt3703 = 2048;
			this.anInt3701 = 1280;
		} else if (local4 == 15) {
			this.anInt3701 = 1536;
			this.anInt3695 = 512;
			this.anInt3703 = 4096;
			this.anInt3700 = 1;
		} else if (local4 == 16) {
			this.anInt3700 = 1;
			this.anInt3701 = 1792;
			this.anInt3703 = 8192;
			this.anInt3695 = 256;
		} else {
			this.anInt3695 = 2048;
			this.anInt3701 = 0;
			this.anInt3700 = 0;
			this.anInt3703 = 2048;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBILclient!ya;I)V")
	private void method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class135 arg4, @OriginalArg(6) int arg5) {
		this.aClass4_Sub7_1 = arg4.method5348(arg5, arg0, arg3, arg1, arg2, 1.0F);
	}
}
