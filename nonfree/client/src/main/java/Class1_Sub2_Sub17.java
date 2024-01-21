import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!od", name = "O", descriptor = "I")
	public int anInt3257;

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
	public int anInt3259;

	@OriginalMember(owner = "client!od", name = "W", descriptor = "I")
	public int anInt3263;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBLclient!wa;)V")
	private void method2503(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt3263 = arg1.method1753();
			this.anInt3257 = arg1.method1738();
			this.anInt3259 = arg1.method1738();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!wa;)V")
	public void method2507(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1738();
			if (local12 == 0) {
				return;
			}
			this.method2503(local12, arg0);
		}
	}
}
