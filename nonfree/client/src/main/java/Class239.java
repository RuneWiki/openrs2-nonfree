import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class239 {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!pt;")
	private Class230 aClass230_42;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!wda;")
	private Class1 aClass1_227;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	private int anInt6926 = 0;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	private Class239() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!pt;)V")
	public Class239(@OriginalArg(0) Class230 arg0) {
		this.aClass230_42 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lclient!wda;")
	public Class1 method6256() {
		this.anInt6926 = 0;
		return this.method6258();
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)Lclient!wda;")
	public Class1 method6258() {
		@Pc(20) Class1 local20;
		if (this.anInt6926 > 0 && this.aClass230_42.aClass1Array1[this.anInt6926 - 1] != this.aClass1_227) {
			local20 = this.aClass1_227;
			this.aClass1_227 = local20.aClass1_283;
			return local20;
		}
		while (this.aClass230_42.anInt6809 > this.anInt6926) {
			local20 = this.aClass230_42.aClass1Array1[this.anInt6926++].aClass1_283;
			if (local20 != this.aClass230_42.aClass1Array1[this.anInt6926 - 1]) {
				this.aClass1_227 = local20.aClass1_283;
				return local20;
			}
		}
		return null;
	}
}
