import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class243 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!gj;")
	private Class3_Sub5 aClass3_Sub5_45;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!gj;")
	public final Class3_Sub5 aClass3_Sub5_44 = new Class3_Sub5();

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class243() {
		this.aClass3_Sub5_44.aClass3_Sub5_66 = this.aClass3_Sub5_44;
		this.aClass3_Sub5_44.aClass3_Sub5_67 = this.aClass3_Sub5_44;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Lclient!gj;")
	public Class3_Sub5 method5453() {
		@Pc(6) Class3_Sub5 local6 = this.aClass3_Sub5_45;
		if (local6 == this.aClass3_Sub5_44) {
			this.aClass3_Sub5_45 = null;
			return null;
		} else {
			this.aClass3_Sub5_45 = local6.aClass3_Sub5_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!gj;)V")
	public void method5457(@OriginalArg(1) Class3_Sub5 arg0) {
		if (arg0.aClass3_Sub5_67 != null) {
			arg0.method9014();
		}
		arg0.aClass3_Sub5_66 = this.aClass3_Sub5_44;
		arg0.aClass3_Sub5_67 = this.aClass3_Sub5_44.aClass3_Sub5_67;
		arg0.aClass3_Sub5_67.aClass3_Sub5_66 = arg0;
		arg0.aClass3_Sub5_66.aClass3_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
	public int method5458() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class3_Sub5 local16 = this.aClass3_Sub5_44.aClass3_Sub5_66;
		while (this.aClass3_Sub5_44 != local16) {
			local16 = local16.aClass3_Sub5_66;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Lclient!gj;")
	public Class3_Sub5 method5459() {
		@Pc(24) Class3_Sub5 local24 = this.aClass3_Sub5_44.aClass3_Sub5_66;
		if (local24 == this.aClass3_Sub5_44) {
			this.aClass3_Sub5_45 = null;
			return null;
		} else {
			this.aClass3_Sub5_45 = local24.aClass3_Sub5_66;
			return local24;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public void method5460() {
		while (true) {
			@Pc(9) Class3_Sub5 local9 = this.aClass3_Sub5_44.aClass3_Sub5_66;
			if (local9 == this.aClass3_Sub5_44) {
				this.aClass3_Sub5_45 = null;
				return;
			}
			local9.method9014();
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)Lclient!gj;")
	public Class3_Sub5 method5462() {
		@Pc(12) Class3_Sub5 local12 = this.aClass3_Sub5_44.aClass3_Sub5_66;
		if (local12 == this.aClass3_Sub5_44) {
			return null;
		} else {
			local12.method9014();
			return local12;
		}
	}
}
