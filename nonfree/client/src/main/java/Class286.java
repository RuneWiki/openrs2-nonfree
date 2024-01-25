import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class286 {

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!we;")
	private Class6_Sub2 aClass6_Sub2_57;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!we;")
	public final Class6_Sub2 aClass6_Sub2_56 = new Class6_Sub2();

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class286() {
		this.aClass6_Sub2_56.aClass6_Sub2_67 = this.aClass6_Sub2_56;
		this.aClass6_Sub2_56.aClass6_Sub2_66 = this.aClass6_Sub2_56;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public void method7237() {
		while (true) {
			@Pc(5) Class6_Sub2 local5 = this.aClass6_Sub2_56.aClass6_Sub2_66;
			if (local5 == this.aClass6_Sub2_56) {
				this.aClass6_Sub2_57 = null;
				return;
			}
			local5.method8754();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!we;I)V")
	public void method7239(@OriginalArg(0) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_67 != null) {
			arg0.method8754();
		}
		arg0.aClass6_Sub2_67 = this.aClass6_Sub2_56.aClass6_Sub2_67;
		arg0.aClass6_Sub2_66 = this.aClass6_Sub2_56;
		arg0.aClass6_Sub2_67.aClass6_Sub2_66 = arg0;
		arg0.aClass6_Sub2_66.aClass6_Sub2_67 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	public int method7240() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class6_Sub2 local16 = this.aClass6_Sub2_56.aClass6_Sub2_66;
		while (local16 != this.aClass6_Sub2_56) {
			local16 = local16.aClass6_Sub2_66;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Lclient!we;")
	public Class6_Sub2 method7241() {
		@Pc(6) Class6_Sub2 local6 = this.aClass6_Sub2_57;
		if (local6 == this.aClass6_Sub2_56) {
			this.aClass6_Sub2_57 = null;
			return null;
		} else {
			this.aClass6_Sub2_57 = local6.aClass6_Sub2_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Lclient!we;")
	public Class6_Sub2 method7242() {
		@Pc(12) Class6_Sub2 local12 = this.aClass6_Sub2_56.aClass6_Sub2_66;
		if (this.aClass6_Sub2_56 == local12) {
			this.aClass6_Sub2_57 = null;
			return null;
		} else {
			this.aClass6_Sub2_57 = local12.aClass6_Sub2_66;
			return local12;
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)Lclient!we;")
	public Class6_Sub2 method7244() {
		@Pc(7) Class6_Sub2 local7 = this.aClass6_Sub2_56.aClass6_Sub2_66;
		if (local7 == this.aClass6_Sub2_56) {
			return null;
		} else {
			local7.method8754();
			return local7;
		}
	}
}
