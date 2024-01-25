import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class91 {

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "Lclient!ada;")
	private Class8 aClass8_15;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "Lclient!efa;")
	private Class6 aClass6_85;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class91() {
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!ada;)V")
	public Class91(@OriginalArg(0) Class8 arg0) {
		this.aClass8_15 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Lclient!efa;")
	public Class6 method2335() {
		@Pc(13) Class6 local13 = this.aClass6_85;
		if (this.aClass8_15.aClass6_7 == local13) {
			this.aClass6_85 = null;
			return null;
		} else {
			this.aClass6_85 = local13.aClass6_299;
			return local13;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!ada;)V")
	public void method2336(@OriginalArg(1) Class8 arg0) {
		this.aClass8_15 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Lclient!efa;")
	public Class6 method2338() {
		@Pc(13) Class6 local13 = this.aClass8_15.aClass6_7.aClass6_299;
		if (this.aClass8_15.aClass6_7 == local13) {
			this.aClass6_85 = null;
			return null;
		} else {
			this.aClass6_85 = local13.aClass6_299;
			return local13;
		}
	}
}
