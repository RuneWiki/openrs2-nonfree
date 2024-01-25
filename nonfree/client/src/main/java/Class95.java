import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class95 {

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!hg;")
	private Class41_Sub2 aClass41_Sub2_6;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "Lclient!hg;")
	public final Class41_Sub2 aClass41_Sub2_5 = new Class41_Sub2();

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class95() {
		this.aClass41_Sub2_5.aClass41_Sub2_8 = this.aClass41_Sub2_5;
		this.aClass41_Sub2_5.aClass41_Sub2_7 = this.aClass41_Sub2_5;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Lclient!hg;")
	public Class41_Sub2 method1836() {
		@Pc(7) Class41_Sub2 local7 = this.aClass41_Sub2_5.aClass41_Sub2_7;
		if (this.aClass41_Sub2_5 == local7) {
			this.aClass41_Sub2_6 = null;
			return null;
		} else {
			this.aClass41_Sub2_6 = local7.aClass41_Sub2_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public void method1837() {
		while (true) {
			@Pc(9) Class41_Sub2 local9 = this.aClass41_Sub2_5.aClass41_Sub2_7;
			if (this.aClass41_Sub2_5 == local9) {
				this.aClass41_Sub2_6 = null;
				return;
			}
			local9.method5480();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!hg;)V")
	public void method1838(@OriginalArg(1) Class41_Sub2 arg0) {
		if (arg0.aClass41_Sub2_8 != null) {
			arg0.method5480();
		}
		arg0.aClass41_Sub2_8 = this.aClass41_Sub2_5.aClass41_Sub2_8;
		arg0.aClass41_Sub2_7 = this.aClass41_Sub2_5;
		arg0.aClass41_Sub2_8.aClass41_Sub2_7 = arg0;
		arg0.aClass41_Sub2_7.aClass41_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Lclient!hg;")
	public Class41_Sub2 method1840() {
		@Pc(6) Class41_Sub2 local6 = this.aClass41_Sub2_6;
		if (this.aClass41_Sub2_5 == local6) {
			this.aClass41_Sub2_6 = null;
			return null;
		} else {
			this.aClass41_Sub2_6 = local6.aClass41_Sub2_7;
			return local6;
		}
	}
}
