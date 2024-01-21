import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class11 {

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!ad;")
	private final Class3_Sub3 aClass3_Sub3_3 = new Class3_Sub3();

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class11() {
		this.aClass3_Sub3_3.aClass3_Sub3_60 = this.aClass3_Sub3_3;
		this.aClass3_Sub3_3.aClass3_Sub3_59 = this.aClass3_Sub3_3;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!ad;)V")
	public void method253(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_60 != null) {
			arg0.method1892();
		}
		arg0.aClass3_Sub3_59 = this.aClass3_Sub3_3;
		arg0.aClass3_Sub3_60 = this.aClass3_Sub3_3.aClass3_Sub3_60;
		arg0.aClass3_Sub3_60.aClass3_Sub3_59 = arg0;
		arg0.aClass3_Sub3_59.aClass3_Sub3_60 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lclient!ad;")
	public Class3_Sub3 method254() {
		@Pc(12) Class3_Sub3 local12 = this.aClass3_Sub3_3.aClass3_Sub3_59;
		if (local12 == this.aClass3_Sub3_3) {
			return null;
		} else {
			local12.method1892();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ad;B)V")
	public void method255(@OriginalArg(0) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_60 != null) {
			arg0.method1892();
		}
		arg0.aClass3_Sub3_59 = this.aClass3_Sub3_3.aClass3_Sub3_59;
		arg0.aClass3_Sub3_60 = this.aClass3_Sub3_3;
		arg0.aClass3_Sub3_60.aClass3_Sub3_59 = arg0;
		arg0.aClass3_Sub3_59.aClass3_Sub3_60 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lclient!ad;")
	public Class3_Sub3 method257() {
		@Pc(12) Class3_Sub3 local12 = this.aClass3_Sub3_3.aClass3_Sub3_59;
		return local12 == this.aClass3_Sub3_3 ? null : local12;
	}
}
