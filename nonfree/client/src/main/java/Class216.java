import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class216 {

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
	public int anInt6055 = 1;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!ji;)V")
	public void method5198(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6069();
			if (local5 == 0) {
				return;
			}
			this.method5201(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method5201(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static439.method6249(arg1.method6055());
		} else if (arg0 == 2) {
			this.anInt6055 = 0;
			return;
		}
	}
}
