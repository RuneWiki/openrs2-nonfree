import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class14 {

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "Lclient!fb;")
	private Class1 aClass1_18;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "Lclient!fb;")
	public final Class1 aClass1_17 = new Class1();

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class14() {
		this.aClass1_17.aClass1_248 = this.aClass1_17;
		this.aClass1_17.aClass1_247 = this.aClass1_17;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!fb;I)V")
	public void method300(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_248 != null) {
			arg0.method5796();
		}
		arg0.aClass1_247 = this.aClass1_17;
		arg0.aClass1_248 = this.aClass1_17.aClass1_248;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aClass1_247.aClass1_248 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!fb;Lclient!ar;B)V")
	private void method301(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class14 arg1) {
		@Pc(14) Class1 local14 = this.aClass1_17.aClass1_248;
		this.aClass1_17.aClass1_248 = arg0.aClass1_248;
		arg0.aClass1_248.aClass1_247 = this.aClass1_17;
		if (arg0 != this.aClass1_17) {
			arg0.aClass1_248 = arg1.aClass1_17.aClass1_248;
			arg0.aClass1_248.aClass1_247 = arg0;
			local14.aClass1_247 = arg1.aClass1_17;
			arg1.aClass1_17.aClass1_248 = local14;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Lclient!fb;")
	public Class1 method302() {
		@Pc(14) Class1 local14 = this.aClass1_17.aClass1_247;
		if (local14 == this.aClass1_17) {
			this.aClass1_18 = null;
			return null;
		} else {
			this.aClass1_18 = local14.aClass1_247;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Lclient!fb;")
	public Class1 method303() {
		@Pc(12) Class1 local12 = this.aClass1_17.aClass1_248;
		if (local12 == this.aClass1_17) {
			this.aClass1_18 = null;
			return null;
		} else {
			this.aClass1_18 = local12.aClass1_248;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ar;)V")
	public void method304(@OriginalArg(1) Class14 arg0) {
		this.method301(this.aClass1_17.aClass1_247, arg0);
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	public void method305() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_17.aClass1_247;
			if (local5 == this.aClass1_17) {
				this.aClass1_18 = null;
				return;
			}
			local5.method5796();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLclient!fb;)V")
	public void method306(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_248 != null) {
			arg0.method5796();
		}
		arg0.aClass1_247 = this.aClass1_17.aClass1_247;
		arg0.aClass1_248 = this.aClass1_17;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aClass1_247.aClass1_248 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Z")
	public boolean method308() {
		return this.aClass1_17.aClass1_247 == this.aClass1_17;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)I")
	public int method309() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class1 local18 = this.aClass1_17.aClass1_247; local18 != this.aClass1_17; local18 = local18.aClass1_247) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Lclient!fb;")
	public Class1 method310() {
		@Pc(7) Class1 local7 = this.aClass1_17.aClass1_247;
		if (this.aClass1_17 == local7) {
			return null;
		} else {
			local7.method5796();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1 method312() {
		@Pc(13) Class1 local13 = this.aClass1_18;
		if (this.aClass1_17 == local13) {
			this.aClass1_18 = null;
			return null;
		} else {
			this.aClass1_18 = local13.aClass1_248;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)Lclient!fb;")
	public Class1 method313() {
		@Pc(12) Class1 local12 = this.aClass1_18;
		if (local12 == this.aClass1_17) {
			this.aClass1_18 = null;
			return null;
		} else {
			this.aClass1_18 = local12.aClass1_247;
			return local12;
		}
	}
}
