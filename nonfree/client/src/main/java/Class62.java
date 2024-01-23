import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class62 {

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!ki;")
	private Class47 aClass47_6;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!ki;")
	public Class47 aClass47_5 = new Class47();

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class62() {
		this.aClass47_5.aClass47_11 = this.aClass47_5;
		this.aClass47_5.aClass47_12 = this.aClass47_5;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	public int method1362() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class47 local11 = this.aClass47_5.aClass47_12;
		while (this.aClass47_5 != local11) {
			local11 = local11.aClass47_12;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lclient!ki;")
	public Class47 method1363() {
		@Pc(11) Class47 local11 = this.aClass47_6;
		if (local11 == this.aClass47_5) {
			this.aClass47_6 = null;
			return null;
		} else {
			this.aClass47_6 = local11.aClass47_12;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ki;)V")
	public void method1368(@OriginalArg(1) Class47 arg0) {
		if (arg0.aClass47_11 != null) {
			arg0.method4804();
		}
		arg0.aClass47_11 = this.aClass47_5.aClass47_11;
		arg0.aClass47_12 = this.aClass47_5;
		arg0.aClass47_11.aClass47_12 = arg0;
		arg0.aClass47_12.aClass47_11 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Lclient!ki;")
	public Class47 method1369() {
		@Pc(13) Class47 local13 = this.aClass47_5.aClass47_12;
		if (this.aClass47_5 == local13) {
			this.aClass47_6 = null;
			return null;
		} else {
			this.aClass47_6 = local13.aClass47_12;
			return local13;
		}
	}
}
