import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
	public int anInt1675 = -1;

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
	public int anInt1674 = -1;

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
	public int anInt1678 = 0;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "Z")
	public boolean aBoolean83 = true;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!jg;II)V")
	public void method1135(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method861();
			if (local17 == 0) {
				return;
			}
			this.method1137(local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!jg;IB)V")
	private void method1137(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt1678 = this.method1138(arg1.method888());
		} else if (arg0 == 2) {
			this.anInt1675 = arg1.method861();
		} else if (arg0 == 3) {
			this.anInt1675 = arg1.method878();
			if (this.anInt1675 == 65535) {
				this.anInt1675 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean83 = false;
		} else if (arg0 == 7) {
			this.anInt1674 = this.method1138(arg1.method888());
		} else if (arg0 != 8 && arg0 == 9) {
			arg1.method878();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)I")
	private int method1138(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		if (local28 > local19) {
			local37 = local28;
		}
		@Pc(45) double local45 = local19;
		@Pc(47) double local47 = 0.0D;
		if (local37 < local35) {
			local37 = local35;
		}
		@Pc(63) double local63 = 0.0D;
		if (local19 > local28) {
			local45 = local28;
		}
		if (local45 > local35) {
			local45 = local35;
		}
		@Pc(81) double local81 = (local37 + local45) / 2.0D;
		if (local37 != local45) {
			if (local19 == local37) {
				local47 = (local28 - local35) / (local37 - local45);
			} else if (local37 == local28) {
				local47 = (local35 - local19) / (-local45 + local37) + 2.0D;
			} else if (local35 == local37) {
				local47 = (local19 - local28) / (-local45 + local37) + 4.0D;
			}
			if (local81 < 0.5D) {
				local63 = (local37 - local45) / (local45 + local37);
			}
			if (local81 >= 0.5D) {
				local63 = (local37 - local45) / (-local45 + (2.0D - local37));
			}
		}
		@Pc(164) int local164 = (int) (local63 * 256.0D);
		local47 /= 6.0D;
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(187) int local187 = (int) (local81 * 256.0D);
		@Pc(192) int local192 = (int) (local47 * 256.0D);
		if (local187 < 0) {
			local187 = 0;
		} else if (local187 > 255) {
			local187 = 255;
		}
		if (local187 > 243) {
			local164 >>= 0x4;
		} else if (local187 > 217) {
			local164 >>= 0x3;
		} else if (local187 > 192) {
			local164 >>= 0x2;
		} else if (local187 > 179) {
			local164 >>= 0x1;
		}
		return (local192 >> 2 << 10) + (local164 >> 5 << 7) + (local187 >> 1);
	}
}
