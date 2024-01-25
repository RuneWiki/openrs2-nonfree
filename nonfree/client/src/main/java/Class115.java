import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class115 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!qf;")
	private Class2 aClass2_134;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!wq;")
	private Class216 aClass216_34;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class115() {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class115(@OriginalArg(0) Class216 arg0) {
		this.aClass216_34 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lclient!qf;")
	public Class2 method3268() {
		@Pc(11) Class2 local11 = this.aClass2_134;
		if (this.aClass216_34.aClass2_251 == local11) {
			this.aClass2_134 = null;
			return null;
		} else {
			this.aClass2_134 = local11.aClass2_250;
			return local11;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Lclient!qf;")
	public Class2 method3270() {
		@Pc(8) Class2 local8 = this.aClass216_34.aClass2_251.aClass2_250;
		if (this.aClass216_34.aClass2_251 == local8) {
			this.aClass2_134 = null;
			return null;
		} else {
			this.aClass2_134 = local8.aClass2_250;
			return local8;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method3271(@OriginalArg(0) Class216 arg0) {
		this.aClass216_34 = arg0;
	}
}
