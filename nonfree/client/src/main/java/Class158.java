import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class158 {

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Lclient!o;")
	private Class21_Sub2 aClass21_Sub2_4;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Lclient!o;")
	public Class21_Sub2 aClass21_Sub2_3 = new Class21_Sub2();

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class158() {
		this.aClass21_Sub2_3.aClass21_Sub2_5 = this.aClass21_Sub2_3;
		this.aClass21_Sub2_3.aClass21_Sub2_6 = this.aClass21_Sub2_3;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!o;)V")
	public void method3900(@OriginalArg(1) Class21_Sub2 arg0) {
		if (arg0.aClass21_Sub2_6 != null) {
			arg0.method4642();
		}
		arg0.aClass21_Sub2_6 = this.aClass21_Sub2_3.aClass21_Sub2_6;
		arg0.aClass21_Sub2_5 = this.aClass21_Sub2_3;
		arg0.aClass21_Sub2_6.aClass21_Sub2_5 = arg0;
		arg0.aClass21_Sub2_5.aClass21_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Lclient!o;")
	public Class21_Sub2 method3901() {
		@Pc(7) Class21_Sub2 local7 = this.aClass21_Sub2_3.aClass21_Sub2_5;
		if (local7 == this.aClass21_Sub2_3) {
			this.aClass21_Sub2_4 = null;
			return null;
		} else {
			this.aClass21_Sub2_4 = local7.aClass21_Sub2_5;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Lclient!o;")
	public Class21_Sub2 method3903() {
		@Pc(2) Class21_Sub2 local2 = this.aClass21_Sub2_4;
		if (local2 == this.aClass21_Sub2_3) {
			this.aClass21_Sub2_4 = null;
			return null;
		} else {
			this.aClass21_Sub2_4 = local2.aClass21_Sub2_5;
			return local2;
		}
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
	public void method3906() {
		while (true) {
			@Pc(5) Class21_Sub2 local5 = this.aClass21_Sub2_3.aClass21_Sub2_5;
			if (local5 == this.aClass21_Sub2_3) {
				this.aClass21_Sub2_4 = null;
				return;
			}
			local5.method4642();
		}
	}
}
