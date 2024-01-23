import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class102 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!md;")
	private Class2_Sub3 aClass2_Sub3_65 = new Class2_Sub3();

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class102() {
		this.aClass2_Sub3_65.aClass2_Sub3_69 = this.aClass2_Sub3_65;
		this.aClass2_Sub3_65.aClass2_Sub3_70 = this.aClass2_Sub3_65;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public void method3622() {
		while (true) {
			@Pc(7) Class2_Sub3 local7 = this.aClass2_Sub3_65.aClass2_Sub3_69;
			if (this.aClass2_Sub3_65 == local7) {
				return;
			}
			local7.method3918();
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Lclient!md;")
	public Class2_Sub3 method3625() {
		@Pc(7) Class2_Sub3 local7 = this.aClass2_Sub3_65.aClass2_Sub3_69;
		if (this.aClass2_Sub3_65 == local7) {
			return null;
		} else {
			local7.method3918();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Lclient!md;")
	public Class2_Sub3 method3626() {
		@Pc(9) Class2_Sub3 local9 = this.aClass2_Sub3_65.aClass2_Sub3_69;
		return local9 == this.aClass2_Sub3_65 ? null : local9;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!md;)V")
	public void method3627(@OriginalArg(1) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub3_70 != null) {
			arg0.method3918();
		}
		arg0.aClass2_Sub3_70 = this.aClass2_Sub3_65;
		arg0.aClass2_Sub3_69 = this.aClass2_Sub3_65.aClass2_Sub3_69;
		arg0.aClass2_Sub3_70.aClass2_Sub3_69 = arg0;
		arg0.aClass2_Sub3_69.aClass2_Sub3_70 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!md;)V")
	public void method3629(@OriginalArg(1) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub3_70 != null) {
			arg0.method3918();
		}
		arg0.aClass2_Sub3_70 = this.aClass2_Sub3_65.aClass2_Sub3_70;
		arg0.aClass2_Sub3_69 = this.aClass2_Sub3_65;
		arg0.aClass2_Sub3_70.aClass2_Sub3_69 = arg0;
		arg0.aClass2_Sub3_69.aClass2_Sub3_70 = arg0;
	}
}
