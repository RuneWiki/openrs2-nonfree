import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class212 {

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!di;")
	private Class39_Sub2 aClass39_Sub2_4;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!di;")
	public final Class39_Sub2 aClass39_Sub2_3 = new Class39_Sub2();

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class212() {
		this.aClass39_Sub2_3.aClass39_Sub2_7 = this.aClass39_Sub2_3;
		this.aClass39_Sub2_3.aClass39_Sub2_8 = this.aClass39_Sub2_3;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public void method4958() {
		while (true) {
			@Pc(9) Class39_Sub2 local9 = this.aClass39_Sub2_3.aClass39_Sub2_8;
			if (local9 == this.aClass39_Sub2_3) {
				this.aClass39_Sub2_4 = null;
				return;
			}
			local9.method5576();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)Lclient!di;")
	public Class39_Sub2 method4959() {
		@Pc(6) Class39_Sub2 local6 = this.aClass39_Sub2_4;
		if (local6 == this.aClass39_Sub2_3) {
			this.aClass39_Sub2_4 = null;
			return null;
		} else {
			this.aClass39_Sub2_4 = local6.aClass39_Sub2_8;
			return local6;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Lclient!di;")
	public Class39_Sub2 method4960() {
		@Pc(7) Class39_Sub2 local7 = this.aClass39_Sub2_3.aClass39_Sub2_8;
		if (local7 == this.aClass39_Sub2_3) {
			this.aClass39_Sub2_4 = null;
			return null;
		} else {
			this.aClass39_Sub2_4 = local7.aClass39_Sub2_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!di;I)V")
	public void method4961(@OriginalArg(0) Class39_Sub2 arg0) {
		if (arg0.aClass39_Sub2_7 != null) {
			arg0.method5576();
		}
		arg0.aClass39_Sub2_8 = this.aClass39_Sub2_3;
		arg0.aClass39_Sub2_7 = this.aClass39_Sub2_3.aClass39_Sub2_7;
		arg0.aClass39_Sub2_7.aClass39_Sub2_8 = arg0;
		arg0.aClass39_Sub2_8.aClass39_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
	public int method4964() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class39_Sub2 local11 = this.aClass39_Sub2_3.aClass39_Sub2_8;
		while (this.aClass39_Sub2_3 != local11) {
			local11 = local11.aClass39_Sub2_8;
			local7++;
		}
		return local7;
	}
}
