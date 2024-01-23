import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class65 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public int anInt1883;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public int anInt1886;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public int anInt1887;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public int anInt1890;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public int anInt1881 = -1;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public int anInt1882 = 128;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private int anInt1891 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
	private void method1723(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		if (local14 > local23) {
			local25 = local23;
		}
		if (local25 > local32) {
			local25 = local32;
		}
		@Pc(62) double local62 = local14;
		if (local23 > local14) {
			local62 = local23;
		}
		if (local32 > local62) {
			local62 = local32;
		}
		@Pc(78) double local78 = 0.0D;
		@Pc(80) double local80 = 0.0D;
		@Pc(86) double local86 = (local25 + local62) / 2.0D;
		if (local25 != local62) {
			if (local86 < 0.5D) {
				local80 = (local62 - local25) / (local62 + local25);
			}
			if (local86 >= 0.5D) {
				local80 = (local62 - local25) / ((2.0D - local62) - local25);
			}
			if (local14 == local62) {
				local78 = (local23 - local32) / (local62 - local25);
			} else if (local23 == local62) {
				local78 = (local32 - local14) / (local62 - local25) + 2.0D;
			} else if (local32 == local62) {
				local78 = (local14 - local23) / (local62 - local25) + 4.0D;
			}
		}
		this.anInt1883 = (int) (local80 * 256.0D);
		if (this.anInt1883 < 0) {
			this.anInt1883 = 0;
		} else if (this.anInt1883 > 255) {
			this.anInt1883 = 255;
		}
		if (local86 > 0.5D) {
			this.anInt1886 = (int) (local80 * 512.0D * (1.0D - local86));
		} else {
			this.anInt1886 = (int) (local86 * 512.0D * local80);
		}
		if (this.anInt1886 < 1) {
			this.anInt1886 = 1;
		}
		local78 /= 6.0D;
		this.anInt1887 = (int) ((double) this.anInt1886 * local78);
		this.anInt1890 = (int) (local86 * 256.0D);
		if (this.anInt1890 < 0) {
			this.anInt1890 = 0;
		} else if (this.anInt1890 > 255) {
			this.anInt1890 = 255;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!fh;BI)V")
	private void method1724(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1891 = arg1.method1878();
			this.method1723(this.anInt1891);
		} else if (arg2 == 2) {
			this.anInt1881 = arg1.method1879();
			if (this.anInt1881 == 65535) {
				this.anInt1881 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt1882 = arg1.method1879();
		} else if (arg2 == 4) {
			this.aBoolean181 = false;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!fh;II)V")
	public void method1726(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(19) int local19 = arg0.method1853();
			if (local19 == 0) {
				return;
			}
			this.method1724(arg1, arg0, local19);
		}
	}
}
