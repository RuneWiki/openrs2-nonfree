import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class10 {

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!cb;")
	private Class5 aClass5_18;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!cb;")
	public final Class5 aClass5_17 = new Class5();

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class10() {
		this.aClass5_17.aClass5_116 = this.aClass5_17;
		this.aClass5_17.aClass5_115 = this.aClass5_17;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!cb;ILclient!cb;)V")
	public void method221(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_116 != null) {
			arg1.method2144();
		}
		arg1.aClass5_115 = arg0;
		arg1.aClass5_116 = arg0.aClass5_116;
		arg1.aClass5_116.aClass5_115 = arg1;
		arg1.aClass5_115.aClass5_116 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public void method222() {
		while (true) {
			@Pc(12) Class5 local12 = this.aClass5_17.aClass5_115;
			if (this.aClass5_17 == local12) {
				return;
			}
			local12.method2144();
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Lclient!cb;")
	public Class5 method227() {
		@Pc(3) Class5 local3 = this.aClass5_17.aClass5_116;
		if (local3 == this.aClass5_17) {
			this.aClass5_18 = null;
			return null;
		} else {
			this.aClass5_18 = local3.aClass5_116;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lclient!cb;")
	public Class5 method228() {
		@Pc(10) Class5 local10 = this.aClass5_17.aClass5_116;
		if (this.aClass5_17 == local10) {
			return null;
		} else {
			local10.method2144();
			return local10;
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)Lclient!cb;")
	public Class5 method229() {
		@Pc(7) Class5 local7 = this.aClass5_17.aClass5_115;
		if (this.aClass5_17 == local7) {
			return null;
		} else {
			local7.method2144();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Lclient!cb;")
	public Class5 method230() {
		@Pc(7) Class5 local7 = this.aClass5_17.aClass5_115;
		if (this.aClass5_17 == local7) {
			this.aClass5_18 = null;
			return null;
		} else {
			this.aClass5_18 = local7.aClass5_115;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)Lclient!cb;")
	public Class5 method233() {
		@Pc(6) Class5 local6 = this.aClass5_18;
		if (this.aClass5_17 == local6) {
			this.aClass5_18 = null;
			return null;
		} else {
			this.aClass5_18 = local6.aClass5_115;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!cb;I)V")
	public void method234(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_116 != null) {
			arg0.method2144();
		}
		arg0.aClass5_116 = this.aClass5_17.aClass5_116;
		arg0.aClass5_115 = this.aClass5_17;
		arg0.aClass5_116.aClass5_115 = arg0;
		arg0.aClass5_115.aClass5_116 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!cb;)V")
	public void method235(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_116 != null) {
			arg0.method2144();
		}
		arg0.aClass5_116 = this.aClass5_17;
		arg0.aClass5_115 = this.aClass5_17.aClass5_115;
		arg0.aClass5_116.aClass5_115 = arg0;
		arg0.aClass5_115.aClass5_116 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)Lclient!cb;")
	public Class5 method239() {
		@Pc(2) Class5 local2 = this.aClass5_18;
		if (local2 == this.aClass5_17) {
			this.aClass5_18 = null;
			return null;
		} else {
			this.aClass5_18 = local2.aClass5_116;
			return local2;
		}
	}
}
