import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Z")
	public boolean aBoolean96 = true;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	public int anInt1668 = 0;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
	public int anInt1673 = -1;

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "I")
	public int anInt1675 = -1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)I")
	private int method1334(@OriginalArg(1) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(35) double local35 = local28;
		if (local28 > local19) {
			local35 = local19;
		}
		@Pc(48) double local48 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(50) double local50 = local28;
		if (local28 < local19) {
			local50 = local19;
		}
		if (local35 > local48) {
			local35 = local48;
		}
		if (local50 < local48) {
			local50 = local48;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(72) double local72 = 0.0D;
		@Pc(78) double local78 = (local35 + local50) / 2.0D;
		if (local35 != local50) {
			if (local78 < 0.5D) {
				local72 = (local50 - local35) / (local35 + local50);
			}
			if (local78 >= 0.5D) {
				local72 = (local50 - local35) / (-local50 + 2.0D - local35);
			}
			if (local50 == local28) {
				local70 = (local19 - local48) / (local50 - local35);
			} else if (local19 == local50) {
				local70 = (local48 - local28) / (local50 - local35) + 2.0D;
			} else if (local50 == local48) {
				local70 = (local28 - local19) / (-local35 + local50) + 4.0D;
			}
		}
		local70 /= 6.0D;
		@Pc(167) int local167 = (int) (local70 * 256.0D);
		@Pc(172) int local172 = (int) (local78 * 256.0D);
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		@Pc(191) int local191 = (int) (local72 * 256.0D);
		if (local191 < 0) {
			local191 = 0;
		} else if (local191 > 255) {
			local191 = 255;
		}
		if (local172 > 243) {
			local191 >>= 0x4;
		} else if (local172 > 217) {
			local191 >>= 0x3;
		} else if (local172 > 192) {
			local191 >>= 0x2;
		} else if (local172 > 179) {
			local191 >>= 0x1;
		}
		return (local172 >> 1) + (local191 >> 5 << 7) + (local167 >> 2 << 10);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!hd;ZI)V")
	private void method1335(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1668 = this.method1334(arg1.method1554());
		} else if (arg0 == 2) {
			this.anInt1673 = arg1.method1545();
		} else if (arg0 == 3) {
			this.anInt1673 = arg1.method1510();
			if (this.anInt1673 == 65535) {
				this.anInt1673 = -1;
				return;
			}
		} else {
			if (arg0 == 5) {
				this.aBoolean96 = false;
			} else if (arg0 == 7) {
				this.anInt1675 = this.method1334(arg1.method1554());
				return;
			} else if (arg0 != 8 && arg0 == 9) {
				arg1.method1510();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!hd;I)V")
	public void method1338(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1545();
			if (local5 == 0) {
				return;
			}
			this.method1335(local5, arg1, arg0);
		}
	}
}
