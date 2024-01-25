import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class361 {

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "Lclient!jca;")
	private Class1 aClass1_282;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Lclient!jca;")
	public final Class1 aClass1_281 = new Class1();

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class361() {
		this.aClass1_281.aClass1_286 = this.aClass1_281;
		this.aClass1_281.aClass1_285 = this.aClass1_281;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
	public boolean method7847() {
		return this.aClass1_281.aClass1_286 == this.aClass1_281;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)Lclient!jca;")
	public Class1 method7848() {
		@Pc(14) Class1 local14 = this.aClass1_281.aClass1_285;
		if (this.aClass1_281 == local14) {
			this.aClass1_282 = null;
			return null;
		} else {
			this.aClass1_282 = local14.aClass1_285;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!jca;)V")
	public void method7849(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_285 != null) {
			arg0.method7878();
		}
		arg0.aClass1_286 = this.aClass1_281.aClass1_286;
		arg0.aClass1_285 = this.aClass1_281;
		arg0.aClass1_285.aClass1_286 = arg0;
		arg0.aClass1_286.aClass1_285 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)Lclient!jca;")
	public Class1 method7850() {
		@Pc(15) Class1 local15 = this.aClass1_281.aClass1_286;
		if (local15 == this.aClass1_281) {
			return null;
		} else {
			local15.method7878();
			return local15;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I")
	public int method7851() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1 local11 = this.aClass1_281.aClass1_286;
		while (local11 != this.aClass1_281) {
			local11 = local11.aClass1_286;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wo;ZLclient!jca;)V")
	private void method7852(@OriginalArg(0) Class361 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_281.aClass1_285;
		this.aClass1_281.aClass1_285 = arg1.aClass1_285;
		arg1.aClass1_285.aClass1_286 = this.aClass1_281;
		if (this.aClass1_281 != arg1) {
			arg1.aClass1_285 = arg0.aClass1_281.aClass1_285;
			arg1.aClass1_285.aClass1_286 = arg1;
			local7.aClass1_286 = arg0.aClass1_281;
			arg0.aClass1_281.aClass1_285 = local7;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Lclient!jca;")
	public Class1 method7853() {
		@Pc(11) Class1 local11 = this.aClass1_282;
		if (this.aClass1_281 == local11) {
			this.aClass1_282 = null;
			return null;
		} else {
			this.aClass1_282 = local11.aClass1_286;
			return local11;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Lclient!jca;")
	public Class1 method7854() {
		@Pc(7) Class1 local7 = this.aClass1_281.aClass1_286;
		if (local7 == this.aClass1_281) {
			this.aClass1_282 = null;
			return null;
		} else {
			this.aClass1_282 = local7.aClass1_286;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!jca;B)V")
	public void method7855(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_285 != null) {
			arg0.method7878();
		}
		arg0.aClass1_286 = this.aClass1_281;
		arg0.aClass1_285 = this.aClass1_281.aClass1_285;
		arg0.aClass1_285.aClass1_286 = arg0;
		arg0.aClass1_286.aClass1_285 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!wo;)V")
	public void method7856(@OriginalArg(1) Class361 arg0) {
		this.method7852(arg0, this.aClass1_281.aClass1_286);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)Lclient!jca;")
	public Class1 method7859() {
		@Pc(12) Class1 local12 = this.aClass1_282;
		if (local12 == this.aClass1_281) {
			this.aClass1_282 = null;
			return null;
		} else {
			this.aClass1_282 = local12.aClass1_285;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V")
	public void method7860() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_281.aClass1_286;
			if (local5 == this.aClass1_281) {
				this.aClass1_282 = null;
				return;
			}
			local5.method7878();
		}
	}
}
