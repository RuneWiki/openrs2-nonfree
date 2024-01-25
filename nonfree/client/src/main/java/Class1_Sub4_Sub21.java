import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class1_Sub4_Sub21 extends Class1_Sub4 {

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
	public int anInt6469 = 1;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!at;I)V")
	public void method5716(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2132();
			if (local9 == 0) {
				return;
			}
			this.method5719(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!at;II)V")
	private void method5719(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static19.method532(arg0.method2122());
		} else if (arg1 == 2) {
			this.anInt6469 = 0;
			return;
		}
	}
}
