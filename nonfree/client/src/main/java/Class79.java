import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class79 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public int anInt1907;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	public int anInt1909;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Z")
	public boolean aBoolean110;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	public int anInt1915;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public int anInt1918;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public int anInt1919;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	public int anInt1910 = 8;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	public int anInt1914 = 16777215;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!hw;)V")
	public void method1867(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6138();
			if (local15 == 0) {
				return;
			}
			this.method1869(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILclient!hw;)V")
	private void method1869(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt1910 = arg1.method6148();
		} else if (arg0 == 2) {
			this.aBoolean110 = true;
		} else if (arg0 == 3) {
			this.anInt1907 = arg1.method6149();
			this.anInt1918 = arg1.method6149();
			this.anInt1919 = arg1.method6149();
		} else if (arg0 == 4) {
			this.anInt1915 = arg1.method6138();
		} else if (arg0 == 5) {
			this.anInt1909 = arg1.method6148();
		} else if (arg0 == 6) {
			this.anInt1914 = arg1.method6145();
			return;
		}
	}
}
