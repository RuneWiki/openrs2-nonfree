import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!vq;")
	private Class211 aClass211_2;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!on;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class4() {
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!vq;)V")
	public Class4(@OriginalArg(0) Class211 arg0) {
		this.aClass211_2 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!vq;)V")
	public void method46(@OriginalArg(1) Class211 arg0) {
		this.aClass211_2 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Lclient!on;")
	public Class6 method49() {
		@Pc(11) Class6 local11 = this.aClass6_1;
		if (this.aClass211_2.aClass6_237 == local11) {
			this.aClass6_1 = null;
			return null;
		} else {
			this.aClass6_1 = local11.aClass6_248;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lclient!on;")
	public Class6 method51() {
		@Pc(8) Class6 local8 = this.aClass211_2.aClass6_237.aClass6_248;
		if (this.aClass211_2.aClass6_237 == local8) {
			this.aClass6_1 = null;
			return null;
		} else {
			this.aClass6_1 = local8.aClass6_248;
			return local8;
		}
	}
}
