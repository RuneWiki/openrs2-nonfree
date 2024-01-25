import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class230 {

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!lb;")
	private Class174 aClass174_24;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "Lclient!kp;")
	private Class1 aClass1_202;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	private int anInt6572 = 0;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	private Class230() {
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class230(@OriginalArg(0) Class174 arg0) {
		this.aClass174_24 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Lclient!kp;")
	public Class1 method5700() {
		this.anInt6572 = 0;
		return this.method5702();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lclient!kp;")
	public Class1 method5702() {
		@Pc(20) Class1 local20;
		if (this.anInt6572 > 0 && this.aClass1_202 != this.aClass174_24.aClass1Array1[this.anInt6572 - 1]) {
			local20 = this.aClass1_202;
			this.aClass1_202 = local20.aClass1_283;
			return local20;
		}
		while (this.anInt6572 < this.aClass174_24.anInt5180) {
			local20 = this.aClass174_24.aClass1Array1[this.anInt6572++].aClass1_283;
			if (local20 != this.aClass174_24.aClass1Array1[this.anInt6572 - 1]) {
				this.aClass1_202 = local20.aClass1_283;
				return local20;
			}
		}
		return null;
	}
}
