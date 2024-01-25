import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class179 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
	public int anInt5892 = 1;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!ig;)V")
	public void method4811(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8525();
			if (local12 == 0) {
				return;
			}
			this.method4813(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILclient!ig;)V")
	private void method4813(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static303.method4962(arg1.method8550());
		} else if (arg0 == 2) {
			this.anInt5892 = 0;
		}
	}
}
