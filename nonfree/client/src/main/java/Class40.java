import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class40 {

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!v;")
	private final Class10_Sub1 aClass10_Sub1_36 = new Class10_Sub1();

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class40() {
		this.aClass10_Sub1_36.aClass10_Sub1_60 = this.aClass10_Sub1_36;
		this.aClass10_Sub1_36.aClass10_Sub1_59 = this.aClass10_Sub1_36;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!v;I)V")
	public void method895(@OriginalArg(0) Class10_Sub1 arg0) {
		if (arg0.aClass10_Sub1_60 != null) {
			arg0.method1655();
		}
		arg0.aClass10_Sub1_59 = this.aClass10_Sub1_36.aClass10_Sub1_59;
		arg0.aClass10_Sub1_60 = this.aClass10_Sub1_36;
		arg0.aClass10_Sub1_60.aClass10_Sub1_59 = arg0;
		arg0.aClass10_Sub1_59.aClass10_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lclient!v;")
	public Class10_Sub1 method896() {
		@Pc(11) Class10_Sub1 local11 = this.aClass10_Sub1_36.aClass10_Sub1_59;
		return this.aClass10_Sub1_36 == local11 ? null : local11;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!v;)V")
	public void method900(@OriginalArg(1) Class10_Sub1 arg0) {
		if (arg0.aClass10_Sub1_60 != null) {
			arg0.method1655();
		}
		arg0.aClass10_Sub1_60 = this.aClass10_Sub1_36.aClass10_Sub1_60;
		arg0.aClass10_Sub1_59 = this.aClass10_Sub1_36;
		arg0.aClass10_Sub1_60.aClass10_Sub1_59 = arg0;
		arg0.aClass10_Sub1_59.aClass10_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lclient!v;")
	public Class10_Sub1 method901() {
		@Pc(14) Class10_Sub1 local14 = this.aClass10_Sub1_36.aClass10_Sub1_59;
		if (this.aClass10_Sub1_36 == local14) {
			return null;
		} else {
			local14.method1655();
			return local14;
		}
	}
}
