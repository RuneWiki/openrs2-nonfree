import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!t", name = "U", descriptor = "I")
	public int anInt2430;

	@OriginalMember(owner = "client!t", name = "W", descriptor = "I")
	public int anInt2432;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "I")
	public int anInt2433;

	@OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
	public int anInt2436;

	@OriginalMember(owner = "client!t", name = "fb", descriptor = "I")
	private int anInt2438 = 0;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
	private void method1749(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = 0.0D;
		@Pc(34) double local34 = local14;
		@Pc(36) double local36 = local14;
		@Pc(38) double local38 = 0.0D;
		if (local14 > local23) {
			local36 = local23;
		}
		if (local30 < local36) {
			local36 = local30;
		}
		if (local23 > local14) {
			local34 = local23;
		}
		if (local30 > local34) {
			local34 = local30;
		}
		@Pc(77) double local77 = (local36 + local34) / 2.0D;
		this.anInt2436 = (int) (local77 * 256.0D);
		if (this.anInt2436 < 0) {
			this.anInt2436 = 0;
		} else if (this.anInt2436 > 255) {
			this.anInt2436 = 255;
		}
		if (local36 != local34) {
			if (local77 < 0.5D) {
				local38 = (local34 - local36) / (local36 + local34);
			}
			if (local14 == local34) {
				local32 = (local23 - local30) / (local34 - local36);
			} else if (local23 == local34) {
				local32 = (local30 - local14) / (local34 - local36) + 2.0D;
			} else if (local34 == local30) {
				local32 = (local14 - local23) / (local34 - local36) + 4.0D;
			}
			if (local77 >= 0.5D) {
				local38 = (local34 - local36) / (2.0D - local36 - local34);
			}
		}
		this.anInt2432 = (int) (local38 * 256.0D);
		if (this.anInt2432 < 0) {
			this.anInt2432 = 0;
		} else if (this.anInt2432 > 255) {
			this.anInt2432 = 255;
		}
		if (local77 > 0.5D) {
			this.anInt2433 = (int) ((1.0D - local77) * 512.0D * local38);
		} else {
			this.anInt2433 = (int) (local77 * 512.0D * local38);
		}
		if (this.anInt2433 < 1) {
			this.anInt2433 = 1;
		}
		local32 /= 6.0D;
		this.anInt2430 = (int) ((double) this.anInt2433 * local32);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!g;I)V")
	public void method1751(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		while (true) {
			@Pc(11) int local11 = arg1.method1281();
			if (local11 == 0) {
				return;
			}
			this.method1752(arg0, arg1, local11);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLclient!g;I)V")
	private void method1752(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub5 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2438 = arg1.method1255();
		}
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
	public void method1753() {
		this.method1749(this.anInt2438);
	}
}
