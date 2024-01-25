import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class129 {

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "Lclient!ui;")
	private Class2_Sub9 aClass2_Sub9_33;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "Lclient!ui;")
	private final Class2_Sub9 aClass2_Sub9_32 = new Class2_Sub9();

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class129() {
		this.aClass2_Sub9_32.aClass2_Sub9_61 = this.aClass2_Sub9_32;
		this.aClass2_Sub9_32.aClass2_Sub9_62 = this.aClass2_Sub9_32;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ui;I)V")
	public void method3575(@OriginalArg(0) Class2_Sub9 arg0) {
		if (arg0.aClass2_Sub9_62 != null) {
			arg0.method5600();
		}
		arg0.aClass2_Sub9_61 = this.aClass2_Sub9_32;
		arg0.aClass2_Sub9_62 = this.aClass2_Sub9_32.aClass2_Sub9_62;
		arg0.aClass2_Sub9_62.aClass2_Sub9_61 = arg0;
		arg0.aClass2_Sub9_61.aClass2_Sub9_62 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Lclient!ui;")
	public Class2_Sub9 method3577() {
		@Pc(12) Class2_Sub9 local12 = this.aClass2_Sub9_32.aClass2_Sub9_61;
		if (local12 == this.aClass2_Sub9_32) {
			this.aClass2_Sub9_33 = null;
			return null;
		} else {
			this.aClass2_Sub9_33 = local12.aClass2_Sub9_61;
			return local12;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Lclient!ui;")
	public Class2_Sub9 method3578() {
		@Pc(11) Class2_Sub9 local11 = this.aClass2_Sub9_33;
		if (local11 == this.aClass2_Sub9_32) {
			this.aClass2_Sub9_33 = null;
			return null;
		} else {
			this.aClass2_Sub9_33 = local11.aClass2_Sub9_61;
			return local11;
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	public void method3580() {
		while (true) {
			@Pc(5) Class2_Sub9 local5 = this.aClass2_Sub9_32.aClass2_Sub9_61;
			if (local5 == this.aClass2_Sub9_32) {
				this.aClass2_Sub9_33 = null;
				return;
			}
			local5.method5600();
		}
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Lclient!ui;")
	public Class2_Sub9 method3582() {
		@Pc(7) Class2_Sub9 local7 = this.aClass2_Sub9_32.aClass2_Sub9_61;
		if (local7 == this.aClass2_Sub9_32) {
			return null;
		} else {
			local7.method5600();
			return local7;
		}
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)I")
	public int method3583() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2_Sub9 local11 = this.aClass2_Sub9_32.aClass2_Sub9_61; local11 != this.aClass2_Sub9_32; local11 = local11.aClass2_Sub9_61) {
			local7++;
		}
		return local7;
	}
}
