import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class141 {

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "Lclient!wn;")
	private Class87 aClass87_8;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Lclient!wn;")
	public Class87 aClass87_7 = new Class87();

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class141() {
		this.aClass87_7.aClass87_12 = this.aClass87_7;
		this.aClass87_7.aClass87_11 = this.aClass87_7;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Lclient!wn;")
	public Class87 method3477() {
		@Pc(13) Class87 local13 = this.aClass87_8;
		if (local13 == this.aClass87_7) {
			this.aClass87_8 = null;
			return null;
		} else {
			this.aClass87_8 = local13.aClass87_11;
			return local13;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!wn;)V")
	public void method3478(@OriginalArg(1) Class87 arg0) {
		if (arg0.aClass87_12 != null) {
			arg0.method4455();
		}
		arg0.aClass87_11 = this.aClass87_7;
		arg0.aClass87_12 = this.aClass87_7.aClass87_12;
		arg0.aClass87_12.aClass87_11 = arg0;
		arg0.aClass87_11.aClass87_12 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)I")
	public int method3480() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class87 local16 = this.aClass87_7.aClass87_11;
		while (this.aClass87_7 != local16) {
			local16 = local16.aClass87_11;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)Lclient!wn;")
	public Class87 method3481() {
		@Pc(3) Class87 local3 = this.aClass87_7.aClass87_11;
		if (local3 == this.aClass87_7) {
			this.aClass87_8 = null;
			return null;
		} else {
			this.aClass87_8 = local3.aClass87_11;
			return local3;
		}
	}
}
