import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class178 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private int anInt5701;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public int anInt5703;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public int anInt5710;

	static {
		new Class93(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!dg;BI)V")
	private void method5077(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5701 = arg1.method4464();
		} else if (arg2 == 2) {
			this.anInt5710 = arg1.method4421();
			this.anInt5703 = arg1.method4421();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lclient!go;")
	public Class76 method5081() {
		@Pc(11) Class76 local11 = (Class76) Static277.aClass119_169.method3311((long) this.anInt5701);
		if (local11 != null) {
			return local11;
		}
		local11 = Static361.method2368(Static98.aClass191_63, this.anInt5701, 0);
		if (local11 != null) {
			Static277.aClass119_169.method3308(local11, (long) this.anInt5701);
		}
		return local11;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!dg;)V")
	public void method5082(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4421();
			if (local9 == 0) {
				return;
			}
			this.method5077(arg0, arg1, local9);
		}
	}
}
