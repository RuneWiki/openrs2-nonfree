import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class236 {

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!qha;")
	private Class3 aClass3_50;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Lclient!qha;")
	private final Class3 aClass3_49 = new Class3();

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class236() {
		this.aClass3_49.aClass3_67 = this.aClass3_49;
		this.aClass3_49.aClass3_68 = this.aClass3_49;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lclient!qha;")
	public Class3 method4950() {
		@Pc(6) Class3 local6 = this.aClass3_50;
		if (local6 == this.aClass3_49) {
			this.aClass3_50 = null;
			return null;
		} else {
			this.aClass3_50 = local6.aClass3_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lclient!qha;")
	public Class3 method4951() {
		@Pc(7) Class3 local7 = this.aClass3_49.aClass3_67;
		if (this.aClass3_49 == local7) {
			return null;
		} else {
			local7.method8898();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public void method4953() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_49.aClass3_67;
			if (this.aClass3_49 == local5) {
				this.aClass3_50 = null;
				return;
			}
			local5.method8898();
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)I")
	public int method4954() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class3 local19 = this.aClass3_49.aClass3_67; local19 != this.aClass3_49; local19 = local19.aClass3_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!qha;)V")
	public void method4955(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_68 != null) {
			arg0.method8898();
		}
		arg0.aClass3_68 = this.aClass3_49.aClass3_68;
		arg0.aClass3_67 = this.aClass3_49;
		arg0.aClass3_68.aClass3_67 = arg0;
		arg0.aClass3_67.aClass3_68 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)Z")
	public boolean method4956() {
		return this.aClass3_49 == this.aClass3_49.aClass3_67;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)Lclient!qha;")
	public Class3 method4957() {
		@Pc(7) Class3 local7 = this.aClass3_49.aClass3_68;
		if (local7 == this.aClass3_49) {
			this.aClass3_50 = null;
			return null;
		} else {
			this.aClass3_50 = local7.aClass3_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lclient!qha;")
	public Class3 method4958() {
		@Pc(12) Class3 local12 = this.aClass3_49.aClass3_67;
		if (this.aClass3_49 == local12) {
			this.aClass3_50 = null;
			return null;
		} else {
			this.aClass3_50 = local12.aClass3_67;
			return local12;
		}
	}
}
