import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class289 {

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!wb;")
	private Class6 aClass6_238;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!dfa;")
	private Class74 aClass74_53;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	private int anInt7991 = 0;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	private Class289() {
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!dfa;)V")
	public Class289(@OriginalArg(0) Class74 arg0) {
		this.aClass74_53 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lclient!wb;")
	public Class6 method7032() {
		this.anInt7991 = 0;
		return this.method7033();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lclient!wb;")
	public Class6 method7033() {
		@Pc(33) Class6 local33;
		if (this.anInt7991 > 0 && this.aClass74_53.aClass6Array1[this.anInt7991 - 1] != this.aClass6_238) {
			local33 = this.aClass6_238;
			this.aClass6_238 = local33.aClass6_339;
			return local33;
		}
		while (this.aClass74_53.anInt1437 > this.anInt7991) {
			local33 = this.aClass74_53.aClass6Array1[this.anInt7991++].aClass6_339;
			if (local33 != this.aClass74_53.aClass6Array1[this.anInt7991 - 1]) {
				this.aClass6_238 = local33.aClass6_339;
				return local33;
			}
		}
		return null;
	}
}
