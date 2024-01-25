import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class195 {

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "Lclient!lo;")
	private Class3_Sub7 aClass3_Sub7_58;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "Lclient!lo;")
	private final Class3_Sub7 aClass3_Sub7_57 = new Class3_Sub7();

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class195() {
		this.aClass3_Sub7_57.aClass3_Sub7_62 = this.aClass3_Sub7_57;
		this.aClass3_Sub7_57.aClass3_Sub7_61 = this.aClass3_Sub7_57;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Lclient!lo;")
	public Class3_Sub7 method5208() {
		@Pc(12) Class3_Sub7 local12 = this.aClass3_Sub7_57.aClass3_Sub7_62;
		if (this.aClass3_Sub7_57 == local12) {
			return null;
		} else {
			local12.method5385();
			return local12;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)I")
	public int method5209() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class3_Sub7 local19 = this.aClass3_Sub7_57.aClass3_Sub7_62;
		while (this.aClass3_Sub7_57 != local19) {
			local19 = local19.aClass3_Sub7_62;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)Lclient!lo;")
	public Class3_Sub7 method5210() {
		@Pc(6) Class3_Sub7 local6 = this.aClass3_Sub7_58;
		if (local6 == this.aClass3_Sub7_57) {
			this.aClass3_Sub7_58 = null;
			return null;
		} else {
			this.aClass3_Sub7_58 = local6.aClass3_Sub7_62;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!lo;I)V")
	public void method5213(@OriginalArg(0) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_61 != null) {
			arg0.method5385();
		}
		arg0.aClass3_Sub7_61 = this.aClass3_Sub7_57.aClass3_Sub7_61;
		arg0.aClass3_Sub7_62 = this.aClass3_Sub7_57;
		arg0.aClass3_Sub7_61.aClass3_Sub7_62 = arg0;
		arg0.aClass3_Sub7_62.aClass3_Sub7_61 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V")
	public void method5215() {
		while (true) {
			@Pc(11) Class3_Sub7 local11 = this.aClass3_Sub7_57.aClass3_Sub7_62;
			if (local11 == this.aClass3_Sub7_57) {
				this.aClass3_Sub7_58 = null;
				return;
			}
			local11.method5385();
		}
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)Lclient!lo;")
	public Class3_Sub7 method5216() {
		@Pc(11) Class3_Sub7 local11 = this.aClass3_Sub7_57.aClass3_Sub7_62;
		if (local11 == this.aClass3_Sub7_57) {
			this.aClass3_Sub7_58 = null;
			return null;
		} else {
			this.aClass3_Sub7_58 = local11.aClass3_Sub7_62;
			return local11;
		}
	}
}
