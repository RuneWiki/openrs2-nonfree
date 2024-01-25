import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class91 {

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!ha;")
	private Class4 aClass4_104;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Lclient!ha;")
	public final Class4 aClass4_103 = new Class4();

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V")
	public Class91() {
		this.aClass4_103.aClass4_269 = this.aClass4_103;
		this.aClass4_103.aClass4_270 = this.aClass4_103;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)I")
	public int method2573() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) Class4 local17 = this.aClass4_103.aClass4_269; local17 != this.aClass4_103; local17 = local17.aClass4_269) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!ha;)V")
	public void method2574(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_270 != null) {
			arg0.method6330();
		}
		arg0.aClass4_269 = this.aClass4_103.aClass4_269;
		arg0.aClass4_270 = this.aClass4_103;
		arg0.aClass4_270.aClass4_269 = arg0;
		arg0.aClass4_269.aClass4_270 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z")
	public boolean method2575() {
		return this.aClass4_103 == this.aClass4_103.aClass4_269;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLclient!gw;)V")
	public void method2576(@OriginalArg(1) Class91 arg0) {
		this.method2585(arg0, this.aClass4_103.aClass4_269);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Lclient!ha;")
	public Class4 method2577() {
		@Pc(7) Class4 local7 = this.aClass4_103.aClass4_270;
		if (this.aClass4_103 == local7) {
			this.aClass4_104 = null;
			return null;
		} else {
			this.aClass4_104 = local7.aClass4_270;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Lclient!ha;")
	public Class4 method2581() {
		@Pc(14) Class4 local14 = this.aClass4_104;
		if (local14 == this.aClass4_103) {
			this.aClass4_104 = null;
			return null;
		} else {
			this.aClass4_104 = local14.aClass4_270;
			return local14;
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	public void method2582() {
		while (true) {
			@Pc(9) Class4 local9 = this.aClass4_103.aClass4_269;
			if (local9 == this.aClass4_103) {
				this.aClass4_104 = null;
				return;
			}
			local9.method6330();
		}
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)Lclient!ha;")
	public Class4 method2583() {
		@Pc(12) Class4 local12 = this.aClass4_103.aClass4_269;
		if (this.aClass4_103 == local12) {
			return null;
		} else {
			local12.method6330();
			return local12;
		}
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(I)Lclient!ha;")
	public Class4 method2584() {
		@Pc(7) Class4 local7 = this.aClass4_103.aClass4_269;
		if (local7 == this.aClass4_103) {
			this.aClass4_104 = null;
			return null;
		} else {
			this.aClass4_104 = local7.aClass4_269;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLclient!gw;Lclient!ha;)V")
	private void method2585(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(11) Class4 local11 = this.aClass4_103.aClass4_270;
		this.aClass4_103.aClass4_270 = arg1.aClass4_270;
		arg1.aClass4_270.aClass4_269 = this.aClass4_103;
		if (arg1 != this.aClass4_103) {
			arg1.aClass4_270 = arg0.aClass4_103.aClass4_270;
			arg1.aClass4_270.aClass4_269 = arg1;
			local11.aClass4_269 = arg0.aClass4_103;
			arg0.aClass4_103.aClass4_270 = local11;
		}
	}

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "(I)Lclient!ha;")
	public Class4 method2586() {
		@Pc(6) Class4 local6 = this.aClass4_104;
		if (this.aClass4_103 == local6) {
			this.aClass4_104 = null;
			return null;
		} else {
			this.aClass4_104 = local6.aClass4_269;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLclient!ha;)V")
	public void method2587(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_270 != null) {
			arg0.method6330();
		}
		arg0.aClass4_270 = this.aClass4_103.aClass4_270;
		arg0.aClass4_269 = this.aClass4_103;
		arg0.aClass4_270.aClass4_269 = arg0;
		arg0.aClass4_269.aClass4_270 = arg0;
	}
}
