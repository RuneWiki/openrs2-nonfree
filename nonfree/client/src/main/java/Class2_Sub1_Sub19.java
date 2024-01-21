import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
	public int anInt4214 = 0;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	public int anInt4213 = -1;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
	public int anInt4215 = -1;

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BILclient!og;)V")
	public void method3202(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		while (true) {
			@Pc(11) int local11 = arg1.method218();
			if (local11 == 0) {
				return;
			}
			this.method3204(arg1, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)I")
	private int method3203(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		if (local28 < local19) {
			local37 = local28;
		}
		if (local35 < local37) {
			local37 = local35;
		}
		@Pc(56) double local56 = 0.0D;
		@Pc(58) double local58 = local19;
		@Pc(60) double local60 = 0.0D;
		if (local19 < local28) {
			local58 = local28;
		}
		if (local58 < local35) {
			local58 = local35;
		}
		@Pc(78) double local78 = (local58 + local37) / 2.0D;
		if (local37 != local58) {
			if (local19 == local58) {
				local60 = (local28 - local35) / (-local37 + local58);
			} else if (local58 == local28) {
				local60 = (local35 - local19) / (local58 - local37) + 2.0D;
			} else if (local35 == local58) {
				local60 = (local19 - local28) / (-local37 + local58) + 4.0D;
			}
			if (local78 < 0.5D) {
				local56 = (local58 - local37) / (local37 + local58);
			}
			if (local78 >= 0.5D) {
				local56 = (local58 - local37) / (-local37 + -local58 + 2.0D);
			}
		}
		local60 /= 6.0D;
		@Pc(166) int local166 = (int) (local78 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		@Pc(184) int local184 = (int) (local56 * 256.0D);
		if (local184 < 0) {
			local184 = 0;
		} else if (local184 > 255) {
			local184 = 255;
		}
		if (local166 > 243) {
			local184 >>= 0x4;
		} else if (local166 > 217) {
			local184 >>= 0x3;
		} else if (local166 > 192) {
			local184 >>= 0x2;
		} else if (local166 > 179) {
			local184 >>= 0x1;
		}
		@Pc(243) int local243 = (int) (local60 * 256.0D);
		return (local243 >> 2 << 10) + (local184 >> 5 << 7) + (local166 >> 1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!og;IIB)V")
	private void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt4214 = this.method3203(arg0.method239());
		} else if (arg2 == 2) {
			this.anInt4215 = arg0.method218();
		} else if (arg2 == 3) {
			this.anInt4215 = arg0.method234();
			if (this.anInt4215 == 65535) {
				this.anInt4215 = -1;
				return;
			}
		} else if (arg2 == 5) {
			this.aBoolean167 = false;
		} else {
			if (arg2 == 7) {
				this.anInt4213 = this.method3203(arg0.method239());
			} else if (arg2 != 8 && arg2 == 9) {
				arg0.method234();
				return;
			}
			return;
		}
	}
}
