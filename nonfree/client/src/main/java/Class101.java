import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class101 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!qi;")
	public Class201 aClass201_1;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	private int anInt2654;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	public int anInt2655;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method2181(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2654 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt2651 = arg0.method3580();
			this.anInt2655 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Lclient!au;")
	public synchronized Class17 method2182() {
		@Pc(13) Class17 local13 = (Class17) this.aClass201_1.aClass132_51.method2701((long) this.anInt2654);
		if (local13 != null) {
			return local13;
		}
		local13 = Static461.method262(this.aClass201_1.aClass54_89, this.anInt2654, 0);
		if (local13 != null) {
			this.aClass201_1.aClass132_51.method2711(local13, (long) this.anInt2654);
		}
		return local13;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!sv;Z)V")
	public void method2185(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3580();
			if (local16 == 0) {
				return;
			}
			this.method2181(arg0, local16);
		}
	}
}
