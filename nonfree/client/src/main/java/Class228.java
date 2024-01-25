import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class228 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!am;")
	private Class14 aClass14_44;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!ev;")
	private Class1 aClass1_214;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class228() {
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class228(@OriginalArg(0) Class14 arg0) {
		this.aClass14_44 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!am;)V")
	public void method4803(@OriginalArg(1) Class14 arg0) {
		this.aClass14_44 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lclient!ev;")
	public Class1 method4804() {
		@Pc(15) Class1 local15 = this.aClass14_44.aClass1_5.aClass1_267;
		if (local15 == this.aClass14_44.aClass1_5) {
			this.aClass1_214 = null;
			return null;
		} else {
			this.aClass1_214 = local15.aClass1_267;
			return local15;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Lclient!ev;")
	public Class1 method4808() {
		@Pc(6) Class1 local6 = this.aClass1_214;
		if (this.aClass14_44.aClass1_5 == local6) {
			this.aClass1_214 = null;
			return null;
		} else {
			this.aClass1_214 = local6.aClass1_267;
			return local6;
		}
	}
}
