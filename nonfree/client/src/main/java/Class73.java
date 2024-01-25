import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class73 {

	@OriginalMember(owner = "client!dha", name = "n", descriptor = "Lclient!al;")
	private Class14_Sub3 aClass14_Sub3_21;

	@OriginalMember(owner = "client!dha", name = "l", descriptor = "Lclient!al;")
	public final Class14_Sub3 aClass14_Sub3_20 = new Class14_Sub3();

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V")
	public Class73() {
		this.aClass14_Sub3_20.aClass14_Sub3_66 = this.aClass14_Sub3_20;
		this.aClass14_Sub3_20.aClass14_Sub3_67 = this.aClass14_Sub3_20;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLclient!al;)V")
	public void method1816(@OriginalArg(1) Class14_Sub3 arg0) {
		if (arg0.aClass14_Sub3_66 != null) {
			arg0.method9253();
		}
		arg0.aClass14_Sub3_66 = this.aClass14_Sub3_20.aClass14_Sub3_66;
		arg0.aClass14_Sub3_67 = this.aClass14_Sub3_20;
		arg0.aClass14_Sub3_66.aClass14_Sub3_67 = arg0;
		arg0.aClass14_Sub3_67.aClass14_Sub3_66 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V")
	public void method1819() {
		while (true) {
			@Pc(16) Class14_Sub3 local16 = this.aClass14_Sub3_20.aClass14_Sub3_67;
			if (local16 == this.aClass14_Sub3_20) {
				this.aClass14_Sub3_21 = null;
				return;
			}
			local16.method9253();
		}
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)I")
	public int method1822() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class14_Sub3 local11 = this.aClass14_Sub3_20.aClass14_Sub3_67;
		while (this.aClass14_Sub3_20 != local11) {
			local11 = local11.aClass14_Sub3_67;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)Lclient!al;")
	public Class14_Sub3 method1823() {
		@Pc(7) Class14_Sub3 local7 = this.aClass14_Sub3_20.aClass14_Sub3_67;
		if (this.aClass14_Sub3_20 == local7) {
			return null;
		} else {
			local7.method9253();
			return local7;
		}
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Lclient!al;")
	public Class14_Sub3 method1826() {
		@Pc(13) Class14_Sub3 local13 = this.aClass14_Sub3_20.aClass14_Sub3_67;
		if (this.aClass14_Sub3_20 == local13) {
			this.aClass14_Sub3_21 = null;
			return null;
		} else {
			this.aClass14_Sub3_21 = local13.aClass14_Sub3_67;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(Z)Lclient!al;")
	public Class14_Sub3 method1827() {
		@Pc(6) Class14_Sub3 local6 = this.aClass14_Sub3_21;
		if (local6 == this.aClass14_Sub3_20) {
			this.aClass14_Sub3_21 = null;
			return null;
		} else {
			this.aClass14_Sub3_21 = local6.aClass14_Sub3_67;
			return local6;
		}
	}
}
