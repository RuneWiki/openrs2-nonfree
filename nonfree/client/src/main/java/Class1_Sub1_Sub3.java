import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!b", name = "K", descriptor = "I")
	public int anInt346 = -1;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	public int anInt344 = -1;

	@OriginalMember(owner = "client!b", name = "O", descriptor = "I")
	public int anInt350 = 0;

	@OriginalMember(owner = "client!b", name = "V", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
	private int method296(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = 0.0D;
		@Pc(39) double local39 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(41) double local41 = local39;
		if (local39 < local21) {
			local41 = local21;
		}
		@Pc(49) double local49 = 0.0D;
		if (local41 < local28) {
			local41 = local28;
		}
		@Pc(57) double local57 = local39;
		if (local39 > local21) {
			local57 = local21;
		}
		if (local28 < local57) {
			local57 = local28;
		}
		@Pc(75) double local75 = (local57 + local41) / 2.0D;
		if (local57 != local41) {
			if (local75 < 0.5D) {
				local49 = (local41 - local57) / (local57 + local41);
			}
			if (local75 >= 0.5D) {
				local49 = (local41 - local57) / (-local57 + (2.0D - local41));
			}
			if (local39 == local41) {
				local30 = (local21 - local28) / (-local57 + local41);
			} else if (local21 == local41) {
				local30 = (local28 - local39) / (-local57 + local41) + 2.0D;
			} else if (local41 == local28) {
				local30 = (local39 - local21) / (local41 - local57) + 4.0D;
			}
		}
		@Pc(162) int local162 = (int) (local75 * (double) 256);
		@Pc(167) int local167 = (int) (local49 * 256.0D);
		local30 /= 6.0D;
		@Pc(176) int local176 = (int) (local30 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		if (local162 > 243) {
			local167 >>= 0x4;
		} else if (local162 > 217) {
			local167 >>= 0x3;
		} else if (local162 > 192) {
			local167 >>= 0x2;
		} else if (local162 > 179) {
			local167 >>= 0x1;
		}
		return (local162 >> 1) + (local167 >> 5 << 7) + (local176 >> 2 << 10);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!fa;I)V")
	public void method297(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9 arg1) {
		while (true) {
			@Pc(12) int local12 = arg1.method1234();
			if (local12 == 0) {
				return;
			}
			this.method300(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILclient!fa;)V")
	private void method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub9 arg2) {
		if (arg0 == 1) {
			this.anInt350 = this.method296(arg2.method1230());
		} else if (arg0 == 2) {
			this.anInt344 = arg2.method1234();
		} else if (arg0 == 3) {
			this.anInt344 = arg2.method1280();
			if (this.anInt344 == 65535) {
				this.anInt344 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean14 = false;
		} else if (arg0 == 7) {
			this.anInt346 = this.method296(arg2.method1230());
		} else if (arg0 != 8 && arg0 == 9) {
			arg2.method1280();
		}
	}
}
