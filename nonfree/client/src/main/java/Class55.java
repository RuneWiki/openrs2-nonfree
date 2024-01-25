import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class55 {

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!ok;")
	private Class7_Sub2 aClass7_Sub2_8;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Lclient!ok;")
	public final Class7_Sub2 aClass7_Sub2_7 = new Class7_Sub2();

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class55() {
		this.aClass7_Sub2_7.aClass7_Sub2_5 = this.aClass7_Sub2_7;
		this.aClass7_Sub2_7.aClass7_Sub2_6 = this.aClass7_Sub2_7;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Lclient!ok;")
	public Class7_Sub2 method1212() {
		@Pc(6) Class7_Sub2 local6 = this.aClass7_Sub2_8;
		if (this.aClass7_Sub2_7 == local6) {
			this.aClass7_Sub2_8 = null;
			return null;
		} else {
			this.aClass7_Sub2_8 = local6.aClass7_Sub2_5;
			return local6;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	public void method1214() {
		while (true) {
			@Pc(9) Class7_Sub2 local9 = this.aClass7_Sub2_7.aClass7_Sub2_5;
			if (local9 == this.aClass7_Sub2_7) {
				this.aClass7_Sub2_8 = null;
				return;
			}
			local9.method740();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!ok;)V")
	public void method1215(@OriginalArg(1) Class7_Sub2 arg0) {
		if (arg0.aClass7_Sub2_6 != null) {
			arg0.method740();
		}
		arg0.aClass7_Sub2_6 = this.aClass7_Sub2_7.aClass7_Sub2_6;
		arg0.aClass7_Sub2_5 = this.aClass7_Sub2_7;
		arg0.aClass7_Sub2_6.aClass7_Sub2_5 = arg0;
		arg0.aClass7_Sub2_5.aClass7_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)Lclient!ok;")
	public Class7_Sub2 method1216() {
		@Pc(7) Class7_Sub2 local7 = this.aClass7_Sub2_7.aClass7_Sub2_5;
		if (this.aClass7_Sub2_7 == local7) {
			this.aClass7_Sub2_8 = null;
			return null;
		} else {
			this.aClass7_Sub2_8 = local7.aClass7_Sub2_5;
			return local7;
		}
	}
}
