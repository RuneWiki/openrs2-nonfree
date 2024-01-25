import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class87 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public int anInt2562;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!gd;")
	public Class84 aClass84_1;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	public int anInt2565;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	private int anInt2568;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Lclient!di;")
	public synchronized Class51 method2236() {
		@Pc(13) Class51 local13 = (Class51) this.aClass84_1.aClass134_20.method3266((long) this.anInt2568);
		if (local13 != null) {
			return local13;
		}
		local13 = Static461.method1450(this.aClass84_1.aClass246_81, this.anInt2568, 0);
		if (local13 != null) {
			this.aClass84_1.aClass134_20.method3263((long) this.anInt2568, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!hp;I)V")
	public void method2237(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5366();
			if (local3 == 0) {
				return;
			}
			this.method2239(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!hp;II)V")
	private void method2239(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2568 = arg0.method5362();
		} else if (arg1 == 2) {
			this.anInt2565 = arg0.method5366();
			this.anInt2562 = arg0.method5366();
			return;
		}
	}
}
