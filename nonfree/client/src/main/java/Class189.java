import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class189 {

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "Lclient!ph;")
	private Class1_Sub5 aClass1_Sub5_75;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!ph;")
	public Class1_Sub5 aClass1_Sub5_74 = new Class1_Sub5();

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class189() {
		this.aClass1_Sub5_74.aClass1_Sub5_72 = this.aClass1_Sub5_74;
		this.aClass1_Sub5_74.aClass1_Sub5_73 = this.aClass1_Sub5_74;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Lclient!ph;")
	public Class1_Sub5 method4600() {
		@Pc(8) Class1_Sub5 local8 = this.aClass1_Sub5_74.aClass1_Sub5_73;
		if (local8 == this.aClass1_Sub5_74) {
			this.aClass1_Sub5_75 = null;
			return null;
		} else {
			this.aClass1_Sub5_75 = local8.aClass1_Sub5_73;
			return local8;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)Lclient!ph;")
	public Class1_Sub5 method4601() {
		@Pc(8) Class1_Sub5 local8 = this.aClass1_Sub5_75;
		if (local8 == this.aClass1_Sub5_74) {
			this.aClass1_Sub5_75 = null;
			return null;
		} else {
			this.aClass1_Sub5_75 = local8.aClass1_Sub5_73;
			return local8;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)Lclient!ph;")
	public Class1_Sub5 method4602() {
		@Pc(7) Class1_Sub5 local7 = this.aClass1_Sub5_74.aClass1_Sub5_73;
		if (local7 == this.aClass1_Sub5_74) {
			return null;
		} else {
			local7.method4577();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!ph;)V")
	public void method4603(@OriginalArg(1) Class1_Sub5 arg0) {
		if (arg0.aClass1_Sub5_72 != null) {
			arg0.method4577();
		}
		arg0.aClass1_Sub5_73 = this.aClass1_Sub5_74;
		arg0.aClass1_Sub5_72 = this.aClass1_Sub5_74.aClass1_Sub5_72;
		arg0.aClass1_Sub5_72.aClass1_Sub5_73 = arg0;
		arg0.aClass1_Sub5_73.aClass1_Sub5_72 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public void method4604() {
		while (true) {
			@Pc(9) Class1_Sub5 local9 = this.aClass1_Sub5_74.aClass1_Sub5_73;
			if (local9 == this.aClass1_Sub5_74) {
				this.aClass1_Sub5_75 = null;
				return;
			}
			local9.method4577();
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)I")
	public int method4605() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub5 local11 = this.aClass1_Sub5_74.aClass1_Sub5_73;
		while (this.aClass1_Sub5_74 != local11) {
			local11 = local11.aClass1_Sub5_73;
			local7++;
		}
		return local7;
	}
}
