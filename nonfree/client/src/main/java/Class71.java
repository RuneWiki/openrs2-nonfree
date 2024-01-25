import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class71 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt1786 = 1190717;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt1787 = 8;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public int anInt1784 = -1;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt1789 = -1;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt1788 = -1;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public int anInt1790 = 16;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public int anInt1792 = 0;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	public int anInt1793 = 128;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	public void method1497(@OriginalArg(1) int arg0) {
		this.anInt1787 = this.anInt1787 << 8 | arg0;
		if (this.anInt1784 == -1) {
			this.anInt1784 = this.anInt1788;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!tq;I)V")
	public void method1498(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method2380();
			if (local13 == 0) {
				return;
			}
			this.method1501(arg0, local13, arg1);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILclient!tq;)V")
	private void method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt1792 = Static209.method3661(arg2.method2402());
		} else if (arg1 == 2) {
			this.anInt1788 = arg2.method2380();
		} else if (arg1 == 3) {
			this.anInt1788 = arg2.method2404();
			if (this.anInt1788 == 65535) {
				this.anInt1788 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean144 = false;
		} else if (arg1 == 7) {
			this.anInt1789 = Static209.method3661(arg2.method2402());
			return;
		} else if (arg1 == 8) {
			Static345.anInt6743 = arg0;
			return;
		} else if (arg1 == 9) {
			this.anInt1793 = arg2.method2404();
			return;
		} else if (arg1 == 10) {
			this.aBoolean143 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt1787 = arg2.method2380();
			return;
		} else if (arg1 == 12) {
			this.aBoolean142 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt1786 = arg2.method2402();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt1790 = arg2.method2380();
			} else if (arg1 == 15) {
				this.anInt1784 = arg2.method2404();
				if (this.anInt1784 == 65535) {
					this.anInt1784 = -1;
					return;
				}
			}
			return;
		}
	}
}
