import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class59 {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
	public int anInt1575;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Z")
	public boolean aBoolean138 = true;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)Z")
	public boolean method1335() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!eh;I)V")
	private void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static413.method5932(arg1.method6021());
		} else if (arg0 == 2) {
			this.anInt1575 = arg1.method6026();
		} else if (arg0 == 4) {
			this.aBoolean138 = false;
		} else if (arg0 == 5) {
			this.aString17 = arg1.method6010();
			return;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!eh;)V")
	public void method1338(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6015();
			if (local17 == 0) {
				return;
			}
			this.method1337(local17, arg0);
		}
	}
}
