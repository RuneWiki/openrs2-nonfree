import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class92 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public int anInt2893 = 2048;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public int anInt2898 = 0;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public int anInt2896 = 0;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public int anInt2905 = 2048;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILclient!lf;)V")
	public void method2484(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1378();
			if (local9 == 0) {
				return;
			}
			this.method2485(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!lf;I)V")
	private void method2485(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2898 = arg1.method1378();
		} else if (arg0 == 2) {
			this.anInt2893 = arg1.method1386();
		} else if (arg0 == 3) {
			this.anInt2905 = arg1.method1386();
		} else if (arg0 == 4) {
			this.anInt2896 = arg1.method1356();
		}
	}
}
