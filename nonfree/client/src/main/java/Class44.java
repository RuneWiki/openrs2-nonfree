import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class44 {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!ie;")
	private Class2_Sub5 aClass2_Sub5_8;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!ie;")
	private final Class2_Sub5 aClass2_Sub5_7 = new Class2_Sub5();

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class44() {
		this.aClass2_Sub5_7.aClass2_Sub5_57 = this.aClass2_Sub5_7;
		this.aClass2_Sub5_7.aClass2_Sub5_58 = this.aClass2_Sub5_7;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLclient!ie;)V")
	public void method799(@OriginalArg(1) Class2_Sub5 arg0) {
		if (arg0.aClass2_Sub5_57 != null) {
			arg0.method5534();
		}
		arg0.aClass2_Sub5_57 = this.aClass2_Sub5_7.aClass2_Sub5_57;
		arg0.aClass2_Sub5_58 = this.aClass2_Sub5_7;
		arg0.aClass2_Sub5_57.aClass2_Sub5_58 = arg0;
		arg0.aClass2_Sub5_58.aClass2_Sub5_57 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Lclient!ie;")
	public Class2_Sub5 method800() {
		@Pc(7) Class2_Sub5 local7 = this.aClass2_Sub5_7.aClass2_Sub5_58;
		if (local7 == this.aClass2_Sub5_7) {
			return null;
		} else {
			local7.method5534();
			return local7;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	public int method801() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class2_Sub5 local16 = this.aClass2_Sub5_7.aClass2_Sub5_58; local16 != this.aClass2_Sub5_7; local16 = local16.aClass2_Sub5_58) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)Lclient!ie;")
	public Class2_Sub5 method802() {
		@Pc(7) Class2_Sub5 local7 = this.aClass2_Sub5_7.aClass2_Sub5_58;
		if (this.aClass2_Sub5_7 == local7) {
			this.aClass2_Sub5_8 = null;
			return null;
		} else {
			this.aClass2_Sub5_8 = local7.aClass2_Sub5_58;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)Lclient!ie;")
	public Class2_Sub5 method803() {
		@Pc(6) Class2_Sub5 local6 = this.aClass2_Sub5_8;
		if (this.aClass2_Sub5_7 == local6) {
			this.aClass2_Sub5_8 = null;
			return null;
		} else {
			this.aClass2_Sub5_8 = local6.aClass2_Sub5_58;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	public void method807() {
		while (true) {
			@Pc(5) Class2_Sub5 local5 = this.aClass2_Sub5_7.aClass2_Sub5_58;
			if (local5 == this.aClass2_Sub5_7) {
				this.aClass2_Sub5_8 = null;
				return;
			}
			local5.method5534();
		}
	}
}
