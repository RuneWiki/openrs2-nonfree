import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
	public boolean aBoolean1;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public int anInt2;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public int anInt10 = 16777215;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	public int anInt15 = 8;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLclient!bk;)V")
	public void method2(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method1832();
			if (local15 == 0) {
				return;
			}
			this.method3(local15, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILclient!bk;)V")
	private void method3(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1 arg2) {
		if (arg0 == 1) {
			this.anInt15 = arg2.method1845();
		} else if (arg0 == 2) {
			this.aBoolean1 = true;
		} else if (arg0 == 3) {
			this.anInt1 = arg2.method1834();
			this.anInt11 = arg2.method1834();
			this.anInt5 = arg2.method1834();
		} else if (arg0 == 4) {
			this.anInt2 = arg2.method1832();
		} else if (arg0 == 5) {
			this.anInt9 = arg2.method1845();
		} else if (arg0 == 6) {
			this.anInt10 = arg2.method1843();
		}
	}
}
