import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class244 {

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Lclient!le;")
	private Class3_Sub4 aClass3_Sub4_50;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!le;")
	private final Class3_Sub4 aClass3_Sub4_49 = new Class3_Sub4();

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class244() {
		this.aClass3_Sub4_49.aClass3_Sub4_58 = this.aClass3_Sub4_49;
		this.aClass3_Sub4_49.aClass3_Sub4_57 = this.aClass3_Sub4_49;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lclient!le;")
	public Class3_Sub4 method5232() {
		@Pc(6) Class3_Sub4 local6 = this.aClass3_Sub4_50;
		if (local6 == this.aClass3_Sub4_49) {
			this.aClass3_Sub4_50 = null;
			return null;
		} else {
			this.aClass3_Sub4_50 = local6.aClass3_Sub4_58;
			return local6;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!le;I)V")
	public void method5234(@OriginalArg(0) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub4_57 != null) {
			arg0.method5949();
		}
		arg0.aClass3_Sub4_57 = this.aClass3_Sub4_49.aClass3_Sub4_57;
		arg0.aClass3_Sub4_58 = this.aClass3_Sub4_49;
		arg0.aClass3_Sub4_57.aClass3_Sub4_58 = arg0;
		arg0.aClass3_Sub4_58.aClass3_Sub4_57 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lclient!le;")
	public Class3_Sub4 method5235() {
		@Pc(7) Class3_Sub4 local7 = this.aClass3_Sub4_49.aClass3_Sub4_58;
		if (local7 == this.aClass3_Sub4_49) {
			return null;
		} else {
			local7.method5949();
			return local7;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
	public void method5238() {
		while (true) {
			@Pc(11) Class3_Sub4 local11 = this.aClass3_Sub4_49.aClass3_Sub4_58;
			if (local11 == this.aClass3_Sub4_49) {
				this.aClass3_Sub4_50 = null;
				return;
			}
			local11.method5949();
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)I")
	public int method5239() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class3_Sub4 local9 = this.aClass3_Sub4_49.aClass3_Sub4_58; local9 != this.aClass3_Sub4_49; local9 = local9.aClass3_Sub4_58) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)Lclient!le;")
	public Class3_Sub4 method5240() {
		@Pc(7) Class3_Sub4 local7 = this.aClass3_Sub4_49.aClass3_Sub4_58;
		if (local7 == this.aClass3_Sub4_49) {
			this.aClass3_Sub4_50 = null;
			return null;
		} else {
			this.aClass3_Sub4_50 = local7.aClass3_Sub4_58;
			return local7;
		}
	}
}
