import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class122 {

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!rs;")
	private Class2 aClass2_120;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	private int anInt3119 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!wk;")
	private final Class246 aClass246_9;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class122(@OriginalArg(0) Class246 arg0) {
		this.aClass246_9 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Lclient!rs;")
	public Class2 method2875() {
		this.anInt3119 = 0;
		return this.method2878();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lclient!rs;")
	public Class2 method2878() {
		@Pc(20) Class2 local20;
		if (this.anInt3119 > 0 && this.aClass246_9.aClass2Array1[this.anInt3119 - 1] != this.aClass2_120) {
			local20 = this.aClass2_120;
			this.aClass2_120 = local20.aClass2_243;
			return local20;
		}
		while (this.anInt3119 < this.aClass246_9.anInt6537) {
			local20 = this.aClass246_9.aClass2Array1[this.anInt3119++].aClass2_243;
			if (local20 != this.aClass246_9.aClass2Array1[this.anInt3119 - 1]) {
				this.aClass2_120 = local20.aClass2_243;
				return local20;
			}
		}
		return null;
	}
}
