import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class73 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	public int anInt1833;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
	public int anInt1838;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
	public int anInt1839;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
	public int anInt1828 = -1;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "Z")
	public boolean aBoolean136 = true;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
	private int anInt1835 = 0;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
	public int anInt1840 = 128;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
	private void method1481(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(50) double local50 = local14;
		if (local23 > local14) {
			local50 = local23;
		}
		if (local30 > local50) {
			local50 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local32 + local50) / 2.0D;
		if (local32 != local50) {
			if (local72 < 0.5D) {
				local66 = (local50 - local32) / (local50 + local32);
			}
			if (local50 == local14) {
				local64 = (local23 - local30) / (local50 - local32);
			} else if (local50 == local23) {
				local64 = (local30 - local14) / (-local32 + local50) + 2.0D;
			} else if (local50 == local30) {
				local64 = (local14 - local23) / (local50 - local32) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local32) / (2.0D - local32 - local50);
			}
		}
		this.anInt1839 = (int) (local66 * 256.0D);
		local64 /= 6.0D;
		this.anInt1832 = (int) (local72 * 256.0D);
		if (this.anInt1839 < 0) {
			this.anInt1839 = 0;
		} else if (this.anInt1839 > 255) {
			this.anInt1839 = 255;
		}
		if (this.anInt1832 < 0) {
			this.anInt1832 = 0;
		} else if (this.anInt1832 > 255) {
			this.anInt1832 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt1833 = (int) ((1.0D - local72) * 512.0D * local66);
		} else {
			this.anInt1833 = (int) (local66 * 512.0D * local72);
		}
		if (this.anInt1833 < 1) {
			this.anInt1833 = 1;
		}
		this.anInt1838 = (int) ((double) this.anInt1833 * local64);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!dh;B)V")
	private void method1482(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1835 = arg1.method4493();
			this.method1481(this.anInt1835);
		} else if (arg0 == 2) {
			this.anInt1828 = arg1.method4485();
			if (this.anInt1828 != 65535) {
				return;
			}
			this.anInt1828 = -1;
		} else if (arg0 == 3) {
			this.anInt1840 = arg1.method4485() << 0;
			return;
		} else if (arg0 == 4) {
			this.aBoolean136 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!dh;)V")
	public void method1484(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method1482(local5, arg0);
		}
	}
}
