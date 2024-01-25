import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class95 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[Lclient!ck;")
	private static final Class44[] aClass44Array1 = new Class44[32];

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!ve;")
	private Class36_Sub3 aClass36_Sub3_8;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!ve;")
	public final Class36_Sub3 aClass36_Sub3_7 = new Class36_Sub3();

	static {
		@Pc(65) Class44[] local65 = Static44.method584();
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			aClass44Array1[local65[local67].anInt793] = local65[local67];
		}
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class95() {
		this.aClass36_Sub3_7.aClass36_Sub3_5 = this.aClass36_Sub3_7;
		this.aClass36_Sub3_7.aClass36_Sub3_6 = this.aClass36_Sub3_7;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ve;)V")
	public void method1882(@OriginalArg(1) Class36_Sub3 arg0) {
		if (arg0.aClass36_Sub3_5 != null) {
			arg0.method1667();
		}
		arg0.aClass36_Sub3_6 = this.aClass36_Sub3_7;
		arg0.aClass36_Sub3_5 = this.aClass36_Sub3_7.aClass36_Sub3_5;
		arg0.aClass36_Sub3_5.aClass36_Sub3_6 = arg0;
		arg0.aClass36_Sub3_6.aClass36_Sub3_5 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lclient!ve;")
	public Class36_Sub3 method1884() {
		@Pc(7) Class36_Sub3 local7 = this.aClass36_Sub3_7.aClass36_Sub3_6;
		if (local7 == this.aClass36_Sub3_7) {
			this.aClass36_Sub3_8 = null;
			return null;
		} else {
			this.aClass36_Sub3_8 = local7.aClass36_Sub3_6;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Lclient!ve;")
	public Class36_Sub3 method1885() {
		@Pc(11) Class36_Sub3 local11 = this.aClass36_Sub3_8;
		if (local11 == this.aClass36_Sub3_7) {
			this.aClass36_Sub3_8 = null;
			return null;
		} else {
			this.aClass36_Sub3_8 = local11.aClass36_Sub3_6;
			return local11;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
	public int method1888() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class36_Sub3 local16 = this.aClass36_Sub3_7.aClass36_Sub3_6; local16 != this.aClass36_Sub3_7; local16 = local16.aClass36_Sub3_6) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public void method1889() {
		while (true) {
			@Pc(9) Class36_Sub3 local9 = this.aClass36_Sub3_7.aClass36_Sub3_6;
			if (this.aClass36_Sub3_7 == local9) {
				this.aClass36_Sub3_8 = null;
				return;
			}
			local9.method1667();
		}
	}
}
