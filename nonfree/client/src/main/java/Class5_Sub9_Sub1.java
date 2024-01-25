import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class5_Sub9_Sub1 extends Class5_Sub9 {

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	public int anInt1273;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!bk;IB)V")
	private void method1122(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static88.method1387(arg0.method1863());
		} else if (arg1 == 2) {
			this.anInt1273 = arg0.method1826();
		} else if (arg1 == 5) {
			this.aString71 = arg0.method1840();
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)Z")
	public boolean method1123() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!bk;B)V")
	public void method1127(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1832();
			if (local13 == 0) {
				return;
			}
			this.method1122(arg0, local13);
		}
	}
}
