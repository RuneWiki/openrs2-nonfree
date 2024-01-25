import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class325 {

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "Lclient!cm;")
	private Class3 aClass3_60;

	@OriginalMember(owner = "client!tca", name = "j", descriptor = "Lclient!cm;")
	private final Class3 aClass3_59 = new Class3();

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	public Class325() {
		this.aClass3_59.aClass3_68 = this.aClass3_59;
		this.aClass3_59.aClass3_67 = this.aClass3_59;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!cm;)V")
	public void method8013(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_68 != null) {
			arg0.method8909();
		}
		arg0.aClass3_68 = this.aClass3_59.aClass3_68;
		arg0.aClass3_67 = this.aClass3_59;
		arg0.aClass3_68.aClass3_67 = arg0;
		arg0.aClass3_67.aClass3_68 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Lclient!cm;")
	public Class3 method8014() {
		@Pc(13) Class3 local13 = this.aClass3_59.aClass3_68;
		if (this.aClass3_59 == local13) {
			this.aClass3_60 = null;
			return null;
		} else {
			this.aClass3_60 = local13.aClass3_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Z")
	public boolean method8015() {
		return this.aClass3_59 == this.aClass3_59.aClass3_67;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)Lclient!cm;")
	public Class3 method8016() {
		@Pc(7) Class3 local7 = this.aClass3_59.aClass3_67;
		if (local7 == this.aClass3_59) {
			this.aClass3_60 = null;
			return null;
		} else {
			this.aClass3_60 = local7.aClass3_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)I")
	public int method8018() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class3 local11 = this.aClass3_59.aClass3_67; local11 != this.aClass3_59; local11 = local11.aClass3_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)Lclient!cm;")
	public Class3 method8019() {
		@Pc(7) Class3 local7 = this.aClass3_59.aClass3_67;
		if (local7 == this.aClass3_59) {
			return null;
		} else {
			local7.method8909();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)V")
	public void method8020() {
		while (true) {
			@Pc(13) Class3 local13 = this.aClass3_59.aClass3_67;
			if (local13 == this.aClass3_59) {
				this.aClass3_60 = null;
				return;
			}
			local13.method8909();
		}
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(B)Lclient!cm;")
	public Class3 method8022() {
		@Pc(6) Class3 local6 = this.aClass3_60;
		if (local6 == this.aClass3_59) {
			this.aClass3_60 = null;
			return null;
		} else {
			this.aClass3_60 = local6.aClass3_67;
			return local6;
		}
	}
}
