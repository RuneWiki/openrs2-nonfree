import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub4_Sub9 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
	public int anInt1301 = -1;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
	public int anInt1304 = -1;

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "Z")
	public boolean aBoolean56 = true;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
	public int anInt1308 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLclient!ab;I)V")
	private void method940(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1308 = this.method941(arg1.method1654());
		} else if (arg0 == 2) {
			this.anInt1301 = arg1.method1698();
		} else if (arg0 == 3) {
			this.anInt1301 = arg1.method1680();
			if (this.anInt1301 == 65535) {
				this.anInt1301 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean56 = false;
		} else if (arg0 == 7) {
			this.anInt1304 = this.method941(arg1.method1654());
		} else if (arg0 != 8 && arg0 == 9) {
			arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	private int method941(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		@Pc(39) double local39 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(41) double local41 = local30;
		if (local30 > local21) {
			local32 = local21;
		}
		@Pc(49) double local49 = 0.0D;
		if (local30 < local21) {
			local41 = local21;
		}
		if (local41 < local39) {
			local41 = local39;
		}
		if (local39 < local32) {
			local32 = local39;
		}
		@Pc(69) double local69 = 0.0D;
		@Pc(80) double local80 = (local32 + local41) / 2.0D;
		@Pc(85) int local85 = (int) (local80 * 256.0D);
		if (local41 != local32) {
			if (local41 == local30) {
				local49 = (local21 - local39) / (-local32 + local41);
			} else if (local41 == local21) {
				local49 = (local39 - local30) / (local41 - local32) + 2.0D;
			} else if (local39 == local41) {
				local49 = (local30 - local21) / (-local32 + local41) + 4.0D;
			}
			if (local80 < 0.5D) {
				local69 = (local41 - local32) / (local32 + local41);
			}
			if (local80 >= 0.5D) {
				local69 = (local41 - local32) / (-local41 + 2.0D - local32);
			}
		}
		if (local85 < 0) {
			local85 = 0;
		} else if (local85 > 255) {
			local85 = 255;
		}
		local49 /= 6.0D;
		@Pc(184) int local184 = (int) (local49 * 256.0D);
		@Pc(189) int local189 = (int) (local69 * 256.0D);
		if (local189 < 0) {
			local189 = 0;
		} else if (local189 > 255) {
			local189 = 255;
		}
		if (local85 > 243) {
			local189 >>= 0x4;
		} else if (local85 > 217) {
			local189 >>= 0x3;
		} else if (local85 > 192) {
			local189 >>= 0x2;
		} else if (local85 > 179) {
			local189 >>= 0x1;
		}
		return (local85 >> 1) + (local189 >> 5 << 7) + (local184 >> 2 << 10);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!ab;)V")
	public void method942(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method1698();
			if (local14 == 0) {
				return;
			}
			this.method940(local14, arg1, arg0);
		}
	}
}
