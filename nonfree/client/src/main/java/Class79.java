import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class79 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	private int anInt1970;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public int anInt1972;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!tk;")
	public Class224 aClass224_3;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!rp;Z)V")
	public void method1653(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method1657(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Lclient!ju;")
	public synchronized Class127 method1655() {
		@Pc(19) Class127 local19 = (Class127) this.aClass224_3.aClass139_76.method3076((long) this.anInt1970);
		if (local19 != null) {
			return local19;
		}
		local19 = Static402.method2800(this.aClass224_3.aClass20_85, this.anInt1970, 0);
		if (local19 != null) {
			this.aClass224_3.aClass139_76.method3070(local19, (long) this.anInt1970);
		}
		return local19;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!rp;Z)V")
	private void method1657(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt1970 = arg1.method2767();
		} else if (arg0 == 2) {
			this.anInt1971 = arg1.method2739();
			this.anInt1972 = arg1.method2739();
		}
	}
}
