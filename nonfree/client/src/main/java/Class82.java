import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class82 {

	@OriginalMember(owner = "client!th", name = "p", descriptor = "Lclient!lb;")
	private Class1 aClass1_202;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!lb;")
	public final Class1 aClass1_201 = new Class1();

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class82() {
		this.aClass1_201.aClass1_215 = this.aClass1_201;
		this.aClass1_201.aClass1_216 = this.aClass1_201;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public void method2847() {
		while (true) {
			@Pc(14) Class1 local14 = this.aClass1_201.aClass1_215;
			if (local14 == this.aClass1_201) {
				return;
			}
			local14.method3056();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Lclient!lb;")
	public Class1 method2848() {
		@Pc(12) Class1 local12 = this.aClass1_202;
		if (this.aClass1_201 == local12) {
			this.aClass1_202 = null;
			return null;
		} else {
			this.aClass1_202 = local12.aClass1_216;
			return local12;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Lclient!lb;")
	public Class1 method2849() {
		@Pc(10) Class1 local10 = this.aClass1_201.aClass1_215;
		if (local10 == this.aClass1_201) {
			this.aClass1_202 = null;
			return null;
		} else {
			this.aClass1_202 = local10.aClass1_215;
			return local10;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!lb;ILclient!lb;)V")
	public void method2850(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_216 != null) {
			arg1.method3056();
		}
		arg1.aClass1_215 = arg0;
		arg1.aClass1_216 = arg0.aClass1_216;
		arg1.aClass1_216.aClass1_215 = arg1;
		arg1.aClass1_215.aClass1_216 = arg1;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)Lclient!lb;")
	public Class1 method2851() {
		@Pc(3) Class1 local3 = this.aClass1_201.aClass1_215;
		if (this.aClass1_201 == local3) {
			return null;
		} else {
			local3.method3056();
			return local3;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!lb;)V")
	public void method2853(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_216 != null) {
			arg0.method3056();
		}
		arg0.aClass1_216 = this.aClass1_201.aClass1_216;
		arg0.aClass1_215 = this.aClass1_201;
		arg0.aClass1_216.aClass1_215 = arg0;
		arg0.aClass1_215.aClass1_216 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)Lclient!lb;")
	public Class1 method2855() {
		@Pc(9) Class1 local9 = this.aClass1_202;
		if (this.aClass1_201 == local9) {
			this.aClass1_202 = null;
			return null;
		} else {
			this.aClass1_202 = local9.aClass1_215;
			return local9;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(BLclient!lb;)V")
	public void method2856(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_216 != null) {
			arg0.method3056();
		}
		arg0.aClass1_215 = this.aClass1_201.aClass1_215;
		arg0.aClass1_216 = this.aClass1_201;
		arg0.aClass1_216.aClass1_215 = arg0;
		arg0.aClass1_215.aClass1_216 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lclient!lb;")
	public Class1 method2858() {
		@Pc(7) Class1 local7 = this.aClass1_201.aClass1_216;
		if (local7 == this.aClass1_201) {
			this.aClass1_202 = null;
			return null;
		} else {
			this.aClass1_202 = local7.aClass1_216;
			return local7;
		}
	}
}
