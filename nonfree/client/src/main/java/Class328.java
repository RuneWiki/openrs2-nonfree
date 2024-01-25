import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class328 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "[S")
	public short[] aShortArray137;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "I")
	private int anInt9429;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "I")
	private int anInt9430;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Z")
	public boolean aBoolean662;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "I")
	private int anInt9432;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "I")
	public int anInt9433;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "Lclient!qm;")
	public Class14_Sub37 aClass14_Sub37_3;

	@OriginalMember(owner = "client!st", name = "r", descriptor = "I")
	private int anInt9441;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "I")
	public int anInt9442;

	@OriginalMember(owner = "client!st", name = "t", descriptor = "Z")
	public boolean aBoolean663;

	@OriginalMember(owner = "client!st", name = "v", descriptor = "I")
	private int anInt9444;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	private Class328() {
		if (Static206.anIntArray312 == null) {
			Static286.method4085();
		}
		this.method7807();
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!ha;Lclient!so;I)V")
	public Class328(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class14_Sub29 arg1, @OriginalArg(2) int arg2) {
		if (Static206.anIntArray312 == null) {
			Static286.method4085();
		}
		this.anInt9433 = arg1.method5866();
		this.aBoolean663 = (this.anInt9433 & 0x8) != 0;
		this.aBoolean662 = (this.anInt9433 & 0x10) != 0;
		this.anInt9433 &= 0x7;
		@Pc(47) int local47 = arg1.method5900() << arg2;
		@Pc(53) int local53 = arg1.method5900() << arg2;
		@Pc(59) int local59 = arg1.method5900() << arg2;
		@Pc(63) int local63 = arg1.method5866();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray137 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray137.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method5900();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray137[local75] = (short) (local90 | local86 << 8);
		}
		local63 = (local63 << Static579.anInt9935) + Static96.anInt2065;
		@Pc(156) int local156 = Static659.anIntArray816 == null ? Static520.anIntArray666[Static592.method1600(arg1.method5900()) & 0xFFFF] : Static659.anIntArray816[arg1.method5900()];
		local86 = arg1.method5866();
		this.anInt9444 = (local86 & 0xE0) << 3;
		this.anInt9442 = local86 & 0x1F;
		if (this.anInt9442 != 31) {
			this.method7807();
		}
		this.method7806(local156, local53, arg0, local47, local59, local63);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZILclient!ha;III)V")
	private void method7806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass14_Sub37_3 = arg2.method7871(arg3, arg4, arg1, arg5, arg0, 1.0F);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	private void method7807() {
		@Pc(12) int local12 = this.anInt9442;
		if (local12 == 2) {
			this.anInt9441 = 2048;
			this.anInt9429 = 1;
			this.anInt9430 = 0;
			this.anInt9432 = 2048;
		} else if (local12 == 3) {
			this.anInt9441 = 2048;
			this.anInt9429 = 1;
			this.anInt9430 = 0;
			this.anInt9432 = 4096;
		} else if (local12 == 4) {
			this.anInt9432 = 2048;
			this.anInt9430 = 0;
			this.anInt9429 = 4;
			this.anInt9441 = 2048;
		} else if (local12 == 5) {
			this.anInt9432 = 8192;
			this.anInt9430 = 0;
			this.anInt9429 = 4;
			this.anInt9441 = 2048;
		} else if (local12 == 12) {
			this.anInt9430 = 0;
			this.anInt9429 = 2;
			this.anInt9441 = 2048;
			this.anInt9432 = 2048;
		} else if (local12 == 13) {
			this.anInt9430 = 0;
			this.anInt9432 = 8192;
			this.anInt9429 = 2;
			this.anInt9441 = 2048;
		} else if (local12 == 10) {
			this.anInt9432 = 2048;
			this.anInt9430 = 1536;
			this.anInt9429 = 3;
			this.anInt9441 = 512;
		} else if (local12 == 11) {
			this.anInt9432 = 4096;
			this.anInt9430 = 1536;
			this.anInt9429 = 3;
			this.anInt9441 = 512;
		} else if (local12 == 6) {
			this.anInt9430 = 1280;
			this.anInt9429 = 3;
			this.anInt9441 = 768;
			this.anInt9432 = 2048;
		} else if (local12 == 7) {
			this.anInt9430 = 1280;
			this.anInt9429 = 3;
			this.anInt9432 = 4096;
			this.anInt9441 = 768;
		} else if (local12 == 8) {
			this.anInt9429 = 3;
			this.anInt9441 = 1024;
			this.anInt9432 = 2048;
			this.anInt9430 = 1024;
		} else if (local12 == 9) {
			this.anInt9429 = 3;
			this.anInt9430 = 1024;
			this.anInt9432 = 4096;
			this.anInt9441 = 1024;
		} else if (local12 == 14) {
			this.anInt9441 = 768;
			this.anInt9432 = 2048;
			this.anInt9429 = 1;
			this.anInt9430 = 1280;
		} else if (local12 == 15) {
			this.anInt9432 = 4096;
			this.anInt9430 = 1536;
			this.anInt9429 = 1;
			this.anInt9441 = 512;
		} else if (local12 == 16) {
			this.anInt9441 = 256;
			this.anInt9430 = 1792;
			this.anInt9432 = 8192;
			this.anInt9429 = 1;
		} else {
			this.anInt9441 = 2048;
			this.anInt9430 = 0;
			this.anInt9429 = 0;
			this.anInt9432 = 2048;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZII)V")
	public void method7809(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19;
		if (arg0) {
			local19 = 2048;
		} else {
			@Pc(33) int local33 = arg1 * this.anInt9432 / 50 + this.anInt9444 & 0x7FF;
			@Pc(36) int local36 = this.anInt9429;
			if (local36 == 1) {
				local19 = (Class32.anIntArray76[local33 << 3] >> 4) + 1024;
			} else if (local36 == 3) {
				local19 = Static206.anIntArray312[local33] >> 1;
			} else if (local36 == 4) {
				local19 = local33 >> 10 << 11;
			} else if (local36 == 2) {
				local19 = local33;
			} else if (local36 == 5) {
				local19 = (local33 >= 1024 ? 2048 - local33 : local33) << 1;
			} else {
				local19 = 2048;
			}
		}
		this.aClass14_Sub37_3.method7829((float) (this.anInt9430 + (local19 * this.anInt9441 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIII)V")
	public void method7810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9430 = arg0;
		this.anInt9441 = arg2;
		this.anInt9429 = arg3;
		this.anInt9432 = arg1;
	}
}
