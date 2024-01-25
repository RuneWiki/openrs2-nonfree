import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class114 {

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "Lclient!dfa;")
	private Class2 aClass2_91;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!dfa;")
	public final Class2 aClass2_90 = new Class2();

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class114() {
		this.aClass2_90.aClass2_300 = this.aClass2_90;
		this.aClass2_90.aClass2_299 = this.aClass2_90;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!dfa;Lclient!fh;I)V")
	private void method2757(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class114 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_90.aClass2_299;
		this.aClass2_90.aClass2_299 = arg0.aClass2_299;
		arg0.aClass2_299.aClass2_300 = this.aClass2_90;
		if (this.aClass2_90 != arg0) {
			arg0.aClass2_299 = arg1.aClass2_90.aClass2_299;
			arg0.aClass2_299.aClass2_300 = arg0;
			local7.aClass2_300 = arg1.aClass2_90;
			arg1.aClass2_90.aClass2_299 = local7;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Lclient!dfa;")
	public Class2 method2758() {
		@Pc(7) Class2 local7 = this.aClass2_90.aClass2_299;
		if (this.aClass2_90 == local7) {
			this.aClass2_91 = null;
			return null;
		} else {
			this.aClass2_91 = local7.aClass2_299;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!dfa;)V")
	public void method2759(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_299 != null) {
			arg0.method8920();
		}
		arg0.aClass2_300 = this.aClass2_90.aClass2_300;
		arg0.aClass2_299 = this.aClass2_90;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!fh;)V")
	public void method2760(@OriginalArg(1) Class114 arg0) {
		this.method2757(this.aClass2_90.aClass2_300, arg0);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lclient!dfa;")
	public Class2 method2762() {
		@Pc(6) Class2 local6 = this.aClass2_91;
		if (local6 == this.aClass2_90) {
			this.aClass2_91 = null;
			return null;
		} else {
			this.aClass2_91 = local6.aClass2_300;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)Lclient!dfa;")
	public Class2 method2765() {
		@Pc(13) Class2 local13 = this.aClass2_90.aClass2_300;
		if (local13 == this.aClass2_90) {
			return null;
		} else {
			local13.method8920();
			return local13;
		}
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I")
	public int method2766() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class2 local9 = this.aClass2_90.aClass2_300;
		while (local9 != this.aClass2_90) {
			local9 = local9.aClass2_300;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z")
	public boolean method2767() {
		return this.aClass2_90 == this.aClass2_90.aClass2_300;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
	public void method2768() {
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_90.aClass2_300;
			if (this.aClass2_90 == local10) {
				this.aClass2_91 = null;
				return;
			}
			local10.method8920();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Lclient!dfa;")
	public Class2 method2770() {
		@Pc(14) Class2 local14 = this.aClass2_91;
		if (local14 == this.aClass2_90) {
			this.aClass2_91 = null;
			return null;
		} else {
			this.aClass2_91 = local14.aClass2_299;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!dfa;Z)V")
	public void method2771(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_299 != null) {
			arg0.method8920();
		}
		arg0.aClass2_300 = this.aClass2_90;
		arg0.aClass2_299 = this.aClass2_90.aClass2_299;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)Lclient!dfa;")
	public Class2 method2772() {
		@Pc(13) Class2 local13 = this.aClass2_90.aClass2_300;
		if (this.aClass2_90 == local13) {
			this.aClass2_91 = null;
			return null;
		} else {
			this.aClass2_91 = local13.aClass2_300;
			return local13;
		}
	}
}
