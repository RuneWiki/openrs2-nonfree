import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
	public int anInt1379;

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
	public int anInt1380;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
	public int anInt1387;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
	public int anInt1388;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
	private int anInt1381 = 0;

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	private int anInt1385 = -1;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
	private void method1060(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		@Pc(34) double local34 = local30;
		@Pc(36) double local36 = 0.0D;
		if (local30 > local14) {
			local32 = local14;
		}
		@Pc(44) double local44 = 0.0D;
		if (local30 < local14) {
			local34 = local14;
		}
		if (local21 > local34) {
			local34 = local21;
		}
		if (local32 > local21) {
			local32 = local21;
		}
		@Pc(76) double local76 = (local34 + local32) / 2.0D;
		this.anInt1387 = (int) (local76 * 256.0D);
		if (this.anInt1387 < 0) {
			this.anInt1387 = 0;
		} else if (this.anInt1387 > 255) {
			this.anInt1387 = 255;
		}
		if (local32 != local34) {
			if (local34 == local30) {
				local36 = (local14 - local21) / (-local32 + local34);
			} else if (local14 == local34) {
				local36 = (local21 - local30) / (local34 - local32) + 2.0D;
			} else if (local34 == local21) {
				local36 = (local30 - local14) / (local34 - local32) + 4.0D;
			}
			if (local76 < 0.5D) {
				local44 = (local34 - local32) / (local34 + local32);
			}
			if (local76 >= 0.5D) {
				local44 = (local34 - local32) / ((2.0D - local34) - local32);
			}
		}
		if (local76 > 0.5D) {
			this.anInt1380 = (int) ((1.0D - local76) * 512.0D * local44);
		} else {
			this.anInt1380 = (int) (local44 * local76 * 512.0D);
		}
		if (this.anInt1380 < 1) {
			this.anInt1380 = 1;
		}
		this.anInt1388 = (int) (local44 * 256.0D);
		local36 /= 6.0D;
		if (this.anInt1388 < 0) {
			this.anInt1388 = 0;
		} else if (this.anInt1388 > 255) {
			this.anInt1388 = 255;
		}
		this.anInt1379 = (int) ((double) this.anInt1380 * local36);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!ra;B)V")
	public void method1061(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method260();
			if (local13 == 0) {
				return;
			}
			this.method1063(arg1, arg0, local13);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ra;III)V")
	private void method1063(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1381 = arg0.method261();
			this.method1060(this.anInt1381);
		} else if (arg2 == 2) {
			this.anInt1385 = arg0.method269();
			if (this.anInt1385 == 65535) {
				this.anInt1385 = -1;
			}
		} else if (arg2 == 3) {
			arg0.method269();
		}
	}
}
