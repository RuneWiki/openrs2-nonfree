import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
	public int anInt1803;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
	public int anInt1806;

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
	public int anInt1808;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
	public int anInt1809;

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
	public int anInt1814;

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
	public int anInt1817;

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
	public int anInt1810 = -1;

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
	public int anInt1801 = 0;

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "Z")
	public boolean aBoolean67 = true;

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
	public int anInt1818 = -1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!ob;)V")
	public void method1219(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method647();
			if (local9 == 0) {
				return;
			}
			this.method1225(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
	private void method1221(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local10;
		@Pc(32) double local32 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local10 > local32) {
			local23 = local32;
		}
		if (local23 > local21) {
			local23 = local21;
		}
		@Pc(46) double local46 = local10;
		@Pc(48) double local48 = 0.0D;
		if (local32 > local10) {
			local46 = local32;
		}
		if (local46 < local21) {
			local46 = local21;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local23) / 2.0D;
		this.anInt1806 = (int) (local68 * 256.0D);
		if (this.anInt1806 < 0) {
			this.anInt1806 = 0;
		} else if (this.anInt1806 > 255) {
			this.anInt1806 = 255;
		}
		if (local46 != local23) {
			if (local68 < 0.5D) {
				local62 = (local46 - local23) / (local46 + local23);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local23) / (2.0D - local46 - local23);
			}
			if (local46 == local10) {
				local48 = (local32 - local21) / (local46 - local23);
			} else if (local32 == local46) {
				local48 = (local21 - local10) / (local46 - local23) + 2.0D;
			} else if (local46 == local21) {
				local48 = (local10 - local32) / (local46 - local23) + 4.0D;
			}
		}
		local48 /= 6.0D;
		this.anInt1803 = (int) (local62 * 256.0D);
		if (this.anInt1803 < 0) {
			this.anInt1803 = 0;
		} else if (this.anInt1803 > 255) {
			this.anInt1803 = 255;
		}
		this.anInt1809 = (int) (local48 * 256.0D);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
	public void method1222() {
		if (this.anInt1818 != -1) {
			this.method1221(this.anInt1818);
			this.anInt1814 = this.anInt1809;
			this.anInt1808 = this.anInt1803;
			this.anInt1817 = this.anInt1806;
		}
		this.method1221(this.anInt1801);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLclient!ob;II)V")
	private void method1225(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1801 = arg0.method639();
		} else if (arg1 == 2) {
			this.anInt1810 = arg0.method647();
		} else if (arg1 == 5) {
			this.aBoolean67 = false;
		} else if (arg1 == 7) {
			this.anInt1818 = arg0.method639();
		}
	}
}
