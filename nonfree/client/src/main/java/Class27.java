import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class27 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!rh;")
	private Class275 aClass275_14;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!sf;")
	private Class6 aClass6_27;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class27() {
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!rh;)V")
	public Class27(@OriginalArg(0) Class275 arg0) {
		this.aClass275_14 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lclient!sf;")
	public Class6 method455() {
		@Pc(6) Class6 local6 = this.aClass6_27;
		if (this.aClass275_14.aClass6_229 == local6) {
			this.aClass6_27 = null;
			return null;
		} else {
			this.aClass6_27 = local6.aClass6_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)Lclient!sf;")
	public Class6 method458() {
		@Pc(13) Class6 local13 = this.aClass275_14.aClass6_229.aClass6_284;
		if (this.aClass275_14.aClass6_229 == local13) {
			this.aClass6_27 = null;
			return null;
		} else {
			this.aClass6_27 = local13.aClass6_284;
			return local13;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rh;Z)V")
	public void method463(@OriginalArg(0) Class275 arg0) {
		this.aClass275_14 = arg0;
	}
}
