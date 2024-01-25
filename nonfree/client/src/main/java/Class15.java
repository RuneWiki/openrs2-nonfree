import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class15 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!wfa;")
	private Class3_Sub4 aClass3_Sub4_6;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "Lclient!wfa;")
	public final Class3_Sub4 aClass3_Sub4_5 = new Class3_Sub4();

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class15() {
		this.aClass3_Sub4_5.aClass3_Sub4_66 = this.aClass3_Sub4_5;
		this.aClass3_Sub4_5.aClass3_Sub4_67 = this.aClass3_Sub4_5;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
	public int method896() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class3_Sub4 local16 = this.aClass3_Sub4_5.aClass3_Sub4_66; local16 != this.aClass3_Sub4_5; local16 = local16.aClass3_Sub4_66) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Lclient!wfa;")
	public Class3_Sub4 method897() {
		@Pc(12) Class3_Sub4 local12 = this.aClass3_Sub4_5.aClass3_Sub4_66;
		if (this.aClass3_Sub4_5 == local12) {
			this.aClass3_Sub4_6 = null;
			return null;
		} else {
			this.aClass3_Sub4_6 = local12.aClass3_Sub4_66;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)Lclient!wfa;")
	public Class3_Sub4 method898() {
		@Pc(6) Class3_Sub4 local6 = this.aClass3_Sub4_6;
		if (this.aClass3_Sub4_5 == local6) {
			this.aClass3_Sub4_6 = null;
			return null;
		} else {
			this.aClass3_Sub4_6 = local6.aClass3_Sub4_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!wfa;)V")
	public void method901(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub4_67 != null) {
			arg0.method8732();
		}
		arg0.aClass3_Sub4_66 = this.aClass3_Sub4_5;
		arg0.aClass3_Sub4_67 = this.aClass3_Sub4_5.aClass3_Sub4_67;
		arg0.aClass3_Sub4_67.aClass3_Sub4_66 = arg0;
		arg0.aClass3_Sub4_66.aClass3_Sub4_67 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)Lclient!wfa;")
	public Class3_Sub4 method902() {
		@Pc(7) Class3_Sub4 local7 = this.aClass3_Sub4_5.aClass3_Sub4_66;
		if (local7 == this.aClass3_Sub4_5) {
			return null;
		} else {
			local7.method8732();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	public void method903() {
		while (true) {
			@Pc(9) Class3_Sub4 local9 = this.aClass3_Sub4_5.aClass3_Sub4_66;
			if (local9 == this.aClass3_Sub4_5) {
				this.aClass3_Sub4_6 = null;
				return;
			}
			local9.method8732();
		}
	}
}
