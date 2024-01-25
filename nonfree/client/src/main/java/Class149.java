import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class149 {

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!cja;")
	private Class5_Sub5 aClass5_Sub5_25;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Lclient!cja;")
	public final Class5_Sub5 aClass5_Sub5_24 = new Class5_Sub5();

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class149() {
		this.aClass5_Sub5_24.aClass5_Sub5_66 = this.aClass5_Sub5_24;
		this.aClass5_Sub5_24.aClass5_Sub5_65 = this.aClass5_Sub5_24;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)Lclient!cja;")
	public Class5_Sub5 method2886() {
		@Pc(13) Class5_Sub5 local13 = this.aClass5_Sub5_24.aClass5_Sub5_66;
		if (this.aClass5_Sub5_24 == local13) {
			return null;
		} else {
			local13.method9186();
			return local13;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLclient!cja;)V")
	public void method2889(@OriginalArg(1) Class5_Sub5 arg0) {
		if (arg0.aClass5_Sub5_65 != null) {
			arg0.method9186();
		}
		arg0.aClass5_Sub5_65 = this.aClass5_Sub5_24.aClass5_Sub5_65;
		arg0.aClass5_Sub5_66 = this.aClass5_Sub5_24;
		arg0.aClass5_Sub5_65.aClass5_Sub5_66 = arg0;
		arg0.aClass5_Sub5_66.aClass5_Sub5_65 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Lclient!cja;")
	public Class5_Sub5 method2890() {
		@Pc(7) Class5_Sub5 local7 = this.aClass5_Sub5_24.aClass5_Sub5_66;
		if (this.aClass5_Sub5_24 == local7) {
			this.aClass5_Sub5_25 = null;
			return null;
		} else {
			this.aClass5_Sub5_25 = local7.aClass5_Sub5_66;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public void method2891() {
		while (true) {
			@Pc(14) Class5_Sub5 local14 = this.aClass5_Sub5_24.aClass5_Sub5_66;
			if (local14 == this.aClass5_Sub5_24) {
				this.aClass5_Sub5_25 = null;
				return;
			}
			local14.method9186();
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)I")
	public int method2893() {
		@Pc(7) int local7 = 0;
		@Pc(18) Class5_Sub5 local18 = this.aClass5_Sub5_24.aClass5_Sub5_66;
		while (local18 != this.aClass5_Sub5_24) {
			local18 = local18.aClass5_Sub5_66;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Lclient!cja;")
	public Class5_Sub5 method2894() {
		@Pc(12) Class5_Sub5 local12 = this.aClass5_Sub5_25;
		if (this.aClass5_Sub5_24 == local12) {
			this.aClass5_Sub5_25 = null;
			return null;
		} else {
			this.aClass5_Sub5_25 = local12.aClass5_Sub5_66;
			return local12;
		}
	}
}
