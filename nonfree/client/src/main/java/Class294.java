import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class294 {

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "Lclient!qm;")
	private Class3 aClass3_244;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "Lclient!mr;")
	private Class223 aClass223_52;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "()V")
	public Class294() {
	}

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lclient!mr;)V")
	public Class294(@OriginalArg(0) Class223 arg0) {
		this.aClass223_52 = arg0;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)Lclient!qm;")
	public Class3 method7319() {
		@Pc(11) Class3 local11 = this.aClass3_244;
		if (this.aClass223_52.aClass3_188 == local11) {
			this.aClass3_244 = null;
			return null;
		} else {
			this.aClass3_244 = local11.aClass3_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)Lclient!qm;")
	public Class3 method7321() {
		@Pc(16) Class3 local16 = this.aClass223_52.aClass3_188.aClass3_300;
		if (this.aClass223_52.aClass3_188 == local16) {
			this.aClass3_244 = null;
			return null;
		} else {
			this.aClass3_244 = local16.aClass3_300;
			return local16;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILclient!mr;)V")
	public void method7324(@OriginalArg(1) Class223 arg0) {
		this.aClass223_52 = arg0;
	}
}
