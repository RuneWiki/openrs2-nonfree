import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "Ljava/lang/String;")
	public String aString238;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
	public int anInt6009;

	@OriginalMember(owner = "client!tl", name = "F", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!nj;)V")
	public void method5212(@OriginalArg(1) Class1_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5720();
			if (local5 == 0) {
				return;
			}
			this.method5219(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)Z")
	public boolean method5218() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!nj;I)V")
	private void method5219(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static287.method5025(arg0.method5721());
		} else if (arg1 == 2) {
			this.anInt6009 = arg0.method5716();
		} else if (arg1 == 5) {
			this.aString238 = arg0.method5701();
		}
	}
}
