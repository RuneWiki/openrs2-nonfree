import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
	public int anInt4117;

	@OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
	public int anInt4119;

	@OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
	public int anInt4120;

	@OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
	public int anInt4122;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
	private int anInt4111 = -1;

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
	private int anInt4113 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	private void method3002(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local23;
		@Pc(34) double local34 = local23;
		@Pc(36) double local36 = 0.0D;
		@Pc(38) double local38 = 0.0D;
		if (local14 > local23) {
			local34 = local14;
		}
		if (local23 > local14) {
			local32 = local14;
		}
		if (local30 > local34) {
			local34 = local30;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(68) double local68 = (local34 + local32) / 2.0D;
		if (local34 != local32) {
			if (local68 < 0.5D) {
				local36 = (local34 - local32) / (local34 + local32);
			}
			if (local68 >= 0.5D) {
				local36 = (local34 - local32) / ((2.0D - local34) - local32);
			}
			if (local23 == local34) {
				local38 = (local14 - local30) / (local34 - local32);
			} else if (local34 == local14) {
				local38 = (local30 - local23) / (local34 - local32) + 2.0D;
			} else if (local30 == local34) {
				local38 = (local23 - local14) / (-local32 + local34) + 4.0D;
			}
		}
		this.anInt4122 = (int) (local36 * 256.0D);
		local38 /= 6.0D;
		if (local68 > 0.5D) {
			this.anInt4117 = (int) (local36 * 512.0D * (1.0D - local68));
		} else {
			this.anInt4117 = (int) (local68 * local36 * 512.0D);
		}
		if (this.anInt4117 < 1) {
			this.anInt4117 = 1;
		}
		if (this.anInt4122 < 0) {
			this.anInt4122 = 0;
		} else if (this.anInt4122 > 255) {
			this.anInt4122 = 255;
		}
		this.anInt4119 = (int) ((double) this.anInt4117 * local38);
		this.anInt4120 = (int) (local68 * 256.0D);
		if (this.anInt4120 < 0) {
			this.anInt4120 = 0;
		} else if (this.anInt4120 > 255) {
			this.anInt4120 = 255;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!nc;II)V")
	public void method3004(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method895();
			if (local5 == 0) {
				return;
			}
			this.method3009(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!nc;I)V")
	private void method3009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub9 arg2) {
		if (arg1 == 1) {
			this.anInt4113 = arg2.method920();
			this.method3002(this.anInt4113);
		} else if (arg1 == 2) {
			this.anInt4111 = arg2.method946();
			if (this.anInt4111 == 65535) {
				this.anInt4111 = -1;
			}
		} else if (arg1 == 3) {
			arg2.method946();
		}
	}
}
