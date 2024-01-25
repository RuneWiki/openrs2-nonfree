import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class58 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public int anInt1726;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public int anInt1728;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Z")
	public boolean aBoolean160;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
	public int anInt1730 = 8;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public int anInt1731 = 16777215;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!iv;B)V")
	private void method1508(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1730 = arg1.method2536();
		} else if (arg0 == 2) {
			this.aBoolean160 = true;
		} else if (arg0 == 3) {
			this.anInt1729 = arg1.method2512();
			this.anInt1726 = arg1.method2512();
			this.anInt1728 = arg1.method2512();
		} else if (arg0 == 4) {
			this.anInt1719 = arg1.method2490();
		} else if (arg0 == 5) {
			this.anInt1723 = arg1.method2536();
		} else if (arg0 == 6) {
			this.anInt1731 = arg1.method2493();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!iv;B)V")
	public void method1509(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method1508(local5, arg0);
		}
	}
}
