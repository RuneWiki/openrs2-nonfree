import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class275 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public int anInt8080;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!po;")
	public Class263 aClass263_29;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	private int anInt8082;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public int anInt8083;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)Lclient!ffa;")
	public synchronized Class107 method7008() {
		@Pc(13) Class107 local13 = (Class107) this.aClass263_29.aClass102_47.method2677((long) this.anInt8082);
		if (local13 != null) {
			return local13;
		}
		local13 = Static645.method2771(this.aClass263_29.aClass196_92, this.anInt8082, 0);
		if (local13 != null) {
			this.aClass263_29.aClass102_47.method2674((long) this.anInt8082, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method7009(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method7010(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!sl;BI)V")
	private void method7010(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8082 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt8080 = arg0.method4225();
			this.anInt8083 = arg0.method4225();
		}
	}
}
