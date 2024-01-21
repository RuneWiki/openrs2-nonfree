import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class81 {

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lclient!hb;")
	private Class2 aClass2_190;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Lclient!hb;")
	public final Class2 aClass2_189 = new Class2();

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class81() {
		this.aClass2_189.aClass2_213 = this.aClass2_189;
		this.aClass2_189.aClass2_214 = this.aClass2_189;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lclient!hb;")
	public Class2 method2678() {
		@Pc(7) Class2 local7 = this.aClass2_189.aClass2_213;
		if (this.aClass2_189 == local7) {
			this.aClass2_190 = null;
			return null;
		} else {
			this.aClass2_190 = local7.aClass2_213;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!hb;B)V")
	public void method2679(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_213 != null) {
			arg0.method3007();
		}
		arg0.aClass2_213 = this.aClass2_189;
		arg0.aClass2_214 = this.aClass2_189.aClass2_214;
		arg0.aClass2_213.aClass2_214 = arg0;
		arg0.aClass2_214.aClass2_213 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lclient!hb;")
	public Class2 method2681() {
		@Pc(7) Class2 local7 = this.aClass2_189.aClass2_214;
		if (local7 == this.aClass2_189) {
			return null;
		} else {
			local7.method3007();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Lclient!hb;")
	public Class2 method2682() {
		@Pc(13) Class2 local13 = this.aClass2_189.aClass2_214;
		if (this.aClass2_189 == local13) {
			this.aClass2_190 = null;
			return null;
		} else {
			this.aClass2_190 = local13.aClass2_214;
			return local13;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!hb;I)V")
	public void method2683(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_213 != null) {
			arg0.method3007();
		}
		arg0.aClass2_214 = this.aClass2_189;
		arg0.aClass2_213 = this.aClass2_189.aClass2_213;
		arg0.aClass2_213.aClass2_214 = arg0;
		arg0.aClass2_214.aClass2_213 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lclient!hb;")
	public Class2 method2685() {
		@Pc(6) Class2 local6 = this.aClass2_190;
		if (this.aClass2_189 == local6) {
			this.aClass2_190 = null;
			return null;
		} else {
			this.aClass2_190 = local6.aClass2_213;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Lclient!hb;")
	public Class2 method2686() {
		@Pc(11) Class2 local11 = this.aClass2_190;
		if (local11 == this.aClass2_189) {
			this.aClass2_190 = null;
			return null;
		} else {
			this.aClass2_190 = local11.aClass2_214;
			return local11;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!hb;Lclient!hb;)V")
	public void method2688(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_213 != null) {
			arg1.method3007();
		}
		arg1.aClass2_214 = arg0;
		arg1.aClass2_213 = arg0.aClass2_213;
		arg1.aClass2_213.aClass2_214 = arg1;
		arg1.aClass2_214.aClass2_213 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
	public void method2689() {
		while (true) {
			@Pc(14) Class2 local14 = this.aClass2_189.aClass2_214;
			if (this.aClass2_189 == local14) {
				return;
			}
			local14.method3007();
		}
	}
}
