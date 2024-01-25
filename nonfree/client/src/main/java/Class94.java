import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class94 {

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
	public int anInt1873 = 1;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILclient!ib;)V")
	private void method1658(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static101.method1448(arg1.method8488());
		} else if (arg0 == 2) {
			this.anInt1873 = 0;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method1659(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8529();
			if (local17 == 0) {
				return;
			}
			this.method1658(local17, arg0);
		}
	}
}
