import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class72 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public int anInt1892;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!nh;")
	public Class171 aClass171_1;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public int anInt1902;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method1549(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1898 = arg0.method5598();
		} else if (arg1 == 2) {
			this.anInt1892 = arg0.method5539();
			this.anInt1902 = arg0.method5539();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!rr;")
	public synchronized Class214 method1550() {
		@Pc(13) Class214 local13 = (Class214) this.aClass171_1.aClass44_39.method1028((long) this.anInt1898);
		if (local13 != null) {
			return local13;
		}
		local13 = Static470.method4672(this.aClass171_1.aClass243_151, this.anInt1898, 0);
		if (local13 != null) {
			this.aClass171_1.aClass44_39.method1017((long) this.anInt1898, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!fh;)V")
	public void method1551(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method5539();
			if (local8 == 0) {
				return;
			}
			this.method1549(arg0, local8);
		}
	}
}
