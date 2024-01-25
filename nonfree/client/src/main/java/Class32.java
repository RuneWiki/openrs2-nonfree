import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class32 {

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "Lclient!am;")
	private Class12_Sub1 aClass12_Sub1_4;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!am;")
	public final Class12_Sub1 aClass12_Sub1_3 = new Class12_Sub1();

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class32() {
		this.aClass12_Sub1_3.aClass12_Sub1_8 = this.aClass12_Sub1_3;
		this.aClass12_Sub1_3.aClass12_Sub1_7 = this.aClass12_Sub1_3;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Lclient!am;")
	public Class12_Sub1 method525() {
		@Pc(6) Class12_Sub1 local6 = this.aClass12_Sub1_4;
		if (local6 == this.aClass12_Sub1_3) {
			this.aClass12_Sub1_4 = null;
			return null;
		} else {
			this.aClass12_Sub1_4 = local6.aClass12_Sub1_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)Lclient!am;")
	public Class12_Sub1 method526() {
		@Pc(14) Class12_Sub1 local14 = this.aClass12_Sub1_3.aClass12_Sub1_7;
		if (this.aClass12_Sub1_3 == local14) {
			this.aClass12_Sub1_4 = null;
			return null;
		} else {
			this.aClass12_Sub1_4 = local14.aClass12_Sub1_7;
			return local14;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
	public void method527() {
		while (true) {
			@Pc(5) Class12_Sub1 local5 = this.aClass12_Sub1_3.aClass12_Sub1_7;
			if (local5 == this.aClass12_Sub1_3) {
				this.aClass12_Sub1_4 = null;
				return;
			}
			local5.method4661();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!am;I)V")
	public void method528(@OriginalArg(0) Class12_Sub1 arg0) {
		if (arg0.aClass12_Sub1_8 != null) {
			arg0.method4661();
		}
		arg0.aClass12_Sub1_7 = this.aClass12_Sub1_3;
		arg0.aClass12_Sub1_8 = this.aClass12_Sub1_3.aClass12_Sub1_8;
		arg0.aClass12_Sub1_8.aClass12_Sub1_7 = arg0;
		arg0.aClass12_Sub1_7.aClass12_Sub1_8 = arg0;
	}
}
