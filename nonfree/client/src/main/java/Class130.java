import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class130 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!ah;")
	private Class3 aClass3_130;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!kr;")
	private Class138 aClass138_21;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class130() {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!kr;)V")
	public Class130(@OriginalArg(0) Class138 arg0) {
		this.aClass138_21 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Lclient!ah;")
	public Class3 method2817() {
		@Pc(12) Class3 local12 = this.aClass3_130;
		if (local12 == this.aClass138_21.aClass3_137) {
			this.aClass3_130 = null;
			return null;
		} else {
			this.aClass3_130 = local12.aClass3_243;
			return local12;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!kr;)V")
	public void method2818(@OriginalArg(1) Class138 arg0) {
		this.aClass138_21 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Lclient!ah;")
	public Class3 method2819() {
		@Pc(13) Class3 local13 = this.aClass138_21.aClass3_137.aClass3_243;
		if (local13 == this.aClass138_21.aClass3_137) {
			this.aClass3_130 = null;
			return null;
		} else {
			this.aClass3_130 = local13.aClass3_243;
			return local13;
		}
	}
}
