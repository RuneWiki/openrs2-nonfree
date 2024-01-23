import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class78 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public int anInt2469;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	private int anInt2477;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!qm;)V")
	public void method1839(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2199();
			if (local5 == 0) {
				return;
			}
			this.method1840(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!qm;III)V")
	private void method1840(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt2477 = arg0.method2244();
		} else if (arg2 == 2) {
			this.anInt2469 = arg0.method2199();
			this.anInt2468 = arg0.method2199();
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Lclient!si;")
	public Class1_Sub3_Sub13_Sub2 method1843() {
		@Pc(7) Class1_Sub3_Sub13_Sub2 local7 = (Class1_Sub3_Sub13_Sub2) Static62.aClass89_11.method2268((long) this.anInt2477);
		if (local7 != null) {
			return local7;
		}
		local7 = Static204.method3258(Static40.aClass168_31, this.anInt2477);
		if (local7 != null) {
			Static62.aClass89_11.method2272((long) this.anInt2477, local7);
		}
		return local7;
	}
}
