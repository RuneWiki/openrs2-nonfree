import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class22 {

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "Lclient!np;")
	private Class55_Sub2 aClass55_Sub2_2;

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "Lclient!np;")
	public final Class55_Sub2 aClass55_Sub2_1 = new Class55_Sub2();

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "()V")
	public Class22() {
		this.aClass55_Sub2_1.aClass55_Sub2_9 = this.aClass55_Sub2_1;
		this.aClass55_Sub2_1.aClass55_Sub2_10 = this.aClass55_Sub2_1;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Lclient!np;")
	public Class55_Sub2 method890() {
		@Pc(12) Class55_Sub2 local12 = this.aClass55_Sub2_1.aClass55_Sub2_10;
		if (this.aClass55_Sub2_1 == local12) {
			this.aClass55_Sub2_2 = null;
			return null;
		} else {
			this.aClass55_Sub2_2 = local12.aClass55_Sub2_10;
			return local12;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lclient!np;")
	public Class55_Sub2 method892() {
		@Pc(10) Class55_Sub2 local10 = this.aClass55_Sub2_2;
		if (this.aClass55_Sub2_1 == local10) {
			this.aClass55_Sub2_2 = null;
			return null;
		} else {
			this.aClass55_Sub2_2 = local10.aClass55_Sub2_10;
			return local10;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!np;I)V")
	public void method893(@OriginalArg(0) Class55_Sub2 arg0) {
		if (arg0.aClass55_Sub2_9 != null) {
			arg0.method4577();
		}
		arg0.aClass55_Sub2_9 = this.aClass55_Sub2_1.aClass55_Sub2_9;
		arg0.aClass55_Sub2_10 = this.aClass55_Sub2_1;
		arg0.aClass55_Sub2_9.aClass55_Sub2_10 = arg0;
		arg0.aClass55_Sub2_10.aClass55_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)I")
	public int method894() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class55_Sub2 local11 = this.aClass55_Sub2_1.aClass55_Sub2_10;
		while (local11 != this.aClass55_Sub2_1) {
			local11 = local11.aClass55_Sub2_10;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
	public void method895() {
		while (true) {
			@Pc(3) Class55_Sub2 local3 = this.aClass55_Sub2_1.aClass55_Sub2_10;
			if (local3 == this.aClass55_Sub2_1) {
				this.aClass55_Sub2_2 = null;
				return;
			}
			local3.method4577();
		}
	}
}
