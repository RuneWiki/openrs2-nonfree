import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
	public int anInt1850 = -1;

	@OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
	public int anInt1855 = -1;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public int anInt1851 = 0;

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "Z")
	public boolean aBoolean97 = true;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ra;BI)V")
	public void method1493(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method260();
			if (local9 == 0) {
				return;
			}
			this.method1495(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILclient!ra;)V")
	private void method1495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub3 arg2) {
		if (arg0 == 1) {
			this.anInt1851 = Static92.method1598(arg2.method261());
		} else if (arg0 == 2) {
			this.anInt1850 = arg2.method260();
		} else if (arg0 == 3) {
			this.anInt1850 = arg2.method269();
			if (this.anInt1850 == 65535) {
				this.anInt1850 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean97 = false;
		} else {
			if (arg0 == 7) {
				this.anInt1855 = Static92.method1598(arg2.method261());
			} else if (arg0 == 8) {
				Static152.anInt3093 = arg1;
				return;
			} else if (arg0 == 9) {
				arg2.method269();
				return;
			}
			return;
		}
	}
}
