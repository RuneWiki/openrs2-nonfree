import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class85 {

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!rh;")
	private Class1_Sub2 aClass1_Sub2_37;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!rh;")
	private Class1_Sub2 aClass1_Sub2_36 = new Class1_Sub2();

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class85() {
		this.aClass1_Sub2_36.aClass1_Sub2_52 = this.aClass1_Sub2_36;
		this.aClass1_Sub2_36.aClass1_Sub2_53 = this.aClass1_Sub2_36;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!rh;)V")
	public void method2423(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_53 != null) {
			arg0.method3682();
		}
		arg0.aClass1_Sub2_53 = this.aClass1_Sub2_36;
		arg0.aClass1_Sub2_52 = this.aClass1_Sub2_36.aClass1_Sub2_52;
		arg0.aClass1_Sub2_53.aClass1_Sub2_52 = arg0;
		arg0.aClass1_Sub2_52.aClass1_Sub2_53 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Lclient!rh;")
	public Class1_Sub2 method2425() {
		@Pc(12) Class1_Sub2 local12 = this.aClass1_Sub2_36.aClass1_Sub2_52;
		if (this.aClass1_Sub2_36 == local12) {
			this.aClass1_Sub2_37 = null;
			return null;
		} else {
			this.aClass1_Sub2_37 = local12.aClass1_Sub2_52;
			return local12;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method2427() {
		while (true) {
			@Pc(5) Class1_Sub2 local5 = this.aClass1_Sub2_36.aClass1_Sub2_52;
			if (local5 == this.aClass1_Sub2_36) {
				this.aClass1_Sub2_37 = null;
				return;
			}
			local5.method3682();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Lclient!rh;")
	public Class1_Sub2 method2428() {
		@Pc(11) Class1_Sub2 local11 = this.aClass1_Sub2_37;
		if (local11 == this.aClass1_Sub2_36) {
			this.aClass1_Sub2_37 = null;
			return null;
		} else {
			this.aClass1_Sub2_37 = local11.aClass1_Sub2_52;
			return local11;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Lclient!rh;")
	public Class1_Sub2 method2429() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_36.aClass1_Sub2_52;
		if (this.aClass1_Sub2_36 == local7) {
			return null;
		} else {
			local7.method3682();
			return local7;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!rh;I)V")
	public void method2432(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_53 != null) {
			arg0.method3682();
		}
		arg0.aClass1_Sub2_52 = this.aClass1_Sub2_36;
		arg0.aClass1_Sub2_53 = this.aClass1_Sub2_36.aClass1_Sub2_53;
		arg0.aClass1_Sub2_53.aClass1_Sub2_52 = arg0;
		arg0.aClass1_Sub2_52.aClass1_Sub2_53 = arg0;
	}
}
