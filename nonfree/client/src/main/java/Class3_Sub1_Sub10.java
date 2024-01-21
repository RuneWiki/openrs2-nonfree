import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
	public int anInt1473;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
	public int anInt1474;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
	public int anInt1484;

	@OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
	public int anInt1485;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
	private int anInt1487 = 0;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	private void method967(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		@Pc(34) double local34 = 0.0D;
		@Pc(36) double local36 = local10;
		if (local10 < local23) {
			local36 = local23;
		}
		if (local30 > local36) {
			local36 = local30;
		}
		if (local10 > local23) {
			local32 = local23;
		}
		@Pc(56) double local56 = 0.0D;
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(68) double local68 = (local32 + local36) / 2.0D;
		if (local36 != local32) {
			if (local68 < 0.5D) {
				local56 = (local36 - local32) / (local32 + local36);
			}
			if (local36 == local10) {
				local34 = (local23 - local30) / (local36 - local32);
			} else if (local36 == local23) {
				local34 = (local30 - local10) / (local36 - local32) + 2.0D;
			} else if (local30 == local36) {
				local34 = (local10 - local23) / (local36 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local56 = (local36 - local32) / (2.0D - local36 - local32);
			}
		}
		if (local68 > 0.5D) {
			this.anInt1473 = (int) ((1.0D - local68) * local56 * 512.0D);
		} else {
			this.anInt1473 = (int) (local56 * local68 * 512.0D);
		}
		if (this.anInt1473 < 1) {
			this.anInt1473 = 1;
		}
		this.anInt1484 = (int) (local56 * 256.0D);
		this.anInt1474 = (int) (local68 * 256.0D);
		local34 /= 6.0D;
		if (this.anInt1484 < 0) {
			this.anInt1484 = 0;
		} else if (this.anInt1484 > 255) {
			this.anInt1484 = 255;
		}
		if (this.anInt1474 < 0) {
			this.anInt1474 = 0;
		} else if (this.anInt1474 > 255) {
			this.anInt1474 = 255;
		}
		this.anInt1485 = (int) ((double) this.anInt1473 * local34);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBLclient!m;)V")
	public void method969(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub6 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method1587();
			if (local14 == 0) {
				return;
			}
			this.method971(arg0, local14, arg1);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBLclient!m;)V")
	private void method971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub6 arg2) {
		if (arg1 == 1) {
			this.anInt1487 = arg2.method1596();
		}
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
	public void method974() {
		this.method967(this.anInt1487);
	}
}
