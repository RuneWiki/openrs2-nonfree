import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class179 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public int anInt5063;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	public int anInt5065;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public int anInt5066;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	public int anInt5069;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
	public int anInt5071;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	public int anInt5068 = 8;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
	public int anInt5072 = 16777215;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method4079(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2502();
			if (local15 == 0) {
				return;
			}
			this.method4081(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!nn;IB)V")
	private void method4081(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5068 = arg0.method2485();
		} else if (arg1 == 2) {
			this.aBoolean343 = true;
		} else if (arg1 == 3) {
			this.anInt5063 = arg0.method2492();
			this.anInt5065 = arg0.method2492();
			this.anInt5066 = arg0.method2492();
		} else if (arg1 == 4) {
			this.anInt5071 = arg0.method2502();
		} else if (arg1 == 5) {
			this.anInt5069 = arg0.method2485();
		} else if (arg1 == 6) {
			this.anInt5072 = arg0.method2507();
		}
	}
}
