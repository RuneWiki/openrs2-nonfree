import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class10 {

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Lclient!si;")
	private Class335 aClass335_1;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "Lclient!it;")
	private Class2 aClass2_7;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
	private int anInt164 = 0;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class10(@OriginalArg(0) Class335 arg0) {
		this.aClass335_1 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Lclient!it;")
	public Class2 method151() {
		@Pc(29) Class2 local29;
		if (this.anInt164 > 0 && this.aClass335_1.aClass2Array1[this.anInt164 - 1] != this.aClass2_7) {
			local29 = this.aClass2_7;
			this.aClass2_7 = local29.aClass2_338;
			return local29;
		}
		while (this.aClass335_1.anInt9530 > this.anInt164) {
			local29 = this.aClass335_1.aClass2Array1[this.anInt164++].aClass2_338;
			if (this.aClass335_1.aClass2Array1[this.anInt164 - 1] != local29) {
				this.aClass2_7 = local29.aClass2_338;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)Lclient!it;")
	public Class2 method152() {
		this.anInt164 = 0;
		return this.method151();
	}
}
