import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class254 {

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "Lclient!kp;")
	private Class1 aClass1_250;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "Lclient!kp;")
	public final Class1 aClass1_249 = new Class1();

	static {
		new Class151(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class254() {
		this.aClass1_249.aClass1_261 = this.aClass1_249;
		this.aClass1_249.aClass1_262 = this.aClass1_249;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!kp;Z)V")
	public void method5430(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_261 != null) {
			arg0.method5617();
		}
		arg0.aClass1_262 = this.aClass1_249;
		arg0.aClass1_261 = this.aClass1_249.aClass1_261;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aClass1_262.aClass1_261 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)I")
	public int method5431() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class1 local16 = this.aClass1_249.aClass1_262; local16 != this.aClass1_249; local16 = local16.aClass1_262) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Lclient!kp;")
	public Class1 method5433() {
		@Pc(6) Class1 local6 = this.aClass1_250;
		if (this.aClass1_249 == local6) {
			this.aClass1_250 = null;
			return null;
		} else {
			this.aClass1_250 = local6.aClass1_262;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Lclient!kp;")
	public Class1 method5435() {
		@Pc(6) Class1 local6 = this.aClass1_250;
		if (this.aClass1_249 == local6) {
			this.aClass1_250 = null;
			return null;
		} else {
			this.aClass1_250 = local6.aClass1_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Lclient!kp;")
	public Class1 method5436() {
		@Pc(7) Class1 local7 = this.aClass1_249.aClass1_262;
		if (local7 == this.aClass1_249) {
			return null;
		} else {
			local7.method5617();
			return local7;
		}
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Lclient!kp;")
	public Class1 method5437() {
		@Pc(12) Class1 local12 = this.aClass1_249.aClass1_262;
		if (local12 == this.aClass1_249) {
			this.aClass1_250 = null;
			return null;
		} else {
			this.aClass1_250 = local12.aClass1_262;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
	public void method5438() {
		while (true) {
			@Pc(14) Class1 local14 = this.aClass1_249.aClass1_262;
			if (this.aClass1_249 == local14) {
				this.aClass1_250 = null;
				return;
			}
			local14.method5617();
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)Lclient!kp;")
	public Class1 method5439() {
		@Pc(7) Class1 local7 = this.aClass1_249.aClass1_261;
		if (this.aClass1_249 == local7) {
			this.aClass1_250 = null;
			return null;
		} else {
			this.aClass1_250 = local7.aClass1_261;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!kp;)V")
	public void method5440(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_261 != null) {
			arg0.method5617();
		}
		arg0.aClass1_261 = this.aClass1_249;
		arg0.aClass1_262 = this.aClass1_249.aClass1_262;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aClass1_262.aClass1_261 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!kp;ILclient!vp;)V")
	private void method5441(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class254 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_249.aClass1_261;
		this.aClass1_249.aClass1_261 = arg0.aClass1_261;
		arg0.aClass1_261.aClass1_262 = this.aClass1_249;
		if (arg0 != this.aClass1_249) {
			arg0.aClass1_261 = arg1.aClass1_249.aClass1_261;
			arg0.aClass1_261.aClass1_262 = arg0;
			local7.aClass1_262 = arg1.aClass1_249;
			arg1.aClass1_249.aClass1_261 = local7;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!vp;)V")
	public void method5442(@OriginalArg(1) Class254 arg0) {
		this.method5441(this.aClass1_249.aClass1_262, arg0);
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)Z")
	public boolean method5444() {
		return this.aClass1_249 == this.aClass1_249.aClass1_262;
	}
}
