import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class133 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public int anInt4058;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public int anInt4064;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
	public int anInt4071;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	public int anInt4075;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	private int anInt4067 = 0;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Z")
	public boolean aBoolean286 = true;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
	public int anInt4074 = -1;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
	public int anInt4068 = 128;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!fd;II)V")
	public void method3339(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method4666();
			if (local13 == 0) {
				return;
			}
			this.method3341(arg1, arg0, local13);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!fd;IB)V")
	private void method3341(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt4067 = arg1.method4655();
			this.method3343(this.anInt4067);
		} else if (arg2 == 2) {
			this.anInt4074 = arg1.method4653();
			if (this.anInt4074 == 65535) {
				this.anInt4074 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt4068 = arg1.method4653();
		} else if (arg2 == 4) {
			this.aBoolean286 = false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
	private void method3343(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(48) double local48 = local14;
		if (local14 < local23) {
			local48 = local23;
		}
		@Pc(56) double local56 = 0.0D;
		if (local48 < local30) {
			local48 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(71) double local71 = (local32 + local48) / 2.0D;
		this.anInt4075 = (int) (local71 * 256.0D);
		if (this.anInt4075 < 0) {
			this.anInt4075 = 0;
		} else if (this.anInt4075 > 255) {
			this.anInt4075 = 255;
		}
		if (local48 != local32) {
			if (local71 < 0.5D) {
				local65 = (local48 - local32) / (local48 + local32);
			}
			if (local48 == local14) {
				local56 = (local23 - local30) / (local48 - local32);
			} else if (local23 == local48) {
				local56 = (local30 - local14) / (-local32 + local48) + 2.0D;
			} else if (local48 == local30) {
				local56 = (local14 - local23) / (-local32 + local48) + 4.0D;
			}
			if (local71 >= 0.5D) {
				local65 = (local48 - local32) / ((2.0D - local48) - local32);
			}
		}
		this.anInt4064 = (int) (local65 * 256.0D);
		if (local71 > 0.5D) {
			this.anInt4071 = (int) ((1.0D - local71) * 512.0D * local65);
		} else {
			this.anInt4071 = (int) (local65 * 512.0D * local71);
		}
		if (this.anInt4071 < 1) {
			this.anInt4071 = 1;
		}
		local56 /= 6.0D;
		this.anInt4058 = (int) ((double) this.anInt4071 * local56);
		if (this.anInt4064 < 0) {
			this.anInt4064 = 0;
		} else if (this.anInt4064 > 255) {
			this.anInt4064 = 255;
		}
	}
}
