import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
	public int anInt1849;

	@OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
	public int anInt1856;

	@OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
	public int anInt1857;

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
	public int anInt1859;

	@OriginalMember(owner = "client!mc", name = "wb", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
	public int anInt1867;

	@OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
	public int anInt1858 = -1;

	@OriginalMember(owner = "client!mc", name = "rb", descriptor = "I")
	public int anInt1862 = 0;

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
	public int anInt1860 = -1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!g;)V")
	public void method1327(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		while (true) {
			@Pc(12) int local12 = arg1.method1281();
			if (local12 == 0) {
				return;
			}
			this.method1337(arg1, local12, arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
	public void method1329() {
		if (this.anInt1860 != -1) {
			this.method1332(this.anInt1860);
			this.anInt1856 = this.anInt1849;
			this.anInt1859 = this.anInt1866;
			this.anInt1867 = this.anInt1857;
		}
		this.method1332(this.anInt1862);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	private void method1332(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = 0.0D;
		@Pc(36) double local36 = local12;
		@Pc(38) double local38 = local12;
		if (local12 > local21) {
			local38 = local21;
		}
		if (local28 < local38) {
			local38 = local28;
		}
		@Pc(52) double local52 = 0.0D;
		if (local21 > local12) {
			local36 = local21;
		}
		if (local36 < local28) {
			local36 = local28;
		}
		@Pc(70) double local70 = (local36 + local38) / 2.0D;
		this.anInt1866 = (int) (local70 * 256.0D);
		if (local38 != local36) {
			if (local70 < 0.5D) {
				local52 = (local36 - local38) / (local38 + local36);
			}
			if (local70 >= 0.5D) {
				local52 = (local36 - local38) / ((2.0D - local36) - local38);
			}
			if (local12 == local36) {
				local34 = (local21 - local28) / (local36 - local38);
			} else if (local21 == local36) {
				local34 = (local28 - local12) / (-local38 + local36) + 2.0D;
			} else if (local28 == local36) {
				local34 = (local12 - local21) / (-local38 + local36) + 4.0D;
			}
		}
		if (this.anInt1866 < 0) {
			this.anInt1866 = 0;
		} else if (this.anInt1866 > 255) {
			this.anInt1866 = 255;
		}
		this.anInt1857 = (int) (local52 * 256.0D);
		if (this.anInt1857 < 0) {
			this.anInt1857 = 0;
		} else if (this.anInt1857 > 255) {
			this.anInt1857 = 255;
		}
		local34 /= 6.0D;
		this.anInt1849 = (int) (local34 * 256.0D);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!g;III)V")
	private void method1337(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1862 = arg0.method1255();
		} else if (arg1 == 2) {
			this.anInt1858 = arg0.method1281();
		} else if (arg1 == 5) {
			this.aBoolean93 = false;
		} else if (arg1 == 7) {
			this.anInt1860 = arg0.method1255();
		}
	}
}
