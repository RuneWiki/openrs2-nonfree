import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class10 {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!id;")
	private Class3 aClass3_20;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!id;")
	public final Class3 aClass3_19 = new Class3();

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class10() {
		this.aClass3_19.aClass3_213 = this.aClass3_19;
		this.aClass3_19.aClass3_214 = this.aClass3_19;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Lclient!id;")
	public Class3 method257() {
		@Pc(7) Class3 local7 = this.aClass3_19.aClass3_214;
		if (local7 == this.aClass3_19) {
			this.aClass3_20 = null;
			return null;
		} else {
			this.aClass3_20 = local7.aClass3_214;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!id;Lclient!id;B)V")
	public void method258(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_214 != null) {
			arg1.method3320();
		}
		arg1.aClass3_214 = arg0.aClass3_214;
		arg1.aClass3_213 = arg0;
		arg1.aClass3_214.aClass3_213 = arg1;
		arg1.aClass3_213.aClass3_214 = arg1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!id;I)V")
	public void method261(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_214 != null) {
			arg0.method3320();
		}
		arg0.aClass3_213 = this.aClass3_19;
		arg0.aClass3_214 = this.aClass3_19.aClass3_214;
		arg0.aClass3_214.aClass3_213 = arg0;
		arg0.aClass3_213.aClass3_214 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public void method262() {
		while (true) {
			@Pc(11) Class3 local11 = this.aClass3_19.aClass3_213;
			if (local11 == this.aClass3_19) {
				return;
			}
			local11.method3320();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!id;)V")
	public void method265(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_214 != null) {
			arg0.method3320();
		}
		arg0.aClass3_214 = this.aClass3_19;
		arg0.aClass3_213 = this.aClass3_19.aClass3_213;
		arg0.aClass3_214.aClass3_213 = arg0;
		arg0.aClass3_213.aClass3_214 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lclient!id;")
	public Class3 method267() {
		@Pc(12) Class3 local12 = this.aClass3_19.aClass3_213;
		if (this.aClass3_19 == local12) {
			this.aClass3_20 = null;
			return null;
		} else {
			this.aClass3_20 = local12.aClass3_213;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)Lclient!id;")
	public Class3 method268() {
		@Pc(6) Class3 local6 = this.aClass3_20;
		if (local6 == this.aClass3_19) {
			this.aClass3_20 = null;
			return null;
		} else {
			this.aClass3_20 = local6.aClass3_213;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Lclient!id;")
	public Class3 method269() {
		@Pc(6) Class3 local6 = this.aClass3_20;
		if (this.aClass3_19 == local6) {
			this.aClass3_20 = null;
			return null;
		} else {
			this.aClass3_20 = local6.aClass3_214;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)Lclient!id;")
	public Class3 method270() {
		@Pc(7) Class3 local7 = this.aClass3_19.aClass3_213;
		if (local7 == this.aClass3_19) {
			return null;
		} else {
			local7.method3320();
			return local7;
		}
	}
}
