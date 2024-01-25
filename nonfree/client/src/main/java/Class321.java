import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class321 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public int anInt8630 = 1;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!vj;B)V")
	public void method7269(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method7270(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!vj;II)V")
	private void method7270(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static212.method2950(arg0.method8548());
		} else if (arg1 == 2) {
			this.anInt8630 = 0;
			return;
		}
	}
}
