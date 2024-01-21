import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
	public int anInt2005 = 0;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	public int anInt2004 = -1;

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "Z")
	public boolean aBoolean90 = true;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
	public int anInt2011 = -1;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)I")
	private int method1604(@OriginalArg(0) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		@Pc(39) double local39 = local19;
		if (local28 > local19) {
			local39 = local28;
		}
		if (local39 < local35) {
			local39 = local35;
		}
		if (local19 > local28) {
			local37 = local28;
		}
		if (local35 < local37) {
			local37 = local35;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(71) double local71 = (local39 + local37) / 2.0D;
		@Pc(73) double local73 = 0.0D;
		@Pc(78) int local78 = (int) (local71 * 256.0D);
		if (local78 < 0) {
			local78 = 0;
		} else if (local78 > 255) {
			local78 = 255;
		}
		if (local39 != local37) {
			if (local19 == local39) {
				local65 = (local28 - local35) / (-local37 + local39);
			} else if (local39 == local28) {
				local65 = (local35 - local19) / (-local37 + local39) + 2.0D;
			} else if (local35 == local39) {
				local65 = (local19 - local28) / (local39 - local37) + 4.0D;
			}
			if (local71 < 0.5D) {
				local73 = (local39 - local37) / (local37 + local39);
			}
			if (local71 >= 0.5D) {
				local73 = (local39 - local37) / (2.0D - local39 - local37);
			}
		}
		local65 /= 6.0D;
		@Pc(182) int local182 = (int) (local73 * 256.0D);
		@Pc(187) int local187 = (int) (local65 * 256.0D);
		if (local182 < 0) {
			local182 = 0;
		} else if (local182 > 255) {
			local182 = 255;
		}
		if (local78 > 243) {
			local182 >>= 0x4;
		} else if (local78 > 217) {
			local182 >>= 0x3;
		} else if (local78 > 192) {
			local182 >>= 0x2;
		} else if (local78 > 179) {
			local182 >>= 0x1;
		}
		return (local78 >> 1) + (local182 >> 5 << 7) + (local187 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!h;Z)V")
	public void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1253();
			if (local5 == 0) {
				return;
			}
			this.method1607(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!h;III)V")
	private void method1607(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt2005 = this.method1604(arg0.method1225());
		} else if (arg2 == 2) {
			this.anInt2004 = arg0.method1253();
		} else if (arg2 == 3) {
			this.anInt2004 = arg0.method1252();
			if (this.anInt2004 == 65535) {
				this.anInt2004 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean90 = false;
		} else if (arg2 == 7) {
			this.anInt2011 = this.method1604(arg0.method1225());
		} else if (arg2 != 8 && arg2 == 9) {
			arg0.method1252();
		}
	}
}
