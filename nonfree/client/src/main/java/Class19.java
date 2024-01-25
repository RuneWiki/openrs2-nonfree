import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ala")
public final class Class19 {

	@OriginalMember(owner = "client!ala", name = "d", descriptor = "Lclient!ro;")
	public Class327 aClass327_1;

	@OriginalMember(owner = "client!ala", name = "j", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!ala", name = "h", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!ala", name = "b", descriptor = "I")
	public int anInt280;

	@OriginalMember(owner = "client!ala", name = "b", descriptor = "(I)Lclient!tia;")
	public synchronized Class355 method283() {
		@Pc(20) Class355 local20 = (Class355) this.aClass327_1.aClass85_56.method1737((long) this.anInt278);
		if (local20 != null) {
			return local20;
		}
		local20 = Static737.method8362(this.aClass327_1.aClass254_139, this.anInt278, 0);
		if (local20 != null) {
			this.aClass327_1.aClass85_56.method1745((long) this.anInt278, 16383, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ala", name = "a", descriptor = "(BLclient!et;)V")
	public void method284(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method8581(-17416);
			if (local7 == 0) {
				return;
			}
			this.method285(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ala", name = "a", descriptor = "(Lclient!et;II)V")
	private void method285(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt278 = arg0.method8575();
		} else if (arg1 == 2) {
			this.anInt280 = arg0.method8581(-17416);
			this.anInt277 = arg0.method8581(-17416);
		}
	}
}
