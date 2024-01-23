import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class154 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	public int anInt5025 = -1;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
	public int anInt5029 = -1;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!qm;III)V")
	private void method3804(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5029 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anIntArray466 = new int[arg0.method2199()];
			for (@Pc(35) int local35 = 0; local35 < this.anIntArray466.length; local35++) {
				this.anIntArray466[local35] = arg0.method2244();
			}
		} else if (arg1 == 3) {
			this.anInt5025 = arg0.method2199();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!qm;II)V")
	public void method3806(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method3804(arg0, local5, arg1);
		}
	}
}
