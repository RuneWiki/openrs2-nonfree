import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class174 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!vc;")
	private Class22 aClass22_12;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!vc;")
	public Class22 aClass22_11 = new Class22();

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class174() {
		this.aClass22_11.aClass22_10 = this.aClass22_11;
		this.aClass22_11.aClass22_9 = this.aClass22_11;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLclient!vc;)V")
	public void method4277(@OriginalArg(1) Class22 arg0) {
		if (arg0.aClass22_10 != null) {
			arg0.method946();
		}
		arg0.aClass22_10 = this.aClass22_11.aClass22_10;
		arg0.aClass22_9 = this.aClass22_11;
		arg0.aClass22_10.aClass22_9 = arg0;
		arg0.aClass22_9.aClass22_10 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lclient!vc;")
	public Class22 method4278() {
		@Pc(12) Class22 local12 = this.aClass22_12;
		if (this.aClass22_11 == local12) {
			this.aClass22_12 = null;
			return null;
		} else {
			this.aClass22_12 = local12.aClass22_9;
			return local12;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)I")
	public int method4280() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class22 local11 = this.aClass22_11.aClass22_9;
		while (this.aClass22_11 != local11) {
			local11 = local11.aClass22_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Lclient!vc;")
	public Class22 method4281() {
		@Pc(14) Class22 local14 = this.aClass22_11.aClass22_9;
		if (local14 == this.aClass22_11) {
			this.aClass22_12 = null;
			return null;
		} else {
			this.aClass22_12 = local14.aClass22_9;
			return local14;
		}
	}
}
