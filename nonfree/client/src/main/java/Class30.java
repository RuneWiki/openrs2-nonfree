import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class30 {

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "Lclient!ab;")
	private Class3_Sub1 aClass3_Sub1_8;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Lclient!ab;")
	public final Class3_Sub1 aClass3_Sub1_7 = new Class3_Sub1();

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class30() {
		this.aClass3_Sub1_7.aClass3_Sub1_67 = this.aClass3_Sub1_7;
		this.aClass3_Sub1_7.aClass3_Sub1_66 = this.aClass3_Sub1_7;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	public void method778() {
		while (true) {
			@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_7.aClass3_Sub1_66;
			if (this.aClass3_Sub1_7 == local5) {
				this.aClass3_Sub1_8 = null;
				return;
			}
			local5.method8621();
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ab;B)V")
	public void method779(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method8621();
		}
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_7;
		arg0.aClass3_Sub1_67 = this.aClass3_Sub1_7.aClass3_Sub1_67;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lclient!ab;")
	public Class3_Sub1 method780() {
		@Pc(7) Class3_Sub1 local7 = this.aClass3_Sub1_7.aClass3_Sub1_66;
		if (this.aClass3_Sub1_7 == local7) {
			this.aClass3_Sub1_8 = null;
			return null;
		} else {
			this.aClass3_Sub1_8 = local7.aClass3_Sub1_66;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Lclient!ab;")
	public Class3_Sub1 method781() {
		@Pc(11) Class3_Sub1 local11 = this.aClass3_Sub1_7.aClass3_Sub1_66;
		if (this.aClass3_Sub1_7 == local11) {
			return null;
		} else {
			local11.method8621();
			return local11;
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lclient!ab;")
	public Class3_Sub1 method783() {
		@Pc(6) Class3_Sub1 local6 = this.aClass3_Sub1_8;
		if (this.aClass3_Sub1_7 == local6) {
			this.aClass3_Sub1_8 = null;
			return null;
		} else {
			this.aClass3_Sub1_8 = local6.aClass3_Sub1_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I")
	public int method784() {
		@Pc(14) int local14 = 0;
		@Pc(18) Class3_Sub1 local18 = this.aClass3_Sub1_7.aClass3_Sub1_66;
		while (this.aClass3_Sub1_7 != local18) {
			local18 = local18.aClass3_Sub1_66;
			local14++;
		}
		return local14;
	}
}
