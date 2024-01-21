import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!q", name = "H", descriptor = "I")
	public int anInt3040 = -1;

	@OriginalMember(owner = "client!q", name = "J", descriptor = "Z")
	public boolean aBoolean126 = true;

	@OriginalMember(owner = "client!q", name = "L", descriptor = "I")
	public int anInt3043 = -1;

	@OriginalMember(owner = "client!q", name = "K", descriptor = "I")
	public int anInt3042 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!me;I)V")
	public void method2042(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1402();
			if (local9 == 0) {
				return;
			}
			this.method2046(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)I")
	private int method2044(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local19;
		if (local19 > local28) {
			local30 = local28;
		}
		@Pc(43) double local43 = (double) (arg0 & 0xFF) / 256.0D;
		if (local43 < local30) {
			local30 = local43;
		}
		@Pc(56) double local56 = local19;
		@Pc(58) double local58 = 0.0D;
		if (local19 < local28) {
			local56 = local28;
		}
		@Pc(66) double local66 = 0.0D;
		if (local43 > local56) {
			local56 = local43;
		}
		@Pc(78) double local78 = (local56 + local30) / 2.0D;
		if (local30 != local56) {
			if (local78 < 0.5D) {
				local66 = (local56 - local30) / (local56 + local30);
			}
			if (local56 == local19) {
				local58 = (local28 - local43) / (-local30 + local56);
			} else if (local28 == local56) {
				local58 = (local43 - local19) / (local56 - local30) + 2.0D;
			} else if (local43 == local56) {
				local58 = (local19 - local28) / (-local30 + local56) + 4.0D;
			}
			if (local78 >= 0.5D) {
				local66 = (local56 - local30) / (2.0D - local56 - local30);
			}
		}
		@Pc(162) int local162 = (int) (local66 * 256.0D);
		@Pc(167) int local167 = (int) (local78 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		local58 /= 6.0D;
		if (local167 > 243) {
			local162 >>= 0x4;
		} else if (local167 > 217) {
			local162 >>= 0x3;
		} else if (local167 > 192) {
			local162 >>= 0x2;
		} else if (local167 > 179) {
			local162 >>= 0x1;
		}
		@Pc(241) int local241 = (int) (local58 * 256.0D);
		return (local162 >> 5 << 7) + (local241 >> 2 << 10) + (local167 >> 1);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!me;ZI)V")
	private void method2046(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3042 = this.method2044(arg1.method1406());
		} else if (arg2 == 2) {
			this.anInt3043 = arg1.method1402();
		} else if (arg2 == 3) {
			this.anInt3043 = arg1.method1397();
			if (this.anInt3043 == 65535) {
				this.anInt3043 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean126 = false;
		} else if (arg2 == 7) {
			this.anInt3040 = this.method2044(arg1.method1406());
		} else if (arg2 != 8 && arg2 == 9) {
			arg1.method1397();
		}
	}
}
