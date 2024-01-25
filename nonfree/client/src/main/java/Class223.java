import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class223 {

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Lclient!qm;")
	private Class3 aClass3_189;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!qm;")
	public final Class3 aClass3_188 = new Class3();

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class223() {
		this.aClass3_188.aClass3_300 = this.aClass3_188;
		this.aClass3_188.aClass3_299 = this.aClass3_188;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public void method5862() {
		while (true) {
			@Pc(12) Class3 local12 = this.aClass3_188.aClass3_300;
			if (local12 == this.aClass3_188) {
				this.aClass3_189 = null;
				return;
			}
			local12.method8769();
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Z")
	public boolean method5864() {
		return this.aClass3_188.aClass3_300 == this.aClass3_188;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!qm;Lclient!mr;)V")
	private void method5865(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class223 arg1) {
		@Pc(15) Class3 local15 = this.aClass3_188.aClass3_299;
		this.aClass3_188.aClass3_299 = arg0.aClass3_299;
		arg0.aClass3_299.aClass3_300 = this.aClass3_188;
		if (arg0 != this.aClass3_188) {
			arg0.aClass3_299 = arg1.aClass3_188.aClass3_299;
			arg0.aClass3_299.aClass3_300 = arg0;
			local15.aClass3_300 = arg1.aClass3_188;
			arg1.aClass3_188.aClass3_299 = local15;
		}
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)I")
	public int method5866() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class3 local19 = this.aClass3_188.aClass3_300; local19 != this.aClass3_188; local19 = local19.aClass3_300) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!qm;)V")
	public void method5867(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_299 != null) {
			arg0.method8769();
		}
		arg0.aClass3_300 = this.aClass3_188.aClass3_300;
		arg0.aClass3_299 = this.aClass3_188;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!qm;B)V")
	public void method5868(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_299 != null) {
			arg0.method8769();
		}
		arg0.aClass3_300 = this.aClass3_188;
		arg0.aClass3_299 = this.aClass3_188.aClass3_299;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Lclient!qm;")
	public Class3 method5870() {
		@Pc(14) Class3 local14 = this.aClass3_189;
		if (local14 == this.aClass3_188) {
			this.aClass3_189 = null;
			return null;
		} else {
			this.aClass3_189 = local14.aClass3_300;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)Lclient!qm;")
	public Class3 method5871() {
		@Pc(6) Class3 local6 = this.aClass3_189;
		if (local6 == this.aClass3_188) {
			this.aClass3_189 = null;
			return null;
		} else {
			this.aClass3_189 = local6.aClass3_299;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Lclient!qm;")
	public Class3 method5872() {
		@Pc(11) Class3 local11 = this.aClass3_188.aClass3_300;
		if (this.aClass3_188 == local11) {
			return null;
		} else {
			local11.method8769();
			return local11;
		}
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Lclient!qm;")
	public Class3 method5873() {
		@Pc(15) Class3 local15 = this.aClass3_188.aClass3_299;
		if (local15 == this.aClass3_188) {
			this.aClass3_189 = null;
			return null;
		} else {
			this.aClass3_189 = local15.aClass3_299;
			return local15;
		}
	}

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)Lclient!qm;")
	public Class3 method5874() {
		@Pc(15) Class3 local15 = this.aClass3_188.aClass3_300;
		if (local15 == this.aClass3_188) {
			this.aClass3_189 = null;
			return null;
		} else {
			this.aClass3_189 = local15.aClass3_300;
			return local15;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!mr;B)V")
	public void method5875(@OriginalArg(0) Class223 arg0) {
		this.method5865(this.aClass3_188.aClass3_300, arg0);
	}
}
