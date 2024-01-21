import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class52 {

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!qc;")
	private Class5 aClass5_66;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!qc;")
	public final Class5 aClass5_65 = new Class5();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class52() {
		this.aClass5_65.aClass5_105 = this.aClass5_65;
		this.aClass5_65.aClass5_106 = this.aClass5_65;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!qc;")
	public Class5 method1353() {
		@Pc(7) Class5 local7 = this.aClass5_65.aClass5_105;
		if (this.aClass5_65 == local7) {
			this.aClass5_66 = null;
			return null;
		} else {
			this.aClass5_66 = local7.aClass5_105;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!qc;)V")
	public void method1354(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_105 != null) {
			arg0.method2002();
		}
		arg0.aClass5_105 = this.aClass5_65;
		arg0.aClass5_106 = this.aClass5_65.aClass5_106;
		arg0.aClass5_105.aClass5_106 = arg0;
		arg0.aClass5_106.aClass5_105 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!qc;")
	public Class5 method1355() {
		@Pc(7) Class5 local7 = this.aClass5_65.aClass5_106;
		if (local7 == this.aClass5_65) {
			return null;
		} else {
			local7.method2002();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!qc;")
	public Class5 method1356() {
		@Pc(12) Class5 local12 = this.aClass5_65.aClass5_105;
		if (this.aClass5_65 == local12) {
			return null;
		} else {
			local12.method2002();
			return local12;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!qc;")
	public Class5 method1357() {
		@Pc(12) Class5 local12 = this.aClass5_66;
		if (this.aClass5_65 == local12) {
			this.aClass5_66 = null;
			return null;
		} else {
			this.aClass5_66 = local12.aClass5_105;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Lclient!qc;")
	public Class5 method1358() {
		@Pc(3) Class5 local3 = this.aClass5_65.aClass5_106;
		if (this.aClass5_65 == local3) {
			this.aClass5_66 = null;
			return null;
		} else {
			this.aClass5_66 = local3.aClass5_106;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
	public void method1360() {
		while (true) {
			@Pc(11) Class5 local11 = this.aClass5_65.aClass5_106;
			if (this.aClass5_65 == local11) {
				return;
			}
			local11.method2002();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(ILclient!qc;)V")
	public void method1362(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_105 != null) {
			arg0.method2002();
		}
		arg0.aClass5_106 = this.aClass5_65;
		arg0.aClass5_105 = this.aClass5_65.aClass5_105;
		arg0.aClass5_105.aClass5_106 = arg0;
		arg0.aClass5_106.aClass5_105 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lclient!qc;")
	public Class5 method1363() {
		@Pc(11) Class5 local11 = this.aClass5_66;
		if (this.aClass5_65 == local11) {
			this.aClass5_66 = null;
			return null;
		} else {
			this.aClass5_66 = local11.aClass5_106;
			return local11;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!qc;ILclient!qc;)V")
	public void method1364(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg0.aClass5_105 != null) {
			arg0.method2002();
		}
		arg0.aClass5_105 = arg1.aClass5_105;
		arg0.aClass5_106 = arg1;
		arg0.aClass5_105.aClass5_106 = arg0;
		arg0.aClass5_106.aClass5_105 = arg0;
	}
}
