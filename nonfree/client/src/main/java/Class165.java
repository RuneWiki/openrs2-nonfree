import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class165 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!lh;")
	private Class5_Sub5 aClass5_Sub5_31;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "Lclient!vu;")
	private Class368 aClass368_4;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	private Class165() {
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!vu;)V")
	public Class165(@OriginalArg(0) Class368 arg0) {
		this.aClass368_4 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lclient!lh;")
	public Class5_Sub5 method3911() {
		@Pc(8) Class5_Sub5 local8 = this.aClass368_4.aClass5_Sub5_64.aClass5_Sub5_66;
		if (local8 == this.aClass368_4.aClass5_Sub5_64) {
			this.aClass5_Sub5_31 = null;
			return null;
		} else {
			this.aClass5_Sub5_31 = local8.aClass5_Sub5_66;
			return local8;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)Lclient!lh;")
	public Class5_Sub5 method3912() {
		@Pc(11) Class5_Sub5 local11 = this.aClass5_Sub5_31;
		if (this.aClass368_4.aClass5_Sub5_64 == local11) {
			this.aClass5_Sub5_31 = null;
			return null;
		} else {
			this.aClass5_Sub5_31 = local11.aClass5_Sub5_66;
			return local11;
		}
	}
}
