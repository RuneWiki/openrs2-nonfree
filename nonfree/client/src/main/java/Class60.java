import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class60 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public int anInt2145;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public int anInt2147;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	private int anInt2142 = 0;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	private int anInt2141 = -1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!k;I)V")
	private void method1640(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2142 = arg1.method3806();
			this.method1642(this.anInt2142);
		} else if (arg2 == 2) {
			this.anInt2141 = arg1.method3805();
			if (this.anInt2141 != 65535) {
				return;
			}
			this.anInt2141 = -1;
		} else if (arg2 == 3) {
			arg1.method3805();
			return;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	private void method1642(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local10;
		if (local10 < local23) {
			local38 = local23;
		}
		if (local38 < local36) {
			local38 = local36;
		}
		@Pc(52) double local52 = 0.0D;
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = local10;
		if (local10 > local23) {
			local56 = local23;
		}
		if (local56 > local36) {
			local56 = local36;
		}
		@Pc(74) double local74 = (local38 + local56) / 2.0D;
		if (local56 != local38) {
			if (local74 < 0.5D) {
				local54 = (local38 - local56) / (local38 + local56);
			}
			if (local38 == local10) {
				local52 = (local23 - local36) / (local38 - local56);
			} else if (local23 == local38) {
				local52 = (local36 - local10) / (-local56 + local38) + 2.0D;
			} else if (local36 == local38) {
				local52 = (local10 - local23) / (-local56 + local38) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local54 = (local38 - local56) / (2.0D - local38 - local56);
			}
		}
		this.anInt2151 = (int) (local74 * 256.0D);
		this.anInt2145 = (int) (local54 * 256.0D);
		if (local74 > 0.5D) {
			this.anInt2147 = (int) ((1.0D - local74) * 512.0D * local54);
		} else {
			this.anInt2147 = (int) (local74 * 512.0D * local54);
		}
		if (this.anInt2151 < 0) {
			this.anInt2151 = 0;
		} else if (this.anInt2151 > 255) {
			this.anInt2151 = 255;
		}
		if (this.anInt2147 < 1) {
			this.anInt2147 = 1;
		}
		if (this.anInt2145 < 0) {
			this.anInt2145 = 0;
		} else if (this.anInt2145 > 255) {
			this.anInt2145 = 255;
		}
		local52 /= 6.0D;
		this.anInt2137 = (int) ((double) this.anInt2147 * local52);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLclient!k;)V")
	public void method1644(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3793();
			if (local5 == 0) {
				return;
			}
			this.method1640(arg0, arg1, local5);
		}
	}
}
