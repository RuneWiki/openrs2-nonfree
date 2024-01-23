import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class44 {

	@OriginalMember(owner = "client!en", name = "p", descriptor = "Lclient!qk;")
	private Class2 aClass2_78;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "Lclient!qk;")
	public Class2 aClass2_77 = new Class2();

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class44() {
		this.aClass2_77.aClass2_233 = this.aClass2_77;
		this.aClass2_77.aClass2_232 = this.aClass2_77;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Lclient!qk;")
	public Class2 method1350() {
		@Pc(14) Class2 local14 = this.aClass2_77.aClass2_233;
		if (this.aClass2_77 == local14) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local14.aClass2_233;
			return local14;
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Lclient!qk;")
	public Class2 method1352() {
		@Pc(13) Class2 local13 = this.aClass2_77.aClass2_232;
		if (local13 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local13.aClass2_232;
			return local13;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)Lclient!qk;")
	public Class2 method1353() {
		@Pc(7) Class2 local7 = this.aClass2_77.aClass2_232;
		if (local7 == this.aClass2_77) {
			return null;
		} else {
			local7.method4743();
			return local7;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!qk;)V")
	public void method1355(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_233 != null) {
			arg0.method4743();
		}
		arg0.aClass2_233 = this.aClass2_77;
		arg0.aClass2_232 = this.aClass2_77.aClass2_232;
		arg0.aClass2_233.aClass2_232 = arg0;
		arg0.aClass2_232.aClass2_233 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Lclient!qk;")
	public Class2 method1357() {
		@Pc(9) Class2 local9 = this.aClass2_78;
		if (local9 == this.aClass2_77) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local9.aClass2_233;
			return local9;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!qk;B)V")
	public void method1358(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_233 != null) {
			arg0.method4743();
		}
		arg0.aClass2_233 = this.aClass2_77.aClass2_233;
		arg0.aClass2_232 = this.aClass2_77;
		arg0.aClass2_233.aClass2_232 = arg0;
		arg0.aClass2_232.aClass2_233 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)Lclient!qk;")
	public Class2 method1360() {
		@Pc(6) Class2 local6 = this.aClass2_78;
		if (this.aClass2_77 == local6) {
			this.aClass2_78 = null;
			return null;
		} else {
			this.aClass2_78 = local6.aClass2_232;
			return local6;
		}
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	public void method1361() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_77.aClass2_232;
			if (local5 == this.aClass2_77) {
				this.aClass2_78 = null;
				return;
			}
			local5.method4743();
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)Z")
	public boolean method1362() {
		return this.aClass2_77 == this.aClass2_77.aClass2_232;
	}
}
