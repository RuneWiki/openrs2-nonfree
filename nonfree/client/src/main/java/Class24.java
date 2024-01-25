import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class24 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
	public boolean aBoolean42;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	public int anInt571 = 8;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public int anInt565 = 16777215;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!dh;I)V")
	private void method505(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt571 = arg0.method4485();
		} else if (arg1 == 2) {
			this.aBoolean42 = true;
		} else if (arg1 == 3) {
			this.anInt575 = arg0.method4482();
			this.anInt574 = arg0.method4482();
			this.anInt572 = arg0.method4482();
		} else if (arg1 == 4) {
			this.anInt566 = arg0.method4463();
		} else if (arg1 == 5) {
			this.anInt567 = arg0.method4485();
		} else if (arg1 == 6) {
			this.anInt565 = arg0.method4493();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!dh;)V")
	public void method508(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4463();
			if (local15 == 0) {
				return;
			}
			this.method505(arg0, local15);
		}
	}
}
