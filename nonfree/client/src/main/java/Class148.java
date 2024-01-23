import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class148 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!tf;")
	private Class1 aClass1_191;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	private int anInt5019 = 0;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "Lclient!cd;")
	private Class22 aClass22_19;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!cd;)V")
	public Class148(@OriginalArg(0) Class22 arg0) {
		this.aClass22_19 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lclient!tf;")
	public Class1 method3854() {
		this.anInt5019 = 0;
		return this.method3856();
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Lclient!tf;")
	public Class1 method3856() {
		@Pc(31) Class1 local31;
		if (this.anInt5019 > 0 && this.aClass22_19.aClass1Array1[this.anInt5019 - 1] != this.aClass1_191) {
			local31 = this.aClass1_191;
			this.aClass1_191 = local31.aClass1_230;
			return local31;
		}
		do {
			if (this.anInt5019 >= this.aClass22_19.anInt737) {
				return null;
			}
			local31 = this.aClass22_19.aClass1Array1[this.anInt5019++].aClass1_230;
		} while (local31 == this.aClass22_19.aClass1Array1[this.anInt5019 - 1]);
		this.aClass1_191 = local31.aClass1_230;
		return local31;
	}
}
