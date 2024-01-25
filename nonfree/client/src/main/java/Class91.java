import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class91 {

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!sf;")
	private Class180 aClass180_19;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!nr;")
	private Class2 aClass2_98;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class91() {
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class91(@OriginalArg(0) Class180 arg0) {
		this.aClass180_19 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!sf;I)V")
	public void method2442(@OriginalArg(0) Class180 arg0) {
		this.aClass180_19 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lclient!nr;")
	public Class2 method2443() {
		@Pc(12) Class2 local12 = this.aClass2_98;
		if (local12 == this.aClass180_19.aClass2_207) {
			this.aClass2_98 = null;
			return null;
		} else {
			this.aClass2_98 = local12.aClass2_251;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Lclient!nr;")
	public Class2 method2446() {
		@Pc(15) Class2 local15 = this.aClass180_19.aClass2_207.aClass2_251;
		if (local15 == this.aClass180_19.aClass2_207) {
			this.aClass2_98 = null;
			return null;
		} else {
			this.aClass2_98 = local15.aClass2_251;
			return local15;
		}
	}
}
