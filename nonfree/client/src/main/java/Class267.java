import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class267 {

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "Lclient!mb;")
	private Class5 aClass5_22;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!mb;")
	private final Class5 aClass5_21 = new Class5();

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class267() {
		this.aClass5_21.aClass5_26 = this.aClass5_21;
		this.aClass5_21.aClass5_25 = this.aClass5_21;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)Lclient!mb;")
	public Class5 method6534() {
		@Pc(7) Class5 local7 = this.aClass5_21.aClass5_26;
		if (local7 == this.aClass5_21) {
			this.aClass5_22 = null;
			return null;
		} else {
			this.aClass5_22 = local7.aClass5_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	public void method6536() {
		while (true) {
			@Pc(9) Class5 local9 = this.aClass5_21.aClass5_25;
			if (local9 == this.aClass5_21) {
				this.aClass5_22 = null;
				return;
			}
			local9.method7282();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!mb;)V")
	public void method6538(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_26 != null) {
			arg0.method7282();
		}
		arg0.aClass5_25 = this.aClass5_21;
		arg0.aClass5_26 = this.aClass5_21.aClass5_26;
		arg0.aClass5_26.aClass5_25 = arg0;
		arg0.aClass5_25.aClass5_26 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Lclient!mb;")
	public Class5 method6540() {
		@Pc(13) Class5 local13 = this.aClass5_21.aClass5_25;
		if (this.aClass5_21 == local13) {
			return null;
		} else {
			local13.method7282();
			return local13;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I")
	public int method6541() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class5 local16 = this.aClass5_21.aClass5_25;
		while (this.aClass5_21 != local16) {
			local16 = local16.aClass5_25;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z")
	public boolean method6542() {
		return this.aClass5_21 == this.aClass5_21.aClass5_25;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)Lclient!mb;")
	public Class5 method6543() {
		@Pc(11) Class5 local11 = this.aClass5_22;
		if (local11 == this.aClass5_21) {
			this.aClass5_22 = null;
			return null;
		} else {
			this.aClass5_22 = local11.aClass5_25;
			return local11;
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)Lclient!mb;")
	public Class5 method6544() {
		@Pc(7) Class5 local7 = this.aClass5_21.aClass5_25;
		if (this.aClass5_21 == local7) {
			this.aClass5_22 = null;
			return null;
		} else {
			this.aClass5_22 = local7.aClass5_25;
			return local7;
		}
	}
}
