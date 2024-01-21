import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub4_Sub11 extends Class2_Sub4 {

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
	public int anInt1851;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
	public int anInt1852;

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
	public int anInt1855;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!ab;)V")
	public void method1294(@OriginalArg(1) Class2_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1698();
			if (local14 == 0) {
				return;
			}
			this.method1295(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!ab;)V")
	private void method1295(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt1855 = arg1.method1680();
			this.anInt1851 = arg1.method1698();
			this.anInt1852 = arg1.method1698();
		}
	}
}
