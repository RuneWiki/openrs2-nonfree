import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public int anInt3495 = -1;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "I")
	public int anInt3492 = -1;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "I")
	public int anInt3499 = 0;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Z")
	public boolean aBoolean148 = true;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!rd;IB)V")
	public void method2537(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method191();
			if (local13 == 0) {
				return;
			}
			this.method2540(arg1, local13, arg0);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
	private int method2538(@OriginalArg(0) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(39) double local39 = local30;
		if (local21 < local30) {
			local39 = local21;
		}
		@Pc(55) double local55 = 0.0D;
		if (local37 < local39) {
			local39 = local37;
		}
		@Pc(63) double local63 = local30;
		if (local30 < local21) {
			local63 = local21;
		}
		if (local37 > local63) {
			local63 = local37;
		}
		@Pc(81) double local81 = (local39 + local63) / 2.0D;
		@Pc(86) int local86 = (int) (local81 * 256.0D);
		@Pc(88) double local88 = 0.0D;
		if (local86 < 0) {
			local86 = 0;
		} else if (local86 > 255) {
			local86 = 255;
		}
		if (local39 != local63) {
			if (local30 == local63) {
				local55 = (local21 - local37) / (-local39 + local63);
			} else if (local21 == local63) {
				local55 = (local37 - local30) / (-local39 + local63) + 2.0D;
			} else if (local37 == local63) {
				local55 = (local30 - local21) / (local63 - local39) + 4.0D;
			}
			if (local81 < 0.5D) {
				local88 = (local63 - local39) / (local63 + local39);
			}
			if (local81 >= 0.5D) {
				local88 = (local63 - local39) / (2.0D - local63 - local39);
			}
		}
		@Pc(185) int local185 = (int) (local88 * 256.0D);
		local55 /= 6.0D;
		if (local185 < 0) {
			local185 = 0;
		} else if (local185 > 255) {
			local185 = 255;
		}
		@Pc(207) int local207 = (int) (local55 * 256.0D);
		if (local86 > 243) {
			local185 >>= 0x4;
		} else if (local86 > 217) {
			local185 >>= 0x3;
		} else if (local86 > 192) {
			local185 >>= 0x2;
		} else if (local86 > 179) {
			local185 >>= 0x1;
		}
		return (local207 >> 2 << 10) + (local185 >> 5 << 7) + (local86 >> 1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBILclient!rd;)V")
	private void method2540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4 arg2) {
		if (arg1 == 1) {
			this.anInt3499 = this.method2538(arg2.method197());
		} else if (arg1 == 2) {
			this.anInt3495 = arg2.method191();
			return;
		} else if (arg1 == 3) {
			this.anInt3495 = arg2.method208();
			if (this.anInt3495 == 65535) {
				this.anInt3495 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean148 = false;
			return;
		} else {
			if (arg1 == 7) {
				this.anInt3492 = this.method2538(arg2.method197());
			} else if (arg1 != 8 && arg1 == 9) {
				arg2.method208();
				return;
			}
			return;
		}
	}
}
