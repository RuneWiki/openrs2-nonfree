import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	public int anInt3551 = -1;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
	public int anInt3557 = -1;

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
	public int anInt3558 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBILclient!ka;)V")
	private void method2701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub8 arg2) {
		if (arg0 == 1) {
			this.anInt3558 = this.method2702(arg2.method316());
		} else if (arg0 == 2) {
			this.anInt3557 = arg2.method336();
		} else if (arg0 == 3) {
			this.anInt3557 = arg2.method359();
			if (this.anInt3557 == 65535) {
				this.anInt3557 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean150 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt3551 = this.method2702(arg2.method316());
		} else if (arg0 != 8 && arg0 == 9) {
			arg2.method359();
			return;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	private int method2702(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(25) double local25 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local34;
		@Pc(38) double local38 = local34;
		@Pc(47) double local47 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local34 > local47) {
			local36 = local47;
		}
		if (local47 > local34) {
			local38 = local47;
		}
		if (local36 > local25) {
			local36 = local25;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		if (local38 < local25) {
			local38 = local25;
		}
		@Pc(81) double local81 = (local38 + local36) / 2.0D;
		if (local36 != local38) {
			if (local34 == local38) {
				local67 = (local47 - local25) / (-local36 + local38);
			} else if (local47 == local38) {
				local67 = (local25 - local34) / (local38 - local36) + 2.0D;
			} else if (local38 == local25) {
				local67 = (local34 - local47) / (-local36 + local38) + 4.0D;
			}
			if (local81 < 0.5D) {
				local69 = (local38 - local36) / (local38 + local36);
			}
			if (local81 >= 0.5D) {
				local69 = (local38 - local36) / (-local36 + (2.0D - local38));
			}
		}
		@Pc(165) int local165 = (int) (local69 * 256.0D);
		local67 /= 6.0D;
		@Pc(174) int local174 = (int) (local67 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		@Pc(192) int local192 = (int) (local81 * 256.0D);
		if (local192 < 0) {
			local192 = 0;
		} else if (local192 > 255) {
			local192 = 255;
		}
		if (local192 > 243) {
			local165 >>= 0x4;
		} else if (local192 > 217) {
			local165 >>= 0x3;
		} else if (local192 > 192) {
			local165 >>= 0x2;
		} else if (local192 > 179) {
			local165 >>= 0x1;
		}
		return (local165 >> 5 << 7) + ((local174 >> 2 << 10) + (local192 >> 1));
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ka;I)V")
	public void method2703(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.method336();
			if (local18 == 0) {
				return;
			}
			this.method2701(local18, arg1, arg0);
		}
	}
}
