import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class81 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public int anInt2145;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	private int anInt2148;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Lclient!ne;")
	public Class163 aClass163_2;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public int anInt2152;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!ug;)V")
	public void method1807(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5337();
			if (local15 == 0) {
				return;
			}
			this.method1811(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Lclient!ev;")
	public synchronized Class72 method1809() {
		@Pc(13) Class72 local13 = (Class72) this.aClass163_2.aClass102_34.method2258((long) this.anInt2148);
		if (local13 != null) {
			return local13;
		}
		local13 = Static460.method1572(this.aClass163_2.aClass82_62, this.anInt2148, 0);
		if (local13 != null) {
			this.aClass163_2.aClass102_34.method2272((long) this.anInt2148, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ug;II)V")
	private void method1811(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2148 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt2152 = arg0.method5337();
			this.anInt2145 = arg0.method5337();
		}
	}
}
