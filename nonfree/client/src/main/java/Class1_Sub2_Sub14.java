import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
	public int anInt2968;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	public int anInt2970;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public int anInt2972;

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
	public int anInt2976;

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
	private int anInt2967 = 0;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
	private int anInt2975 = -1;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V")
	private void method2325(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local14;
		@Pc(38) double local38 = 0.0D;
		@Pc(40) double local40 = local14;
		if (local14 < local23) {
			local36 = local23;
		}
		@Pc(48) double local48 = 0.0D;
		if (local30 > local36) {
			local36 = local30;
		}
		if (local14 > local23) {
			local40 = local23;
		}
		if (local30 < local40) {
			local40 = local30;
		}
		@Pc(72) double local72 = (local36 + local40) / 2.0D;
		if (local40 != local36) {
			if (local14 == local36) {
				local48 = (local23 - local30) / (local36 - local40);
			} else if (local23 == local36) {
				local48 = (local30 - local14) / (local36 - local40) + 2.0D;
			} else if (local30 == local36) {
				local48 = (local14 - local23) / (local36 - local40) + 4.0D;
			}
			if (local72 < 0.5D) {
				local38 = (local36 - local40) / (local40 + local36);
			}
			if (local72 >= 0.5D) {
				local38 = (local36 - local40) / (2.0D - local40 - local36);
			}
		}
		local48 /= 6.0D;
		if (local72 > 0.5D) {
			this.anInt2972 = (int) (local38 * 512.0D * (1.0D - local72));
		} else {
			this.anInt2972 = (int) (local72 * local38 * 512.0D);
		}
		this.anInt2970 = (int) (local72 * 256.0D);
		if (this.anInt2972 < 1) {
			this.anInt2972 = 1;
		}
		this.anInt2968 = (int) (local48 * (double) this.anInt2972);
		if (this.anInt2970 < 0) {
			this.anInt2970 = 0;
		} else if (this.anInt2970 > 255) {
			this.anInt2970 = 255;
		}
		this.anInt2976 = (int) (local38 * 256.0D);
		if (this.anInt2976 < 0) {
			this.anInt2976 = 0;
		} else if (this.anInt2976 > 255) {
			this.anInt2976 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!ka;BI)V")
	private void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2967 = arg1.method316();
			this.method2325(this.anInt2967);
		} else if (arg0 == 2) {
			this.anInt2975 = arg1.method359();
			if (this.anInt2975 == 65535) {
				this.anInt2975 = -1;
			}
		} else if (arg0 == 3) {
			arg1.method359();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!ka;)V")
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method336();
			if (local13 == 0) {
				return;
			}
			this.method2327(local13, arg1, arg0);
		}
	}
}
