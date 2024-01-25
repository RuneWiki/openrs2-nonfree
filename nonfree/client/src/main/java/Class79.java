import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class79 {

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
	public int anInt1882;

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
	public int anInt1884;

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
	public int anInt1885;

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
	public int anInt1887;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
	public int anInt1877 = -1;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
	public int anInt1875 = 512;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
	private int anInt1879 = 0;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "Z")
	public boolean aBoolean125 = true;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!dga;)V")
	public void method1653(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6041();
			if (local17 == 0) {
				return;
			}
			this.method1660(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)V")
	private void method1654(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		this.anInt1884 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		this.anInt1887 = (int) (local62 * 256.0D);
		if (this.anInt1884 < 0) {
			this.anInt1884 = 0;
		} else if (this.anInt1884 > 255) {
			this.anInt1884 = 255;
		}
		if (this.anInt1887 < 0) {
			this.anInt1887 = 0;
		} else if (this.anInt1887 > 255) {
			this.anInt1887 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt1885 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt1885 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt1885 < 1) {
			this.anInt1885 = 1;
		}
		this.anInt1882 = (int) ((double) this.anInt1885 * local60);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!dga;II)V")
	private void method1660(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1879 = arg0.method5988();
			this.method1654(this.anInt1879);
		} else if (arg1 == 2) {
			this.anInt1877 = arg0.method6006();
			if (this.anInt1877 == 65535) {
				this.anInt1877 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt1875 = arg0.method6006() << 2;
		} else if (arg1 == 4) {
			this.aBoolean125 = false;
		}
	}
}
