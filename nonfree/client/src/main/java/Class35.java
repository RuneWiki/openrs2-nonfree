import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class35 {

	@OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
	public int anInt1745;

	@OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
	public int anInt1748;

	@OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
	public int anInt1749;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILclient!cea;)V")
	public void method1644(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8383();
			if (local13 == 0) {
				return;
			}
			this.method1645(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILclient!cea;B)V")
	private void method1645(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1748 = arg1.method8326();
			this.anInt1745 = arg1.method8383();
			this.anInt1749 = arg1.method8383();
		}
	}
}
