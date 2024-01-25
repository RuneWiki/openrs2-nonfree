import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ika")
public final class Class165 {

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "Lclient!uaa;")
	public Class3_Sub13 aClass3_Sub13_1;

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "I")
	private int anInt4506;

	@OriginalMember(owner = "client!ika", name = "g", descriptor = "I")
	public int anInt4509;

	@OriginalMember(owner = "client!ika", name = "h", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!ika", name = "j", descriptor = "I")
	private int anInt4511;

	@OriginalMember(owner = "client!ika", name = "l", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!ika", name = "m", descriptor = "I")
	private int anInt4513;

	@OriginalMember(owner = "client!ika", name = "n", descriptor = "I")
	public int anInt4514;

	@OriginalMember(owner = "client!ika", name = "o", descriptor = "I")
	private int anInt4515;

	@OriginalMember(owner = "client!ika", name = "p", descriptor = "I")
	private int anInt4516;

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "()V")
	private Class165() {
		if (Static321.anIntArray551 == null) {
			Static73.method4586();
		}
		this.method3854();
	}

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lclient!ha;Lclient!dt;I)V")
	public Class165(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (Static321.anIntArray551 == null) {
			Static73.method4586();
		}
		this.anInt4514 = arg1.method7954();
		this.aBoolean302 = (this.anInt4514 & 0x8) != 0;
		this.aBoolean303 = (this.anInt4514 & 0x10) != 0;
		this.anInt4514 &= 0x7;
		@Pc(47) int local47 = arg1.method7951() << arg2;
		@Pc(53) int local53 = arg1.method7951() << arg2;
		@Pc(59) int local59 = arg1.method7951() << arg2;
		@Pc(63) int local63 = arg1.method7954();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray58 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray58.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method7951();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray58[local75] = (short) (local86 << 8 | local90);
		}
		local63 = (local63 << Static571.anInt9216) + Static579.anInt9391;
		@Pc(153) int local153 = Static537.anIntArray457 == null ? Static321.anIntArray550[Static81.method8383(arg1.method7951()) & 0xFFFF] : Static537.anIntArray457[arg1.method7951()];
		local86 = arg1.method7954();
		this.anInt4509 = local86 & 0x1F;
		this.anInt4515 = (local86 & 0xE0) << 3;
		if (this.anInt4509 != 31) {
			this.method3854();
		}
		this.method3850(arg0, local47, local63, local53, local59, local153);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lclient!ha;ZIIIII)V")
	private void method3850(@OriginalArg(0) Class95 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub13_1 = arg0.method8070(arg1, arg4, arg3, arg2, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(ZIZ)V")
	public void method3852(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(57) int local57;
		if (arg1) {
			local57 = 2048;
		} else {
			@Pc(19) int local19 = arg0 * this.anInt4516 / 50 + this.anInt4515 & 0x7FF;
			@Pc(22) int local22 = this.anInt4506;
			if (local22 == 1) {
				local57 = (Class94.anIntArray561[local19 << 3] >> 4) + 1024;
			} else if (local22 == 3) {
				local57 = Static321.anIntArray551[local19] >> 1;
			} else if (local22 == 4) {
				local57 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local57 = local19;
			} else if (local22 == 5) {
				local57 = (local19 >= 1024 ? 2048 - local19 : local19) << 1;
			} else {
				local57 = 2048;
			}
		}
		this.aClass3_Sub13_1.method5965((float) (this.anInt4513 + (local57 * this.anInt4511 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIIII)V")
	public void method3853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4513 = arg0;
		this.anInt4516 = arg2;
		this.anInt4511 = arg3;
		this.anInt4506 = arg1;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)V")
	private void method3854() {
		@Pc(10) int local10 = this.anInt4509;
		if (local10 == 2) {
			this.anInt4513 = 0;
			this.anInt4506 = 1;
			this.anInt4516 = 2048;
			this.anInt4511 = 2048;
		} else if (local10 == 3) {
			this.anInt4516 = 4096;
			this.anInt4506 = 1;
			this.anInt4513 = 0;
			this.anInt4511 = 2048;
		} else if (local10 == 4) {
			this.anInt4511 = 2048;
			this.anInt4516 = 2048;
			this.anInt4506 = 4;
			this.anInt4513 = 0;
		} else if (local10 == 5) {
			this.anInt4513 = 0;
			this.anInt4516 = 8192;
			this.anInt4506 = 4;
			this.anInt4511 = 2048;
		} else if (local10 == 12) {
			this.anInt4506 = 2;
			this.anInt4513 = 0;
			this.anInt4511 = 2048;
			this.anInt4516 = 2048;
		} else if (local10 == 13) {
			this.anInt4506 = 2;
			this.anInt4513 = 0;
			this.anInt4511 = 2048;
			this.anInt4516 = 8192;
		} else if (local10 == 10) {
			this.anInt4511 = 512;
			this.anInt4506 = 3;
			this.anInt4513 = 1536;
			this.anInt4516 = 2048;
		} else if (local10 == 11) {
			this.anInt4511 = 512;
			this.anInt4516 = 4096;
			this.anInt4513 = 1536;
			this.anInt4506 = 3;
		} else if (local10 == 6) {
			this.anInt4506 = 3;
			this.anInt4511 = 768;
			this.anInt4516 = 2048;
			this.anInt4513 = 1280;
		} else if (local10 == 7) {
			this.anInt4516 = 4096;
			this.anInt4511 = 768;
			this.anInt4506 = 3;
			this.anInt4513 = 1280;
		} else if (local10 == 8) {
			this.anInt4513 = 1024;
			this.anInt4511 = 1024;
			this.anInt4506 = 3;
			this.anInt4516 = 2048;
		} else if (local10 == 9) {
			this.anInt4511 = 1024;
			this.anInt4516 = 4096;
			this.anInt4506 = 3;
			this.anInt4513 = 1024;
		} else if (local10 == 14) {
			this.anInt4516 = 2048;
			this.anInt4511 = 768;
			this.anInt4513 = 1280;
			this.anInt4506 = 1;
		} else if (local10 == 15) {
			this.anInt4516 = 4096;
			this.anInt4506 = 1;
			this.anInt4513 = 1536;
			this.anInt4511 = 512;
		} else if (local10 == 16) {
			this.anInt4511 = 256;
			this.anInt4513 = 1792;
			this.anInt4516 = 8192;
			this.anInt4506 = 1;
		} else {
			this.anInt4516 = 2048;
			this.anInt4506 = 0;
			this.anInt4511 = 2048;
			this.anInt4513 = 0;
		}
	}
}
