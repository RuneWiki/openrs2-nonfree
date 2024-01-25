import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class42 {

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "Lclient!fda;")
	private Class14_Sub2 aClass14_Sub2_6;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "Lclient!fda;")
	public final Class14_Sub2 aClass14_Sub2_5 = new Class14_Sub2();

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class42() {
		this.aClass14_Sub2_5.aClass14_Sub2_10 = this.aClass14_Sub2_5;
		this.aClass14_Sub2_5.aClass14_Sub2_9 = this.aClass14_Sub2_5;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
	public int method852() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class14_Sub2 local11 = this.aClass14_Sub2_5.aClass14_Sub2_9;
		while (local11 != this.aClass14_Sub2_5) {
			local11 = local11.aClass14_Sub2_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Lclient!fda;")
	public Class14_Sub2 method853() {
		@Pc(7) Class14_Sub2 local7 = this.aClass14_Sub2_5.aClass14_Sub2_9;
		if (local7 == this.aClass14_Sub2_5) {
			this.aClass14_Sub2_6 = null;
			return null;
		} else {
			this.aClass14_Sub2_6 = local7.aClass14_Sub2_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Lclient!fda;")
	public Class14_Sub2 method854() {
		@Pc(6) Class14_Sub2 local6 = this.aClass14_Sub2_6;
		if (local6 == this.aClass14_Sub2_5) {
			this.aClass14_Sub2_6 = null;
			return null;
		} else {
			this.aClass14_Sub2_6 = local6.aClass14_Sub2_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!fda;)V")
	public void method856(@OriginalArg(1) Class14_Sub2 arg0) {
		if (arg0.aClass14_Sub2_10 != null) {
			arg0.method3776();
		}
		arg0.aClass14_Sub2_10 = this.aClass14_Sub2_5.aClass14_Sub2_10;
		arg0.aClass14_Sub2_9 = this.aClass14_Sub2_5;
		arg0.aClass14_Sub2_10.aClass14_Sub2_9 = arg0;
		arg0.aClass14_Sub2_9.aClass14_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
	public void method857() {
		while (true) {
			@Pc(9) Class14_Sub2 local9 = this.aClass14_Sub2_5.aClass14_Sub2_9;
			if (local9 == this.aClass14_Sub2_5) {
				this.aClass14_Sub2_6 = null;
				return;
			}
			local9.method3776();
		}
	}
}
