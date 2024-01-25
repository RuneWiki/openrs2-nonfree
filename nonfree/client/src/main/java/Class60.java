import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class60 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	public int anInt1724;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!in;")
	public Class112 aClass112_1;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	private int anInt1727;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public int anInt1731;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lclient!ne;")
	public synchronized Class166 method1415() {
		@Pc(13) Class166 local13 = (Class166) this.aClass112_1.aClass5_31.method104((long) this.anInt1727);
		if (local13 != null) {
			return local13;
		}
		local13 = Static460.method3975(this.aClass112_1.aClass56_46, this.anInt1727, 0);
		if (local13 != null) {
			this.aClass112_1.aClass5_31.method114((long) this.anInt1727, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBLclient!bt;)V")
	private void method1416(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt1727 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt1724 = arg1.method6053();
			this.anInt1731 = arg1.method6053();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLclient!bt;)V")
	public void method1417(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method1416(local3, arg0);
		}
	}
}
