import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class57 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	public int anInt1606 = -1;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public int anInt1608 = -1;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Z")
	public boolean aBoolean131 = true;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public int anInt1612 = 1190717;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public int anInt1609 = 128;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public int anInt1614 = 16;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public int anInt1616 = 8;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "Z")
	public boolean aBoolean133 = true;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	public int anInt1619 = 0;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!wm;ZI)V")
	public void method1372(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method4261();
			if (local13 == 0) {
				return;
			}
			this.method1376(arg1, local13, arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILclient!wm;)V")
	private void method1376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub26 arg2) {
		if (arg1 == 1) {
			this.anInt1619 = Static227.method3801(arg2.method4245());
		} else if (arg1 == 2) {
			this.anInt1606 = arg2.method4261();
		} else if (arg1 == 3) {
			this.anInt1606 = arg2.method4242();
			if (this.anInt1606 == 65535) {
				this.anInt1606 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean133 = false;
		} else if (arg1 == 7) {
			this.anInt1608 = Static227.method3801(arg2.method4245());
		} else if (arg1 == 8) {
			Static89.anInt1995 = arg0;
		} else if (arg1 == 9) {
			this.anInt1609 = arg2.method4242();
		} else if (arg1 == 10) {
			this.aBoolean131 = false;
		} else if (arg1 == 11) {
			this.anInt1616 = arg2.method4261();
		} else if (arg1 == 12) {
			this.aBoolean132 = true;
		} else if (arg1 == 13) {
			this.anInt1612 = arg2.method4245();
		} else if (arg1 == 14) {
			this.anInt1614 = arg2.method4261();
		}
	}
}
