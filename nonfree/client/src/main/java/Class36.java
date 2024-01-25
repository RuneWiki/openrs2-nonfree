import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class36 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "Lclient!ws;")
	private Class361 aClass361_7;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Lclient!kd;")
	private Class6 aClass6_39;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class36() {
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!ws;)V")
	public Class36(@OriginalArg(0) Class361 arg0) {
		this.aClass361_7 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Lclient!kd;")
	public Class6 method1052() {
		@Pc(11) Class6 local11 = this.aClass6_39;
		if (local11 == this.aClass361_7.aClass6_287) {
			this.aClass6_39 = null;
			return null;
		} else {
			this.aClass6_39 = local11.aClass6_286;
			return local11;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ws;B)V")
	public void method1055(@OriginalArg(0) Class361 arg0) {
		this.aClass361_7 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Lclient!kd;")
	public Class6 method1056() {
		@Pc(8) Class6 local8 = this.aClass361_7.aClass6_287.aClass6_286;
		if (this.aClass361_7.aClass6_287 == local8) {
			this.aClass6_39 = null;
			return null;
		} else {
			this.aClass6_39 = local8.aClass6_286;
			return local8;
		}
	}
}
