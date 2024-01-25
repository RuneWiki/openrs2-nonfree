import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class154 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
	public int anInt4062 = 1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!ti;)V")
	public void method3382(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4548();
			if (local14 == 0) {
				return;
			}
			this.method3387(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!ti;B)V")
	private void method3387(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static375.method5900(arg1.method4529());
		} else if (arg0 == 2) {
			this.anInt4062 = 0;
		}
	}
}
