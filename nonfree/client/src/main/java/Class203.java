import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class203 {

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	public int anInt5706;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public int anInt5707;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public int anInt5709;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt5710;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "Z")
	public boolean aBoolean364;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
	public int anInt5714;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public int anInt5703 = 8;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
	public int anInt5708 = 16777215;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBLclient!dga;)V")
	private void method4909(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt5703 = arg1.method6006();
		} else if (arg0 == 2) {
			this.aBoolean364 = true;
		} else if (arg0 == 3) {
			this.anInt5707 = arg1.method6008();
			this.anInt5709 = arg1.method6008();
			this.anInt5710 = arg1.method6008();
		} else if (arg0 == 4) {
			this.anInt5714 = arg1.method6041();
		} else if (arg0 == 5) {
			this.anInt5706 = arg1.method6006();
		} else if (arg0 == 6) {
			this.anInt5708 = arg1.method5988();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLclient!dga;)V")
	public void method4910(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6041();
			if (local5 == 0) {
				return;
			}
			this.method4909(local5, arg0);
		}
	}
}
