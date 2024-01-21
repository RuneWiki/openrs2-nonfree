import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
	public int anInt4244;

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
	public int anInt4246;

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
	public int anInt4247;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	private int anInt4240 = 0;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
	private int anInt4242 = -1;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
	private void method3036(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = 0.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(39) double local39 = local37;
		@Pc(41) double local41 = local37;
		if (local10 < local37) {
			local41 = local10;
		}
		if (local41 > local28) {
			local41 = local28;
		}
		if (local37 < local10) {
			local39 = local10;
		}
		if (local28 > local39) {
			local39 = local28;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local41 + local39) / 2.0D;
		if (local41 != local39) {
			if (local73 < 0.5D) {
				local67 = (local39 - local41) / (local41 + local39);
			}
			if (local39 == local37) {
				local21 = (local10 - local28) / (-local41 + local39);
			} else if (local10 == local39) {
				local21 = (local28 - local37) / (-local41 + local39) + 2.0D;
			} else if (local28 == local39) {
				local21 = (local37 - local10) / (-local41 + local39) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local39 - local41) / (2.0D - local41 - local39);
			}
		}
		this.anInt4246 = (int) (local73 * 256.0D);
		if (this.anInt4246 < 0) {
			this.anInt4246 = 0;
		} else if (this.anInt4246 > 255) {
			this.anInt4246 = 255;
		}
		local21 /= 6.0D;
		this.anInt4247 = (int) (local67 * 256.0D);
		if (local73 > 0.5D) {
			this.anInt4238 = (int) ((1.0D - local73) * local67 * 512.0D);
		} else {
			this.anInt4238 = (int) (local73 * local67 * 512.0D);
		}
		if (this.anInt4247 < 0) {
			this.anInt4247 = 0;
		} else if (this.anInt4247 > 255) {
			this.anInt4247 = 255;
		}
		if (this.anInt4238 < 1) {
			this.anInt4238 = 1;
		}
		this.anInt4244 = (int) ((double) this.anInt4238 * local21);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!mb;III)V")
	private void method3037(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt4240 = arg0.method2136();
			this.method3036(this.anInt4240);
		} else if (arg2 == 2) {
			this.anInt4242 = arg0.method2111();
			if (this.anInt4242 == 65535) {
				this.anInt4242 = -1;
				return;
			}
		} else if (arg2 == 3) {
			arg0.method2111();
			return;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!mb;BI)V")
	public void method3039(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method2107();
			if (local10 == 0) {
				return;
			}
			this.method3037(arg0, arg1, local10);
		}
	}
}
