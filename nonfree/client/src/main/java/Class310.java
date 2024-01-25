import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class310 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
	public int anInt9346;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Lclient!pg;")
	public Class260 aClass260_25;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
	public int anInt9351;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
	private int anInt9352;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!cea;B)V")
	private void method7818(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt9352 = arg1.method8326();
		} else if (arg0 == 2) {
			this.anInt9346 = arg1.method8383();
			this.anInt9351 = arg1.method8383();
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)Lclient!rh;")
	public synchronized Class296 method7820() {
		@Pc(13) Class296 local13 = (Class296) this.aClass260_25.aClass169_46.method5002((long) this.anInt9352);
		if (local13 != null) {
			return local13;
		}
		local13 = Static652.method7583(this.aClass260_25.aClass157_217, this.anInt9352, 0);
		if (local13 != null) {
			this.aClass260_25.aClass169_46.method5001(local13, (long) this.anInt9352);
		}
		return local13;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!cea;Z)V")
	public void method7821(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8383();
			if (local5 == 0) {
				return;
			}
			this.method7818(local5, arg0);
		}
	}
}
