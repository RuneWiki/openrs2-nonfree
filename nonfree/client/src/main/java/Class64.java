import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class64 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	public int anInt1647;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	public int anInt1648;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	public int anInt1649;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
	public int anInt1650;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	public int anInt1651;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public int anInt1646 = 8;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	public int anInt1656 = 16777215;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBLclient!tq;)V")
	private void method1386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt1646 = arg2.method2404();
		} else if (arg1 == 2) {
			this.aBoolean128 = true;
		} else if (arg1 == 3) {
			this.anInt1647 = arg2.method2396();
			this.anInt1649 = arg2.method2396();
			this.anInt1650 = arg2.method2396();
		} else if (arg1 == 4) {
			this.anInt1651 = arg2.method2380();
		} else if (arg1 == 5) {
			this.anInt1648 = arg2.method2404();
		} else if (arg1 == 6) {
			this.anInt1656 = arg2.method2402();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILclient!tq;)V")
	public void method1387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2380();
			if (local5 == 0) {
				return;
			}
			this.method1386(arg0, local5, arg1);
		}
	}
}
