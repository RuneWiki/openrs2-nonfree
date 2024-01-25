import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class147 {

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "Lclient!rv;")
	private Class3_Sub7 aClass3_Sub7_29;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!rv;")
	public final Class3_Sub7 aClass3_Sub7_28 = new Class3_Sub7();

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V")
	public Class147() {
		this.aClass3_Sub7_28.aClass3_Sub7_66 = this.aClass3_Sub7_28;
		this.aClass3_Sub7_28.aClass3_Sub7_67 = this.aClass3_Sub7_28;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)I")
	public int method3330() {
		@Pc(7) int local7 = 0;
		@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7_28.aClass3_Sub7_67;
		while (this.aClass3_Sub7_28 != local20) {
			local20 = local20.aClass3_Sub7_67;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(I)V")
	public void method3331() {
		while (true) {
			@Pc(9) Class3_Sub7 local9 = this.aClass3_Sub7_28.aClass3_Sub7_67;
			if (this.aClass3_Sub7_28 == local9) {
				this.aClass3_Sub7_29 = null;
				return;
			}
			local9.method9251();
		}
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)Lclient!rv;")
	public Class3_Sub7 method3332() {
		@Pc(14) Class3_Sub7 local14 = this.aClass3_Sub7_29;
		if (this.aClass3_Sub7_28 == local14) {
			this.aClass3_Sub7_29 = null;
			return null;
		} else {
			this.aClass3_Sub7_29 = local14.aClass3_Sub7_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)Lclient!rv;")
	public Class3_Sub7 method3333() {
		@Pc(7) Class3_Sub7 local7 = this.aClass3_Sub7_28.aClass3_Sub7_67;
		if (this.aClass3_Sub7_28 == local7) {
			return null;
		} else {
			local7.method9251();
			return local7;
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)Lclient!rv;")
	public Class3_Sub7 method3334() {
		@Pc(13) Class3_Sub7 local13 = this.aClass3_Sub7_28.aClass3_Sub7_67;
		if (local13 == this.aClass3_Sub7_28) {
			this.aClass3_Sub7_29 = null;
			return null;
		} else {
			this.aClass3_Sub7_29 = local13.aClass3_Sub7_67;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method3335(@OriginalArg(0) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_66 != null) {
			arg0.method9251();
		}
		arg0.aClass3_Sub7_66 = this.aClass3_Sub7_28.aClass3_Sub7_66;
		arg0.aClass3_Sub7_67 = this.aClass3_Sub7_28;
		arg0.aClass3_Sub7_66.aClass3_Sub7_67 = arg0;
		arg0.aClass3_Sub7_67.aClass3_Sub7_66 = arg0;
	}
}
