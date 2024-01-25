import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class42 {

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Lclient!hs;")
	public Class112 aClass112_2;

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
	public int anInt1638;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public int anInt1625 = 0;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	public int anInt1624 = -1;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
	public int anInt1630 = 127;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	public int anInt1626 = 128;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
	public int anInt1623 = 1190717;

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
	public int anInt1632 = -1;

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
	public int anInt1634 = 16;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	public int anInt1631 = -1;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
	public int anInt1628 = 8;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "Z")
	public boolean aBoolean112 = true;

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "Z")
	public boolean aBoolean110 = true;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!tl;I)V")
	private void method1236(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.anInt1625 = Static178.method2601(arg1.method4887());
		} else if (arg0 == 2) {
			this.anInt1631 = arg1.method4864();
			return;
		} else if (arg0 == 3) {
			this.anInt1631 = arg1.method4877();
			if (this.anInt1631 == 65535) {
				this.anInt1631 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean110 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt1624 = Static178.method2601(arg1.method4887());
			return;
		} else if (arg0 == 8) {
			this.aClass112_2.anInt2988 = this.anInt1638;
			return;
		} else if (arg0 == 9) {
			this.anInt1626 = arg1.method4877() << 0;
			return;
		} else if (arg0 == 10) {
			this.aBoolean112 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt1628 = arg1.method4864();
			return;
		} else if (arg0 == 12) {
			this.aBoolean111 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt1623 = arg1.method4887();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt1634 = arg1.method4864();
			} else if (arg0 == 15) {
				this.anInt1632 = arg1.method4877();
				if (this.anInt1632 == 65535) {
					this.anInt1632 = -1;
					return;
				}
				return;
			} else if (arg0 == 16) {
				this.anInt1630 = arg1.method4864();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!tl;I)V")
	public void method1237(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4864();
			if (local12 == 0) {
				return;
			}
			this.method1236(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	public void method1238() {
		if (this.anInt1632 == -1) {
			this.anInt1632 = this.anInt1631;
		}
		this.anInt1628 = this.anInt1638 | this.anInt1628 << 8;
	}
}
