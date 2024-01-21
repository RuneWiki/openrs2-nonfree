import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public int anInt1708 = -1;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	public int anInt1714 = 0;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
	public int anInt1713 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!wa;BII)V")
	private void method1157(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1714 = Static182.method3056(arg0.method1713());
		} else if (arg1 == 2) {
			this.anInt1713 = arg0.method1738();
		} else if (arg1 == 3) {
			this.anInt1713 = arg0.method1753();
			if (this.anInt1713 == 65535) {
				this.anInt1713 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean74 = false;
		} else if (arg1 == 7) {
			this.anInt1708 = Static182.method3056(arg0.method1713());
		} else if (arg1 == 8) {
			Static75.anInt1866 = arg2;
		} else if (arg1 == 9) {
			arg0.method1753();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBLclient!wa;)V")
	public void method1158(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method1738();
			if (local15 == 0) {
				return;
			}
			this.method1157(arg1, local15, arg0);
		}
	}
}
