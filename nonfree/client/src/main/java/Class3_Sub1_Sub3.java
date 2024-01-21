import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	public int anInt535 = -1;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
	public int anInt536 = -1;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
	public int anInt534 = 0;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "Z")
	public boolean aBoolean31 = true;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!mb;III)V")
	private void method358(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt534 = this.method361(arg0.method2136());
		} else if (arg2 == 2) {
			this.anInt535 = arg0.method2107();
		} else if (arg2 == 3) {
			this.anInt535 = arg0.method2111();
			if (this.anInt535 == 65535) {
				this.anInt535 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean31 = false;
		} else if (arg2 == 7) {
			this.anInt536 = this.method361(arg0.method2136());
		} else if (arg2 != 8 && arg2 == 9) {
			arg0.method2111();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)I")
	private int method361(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		if (local19 < local28) {
			local37 = local28;
		}
		@Pc(45) double local45 = local19;
		if (local37 < local35) {
			local37 = local35;
		}
		@Pc(53) double local53 = 0.0D;
		@Pc(55) double local55 = 0.0D;
		if (local28 < local19) {
			local45 = local28;
		}
		if (local45 > local35) {
			local45 = local35;
		}
		@Pc(73) double local73 = (local37 + local45) / 2.0D;
		if (local37 != local45) {
			if (local73 < 0.5D) {
				local55 = (local37 - local45) / (local37 + local45);
			}
			if (local73 >= 0.5D) {
				local55 = (local37 - local45) / (-local45 + (2.0D - local37));
			}
			if (local37 == local19) {
				local53 = (local28 - local35) / (local37 - local45);
			} else if (local37 == local28) {
				local53 = (local35 - local19) / (local37 - local45) + 2.0D;
			} else if (local37 == local35) {
				local53 = (local19 - local28) / (-local45 + local37) + 4.0D;
			}
		}
		local53 /= 6.0D;
		@Pc(159) int local159 = (int) (local53 * 256.0D);
		@Pc(164) int local164 = (int) (local55 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(187) int local187 = (int) (local73 * 256.0D);
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
		return (local159 >> 2 << 10) - (-(local164 >> 5 << 7) - (local187 >> 1));
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!mb;I)V")
	public void method363(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2107();
			if (local9 == 0) {
				return;
			}
			this.method358(arg1, arg0, local9);
		}
	}
}
