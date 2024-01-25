import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class283 {

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "Lclient!ffa;")
	private Class3_Sub4 aClass3_Sub4_52;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "Lclient!ffa;")
	public final Class3_Sub4 aClass3_Sub4_51 = new Class3_Sub4();

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	public Class283() {
		this.aClass3_Sub4_51.aClass3_Sub4_67 = this.aClass3_Sub4_51;
		this.aClass3_Sub4_51.aClass3_Sub4_66 = this.aClass3_Sub4_51;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Lclient!ffa;")
	public Class3_Sub4 method7031() {
		@Pc(14) Class3_Sub4 local14 = this.aClass3_Sub4_51.aClass3_Sub4_66;
		if (local14 == this.aClass3_Sub4_51) {
			this.aClass3_Sub4_52 = null;
			return null;
		} else {
			this.aClass3_Sub4_52 = local14.aClass3_Sub4_66;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)I")
	public int method7032() {
		@Pc(7) int local7 = 0;
		@Pc(18) Class3_Sub4 local18 = this.aClass3_Sub4_51.aClass3_Sub4_66;
		while (this.aClass3_Sub4_51 != local18) {
			local18 = local18.aClass3_Sub4_66;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)Lclient!ffa;")
	public Class3_Sub4 method7034() {
		@Pc(7) Class3_Sub4 local7 = this.aClass3_Sub4_51.aClass3_Sub4_66;
		if (this.aClass3_Sub4_51 == local7) {
			return null;
		} else {
			local7.method8848();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Lclient!ffa;")
	public Class3_Sub4 method7035() {
		@Pc(6) Class3_Sub4 local6 = this.aClass3_Sub4_52;
		if (this.aClass3_Sub4_51 == local6) {
			this.aClass3_Sub4_52 = null;
			return null;
		} else {
			this.aClass3_Sub4_52 = local6.aClass3_Sub4_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZLclient!ffa;)V")
	public void method7036(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub4_67 != null) {
			arg0.method8848();
		}
		arg0.aClass3_Sub4_66 = this.aClass3_Sub4_51;
		arg0.aClass3_Sub4_67 = this.aClass3_Sub4_51.aClass3_Sub4_67;
		arg0.aClass3_Sub4_67.aClass3_Sub4_66 = arg0;
		arg0.aClass3_Sub4_66.aClass3_Sub4_67 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
	public void method7037() {
		while (true) {
			@Pc(5) Class3_Sub4 local5 = this.aClass3_Sub4_51.aClass3_Sub4_66;
			if (this.aClass3_Sub4_51 == local5) {
				this.aClass3_Sub4_52 = null;
				return;
			}
			local5.method8848();
		}
	}
}
