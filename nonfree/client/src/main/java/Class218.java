import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class218 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public int anInt5770;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	private int anInt5771;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!os;")
	public Class279 aClass279_1;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public int anInt5775;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lclient!oe;")
	public synchronized Class266 method5190() {
		@Pc(20) Class266 local20 = (Class266) this.aClass279_1.aClass317_51.method7882((long) this.anInt5771);
		if (local20 != null) {
			return local20;
		}
		local20 = Static697.method6466(this.aClass279_1.aClass310_96, this.anInt5771, 0);
		if (local20 != null) {
			this.aClass279_1.aClass317_51.method7875((long) this.anInt5771, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLclient!jc;)V")
	public void method5191(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7695(102);
			if (local3 == 0) {
				return;
			}
			this.method5193(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method5193(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5771 = arg0.method7717(-1978450544);
		} else if (arg1 == 2) {
			this.anInt5770 = arg0.method7695(104);
			this.anInt5775 = arg0.method7695(126);
		}
	}
}
