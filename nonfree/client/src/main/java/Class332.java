import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class332 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public int anInt9267;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public int anInt9269;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public int anInt9273;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ud;)V")
	public void method7762(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6904();
			if (local3 == 0) {
				return;
			}
			this.method7763(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ud;B)V")
	private void method7763(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.anInt9273 = arg1.method6884();
			this.anInt9267 = arg1.method6904();
			this.anInt9269 = arg1.method6904();
		}
	}
}
