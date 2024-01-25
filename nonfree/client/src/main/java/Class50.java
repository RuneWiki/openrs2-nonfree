import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class50 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!gca;")
	private Class118 aClass118_9;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!tq;")
	private Class2 aClass2_43;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	private int anInt1216 = 0;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	private Class50() {
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class50(@OriginalArg(0) Class118 arg0) {
		this.aClass118_9 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Lclient!tq;")
	public Class2 method952() {
		this.anInt1216 = 0;
		return this.method953();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!tq;")
	public Class2 method953() {
		@Pc(29) Class2 local29;
		if (this.anInt1216 > 0 && this.aClass2_43 != this.aClass118_9.aClass2Array1[this.anInt1216 - 1]) {
			local29 = this.aClass2_43;
			this.aClass2_43 = local29.aClass2_300;
			return local29;
		}
		while (this.aClass118_9.anInt3085 > this.anInt1216) {
			local29 = this.aClass118_9.aClass2Array1[this.anInt1216++].aClass2_300;
			if (this.aClass118_9.aClass2Array1[this.anInt1216 - 1] != local29) {
				this.aClass2_43 = local29.aClass2_300;
				return local29;
			}
		}
		return null;
	}
}
