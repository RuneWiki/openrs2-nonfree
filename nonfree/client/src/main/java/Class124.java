import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class124 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	private int anInt3436;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	private int anInt3437;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!pe;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	private int anInt3438;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	public int anInt3439;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	private int anInt3440;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Z")
	public boolean aBoolean199;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	private int anInt3445;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Z")
	public boolean aBoolean200;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
	public int anInt3448;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	private Class124() {
		if (Static187.anIntArray396 == null) {
			Static100.method1551();
		}
		this.method2887();
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!qa;Lclient!lh;I)V")
	public Class124(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class1_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (Static187.anIntArray396 == null) {
			Static100.method1551();
		}
		this.anInt3439 = arg1.method4130();
		this.aBoolean199 = (this.anInt3439 & 0x8) != 0;
		this.aBoolean200 = (this.anInt3439 & 0x10) != 0;
		this.anInt3439 &= 0x7;
		@Pc(47) int local47 = arg1.method4093() << arg2;
		@Pc(53) int local53 = arg1.method4093() << arg2;
		@Pc(59) int local59 = arg1.method4093() << arg2;
		@Pc(63) int local63 = arg1.method4130();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray52 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray52.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4093();
			local86 = local82 >>> 8;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			@Pc(97) int local97 = local82 & 0xFF;
			if (local97 > local69 - local86) {
				local97 = local69 - local86;
			}
			this.aShortArray52[local75] = (short) (local97 | local86 << 8);
		}
		local63 = (local63 << Static139.anInt2355) + Static122.anInt2160;
		@Pc(148) int local148 = Static389.anIntArray561 == null ? Static304.anIntArray422[Static129.method1883(arg1.method4093()) & 0xFFFF] : Static389.anIntArray561[arg1.method4093()];
		local86 = arg1.method4130();
		this.anInt3448 = local86 & 0x1F;
		this.anInt3438 = (local86 & 0xE0) << 3;
		if (this.anInt3448 != 31) {
			this.method2887();
		}
		this.method2885(local63, local148, arg0, local59, local47, local53);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!qa;IIII)V")
	private void method2885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub5_1 = arg2.method4692(arg4, arg3, arg5, arg0, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	private void method2887() {
		@Pc(4) int local4 = this.anInt3448;
		if (local4 == 2) {
			this.anInt3436 = 0;
			this.anInt3440 = 2048;
			this.anInt3437 = 2048;
			this.anInt3445 = 1;
		} else if (local4 == 3) {
			this.anInt3437 = 4096;
			this.anInt3445 = 1;
			this.anInt3436 = 0;
			this.anInt3440 = 2048;
		} else if (local4 == 4) {
			this.anInt3440 = 2048;
			this.anInt3445 = 4;
			this.anInt3437 = 2048;
			this.anInt3436 = 0;
		} else if (local4 == 5) {
			this.anInt3437 = 8192;
			this.anInt3436 = 0;
			this.anInt3445 = 4;
			this.anInt3440 = 2048;
		} else if (local4 == 12) {
			this.anInt3437 = 2048;
			this.anInt3445 = 2;
			this.anInt3440 = 2048;
			this.anInt3436 = 0;
		} else if (local4 == 13) {
			this.anInt3440 = 2048;
			this.anInt3436 = 0;
			this.anInt3437 = 8192;
			this.anInt3445 = 2;
		} else if (local4 == 10) {
			this.anInt3437 = 2048;
			this.anInt3440 = 512;
			this.anInt3445 = 3;
			this.anInt3436 = 1536;
		} else if (local4 == 11) {
			this.anInt3436 = 1536;
			this.anInt3445 = 3;
			this.anInt3440 = 512;
			this.anInt3437 = 4096;
		} else if (local4 == 6) {
			this.anInt3440 = 768;
			this.anInt3445 = 3;
			this.anInt3436 = 1280;
			this.anInt3437 = 2048;
		} else if (local4 == 7) {
			this.anInt3445 = 3;
			this.anInt3440 = 768;
			this.anInt3436 = 1280;
			this.anInt3437 = 4096;
		} else if (local4 == 8) {
			this.anInt3445 = 3;
			this.anInt3436 = 1024;
			this.anInt3437 = 2048;
			this.anInt3440 = 1024;
		} else if (local4 == 9) {
			this.anInt3437 = 4096;
			this.anInt3436 = 1024;
			this.anInt3445 = 3;
			this.anInt3440 = 1024;
		} else if (local4 == 14) {
			this.anInt3440 = 768;
			this.anInt3445 = 1;
			this.anInt3437 = 2048;
			this.anInt3436 = 1280;
		} else if (local4 == 15) {
			this.anInt3436 = 1536;
			this.anInt3437 = 4096;
			this.anInt3440 = 512;
			this.anInt3445 = 1;
		} else if (local4 == 16) {
			this.anInt3440 = 256;
			this.anInt3445 = 1;
			this.anInt3437 = 8192;
			this.anInt3436 = 1792;
		} else {
			this.anInt3437 = 2048;
			this.anInt3436 = 0;
			this.anInt3440 = 2048;
			this.anInt3445 = 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIB)V")
	public void method2888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3436 = arg2;
		this.anInt3445 = arg3;
		this.anInt3437 = arg0;
		this.anInt3440 = arg1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIZ)V")
	public void method2892(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(57) int local57;
		if (arg0) {
			local57 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt3438 + this.anInt3437 * arg1 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt3445;
			if (local26 == 1) {
				local57 = (Class4.anIntArray7[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local57 = Static187.anIntArray396[local23] >> 1;
			} else if (local26 == 4) {
				local57 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local57 = local23;
			} else if (local26 == 5) {
				local57 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local57 = 2048;
			}
		}
		this.aClass1_Sub5_1.method3329((float) ((this.anInt3440 * local57 >> 11) + this.anInt3436) / 2048.0F);
	}
}
