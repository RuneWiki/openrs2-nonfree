import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class120 {

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!rb;")
	private Class1 aClass1_192;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!rb;")
	public Class1 aClass1_191 = new Class1();

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class120() {
		this.aClass1_191.aClass1_204 = this.aClass1_191;
		this.aClass1_191.aClass1_203 = this.aClass1_191;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method3560() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_191.aClass1_203;
			if (local9 == this.aClass1_191) {
				this.aClass1_192 = null;
				return;
			}
			local9.method3735();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lclient!rb;")
	public Class1 method3561() {
		@Pc(11) Class1 local11 = this.aClass1_192;
		if (this.aClass1_191 == local11) {
			this.aClass1_192 = null;
			return null;
		} else {
			this.aClass1_192 = local11.aClass1_203;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lclient!rb;")
	public Class1 method3563() {
		@Pc(14) Class1 local14 = this.aClass1_191.aClass1_204;
		if (this.aClass1_191 == local14) {
			this.aClass1_192 = null;
			return null;
		} else {
			this.aClass1_192 = local14.aClass1_204;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lclient!rb;")
	public Class1 method3564() {
		@Pc(7) Class1 local7 = this.aClass1_191.aClass1_203;
		if (this.aClass1_191 == local7) {
			this.aClass1_192 = null;
			return null;
		} else {
			this.aClass1_192 = local7.aClass1_203;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)Lclient!rb;")
	public Class1 method3565() {
		@Pc(14) Class1 local14 = this.aClass1_192;
		if (this.aClass1_191 == local14) {
			this.aClass1_192 = null;
			return null;
		} else {
			this.aClass1_192 = local14.aClass1_204;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lclient!rb;")
	public Class1 method3566() {
		@Pc(12) Class1 local12 = this.aClass1_191.aClass1_203;
		if (this.aClass1_191 == local12) {
			return null;
		} else {
			local12.method3735();
			return local12;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!rb;I)V")
	public void method3567(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_204 != null) {
			arg0.method3735();
		}
		arg0.aClass1_204 = this.aClass1_191.aClass1_204;
		arg0.aClass1_203 = this.aClass1_191;
		arg0.aClass1_204.aClass1_203 = arg0;
		arg0.aClass1_203.aClass1_204 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)I")
	public int method3568() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class1 local19 = this.aClass1_191.aClass1_203; local19 != this.aClass1_191; local19 = local19.aClass1_203) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!rb;)V")
	public void method3571(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_204 != null) {
			arg0.method3735();
		}
		arg0.aClass1_204 = this.aClass1_191;
		arg0.aClass1_203 = this.aClass1_191.aClass1_203;
		arg0.aClass1_204.aClass1_203 = arg0;
		arg0.aClass1_203.aClass1_204 = arg0;
	}
}
