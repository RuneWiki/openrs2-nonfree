import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class266 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Lclient!ns;")
	private Class231 aClass231_10;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "Lclient!tm;")
	private Class6_Sub5 aClass6_Sub5_62;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	private Class266() {
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!ns;)V")
	public Class266(@OriginalArg(0) Class231 arg0) {
		this.aClass231_10 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)Lclient!tm;")
	public Class6_Sub5 method6762() {
		@Pc(13) Class6_Sub5 local13 = this.aClass231_10.aClass6_Sub5_60.aClass6_Sub5_66;
		if (local13 == this.aClass231_10.aClass6_Sub5_60) {
			this.aClass6_Sub5_62 = null;
			return null;
		} else {
			this.aClass6_Sub5_62 = local13.aClass6_Sub5_66;
			return local13;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lclient!tm;")
	public Class6_Sub5 method6763() {
		@Pc(10) Class6_Sub5 local10 = this.aClass6_Sub5_62;
		if (this.aClass231_10.aClass6_Sub5_60 == local10) {
			this.aClass6_Sub5_62 = null;
			return null;
		} else {
			this.aClass6_Sub5_62 = local10.aClass6_Sub5_66;
			return local10;
		}
	}
}
