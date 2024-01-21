import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
	public int anInt1835;

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
	public int anInt1837;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!oa;I)V")
	private void method1327(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt1832 = arg1.method2353();
			this.anInt1835 = arg1.method2387();
			this.anInt1837 = arg1.method2387();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!oa;)V")
	public void method1328(@OriginalArg(1) Class2_Sub18 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2387();
			if (local3 == 0) {
				return;
			}
			this.method1327(local3, arg0);
		}
	}
}
