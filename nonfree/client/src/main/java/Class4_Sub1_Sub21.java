import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class4_Sub1_Sub21 extends Class4_Sub1 {

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "Ljava/lang/String;")
	public String aString247;

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
	public int anInt6695;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method5557(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2380();
			if (local5 == 0) {
				return;
			}
			this.method5558(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBLclient!tq;)V")
	private void method5558(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static58.method1043(arg1.method2393());
		} else if (arg0 == 2) {
			this.anInt6695 = arg1.method2389();
		} else if (arg0 == 5) {
			this.aString247 = arg1.method2379();
		}
	}

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)Z")
	public boolean method5561() {
		return this.aChar5 == 's';
	}
}
