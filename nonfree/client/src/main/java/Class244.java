import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class244 {

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!nd;")
	private Class4 aClass4_228;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!nd;")
	public final Class4 aClass4_227 = new Class4();

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class244() {
		this.aClass4_227.aClass4_261 = this.aClass4_227;
		this.aClass4_227.aClass4_262 = this.aClass4_227;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lclient!nd;")
	public Class4 method5263() {
		@Pc(13) Class4 local13 = this.aClass4_227.aClass4_261;
		if (local13 == this.aClass4_227) {
			this.aClass4_228 = null;
			return null;
		} else {
			this.aClass4_228 = local13.aClass4_261;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public void method5264() {
		while (true) {
			@Pc(15) Class4 local15 = this.aClass4_227.aClass4_261;
			if (local15 == this.aClass4_227) {
				this.aClass4_228 = null;
				return;
			}
			local15.method6059();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
	public int method5266() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class4 local19 = this.aClass4_227.aClass4_261; local19 != this.aClass4_227; local19 = local19.aClass4_261) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)Lclient!nd;")
	public Class4 method5267() {
		@Pc(7) Class4 local7 = this.aClass4_227.aClass4_262;
		if (local7 == this.aClass4_227) {
			this.aClass4_228 = null;
			return null;
		} else {
			this.aClass4_228 = local7.aClass4_262;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)Lclient!nd;")
	public Class4 method5268() {
		@Pc(12) Class4 local12 = this.aClass4_227.aClass4_261;
		if (this.aClass4_227 == local12) {
			return null;
		} else {
			local12.method6059();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ub;Lclient!nd;)V")
	private void method5269(@OriginalArg(1) Class244 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_227.aClass4_262;
		this.aClass4_227.aClass4_262 = arg1.aClass4_262;
		arg1.aClass4_262.aClass4_261 = this.aClass4_227;
		if (arg1 != this.aClass4_227) {
			arg1.aClass4_262 = arg0.aClass4_227.aClass4_262;
			arg1.aClass4_262.aClass4_261 = arg1;
			arg0.aClass4_227.aClass4_262 = local7;
			local7.aClass4_261 = arg0.aClass4_227;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!ub;)V")
	public void method5270(@OriginalArg(1) Class244 arg0) {
		this.method5269(arg0, this.aClass4_227.aClass4_261);
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)Lclient!nd;")
	public Class4 method5271() {
		@Pc(6) Class4 local6 = this.aClass4_228;
		if (local6 == this.aClass4_227) {
			this.aClass4_228 = null;
			return null;
		} else {
			this.aClass4_228 = local6.aClass4_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Z")
	public boolean method5272() {
		return this.aClass4_227 == this.aClass4_227.aClass4_261;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!nd;I)V")
	public void method5273(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_262 != null) {
			arg0.method6059();
		}
		arg0.aClass4_262 = this.aClass4_227.aClass4_262;
		arg0.aClass4_261 = this.aClass4_227;
		arg0.aClass4_262.aClass4_261 = arg0;
		arg0.aClass4_261.aClass4_262 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!nd;B)V")
	public void method5274(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_262 != null) {
			arg0.method6059();
		}
		arg0.aClass4_261 = this.aClass4_227.aClass4_261;
		arg0.aClass4_262 = this.aClass4_227;
		arg0.aClass4_262.aClass4_261 = arg0;
		arg0.aClass4_261.aClass4_262 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Lclient!nd;")
	public Class4 method5275() {
		@Pc(6) Class4 local6 = this.aClass4_228;
		if (local6 == this.aClass4_227) {
			this.aClass4_228 = null;
			return null;
		} else {
			this.aClass4_228 = local6.aClass4_262;
			return local6;
		}
	}
}
