import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class144 {

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "Lclient!ge;")
	private Class2_Sub3 aClass2_Sub3_61;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!ge;")
	private Class2_Sub3 aClass2_Sub3_60 = new Class2_Sub3();

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class144() {
		this.aClass2_Sub3_60.aClass2_Sub3_68 = this.aClass2_Sub3_60;
		this.aClass2_Sub3_60.aClass2_Sub3_69 = this.aClass2_Sub3_60;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Lclient!ge;")
	public Class2_Sub3 method3659() {
		@Pc(14) Class2_Sub3 local14 = this.aClass2_Sub3_61;
		if (this.aClass2_Sub3_60 == local14) {
			this.aClass2_Sub3_61 = null;
			return null;
		} else {
			this.aClass2_Sub3_61 = local14.aClass2_Sub3_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I")
	public int method3660() {
		@Pc(14) int local14 = 0;
		@Pc(18) Class2_Sub3 local18 = this.aClass2_Sub3_60.aClass2_Sub3_68;
		while (local18 != this.aClass2_Sub3_60) {
			local18 = local18.aClass2_Sub3_68;
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method3662(@OriginalArg(0) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub3_69 != null) {
			arg0.method4613();
		}
		arg0.aClass2_Sub3_69 = this.aClass2_Sub3_60.aClass2_Sub3_69;
		arg0.aClass2_Sub3_68 = this.aClass2_Sub3_60;
		arg0.aClass2_Sub3_69.aClass2_Sub3_68 = arg0;
		arg0.aClass2_Sub3_68.aClass2_Sub3_69 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Lclient!ge;")
	public Class2_Sub3 method3663() {
		@Pc(12) Class2_Sub3 local12 = this.aClass2_Sub3_60.aClass2_Sub3_68;
		if (local12 == this.aClass2_Sub3_60) {
			this.aClass2_Sub3_61 = null;
			return null;
		} else {
			this.aClass2_Sub3_61 = local12.aClass2_Sub3_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Lclient!ge;")
	public Class2_Sub3 method3665() {
		@Pc(3) Class2_Sub3 local3 = this.aClass2_Sub3_60.aClass2_Sub3_68;
		if (local3 == this.aClass2_Sub3_60) {
			return null;
		} else {
			local3.method4613();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
	public void method3668() {
		while (true) {
			@Pc(14) Class2_Sub3 local14 = this.aClass2_Sub3_60.aClass2_Sub3_68;
			if (this.aClass2_Sub3_60 == local14) {
				this.aClass2_Sub3_61 = null;
				return;
			}
			local14.method4613();
		}
	}
}
