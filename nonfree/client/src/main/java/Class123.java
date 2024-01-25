import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class123 {

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "Lclient!tm;")
	private Class15 aClass15_36;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "Lclient!tm;")
	private final Class15 aClass15_35 = new Class15();

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class123() {
		this.aClass15_35.aClass15_68 = this.aClass15_35;
		this.aClass15_35.aClass15_67 = this.aClass15_35;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public void method3534() {
		while (true) {
			@Pc(5) Class15 local5 = this.aClass15_35.aClass15_68;
			if (local5 == this.aClass15_35) {
				this.aClass15_36 = null;
				return;
			}
			local5.method8314();
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lclient!tm;")
	public Class15 method3535() {
		@Pc(7) Class15 local7 = this.aClass15_35.aClass15_67;
		if (local7 == this.aClass15_35) {
			this.aClass15_36 = null;
			return null;
		} else {
			this.aClass15_36 = local7.aClass15_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Z")
	public boolean method3536() {
		return this.aClass15_35 == this.aClass15_35.aClass15_68;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Lclient!tm;")
	public Class15 method3537() {
		@Pc(13) Class15 local13 = this.aClass15_35.aClass15_68;
		if (local13 == this.aClass15_35) {
			this.aClass15_36 = null;
			return null;
		} else {
			this.aClass15_36 = local13.aClass15_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)I")
	public int method3538() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class15 local11 = this.aClass15_35.aClass15_68;
		while (local11 != this.aClass15_35) {
			local11 = local11.aClass15_68;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!tm;)V")
	public void method3539(@OriginalArg(1) Class15 arg0) {
		if (arg0.aClass15_67 != null) {
			arg0.method8314();
		}
		arg0.aClass15_68 = this.aClass15_35;
		arg0.aClass15_67 = this.aClass15_35.aClass15_67;
		arg0.aClass15_67.aClass15_68 = arg0;
		arg0.aClass15_68.aClass15_67 = arg0;
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Lclient!tm;")
	public Class15 method3540() {
		@Pc(12) Class15 local12 = this.aClass15_35.aClass15_68;
		if (this.aClass15_35 == local12) {
			return null;
		} else {
			local12.method8314();
			return local12;
		}
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)Lclient!tm;")
	public Class15 method3541() {
		@Pc(12) Class15 local12 = this.aClass15_36;
		if (this.aClass15_35 == local12) {
			this.aClass15_36 = null;
			return null;
		} else {
			this.aClass15_36 = local12.aClass15_68;
			return local12;
		}
	}
}
