import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class37 {

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "Lclient!im;")
	private Class1 aClass1_71;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
	private int anInt1349 = 0;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!ik;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!ik;)V")
	public Class37(@OriginalArg(0) Class70 arg0) {
		this.aClass70_1 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Lclient!im;")
	public Class1 method1127() {
		@Pc(25) Class1 local25;
		if (this.anInt1349 > 0 && this.aClass1_71 != this.aClass70_1.aClass1Array1[this.anInt1349 - 1]) {
			local25 = this.aClass1_71;
			this.aClass1_71 = local25.aClass1_231;
			return local25;
		}
		do {
			if (this.anInt1349 >= this.aClass70_1.anInt2613) {
				return null;
			}
			local25 = this.aClass70_1.aClass1Array1[this.anInt1349++].aClass1_231;
		} while (this.aClass70_1.aClass1Array1[this.anInt1349 - 1] == local25);
		this.aClass1_71 = local25.aClass1_231;
		return local25;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Lclient!im;")
	public Class1 method1129() {
		this.anInt1349 = 0;
		return this.method1127();
	}
}
