import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "Z")
	public boolean aBoolean21 = true;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	public int anInt580 = -1;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
	public int anInt581 = 0;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
	private int method475(@OriginalArg(0) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(26) double local26 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(42) double local42 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(44) double local44 = local26;
		if (local35 < local26) {
			local44 = local35;
		}
		@Pc(52) double local52 = 0.0D;
		@Pc(54) double local54 = local26;
		if (local42 < local44) {
			local44 = local42;
		}
		if (local35 > local26) {
			local54 = local35;
		}
		if (local54 < local42) {
			local54 = local42;
		}
		@Pc(78) double local78 = (local54 + local44) / 2.0D;
		@Pc(80) double local80 = 0.0D;
		if (local54 != local44) {
			if (local54 == local26) {
				local52 = (local35 - local42) / (-local44 + local54);
			} else if (local35 == local54) {
				local52 = (local42 - local26) / (local54 - local44) + 2.0D;
			} else if (local54 == local42) {
				local52 = (local26 - local35) / (local54 - local44) + 4.0D;
			}
			if (local78 < 0.5D) {
				local80 = (local54 - local44) / (local54 + local44);
			}
			if (local78 >= 0.5D) {
				local80 = (local54 - local44) / (2.0D - local54 - local44);
			}
		}
		local52 /= 6.0D;
		@Pc(167) int local167 = (int) (local52 * 256.0D);
		@Pc(172) int local172 = (int) (local78 * 256.0D);
		@Pc(177) int local177 = (int) (local80 * 256.0D);
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local177 < 0) {
			local177 = 0;
		} else if (local177 > 255) {
			local177 = 255;
		}
		if (local172 > 243) {
			local177 >>= 0x4;
		} else if (local172 > 217) {
			local177 >>= 0x3;
		} else if (local172 > 192) {
			local177 >>= 0x2;
		} else if (local172 > 179) {
			local177 >>= 0x1;
		}
		return (local172 >> 1) + ((local167 >> 2 << 10) + (local177 >> 5 << 7));
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!ja;I)V")
	private void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13 arg2) {
		if (arg0 == 1) {
			this.anInt581 = this.method475(arg2.method2942());
		} else if (arg0 == 2) {
			this.anInt582 = arg2.method2962();
		} else if (arg0 == 3) {
			this.anInt582 = arg2.method2933();
			if (this.anInt582 != 65535) {
				return;
			}
			this.anInt582 = -1;
		} else if (arg0 == 5) {
			this.aBoolean21 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt580 = this.method475(arg2.method2942());
			return;
		} else if (arg0 != 8 && arg0 == 9) {
			arg2.method2933();
			return;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILclient!ja;)V")
	public void method479(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method2962();
			if (local13 == 0) {
				return;
			}
			this.method478(local13, arg0, arg1);
		}
	}
}
