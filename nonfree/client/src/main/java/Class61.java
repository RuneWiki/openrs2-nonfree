import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class61 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Lclient!nja;")
	private Class34_Sub3 aClass34_Sub3_2;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Lclient!nja;")
	public final Class34_Sub3 aClass34_Sub3_1 = new Class34_Sub3();

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class61() {
		this.aClass34_Sub3_1.aClass34_Sub3_10 = this.aClass34_Sub3_1;
		this.aClass34_Sub3_1.aClass34_Sub3_9 = this.aClass34_Sub3_1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I")
	public int method1339() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class34_Sub3 local16 = this.aClass34_Sub3_1.aClass34_Sub3_10;
		while (this.aClass34_Sub3_1 != local16) {
			local16 = local16.aClass34_Sub3_10;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Lclient!nja;")
	public Class34_Sub3 method1340() {
		@Pc(11) Class34_Sub3 local11 = this.aClass34_Sub3_2;
		if (this.aClass34_Sub3_1 == local11) {
			this.aClass34_Sub3_2 = null;
			return null;
		} else {
			this.aClass34_Sub3_2 = local11.aClass34_Sub3_10;
			return local11;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Lclient!nja;")
	public Class34_Sub3 method1342() {
		@Pc(7) Class34_Sub3 local7 = this.aClass34_Sub3_1.aClass34_Sub3_10;
		if (this.aClass34_Sub3_1 == local7) {
			this.aClass34_Sub3_2 = null;
			return null;
		} else {
			this.aClass34_Sub3_2 = local7.aClass34_Sub3_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
	public void method1343() {
		while (true) {
			@Pc(15) Class34_Sub3 local15 = this.aClass34_Sub3_1.aClass34_Sub3_10;
			if (this.aClass34_Sub3_1 == local15) {
				this.aClass34_Sub3_2 = null;
				return;
			}
			local15.method8658();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!nja;)V")
	public void method1344(@OriginalArg(1) Class34_Sub3 arg0) {
		if (arg0.aClass34_Sub3_9 != null) {
			arg0.method8658();
		}
		arg0.aClass34_Sub3_9 = this.aClass34_Sub3_1.aClass34_Sub3_9;
		arg0.aClass34_Sub3_10 = this.aClass34_Sub3_1;
		arg0.aClass34_Sub3_9.aClass34_Sub3_10 = arg0;
		arg0.aClass34_Sub3_10.aClass34_Sub3_9 = arg0;
	}
}
