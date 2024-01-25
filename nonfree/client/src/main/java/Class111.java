import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class111 {

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "Lclient!rp;")
	private Class1 aClass1_95;

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "Lclient!rp;")
	public final Class1 aClass1_94 = new Class1();

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
	public Class111() {
		this.aClass1_94.aClass1_286 = this.aClass1_94;
		this.aClass1_94.aClass1_285 = this.aClass1_94;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!rp;Lclient!gca;)V")
	private void method2543(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class111 arg1) {
		@Pc(13) Class1 local13 = this.aClass1_94.aClass1_285;
		this.aClass1_94.aClass1_285 = arg0.aClass1_285;
		arg0.aClass1_285.aClass1_286 = this.aClass1_94;
		if (this.aClass1_94 != arg0) {
			arg0.aClass1_285 = arg1.aClass1_94.aClass1_285;
			arg0.aClass1_285.aClass1_286 = arg0;
			local13.aClass1_286 = arg1.aClass1_94;
			arg1.aClass1_94.aClass1_285 = local13;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)Lclient!rp;")
	public Class1 method2544() {
		@Pc(12) Class1 local12 = this.aClass1_94.aClass1_285;
		if (this.aClass1_94 == local12) {
			this.aClass1_95 = null;
			return null;
		} else {
			this.aClass1_95 = local12.aClass1_285;
			return local12;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)I")
	public int method2545() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class1 local17 = this.aClass1_94.aClass1_286;
		while (this.aClass1_94 != local17) {
			local17 = local17.aClass1_286;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)Z")
	public boolean method2546() {
		return this.aClass1_94 == this.aClass1_94.aClass1_286;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Lclient!rp;")
	public Class1 method2547() {
		@Pc(7) Class1 local7 = this.aClass1_94.aClass1_286;
		if (local7 == this.aClass1_94) {
			this.aClass1_95 = null;
			return null;
		} else {
			this.aClass1_95 = local7.aClass1_286;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method2549(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_285 != null) {
			arg0.method7908();
		}
		arg0.aClass1_286 = this.aClass1_94.aClass1_286;
		arg0.aClass1_285 = this.aClass1_94;
		arg0.aClass1_285.aClass1_286 = arg0;
		arg0.aClass1_286.aClass1_285 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)Lclient!rp;")
	public Class1 method2551() {
		@Pc(11) Class1 local11 = this.aClass1_95;
		if (local11 == this.aClass1_94) {
			this.aClass1_95 = null;
			return null;
		} else {
			this.aClass1_95 = local11.aClass1_285;
			return local11;
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(Lclient!rp;I)V")
	public void method2552(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_285 != null) {
			arg0.method7908();
		}
		arg0.aClass1_285 = this.aClass1_94.aClass1_285;
		arg0.aClass1_286 = this.aClass1_94;
		arg0.aClass1_285.aClass1_286 = arg0;
		arg0.aClass1_286.aClass1_285 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)Lclient!rp;")
	public Class1 method2553() {
		@Pc(7) Class1 local7 = this.aClass1_94.aClass1_286;
		if (this.aClass1_94 == local7) {
			return null;
		} else {
			local7.method7908();
			return local7;
		}
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(B)Lclient!rp;")
	public Class1 method2554() {
		@Pc(6) Class1 local6 = this.aClass1_95;
		if (this.aClass1_94 == local6) {
			this.aClass1_95 = null;
			return null;
		} else {
			this.aClass1_95 = local6.aClass1_286;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(I)V")
	public void method2555() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_94.aClass1_286;
			if (this.aClass1_94 == local9) {
				this.aClass1_95 = null;
				return;
			}
			local9.method7908();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!gca;)V")
	public void method2556(@OriginalArg(1) Class111 arg0) {
		this.method2543(this.aClass1_94.aClass1_286, arg0);
	}
}
