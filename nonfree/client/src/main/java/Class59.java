import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class59 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public int anInt1509 = 128;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	public int anInt1510 = -1;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public int anInt1512 = 1190717;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public int anInt1511 = 8;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public int anInt1515 = 16;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Z")
	public boolean aBoolean120 = true;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public int anInt1514 = -1;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public int anInt1520 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!sb;I)V")
	public void method1243(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method2595();
			if (local15 == 0) {
				return;
			}
			this.method1247(arg1, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!sb;III)V")
	private void method1247(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1520 = Static310.method1127(arg0.method2588());
		} else if (arg1 == 2) {
			this.anInt1514 = arg0.method2595();
		} else if (arg1 == 3) {
			this.anInt1514 = arg0.method2593();
			if (this.anInt1514 == 65535) {
				this.anInt1514 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean120 = false;
		} else if (arg1 == 7) {
			this.anInt1510 = Static310.method1127(arg0.method2588());
		} else if (arg1 == 8) {
			Static307.anInt5799 = arg2;
		} else if (arg1 == 9) {
			this.anInt1509 = arg0.method2593();
		} else if (arg1 == 10) {
			this.aBoolean118 = false;
		} else if (arg1 == 11) {
			this.anInt1511 = arg0.method2595();
		} else if (arg1 == 12) {
			this.aBoolean119 = true;
		} else if (arg1 == 13) {
			this.anInt1512 = arg0.method2588();
		} else if (arg1 == 14) {
			this.anInt1515 = arg0.method2595();
		}
	}
}
