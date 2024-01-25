import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class368 {

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Lclient!lh;")
	private Class5_Sub5 aClass5_Sub5_65;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "Lclient!lh;")
	public final Class5_Sub5 aClass5_Sub5_64 = new Class5_Sub5();

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class368() {
		this.aClass5_Sub5_64.aClass5_Sub5_66 = this.aClass5_Sub5_64;
		this.aClass5_Sub5_64.aClass5_Sub5_67 = this.aClass5_Sub5_64;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Lclient!lh;")
	public Class5_Sub5 method8702() {
		@Pc(7) Class5_Sub5 local7 = this.aClass5_Sub5_64.aClass5_Sub5_66;
		if (this.aClass5_Sub5_64 == local7) {
			this.aClass5_Sub5_65 = null;
			return null;
		} else {
			this.aClass5_Sub5_65 = local7.aClass5_Sub5_66;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public void method8703() {
		while (true) {
			@Pc(9) Class5_Sub5 local9 = this.aClass5_Sub5_64.aClass5_Sub5_66;
			if (local9 == this.aClass5_Sub5_64) {
				this.aClass5_Sub5_65 = null;
				return;
			}
			local9.method8952();
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Lclient!lh;")
	public Class5_Sub5 method8705() {
		@Pc(7) Class5_Sub5 local7 = this.aClass5_Sub5_64.aClass5_Sub5_66;
		if (local7 == this.aClass5_Sub5_64) {
			return null;
		} else {
			local7.method8952();
			return local7;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!lh;)V")
	public void method8709(@OriginalArg(1) Class5_Sub5 arg0) {
		if (arg0.aClass5_Sub5_67 != null) {
			arg0.method8952();
		}
		arg0.aClass5_Sub5_67 = this.aClass5_Sub5_64.aClass5_Sub5_67;
		arg0.aClass5_Sub5_66 = this.aClass5_Sub5_64;
		arg0.aClass5_Sub5_67.aClass5_Sub5_66 = arg0;
		arg0.aClass5_Sub5_66.aClass5_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Lclient!lh;")
	public Class5_Sub5 method8710() {
		@Pc(6) Class5_Sub5 local6 = this.aClass5_Sub5_65;
		if (local6 == this.aClass5_Sub5_64) {
			this.aClass5_Sub5_65 = null;
			return null;
		} else {
			this.aClass5_Sub5_65 = local6.aClass5_Sub5_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)I")
	public int method8711() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class5_Sub5 local11 = this.aClass5_Sub5_64.aClass5_Sub5_66; local11 != this.aClass5_Sub5_64; local11 = local11.aClass5_Sub5_66) {
			local7++;
		}
		return local7;
	}
}
