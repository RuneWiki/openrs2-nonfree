import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class63 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public int anInt1825;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public int anInt1831;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public int anInt1823 = 512;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	private int anInt1829 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt1833 = -1;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Z")
	public boolean aBoolean148 = true;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!dt;)V")
	private void method1493(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt1829 = arg1.method7945();
			this.method1497(this.anInt1829);
		} else if (arg0 == 2) {
			this.anInt1833 = arg1.method7951();
			if (this.anInt1833 == 65535) {
				this.anInt1833 = -1;
				return;
			}
		} else {
			if (arg0 == 3) {
				this.anInt1823 = arg1.method7951() << 2;
			} else if (arg0 == 4) {
				this.aBoolean147 = false;
				return;
			} else if (arg0 == 5) {
				this.aBoolean148 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!dt;)V")
	public void method1495(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7954();
			if (local15 == 0) {
				return;
			}
			this.method1493(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)V")
	private void method1497(@OriginalArg(1) int arg0) {
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
		@Pc(53) double local53 = local14;
		if (local14 < local23) {
			local53 = local23;
		}
		if (local30 > local53) {
			local53 = local30;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local32 + local53) / 2.0D;
		if (local32 != local53) {
			if (local75 < 0.5D) {
				local69 = (local53 - local32) / (local53 + local32);
			}
			if (local14 == local53) {
				local67 = (local23 - local30) / (local53 - local32);
			} else if (local53 == local23) {
				local67 = (local30 - local14) / (-local32 + local53) + 2.0D;
			} else if (local53 == local30) {
				local67 = (local14 - local23) / (-local32 + local53) + 4.0D;
			}
			if (local75 >= 0.5D) {
				local69 = (local53 - local32) / (2.0D - local53 - local32);
			}
		}
		this.anInt1824 = (int) (local69 * 256.0D);
		this.anInt1825 = (int) (local75 * 256.0D);
		local67 /= 6.0D;
		if (this.anInt1824 < 0) {
			this.anInt1824 = 0;
		} else if (this.anInt1824 > 255) {
			this.anInt1824 = 255;
		}
		if (local75 > 0.5D) {
			this.anInt1831 = (int) ((1.0D - local75) * 512.0D * local69);
		} else {
			this.anInt1831 = (int) (local75 * 512.0D * local69);
		}
		if (this.anInt1825 < 0) {
			this.anInt1825 = 0;
		} else if (this.anInt1825 > 255) {
			this.anInt1825 = 255;
		}
		if (this.anInt1831 < 1) {
			this.anInt1831 = 1;
		}
		this.anInt1827 = (int) (local67 * (double) this.anInt1831);
	}
}
