import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class187 {

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Lclient!ke;")
	private Class5_Sub2 aClass5_Sub2_45;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!ke;")
	private final Class5_Sub2 aClass5_Sub2_44 = new Class5_Sub2();

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class187() {
		this.aClass5_Sub2_44.aClass5_Sub2_59 = this.aClass5_Sub2_44;
		this.aClass5_Sub2_44.aClass5_Sub2_60 = this.aClass5_Sub2_44;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)Lclient!ke;")
	public Class5_Sub2 method4802() {
		@Pc(7) Class5_Sub2 local7 = this.aClass5_Sub2_44.aClass5_Sub2_60;
		if (this.aClass5_Sub2_44 == local7) {
			return null;
		} else {
			local7.method7323();
			return local7;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Lclient!ke;")
	public Class5_Sub2 method4805() {
		@Pc(15) Class5_Sub2 local15 = this.aClass5_Sub2_44.aClass5_Sub2_60;
		if (local15 == this.aClass5_Sub2_44) {
			this.aClass5_Sub2_45 = null;
			return null;
		} else {
			this.aClass5_Sub2_45 = local15.aClass5_Sub2_60;
			return local15;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
	public int method4806() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class5_Sub2 local11 = this.aClass5_Sub2_44.aClass5_Sub2_60; local11 != this.aClass5_Sub2_44; local11 = local11.aClass5_Sub2_60) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ke;Z)V")
	public void method4807(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_59 != null) {
			arg0.method7323();
		}
		arg0.aClass5_Sub2_59 = this.aClass5_Sub2_44.aClass5_Sub2_59;
		arg0.aClass5_Sub2_60 = this.aClass5_Sub2_44;
		arg0.aClass5_Sub2_59.aClass5_Sub2_60 = arg0;
		arg0.aClass5_Sub2_60.aClass5_Sub2_59 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	public void method4808() {
		while (true) {
			@Pc(12) Class5_Sub2 local12 = this.aClass5_Sub2_44.aClass5_Sub2_60;
			if (this.aClass5_Sub2_44 == local12) {
				this.aClass5_Sub2_45 = null;
				return;
			}
			local12.method7323();
		}
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Lclient!ke;")
	public Class5_Sub2 method4810() {
		@Pc(11) Class5_Sub2 local11 = this.aClass5_Sub2_45;
		if (this.aClass5_Sub2_44 == local11) {
			this.aClass5_Sub2_45 = null;
			return null;
		} else {
			this.aClass5_Sub2_45 = local11.aClass5_Sub2_60;
			return local11;
		}
	}
}
