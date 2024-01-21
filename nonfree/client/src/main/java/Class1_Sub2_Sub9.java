import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	public int anInt2298 = -1;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	public int anInt2300 = -1;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
	public int anInt2306 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
	private int method1694(@OriginalArg(0) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(26) double local26 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(33) double local33 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(42) double local42 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(44) double local44 = local42;
		@Pc(46) double local46 = 0.0D;
		if (local26 > local42) {
			local44 = local26;
		}
		@Pc(54) double local54 = 0.0D;
		if (local33 > local44) {
			local44 = local33;
		}
		@Pc(62) double local62 = local42;
		if (local42 > local26) {
			local62 = local26;
		}
		if (local62 > local33) {
			local62 = local33;
		}
		@Pc(80) double local80 = (local44 + local62) / 2.0D;
		if (local44 != local62) {
			if (local80 < 0.5D) {
				local54 = (local44 - local62) / (local62 + local44);
			}
			if (local80 >= 0.5D) {
				local54 = (local44 - local62) / (-local62 + (2.0D - local44));
			}
			if (local42 == local44) {
				local46 = (local26 - local33) / (local44 - local62);
			} else if (local26 == local44) {
				local46 = (local33 - local42) / (-local62 + local44) + 2.0D;
			} else if (local33 == local44) {
				local46 = (local42 - local26) / (-local62 + local44) + 4.0D;
			}
		}
		@Pc(163) int local163 = (int) (local54 * 256.0D);
		local46 /= 6.0D;
		@Pc(172) int local172 = (int) (local46 * 256.0D);
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		@Pc(191) int local191 = (int) (local80 * 256.0D);
		if (local191 < 0) {
			local191 = 0;
		} else if (local191 > 255) {
			local191 = 255;
		}
		if (local191 > 243) {
			local163 >>= 0x4;
		} else if (local191 > 217) {
			local163 >>= 0x3;
		} else if (local191 > 192) {
			local163 >>= 0x2;
		} else if (local191 > 179) {
			local163 >>= 0x1;
		}
		return (local191 >> 1) + (local172 >> 2 << 10) + (local163 >> 5 << 7);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ce;Z)V")
	public void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1607();
			if (local5 == 0) {
				return;
			}
			this.method1698(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!ce;I)V")
	private void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub8 arg2) {
		if (arg0 == 1) {
			this.anInt2306 = this.method1694(arg2.method1618());
		} else if (arg0 == 2) {
			this.anInt2300 = arg2.method1607();
		} else if (arg0 == 3) {
			this.anInt2300 = arg2.method1642();
			if (this.anInt2300 == 65535) {
				this.anInt2300 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean174 = false;
		} else if (arg0 == 7) {
			this.anInt2298 = this.method1694(arg2.method1618());
		} else if (arg0 != 8 && arg0 == 9) {
			arg2.method1642();
		}
	}
}
