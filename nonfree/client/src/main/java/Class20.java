import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class20 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	public int anInt449 = 8;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public int anInt441 = 16777215;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!jg;IB)V")
	public void method504(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.method2548();
			if (local18 == 0) {
				return;
			}
			this.method505(arg1, local18, arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!jg;I)V")
	private void method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub4 arg2) {
		if (arg1 == 1) {
			this.anInt449 = arg2.method2498();
		} else if (arg1 == 2) {
			this.aBoolean23 = true;
		} else if (arg1 == 3) {
			this.anInt442 = arg2.method2502();
			this.anInt444 = arg2.method2502();
			this.anInt447 = arg2.method2502();
		} else if (arg1 == 4) {
			this.anInt440 = arg2.method2548();
		} else if (arg1 == 5) {
			this.anInt446 = arg2.method2498();
		} else if (arg1 == 6) {
			this.anInt441 = arg2.method2501();
		}
	}
}
