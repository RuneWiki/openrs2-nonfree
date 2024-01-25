import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class127 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Lclient!pe;")
	private Class1 aClass1_143;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	private int anInt3488 = 0;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Lclient!qh;")
	private final Class199 aClass199_108;

	static {
		new Class119("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class127(@OriginalArg(0) Class199 arg0) {
		this.aClass199_108 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Lclient!pe;")
	public Class1 method2834() {
		@Pc(25) Class1 local25;
		if (this.anInt3488 > 0 && this.aClass1_143 != this.aClass199_108.aClass1Array1[this.anInt3488 - 1]) {
			local25 = this.aClass1_143;
			this.aClass1_143 = local25.aClass1_261;
			return local25;
		}
		while (this.aClass199_108.anInt5580 > this.anInt3488) {
			local25 = this.aClass199_108.aClass1Array1[this.anInt3488++].aClass1_261;
			if (this.aClass199_108.aClass1Array1[this.anInt3488 - 1] != local25) {
				this.aClass1_143 = local25.aClass1_261;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Lclient!pe;")
	public Class1 method2836() {
		this.anInt3488 = 0;
		return this.method2834();
	}
}
