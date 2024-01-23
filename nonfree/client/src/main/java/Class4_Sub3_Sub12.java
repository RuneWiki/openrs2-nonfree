import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class4_Sub3_Sub12 extends Class4_Sub3 {

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Ljava/lang/String;")
	public String aString153;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	public int anInt2546;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method1993(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4666();
			if (local9 == 0) {
				return;
			}
			this.method2000(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)Z")
	public boolean method1996() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!fd;IZ)V")
	private void method2000(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static219.method3559(arg0.method4674());
		} else if (arg1 == 2) {
			this.anInt2546 = arg0.method4632();
		} else if (arg1 == 5) {
			this.aString153 = arg0.method4630();
		}
	}
}
