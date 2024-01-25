import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class293 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public int anInt8802 = 2048;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public int anInt8807 = 2048;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public int anInt8808 = 0;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public int anInt8803 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!fd;)V")
	private void method7214(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt8803 = arg1.method6538();
		} else if (arg0 == 2) {
			this.anInt8807 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt8802 = arg1.method6535();
		} else if (arg0 == 4) {
			this.anInt8808 = arg1.method6525();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method7215(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6538();
			if (local5 == 0) {
				return;
			}
			this.method7214(local5, arg0);
		}
	}
}
