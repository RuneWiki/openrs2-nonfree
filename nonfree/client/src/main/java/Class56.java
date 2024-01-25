import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class56 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public int anInt1571;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Z")
	public boolean aBoolean106;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public int anInt1573;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public int anInt1574;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public int anInt1578;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public int anInt1579;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public int anInt1572 = 8;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public int anInt1576 = 16777215;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!nj;)V")
	public void method1533(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4096();
			if (local15 == 0) {
				return;
			}
			this.method1534(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLclient!nj;)V")
	private void method1534(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt1572 = arg1.method4083();
		} else if (arg0 == 2) {
			this.aBoolean106 = true;
		} else if (arg0 == 3) {
			this.anInt1573 = arg1.method4065();
			this.anInt1571 = arg1.method4065();
			this.anInt1579 = arg1.method4065();
		} else if (arg0 == 4) {
			this.anInt1578 = arg1.method4096();
		} else if (arg0 == 5) {
			this.anInt1574 = arg1.method4083();
		} else if (arg0 == 6) {
			this.anInt1576 = arg1.method4099();
		}
	}
}
