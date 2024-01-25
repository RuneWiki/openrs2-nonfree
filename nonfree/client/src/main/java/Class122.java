import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class122 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!gk;")
	private Class1 aClass1_152;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	private int anInt3697 = 0;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!dq;")
	private final Class38 aClass38_19;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!dq;)V")
	public Class122(@OriginalArg(0) Class38 arg0) {
		this.aClass38_19 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Lclient!gk;")
	public Class1 method3450() {
		@Pc(22) Class1 local22;
		if (this.anInt3697 > 0 && this.aClass38_19.aClass1Array1[this.anInt3697 - 1] != this.aClass1_152) {
			local22 = this.aClass1_152;
			this.aClass1_152 = local22.aClass1_251;
			return local22;
		}
		while (this.anInt3697 < this.aClass38_19.anInt1510) {
			local22 = this.aClass38_19.aClass1Array1[this.anInt3697++].aClass1_251;
			if (local22 != this.aClass38_19.aClass1Array1[this.anInt3697 - 1]) {
				this.aClass1_152 = local22.aClass1_251;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lclient!gk;")
	public Class1 method3452() {
		this.anInt3697 = 0;
		return this.method3450();
	}
}
