import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class17 {

	@OriginalMember(owner = "client!at", name = "s", descriptor = "Lclient!fi;")
	private Class1 aClass1_16;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "Lclient!fi;")
	public final Class1 aClass1_15 = new Class1();

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class17() {
		this.aClass1_15.aClass1_244 = this.aClass1_15;
		this.aClass1_15.aClass1_243 = this.aClass1_15;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)Lclient!fi;")
	public Class1 method197() {
		@Pc(11) Class1 local11 = this.aClass1_16;
		if (this.aClass1_15 == local11) {
			this.aClass1_16 = null;
			return null;
		} else {
			this.aClass1_16 = local11.aClass1_244;
			return local11;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!at;)V")
	public void method198(@OriginalArg(1) Class17 arg0) {
		this.method212(this.aClass1_15.aClass1_243, arg0);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!fi;)V")
	public void method199(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_244 != null) {
			arg0.method5577();
		}
		arg0.aClass1_243 = this.aClass1_15;
		arg0.aClass1_244 = this.aClass1_15.aClass1_244;
		arg0.aClass1_244.aClass1_243 = arg0;
		arg0.aClass1_243.aClass1_244 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)Lclient!fi;")
	public Class1 method200() {
		@Pc(7) Class1 local7 = this.aClass1_15.aClass1_244;
		if (local7 == this.aClass1_15) {
			this.aClass1_16 = null;
			return null;
		} else {
			this.aClass1_16 = local7.aClass1_244;
			return local7;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lclient!fi;")
	public Class1 method202() {
		@Pc(14) Class1 local14 = this.aClass1_15.aClass1_243;
		if (this.aClass1_15 == local14) {
			this.aClass1_16 = null;
			return null;
		} else {
			this.aClass1_16 = local14.aClass1_243;
			return local14;
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(B)Lclient!fi;")
	public Class1 method203() {
		@Pc(7) Class1 local7 = this.aClass1_15.aClass1_243;
		if (local7 == this.aClass1_15) {
			return null;
		} else {
			local7.method5577();
			return local7;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)Z")
	public boolean method204() {
		return this.aClass1_15 == this.aClass1_15.aClass1_243;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
	public void method205() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_15.aClass1_243;
			if (this.aClass1_15 == local3) {
				this.aClass1_16 = null;
				return;
			}
			local3.method5577();
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)Lclient!fi;")
	public Class1 method207() {
		@Pc(12) Class1 local12 = this.aClass1_16;
		if (local12 == this.aClass1_15) {
			this.aClass1_16 = null;
			return null;
		} else {
			this.aClass1_16 = local12.aClass1_243;
			return local12;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)I")
	public int method210() {
		@Pc(14) int local14 = 0;
		@Pc(18) Class1 local18 = this.aClass1_15.aClass1_243;
		while (local18 != this.aClass1_15) {
			local18 = local18.aClass1_243;
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(BLclient!fi;)V")
	public void method211(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_244 != null) {
			arg0.method5577();
		}
		arg0.aClass1_243 = this.aClass1_15.aClass1_243;
		arg0.aClass1_244 = this.aClass1_15;
		arg0.aClass1_244.aClass1_243 = arg0;
		arg0.aClass1_243.aClass1_244 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!fi;Lclient!at;)V")
	private void method212(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class17 arg1) {
		@Pc(15) Class1 local15 = this.aClass1_15.aClass1_244;
		this.aClass1_15.aClass1_244 = arg0.aClass1_244;
		arg0.aClass1_244.aClass1_243 = this.aClass1_15;
		if (this.aClass1_15 != arg0) {
			arg0.aClass1_244 = arg1.aClass1_15.aClass1_244;
			arg0.aClass1_244.aClass1_243 = arg0;
			local15.aClass1_243 = arg1.aClass1_15;
			arg1.aClass1_15.aClass1_244 = local15;
		}
	}
}
