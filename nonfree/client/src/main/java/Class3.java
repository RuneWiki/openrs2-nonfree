import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!ke;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!ke;")
	public final Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3() {
		this.aClass6_1.aClass6_99 = this.aClass6_1;
		this.aClass6_1.aClass6_100 = this.aClass6_1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ke;)V")
	public void method23(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_100 != null) {
			arg0.method2083();
		}
		arg0.aClass6_100 = this.aClass6_1.aClass6_100;
		arg0.aClass6_99 = this.aClass6_1;
		arg0.aClass6_100.aClass6_99 = arg0;
		arg0.aClass6_99.aClass6_100 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public void method24() {
		while (true) {
			@Pc(12) Class6 local12 = this.aClass6_1.aClass6_99;
			if (this.aClass6_1 == local12) {
				return;
			}
			local12.method2083();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!ke;")
	public Class6 method25() {
		@Pc(12) Class6 local12 = this.aClass6_1.aClass6_100;
		if (local12 == this.aClass6_1) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local12.aClass6_100;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!ke;")
	public Class6 method26() {
		@Pc(11) Class6 local11 = this.aClass6_2;
		if (this.aClass6_1 == local11) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local11.aClass6_99;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ke;Z)V")
	public void method29(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_100 != null) {
			arg0.method2083();
		}
		arg0.aClass6_99 = this.aClass6_1.aClass6_99;
		arg0.aClass6_100 = this.aClass6_1;
		arg0.aClass6_100.aClass6_99 = arg0;
		arg0.aClass6_99.aClass6_100 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Lclient!ke;")
	public Class6 method31() {
		@Pc(7) Class6 local7 = this.aClass6_1.aClass6_99;
		if (this.aClass6_1 == local7) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local7.aClass6_99;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Lclient!ke;")
	public Class6 method32() {
		@Pc(7) Class6 local7 = this.aClass6_2;
		if (this.aClass6_1 == local7) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local7.aClass6_100;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Lclient!ke;")
	public Class6 method34() {
		@Pc(7) Class6 local7 = this.aClass6_1.aClass6_99;
		if (this.aClass6_1 == local7) {
			return null;
		} else {
			local7.method2083();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lclient!ke;")
	public Class6 method35() {
		@Pc(3) Class6 local3 = this.aClass6_1.aClass6_100;
		if (local3 == this.aClass6_1) {
			return null;
		} else {
			local3.method2083();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ke;Lclient!ke;)V")
	public void method37(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg0.aClass6_100 != null) {
			arg0.method2083();
		}
		arg0.aClass6_99 = arg1;
		arg0.aClass6_100 = arg1.aClass6_100;
		arg0.aClass6_100.aClass6_99 = arg0;
		arg0.aClass6_99.aClass6_100 = arg0;
	}
}
