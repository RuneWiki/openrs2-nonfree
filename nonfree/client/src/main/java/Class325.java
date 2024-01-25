import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class325 {

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!vs;")
	private Class3_Sub7 aClass3_Sub7_58;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!vs;")
	private final Class3_Sub7 aClass3_Sub7_57 = new Class3_Sub7();

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class325() {
		this.aClass3_Sub7_57.aClass3_Sub7_61 = this.aClass3_Sub7_57;
		this.aClass3_Sub7_57.aClass3_Sub7_62 = this.aClass3_Sub7_57;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!vs;I)V")
	public void method6856(@OriginalArg(0) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_62 != null) {
			arg0.method7614();
		}
		arg0.aClass3_Sub7_62 = this.aClass3_Sub7_57;
		arg0.aClass3_Sub7_61 = this.aClass3_Sub7_57.aClass3_Sub7_61;
		arg0.aClass3_Sub7_62.aClass3_Sub7_61 = arg0;
		arg0.aClass3_Sub7_61.aClass3_Sub7_62 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)I")
	public int method6857() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class3_Sub7 local16 = this.aClass3_Sub7_57.aClass3_Sub7_61;
		while (this.aClass3_Sub7_57 != local16) {
			local16 = local16.aClass3_Sub7_61;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Lclient!vs;")
	public Class3_Sub7 method6858() {
		@Pc(7) Class3_Sub7 local7 = this.aClass3_Sub7_57.aClass3_Sub7_62;
		if (this.aClass3_Sub7_57 == local7) {
			return null;
		} else {
			local7.method7614();
			return local7;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Lclient!vs;")
	public Class3_Sub7 method6859() {
		@Pc(7) Class3_Sub7 local7 = this.aClass3_Sub7_57.aClass3_Sub7_61;
		if (this.aClass3_Sub7_57 == local7) {
			this.aClass3_Sub7_58 = null;
			return null;
		} else {
			this.aClass3_Sub7_58 = local7.aClass3_Sub7_61;
			return local7;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Lclient!vs;")
	public Class3_Sub7 method6860() {
		@Pc(12) Class3_Sub7 local12 = this.aClass3_Sub7_57.aClass3_Sub7_61;
		if (local12 == this.aClass3_Sub7_57) {
			return null;
		} else {
			local12.method7614();
			return local12;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!vs;)V")
	public void method6862(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_62 != null) {
			arg0.method7614();
		}
		arg0.aClass3_Sub7_61 = this.aClass3_Sub7_57;
		arg0.aClass3_Sub7_62 = this.aClass3_Sub7_57.aClass3_Sub7_62;
		arg0.aClass3_Sub7_62.aClass3_Sub7_61 = arg0;
		arg0.aClass3_Sub7_61.aClass3_Sub7_62 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Lclient!vs;")
	public Class3_Sub7 method6863() {
		@Pc(6) Class3_Sub7 local6 = this.aClass3_Sub7_58;
		if (this.aClass3_Sub7_57 == local6) {
			this.aClass3_Sub7_58 = null;
			return null;
		} else {
			this.aClass3_Sub7_58 = local6.aClass3_Sub7_61;
			return local6;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	public void method6864() {
		while (true) {
			@Pc(9) Class3_Sub7 local9 = this.aClass3_Sub7_57.aClass3_Sub7_61;
			if (local9 == this.aClass3_Sub7_57) {
				this.aClass3_Sub7_58 = null;
				return;
			}
			local9.method7614();
		}
	}
}
