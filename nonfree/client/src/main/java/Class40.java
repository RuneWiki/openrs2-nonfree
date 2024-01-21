import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class40 {

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!wb;")
	private final Class3_Sub1 aClass3_Sub1_32 = new Class3_Sub1();

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class40() {
		this.aClass3_Sub1_32.aClass3_Sub1_59 = this.aClass3_Sub1_32;
		this.aClass3_Sub1_32.aClass3_Sub1_60 = this.aClass3_Sub1_32;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Lclient!wb;")
	public Class3_Sub1 method978() {
		@Pc(10) Class3_Sub1 local10 = this.aClass3_Sub1_32.aClass3_Sub1_59;
		if (local10 == this.aClass3_Sub1_32) {
			return null;
		} else {
			local10.method1839();
			return local10;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!wb;Z)V")
	public void method981(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_60 != null) {
			arg0.method1839();
		}
		arg0.aClass3_Sub1_60 = this.aClass3_Sub1_32;
		arg0.aClass3_Sub1_59 = this.aClass3_Sub1_32.aClass3_Sub1_59;
		arg0.aClass3_Sub1_60.aClass3_Sub1_59 = arg0;
		arg0.aClass3_Sub1_59.aClass3_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lclient!wb;Z)V")
	public void method982(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_60 != null) {
			arg0.method1839();
		}
		arg0.aClass3_Sub1_59 = this.aClass3_Sub1_32;
		arg0.aClass3_Sub1_60 = this.aClass3_Sub1_32.aClass3_Sub1_60;
		arg0.aClass3_Sub1_60.aClass3_Sub1_59 = arg0;
		arg0.aClass3_Sub1_59.aClass3_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Lclient!wb;")
	public Class3_Sub1 method983() {
		@Pc(7) Class3_Sub1 local7 = this.aClass3_Sub1_32.aClass3_Sub1_59;
		return this.aClass3_Sub1_32 == local7 ? null : local7;
	}
}
